package me.lemire.compression;

import java.util.Arrays;

/**
 * This is the enhanced simpleX compression method, which keeps the use of
 * original code mode when the suited integers are larger than the that the next
 * mode can accommodate . Example: 1, 1, ... , 1, 28 (27 1s and 1 28), it is not
 * suited for the code mode (28*1). However, the number of suited integers is
 * 27, it is larger than the size of the mode (14*2).
 */

public final class SimpleE2 implements IntegerCODEC
{
	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, int out[],
	        IntWrapper outpos)
	{
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		out[tmpoutpos++] = inlength;
		int finalpos = currentPos + inlength;
		outer: while (currentPos < finalpos)
		{
			mainloop: for (int selector = 0; selector < 8; selector++)
			{
				int res = 0;
				int compressedNum = codeNum[selector];
				if (finalpos <= currentPos + compressedNum - 1)
					compressedNum = finalpos - currentPos;
				int b = bitLength[selector];
				int max = 1 << b;
				int i = 0;
				for (; i < compressedNum; i++)
				{
					if (max <= in[currentPos + i])
					{
						if (i > codeNum[selector + 1])
						{
							// 如果能容纳的数字个�
							// ��多于下一个模式所能容纳的数字
							compressedNum = i;
							break;
						}
						else
							continue mainloop;
					}
					res = (res << b) + in[currentPos + i];
				}
				// 末尾补零
				if (compressedNum != codeNum[selector])
					res <<= (codeNum[selector] - compressedNum) * b;
				res |= selector << 28;
				out[tmpoutpos++] = res;
				currentPos += compressedNum;
				continue outer;
			}
			final int selector = 8;
			if (in[currentPos] >= 1 << bitLength[selector])
				throw new RuntimeException("Too big a number");
			out[tmpoutpos++] = in[currentPos++] | (selector << 28);
		}
		outpos.set(tmpoutpos);
	}

	@Override
	public void uncompress(int[] coded, IntWrapper inpos, int inlength,
	        int[] recovered, IntWrapper outpos)
	{
		int currentPos = outpos.get();
		int tmpinpos = inpos.get();
		final int finalout = currentPos + coded[tmpinpos++];

		while (currentPos < finalout - 28)
		{
			int val = coded[tmpinpos++];
			int header = val >>> 28;
			switch (header)
			{
				case 0:
				{ // number : 28, bitwidth : 1
					int howmany = finalout - currentPos < 28 ? finalout
					        - currentPos : (28 - zeroNum(val));
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (k + 4)) >>> 31;
					}
					break;
				}
				case 1:
				{ // number : 14, bitwidth : 2
					int howmany = finalout - currentPos < 14 ? finalout
					        - currentPos : (14 - zeroNum(val) / 2);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (2 * k + 4)) >>> 30;
					}
					break;
				}
				case 2:
				{ // number : 9, bitwidth : 3
					int howmany = finalout - currentPos < 9 ? finalout
					        - currentPos : (9 - zeroNum(val) / 3);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (3 * k + 5)) >>> 29;
					}
					break;
				}
				case 3:
				{ // number : 7, bitwidth : 4
					int howmany = finalout - currentPos < 7 ? finalout
					        - currentPos : (7 - zeroNum(val) / 4);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (4 * k + 4)) >>> 28;
					}
					break;
				}
				case 4:
				{ // number : 5, bitwidth : 5
					int howmany = finalout - currentPos < 5 ? finalout
					        - currentPos : (5 - zeroNum(val) / 5);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (5 * k + 7)) >>> 27;
					}
					break;
				}
				case 5:
				{ // number : 4, bitwidth : 7
					int howmany = finalout - currentPos < 4 ? finalout
					        - currentPos : (4 - zeroNum(val) / 7);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (7 * k + 4)) >>> 25;
					}
					break;
				}
				case 6:
				{ // number : 3, bitwidth : 9
					int howmany = finalout - currentPos < 3 ? finalout
					        - currentPos : (3 - zeroNum(val) / 9);
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (9 * k + 5)) >>> 23;
					}
					break;
				}
				case 7:
				{ // number : 2, bitwidth : 14
					int howmany = finalout - currentPos < 2 ? finalout
					        - currentPos : (2 - zeroNum(val) / 14);
					// howmany -= zeroNum(val)/14;
					for (int k = 0; k < howmany; ++k)
					{
						recovered[currentPos++] = (val << (14 * k + 4)) >>> 18;
					}
					break;
				}
				case 8:
				{ // number : 1, bitwidth : 28
					recovered[currentPos++] = (val << 4) >>> 4;
					break;
				}
				default:
				{
					throw new RuntimeException("shouldn't happen");
				}
			}
		}
		while (currentPos < finalout)
		{
			int val = coded[tmpinpos++];
			int header = val >>> 28;
			int howmany = 0;
			switch (header)
			{
				case 0:
					// number : 28, bitwidth : 1
					howmany = (28 - zeroNum(val));
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (k + 4)) >>> 31;
					break;
				case 1:
					// number : 14, bitwidth : 2
					howmany = (14 - zeroNum(val) / 2);
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (2 * k + 4)) >>> 30;
					break;
				case 2:
					// number : 9, bitwidth : 3
					howmany = (9 - zeroNum(val) / 3);
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (3 * k + 5)) >>> 29;
					break;
				case 3:
					// number : 7, bitwidth : 4
					howmany = (7 - zeroNum(val) / 4);
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (4 * k + 4)) >>> 28;
					break;
				case 4:
					// number : 5, bitwidth : 5
					howmany = (5 - zeroNum(val) / 5);
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (5 * k + 7)) >>> 27;
					break;

				case 5:
					// number : 4, bitwidth : 7
					howmany = (4 - zeroNum(val) / 7);
					for (int k = 0; k < howmany; ++k)
						recovered[finalout - 1 - k] = (val << (7 * k + 4)) >>> 25;
					break;
				case 6:
					// number : 3, bitwidth : 9
					howmany = (3 - zeroNum(val) / 9);
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (9 * k + 5)) >>> 23;
					break;
				case 7:
					// number : 2, bitwidth : 14
					howmany = (2 - zeroNum(val) / 14);
					// howmany -= zeroNum(val)/14;
					for (int k = 0; k < howmany; ++k)
						recovered[currentPos++] = (val << (14 * k + 4)) >>> 18;
					break;
				case 8:
					// number : 1, bitwidth : 28
					recovered[currentPos++] = (val << 4) >>> 4;
					break;
				default:
					throw new RuntimeException("shouldn't happen");
			}

		}
		outpos.set(currentPos);
	}

	private static int zeroNum(int number)
	{
		return multiplyDeBruijnBitPosition[((number & -number) * 0x077CB531) >>> 27];
	}

	private final static int	bitLength[]	                = { 1, 2, 3, 4, 5,
	        7, 9, 14, 28	                                };

	private final static int	codeNum[]	                = { 28, 14, 9, 7,
	        5, 4, 3, 2, 1	                                };

	private static final int[]	multiplyDeBruijnBitPosition	= { 0, 1, 28, 2,
	        29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21,
	        19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9	        };

	public static void main(String args[])
	{
		SimpleE2 s = new SimpleE2();
		int[] in = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1,
		        1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 512};
		// int[] a = new int[5243000];
		// for (int i = 0; i < 5243000; i++)
		// a[i] = i;
		int[] out = new int[10000];
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		s.compress(in, inpos, in.length, out, outpos);

		int inlength = outpos.intValue();
		outpos.set(0);
		int[] outcome = new int[1000];
		s.uncompress(out, inpos, inlength, outcome, outpos);
		for (int i = 0; i < outpos.intValue(); i++)
		{
			System.out.println(in[i] + "  " + outcome[i]);
		}
		// if (Arrays.equals(outcome, a))
		// {
		// System.out.println("ok");
		// }
	}
}
