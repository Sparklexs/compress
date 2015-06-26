package com.song.vse;

import me.lemire.compression.Util;

public class BitsWriter
{
	private int[]	out;
	private long	startOffset;
	private long	term;
	private long	buffer;
	private int	  fill;
	private long	nwritten;	 // 用于指示out数组的当前位置

	public BitsWriter(int[] out, long startoffset, long len)
	{
		if (out == null)
		{
			System.err.println("Invalid value: out");
		}
		if (startoffset < 0 || startoffset >= out.length)
		{
			System.err.println("Invalid value: startoffset");
		}
		if (len == 0)
		{
			System.err.println("Invalid value: len");
		}
		this.out = out;
		startOffset = startoffset;
		term = len;

		buffer = 0;
		fill = 0;
		nwritten = 0;

	}

	private void write_unary(int val)
	{
		assert (val < 32);
		write_bits(0, val);
		write_bits(1, 1);
	}

	private void write_gamma(int val)
	{
		int d = 31 - Util.MSB32(val + 1);
		assert (d < 32);
		write_unary(d);
		write_bits(val + 1, d);
	}

	private void write_intrpolatv(int val, int intvl)
	{
		assert (out != null);
		int d = 31 - Util.MSB32(intvl);
		int m = (int) ((long) 1 << (d + 1) - intvl);
		if (val < m)

			write_bits(val, d);
		else
			write_bits(val + m, d + 1);
	}

	public void write_bits(int val, int num)
	{
		if (num > 32 || num < 0)
			System.err.println("Out of range exception: num");
		assert (out != null);
		if (num > 0)
		{
			if (nwritten >= term)
				System.err.println("Buffer-overflowed exception");
			buffer = (buffer << num) | (val & (((long) 1 << num) - 1));
			fill += num;
			if (fill >= 32)
			{
				out[(int) (startOffset + nwritten++)] = (int) (buffer >> (fill - 32) & (((long) 1 << 32) - 1));
				fill -= 32;
				if (nwritten >= term && fill > 0)
					System.err.println("Buffer-overflowed exception");
			}
		}
	}

	public void flush_bits()
	{
		if (nwritten >= term && fill > 0)
			System.err.println("Buffer-overflowed exception");
		assert (out != null);
		assert (fill < 32);
		if (fill > 0)
		{
			out[(int) (startOffset + nwritten++)] = (int) (buffer << ((32 - fill) & (((long) 1 << 32) - 1)));
			buffer = 0;
			fill = 0;
		}
	}

	public long size()
	{
		return nwritten;
	}

	/**
	 * 
	 * @param in
	 * @param offset
	 *            the start position of the input sequence
	 * @param len
	 *            the range between the start position and the end position of
	 *            the input sequence
	 * @return
	 */
	public int gammaArray(final int[] in, final int offset, final long len)
	{
		if (in == null)
			System.err.println("Invalid value: in");
		if (offset < 0 || offset >= in.length)
			System.err.println("Invalid value: startoffset");
		if (len == 0)
			System.err.println("Invalid value: len");

		for (long i = 0; i < len && nwritten < term; i++)

			write_gamma(in[offset + (int) i]);
		flush_bits();

		return (int) nwritten;
	}

	/**
	 * 
	 * @param in
	 * @param offset
	 *            the start position of the input sequence
	 * @param len
	 *            the range between the start position and the end position of
	 *            the input sequence
	 * @return
	 */
	public int deltaArray(final int[] in, final int offset, final long len)
	{
		if (in == null)
			System.err.println("Invalid value: in");
		if (offset < 0 || offset >= in.length)
			System.err.println("Invalid value: startoffset");
		if (len == 0)
			System.err.println("Invalid value: len");
		for (long i = 0; i < len && nwritten < term; i++)
		{
			int d = 31 - Util.MSB32(in[(int) i] + 1);
			assert (d < 32);
			write_gamma(d);
			write_bits(in[offset + (int) i] + 1, d);
		}
		flush_bits();
		return (int) nwritten;
	}

	public int intrpolatvArray(final int[] in, int len, int offset, int low,
	        int high)
	{
		if (len == 0)
			return 0;

		if (in == null)
			System.err.println("Invalid value: in");
		if (nwritten >= term)
			System.err.println("Buffer-overflowed exception");
		if (low > high)
			System.err.println("Invalid equality: low > high");
		if (len == 1)
		{
			write_intrpolatv(in[offset] - low, high - low + 1);
			return 0;
		}
		int h = len / 2;
		int m = in[offset + h];
		write_intrpolatv(m - (low + h), high - len + h + 1 - (low + h) + 1);
		intrpolatvArray(in, h, offset, low, m - 1);
		intrpolatvArray(in, len - h - 1, offset + h + 1, m + 1, high);
		return 0;
	}

}
