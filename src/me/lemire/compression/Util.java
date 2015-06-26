/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.compression;

/**
 * Routine utility functions.
 * 
 * @author Daniel Lemire
 * 
 */
public final class Util
{
	/**
	 * get the msb of all the elements between the range of pos and length of
	 * the input list
	 * 
	 * @param i
	 *            input list
	 * @param pos
	 *            start position
	 * @param length
	 *            end position
	 * @return msb of the list
	 */
	public static int maxbits(int[] i, int pos, int length)
	{
		int mask = 0;
		for (int k = pos; k < pos + length; ++k)
			mask |= i[k];
		return bits(mask);
	}

	/**
	 * get the msb of 32 elements of the input list
	 * 
	 * @param i
	 * @param pos
	 * @return
	 */
	public static int maxbits32(int[] i, int pos)
	{
		int mask = i[pos];
		mask |= i[pos + 1];
		mask |= i[pos + 2];
		mask |= i[pos + 3];
		mask |= i[pos + 4];
		mask |= i[pos + 5];
		mask |= i[pos + 6];
		mask |= i[pos + 7];
		mask |= i[pos + 8];
		mask |= i[pos + 9];
		mask |= i[pos + 10];
		mask |= i[pos + 11];
		mask |= i[pos + 12];
		mask |= i[pos + 13];
		mask |= i[pos + 14];
		mask |= i[pos + 15];
		mask |= i[pos + 16];
		mask |= i[pos + 17];
		mask |= i[pos + 18];
		mask |= i[pos + 19];
		mask |= i[pos + 20];
		mask |= i[pos + 21];
		mask |= i[pos + 22];
		mask |= i[pos + 23];
		mask |= i[pos + 24];
		mask |= i[pos + 25];
		mask |= i[pos + 26];
		mask |= i[pos + 27];
		mask |= i[pos + 28];
		mask |= i[pos + 29];
		mask |= i[pos + 30];
		mask |= i[pos + 31];
		return bits(mask);
	}

	/**
	 * get the msb of differences among the consecutive input integers
	 * 
	 * @param initoffset
	 *            introduce the difference to the first element
	 * @param i
	 * @param pos
	 * @param length
	 * @return
	 */
	public static int maxdiffbits(int initoffset, int[] i, int pos, int length)
	{
		int mask = 0;
		mask |= (i[pos] - initoffset);
		for (int k = pos + 1; k < pos + length; ++k)
		{
			mask |= i[k] - i[k - 1];
		}
		return bits(mask);
	}

	public static int bits(int i)
	{
		return 32 - Integer.numberOfLeadingZeros(i);
	}

	public static int MSB32(int val)
	{
		return ((val != 0) ? Integer.numberOfLeadingZeros(val) : 32);
	}

	public static int floorBy(int value, int factor)
	{
		return value - value % factor;
	}
}
