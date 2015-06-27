package com.song.FOR;

import gnu.trove.TIntArrayList;
import gnu.trove.TIntFunction;
import gnu.trove.TIntProcedure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import me.lemire.compression.BitPacking;
import me.lemire.compression.Delta;
import me.lemire.compression.FastPFOR;
import me.lemire.compression.IntWrapper;
import me.lemire.compression.IntegerCODEC;
import me.lemire.compression.IntegratedBinaryPacking;
import me.lemire.compression.IntegratedComposition;
import me.lemire.compression.IntegratedVariableByte;
import me.lemire.compression.S16;
import me.lemire.compression.Util;

import com.song.vse.BitsReader;
import com.song.vse.BitsWriter;

public class CAFOR implements IntegerCODEC
{

	double	              eps1;
	double	              eps2;
	IntegratedComposition	ic;

	// 由于输入序列已经delta处理，所以minPosting和maxPosting暂时无用
	class CostWindow
	{
		int[]	in;
		int		startIndex;
		int		endIndex;
		// int minPosting;
		// int maxPosting;
		long	costUpperBound;

		public CostWindow(int[] _in, long _costUpperBound)
		{
			in = _in;
			startIndex = 0;
			endIndex = 0;
			// minPosting = in[0];
			// maxPosting = 0;
			costUpperBound = _costUpperBound;
		}

		// public int universe()
		// {
		// return maxPosting - minPosting + 1;
		// }

		public int size()
		{
			// XXX 注意endIndex实际上是当前指向元素的下一个位置
			return endIndex - startIndex;
		}

		public void advanceStart()
		{
			// minPosting = in[startIndex + 1];
			startIndex++;
		}

		public void advanceEnd()
		{
			// maxPosting = in[endIndex];
			endIndex++;
		}

		public void advanceEndTo(int index)
		{
			// XXX 不考虑inpos，直接指向index位置
			index = index == in.length ? in.length - 1 : index;
			// maxPosting = in[index];
			endIndex = index + 1;
		}

		public int maxB()
		{
			return Util.maxbits(in, startIndex, this.size());
		}

		public long calculateCost()
		{
			return Util.maxbits(in, startIndex, this.size()) * this.size();
		}
	}

	public CAFOR()
	{
		// TODO Auto-generated constructor stub
		eps1 = 0.03;
		eps2 = 0.3;
		ic = new IntegratedComposition(new IntegratedBinaryPacking(),
		        new IntegratedVariableByte());
	}

	/**
	 * 
	 * @param in
	 *            integer arrays to be partitioned
	 * @param maxBit
	 *            msb of the integers in the whole list
	 * @param parition
	 *            TIntArrayList stores beginnings of each partition, the first
	 *            element '0' isn't included.
	 * @param widthParition
	 *            TIntArrayList stores the bitwidth adopted by each partition
	 * @return array of 32-length stores the number of integers using the
	 *         bitwidth of index
	 */
	int[] getOptimalPartition(int[] in, int maxBit, TIntArrayList parition,
	        TIntArrayList widthParition)
	{
		// XXX 不同于EF，universe和size可以通过in直接获取，eps1和eps2作为类属性直接获取
		// first pass, count up different lengths of integers from the input
		// array
		/*
		 * int[] bitWidth = new int[33];
		 * 
		 * for (int i = 0; i < in.length; i++) { bitWidth[Util.bits(in[i])]++; }
		 * int maxBit = 32;
		 * 
		 * // 获取当前序列中不为0的最高位 while (bitWidth[maxBit] == 0) { maxBit--; }
		 */

		long costSingleBlock = in.length * maxBit;

		long[] minCost = new long[in.length + 1];
		Arrays.fill(minCost, 1, minCost.length, costSingleBlock);

		ArrayList<CostWindow> windows = new ArrayList<CAFOR.CostWindow>();

		// 设定最小下限，即selector头部大小
		long costLowerBound = 32 + 32 + 5;
		long costBound = costLowerBound;

		while (eps1 == 0 || costBound < costLowerBound / eps1)
		{
			windows.add(new CostWindow(in, costBound));
			if (costBound > costSingleBlock)
				break;
			costBound = (long) (costBound * (1 + eps2));
		}

		// ArrayList<Integer> path = new ArrayList<Integer>(in.length + 1);
		int[] path = new int[in.length + 1];
		int[] maxb = new int[in.length + 1];

		for (int i = 0; i < in.length - 1; i++)
		{
			int lastEnd = i + 1;
			for (CostWindow window : windows)
			{
				if (window.startIndex != i)
					System.err.println("startIndex: " + window.startIndex
					        + "at i=" + i);
				// 直接替换
				/*
				 * while(window.endIndex<lastEnd) window.advanceEnd();
				 */
				if (window.endIndex < lastEnd)
					window.advanceEndTo(lastEnd);

				long windowCost;
				while (true)
				{
					int tmpMaxB = window.maxB();
					windowCost = tmpMaxB * window.size();
					if (minCost[i] + windowCost < minCost[window.endIndex])
					{
						minCost[window.endIndex] = minCost[i] + windowCost;
						path[window.endIndex] = i;
						maxb[window.endIndex] = tmpMaxB;
					}
					lastEnd = window.endIndex;
					if (window.endIndex == in.length
					        || windowCost > window.costUpperBound)
						break;
					window.advanceEnd();
				}
				window.advanceStart();
			}
		}

		int currPos = in.length;
		int[] hist = new int[33];
		while (currPos != 0)
		{
			parition.add(currPos);
			widthParition.add(maxb[currPos]);
			hist[maxb[currPos]] += currPos - path[currPos];
			currPos = path[currPos];
		}
		widthParition.reverse();
		parition.reverse();

		int tmp = 32;
		while (hist[tmp] == 0)
			tmp--;
		hist[0] = tmp;
		int[] newhist = Arrays.copyOfRange(hist, 0, hist[0] + 1);

		return newhist;
	}

	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		int outOffset = outpos.get();
		// out[outpos.get()] = in.length;
		outpos.increment();

		// 获取整个块的存储大小，复杂度O(n)
		int maxBit = Util.maxbits(in, 0, in.length);

		TIntArrayList widthParition = new TIntArrayList();
		TIntArrayList partition = new TIntArrayList();

		int[] hist = getOptimalPartition(in, maxBit, partition, widthParition);

		/*
		 * TIntArrayList partitionDelta = (TIntArrayList) partition.clone(); for
		 * (int i = 1; i < partitionDelta.size(); i++) {
		 * partitionDelta.setQuick(i, partitionDelta.getQuick(i) -
		 * partitionDelta.getQuick(i - 1)); }
		 */
		// 决定使用IntegratedBinaryPacking和VB压缩

		IntWrapper tmpwrapper = new IntWrapper(0);
		ic.compress(partition.toNativeArray(), tmpwrapper, partition.size(),
		        out, outpos);
		out[outOffset] = outpos.get() - 1;

		outOffset = outpos.get();

		tmpwrapper.set(0);
		int[] widthPart = widthParition.toNativeArray();

		int bsLength = (widthParition.size() * 5 + 31) / 32;
		int sizeOf32 = widthParition.size() / 32;

		int leftin = widthParition.size() - sizeOf32 * 32;
		int leftout = bsLength - sizeOf32 * 5;

		for (int i = 0; i < sizeOf32; i++)
		{
			BitPacking.fastpackwithoutmask(widthPart, tmpwrapper.get(), out,
			        outpos.get(), 5);
			tmpwrapper.add(32);
			outpos.add(5);
		}
		int tmpOutOffset = outpos.get();
		int tmpinoffset = tmpwrapper.get();
		switch (leftout)
		{
			case 1:
				for (int i = 0; i < leftin; i++)
				{
					out[outpos.get()] |= widthPart[tmpinoffset++] << (i * 5);
				}
				break;
			case 2:
				out[tmpOutOffset++] = widthPart[0 + tmpinoffset]
				        | ((widthPart[1 + tmpinoffset]) << 5)
				        | ((widthPart[2 + tmpinoffset]) << 10)
				        | ((widthPart[3 + tmpinoffset]) << 15)
				        | ((widthPart[4 + tmpinoffset]) << 20)
				        | ((widthPart[5 + tmpinoffset]) << 25)
				        | ((widthPart[6 + tmpinoffset]) << 30);
				out[tmpOutOffset] = ((widthPart[6 + tmpinoffset]) >>> (5 - 3));
				for (int i = 7; i < leftin; i++)
				{
					out[tmpOutOffset] |= widthPart[i + tmpinoffset] << ((i - 7) * 5 + 3);
				}
				break;
			case 3:
				out[tmpOutOffset++] = widthPart[0 + tmpinoffset]
				        | ((widthPart[1 + tmpinoffset]) << 5)
				        | ((widthPart[2 + tmpinoffset]) << 10)
				        | ((widthPart[3 + tmpinoffset]) << 15)
				        | ((widthPart[4 + tmpinoffset]) << 20)
				        | ((widthPart[5 + tmpinoffset]) << 25)
				        | ((widthPart[6 + tmpinoffset]) << 30);
				out[tmpOutOffset++] = ((widthPart[6 + tmpinoffset]) >>> (5 - 3))
				        | ((widthPart[7 + tmpinoffset]) << 3)
				        | ((widthPart[8 + tmpinoffset]) << 8)
				        | ((widthPart[9 + tmpinoffset]) << 13)
				        | ((widthPart[10 + tmpinoffset]) << 18)
				        | ((widthPart[11 + tmpinoffset]) << 23)
				        | ((widthPart[12 + tmpinoffset]) << 28);
				out[tmpOutOffset] = ((widthPart[12 + tmpinoffset]) >>> (5 - 1));
				for (int i = 13; i < leftin; i++)
				{
					out[tmpOutOffset] |= (widthPart[i + tmpinoffset] << ((i - 13) * 5 + 1));
				}
				break;
			case 4:
				out[tmpOutOffset++] = widthPart[0 + tmpinoffset]
				        | ((widthPart[1 + tmpinoffset]) << 5)
				        | ((widthPart[2 + tmpinoffset]) << 10)
				        | ((widthPart[3 + tmpinoffset]) << 15)
				        | ((widthPart[4 + tmpinoffset]) << 20)
				        | ((widthPart[5 + tmpinoffset]) << 25)
				        | ((widthPart[6 + tmpinoffset]) << 30);
				out[tmpOutOffset++] = ((widthPart[6 + tmpinoffset]) >>> (5 - 3))
				        | ((widthPart[7 + tmpinoffset]) << 3)
				        | ((widthPart[8 + tmpinoffset]) << 8)
				        | ((widthPart[9 + tmpinoffset]) << 13)
				        | ((widthPart[10 + tmpinoffset]) << 18)
				        | ((widthPart[11 + tmpinoffset]) << 23)
				        | ((widthPart[12 + tmpinoffset]) << 28);
				out[tmpOutOffset++] = ((widthPart[12 + tmpinoffset]) >>> (5 - 1))
				        | ((widthPart[13 + tmpinoffset]) << 1)
				        | ((widthPart[14 + tmpinoffset]) << 6)
				        | ((widthPart[15 + tmpinoffset]) << 11)
				        | ((widthPart[16 + tmpinoffset]) << 16)
				        | ((widthPart[17 + tmpinoffset]) << 21)
				        | ((widthPart[18 + tmpinoffset]) << 26)
				        | ((widthPart[19 + tmpinoffset]) << 31);
				out[tmpOutOffset] = ((widthPart[19 + tmpinoffset]) >>> (5 - 4));
				for (int i = 20; i < leftin; i++)
				{
					out[tmpOutOffset] |= (widthPart[i + tmpinoffset] << ((i - 20) * 5 + 4));
				}

				break;
			case 5:
				out[tmpOutOffset++] = widthPart[0 + tmpinoffset]
				        | ((widthPart[1 + tmpinoffset]) << 5)
				        | ((widthPart[2 + tmpinoffset]) << 10)
				        | ((widthPart[3 + tmpinoffset]) << 15)
				        | ((widthPart[4 + tmpinoffset]) << 20)
				        | ((widthPart[5 + tmpinoffset]) << 25)
				        | ((widthPart[6 + tmpinoffset]) << 30);
				out[tmpOutOffset++] = ((widthPart[6 + tmpinoffset]) >>> (5 - 3))
				        | ((widthPart[7 + tmpinoffset]) << 3)
				        | ((widthPart[8 + tmpinoffset]) << 8)
				        | ((widthPart[9 + tmpinoffset]) << 13)
				        | ((widthPart[10 + tmpinoffset]) << 18)
				        | ((widthPart[11 + tmpinoffset]) << 23)
				        | ((widthPart[12 + tmpinoffset]) << 28);
				out[tmpOutOffset++] = ((widthPart[12 + tmpinoffset]) >>> (5 - 1))
				        | ((widthPart[13 + tmpinoffset]) << 1)
				        | ((widthPart[14 + tmpinoffset]) << 6)
				        | ((widthPart[15 + tmpinoffset]) << 11)
				        | ((widthPart[16 + tmpinoffset]) << 16)
				        | ((widthPart[17 + tmpinoffset]) << 21)
				        | ((widthPart[18 + tmpinoffset]) << 26)
				        | ((widthPart[19 + tmpinoffset]) << 31);
				out[tmpOutOffset++] = ((widthPart[19 + tmpinoffset]) >>> (5 - 4))
				        | ((widthPart[20 + tmpinoffset]) << 4)
				        | ((widthPart[21 + tmpinoffset]) << 9)
				        | ((widthPart[22 + tmpinoffset]) << 14)
				        | ((widthPart[23 + tmpinoffset]) << 19)
				        | ((widthPart[24 + tmpinoffset]) << 24)
				        | ((widthPart[25 + tmpinoffset]) << 29);
				out[tmpOutOffset] = ((widthPart[25 + tmpinoffset]) >>> (5 - 2));
				for (int i = 26; i < leftin; i++)
				{
					out[tmpOutOffset] |= (widthPart[i + tmpinoffset] << ((i - 26) * 5 + 2));
				}

				break;

		}
		outpos.set(outOffset + bsLength);
		outOffset = outpos.get();

		BitsWriter bw = new BitsWriter(out,
		        outOffset + 1/* 留出1个int存储此次delta编码长度 */, out.length - 1
		                - outOffset);
		bw.deltaArray(hist, 0, hist.length);

		out[outOffset] = (int) bw.size();
		outpos.add(out[outOffset] + 1);
		outOffset = outpos.get();

		BitsWriter[] widthWriters = new BitsWriter[hist[0]];
		for (int i = 1; i <= widthWriters.length; i++)
			if (hist[i] != 0)
			{
				widthWriters[i - 1] = new BitsWriter(out, outOffset, out.length
				        - outOffset);
				outOffset += ((i * hist[i] + 32 - 1) / 32);
			}

		outpos.set(outOffset);

		for (int i = 0, index = 0; i < inlength; i++)
		{
			if (i >= partition.get(index))
				index++;
			int width = widthParition.get(index);
			widthWriters[width - 1].write_bits(in[i], width);
		}
		for (int i = 0; i < widthWriters.length; i++)
		{
			if (widthWriters[i] != null)
			{
				widthWriters[i].flush_bits();
			}
		}
	}

	@Override
	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		int inEnd = inpos.get() + inlength;
		int inOffset = inpos.get();
		inpos.increment();
		int tmpinlength = in[inOffset];
		IntWrapper tmpoutpos = new IntWrapper(0);
		int[] tmpKs = new int[tmpinlength * 32];
		ic.uncompress(in, inpos, tmpinlength, tmpKs, tmpoutpos);
		int[] partition = Arrays.copyOfRange(tmpKs, 0, tmpoutpos.get());
		// Delta.fastinverseDelta(data, start, length, init)

		int bs = (partition.length * 5 + 31) / 32;
		int[] tmpwidths = new int[(partition.length / 32 + 1) * 32];

		int outoffset = 0;
		int inoffset = inpos.get();
		inpos.add(bs);
		for (int i = 0; i < bs; i += 5, outoffset += 32)
		{
			BitPacking.fastunpack(in, inoffset + i, tmpwidths, outoffset, 5);
		}
		int[] widths = Arrays.copyOfRange(tmpwidths, 0, partition.length);

		int n = in[inpos.get()];
		inpos.increment();
		BitsReader rd = new BitsReader(in, inpos.get(), n);
		int maxL = rd.read_ndelta();
		inpos.add(n);

		int[][] blk = new int[32][];

		for (int i = 1; i <= maxL; i++)
		{
			if (rd.pos() >= inEnd)
				break;
			int numb = rd.read_ndelta();

			if (numb != 0)
			{
				int temp = ((numb * i + 32 - 1) / 32);
				blk[i - 1] = new int[temp * 32];
				CAFOR_CONSTANT.CAFOR_UNPACK(i, blk[i - 1], 0, in,
				        inpos.intValue(), temp);
				inpos.add(temp);
			}
		}

		int[] pos = new int[maxL];
		for (int i = 0; i < pos.length; i++)
			pos[i] = 0;
		for (int i = 0, index = 0; i < out.length; i++)
		{
			if (i >= partition[index])
				index++;
			out[i] = blk[widths[index] - 1][pos[widths[index] - 1]++];
		}
		outpos.set(out.length);
	}

	public static void main(String[] args) throws IOException
	{
		// 读入delta序列，并生成相应的直方图
		BufferedReader arrayReader = new BufferedReader(new FileReader(
		        "./delta"));
		String[] numsStrings = arrayReader.readLine().split(",");
		arrayReader.close();

		int[] in = new int[numsStrings.length];
		int length = numsStrings.length;
		int[] bitWidth = new int[33];

		for (int i = 0; i < in.length; i++)
		{
			in[i] = Integer.valueOf(numsStrings[i]);
			bitWidth[Util.bits(in[i])]++;
		}

		FileWriter fw = new FileWriter("a.csv");
		fw.write("length,count\n");
		for (int i = 0; i < bitWidth.length; i++)
		{
			System.out.println(i + "," + bitWidth[i]);
			fw.write(i + "," + bitWidth[i] + "\n");
		}
		fw.flush();
		fw.close();

		// 测试CAFOR压缩与解压缩
		CAFOR cafor = new CAFOR();

		IntWrapper inpos = new IntWrapper(0);
		IntWrapper outpos = new IntWrapper(0);

		int[] out = new int[1000000];

		cafor.compress(in, inpos, in.length, out, outpos);

		int inlength = outpos.get();
		int[] outcome = new int[in.length];
		inpos.set(0);
		outpos.set(0);

		cafor.uncompress(out, inpos, inlength, outcome, outpos);

		for (int i = 0; i < in.length; i++)
		{
			if (outcome[i] != in[i])
			{
				System.err.println(i + ":" + outcome[i] + "," + in[i]);
			}
		}
		System.err.println("FINISH!");
	}

}
