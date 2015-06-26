package com.song.vse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import me.lemire.compression.IntWrapper;
import me.lemire.compression.IntegerCODEC;
import me.lemire.compression.Util;

public class VSE_R implements IntegerCODEC
{
	// private int[] wmem_;
	private final int	VSER_LOGS_LEN	= 32;

	// private final long MAXLEN = 100000000;

	public VSE_R()
	{
		// TODO 自动生成的构造函数存根
		// wmem_ = new int[(int) MAXLEN];
	}

	@Override
	public void compress(final int[] in, IntWrapper inpos, final int inlength,
	        int[] out, IntWrapper outpos)
	{
		// TODO 自动生成的方法存根
		if (in == null)
			System.err.println("Invalid input: in");
		if (inlength == 0)
			System.err.println("Invalid input: inlength");
		if (out == null)
			System.err.println("Invalid input: out");

		// long ntotal = 0;

		int[] logs = new int[inlength];
		for (int i = 0; i < inlength; i++)
		{
			if (in[i] != 0)
				logs[i] = 31 - Util.MSB32(in[i] + 1);
			else
				logs[i] = 0;
			// System.out.println("log(" + in[i] + ")+1=" + logs[i]);
		}

		int outOffset = 0;
		VSEncodingNaive vnav = new VSEncodingNaive();
		// bug，这里本该保留前两个int元素，是为了存储logs编码后的out数组长度
		// 本该用long表示，但是这里默认的却是int，所以干脆只保留1个int位
		outpos.add(1);
		vnav.compress(logs, inpos, inlength, out, outpos);
		out[outOffset] = outpos.intValue() - 1;// 因为之前保留头部加了一次1，这里要减去
		outOffset = 1 + out[outOffset];

		int[] hist = new int[VSER_LOGS_LEN + 1];
		for (int i = 0; i <= VSER_LOGS_LEN; i++)
			hist[i] = 0;
		int maxL = 0;
		for (int i = 0; i < inlength; i++)
			if (logs[i] != 0)
				hist[logs[i]]++;
		for (int i = 0; i <= VSER_LOGS_LEN; i++)
			if (hist[i] != 0)
				maxL = i;

		/* Write the number of occs resorting to Delta code */
		BitsWriter bWriter = new BitsWriter(out, outOffset + 1, out.length - 1
		        - outOffset);
		hist[0] = maxL;
		int[] newhist = Arrays.copyOfRange(hist, 0, maxL + 1);
		bWriter.deltaArray(newhist, 0, newhist.length);
		out[outOffset] = (int) bWriter.size();
		outOffset += 1 + out[outOffset];

		/* Ready to write each integer */
		BitsWriter[] wt = new BitsWriter[VSER_LOGS_LEN];
		for (int i = 1; i <= maxL; i++)
			if (hist[i] != 0)
			{
				wt[i - 1] = new BitsWriter(out, outOffset, out.length
				        - outOffset);
				outOffset += ((i * hist[i] + 32 - 1) / 32);
			}
		outpos.set(outOffset);
		/* Write the number in blocks depending on their logs */
		for (int i = 0; i < inlength; i++)
			if (logs[i] != 0)
				wt[logs[i] - 1].write_bits(in[i] + 1, logs[i]);
		for (int i = 0; i < maxL; i++)
			if (hist[i + 1] != 0)
			{
				wt[i].flush_bits();
				wt[i] = null;
			}
	}

	@Override
	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		// TODO 自动生成的方法存根
		if (in == null)
			System.err.println("Invalid input: in");
		if (inlength == 0)
			System.err.println("Invalid input: inlength");
		if (out == null)
			System.err.println("Invalid input: out");

		// int inStart = inpos.intValue();
		int inEnd = inpos.intValue() + inlength;

		VSEncodingNaive vnav = new VSEncodingNaive();

		int n = in[inpos.intValue()];
		// first int stores the number of integers compressed in vsenaive
		inpos.increment();
		vnav.uncompress(in, inpos, n, out, outpos);
		// pass over the vsenaive-compressed block
		inpos.add(n);

		int[][] blk = new int[VSER_LOGS_LEN][];
		// obtain the length compressed using delta
		n = in[inpos.intValue()];
		inpos.increment();

		BitsReader rd = new BitsReader(in, inpos.intValue(), n);
		int maxL = rd.read_ndelta();
		inpos.add(n);

		int nlen = 0;
		for (int i = 1; i <= maxL; i++)
		{
			if (rd.pos() >= inEnd)
				break;
			int numb = rd.read_ndelta();

			if (numb != 0)
			{
				int temp = ((numb * i + 32 - 1) / 32);
				blk[i - 1] = new int[temp * 32];
				VSE_R_CONSTANT.VSER_UNPACK(i, blk[i - 1], 0, in,
				        inpos.intValue(), temp);
				inpos.add(temp);
			}
		}
		int[] pos = new int[maxL];
		for (int i = 0; i < pos.length; i++)
			pos[i] = 0;

		for (int i = 0; i < out.length; i++)
			out[i] = (out[i] == 0) ? 0
			        : (blk[out[i] - 1][pos[out[i] - 1]++] - 1);
	}

	public static void main(String[] args) throws IOException
	{
		int length;

		BufferedReader arrayReader = new BufferedReader(
		        new FileReader("./data"));
		String[] numsStrings = arrayReader.readLine().split(",");
		int[] in = new int[numsStrings.length];

		for (int i = 0; i < in.length; i++)
		{
			in[i] = Integer.valueOf(numsStrings[i]);
		}

		length = in.length;

		//int[] in = new int[65536];
		// for (int i = 0; i < in.length; i++)
		// {
		// in[i] = i * 5684;
		// }

		int[] out = new int[50000 * 8];
		int[] outcome = new int[length];

		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();

		VSE_R vser = new VSE_R();
		vser.compress(in, inpos, in.length, out, outpos);

		int inlength = outpos.intValue();
		inpos.set(0);
		outpos.set(0);

		vser.uncompress(out, inpos, inlength, outcome, outpos);

		/* check the validity */
		 for (int i = 0; i < in.length; i++)
		 {
		 System.out.println(Integer.toString(i) + ":" + outcome[i]);
		 if (!(outcome[i] == in[i]))
		 {
		 System.err.println(Integer.toString(i) + ":" + outcome[i]);
		 }
		
		 }
		System.out.println("Finish!");
	}
}
