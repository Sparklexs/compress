package com.song.FOR;

public class CAFOR_CONSTANT
{

	static final void CAFOR_UNPACK1(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 31));
			out[outoffset + 1] = ((val >> 30) & 0x01);
			out[outoffset + 2] = ((val >> 29) & 0x01);
			out[outoffset + 3] = ((val >> 28) & 0x01);
			out[outoffset + 4] = ((val >> 27) & 0x01);
			out[outoffset + 5] = ((val >> 26) & 0x01);
			out[outoffset + 6] = ((val >> 25) & 0x01);
			out[outoffset + 7] = ((val >> 24) & 0x01);
			out[outoffset + 8] = ((val >> 23) & 0x01);
			out[outoffset + 9] = ((val >> 22) & 0x01);
			out[outoffset + 10] = ((val >> 21) & 0x01);
			out[outoffset + 11] = ((val >> 20) & 0x01);
			out[outoffset + 12] = ((val >> 19) & 0x01);
			out[outoffset + 13] = ((val >> 18) & 0x01);
			out[outoffset + 14] = ((val >> 17) & 0x01);
			out[outoffset + 15] = ((val >> 16) & 0x01);
			out[outoffset + 16] = ((val >> 15) & 0x01);
			out[outoffset + 17] = ((val >> 14) & 0x01);
			out[outoffset + 18] = ((val >> 13) & 0x01);
			out[outoffset + 19] = ((val >> 12) & 0x01);
			out[outoffset + 20] = ((val >> 11) & 0x01);
			out[outoffset + 21] = ((val >> 10) & 0x01);
			out[outoffset + 22] = ((val >> 9) & 0x01);
			out[outoffset + 23] = ((val >> 8) & 0x01);
			out[outoffset + 24] = ((val >> 7) & 0x01);
			out[outoffset + 25] = ((val >> 6) & 0x01);
			out[outoffset + 26] = ((val >> 5) & 0x01);
			out[outoffset + 27] = ((val >> 4) & 0x01);
			out[outoffset + 28] = ((val >> 3) & 0x01);
			out[outoffset + 29] = ((val >> 2) & 0x01);
			out[outoffset + 30] = ((val >> 1) & 0x01);
			out[outoffset + 31] = (val & 0x01);
		}
	}

	static final void CAFOR_UNPACK2(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 30));
			out[outoffset + 1] = ((val >> 28) & 0x03);
			out[outoffset + 2] = ((val >> 26) & 0x03);
			out[outoffset + 3] = ((val >> 24) & 0x03);
			out[outoffset + 4] = ((val >> 22) & 0x03);
			out[outoffset + 5] = ((val >> 20) & 0x03);
			out[outoffset + 6] = ((val >> 18) & 0x03);
			out[outoffset + 7] = ((val >> 16) & 0x03);
			out[outoffset + 8] = ((val >> 14) & 0x03);
			out[outoffset + 9] = ((val >> 12) & 0x03);
			out[outoffset + 10] = ((val >> 10) & 0x03);
			out[outoffset + 11] = ((val >> 8) & 0x03);
			out[outoffset + 12] = ((val >> 6) & 0x03);
			out[outoffset + 13] = ((val >> 4) & 0x03);
			out[outoffset + 14] = ((val >> 2) & 0x03);
			out[outoffset + 15] = (val & 0x03);
		}
	}

	static final void CAFOR_UNPACK3(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 29));
			out[outoffset + 1] = ((val >> 26) & 0x07);
			out[outoffset + 2] = ((val >> 23) & 0x07);
			out[outoffset + 3] = ((val >> 20) & 0x07);
			out[outoffset + 4] = ((val >> 17) & 0x07);
			out[outoffset + 5] = ((val >> 14) & 0x07);
			out[outoffset + 6] = ((val >> 11) & 0x07);
			out[outoffset + 7] = ((val >> 8) & 0x07);
			out[outoffset + 8] = ((val >> 5) & 0x07);
			out[outoffset + 9] = ((val >> 2) & 0x07);
			out[outoffset + 10] = (val << 1) & 0x07;

			val = in[inoffset + i + 1];
			out[outoffset + 10] |= ((val >>> 31));
			out[outoffset + 11] = ((val >> 28) & 0x07);
			out[outoffset + 12] = ((val >> 25) & 0x07);
			out[outoffset + 13] = ((val >> 22) & 0x07);
			out[outoffset + 14] = ((val >> 19) & 0x07);
			out[outoffset + 15] = ((val >> 16) & 0x07);
			out[outoffset + 16] = ((val >> 13) & 0x07);
			out[outoffset + 17] = ((val >> 10) & 0x07);
			out[outoffset + 18] = ((val >> 7) & 0x07);
			out[outoffset + 19] = ((val >> 4) & 0x07);
			out[outoffset + 20] = ((val >> 1) & 0x07);
			out[outoffset + 21] = (val << 2) & 0x07;

			val = in[inoffset + i + 2];
			out[outoffset + 21] |= ((val >>> 30));
			out[outoffset + 22] = ((val >> 27) & 0x07);
			out[outoffset + 23] = ((val >> 24) & 0x07);
			out[outoffset + 24] = ((val >> 21) & 0x07);
			out[outoffset + 25] = ((val >> 18) & 0x07);
			out[outoffset + 26] = ((val >> 15) & 0x07);
			out[outoffset + 27] = ((val >> 12) & 0x07);
			out[outoffset + 28] = ((val >> 9) & 0x07);
			out[outoffset + 29] = ((val >> 6) & 0x07);
			out[outoffset + 30] = ((val >> 3) & 0x07);
			out[outoffset + 31] = (val & 0x07);
		}
	}

	static final void CAFOR_UNPACK4(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 28));
			out[outoffset + 1] = ((val >> 24) & 0x0f);
			out[outoffset + 2] = ((val >> 20) & 0x0f);
			out[outoffset + 3] = ((val >> 16) & 0x0f);
			out[outoffset + 4] = ((val >> 12) & 0x0f);
			out[outoffset + 5] = ((val >> 8) & 0x0f);
			out[outoffset + 6] = ((val >> 4) & 0x0f);
			out[outoffset + 7] = (val & 0x0f);
		}
	}

	static final void CAFOR_UNPACK5(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 27));
			out[outoffset + 1] = ((val >> 22) & 0x1f);
			out[outoffset + 2] = ((val >> 17) & 0x1f);
			out[outoffset + 3] = ((val >> 12) & 0x1f);
			out[outoffset + 4] = ((val >> 7) & 0x1f);
			out[outoffset + 5] = ((val >> 2) & 0x1f);
			out[outoffset + 6] = (val << 3) & 0x1f;
			val = in[inoffset + i + 1];
			out[outoffset + 6] |= ((val >>> 29));
			out[outoffset + 7] = ((val >> 24) & 0x1f);
			out[outoffset + 8] = ((val >> 19) & 0x1f);
			out[outoffset + 9] = ((val >> 14) & 0x1f);
			out[outoffset + 10] = ((val >> 9) & 0x1f);
			out[outoffset + 11] = ((val >> 4) & 0x1f);
			out[outoffset + 12] = (val << 1) & 0x1f;
			val = in[inoffset + i + 2];
			out[outoffset + 12] |= ((val >>> 31));
			out[outoffset + 13] = ((val >> 26) & 0x1f);
			out[outoffset + 14] = ((val >> 21) & 0x1f);
			out[outoffset + 15] = ((val >> 16) & 0x1f);
			out[outoffset + 16] = ((val >> 11) & 0x1f);
			out[outoffset + 17] = ((val >> 6) & 0x1f);
			out[outoffset + 18] = ((val >> 1) & 0x1f);
			out[outoffset + 19] = (val << 4) & 0x1f;
			val = in[inoffset + i + 3];
			out[outoffset + 19] |= ((val >>> 28));
			out[outoffset + 20] = ((val >> 23) & 0x1f);
			out[outoffset + 21] = ((val >> 18) & 0x1f);
			out[outoffset + 22] = ((val >> 13) & 0x1f);
			out[outoffset + 23] = ((val >> 8) & 0x1f);
			out[outoffset + 24] = ((val >> 3) & 0x1f);
			out[outoffset + 25] = (val << 2) & 0x1f;
			val = in[inoffset + i + 4];
			out[outoffset + 25] |= ((val >>> 30));
			out[outoffset + 26] = ((val >> 25) & 0x1f);
			out[outoffset + 27] = ((val >> 20) & 0x1f);
			out[outoffset + 28] = ((val >> 15) & 0x1f);
			out[outoffset + 29] = ((val >> 10) & 0x1f);
			out[outoffset + 30] = ((val >> 5) & 0x1f);
			out[outoffset + 31] = (val & 0x1f);
		}
	}

	static final void CAFOR_UNPACK6(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 26));
			out[outoffset + 1] = ((val >> 20) & 0x3f);
			out[outoffset + 2] = ((val >> 14) & 0x3f);
			out[outoffset + 3] = ((val >> 8) & 0x3f);
			out[outoffset + 4] = ((val >> 2) & 0x3f);
			out[outoffset + 5] = (val << 4) & 0x3f;
			val = in[inoffset + i + 1];
			out[outoffset + 5] |= ((val >>> 28));
			out[outoffset + 6] = ((val >> 22) & 0x3f);
			out[outoffset + 7] = ((val >> 16) & 0x3f);
			out[outoffset + 8] = ((val >> 10) & 0x3f);
			out[outoffset + 9] = ((val >> 4) & 0x3f);
			out[outoffset + 10] = (val << 2) & 0x3f;
			val = in[inoffset + i + 2];
			out[outoffset + 10] |= ((val >>> 30));
			out[outoffset + 11] = ((val >> 24) & 0x3f);
			out[outoffset + 12] = ((val >> 18) & 0x3f);
			out[outoffset + 13] = ((val >> 12) & 0x3f);
			out[outoffset + 14] = ((val >> 6) & 0x3f);
			out[outoffset + 15] = (val & 0x3f);
		}
	}

	static final void CAFOR_UNPACK7(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 25));
			out[outoffset + 1] = ((val >> 18) & 0x7f);
			out[outoffset + 2] = ((val >> 11) & 0x7f);
			out[outoffset + 3] = ((val >> 4) & 0x7f);
			out[outoffset + 4] = (val << 3) & 0x7f;
			val = in[inoffset + i + 1];
			out[outoffset + 4] |= ((val >>> 29));
			out[outoffset + 5] = ((val >> 22) & 0x7f);
			out[outoffset + 6] = ((val >> 15) & 0x7f);
			out[outoffset + 7] = ((val >> 8) & 0x7f);
			out[outoffset + 8] = ((val >> 1) & 0x7f);
			out[outoffset + 9] = (val << 6) & 0x7f;
			val = in[inoffset + i + 2];
			out[outoffset + 9] |= ((val >>> 26));
			out[outoffset + 10] = ((val >> 19) & 0x7f);
			out[outoffset + 11] = ((val >> 12) & 0x7f);
			out[outoffset + 12] = ((val >> 5) & 0x7f);
			out[outoffset + 13] = (val << 2) & 0x7f;
			val = in[inoffset + i + 3];
			out[outoffset + 13] |= ((val >>> 30));
			out[outoffset + 14] = ((val >> 23) & 0x7f);
			out[outoffset + 15] = ((val >> 16) & 0x7f);
			out[outoffset + 16] = ((val >> 9) & 0x7f);
			out[outoffset + 17] = ((val >> 2) & 0x7f);
			out[outoffset + 18] = (val << 5) & 0x7f;
			val = in[inoffset + i + 4];
			out[outoffset + 18] |= ((val >>> 27));
			out[outoffset + 19] = ((val >> 20) & 0x7f);
			out[outoffset + 20] = ((val >> 13) & 0x7f);
			out[outoffset + 21] = ((val >> 6) & 0x7f);
			out[outoffset + 22] = (val << 1) & 0x7f;
			val = in[inoffset + i + 5];
			out[outoffset + 22] |= ((val >>> 31));
			out[outoffset + 23] = ((val >> 24) & 0x7f);
			out[outoffset + 24] = ((val >> 17) & 0x7f);
			out[outoffset + 25] = ((val >> 10) & 0x7f);
			out[outoffset + 26] = ((val >> 3) & 0x7f);
			out[outoffset + 27] = (val << 4) & 0x7f;
			val = in[inoffset + i + 6];
			out[outoffset + 27] |= ((val >>> 28));
			out[outoffset + 28] = ((val >> 21) & 0x7f);
			out[outoffset + 29] = ((val >> 14) & 0x7f);
			out[outoffset + 30] = ((val >> 7) & 0x7f);
			out[outoffset + 31] = (val & 0x7f);
		}
	}

	static final void CAFOR_UNPACK8(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 4)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 24));
			out[outoffset + 1] = ((val >> 16) & 0xff);
			out[outoffset + 2] = ((val >> 8) & 0xff);
			out[outoffset + 3] = (val & 0xff);
		}
	}

	static final void CAFOR_UNPACK9(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 9, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 23));
			out[outoffset + 1] = ((val >> 14) & 0x01ff);
			out[outoffset + 2] = ((val >> 5) & 0x01ff);
			out[outoffset + 3] = (val << 4) & 0x01ff;
			val = in[inoffset + i + 1];
			out[outoffset + 3] |= ((val >>> 28));
			out[outoffset + 4] = ((val >> 19) & 0x01ff);
			out[outoffset + 5] = ((val >> 10) & 0x01ff);
			out[outoffset + 6] = ((val >> 1) & 0x01ff);
			out[outoffset + 7] = (val << 8) & 0x01ff;
			val = in[inoffset + i + 2];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = ((val >> 15) & 0x01ff);
			out[outoffset + 9] = ((val >> 6) & 0x01ff);
			out[outoffset + 10] = (val << 3) & 0x01ff;
			val = in[inoffset + i + 3];
			out[outoffset + 10] |= ((val >>> 29));
			out[outoffset + 11] = ((val >> 20) & 0x01ff);
			out[outoffset + 12] = ((val >> 11) & 0x01ff);
			out[outoffset + 13] = ((val >> 2) & 0x01ff);
			out[outoffset + 14] = (val << 7) & 0x01ff;
			val = in[inoffset + i + 4];
			out[outoffset + 14] |= ((val >>> 25));
			out[outoffset + 15] = ((val >> 16) & 0x01ff);
			out[outoffset + 16] = ((val >> 7) & 0x01ff);
			out[outoffset + 17] = (val << 2) & 0x01ff;
			val = in[inoffset + i + 5];
			out[outoffset + 17] |= ((val >>> 30));
			out[outoffset + 18] = ((val >> 21) & 0x01ff);
			out[outoffset + 19] = ((val >> 12) & 0x01ff);
			out[outoffset + 20] = ((val >> 3) & 0x01ff);
			out[outoffset + 21] = (val << 6) & 0x01ff;
			val = in[inoffset + i + 6];
			out[outoffset + 21] |= ((val >>> 26));
			out[outoffset + 22] = ((val >> 17) & 0x01ff);
			out[outoffset + 23] = ((val >> 8) & 0x01ff);
			out[outoffset + 24] = (val << 1) & 0x01ff;
			val = in[inoffset + i + 7];
			out[outoffset + 24] |= ((val >>> 31));
			out[outoffset + 25] = ((val >> 22) & 0x01ff);
			out[outoffset + 26] = ((val >> 13) & 0x01ff);
			out[outoffset + 27] = ((val >> 4) & 0x01ff);
			out[outoffset + 28] = (val << 5) & 0x01ff;
			val = in[inoffset + i + 8];
			out[outoffset + 28] |= ((val >>> 27));
			out[outoffset + 29] = ((val >> 18) & 0x01ff);
			out[outoffset + 30] = ((val >> 9) & 0x01ff);
			out[outoffset + 31] = (val & 0x01ff);
		}
	}

	static final void CAFOR_UNPACK10(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 22));
			out[outoffset + 1] = ((val >> 12) & 0x03ff);
			out[outoffset + 2] = ((val >> 2) & 0x03ff);
			out[outoffset + 3] = (val << 8) & 0x03ff;
			val = in[inoffset + i + 1];
			out[outoffset + 3] |= ((val >>> 24));
			out[outoffset + 4] = ((val >> 14) & 0x03ff);
			out[outoffset + 5] = ((val >> 4) & 0x03ff);
			out[outoffset + 6] = (val << 6) & 0x03ff;
			val = in[inoffset + i + 2];
			out[outoffset + 6] |= ((val >>> 26));
			out[outoffset + 7] = ((val >> 16) & 0x03ff);
			out[outoffset + 8] = ((val >> 6) & 0x03ff);
			out[outoffset + 9] = (val << 4) & 0x03ff;
			val = in[inoffset + i + 3];
			out[outoffset + 9] |= ((val >>> 28));
			out[outoffset + 10] = ((val >> 18) & 0x03ff);
			out[outoffset + 11] = ((val >> 8) & 0x03ff);
			out[outoffset + 12] = (val << 2) & 0x03ff;
			val = in[inoffset + i + 4];
			out[outoffset + 12] |= ((val >>> 30));
			out[outoffset + 13] = ((val >> 20) & 0x03ff);
			out[outoffset + 14] = ((val >> 10) & 0x03ff);
			out[outoffset + 15] = (val & 0x03ff);
		}
	}

	static final void CAFOR_UNPACK11(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 11, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 21));
			out[outoffset + 1] = ((val >> 10) & 0x07ff);
			out[outoffset + 2] = (val << 1) & 0x07ff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= ((val >>> 31));
			out[outoffset + 3] = ((val >> 20) & 0x07ff);
			out[outoffset + 4] = ((val >> 9) & 0x07ff);
			out[outoffset + 5] = (val << 2) & 0x07ff;
			val = in[inoffset + i + 2];
			out[outoffset + 5] |= ((val >>> 30));
			out[outoffset + 6] = ((val >> 19) & 0x07ff);
			out[outoffset + 7] = ((val >> 8) & 0x07ff);
			out[outoffset + 8] = (val << 3) & 0x07ff;
			val = in[inoffset + i + 3];
			out[outoffset + 8] |= ((val >>> 29));
			out[outoffset + 9] = ((val >> 18) & 0x07ff);
			out[outoffset + 10] = ((val >> 7) & 0x07ff);
			out[outoffset + 11] = (val << 4) & 0x07ff;
			val = in[inoffset + i + 4];
			out[outoffset + 11] |= ((val >>> 28));
			out[outoffset + 12] = ((val >> 17) & 0x07ff);
			out[outoffset + 13] = ((val >> 6) & 0x07ff);
			out[outoffset + 14] = (val << 5) & 0x07ff;
			val = in[inoffset + i + 5];
			out[outoffset + 14] |= ((val >>> 27));
			out[outoffset + 15] = ((val >> 16) & 0x07ff);
			out[outoffset + 16] = ((val >> 5) & 0x07ff);
			out[outoffset + 17] = (val << 6) & 0x07ff;
			val = in[inoffset + i + 6];
			out[outoffset + 17] |= ((val >>> 26));
			out[outoffset + 18] = ((val >> 15) & 0x07ff);
			out[outoffset + 19] = ((val >> 4) & 0x07ff);
			out[outoffset + 20] = (val << 7) & 0x07ff;
			val = in[inoffset + i + 7];
			out[outoffset + 20] |= ((val >>> 25));
			out[outoffset + 21] = ((val >> 14) & 0x07ff);
			out[outoffset + 22] = ((val >> 3) & 0x07ff);
			out[outoffset + 23] = (val << 8) & 0x07ff;
			val = in[inoffset + i + 8];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = ((val >> 13) & 0x07ff);
			out[outoffset + 25] = ((val >> 2) & 0x07ff);
			out[outoffset + 26] = (val << 9) & 0x07ff;
			val = in[inoffset + i + 9];
			out[outoffset + 26] |= ((val >>> 23));
			out[outoffset + 27] = ((val >> 12) & 0x07ff);
			out[outoffset + 28] = ((val >> 1) & 0x07ff);
			out[outoffset + 29] = (val << 10) & 0x07ff;
			val = in[inoffset + i + 10];
			out[outoffset + 29] |= ((val >>> 22));
			out[outoffset + 30] = ((val >> 11) & 0x07ff);
			out[outoffset + 31] = (val & 0x07ff);
		}
	}

	static final void CAFOR_UNPACK12(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 20));
			out[outoffset + 1] = ((val >> 8) & 0x0fff);
			out[outoffset + 2] = (val << 4) & 0x0fff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= ((val >>> 28));
			out[outoffset + 3] = ((val >> 16) & 0x0fff);
			out[outoffset + 4] = ((val >>> 4) & 0x0fff);
			out[outoffset + 5] = (val << 8) & 0x0fff;
			val = in[inoffset + i + 2];
			out[outoffset + 5] |= ((val >>> 24));
			out[outoffset + 6] = ((val >> 12) & 0x0fff);
			out[outoffset + 7] = (val & 0x0fff);
		}
	}

	static final void CAFOR_UNPACK13(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 13, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 19));
			out[outoffset + 1] = ((val >> 6) & 0x1fff);
			out[outoffset + 2] = (val << 7) & 0x1fff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= ((val >>> 25));
			out[outoffset + 3] = ((val >> 12) & 0x1fff);
			out[outoffset + 4] = (val << 1) & 0x1fff;
			val = in[inoffset + i + 2];
			out[outoffset + 4] |= ((val >>> 31));
			out[outoffset + 5] = ((val >> 18) & 0x1fff);
			out[outoffset + 6] = ((val >> 5) & 0x1fff);
			out[outoffset + 7] = (val << 8) & 0x1fff;
			val = in[inoffset + i + 3];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = ((val >> 11) & 0x1fff);
			out[outoffset + 9] = (val << 2) & 0x1fff;
			val = in[inoffset + i + 4];
			out[outoffset + 9] |= ((val >>> 30));
			out[outoffset + 10] = ((val >> 17) & 0x1fff);
			out[outoffset + 11] = ((val >> 4) & 0x1fff);
			out[outoffset + 12] = (val << 9) & 0x1fff;
			val = in[inoffset + i + 5];
			out[outoffset + 12] |= ((val >>> 23));
			out[outoffset + 13] = ((val >> 10) & 0x1fff);
			out[outoffset + 14] = (val << 3) & 0x1fff;
			val = in[inoffset + i + 6];
			out[outoffset + 14] |= ((val >>> 29));
			out[outoffset + 15] = ((val >> 16) & 0x1fff);
			out[outoffset + 16] = ((val >> 3) & 0x1fff);
			out[outoffset + 17] = (val << 10) & 0x1fff;
			val = in[inoffset + i + 7];
			out[outoffset + 17] |= ((val >>> 22));
			out[outoffset + 18] = ((val >> 9) & 0x1fff);
			out[outoffset + 19] = (val << 4) & 0x1fff;
			val = in[inoffset + i + 8];
			out[outoffset + 19] |= ((val >>> 28));
			out[outoffset + 20] = ((val >> 15) & 0x1fff);
			out[outoffset + 21] = ((val >> 2) & 0x1fff);
			out[outoffset + 22] = (val << 11) & 0x1fff;
			val = in[inoffset + i + 9];
			out[outoffset + 22] |= ((val >>> 21));
			out[outoffset + 23] = ((val >> 8) & 0x1fff);
			out[outoffset + 24] = (val << 5) & 0x1fff;
			val = in[inoffset + i + 10];
			out[outoffset + 24] |= ((val >>> 27));
			out[outoffset + 25] = ((val >> 14) & 0x1fff);
			out[outoffset + 26] = ((val >> 1) & 0x1fff);
			out[outoffset + 27] = (val << 12) & 0x1fff;
			val = in[inoffset + i + 11];
			out[outoffset + 27] |= ((val >>> 20));
			out[outoffset + 28] = ((val >> 7) & 0x1fff);
			out[outoffset + 29] = (val << 6) & 0x1fff;
			val = in[inoffset + i + 12];
			out[outoffset + 29] |= ((val >>> 26));
			out[outoffset + 30] = ((val >> 13) & 0x1fff);
			out[outoffset + 31] = (val & 0x1fff);
		}
	}

	static final void CAFOR_UNPACK14(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 18));
			out[outoffset + 1] = ((val >> 4) & 0x3fff);
			out[outoffset + 2] = (val << 10) & 0x3fff;

			val = in[inoffset + i + 1];
			out[outoffset + 2] |= ((val >>> 22));
			out[outoffset + 3] = ((val >> 8) & 0x3fff);
			out[outoffset + 4] = (val << 6) & 0x3fff;

			val = in[inoffset + i + 2];
			out[outoffset + 4] |= ((val >>> 26));
			out[outoffset + 5] = ((val >> 12) & 0x3fff);
			out[outoffset + 6] = (val << 2) & 0x3fff;

			val = in[inoffset + i + 3];
			out[outoffset + 6] |= ((val >>> 30));
			out[outoffset + 7] = ((val >> 16) & 0x3fff);
			out[outoffset + 8] = ((val >> 2) & 0x3fff);
			out[outoffset + 9] = (val << 12) & 0x3fff;

			val = in[inoffset + i + 4];
			out[outoffset + 9] |= ((val >>> 20));
			out[outoffset + 10] = ((val >> 6) & 0x3fff);
			out[outoffset + 11] = (val << 8) & 0x3fff;

			val = in[inoffset + i + 5];
			out[outoffset + 11] |= ((val >>> 24));
			out[outoffset + 12] = ((val >> 10) & 0x3fff);
			out[outoffset + 13] = (val << 4) & 0x3fff;

			val = in[inoffset + i + 6];
			out[outoffset + 13] |= ((val >>> 28));
			out[outoffset + 14] = ((val >> 14) & 0x3fff);
			out[outoffset + 15] = (val & 0x3fff);
		}
	}

	static final void CAFOR_UNPACK15(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 15, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 17));
			out[outoffset + 1] = ((val >> 2) & 0x7fff);
			out[outoffset + 2] = (val << 13) & 0x7fff;

			val = in[inoffset + i + 1];
			out[outoffset + 2] |= ((val >>> 19));
			out[outoffset + 3] = ((val >> 4) & 0x7fff);
			out[outoffset + 4] = (val << 11) & 0x7fff;

			val = in[inoffset + i + 2];
			out[outoffset + 4] |= ((val >>> 21));
			out[outoffset + 5] = ((val >> 6) & 0x7fff);
			out[outoffset + 6] = (val << 9) & 0x7fff;

			val = in[inoffset + i + 3];
			out[outoffset + 6] |= ((val >>> 23));
			out[outoffset + 7] = ((val >> 8) & 0x7fff);
			out[outoffset + 8] = (val << 7) & 0x7fff;

			val = in[inoffset + i + 4];
			out[outoffset + 8] |= ((val >>> 25));
			out[outoffset + 9] = ((val >> 10) & 0x7fff);
			out[outoffset + 10] = (val << 5) & 0x7fff;

			val = in[inoffset + i + 5];
			out[outoffset + 10] |= ((val >>> 27));
			out[outoffset + 11] = ((val >> 12) & 0x7fff);
			out[outoffset + 12] = (val << 3) & 0x7fff;

			val = in[inoffset + i + 6];
			out[outoffset + 12] |= ((val >>> 29));
			out[outoffset + 13] = ((val >> 14) & 0x7fff);
			out[outoffset + 14] = (val << 1) & 0x7fff;

			val = in[inoffset + i + 7];
			out[outoffset + 14] |= ((val >>> 31));
			out[outoffset + 15] = ((val >> 16) & 0x7fff);
			out[outoffset + 16] = ((val >> 1) & 0x7fff);
			out[outoffset + 17] = (val << 14) & 0x7fff;

			val = in[inoffset + i + 8];
			out[outoffset + 17] |= ((val >>> 18));
			out[outoffset + 18] = ((val >> 3) & 0x7fff);
			out[outoffset + 19] = (val << 12) & 0x7fff;

			val = in[inoffset + i + 9];
			out[outoffset + 19] |= ((val >>> 20));
			out[outoffset + 20] = ((val >> 5) & 0x7fff);
			out[outoffset + 21] = (val << 10) & 0x7fff;

			val = in[inoffset + i + 10];
			out[outoffset + 21] |= ((val >>> 22));
			out[outoffset + 22] = ((val >> 7) & 0x7fff);
			out[outoffset + 23] = (val << 8) & 0x7fff;

			val = in[inoffset + i + 11];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = ((val >> 9) & 0x7fff);
			out[outoffset + 25] = (val << 6) & 0x7fff;

			val = in[inoffset + i + 12];
			out[outoffset + 25] |= ((val >>> 26));
			out[outoffset + 26] = ((val >> 11) & 0x7fff);
			out[outoffset + 27] = (val << 4) & 0x7fff;

			val = in[inoffset + i + 13];
			out[outoffset + 27] |= ((val >>> 28));
			out[outoffset + 28] = ((val >> 13) & 0x7fff);
			out[outoffset + 29] = (val << 2) & 0x7fff;

			val = in[inoffset + i + 14];
			out[outoffset + 29] |= ((val >>> 30));
			out[outoffset + 30] = ((val >> 15) & 0x7fff);
			out[outoffset + 31] = (val & 0x7fff);
		}
	}

	static final void CAFOR_UNPACK16(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 2)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 16));
			out[outoffset + 1] = (val & 0xffff);
		}
	}

	static final void CAFOR_UNPACK17(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 17, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 15));
			out[outoffset + 1] = (val << 2) & 0x01ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 30));
			out[outoffset + 2] = ((val >> 13) & 0x01ffff);
			out[outoffset + 3] = (val << 4) & 0x01ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= ((val >>> 28));
			out[outoffset + 4] = ((val >> 11) & 0x01ffff);
			out[outoffset + 5] = (val << 6) & 0x01ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= ((val >>> 26));
			out[outoffset + 6] = ((val >> 9) & 0x01ffff);
			out[outoffset + 7] = (val << 8) & 0x01ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = ((val >> 7) & 0x01ffff);
			out[outoffset + 9] = (val << 10) & 0x01ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 9] |= ((val >>> 22));
			out[outoffset + 10] = ((val >> 5) & 0x01ffff);
			out[outoffset + 11] = (val << 12) & 0x01ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 11] |= ((val >>> 20));
			out[outoffset + 12] = ((val >> 3) & 0x01ffff);
			out[outoffset + 13] = (val << 14) & 0x01ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 13] |= ((val >>> 18));
			out[outoffset + 14] = ((val >> 1) & 0x01ffff);
			out[outoffset + 15] = (val << 16) & 0x01ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 1) & 0x01ffff;

			val = in[inoffset + i + 9];
			out[outoffset + 16] |= ((val >>> 31));
			out[outoffset + 17] = ((val >> 14) & 0x01ffff);
			out[outoffset + 18] = (val << 3) & 0x01ffff;

			val = in[inoffset + i + 10];
			out[outoffset + 18] |= ((val >>> 29));
			out[outoffset + 19] = ((val >> 12) & 0x01ffff);
			out[outoffset + 20] = (val << 5) & 0x01ffff;

			val = in[inoffset + i + 11];
			out[outoffset + 20] |= ((val >>> 27));
			out[outoffset + 21] = ((val >> 10) & 0x01ffff);
			out[outoffset + 22] = (val << 7) & 0x01ffff;

			val = in[inoffset + i + 12];
			out[outoffset + 22] |= ((val >>> 25));
			out[outoffset + 23] = ((val >> 8) & 0x01ffff);
			out[outoffset + 24] = (val << 9) & 0x01ffff;

			val = in[inoffset + i + 13];
			out[outoffset + 24] |= ((val >>> 23));
			out[outoffset + 25] = ((val >> 6) & 0x01ffff);
			out[outoffset + 26] = (val << 11) & 0x01ffff;

			val = in[inoffset + i + 14];
			out[outoffset + 26] |= ((val >>> 21));
			out[outoffset + 27] = ((val >> 4) & 0x01ffff);
			out[outoffset + 28] = (val << 13) & 0x01ffff;

			val = in[inoffset + i + 15];
			out[outoffset + 28] |= ((val >>> 19));
			out[outoffset + 29] = ((val >> 2) & 0x01ffff);
			out[outoffset + 30] = (val << 15) & 0x01ffff;

			val = in[inoffset + i + 16];
			out[outoffset + 30] |= ((val >>> 17));
			out[outoffset + 31] = (val & 0x01ffff);
		}
	}

	static final void CAFOR_UNPACK18(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 9, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 14));
			out[outoffset + 1] = (val << 4) & 0x03ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 28));
			out[outoffset + 2] = ((val >> 10) & 0x03ffff);
			out[outoffset + 3] = (val << 8) & 0x03ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= ((val >>> 24));
			out[outoffset + 4] = ((val >> 6) & 0x03ffff);
			out[outoffset + 5] = (val << 12) & 0x03ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= ((val >>> 20));
			out[outoffset + 6] = ((val >> 2) & 0x03ffff);
			out[outoffset + 7] = (val << 16) & 0x03ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 7] |= ((val >>> 16));
			out[outoffset + 8] = (val << 2) & 0x03ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 8] |= ((val >>> 30));
			out[outoffset + 9] = ((val >> 12) & 0x03ffff);
			out[outoffset + 10] = (val << 6) & 0x03ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 10] |= ((val >>> 26));
			out[outoffset + 11] = ((val >> 8) & 0x03ffff);
			out[outoffset + 12] = (val << 10) & 0x03ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 12] |= ((val >>> 22));
			out[outoffset + 13] = ((val >> 4) & 0x03ffff);
			out[outoffset + 14] = (val << 14) & 0x03ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 14] |= ((val >>> 18));
			out[outoffset + 15] = (val & 0x03ffff);
		}
	}

	static final void CAFOR_UNPACK19(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 19, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 13));
			out[outoffset + 1] = (val << 6) & 0x07ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 26));
			out[outoffset + 2] = ((val >> 7) & 0x07ffff);
			out[outoffset + 3] = (val << 12) & 0x07ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= ((val >>> 20));
			out[outoffset + 4] = ((val >> 1) & 0x07ffff);
			out[outoffset + 5] = (val << 18) & 0x07ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= ((val >>> 14));
			out[outoffset + 6] = (val << 5) & 0x07ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= ((val >>> 27));
			out[outoffset + 7] = ((val >> 8) & 0x07ffff);
			out[outoffset + 8] = (val << 11) & 0x07ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 8] |= ((val >>> 21));
			out[outoffset + 9] = ((val >> 2) & 0x07ffff);
			out[outoffset + 10] = (val << 17) & 0x07ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 10] |= ((val >>> 15));
			out[outoffset + 11] = (val << 4) & 0x07ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 11] |= ((val >>> 28));
			out[outoffset + 12] = ((val >> 9) & 0x07ffff);
			out[outoffset + 13] = (val << 10) & 0x07ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 13] |= ((val >>> 22));
			out[outoffset + 14] = ((val >> 3) & 0x07ffff);
			out[outoffset + 15] = (val << 16) & 0x07ffff;

			val = in[inoffset + i + 9];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 3) & 0x07ffff;

			val = in[inoffset + i + 10];
			out[outoffset + 16] |= ((val >>> 29));
			out[outoffset + 17] = ((val >> 10) & 0x07ffff);
			out[outoffset + 18] = (val << 9) & 0x07ffff;

			val = in[inoffset + i + 11];
			out[outoffset + 18] |= ((val >>> 23));
			out[outoffset + 19] = ((val >> 4) & 0x07ffff);
			out[outoffset + 20] = (val << 15) & 0x07ffff;

			val = in[inoffset + i + 12];
			out[outoffset + 20] |= ((val >>> 17));
			out[outoffset + 21] = (val << 2) & 0x07ffff;

			val = in[inoffset + i + 13];
			out[outoffset + 21] |= ((val >>> 30));
			out[outoffset + 22] = ((val >> 11) & 0x07ffff);
			out[outoffset + 23] = (val << 8) & 0x07ffff;

			val = in[inoffset + i + 14];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = ((val >> 5) & 0x07ffff);
			out[outoffset + 25] = (val << 14) & 0x07ffff;

			val = in[inoffset + i + 15];
			out[outoffset + 25] |= ((val >>> 18));
			out[outoffset + 26] = (val << 1) & 0x07ffff;

			val = in[inoffset + i + 16];
			out[outoffset + 26] |= ((val >>> 31));
			out[outoffset + 27] = ((val >> 12) & 0x07ffff);
			out[outoffset + 28] = (val << 7) & 0x07ffff;

			val = in[inoffset + i + 17];
			out[outoffset + 28] |= ((val >>> 25));
			out[outoffset + 29] = ((val >> 6) & 0x07ffff);
			out[outoffset + 30] = (val << 13) & 0x07ffff;

			val = in[inoffset + i + 18];
			out[outoffset + 30] |= ((val >>> 19));
			out[outoffset + 31] = (val & 0x07ffff);
		}
	}

	static final void CAFOR_UNPACK20(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 12));
			out[outoffset + 1] = (val << 8) & 0x0fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 24));
			out[outoffset + 2] = ((val >> 4) & 0x0fffff);
			out[outoffset + 3] = (val << 16) & 0x0fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= ((val >>> 16));
			out[outoffset + 4] = (val << 4) & 0x0fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= ((val >>> 28));
			out[outoffset + 5] = ((val >> 8) & 0x0fffff);
			out[outoffset + 6] = (val << 12) & 0x0fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= ((val >>> 20));
			out[outoffset + 7] = (val & 0x0fffff);
		}
	}

	static final void CAFOR_UNPACK21(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 21, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 11));
			out[outoffset + 1] = (val << 10) & 0x1fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 22));
			out[outoffset + 2] = ((val >> 1) & 0x1fffff);
			out[outoffset + 3] = (val << 20) & 0x1fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= ((val >>> 12));
			out[outoffset + 4] = (val << 9) & 0x1fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= ((val >>> 23));
			out[outoffset + 5] = ((val >> 2) & 0x1fffff);
			out[outoffset + 6] = (val << 19) & 0x1fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= ((val >>> 13));
			out[outoffset + 7] = (val << 8) & 0x1fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = ((val >> 3) & 0x1fffff);
			out[outoffset + 9] = (val << 18) & 0x1fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 9] |= ((val >>> 14));
			out[outoffset + 10] = (val << 7) & 0x1fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 10] |= ((val >>> 25));
			out[outoffset + 11] = ((val >> 4) & 0x1fffff);
			out[outoffset + 12] = (val << 17) & 0x1fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 12] |= ((val >>> 15));
			out[outoffset + 13] = (val << 6) & 0x1fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 13] |= ((val >>> 26));
			out[outoffset + 14] = ((val >> 5) & 0x1fffff);
			out[outoffset + 15] = (val << 16) & 0x1fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 5) & 0x1fffff;

			val = in[inoffset + i + 11];
			out[outoffset + 16] |= ((val >>> 27));
			out[outoffset + 17] = ((val >> 6) & 0x1fffff);
			out[outoffset + 18] = (val << 15) & 0x1fffff;

			val = in[inoffset + i + 12];
			out[outoffset + 18] |= ((val >>> 17));
			out[outoffset + 19] = (val << 4) & 0x1fffff;

			val = in[inoffset + i + 13];
			out[outoffset + 19] |= ((val >>> 28));
			out[outoffset + 20] = ((val >> 7) & 0x1fffff);
			out[outoffset + 21] = (val << 14) & 0x1fffff;

			val = in[inoffset + i + 14];
			out[outoffset + 21] |= ((val >>> 18));
			out[outoffset + 22] = (val << 3) & 0x1fffff;

			val = in[inoffset + i + 15];
			out[outoffset + 22] |= ((val >>> 29));
			out[outoffset + 23] = ((val >> 8) & 0x1fffff);
			out[outoffset + 24] = (val << 13) & 0x1fffff;

			val = in[inoffset + i + 16];
			out[outoffset + 24] |= ((val >>> 19));
			out[outoffset + 25] = (val << 2) & 0x1fffff;

			val = in[inoffset + i + 17];
			out[outoffset + 25] |= ((val >>> 30));
			out[outoffset + 26] = ((val >> 9) & 0x1fffff);
			out[outoffset + 27] = (val << 12) & 0x1fffff;

			val = in[inoffset + i + 18];
			out[outoffset + 27] |= ((val >>> 20));
			out[outoffset + 28] = (val << 1) & 0x1fffff;

			val = in[inoffset + i + 19];
			out[outoffset + 28] |= ((val >>> 31));
			out[outoffset + 29] = ((val >> 10) & 0x1fffff);
			out[outoffset + 30] = (val << 11) & 0x1fffff;

			val = in[inoffset + i + 20];
			out[outoffset + 30] |= ((val >>> 21));
			out[outoffset + 31] = (val & 0x1fffff);
		}
	}

	static final void CAFOR_UNPACK22(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 11, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 10));
			out[outoffset + 1] = (val << 12) & 0x3fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 20));
			out[outoffset + 2] = (val << 2) & 0x3fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 30));
			out[outoffset + 3] = ((val >> 8) & 0x3fffff);
			out[outoffset + 4] = (val << 14) & 0x3fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= ((val >>> 18));
			out[outoffset + 5] = (val << 4) & 0x3fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= ((val >>> 28));
			out[outoffset + 6] = ((val >> 6) & 0x3fffff);
			out[outoffset + 7] = (val << 16) & 0x3fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 7] |= ((val >>> 16));
			out[outoffset + 8] = (val << 6) & 0x3fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 8] |= ((val >>> 26));
			out[outoffset + 9] = ((val >> 4) & 0x3fffff);
			out[outoffset + 10] = (val << 18) & 0x3fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 10] |= ((val >>> 14));
			out[outoffset + 11] = (val << 8) & 0x3fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 11] |= ((val >>> 24));
			out[outoffset + 12] = ((val >> 2) & 0x3fffff);
			out[outoffset + 13] = (val << 20) & 0x3fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 13] |= ((val >>> 12));
			out[outoffset + 14] = (val << 10) & 0x3fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 14] |= ((val >>> 22));
			out[outoffset + 15] = (val & 0x3fffff);
		}
	}

	static final void CAFOR_UNPACK23(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 23, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 9));
			out[outoffset + 1] = (val << 14) & 0x7fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 18));
			out[outoffset + 2] = (val << 5) & 0x7fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 27));
			out[outoffset + 3] = ((val >> 4) & 0x7fffff);
			out[outoffset + 4] = (val << 19) & 0x7fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= ((val >>> 13));
			out[outoffset + 5] = (val << 10) & 0x7fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= ((val >>> 22));
			out[outoffset + 6] = (val << 1) & 0x7fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= ((val >>> 31));
			out[outoffset + 7] = ((val >> 8) & 0x7fffff);
			out[outoffset + 8] = (val << 15) & 0x7fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 8] |= ((val >>> 17));
			out[outoffset + 9] = (val << 6) & 0x7fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 9] |= ((val >>> 26));
			out[outoffset + 10] = ((val >> 3) & 0x7fffff);
			out[outoffset + 11] = (val << 20) & 0x7fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 11] |= ((val >>> 12));
			out[outoffset + 12] = (val << 11) & 0x7fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 12] |= ((val >>> 21));
			out[outoffset + 13] = (val << 2) & 0x7fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 13] |= ((val >>> 30));
			out[outoffset + 14] = ((val >> 7) & 0x7fffff);
			out[outoffset + 15] = (val << 16) & 0x7fffff;

			val = in[inoffset + i + 11];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 7) & 0x7fffff;

			val = in[inoffset + i + 12];
			out[outoffset + 16] |= ((val >>> 25));
			out[outoffset + 17] = ((val >> 2) & 0x7fffff);
			out[outoffset + 18] = (val << 21) & 0x7fffff;

			val = in[inoffset + i + 13];
			out[outoffset + 18] |= ((val >>> 11));
			out[outoffset + 19] = (val << 12) & 0x7fffff;

			val = in[inoffset + i + 14];
			out[outoffset + 19] |= ((val >>> 20));
			out[outoffset + 20] = (val << 3) & 0x7fffff;

			val = in[inoffset + i + 15];
			out[outoffset + 20] |= ((val >>> 29));
			out[outoffset + 21] = ((val >> 6) & 0x7fffff);
			out[outoffset + 22] = (val << 17) & 0x7fffff;

			val = in[inoffset + i + 16];
			out[outoffset + 22] |= ((val >>> 15));
			out[outoffset + 23] = (val << 8) & 0x7fffff;

			val = in[inoffset + i + 17];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = ((val >> 1) & 0x7fffff);
			out[outoffset + 25] = (val << 22) & 0x7fffff;

			val = in[inoffset + i + 18];
			out[outoffset + 25] |= ((val >>> 10));
			out[outoffset + 26] = (val << 13) & 0x7fffff;

			val = in[inoffset + i + 19];
			out[outoffset + 26] |= ((val >>> 19));
			out[outoffset + 27] = (val << 4) & 0x7fffff;

			val = in[inoffset + i + 20];
			out[outoffset + 27] |= ((val >>> 28));
			out[outoffset + 28] = ((val >> 5) & 0x7fffff);
			out[outoffset + 29] = (val << 18) & 0x7fffff;

			val = in[inoffset + i + 21];
			out[outoffset + 29] |= ((val >>> 14));
			out[outoffset + 30] = (val << 9) & 0x7fffff;

			val = in[inoffset + i + 22];
			out[outoffset + 30] |= ((val >>> 23));
			out[outoffset + 31] = (val & 0x7fffff);
		}
	}

	static final void CAFOR_UNPACK24(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 4)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 8));
			out[outoffset + 1] = (val << 16) & 0xffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 16));
			out[outoffset + 2] = (val << 8) & 0xffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 24));
			out[outoffset + 3] = (val & 0xffffff);
		}
	}

	static final void CAFOR_UNPACK25(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 25, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 7));
			out[outoffset + 1] = (val << 18) & 0x01ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 14));
			out[outoffset + 2] = (val << 11) & 0x01ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 21));
			out[outoffset + 3] = (val << 4) & 0x01ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 28));
			out[outoffset + 4] = ((val >> 3) & 0x01ffffff);
			out[outoffset + 5] = (val << 22) & 0x01ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= ((val >>> 10));
			out[outoffset + 6] = (val << 15) & 0x01ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= ((val >>> 17));
			out[outoffset + 7] = (val << 8) & 0x01ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = (val << 1) & 0x01ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= ((val >>> 31));
			out[outoffset + 9] = ((val >> 6) & 0x01ffffff);
			out[outoffset + 10] = (val << 19) & 0x01ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 10] |= ((val >>> 13));
			out[outoffset + 11] = (val << 12) & 0x01ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 11] |= ((val >>> 20));
			out[outoffset + 12] = (val << 5) & 0x01ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 12] |= ((val >>> 27));
			out[outoffset + 13] = (((val >> 2) & 0x01ffffff));
			out[outoffset + 14] = (val << 23) & 0x01ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 14] |= ((val >>> 9));
			out[outoffset + 15] = (val << 16) & 0x01ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 9) & 0x01ffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 16] |= ((val >>> 23));
			out[outoffset + 17] = (val << 2) & 0x01ffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 17] |= ((val >>> 30));
			out[outoffset + 18] = ((val >> 5) & 0x01ffffff);
			out[outoffset + 19] = (val << 20) & 0x01ffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 19] |= ((val >>> 12));
			out[outoffset + 20] = (val << 13) & 0x01ffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 20] |= ((val >>> 19));
			out[outoffset + 21] = (val << 6) & 0x01ffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 21] |= ((val >>> 26));
			out[outoffset + 22] = ((val >> 1) & 0x01ffffff);
			out[outoffset + 23] = (val << 24) & 0x01ffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 23] |= ((val >>> 8));
			out[outoffset + 24] = (val << 17) & 0x01ffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 24] |= ((val >>> 15));
			out[outoffset + 25] = (val << 10) & 0x01ffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 25] |= ((val >>> 22));
			out[outoffset + 26] = (val << 3) & 0x01ffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 26] |= ((val >>> 29));
			out[outoffset + 27] = ((val >> 4) & 0x01ffffff);
			out[outoffset + 28] = (val << 21) & 0x01ffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 28] |= ((val >>> 11));
			out[outoffset + 29] = (val << 14) & 0x01ffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 29] |= ((val >>> 18));
			out[outoffset + 30] = (val << 7) & 0x01ffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 30] |= ((val >>> 25));
			out[outoffset + 31] = (val & 0x01ffffff);
		}
	}

	static final void CAFOR_UNPACK26(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 13, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 6));
			out[outoffset + 1] = (val << 20) & 0x03ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 12));
			out[outoffset + 2] = (val << 14) & 0x03ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 18));
			out[outoffset + 3] = (val << 8) & 0x03ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 24));
			out[outoffset + 4] = (val << 2) & 0x03ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 30));
			out[outoffset + 5] = ((val >> 4) & 0x03ffffff);
			out[outoffset + 6] = (val << 22) & 0x03ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= ((val >>> 10));
			out[outoffset + 7] = (val << 16) & 0x03ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= ((val >>> 16));
			out[outoffset + 8] = (val << 10) & 0x03ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= ((val >>> 22));
			out[outoffset + 9] = (val << 4) & 0x03ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 9] |= ((val >>> 28));
			out[outoffset + 10] = ((val >> 2) & 0x03ffffff);
			out[outoffset + 11] = (val << 24) & 0x03ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 11] |= ((val >>> 8));
			out[outoffset + 12] = (val << 18) & 0x03ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 12] |= ((val >>> 14));
			out[outoffset + 13] = (val << 12) & 0x03ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 13] |= ((val >>> 20));
			out[outoffset + 14] = (val << 6) & 0x03ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 14] |= ((val >>> 26));
			out[outoffset + 15] = (val & 0x03ffffff);
		}
	}

	static final void CAFOR_UNPACK27(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 27, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 5));
			out[outoffset + 1] = (val << 22) & 0x07ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 10));
			out[outoffset + 2] = (val << 17) & 0x07ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 15));
			out[outoffset + 3] = (val << 12) & 0x07ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 20));
			out[outoffset + 4] = (val << 7) & 0x07ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 25));
			out[outoffset + 5] = (val << 2) & 0x07ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= ((val >>> 30));
			out[outoffset + 6] = ((val >> 3) & 0x07ffffff);
			out[outoffset + 7] = (val << 24) & 0x07ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= ((val >>> 8));
			out[outoffset + 8] = (val << 19) & 0x07ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= ((val >>> 13));
			out[outoffset + 9] = (val << 14) & 0x07ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 9] |= ((val >>> 18));
			out[outoffset + 10] = (val << 9) & 0x07ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 10] |= ((val >>> 23));
			out[outoffset + 11] = (val << 4) & 0x07ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 11] |= ((val >>> 28));
			out[outoffset + 12] = ((val >> 1) & 0x07ffffff);
			out[outoffset + 13] = (val << 26) & 0x07ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 13] |= ((val >>> 6));
			out[outoffset + 14] = (val << 21) & 0x07ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 14] |= ((val >>> 11));
			out[outoffset + 15] = (val << 16) & 0x07ffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 11) & 0x07ffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 16] |= ((val >>> 21));
			out[outoffset + 17] = (val << 6) & 0x07ffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 17] |= ((val >>> 26));
			out[outoffset + 18] = (val << 1) & 0x07ffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 18] |= ((val >>> 31));
			out[outoffset + 19] = ((val >> 4) & 0x07ffffff);
			out[outoffset + 20] = (val << 23) & 0x07ffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 20] |= ((val >>> 9));
			out[outoffset + 21] = (val << 18) & 0x07ffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 21] |= ((val >>> 14));
			out[outoffset + 22] = (val << 13) & 0x07ffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 22] |= ((val >>> 19));
			out[outoffset + 23] = (val << 8) & 0x07ffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = (val << 3) & 0x07ffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 24] |= ((val >>> 29));
			out[outoffset + 25] = ((val >> 2) & 0x07ffffff);
			out[outoffset + 26] = (val << 25) & 0x07ffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 26] |= ((val >>> 7));
			out[outoffset + 27] = (val << 20) & 0x07ffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 27] |= ((val >>> 12));
			out[outoffset + 28] = (val << 15) & 0x07ffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 28] |= ((val >>> 17));
			out[outoffset + 29] = (val << 10) & 0x07ffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 29] |= ((val >>> 22));
			out[outoffset + 30] = (val << 5) & 0x07ffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 30] |= ((val >>> 27));
			out[outoffset + 31] = (val & 0x07ffffff);
		}
	}

	static final void CAFOR_UNPACK28(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 4));
			out[outoffset + 1] = (val << 24) & 0x0fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 8));
			out[outoffset + 2] = (val << 20) & 0x0fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 12));
			out[outoffset + 3] = (val << 16) & 0x0fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 16));
			out[outoffset + 4] = (val << 12) & 0x0fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 20));
			out[outoffset + 5] = (val << 8) & 0x0fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= ((val >>> 24));
			out[outoffset + 6] = (val << 4) & 0x0fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= ((val >>> 28));
			out[outoffset + 7] = (val & 0x0fffffff);
		}
	}

	static final void CAFOR_UNPACK29(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 29, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 3));
			out[outoffset + 1] = (val << 26) & 0x1fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 6));
			out[outoffset + 2] = (val << 23) & 0x1fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 9));
			out[outoffset + 3] = (val << 20) & 0x1fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 12));
			out[outoffset + 4] = (val << 17) & 0x1fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 15));
			out[outoffset + 5] = (val << 14) & 0x1fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= ((val >>> 18));
			out[outoffset + 6] = (val << 11) & 0x1fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= ((val >>> 21));
			out[outoffset + 7] = (val << 8) & 0x1fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= ((val >>> 24));
			out[outoffset + 8] = (val << 5) & 0x1fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= ((val >>> 27));
			out[outoffset + 9] = (val << 2) & 0x1fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= ((val >>> 30));
			out[outoffset + 10] = ((val >> 1) & 0x1fffffff);
			out[outoffset + 11] = (val << 28) & 0x1fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 11] |= ((val >>> 4));
			out[outoffset + 12] = (val << 25) & 0x1fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 12] |= ((val >>> 7));
			out[outoffset + 13] = (val << 22) & 0x1fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 13] |= ((val >>> 10));
			out[outoffset + 14] = (val << 19) & 0x1fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 14] |= ((val >>> 13));
			out[outoffset + 15] = (val << 16) & 0x1fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 13) & 0x1fffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 16] |= ((val >>> 19));
			out[outoffset + 17] = (val << 10) & 0x1fffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 17] |= ((val >>> 22));
			out[outoffset + 18] = (val << 7) & 0x1fffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 18] |= ((val >>> 25));
			out[outoffset + 19] = (val << 4) & 0x1fffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 19] |= ((val >>> 28));
			out[outoffset + 20] = (val << 1) & 0x1fffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 20] |= ((val >>> 31));
			out[outoffset + 21] = ((val >> 2) & 0x1fffffff);
			out[outoffset + 22] = (val << 27) & 0x1fffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 22] |= ((val >>> 5));
			out[outoffset + 23] = (val << 24) & 0x1fffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 23] |= ((val >>> 8));
			out[outoffset + 24] = (val << 21) & 0x1fffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 24] |= ((val >>> 11));
			out[outoffset + 25] = (val << 18) & 0x1fffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 25] |= ((val >>> 14));
			out[outoffset + 26] = (val << 15) & 0x1fffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 26] |= ((val >>> 17));
			out[outoffset + 27] = (val << 12) & 0x1fffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 27] |= ((val >>> 20));
			out[outoffset + 28] = (val << 9) & 0x1fffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 28] |= ((val >>> 23));
			out[outoffset + 29] = (val << 6) & 0x1fffffff;

			val = in[inoffset + i + 27];
			out[outoffset + 29] |= ((val >>> 26));
			out[outoffset + 30] = (val << 3) & 0x1fffffff;

			val = in[inoffset + i + 28];
			out[outoffset + 30] |= ((val >>> 29));
			out[outoffset + 31] = (val & 0x1fffffff);
		}
	}

	static final void CAFOR_UNPACK30(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 15, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 2));
			out[outoffset + 1] = (val << 28) & 0x3fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 4));
			out[outoffset + 2] = (val << 26) & 0x3fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 6));
			out[outoffset + 3] = (val << 24) & 0x3fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 8));
			out[outoffset + 4] = (val << 22) & 0x3fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 10));
			out[outoffset + 5] = (val << 20) & 0x3fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= ((val >>> 12));
			out[outoffset + 6] = (val << 18) & 0x3fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= ((val >>> 14));
			out[outoffset + 7] = (val << 16) & 0x3fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= ((val >>> 16));
			out[outoffset + 8] = (val << 14) & 0x3fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= ((val >>> 18));
			out[outoffset + 9] = (val << 12) & 0x3fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= ((val >>> 20));
			out[outoffset + 10] = (val << 10) & 0x3fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 10] |= ((val >>> 22));
			out[outoffset + 11] = (val << 8) & 0x3fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 11] |= ((val >>> 24));
			out[outoffset + 12] = (val << 6) & 0x3fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 12] |= ((val >>> 26));
			out[outoffset + 13] = (val << 4) & 0x3fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 13] |= ((val >>> 28));
			out[outoffset + 14] = (val << 2) & 0x3fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 14] |= ((val >>> 30));
			out[outoffset + 15] = (val & 0x3fffffff);
		}
	}

	static final void CAFOR_UNPACK31(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 31, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = ((val >>> 1));
			out[outoffset + 1] = (val << 30) & 0x7fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= ((val >>> 2));
			out[outoffset + 2] = (val << 29) & 0x7fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= ((val >>> 3));
			out[outoffset + 3] = (val << 28) & 0x7fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= ((val >>> 4));
			out[outoffset + 4] = (val << 27) & 0x7fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= ((val >>> 5));
			out[outoffset + 5] = (val << 26) & 0x7fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= ((val >>> 6));
			out[outoffset + 6] = (val << 25) & 0x7fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= ((val >>> 7));
			out[outoffset + 7] = (val << 24) & 0x7fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= ((val >>> 8));
			out[outoffset + 8] = (val << 23) & 0x7fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= ((val >>> 9));
			out[outoffset + 9] = (val << 22) & 0x7fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= ((val >>> 10));
			out[outoffset + 10] = (val << 21) & 0x7fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 10] |= ((val >>> 11));
			out[outoffset + 11] = (val << 20) & 0x7fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 11] |= ((val >>> 12));
			out[outoffset + 12] = (val << 19) & 0x7fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 12] |= ((val >>> 13));
			out[outoffset + 13] = (val << 18) & 0x7fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 13] |= ((val >>> 14));
			out[outoffset + 14] = (val << 17) & 0x7fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 14] |= ((val >>> 15));
			out[outoffset + 15] = (val << 16) & 0x7fffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 15] |= ((val >>> 16));
			out[outoffset + 16] = (val << 15) & 0x7fffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 16] |= ((val >>> 17));
			out[outoffset + 17] = (val << 14) & 0x7fffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 17] |= ((val >>> 18));
			out[outoffset + 18] = (val << 13) & 0x7fffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 18] |= ((val >>> 19));
			out[outoffset + 19] = (val << 12) & 0x7fffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 19] |= ((val >>> 20));
			out[outoffset + 20] = (val << 11) & 0x7fffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 20] |= ((val >>> 21));
			out[outoffset + 21] = (val << 10) & 0x7fffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 21] |= ((val >>> 22));
			out[outoffset + 22] = (val << 9) & 0x7fffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 22] |= ((val >>> 23));
			out[outoffset + 23] = (val << 8) & 0x7fffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 23] |= ((val >>> 24));
			out[outoffset + 24] = (val << 7) & 0x7fffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 24] |= ((val >>> 25));
			out[outoffset + 25] = (val << 6) & 0x7fffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 25] |= ((val >>> 26));
			out[outoffset + 26] = (val << 5) & 0x7fffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 26] |= ((val >>> 27));
			out[outoffset + 27] = (val << 4) & 0x7fffffff;

			val = in[inoffset + i + 27];
			out[outoffset + 27] |= ((val >>> 28));
			out[outoffset + 28] = (val << 3) & 0x7fffffff;

			val = in[inoffset + i + 28];
			out[outoffset + 28] |= ((val >>> 29));
			out[outoffset + 29] = (val << 2) & 0x7fffffff;

			val = in[inoffset + i + 29];
			out[outoffset + 29] |= ((val >>> 30));
			out[outoffset + 30] = (val << 1) & 0x7fffffff;

			val = in[inoffset + i + 30];
			out[outoffset + 30] |= ((val >>> 31));
			out[outoffset + 31] = (val & 0x7fffffff);
		}
	}

	static final void CAFOR_UNPACK32(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		// bug,这里应该是源代码存在的错误，"i+=32"应该是不对的，i+=1才是
		for (int i = 0; i < bs; i += 1, outoffset += 1)
			out[outoffset + 0] = in[inoffset + i];
	}

	/**
	 * 
	 * @param option
	 *            legitimate values range from 1 to 32
	 * @param out
	 * @param outoffset
	 * @param in
	 * @param inoffset
	 * @param bs
	 */
	public static void CAFOR_UNPACK(int option, int[] out, int outoffset,
	        final int[] in, int inoffset, int bs)
	{
		switch (option)
		{
			case 1:
				CAFOR_UNPACK1(out, outoffset, in, inoffset, bs);
				break;
			case 2:
				CAFOR_UNPACK2(out, outoffset, in, inoffset, bs);
				break;
			case 3:
				CAFOR_UNPACK3(out, outoffset, in, inoffset, bs);
				break;
			case 4:
				CAFOR_UNPACK4(out, outoffset, in, inoffset, bs);
				break;
			case 5:
				CAFOR_UNPACK5(out, outoffset, in, inoffset, bs);
				break;
			case 6:
				CAFOR_UNPACK6(out, outoffset, in, inoffset, bs);
				break;
			case 7:
				CAFOR_UNPACK7(out, outoffset, in, inoffset, bs);
				break;
			case 8:
				CAFOR_UNPACK8(out, outoffset, in, inoffset, bs);
				break;
			case 9:
				CAFOR_UNPACK9(out, outoffset, in, inoffset, bs);
				break;
			case 10:
				CAFOR_UNPACK10(out, outoffset, in, inoffset, bs);
				break;
			case 11:
				CAFOR_UNPACK11(out, outoffset, in, inoffset, bs);
				break;
			case 12:
				CAFOR_UNPACK12(out, outoffset, in, inoffset, bs);
				break;
			case 13:
				CAFOR_UNPACK13(out, outoffset, in, inoffset, bs);
				break;
			case 14:
				CAFOR_UNPACK14(out, outoffset, in, inoffset, bs);
				break;
			case 15:
				CAFOR_UNPACK15(out, outoffset, in, inoffset, bs);
				break;
			case 16:
				CAFOR_UNPACK16(out, outoffset, in, inoffset, bs);
				break;
			case 17:
				CAFOR_UNPACK17(out, outoffset, in, inoffset, bs);
				break;
			case 18:
				CAFOR_UNPACK18(out, outoffset, in, inoffset, bs);
				break;
			case 19:
				CAFOR_UNPACK19(out, outoffset, in, inoffset, bs);
				break;
			case 20:
				CAFOR_UNPACK20(out, outoffset, in, inoffset, bs);
				break;
			case 21:
				CAFOR_UNPACK21(out, outoffset, in, inoffset, bs);
				break;
			case 22:
				CAFOR_UNPACK22(out, outoffset, in, inoffset, bs);
				break;
			case 23:
				CAFOR_UNPACK23(out, outoffset, in, inoffset, bs);
				break;
			case 24:
				CAFOR_UNPACK24(out, outoffset, in, inoffset, bs);
				break;
			case 25:
				CAFOR_UNPACK25(out, outoffset, in, inoffset, bs);
				break;
			case 26:
				CAFOR_UNPACK26(out, outoffset, in, inoffset, bs);
				break;
			case 27:
				CAFOR_UNPACK27(out, outoffset, in, inoffset, bs);
				break;
			case 28:
				CAFOR_UNPACK28(out, outoffset, in, inoffset, bs);
				break;
			case 29:
				CAFOR_UNPACK29(out, outoffset, in, inoffset, bs);
				break;
			case 30:
				CAFOR_UNPACK30(out, outoffset, in, inoffset, bs);
				break;
			case 31:
				CAFOR_UNPACK31(out, outoffset, in, inoffset, bs);
				break;
			case 32:
				CAFOR_UNPACK32(out, outoffset, in, inoffset, bs);
				break;

			default:
				System.err.println("invalid arguments!");
				break;
		}
	}

}