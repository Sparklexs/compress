package com.song.vse;

import java.util.Vector;

import me.lemire.compression.*;

public class VSEncodingNaive implements IntegerCODEC
{
	final int	          VSENAIVE_LOGLEN	   = 3;
	final int	          VSENAIVE_LOGLOG	   = 3;
	final int	          VSENAIVE_LENS_LEN	   = 1 << VSENAIVE_LOGLEN;

	// lens则存储了k所能取得的值
	final int	          VSENAIVE_LENS[]	   = { 1, 2, 4, 6, 8, 16, 32, 64 };

	// 这里的logs和remaplogs存储了b所能取得的值，即从13开始，向4的整数倍重映射
	final int	          VSENAIVE_LOGS[]	   = { 0, 1, 2, 3, 4, 5, 6, 7, 8,
	        9, 10, 11, 12, 16, 20, 32	       };

	final int	          VSENAIVE_REMAPLOGS[]	= { 0, 1, 2, 3, 4, 5, 6, 7, 8,
	        9, 10, 11, 12, 16, 16, 16, 16, 20, 20, 20, 20, 32, 32, 32, 32, 32,
	        32, 32, 32, 32, 32, 32, 32	       };
	// 该数组存的是索引,lens[0]=1,lens[1]=2,lens[2]=4,lens[7]=64
	final int	          VSENAIVE_CODELENS[]	= { 0/* 1 */, 0, 1/* 2 */, 0,
	        2/* 4 */, 0, 3/* 6 */, 0, 4/* 8 */, 0, 0, 0, 0, 0, 0, 0, 5/* 16 */,
	        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6/* 32 */, 0, 0, 0, 0,
	        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	        0, 0, 0, 0, 0, 7	               /* 64 */};
	// 同理，value -> key
	final int	          VSENAIVE_CODELOGS[]	= { 0, 1, 2, 3, 4, 5, 6, 7, 8,
	        9, 10, 11, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15,
	        15, 15, 15, 15, 15, 15, 15	       };
	private VSEnocodingDP	vdp;

	public VSEncodingNaive()
	{
		// TODO 自动生成的构造函数存根
		vdp = new VSEnocodingDP(VSENAIVE_LENS, null, VSENAIVE_LENS.length,
		        false);
	}

	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		// TODO 自动生成的方法存根
		if (in == null)
			System.err.println("Invalid input: in");
		if (inlength == 0)
			System.err.println("Invalid input: inlength");
		if (out == null)
			System.err.println("Invalid input: out");

		Vector<Integer> logs = new Vector<Integer>();
		Vector<Integer> parts = new Vector<Integer>();
		int startOffset = inpos.intValue();
		for (int i = startOffset; i < inlength; i++)
			logs.add(VSENAIVE_REMAPLOGS[32 - Util.MSB32(in[i])]);

		vdp.computePartition(logs, parts, VSENAIVE_LOGLEN + VSENAIVE_LOGLOG);
		// bug，由于这里并没有预限定输出数组的长度，故使用整个数组长度作为界限
		BitsWriter wt = new BitsWriter(out, outpos.intValue(), out.length);
		long num = parts.size() - 1;
		for (int i = 0; i < num; i++)
		{
			int maxB = 0;
			for (int j = parts.get(i); j < parts.get(i + 1); j++)
			{
				if (maxB < logs.get(j))
					maxB = logs.get(j);
			}
			wt.write_bits(VSENAIVE_CODELOGS[maxB], VSENAIVE_LOGLOG);
			wt.write_bits(VSENAIVE_CODELENS[parts.get(i + 1) - parts.get(i)],
			        VSENAIVE_LOGLEN);
			for (int j = parts.get(i); j < parts.get(i + 1); j++)
				wt.write_bits(in[j], maxB);

		}
		wt.flush_bits();
		outpos.add((int) wt.size());
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
		BitsReader rd = new BitsReader(in, inpos.intValue(), inlength);
		int oterm = out.length;
		while (outpos.intValue() < oterm)
		{
			int b = VSENAIVE_LOGS[rd.read_bits(VSENAIVE_LOGLOG)];
			int k = VSENAIVE_LENS[rd.read_bits(VSENAIVE_LOGLEN)];

			for (int i = 0; i < k && i + outpos.intValue() < out.length; i++)
				out[i + outpos.intValue()] = (b != 0) ? rd.read_bits(b) : 0;
			outpos.add(k);
		}
	}

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		VSEncodingNaive vNaive = new VSEncodingNaive();

		int[] in = new int[256];
		for (int i = 0; i < in.length; i++)
			in[i] = i;

		int[] out = new int[500];
		int[] outcome = new int[256];

		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();

		vNaive.compress(in, inpos, 256, out, outpos);

		int inlength = outpos.intValue();
		inpos.set(0);
		outpos.set(0);

		vNaive.uncompress(out, inpos, inlength, outcome, outpos);
		for (int i = 0; i < in.length; i++)
		{
			if (!(outcome[i] == i))
			{
				System.out.println(outcome[i]+":"+Integer.toString(i) );
			}

		}
	}
}
