package com.song.vse;

import java.util.Vector;

public class VSEnocodingDP
{
	private boolean	    aligned;
	private int	        size;
	private int	        mxblk;
	private final int[]	lens;
	private final int[]	zlens;

	/**
	 * 
	 * @param lens
	 *            legitimate length for the partitioned block
	 * @param zlens
	 * @param size
	 * @param aligned
	 */
	public VSEnocodingDP(final int[] lens, final int[] zlens, int size,
	        boolean aligned)
	{
		// TODO �Զ����ɵĹ��캯�����
		if (lens == null)
		{
			System.err.println("Invalid value: lens");
		}
		if (size == 0)
		{
			System.err.println("Invalid value: size");
		}

		this.aligned = aligned;
		this.size = size;
		this.mxblk = lens[size - 1];
		this.lens = lens;
		this.zlens = zlens;

		if (zlens != null && mxblk < zlens[size - 1])
		{
			mxblk = zlens[size - 1];
		}
	}

	public void computePartition(final Vector<Integer> seq,
	        Vector<Integer> parts, int cost)
	{
		Vector<Integer> sssp = new Vector<Integer>();
		Vector<Integer> costs = new Vector<Integer>();
		for (long i = 0; i <= seq.size(); i++)
			sssp.add(-1);
		for (long i = 0; i <= seq.size(); i++)
			costs.add(0);

		{
			int maxB;
			long j, g, l, mleft;
			long ccost;
			for (long i = 1; i <= seq.size(); i++)
			{
				mleft = (i > mxblk) ? i - mxblk : 0;
				for (maxB = 0, l = 0, g = 0, j = i - 1; j >= mleft; j--)
				{
					// ��������bug�����������Ԫ�ظ������ܳ���int�� ����
					// ��������ΪVector.elementAt��֧��long��Ϊ����
					if (maxB < seq.elementAt((int) j))
						maxB = seq.elementAt((int) j);
					if (zlens == null)
					{
						// bug,ͬ��
						if (i - j != lens[(int) l])
							continue;
						else
							l++;
					}
					else
					{
						if (maxB != 0)
						{
							mleft = (i > mxblk) ? i - lens[size - 1] : 0;
							// bug,ͬ��
							if (i - j != lens[(int) l])
								continue;
							else
								l++;
						}
						else
						{
							// bug,ͬ��
							if (i - j == lens[(int) l])
								l++;
							// bug,ͬ��
							if (i - j != zlens[(int) g])
								continue;
							else
								g++;
						}
					}
					/* calculate the costs */
					if (aligned)
						// bug,ͬ��
						ccost = costs.get((int) j)
						        + (((i - j) * maxB + 32 - 1) / 32) + cost;
					else
						// bug,ͬ��
						ccost = costs.get((int) j) + (i - j) * maxB + cost;
					// bug,ͬ��
					if (sssp.get((int) i) == -1)
						costs.set((int) i, (int) ccost + 1);
					if (ccost <= costs.get((int) i))
					{
						costs.set((int) i, (int) ccost);
						sssp.set((int) i, (int) j);
					}
				}
			}
		}
		/* Compute number of nodes in the path */
		long idx = 0;
		long next = seq.size();
		while (next != 0)
		{
			next = sssp.get((int) next);
			idx++;
		}
		for (long i = 0; i <= idx; i++)
			parts.add(0);
		next = seq.size();
		while (next != 0)
		{
			parts.set((int) idx--, (int) next);
			next = sssp.get((int) next);
		}
	}

}
