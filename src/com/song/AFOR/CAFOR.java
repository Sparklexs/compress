package com.song.AFOR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.naming.PartialResultException;

import com.song.vse.BitsReader;
import com.song.vse.BitsWriter;
import com.song.vse.VSE_R_CONSTANT;

import me.lemire.compression.IntWrapper;
import me.lemire.compression.IntegerCODEC;
import me.lemire.compression.S16;
import me.lemire.compression.Util;

public class CAFOR implements IntegerCODEC
{

	double	eps1;
	double	eps2;

	class CostWindow
	{
		int[]	in;
		int		startIndex;
		int		endIndex;
		int		minPosting;
		int		maxPosting;
		long	costUpperBound;

		public CostWindow(int[] _in, long _costUpperBound)
		{
			in = _in;
			startIndex = 0;
			endIndex = 0;
			minPosting = in[0];
			maxPosting = 0;
			costUpperBound = _costUpperBound;
		}

		public int universe()
		{
			return maxPosting - minPosting + 1;
		}

		public int size()
		{
			// XXX 注意endIndex实际上是当前指向元素的下一个位置
			return endIndex - startIndex;
		}

		public void advanceStart()
		{
			minPosting = in[startIndex + 1];
			startIndex++;
		}

		public void advanceEnd()
		{
			maxPosting = in[endIndex];
			endIndex++;
		}

		public void advanceEndTo(int index)
		{
			// XXX 不考虑inpos，直接指向index位置
			index = index == in.length ? in.length - 1 : index;
			maxPosting = in[index];
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
	}

	int[] getOptimalPartition(int[] in, int maxBit,
	        ArrayList<Integer> parition, ArrayList<Integer> maxBParition)
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
			maxBParition.add(maxb[currPos]);
			hist[maxb[currPos]] += currPos - path[currPos];
			currPos = path[currPos];
		}
		Collections.reverse(maxBParition);
		Collections.reverse(parition);

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

		// 获取整个块的存储大小
		int maxBit = Util.maxbits(in, 0, in.length);

		ArrayList<Integer> maxBParition = new ArrayList<Integer>();
		ArrayList<Integer> parition = new ArrayList<Integer>();

		int[] hist = getOptimalPartition(in, maxBit, parition, maxBParition);
		int[] nums = new int[parition.size()];
		nums[0] = parition.get(0);
		for (int i = 1; i < nums.length; i++)
		{
			nums[i] = parition.get(i) - parition.get(i - 1);
		}
		out[outOffset] = S16.compress(nums, 0, nums.length, out, outpos.get());
		outpos.add(out[outOffset]);
		outOffset = outpos.get();

		BitsWriter bw = new BitsWriter(out, outOffset, out.length - outOffset/* S16编码长度 */);
		for (int i = 0; i < nums.length; i++)
		{
			bw.write_bits(maxBParition.get(i), 5);
		}
		bw.flush_bits();

		outpos.add((int) bw.size());
		outOffset = outpos.get();

		bw = new BitsWriter(out, outOffset + 1/* 留出1个int存储此次delta编码长度 */,
		        out.length - 1 - outOffset);
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
			if (i >= parition.get(index))
				index++;
			int width = maxBParition.get(index);
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
		int len = in[inOffset];
		int[] tmpnums = new int[len * 28];

		int total = S16.uncompress(in, inpos.get(), len, tmpnums, 0,
		        tmpnums.length);

		for (int i = total - 1; i >= 0; i--)
			if (tmpnums[i] == 0)
				total--;
			else
				break;

		// int[] nums = Arrays.copyOfRange(tmpnums, 0, total);
		int[] partition = new int[total];
		partition[0] = tmpnums[0];
		for (int i = 1; i < partition.length; i++)
		{
			partition[i] = partition[i - 1] + tmpnums[i];
		}
		inpos.add(len);

		int[] tmpwidths = new int[(total / 32 + 1) * 32];

		int bs = (total * 5 + 31) / 32;
		int outoffset = 0;
		int inoffset = inpos.get();
		inpos.add(bs);
		for (int i = 0; i < bs; i += 5, outoffset += 32)
		{
			int val = in[inoffset + i];
			tmpwidths[outoffset + 0] = ((val >>> 27));
			tmpwidths[outoffset + 1] = ((val >> 22) & 0x1f);
			tmpwidths[outoffset + 2] = ((val >> 17) & 0x1f);
			tmpwidths[outoffset + 3] = ((val >> 12) & 0x1f);
			tmpwidths[outoffset + 4] = ((val >> 7) & 0x1f);
			tmpwidths[outoffset + 5] = ((val >> 2) & 0x1f);
			tmpwidths[outoffset + 6] = (val << 3) & 0x1f;
			val = in[inoffset + i + 1];
			tmpwidths[outoffset + 6] |= ((val >>> 29));
			tmpwidths[outoffset + 7] = ((val >> 24) & 0x1f);
			tmpwidths[outoffset + 8] = ((val >> 19) & 0x1f);
			tmpwidths[outoffset + 9] = ((val >> 14) & 0x1f);
			tmpwidths[outoffset + 10] = ((val >> 9) & 0x1f);
			tmpwidths[outoffset + 11] = ((val >> 4) & 0x1f);
			tmpwidths[outoffset + 12] = (val << 1) & 0x1f;
			val = in[inoffset + i + 2];
			tmpwidths[outoffset + 12] |= ((val >>> 31));
			tmpwidths[outoffset + 13] = ((val >> 26) & 0x1f);
			tmpwidths[outoffset + 14] = ((val >> 21) & 0x1f);
			tmpwidths[outoffset + 15] = ((val >> 16) & 0x1f);
			tmpwidths[outoffset + 16] = ((val >> 11) & 0x1f);
			tmpwidths[outoffset + 17] = ((val >> 6) & 0x1f);
			tmpwidths[outoffset + 18] = ((val >> 1) & 0x1f);
			tmpwidths[outoffset + 19] = (val << 4) & 0x1f;
			val = in[inoffset + i + 3];
			tmpwidths[outoffset + 19] |= ((val >>> 28));
			tmpwidths[outoffset + 20] = ((val >> 23) & 0x1f);
			tmpwidths[outoffset + 21] = ((val >> 18) & 0x1f);
			tmpwidths[outoffset + 22] = ((val >> 13) & 0x1f);
			tmpwidths[outoffset + 23] = ((val >> 8) & 0x1f);
			tmpwidths[outoffset + 24] = ((val >> 3) & 0x1f);
			tmpwidths[outoffset + 25] = (val << 2) & 0x1f;
			val = in[inoffset + i + 4];
			tmpwidths[outoffset + 25] |= ((val >>> 30));
			tmpwidths[outoffset + 26] = ((val >> 25) & 0x1f);
			tmpwidths[outoffset + 27] = ((val >> 20) & 0x1f);
			tmpwidths[outoffset + 28] = ((val >> 15) & 0x1f);
			tmpwidths[outoffset + 29] = ((val >> 10) & 0x1f);
			tmpwidths[outoffset + 30] = ((val >> 5) & 0x1f);
			tmpwidths[outoffset + 31] = (val & 0x1f);
		}
		int[] widths = Arrays.copyOfRange(tmpwidths, 0, total);

		int n = in[inpos.get()];
		inpos.increment();
		BitsReader rd = new BitsReader(in, inpos.intValue(), n);
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
		// ArrayList<Integer> maxBParition = new ArrayList<Integer>();
		// ArrayList<Integer> Parition = new ArrayList<Integer>();
		// cafor.getOptimalPartition(in, Parition, maxBParition);
		FileWriter fw = new FileWriter("a.csv");
		fw.write("length,count\n");
		for (int i = 0; i < bitWidth.length; i++)
		{
			System.out.println(i + "," + bitWidth[i]);
			fw.write(i + "," + bitWidth[i] + "\n");
		}
		fw.flush();
		fw.close();
	}

}
