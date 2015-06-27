package com.song.FOR;

import java.util.ArrayList;

import gnu.trove.TIntArrayList;
import me.lemire.benchmark.ClusteredDataGenerator;
import me.lemire.compression.IntWrapper;
import me.lemire.compression.IntegerCODEC;
import me.lemire.compression.Util;

public class CAFORBlock implements IntegerCODEC
{

	public CAFORBlock()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out,
	        IntWrapper outpos)
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ClusteredDataGenerator cdg = new ClusteredDataGenerator();

		for (int j = 0; j < 3; j++)
		{
			int[] test = cdg.generateClustered(1000000, 100000000);
			
			TIntArrayList partition = new TIntArrayList(test);

			long start = System.nanoTime();
			TIntArrayList partitionDelta = (TIntArrayList) partition.clone();
			for (int i = 1; i < partitionDelta.size(); i++)
			{
				partitionDelta.setQuick(i, partitionDelta.getQuick(i)
				        - partitionDelta.getQuick(i - 1));
			}
			long timeElapsed = System.nanoTime() - start;
			System.out.println(timeElapsed);

			start = System.nanoTime();
			int[] nums = new int[partition.size()];

			int max = nums[0] = partition.get(0);
			for (int i = 1; i < nums.length; i++)
			{
				max |= nums[i] = partition.getQuick(i)
				        - partition.getQuick(i - 1);
			}
			int maxbit = Util.bits(max);
			timeElapsed = System.nanoTime() - start;
			System.out.println(timeElapsed);

		}
		System.err.println();
	}

}
