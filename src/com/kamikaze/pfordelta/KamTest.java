package com.kamikaze.pfordelta;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import me.lemire.benchmark.ClusteredDataGenerator;
import me.lemire.compression.Delta;

public class KamTest
{
	public static void main(String args[]) throws FileNotFoundException
	{
		ClusteredDataGenerator cdg = new ClusteredDataGenerator();
		int[][] data = generateTestData(cdg, 20, 18, 10);
		DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat dfspeed = new DecimalFormat("0");

		System.out.println("# kamikaze PForDelta");
		System.out
		        .println("# bits per int, compress speed (mis), decompression speed (mis) ");
		long bef, aft;
		String line = "";
		int N = data.length;
		int totalsize = 0;
		int maxlength = 0;
		for (int k = 0; k < N; ++k)
		{
			totalsize += data[k].length;
			if (data[k].length > maxlength)
				maxlength = data[k].length;
		}
		int[] buffer = new int[maxlength + 1024];
		/*
		 * 4x + 1024 to account for the possibility of some negative compression
		 */
		int size = 0;
		int comptime = 0;
		long decomptime = 0;
		for (int k = 0; k < N; ++k)
		{
			int outpos = 0;
			int[] backupdata = Arrays.copyOf(data[k], data[k].length);
			//
			bef = System.nanoTime() / 1000;
			Delta.delta(backupdata);
			ArrayList<int[]> dataout = new ArrayList<int[]>(
			        data[k].length / 128);
			for (int K = 0; K < data[k].length; K += 128)
			{
				final int[] compressedbuf = PForDelta.compressOneBlockOpt(
				        Arrays.copyOfRange(backupdata, K, K + 128), 128);
				dataout.add(compressedbuf);
				outpos += compressedbuf.length;
			}
			aft = System.nanoTime() / 1000;
			//
			comptime += aft - bef;
			final int thiscompsize = outpos;
			size += thiscompsize;
			//
			bef = System.nanoTime() / 1000;
			ArrayList<int[]> datauncomp = new ArrayList<int[]>(dataout.size());
			int deltaoffset = 0;

			for (int[] compbuf : dataout)
			{
				int[] tmpbuf = new int[128];
				PForDelta.decompressOneBlock(tmpbuf, compbuf, 128);
				tmpbuf[0] += deltaoffset;
				Delta.fastinverseDelta(tmpbuf);
				deltaoffset = tmpbuf[127];
				datauncomp.add(tmpbuf);
			}
			aft = System.nanoTime() / 1000;
			//
			decomptime += aft - bef;
			if (datauncomp.size() * 128 != data[k].length)
				throw new RuntimeException("we have a bug (diff length) "
				        + " expected " + data[k].length + " got "
				        + datauncomp.size() * 128);
			for (int m = 0; m < data[k].length; ++m)
				if (datauncomp.get(m / 128)[m % 128] != data[k][m])
				{
					throw new RuntimeException(
					        "we have a bug (actual difference), expected "
					                + data[k][m] + " found " + buffer[m]
					                + " at " + m);
				}

		}

		line += "\t" + df.format(size * 32.0 / totalsize);
		line += "\t" + dfspeed.format(totalsize / (comptime));
		line += "\t" + dfspeed.format(totalsize / (decomptime));
		System.out.println(line);
	}

	private static int[][] generateTestData(ClusteredDataGenerator dataGen,
	        int N, int nbr, int sparsity)
	{
		final int[][] data = new int[N][];
		final int dataSize = (1 << (nbr + sparsity));
		for (int i = 0; i < N; ++i)
		{
			data[i] = dataGen.generateClustered((1 << nbr), dataSize);
		}
		return data;
	}

}
