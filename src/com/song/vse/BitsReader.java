package com.song.vse;

import me.lemire.compression.Util;

public class BitsReader
{
	private int[]	   in;
	private long	   startOffset;
	private long	   term;
	private long	   buffer;
	private int	       fill;
	private long	   nread;
	// 这里0x0ffffffff表示-1，那么转换为long之后还是-1，
	// 则所有的bit位均为1，而不是想象的高32位为0,
	private final long	constant	= ((long) 0x0ffffffff) >>> 32;

	public BitsReader(int[] in, long startoffset, long len)
	{
		// TODO 自动生成的构造函数存根
		if (in == null)
			System.err.println("Invalid value: in");
		if (len == 0)
			System.err.println("Invalid value: len");
		this.in = in;
		startOffset = startoffset;
		term = len;
		buffer = 0;
		fill = 0;
	}

	public int read_bits(int num)
	{
		if (num == 0)
			return 0;
		assert (num <= 32);
		if (fill < num)
		{
			buffer = (buffer << 32)
			        | (in[(int) (startOffset + nread++)] & constant);
			fill += 32;
			if (nread > term)
				System.err.println("Buffer-overflowed exception");
		}
		fill -= num;
		return (int) ((buffer >> fill) & (((long) 1 << num) - 1));
	}

	public long pos()
	{
		return nread;
	}

	public void ngammaArray(int[] out, final long offset, final long nvalues)
	{
		if (out == null)

			System.err.println("Invalid value: out");

		if (offset < 0 || offset > out.length)

			System.err.println("Invalid value: offset");

		if (nvalues == 0)

			System.err.println("Invalid value: nvalues");

		if (nread > term)
			System.err.println("Buffer-overflowed exception");
		for (long i = 0; i < nvalues && nread <= term; i++)
		{
			out[(int) i] = read_ngamma();

		}
	}

	public void ndeltaArray(int[] out, final long offset, final long nvalues)
	{
		if (out == null)

			System.err.println("Invalid value: out");

		if (offset < 0 || offset > out.length)

			System.err.println("Invalid value: offset");

		if (nvalues == 0)

			System.err.println("Invalid value: nvalues");

		if (nread > term)
			System.err.println("Buffer-overflowed exception");
		for (long i = 0; i < nvalues && nread <= term; i++)
		{
			out[(int) i] = read_ndelta();

		}
	}

	public void intrpolatvArray(int[] out, int nvalues, int offset, int low,
	        int high)
	{
		if (nvalues == 0)
			return;
		if (out == null)
			System.err.println("Invalid value: out");
		if (nread > term)
			System.err.println("Buffer-overflowed exception");
		if (low > high)
			System.err.println("Invalid equality: low > high");
		if (nvalues == 1)
		{
			out[offset] = read_intrpolav(high - low + 1) + low;
			return;
		}
		int h = nvalues << 1;
		int m = read_intrpolav(high - nvalues + h + 1 - (low + h) + 1) + low
		        + h;
		out[offset + h] = m;
		intrpolatvArray(out, h, offset, low, m - 1);
		intrpolatvArray(out, nvalues - h - 1, offset + h + 1, m + 1, high);
	}

	protected int read_unary()
	{
		int count = 0;
		while (read_bits(1) == 0)
			count++;
		return count;
	}

	protected int read_ngamma()
	{
		int count = read_unary();
		assert (count < 32);
		return ((1 << count) | read_bits(count)) - 1;
	}

	public int read_ndelta()
	{
		int count = read_ngamma();
		assert (count < 32);
		return ((1 << count) | read_bits(count)) - 1;
	}

	protected int read_intrpolav(int intvl)
	{
		assert (1 <= intvl);
		int d = 31 - Util.MSB32(intvl);
		assert (d < 32);
		int m = (int) (((long) 1 << (d + 1)) - intvl);
		int x = read_bits(d);
		if (x < m)
			return x;
		return (x << 1) + read_bits(1) - m;
	}
}
