package com.song.vse;

public class VSE_R_CONSTANT
{
	static final void VSER_UNPACK1(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 1) | ((val >>> 31));
			out[outoffset + 1] = (1 << 1) | ((val >> 30) & 0x01);
			out[outoffset + 2] = (1 << 1) | ((val >> 29) & 0x01);
			out[outoffset + 3] = (1 << 1) | ((val >> 28) & 0x01);
			out[outoffset + 4] = (1 << 1) | ((val >> 27) & 0x01);
			out[outoffset + 5] = (1 << 1) | ((val >> 26) & 0x01);
			out[outoffset + 6] = (1 << 1) | ((val >> 25) & 0x01);
			out[outoffset + 7] = (1 << 1) | ((val >> 24) & 0x01);
			out[outoffset + 8] = (1 << 1) | ((val >> 23) & 0x01);
			out[outoffset + 9] = (1 << 1) | ((val >> 22) & 0x01);
			out[outoffset + 10] = (1 << 1) | ((val >> 21) & 0x01);
			out[outoffset + 11] = (1 << 1) | ((val >> 20) & 0x01);
			out[outoffset + 12] = (1 << 1) | ((val >> 19) & 0x01);
			out[outoffset + 13] = (1 << 1) | ((val >> 18) & 0x01);
			out[outoffset + 14] = (1 << 1) | ((val >> 17) & 0x01);
			out[outoffset + 15] = (1 << 1) | ((val >> 16) & 0x01);
			out[outoffset + 16] = (1 << 1) | ((val >> 15) & 0x01);
			out[outoffset + 17] = (1 << 1) | ((val >> 14) & 0x01);
			out[outoffset + 18] = (1 << 1) | ((val >> 13) & 0x01);
			out[outoffset + 19] = (1 << 1) | ((val >> 12) & 0x01);
			out[outoffset + 20] = (1 << 1) | ((val >> 11) & 0x01);
			out[outoffset + 21] = (1 << 1) | ((val >> 10) & 0x01);
			out[outoffset + 22] = (1 << 1) | ((val >> 9) & 0x01);
			out[outoffset + 23] = (1 << 1) | ((val >> 8) & 0x01);
			out[outoffset + 24] = (1 << 1) | ((val >> 7) & 0x01);
			out[outoffset + 25] = (1 << 1) | ((val >> 6) & 0x01);
			out[outoffset + 26] = (1 << 1) | ((val >> 5) & 0x01);
			out[outoffset + 27] = (1 << 1) | ((val >> 4) & 0x01);
			out[outoffset + 28] = (1 << 1) | ((val >> 3) & 0x01);
			out[outoffset + 29] = (1 << 1) | ((val >> 2) & 0x01);
			out[outoffset + 30] = (1 << 1) | ((val >> 1) & 0x01);
			out[outoffset + 31] = (1 << 1) | (val & 0x01);
		}
	}

	static final void VSER_UNPACK2(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 2) | ((val >>> 30));
			out[outoffset + 1] = (1 << 2) | ((val >> 28) & 0x03);
			out[outoffset + 2] = (1 << 2) | ((val >> 26) & 0x03);
			out[outoffset + 3] = (1 << 2) | ((val >> 24) & 0x03);
			out[outoffset + 4] = (1 << 2) | ((val >> 22) & 0x03);
			out[outoffset + 5] = (1 << 2) | ((val >> 20) & 0x03);
			out[outoffset + 6] = (1 << 2) | ((val >> 18) & 0x03);
			out[outoffset + 7] = (1 << 2) | ((val >> 16) & 0x03);
			out[outoffset + 8] = (1 << 2) | ((val >> 14) & 0x03);
			out[outoffset + 9] = (1 << 2) | ((val >> 12) & 0x03);
			out[outoffset + 10] = (1 << 2) | ((val >> 10) & 0x03);
			out[outoffset + 11] = (1 << 2) | ((val >> 8) & 0x03);
			out[outoffset + 12] = (1 << 2) | ((val >> 6) & 0x03);
			out[outoffset + 13] = (1 << 2) | ((val >> 4) & 0x03);
			out[outoffset + 14] = (1 << 2) | ((val >> 2) & 0x03);
			out[outoffset + 15] = (1 << 2) | (val & 0x03);
		}
	}

	static final void VSER_UNPACK3(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 3) | ((val >>> 29));
			out[outoffset + 1] = (1 << 3) | ((val >> 26) & 0x07);
			out[outoffset + 2] = (1 << 3) | ((val >> 23) & 0x07);
			out[outoffset + 3] = (1 << 3) | ((val >> 20) & 0x07);
			out[outoffset + 4] = (1 << 3) | ((val >> 17) & 0x07);
			out[outoffset + 5] = (1 << 3) | ((val >> 14) & 0x07);
			out[outoffset + 6] = (1 << 3) | ((val >> 11) & 0x07);
			out[outoffset + 7] = (1 << 3) | ((val >> 8) & 0x07);
			out[outoffset + 8] = (1 << 3) | ((val >> 5) & 0x07);
			out[outoffset + 9] = (1 << 3) | ((val >> 2) & 0x07);
			out[outoffset + 10] = (val << 1) & 0x07;

			val = in[inoffset + i + 1];
			out[outoffset + 10] |= (1 << 3) | ((val >>> 31));
			out[outoffset + 11] = (1 << 3) | ((val >> 28) & 0x07);
			out[outoffset + 12] = (1 << 3) | ((val >> 25) & 0x07);
			out[outoffset + 13] = (1 << 3) | ((val >> 22) & 0x07);
			out[outoffset + 14] = (1 << 3) | ((val >> 19) & 0x07);
			out[outoffset + 15] = (1 << 3) | ((val >> 16) & 0x07);
			out[outoffset + 16] = (1 << 3) | ((val >> 13) & 0x07);
			out[outoffset + 17] = (1 << 3) | ((val >> 10) & 0x07);
			out[outoffset + 18] = (1 << 3) | ((val >> 7) & 0x07);
			out[outoffset + 19] = (1 << 3) | ((val >> 4) & 0x07);
			out[outoffset + 20] = (1 << 3) | ((val >> 1) & 0x07);
			out[outoffset + 21] = (val << 2) & 0x07;

			val = in[inoffset + i + 2];
			out[outoffset + 21] |= (1 << 3) | ((val >>> 30));
			out[outoffset + 22] = (1 << 3) | ((val >> 27) & 0x07);
			out[outoffset + 23] = (1 << 3) | ((val >> 24) & 0x07);
			out[outoffset + 24] = (1 << 3) | ((val >> 21) & 0x07);
			out[outoffset + 25] = (1 << 3) | ((val >> 18) & 0x07);
			out[outoffset + 26] = (1 << 3) | ((val >> 15) & 0x07);
			out[outoffset + 27] = (1 << 3) | ((val >> 12) & 0x07);
			out[outoffset + 28] = (1 << 3) | ((val >> 9) & 0x07);
			out[outoffset + 29] = (1 << 3) | ((val >> 6) & 0x07);
			out[outoffset + 30] = (1 << 3) | ((val >> 3) & 0x07);
			out[outoffset + 31] = (1 << 3) | (val & 0x07);
		}
	}

	static final void VSER_UNPACK4(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 4) | ((val >>> 28));
			out[outoffset + 1] = (1 << 4) | ((val >> 24) & 0x0f);
			out[outoffset + 2] = (1 << 4) | ((val >> 20) & 0x0f);
			out[outoffset + 3] = (1 << 4) | ((val >> 16) & 0x0f);
			out[outoffset + 4] = (1 << 4) | ((val >> 12) & 0x0f);
			out[outoffset + 5] = (1 << 4) | ((val >> 8) & 0x0f);
			out[outoffset + 6] = (1 << 4) | ((val >> 4) & 0x0f);
			out[outoffset + 7] = (1 << 4) | (val & 0x0f);
		}
	}

	static final void VSER_UNPACK5(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 5) | ((val >>> 27));
			out[outoffset + 1] = (1 << 5) | ((val >> 22) & 0x1f);
			out[outoffset + 2] = (1 << 5) | ((val >> 17) & 0x1f);
			out[outoffset + 3] = (1 << 5) | ((val >> 12) & 0x1f);
			out[outoffset + 4] = (1 << 5) | ((val >> 7) & 0x1f);
			out[outoffset + 5] = (1 << 5) | ((val >> 2) & 0x1f);
			out[outoffset + 6] = (val << 3) & 0x1f;
			val = in[inoffset + i + 1];
			out[outoffset + 6] |= (1 << 5) | ((val >>> 29));
			out[outoffset + 7] = (1 << 5) | ((val >> 24) & 0x1f);
			out[outoffset + 8] = (1 << 5) | ((val >> 19) & 0x1f);
			out[outoffset + 9] = (1 << 5) | ((val >> 14) & 0x1f);
			out[outoffset + 10] = (1 << 5) | ((val >> 9) & 0x1f);
			out[outoffset + 11] = (1 << 5) | ((val >> 4) & 0x1f);
			out[outoffset + 12] = (val << 1) & 0x1f;
			val = in[inoffset + i + 2];
			out[outoffset + 12] |= (1 << 5) | ((val >>> 31));
			out[outoffset + 13] = (1 << 5) | ((val >> 26) & 0x1f);
			out[outoffset + 14] = (1 << 5) | ((val >> 21) & 0x1f);
			out[outoffset + 15] = (1 << 5) | ((val >> 16) & 0x1f);
			out[outoffset + 16] = (1 << 5) | ((val >> 11) & 0x1f);
			out[outoffset + 17] = (1 << 5) | ((val >> 6) & 0x1f);
			out[outoffset + 18] = (1 << 5) | ((val >> 1) & 0x1f);
			out[outoffset + 19] = (val << 4) & 0x1f;
			val = in[inoffset + i + 3];
			out[outoffset + 19] |= (1 << 5) | ((val >>> 28));
			out[outoffset + 20] = (1 << 5) | ((val >> 23) & 0x1f);
			out[outoffset + 21] = (1 << 5) | ((val >> 18) & 0x1f);
			out[outoffset + 22] = (1 << 5) | ((val >> 13) & 0x1f);
			out[outoffset + 23] = (1 << 5) | ((val >> 8) & 0x1f);
			out[outoffset + 24] = (1 << 5) | ((val >> 3) & 0x1f);
			out[outoffset + 25] = (val << 2) & 0x1f;
			val = in[inoffset + i + 4];
			out[outoffset + 25] |= (1 << 5) | ((val >>> 30));
			out[outoffset + 26] = (1 << 5) | ((val >> 25) & 0x1f);
			out[outoffset + 27] = (1 << 5) | ((val >> 20) & 0x1f);
			out[outoffset + 28] = (1 << 5) | ((val >> 15) & 0x1f);
			out[outoffset + 29] = (1 << 5) | ((val >> 10) & 0x1f);
			out[outoffset + 30] = (1 << 5) | ((val >> 5) & 0x1f);
			out[outoffset + 31] = (1 << 5) | (val & 0x1f);
		}
	}

	static final void VSER_UNPACK6(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 6) | ((val >>> 26));
			out[outoffset + 1] = (1 << 6) | ((val >> 20) & 0x3f);
			out[outoffset + 2] = (1 << 6) | ((val >> 14) & 0x3f);
			out[outoffset + 3] = (1 << 6) | ((val >> 8) & 0x3f);
			out[outoffset + 4] = (1 << 6) | ((val >> 2) & 0x3f);
			out[outoffset + 5] = (val << 4) & 0x3f;
			val = in[inoffset + i + 1];
			out[outoffset + 5] |= (1 << 6) | ((val >>> 28));
			out[outoffset + 6] = (1 << 6) | ((val >> 22) & 0x3f);
			out[outoffset + 7] = (1 << 6) | ((val >> 16) & 0x3f);
			out[outoffset + 8] = (1 << 6) | ((val >> 10) & 0x3f);
			out[outoffset + 9] = (1 << 6) | ((val >> 4) & 0x3f);
			out[outoffset + 10] = (val << 2) & 0x3f;
			val = in[inoffset + i + 2];
			out[outoffset + 10] |= (1 << 6) | ((val >>> 30));
			out[outoffset + 11] = (1 << 6) | ((val >> 24) & 0x3f);
			out[outoffset + 12] = (1 << 6) | ((val >> 18) & 0x3f);
			out[outoffset + 13] = (1 << 6) | ((val >> 12) & 0x3f);
			out[outoffset + 14] = (1 << 6) | ((val >> 6) & 0x3f);
			out[outoffset + 15] = (1 << 6) | (val & 0x3f);
		}
	}

	static final void VSER_UNPACK7(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 7) | ((val >>> 25));
			out[outoffset + 1] = (1 << 7) | ((val >> 18) & 0x7f);
			out[outoffset + 2] = (1 << 7) | ((val >> 11) & 0x7f);
			out[outoffset + 3] = (1 << 7) | ((val >> 4) & 0x7f);
			out[outoffset + 4] = (val << 3) & 0x7f;
			val = in[inoffset + i + 1];
			out[outoffset + 4] |= (1 << 7) | ((val >>> 29));
			out[outoffset + 5] = (1 << 7) | ((val >> 22) & 0x7f);
			out[outoffset + 6] = (1 << 7) | ((val >> 15) & 0x7f);
			out[outoffset + 7] = (1 << 7) | ((val >> 8) & 0x7f);
			out[outoffset + 8] = (1 << 7) | ((val >> 1) & 0x7f);
			out[outoffset + 9] = (val << 6) & 0x7f;
			val = in[inoffset + i + 2];
			out[outoffset + 9] |= (1 << 7) | ((val >>> 26));
			out[outoffset + 10] = (1 << 7) | ((val >> 19) & 0x7f);
			out[outoffset + 11] = (1 << 7) | ((val >> 12) & 0x7f);
			out[outoffset + 12] = (1 << 7) | ((val >> 5) & 0x7f);
			out[outoffset + 13] = (val << 2) & 0x7f;
			val = in[inoffset + i + 3];
			out[outoffset + 13] |= (1 << 7) | ((val >>> 30));
			out[outoffset + 14] = (1 << 7) | ((val >> 23) & 0x7f);
			out[outoffset + 15] = (1 << 7) | ((val >> 16) & 0x7f);
			out[outoffset + 16] = (1 << 7) | ((val >> 9) & 0x7f);
			out[outoffset + 17] = (1 << 7) | ((val >> 2) & 0x7f);
			out[outoffset + 18] = (val << 5) & 0x7f;
			val = in[inoffset + i + 4];
			out[outoffset + 18] |= (1 << 7) | ((val >>> 27));
			out[outoffset + 19] = (1 << 7) | ((val >> 20) & 0x7f);
			out[outoffset + 20] = (1 << 7) | ((val >> 13) & 0x7f);
			out[outoffset + 21] = (1 << 7) | ((val >> 6) & 0x7f);
			out[outoffset + 22] = (val << 1) & 0x7f;
			val = in[inoffset + i + 5];
			out[outoffset + 22] |= (1 << 7) | ((val >>> 31));
			out[outoffset + 23] = (1 << 7) | ((val >> 24) & 0x7f);
			out[outoffset + 24] = (1 << 7) | ((val >> 17) & 0x7f);
			out[outoffset + 25] = (1 << 7) | ((val >> 10) & 0x7f);
			out[outoffset + 26] = (1 << 7) | ((val >> 3) & 0x7f);
			out[outoffset + 27] = (val << 4) & 0x7f;
			val = in[inoffset + i + 6];
			out[outoffset + 27] |= (1 << 7) | ((val >>> 28));
			out[outoffset + 28] = (1 << 7) | ((val >> 21) & 0x7f);
			out[outoffset + 29] = (1 << 7) | ((val >> 14) & 0x7f);
			out[outoffset + 30] = (1 << 7) | ((val >> 7) & 0x7f);
			out[outoffset + 31] = (1 << 7) | (val & 0x7f);
		}
	}

	static final void VSER_UNPACK8(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 4)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 8) | ((val >>> 24));
			out[outoffset + 1] = (1 << 8) | ((val >> 16) & 0xff);
			out[outoffset + 2] = (1 << 8) | ((val >> 8) & 0xff);
			out[outoffset + 3] = (1 << 8) | (val & 0xff);
		}
	}

	static final void VSER_UNPACK9(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 9, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 9) | ((val >>> 23));
			out[outoffset + 1] = (1 << 9) | ((val >> 14) & 0x01ff);
			out[outoffset + 2] = (1 << 9) | ((val >> 5) & 0x01ff);
			out[outoffset + 3] = (val << 4) & 0x01ff;
			val = in[inoffset + i + 1];
			out[outoffset + 3] |= (1 << 9) | ((val >>> 28));
			out[outoffset + 4] = (1 << 9) | ((val >> 19) & 0x01ff);
			out[outoffset + 5] = (1 << 9) | ((val >> 10) & 0x01ff);
			out[outoffset + 6] = (1 << 9) | ((val >> 1) & 0x01ff);
			out[outoffset + 7] = (val << 8) & 0x01ff;
			val = in[inoffset + i + 2];
			out[outoffset + 7] |= (1 << 9) | ((val >>> 24));
			out[outoffset + 8] = (1 << 9) | ((val >> 15) & 0x01ff);
			out[outoffset + 9] = (1 << 9) | ((val >> 6) & 0x01ff);
			out[outoffset + 10] = (val << 3) & 0x01ff;
			val = in[inoffset + i + 3];
			out[outoffset + 10] |= (1 << 9) | ((val >>> 29));
			out[outoffset + 11] = (1 << 9) | ((val >> 20) & 0x01ff);
			out[outoffset + 12] = (1 << 9) | ((val >> 11) & 0x01ff);
			out[outoffset + 13] = (1 << 9) | ((val >> 2) & 0x01ff);
			out[outoffset + 14] = (val << 7) & 0x01ff;
			val = in[inoffset + i + 4];
			out[outoffset + 14] |= (1 << 9) | ((val >>> 25));
			out[outoffset + 15] = (1 << 9) | ((val >> 16) & 0x01ff);
			out[outoffset + 16] = (1 << 9) | ((val >> 7) & 0x01ff);
			out[outoffset + 17] = (val << 2) & 0x01ff;
			val = in[inoffset + i + 5];
			out[outoffset + 17] |= (1 << 9) | ((val >>> 30));
			out[outoffset + 18] = (1 << 9) | ((val >> 21) & 0x01ff);
			out[outoffset + 19] = (1 << 9) | ((val >> 12) & 0x01ff);
			out[outoffset + 20] = (1 << 9) | ((val >> 3) & 0x01ff);
			out[outoffset + 21] = (val << 6) & 0x01ff;
			val = in[inoffset + i + 6];
			out[outoffset + 21] |= (1 << 9) | ((val >>> 26));
			out[outoffset + 22] = (1 << 9) | ((val >> 17) & 0x01ff);
			out[outoffset + 23] = (1 << 9) | ((val >> 8) & 0x01ff);
			out[outoffset + 24] = (val << 1) & 0x01ff;
			val = in[inoffset + i + 7];
			out[outoffset + 24] |= (1 << 9) | ((val >>> 31));
			out[outoffset + 25] = (1 << 9) | ((val >> 22) & 0x01ff);
			out[outoffset + 26] = (1 << 9) | ((val >> 13) & 0x01ff);
			out[outoffset + 27] = (1 << 9) | ((val >> 4) & 0x01ff);
			out[outoffset + 28] = (val << 5) & 0x01ff;
			val = in[inoffset + i + 8];
			out[outoffset + 28] |= (1 << 9) | ((val >>> 27));
			out[outoffset + 29] = (1 << 9) | ((val >> 18) & 0x01ff);
			out[outoffset + 30] = (1 << 9) | ((val >> 9) & 0x01ff);
			out[outoffset + 31] = (1 << 9) | (val & 0x01ff);
		}
	}

	static final void VSER_UNPACK10(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 10) | ((val >>> 22));
			out[outoffset + 1] = (1 << 10) | ((val >> 12) & 0x03ff);
			out[outoffset + 2] = (1 << 10) | ((val >> 2) & 0x03ff);
			out[outoffset + 3] = (val << 8) & 0x03ff;
			val = in[inoffset + i + 1];
			out[outoffset + 3] |= (1 << 10) | ((val >>> 24));
			out[outoffset + 4] = (1 << 10) | ((val >> 14) & 0x03ff);
			out[outoffset + 5] = (1 << 10) | ((val >> 4) & 0x03ff);
			out[outoffset + 6] = (val << 6) & 0x03ff;
			val = in[inoffset + i + 2];
			out[outoffset + 6] |= (1 << 10) | ((val >>> 26));
			out[outoffset + 7] = (1 << 10) | ((val >> 16) & 0x03ff);
			out[outoffset + 8] = (1 << 10) | ((val >> 6) & 0x03ff);
			out[outoffset + 9] = (val << 4) & 0x03ff;
			val = in[inoffset + i + 3];
			out[outoffset + 9] |= (1 << 10) | ((val >>> 28));
			out[outoffset + 10] = (1 << 10) | ((val >> 18) & 0x03ff);
			out[outoffset + 11] = (1 << 10) | ((val >> 8) & 0x03ff);
			out[outoffset + 12] = (val << 2) & 0x03ff;
			val = in[inoffset + i + 4];
			out[outoffset + 12] |= (1 << 10) | ((val >>> 30));
			out[outoffset + 13] = (1 << 10) | ((val >> 20) & 0x03ff);
			out[outoffset + 14] = (1 << 10) | ((val >> 10) & 0x03ff);
			out[outoffset + 15] = (1 << 10) | (val & 0x03ff);
		}
	}

	static final void VSER_UNPACK11(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 11, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 11) | ((val >>> 21));
			out[outoffset + 1] = (1 << 11) | ((val >> 10) & 0x07ff);
			out[outoffset + 2] = (val << 1) & 0x07ff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= (1 << 11) | ((val >>> 31));
			out[outoffset + 3] = (1 << 11) | ((val >> 20) & 0x07ff);
			out[outoffset + 4] = (1 << 11) | ((val >> 9) & 0x07ff);
			out[outoffset + 5] = (val << 2) & 0x07ff;
			val = in[inoffset + i + 2];
			out[outoffset + 5] |= (1 << 11) | ((val >>> 30));
			out[outoffset + 6] = (1 << 11) | ((val >> 19) & 0x07ff);
			out[outoffset + 7] = (1 << 11) | ((val >> 8) & 0x07ff);
			out[outoffset + 8] = (val << 3) & 0x07ff;
			val = in[inoffset + i + 3];
			out[outoffset + 8] |= (1 << 11) | ((val >>> 29));
			out[outoffset + 9] = (1 << 11) | ((val >> 18) & 0x07ff);
			out[outoffset + 10] = (1 << 11) | ((val >> 7) & 0x07ff);
			out[outoffset + 11] = (val << 4) & 0x07ff;
			val = in[inoffset + i + 4];
			out[outoffset + 11] |= (1 << 11) | ((val >>> 28));
			out[outoffset + 12] = (1 << 11) | ((val >> 17) & 0x07ff);
			out[outoffset + 13] = (1 << 11) | ((val >> 6) & 0x07ff);
			out[outoffset + 14] = (val << 5) & 0x07ff;
			val = in[inoffset + i + 5];
			out[outoffset + 14] |= (1 << 11) | ((val >>> 27));
			out[outoffset + 15] = (1 << 11) | ((val >> 16) & 0x07ff);
			out[outoffset + 16] = (1 << 11) | ((val >> 5) & 0x07ff);
			out[outoffset + 17] = (val << 6) & 0x07ff;
			val = in[inoffset + i + 6];
			out[outoffset + 17] |= (1 << 11) | ((val >>> 26));
			out[outoffset + 18] = (1 << 11) | ((val >> 15) & 0x07ff);
			out[outoffset + 19] = (1 << 11) | ((val >> 4) & 0x07ff);
			out[outoffset + 20] = (val << 7) & 0x07ff;
			val = in[inoffset + i + 7];
			out[outoffset + 20] |= (1 << 11) | ((val >>> 25));
			out[outoffset + 21] = (1 << 11) | ((val >> 14) & 0x07ff);
			out[outoffset + 22] = (1 << 11) | ((val >> 3) & 0x07ff);
			out[outoffset + 23] = (val << 8) & 0x07ff;
			val = in[inoffset + i + 8];
			out[outoffset + 23] |= (1 << 11) | ((val >>> 24));
			out[outoffset + 24] = (1 << 11) | ((val >> 13) & 0x07ff);
			out[outoffset + 25] = (1 << 11) | ((val >> 2) & 0x07ff);
			out[outoffset + 26] = (val << 9) & 0x07ff;
			val = in[inoffset + i + 9];
			out[outoffset + 26] |= (1 << 11) | ((val >>> 23));
			out[outoffset + 27] = (1 << 11) | ((val >> 12) & 0x07ff);
			out[outoffset + 28] = (1 << 11) | ((val >> 1) & 0x07ff);
			out[outoffset + 29] = (val << 10) & 0x07ff;
			val = in[inoffset + i + 10];
			out[outoffset + 29] |= (1 << 11) | ((val >>> 22));
			out[outoffset + 30] = (1 << 11) | ((val >> 11) & 0x07ff);
			out[outoffset + 31] = (1 << 11) | (val & 0x07ff);
		}
	}

	static final void VSER_UNPACK12(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 12) | ((val >>> 20));
			out[outoffset + 1] = (1 << 12) | ((val >> 8) & 0x0fff);
			out[outoffset + 2] = (val << 4) & 0x0fff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= (1 << 12) | ((val >>> 28));
			out[outoffset + 3] = (1 << 12) | ((val >> 16) & 0x0fff);
			out[outoffset + 4] = (1 << 12) | ((val >>> 4) & 0x0fff);
			out[outoffset + 5] = (val << 8) & 0x0fff;
			val = in[inoffset + i + 2];
			out[outoffset + 5] |= (1 << 12) | ((val >>> 24));
			out[outoffset + 6] = (1 << 12) | ((val >> 12) & 0x0fff);
			out[outoffset + 7] = (1 << 12) | (val & 0x0fff);
		}
	}

	static final void VSER_UNPACK13(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 13, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 13) | ((val >>> 19));
			out[outoffset + 1] = (1 << 13) | ((val >> 6) & 0x1fff);
			out[outoffset + 2] = (val << 7) & 0x1fff;
			val = in[inoffset + i + 1];
			out[outoffset + 2] |= (1 << 13) | ((val >>> 25));
			out[outoffset + 3] = (1 << 13) | ((val >> 12) & 0x1fff);
			out[outoffset + 4] = (val << 1) & 0x1fff;
			val = in[inoffset + i + 2];
			out[outoffset + 4] |= (1 << 13) | ((val >>> 31));
			out[outoffset + 5] = (1 << 13) | ((val >> 18) & 0x1fff);
			out[outoffset + 6] = (1 << 13) | ((val >> 5) & 0x1fff);
			out[outoffset + 7] = (val << 8) & 0x1fff;
			val = in[inoffset + i + 3];
			out[outoffset + 7] |= (1 << 13) | ((val >>> 24));
			out[outoffset + 8] = (1 << 13) | ((val >> 11) & 0x1fff);
			out[outoffset + 9] = (val << 2) & 0x1fff;
			val = in[inoffset + i + 4];
			out[outoffset + 9] |= (1 << 13) | ((val >>> 30));
			out[outoffset + 10] = (1 << 13) | ((val >> 17) & 0x1fff);
			out[outoffset + 11] = (1 << 13) | ((val >> 4) & 0x1fff);
			out[outoffset + 12] = (val << 9) & 0x1fff;
			val = in[inoffset + i + 5];
			out[outoffset + 12] |= (1 << 13) | ((val >>> 23));
			out[outoffset + 13] = (1 << 13) | ((val >> 10) & 0x1fff);
			out[outoffset + 14] = (val << 3) & 0x1fff;
			val = in[inoffset + i + 6];
			out[outoffset + 14] |= (1 << 13) | ((val >>> 29));
			out[outoffset + 15] = (1 << 13) | ((val >> 16) & 0x1fff);
			out[outoffset + 16] = (1 << 13) | ((val >> 3) & 0x1fff);
			out[outoffset + 17] = (val << 10) & 0x1fff;
			val = in[inoffset + i + 7];
			out[outoffset + 17] |= (1 << 13) | ((val >>> 22));
			out[outoffset + 18] = (1 << 13) | ((val >> 9) & 0x1fff);
			out[outoffset + 19] = (val << 4) & 0x1fff;
			val = in[inoffset + i + 8];
			out[outoffset + 19] |= (1 << 13) | ((val >>> 28));
			out[outoffset + 20] = (1 << 13) | ((val >> 15) & 0x1fff);
			out[outoffset + 21] = (1 << 13) | ((val >> 2) & 0x1fff);
			out[outoffset + 22] = (val << 11) & 0x1fff;
			val = in[inoffset + i + 9];
			out[outoffset + 22] |= (1 << 13) | ((val >>> 21));
			out[outoffset + 23] = (1 << 13) | ((val >> 8) & 0x1fff);
			out[outoffset + 24] = (val << 5) & 0x1fff;
			val = in[inoffset + i + 10];
			out[outoffset + 24] |= (1 << 13) | ((val >>> 27));
			out[outoffset + 25] = (1 << 13) | ((val >> 14) & 0x1fff);
			out[outoffset + 26] = (1 << 13) | ((val >> 1) & 0x1fff);
			out[outoffset + 27] = (val << 12) & 0x1fff;
			val = in[inoffset + i + 11];
			out[outoffset + 27] |= (1 << 13) | ((val >>> 20));
			out[outoffset + 28] = (1 << 13) | ((val >> 7) & 0x1fff);
			out[outoffset + 29] = (val << 6) & 0x1fff;
			val = in[inoffset + i + 12];
			out[outoffset + 29] |= (1 << 13) | ((val >>> 26));
			out[outoffset + 30] = (1 << 13) | ((val >> 13) & 0x1fff);
			out[outoffset + 31] = (1 << 13) | (val & 0x1fff);
		}
	}

	static final void VSER_UNPACK14(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 14) | ((val >>> 18));
			out[outoffset + 1] = (1 << 14) | ((val >> 4) & 0x3fff);
			out[outoffset + 2] = (val << 10) & 0x3fff;

			val = in[inoffset + i + 1];
			out[outoffset + 2] |= (1 << 14) | ((val >>> 22));
			out[outoffset + 3] = (1 << 14) | ((val >> 8) & 0x3fff);
			out[outoffset + 4] = (val << 6) & 0x3fff;

			val = in[inoffset + i + 2];
			out[outoffset + 4] |= (1 << 14) | ((val >>> 26));
			out[outoffset + 5] = (1 << 14) | ((val >> 12) & 0x3fff);
			out[outoffset + 6] = (val << 2) & 0x3fff;

			val = in[inoffset + i + 3];
			out[outoffset + 6] |= (1 << 14) | ((val >>> 30));
			out[outoffset + 7] = (1 << 14) | ((val >> 16) & 0x3fff);
			out[outoffset + 8] = (1 << 14) | ((val >> 2) & 0x3fff);
			out[outoffset + 9] = (val << 12) & 0x3fff;

			val = in[inoffset + i + 4];
			out[outoffset + 9] |= (1 << 14) | ((val >>> 20));
			out[outoffset + 10] = (1 << 14) | ((val >> 6) & 0x3fff);
			out[outoffset + 11] = (val << 8) & 0x3fff;

			val = in[inoffset + i + 5];
			out[outoffset + 11] |= (1 << 14) | ((val >>> 24));
			out[outoffset + 12] = (1 << 14) | ((val >> 10) & 0x3fff);
			out[outoffset + 13] = (val << 4) & 0x3fff;

			val = in[inoffset + i + 6];
			out[outoffset + 13] |= (1 << 14) | ((val >>> 28));
			out[outoffset + 14] = (1 << 14) | ((val >> 14) & 0x3fff);
			out[outoffset + 15] = (1 << 14) | (val & 0x3fff);
		}
	}

	static final void VSER_UNPACK15(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 15, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 15) | ((val >>> 17));
			out[outoffset + 1] = (1 << 15) | ((val >> 2) & 0x7fff);
			out[outoffset + 2] = (val << 13) & 0x7fff;

			val = in[inoffset + i + 1];
			out[outoffset + 2] |= (1 << 15) | ((val >>> 19));
			out[outoffset + 3] = (1 << 15) | ((val >> 4) & 0x7fff);
			out[outoffset + 4] = (val << 11) & 0x7fff;

			val = in[inoffset + i + 2];
			out[outoffset + 4] |= (1 << 15) | ((val >>> 21));
			out[outoffset + 5] = (1 << 15) | ((val >> 6) & 0x7fff);
			out[outoffset + 6] = (val << 9) & 0x7fff;

			val = in[inoffset + i + 3];
			out[outoffset + 6] |= (1 << 15) | ((val >>> 23));
			out[outoffset + 7] = (1 << 15) | ((val >> 8) & 0x7fff);
			out[outoffset + 8] = (val << 7) & 0x7fff;

			val = in[inoffset + i + 4];
			out[outoffset + 8] |= (1 << 15) | ((val >>> 25));
			out[outoffset + 9] = (1 << 15) | ((val >> 10) & 0x7fff);
			out[outoffset + 10] = (val << 5) & 0x7fff;

			val = in[inoffset + i + 5];
			out[outoffset + 10] |= (1 << 15) | ((val >>> 27));
			out[outoffset + 11] = (1 << 15) | ((val >> 12) & 0x7fff);
			out[outoffset + 12] = (val << 3) & 0x7fff;

			val = in[inoffset + i + 6];
			out[outoffset + 12] |= (1 << 15) | ((val >>> 29));
			out[outoffset + 13] = (1 << 15) | ((val >> 14) & 0x7fff);
			out[outoffset + 14] = (val << 1) & 0x7fff;

			val = in[inoffset + i + 7];
			out[outoffset + 14] |= (1 << 15) | ((val >>> 31));
			out[outoffset + 15] = (1 << 15) | ((val >> 16) & 0x7fff);
			out[outoffset + 16] = (1 << 15) | ((val >> 1) & 0x7fff);
			out[outoffset + 17] = (val << 14) & 0x7fff;

			val = in[inoffset + i + 8];
			out[outoffset + 17] |= (1 << 15) | ((val >>> 18));
			out[outoffset + 18] = (1 << 15) | ((val >> 3) & 0x7fff);
			out[outoffset + 19] = (val << 12) & 0x7fff;

			val = in[inoffset + i + 9];
			out[outoffset + 19] |= (1 << 15) | ((val >>> 20));
			out[outoffset + 20] = (1 << 15) | ((val >> 5) & 0x7fff);
			out[outoffset + 21] = (val << 10) & 0x7fff;

			val = in[inoffset + i + 10];
			out[outoffset + 21] |= (1 << 15) | ((val >>> 22));
			out[outoffset + 22] = (1 << 15) | ((val >> 7) & 0x7fff);
			out[outoffset + 23] = (val << 8) & 0x7fff;

			val = in[inoffset + i + 11];
			out[outoffset + 23] |= (1 << 15) | ((val >>> 24));
			out[outoffset + 24] = (1 << 15) | ((val >> 9) & 0x7fff);
			out[outoffset + 25] = (val << 6) & 0x7fff;

			val = in[inoffset + i + 12];
			out[outoffset + 25] |= (1 << 15) | ((val >>> 26));
			out[outoffset + 26] = (1 << 15) | ((val >> 11) & 0x7fff);
			out[outoffset + 27] = (val << 4) & 0x7fff;

			val = in[inoffset + i + 13];
			out[outoffset + 27] |= (1 << 15) | ((val >>> 28));
			out[outoffset + 28] = (1 << 15) | ((val >> 13) & 0x7fff);
			out[outoffset + 29] = (val << 2) & 0x7fff;

			val = in[inoffset + i + 14];
			out[outoffset + 29] |= (1 << 15) | ((val >>> 30));
			out[outoffset + 30] = (1 << 15) | ((val >> 15) & 0x7fff);
			out[outoffset + 31] = (1 << 15) | (val & 0x7fff);
		}
	}

	static final void VSER_UNPACK16(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 1, outoffset += 2)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 16) | ((val >>> 16));
			out[outoffset + 1] = (1 << 16) | (val & 0xffff);
		}
	}

	static final void VSER_UNPACK17(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 17, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 17) | ((val >>> 15));
			out[outoffset + 1] = (val << 2) & 0x01ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 17) | ((val >>> 30));
			out[outoffset + 2] = (1 << 17) | ((val >> 13) & 0x01ffff);
			out[outoffset + 3] = (val << 4) & 0x01ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= (1 << 17) | ((val >>> 28));
			out[outoffset + 4] = (1 << 17) | ((val >> 11) & 0x01ffff);
			out[outoffset + 5] = (val << 6) & 0x01ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= (1 << 17) | ((val >>> 26));
			out[outoffset + 6] = (1 << 17) | ((val >> 9) & 0x01ffff);
			out[outoffset + 7] = (val << 8) & 0x01ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 7] |= (1 << 17) | ((val >>> 24));
			out[outoffset + 8] = (1 << 17) | ((val >> 7) & 0x01ffff);
			out[outoffset + 9] = (val << 10) & 0x01ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 9] |= (1 << 17) | ((val >>> 22));
			out[outoffset + 10] = (1 << 17) | ((val >> 5) & 0x01ffff);
			out[outoffset + 11] = (val << 12) & 0x01ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 11] |= (1 << 17) | ((val >>> 20));
			out[outoffset + 12] = (1 << 17) | ((val >> 3) & 0x01ffff);
			out[outoffset + 13] = (val << 14) & 0x01ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 13] |= (1 << 17) | ((val >>> 18));
			out[outoffset + 14] = (1 << 17) | ((val >> 1) & 0x01ffff);
			out[outoffset + 15] = (val << 16) & 0x01ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 15] |= (1 << 17) | ((val >>> 16));
			out[outoffset + 16] = (val << 1) & 0x01ffff;

			val = in[inoffset + i + 9];
			out[outoffset + 16] |= (1 << 17) | ((val >>> 31));
			out[outoffset + 17] = (1 << 17) | ((val >> 14) & 0x01ffff);
			out[outoffset + 18] = (val << 3) & 0x01ffff;

			val = in[inoffset + i + 10];
			out[outoffset + 18] |= (1 << 17) | ((val >>> 29));
			out[outoffset + 19] = (1 << 17) | ((val >> 12) & 0x01ffff);
			out[outoffset + 20] = (val << 5) & 0x01ffff;

			val = in[inoffset + i + 11];
			out[outoffset + 20] |= (1 << 17) | ((val >>> 27));
			out[outoffset + 21] = (1 << 17) | ((val >> 10) & 0x01ffff);
			out[outoffset + 22] = (val << 7) & 0x01ffff;

			val = in[inoffset + i + 12];
			out[outoffset + 22] |= (1 << 17) | ((val >>> 25));
			out[outoffset + 23] = (1 << 17) | ((val >> 8) & 0x01ffff);
			out[outoffset + 24] = (val << 9) & 0x01ffff;

			val = in[inoffset + i + 13];
			out[outoffset + 24] |= (1 << 17) | ((val >>> 23));
			out[outoffset + 25] = (1 << 17) | ((val >> 6) & 0x01ffff);
			out[outoffset + 26] = (val << 11) & 0x01ffff;

			val = in[inoffset + i + 14];
			out[outoffset + 26] |= (1 << 17) | ((val >>> 21));
			out[outoffset + 27] = (1 << 17) | ((val >> 4) & 0x01ffff);
			out[outoffset + 28] = (val << 13) & 0x01ffff;

			val = in[inoffset + i + 15];
			out[outoffset + 28] |= (1 << 17) | ((val >>> 19));
			out[outoffset + 29] = (1 << 17) | ((val >> 2) & 0x01ffff);
			out[outoffset + 30] = (val << 15) & 0x01ffff;

			val = in[inoffset + i + 16];
			out[outoffset + 30] |= (1 << 17) | ((val >>> 17));
			out[outoffset + 31] = (1 << 17) | (val & 0x01ffff);
		}
	}

	static final void VSER_UNPACK18(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 9, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 18) | ((val >>> 14));
			out[outoffset + 1] = (val << 4) & 0x03ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 18) | ((val >>> 28));
			out[outoffset + 2] = (1 << 18) | ((val >> 10) & 0x03ffff);
			out[outoffset + 3] = (val << 8) & 0x03ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= (1 << 18) | ((val >>> 24));
			out[outoffset + 4] = (1 << 18) | ((val >> 6) & 0x03ffff);
			out[outoffset + 5] = (val << 12) & 0x03ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= (1 << 18) | ((val >>> 20));
			out[outoffset + 6] = (1 << 18) | ((val >> 2) & 0x03ffff);
			out[outoffset + 7] = (val << 16) & 0x03ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 7] |= (1 << 18) | ((val >>> 16));
			out[outoffset + 8] = (val << 2) & 0x03ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 8] |= (1 << 18) | ((val >>> 30));
			out[outoffset + 9] = (1 << 18) | ((val >> 12) & 0x03ffff);
			out[outoffset + 10] = (val << 6) & 0x03ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 10] |= (1 << 18) | ((val >>> 26));
			out[outoffset + 11] = (1 << 18) | ((val >> 8) & 0x03ffff);
			out[outoffset + 12] = (val << 10) & 0x03ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 12] |= (1 << 18) | ((val >>> 22));
			out[outoffset + 13] = (1 << 18) | ((val >> 4) & 0x03ffff);
			out[outoffset + 14] = (val << 14) & 0x03ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 14] |= (1 << 18) | ((val >>> 18));
			out[outoffset + 15] = (1 << 18) | (val & 0x03ffff);
		}
	}

	static final void VSER_UNPACK19(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 19, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 19) | ((val >>> 13));
			out[outoffset + 1] = (val << 6) & 0x07ffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 19) | ((val >>> 26));
			out[outoffset + 2] = (1 << 19) | ((val >> 7) & 0x07ffff);
			out[outoffset + 3] = (val << 12) & 0x07ffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= (1 << 19) | ((val >>> 20));
			out[outoffset + 4] = (1 << 19) | ((val >> 1) & 0x07ffff);
			out[outoffset + 5] = (val << 18) & 0x07ffff;

			val = in[inoffset + i + 3];
			out[outoffset + 5] |= (1 << 19) | ((val >>> 14));
			out[outoffset + 6] = (val << 5) & 0x07ffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= (1 << 19) | ((val >>> 27));
			out[outoffset + 7] = (1 << 19) | ((val >> 8) & 0x07ffff);
			out[outoffset + 8] = (val << 11) & 0x07ffff;

			val = in[inoffset + i + 5];
			out[outoffset + 8] |= (1 << 19) | ((val >>> 21));
			out[outoffset + 9] = (1 << 19) | ((val >> 2) & 0x07ffff);
			out[outoffset + 10] = (val << 17) & 0x07ffff;

			val = in[inoffset + i + 6];
			out[outoffset + 10] |= (1 << 19) | ((val >>> 15));
			out[outoffset + 11] = (val << 4) & 0x07ffff;

			val = in[inoffset + i + 7];
			out[outoffset + 11] |= (1 << 19) | ((val >>> 28));
			out[outoffset + 12] = (1 << 19) | ((val >> 9) & 0x07ffff);
			out[outoffset + 13] = (val << 10) & 0x07ffff;

			val = in[inoffset + i + 8];
			out[outoffset + 13] |= (1 << 19) | ((val >>> 22));
			out[outoffset + 14] = (1 << 19) | ((val >> 3) & 0x07ffff);
			out[outoffset + 15] = (val << 16) & 0x07ffff;

			val = in[inoffset + i + 9];
			out[outoffset + 15] |= (1 << 19) | ((val >>> 16));
			out[outoffset + 16] = (val << 3) & 0x07ffff;

			val = in[inoffset + i + 10];
			out[outoffset + 16] |= (1 << 19) | ((val >>> 29));
			out[outoffset + 17] = (1 << 19) | ((val >> 10) & 0x07ffff);
			out[outoffset + 18] = (val << 9) & 0x07ffff;

			val = in[inoffset + i + 11];
			out[outoffset + 18] |= (1 << 19) | ((val >>> 23));
			out[outoffset + 19] = (1 << 19) | ((val >> 4) & 0x07ffff);
			out[outoffset + 20] = (val << 15) & 0x07ffff;

			val = in[inoffset + i + 12];
			out[outoffset + 20] |= (1 << 19) | ((val >>> 17));
			out[outoffset + 21] = (val << 2) & 0x07ffff;

			val = in[inoffset + i + 13];
			out[outoffset + 21] |= (1 << 19) | ((val >>> 30));
			out[outoffset + 22] = (1 << 19) | ((val >> 11) & 0x07ffff);
			out[outoffset + 23] = (val << 8) & 0x07ffff;

			val = in[inoffset + i + 14];
			out[outoffset + 23] |= (1 << 19) | ((val >>> 24));
			out[outoffset + 24] = (1 << 19) | ((val >> 5) & 0x07ffff);
			out[outoffset + 25] = (val << 14) & 0x07ffff;

			val = in[inoffset + i + 15];
			out[outoffset + 25] |= (1 << 19) | ((val >>> 18));
			out[outoffset + 26] = (val << 1) & 0x07ffff;

			val = in[inoffset + i + 16];
			out[outoffset + 26] |= (1 << 19) | ((val >>> 31));
			out[outoffset + 27] = (1 << 19) | ((val >> 12) & 0x07ffff);
			out[outoffset + 28] = (val << 7) & 0x07ffff;

			val = in[inoffset + i + 17];
			out[outoffset + 28] |= (1 << 19) | ((val >>> 25));
			out[outoffset + 29] = (1 << 19) | ((val >> 6) & 0x07ffff);
			out[outoffset + 30] = (val << 13) & 0x07ffff;

			val = in[inoffset + i + 18];
			out[outoffset + 30] |= (1 << 19) | ((val >>> 19));
			out[outoffset + 31] = (1 << 19) | (val & 0x07ffff);
		}
	}

	static final void VSER_UNPACK20(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 5, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 20) | ((val >>> 12));
			out[outoffset + 1] = (val << 8) & 0x0fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 20) | ((val >>> 24));
			out[outoffset + 2] = (1 << 20) | ((val >> 4) & 0x0fffff);
			out[outoffset + 3] = (val << 16) & 0x0fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= (1 << 20) | ((val >>> 16));
			out[outoffset + 4] = (val << 4) & 0x0fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= (1 << 20) | ((val >>> 28));
			out[outoffset + 5] = (1 << 20) | ((val >> 8) & 0x0fffff);
			out[outoffset + 6] = (val << 12) & 0x0fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= (1 << 20) | ((val >>> 20));
			out[outoffset + 7] = (1 << 20) | (val & 0x0fffff);
		}
	}

	static final void VSER_UNPACK21(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 21, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 21) | ((val >>> 11));
			out[outoffset + 1] = (val << 10) & 0x1fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 21) | ((val >>> 22));
			out[outoffset + 2] = (1 << 21) | ((val >> 1) & 0x1fffff);
			out[outoffset + 3] = (val << 20) & 0x1fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 3] |= (1 << 21) | ((val >>> 12));
			out[outoffset + 4] = (val << 9) & 0x1fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= (1 << 21) | ((val >>> 23));
			out[outoffset + 5] = (1 << 21) | ((val >> 2) & 0x1fffff);
			out[outoffset + 6] = (val << 19) & 0x1fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 6] |= (1 << 21) | ((val >>> 13));
			out[outoffset + 7] = (val << 8) & 0x1fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 7] |= (1 << 21) | ((val >>> 24));
			out[outoffset + 8] = (1 << 21) | ((val >> 3) & 0x1fffff);
			out[outoffset + 9] = (val << 18) & 0x1fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 9] |= (1 << 21) | ((val >>> 14));
			out[outoffset + 10] = (val << 7) & 0x1fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 10] |= (1 << 21) | ((val >>> 25));
			out[outoffset + 11] = (1 << 21) | ((val >> 4) & 0x1fffff);
			out[outoffset + 12] = (val << 17) & 0x1fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 12] |= (1 << 21) | ((val >>> 15));
			out[outoffset + 13] = (val << 6) & 0x1fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 13] |= (1 << 21) | ((val >>> 26));
			out[outoffset + 14] = (1 << 21) | ((val >> 5) & 0x1fffff);
			out[outoffset + 15] = (val << 16) & 0x1fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 15] |= (1 << 21) | ((val >>> 16));
			out[outoffset + 16] = (val << 5) & 0x1fffff;

			val = in[inoffset + i + 11];
			out[outoffset + 16] |= (1 << 21) | ((val >>> 27));
			out[outoffset + 17] = (1 << 21) | ((val >> 6) & 0x1fffff);
			out[outoffset + 18] = (val << 15) & 0x1fffff;

			val = in[inoffset + i + 12];
			out[outoffset + 18] |= (1 << 21) | ((val >>> 17));
			out[outoffset + 19] = (val << 4) & 0x1fffff;

			val = in[inoffset + i + 13];
			out[outoffset + 19] |= (1 << 21) | ((val >>> 28));
			out[outoffset + 20] = (1 << 21) | ((val >> 7) & 0x1fffff);
			out[outoffset + 21] = (val << 14) & 0x1fffff;

			val = in[inoffset + i + 14];
			out[outoffset + 21] |= (1 << 21) | ((val >>> 18));
			out[outoffset + 22] = (val << 3) & 0x1fffff;

			val = in[inoffset + i + 15];
			out[outoffset + 22] |= (1 << 21) | ((val >>> 29));
			out[outoffset + 23] = (1 << 21) | ((val >> 8) & 0x1fffff);
			out[outoffset + 24] = (val << 13) & 0x1fffff;

			val = in[inoffset + i + 16];
			out[outoffset + 24] |= (1 << 21) | ((val >>> 19));
			out[outoffset + 25] = (val << 2) & 0x1fffff;

			val = in[inoffset + i + 17];
			out[outoffset + 25] |= (1 << 21) | ((val >>> 30));
			out[outoffset + 26] = (1 << 21) | ((val >> 9) & 0x1fffff);
			out[outoffset + 27] = (val << 12) & 0x1fffff;

			val = in[inoffset + i + 18];
			out[outoffset + 27] |= (1 << 21) | ((val >>> 20));
			out[outoffset + 28] = (val << 1) & 0x1fffff;

			val = in[inoffset + i + 19];
			out[outoffset + 28] |= (1 << 21) | ((val >>> 31));
			out[outoffset + 29] = (1 << 21) | ((val >> 10) & 0x1fffff);
			out[outoffset + 30] = (val << 11) & 0x1fffff;

			val = in[inoffset + i + 20];
			out[outoffset + 30] |= (1 << 21) | ((val >>> 21));
			out[outoffset + 31] = (1 << 21) | (val & 0x1fffff);
		}
	}

	static final void VSER_UNPACK22(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 11, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 22) | ((val >>> 10));
			out[outoffset + 1] = (val << 12) & 0x3fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 22) | ((val >>> 20));
			out[outoffset + 2] = (val << 2) & 0x3fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 22) | ((val >>> 30));
			out[outoffset + 3] = (1 << 22) | ((val >> 8) & 0x3fffff);
			out[outoffset + 4] = (val << 14) & 0x3fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= (1 << 22) | ((val >>> 18));
			out[outoffset + 5] = (val << 4) & 0x3fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= (1 << 22) | ((val >>> 28));
			out[outoffset + 6] = (1 << 22) | ((val >> 6) & 0x3fffff);
			out[outoffset + 7] = (val << 16) & 0x3fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 7] |= (1 << 22) | ((val >>> 16));
			out[outoffset + 8] = (val << 6) & 0x3fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 8] |= (1 << 22) | ((val >>> 26));
			out[outoffset + 9] = (1 << 22) | ((val >> 4) & 0x3fffff);
			out[outoffset + 10] = (val << 18) & 0x3fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 10] |= (1 << 22) | ((val >>> 14));
			out[outoffset + 11] = (val << 8) & 0x3fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 11] |= (1 << 22) | ((val >>> 24));
			out[outoffset + 12] = (1 << 22) | ((val >> 2) & 0x3fffff);
			out[outoffset + 13] = (val << 20) & 0x3fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 13] |= (1 << 22) | ((val >>> 12));
			out[outoffset + 14] = (val << 10) & 0x3fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 14] |= (1 << 22) | ((val >>> 22));
			out[outoffset + 15] = (1 << 22) | (val & 0x3fffff);
		}
	}

	static final void VSER_UNPACK23(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 23, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 23) | ((val >>> 9));
			out[outoffset + 1] = (val << 14) & 0x7fffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 23) | ((val >>> 18));
			out[outoffset + 2] = (val << 5) & 0x7fffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 23) | ((val >>> 27));
			out[outoffset + 3] = (1 << 23) | ((val >> 4) & 0x7fffff);
			out[outoffset + 4] = (val << 19) & 0x7fffff;

			val = in[inoffset + i + 3];
			out[outoffset + 4] |= (1 << 23) | ((val >>> 13));
			out[outoffset + 5] = (val << 10) & 0x7fffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= (1 << 23) | ((val >>> 22));
			out[outoffset + 6] = (val << 1) & 0x7fffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= (1 << 23) | ((val >>> 31));
			out[outoffset + 7] = (1 << 23) | ((val >> 8) & 0x7fffff);
			out[outoffset + 8] = (val << 15) & 0x7fffff;

			val = in[inoffset + i + 6];
			out[outoffset + 8] |= (1 << 23) | ((val >>> 17));
			out[outoffset + 9] = (val << 6) & 0x7fffff;

			val = in[inoffset + i + 7];
			out[outoffset + 9] |= (1 << 23) | ((val >>> 26));
			out[outoffset + 10] = (1 << 23) | ((val >> 3) & 0x7fffff);
			out[outoffset + 11] = (val << 20) & 0x7fffff;

			val = in[inoffset + i + 8];
			out[outoffset + 11] |= (1 << 23) | ((val >>> 12));
			out[outoffset + 12] = (val << 11) & 0x7fffff;

			val = in[inoffset + i + 9];
			out[outoffset + 12] |= (1 << 23) | ((val >>> 21));
			out[outoffset + 13] = (val << 2) & 0x7fffff;

			val = in[inoffset + i + 10];
			out[outoffset + 13] |= (1 << 23) | ((val >>> 30));
			out[outoffset + 14] = (1 << 23) | ((val >> 7) & 0x7fffff);
			out[outoffset + 15] = (val << 16) & 0x7fffff;

			val = in[inoffset + i + 11];
			out[outoffset + 15] |= (1 << 23) | ((val >>> 16));
			out[outoffset + 16] = (val << 7) & 0x7fffff;

			val = in[inoffset + i + 12];
			out[outoffset + 16] |= (1 << 23) | ((val >>> 25));
			out[outoffset + 17] = (1 << 23) | ((val >> 2) & 0x7fffff);
			out[outoffset + 18] = (val << 21) & 0x7fffff;

			val = in[inoffset + i + 13];
			out[outoffset + 18] |= (1 << 23) | ((val >>> 11));
			out[outoffset + 19] = (val << 12) & 0x7fffff;

			val = in[inoffset + i + 14];
			out[outoffset + 19] |= (1 << 23) | ((val >>> 20));
			out[outoffset + 20] = (val << 3) & 0x7fffff;

			val = in[inoffset + i + 15];
			out[outoffset + 20] |= (1 << 23) | ((val >>> 29));
			out[outoffset + 21] = (1 << 23) | ((val >> 6) & 0x7fffff);
			out[outoffset + 22] = (val << 17) & 0x7fffff;

			val = in[inoffset + i + 16];
			out[outoffset + 22] |= (1 << 23) | ((val >>> 15));
			out[outoffset + 23] = (val << 8) & 0x7fffff;

			val = in[inoffset + i + 17];
			out[outoffset + 23] |= (1 << 23) | ((val >>> 24));
			out[outoffset + 24] = (1 << 23) | ((val >> 1) & 0x7fffff);
			out[outoffset + 25] = (val << 22) & 0x7fffff;

			val = in[inoffset + i + 18];
			out[outoffset + 25] |= (1 << 23) | ((val >>> 10));
			out[outoffset + 26] = (val << 13) & 0x7fffff;

			val = in[inoffset + i + 19];
			out[outoffset + 26] |= (1 << 23) | ((val >>> 19));
			out[outoffset + 27] = (val << 4) & 0x7fffff;

			val = in[inoffset + i + 20];
			out[outoffset + 27] |= (1 << 23) | ((val >>> 28));
			out[outoffset + 28] = (1 << 23) | ((val >> 5) & 0x7fffff);
			out[outoffset + 29] = (val << 18) & 0x7fffff;

			val = in[inoffset + i + 21];
			out[outoffset + 29] |= (1 << 23) | ((val >>> 14));
			out[outoffset + 30] = (val << 9) & 0x7fffff;

			val = in[inoffset + i + 22];
			out[outoffset + 30] |= (1 << 23) | ((val >>> 23));
			out[outoffset + 31] = (1 << 23) | (val & 0x7fffff);
		}
	}

	static final void VSER_UNPACK24(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 3, outoffset += 4)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 24) | ((val >>> 8));
			out[outoffset + 1] = (val << 16) & 0xffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 24) | ((val >>> 16));
			out[outoffset + 2] = (val << 8) & 0xffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 24) | ((val >>> 24));
			out[outoffset + 3] = (1 << 24) | (val & 0xffffff);
		}
	}

	static final void VSER_UNPACK25(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 25, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 25) | ((val >>> 7));
			out[outoffset + 1] = (val << 18) & 0x01ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 25) | ((val >>> 14));
			out[outoffset + 2] = (val << 11) & 0x01ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 25) | ((val >>> 21));
			out[outoffset + 3] = (val << 4) & 0x01ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 25) | ((val >>> 28));
			out[outoffset + 4] = (1 << 25) | ((val >> 3) & 0x01ffffff);
			out[outoffset + 5] = (val << 22) & 0x01ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 5] |= (1 << 25) | ((val >>> 10));
			out[outoffset + 6] = (val << 15) & 0x01ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= (1 << 25) | ((val >>> 17));
			out[outoffset + 7] = (val << 8) & 0x01ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= (1 << 25) | ((val >>> 24));
			out[outoffset + 8] = (val << 1) & 0x01ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= (1 << 25) | ((val >>> 31));
			out[outoffset + 9] = (1 << 25) | ((val >> 6) & 0x01ffffff);
			out[outoffset + 10] = (val << 19) & 0x01ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 10] |= (1 << 25) | ((val >>> 13));
			out[outoffset + 11] = (val << 12) & 0x01ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 11] |= (1 << 25) | ((val >>> 20));
			out[outoffset + 12] = (val << 5) & 0x01ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 12] |= (1 << 25) | ((val >>> 27));
			out[outoffset + 13] = (1 << 25) | (((val >> 2) & 0x01ffffff));
			out[outoffset + 14] = (val << 23) & 0x01ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 14] |= (1 << 25) | ((val >>> 9));
			out[outoffset + 15] = (val << 16) & 0x01ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 15] |= (1 << 25) | ((val >>> 16));
			out[outoffset + 16] = (val << 9) & 0x01ffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 16] |= (1 << 25) | ((val >>> 23));
			out[outoffset + 17] = (val << 2) & 0x01ffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 17] |= (1 << 25) | ((val >>> 30));
			out[outoffset + 18] = (1 << 25) | ((val >> 5) & 0x01ffffff);
			out[outoffset + 19] = (val << 20) & 0x01ffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 19] |= (1 << 25) | ((val >>> 12));
			out[outoffset + 20] = (val << 13) & 0x01ffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 20] |= (1 << 25) | ((val >>> 19));
			out[outoffset + 21] = (val << 6) & 0x01ffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 21] |= (1 << 25) | ((val >>> 26));
			out[outoffset + 22] = (1 << 25) | ((val >> 1) & 0x01ffffff);
			out[outoffset + 23] = (val << 24) & 0x01ffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 23] |= (1 << 25) | ((val >>> 8));
			out[outoffset + 24] = (val << 17) & 0x01ffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 24] |= (1 << 25) | ((val >>> 15));
			out[outoffset + 25] = (val << 10) & 0x01ffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 25] |= (1 << 25) | ((val >>> 22));
			out[outoffset + 26] = (val << 3) & 0x01ffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 26] |= (1 << 25) | ((val >>> 29));
			out[outoffset + 27] = (1 << 25) | ((val >> 4) & 0x01ffffff);
			out[outoffset + 28] = (val << 21) & 0x01ffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 28] |= (1 << 25) | ((val >>> 11));
			out[outoffset + 29] = (val << 14) & 0x01ffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 29] |= (1 << 25) | ((val >>> 18));
			out[outoffset + 30] = (val << 7) & 0x01ffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 30] |= (1 << 25) | ((val >>> 25));
			out[outoffset + 31] = (1 << 25) | (val & 0x01ffffff);
		}
	}

	static final void VSER_UNPACK26(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 13, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 26) | ((val >>> 6));
			out[outoffset + 1] = (val << 20) & 0x03ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 26) | ((val >>> 12));
			out[outoffset + 2] = (val << 14) & 0x03ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 26) | ((val >>> 18));
			out[outoffset + 3] = (val << 8) & 0x03ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 26) | ((val >>> 24));
			out[outoffset + 4] = (val << 2) & 0x03ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 26) | ((val >>> 30));
			out[outoffset + 5] = (1 << 26) | ((val >> 4) & 0x03ffffff);
			out[outoffset + 6] = (val << 22) & 0x03ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 6] |= (1 << 26) | ((val >>> 10));
			out[outoffset + 7] = (val << 16) & 0x03ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= (1 << 26) | ((val >>> 16));
			out[outoffset + 8] = (val << 10) & 0x03ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= (1 << 26) | ((val >>> 22));
			out[outoffset + 9] = (val << 4) & 0x03ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 9] |= (1 << 26) | ((val >>> 28));
			out[outoffset + 10] = (1 << 26) | ((val >> 2) & 0x03ffffff);
			out[outoffset + 11] = (val << 24) & 0x03ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 11] |= (1 << 26) | ((val >>> 8));
			out[outoffset + 12] = (val << 18) & 0x03ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 12] |= (1 << 26) | ((val >>> 14));
			out[outoffset + 13] = (val << 12) & 0x03ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 13] |= (1 << 26) | ((val >>> 20));
			out[outoffset + 14] = (val << 6) & 0x03ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 14] |= (1 << 26) | ((val >>> 26));
			out[outoffset + 15] = (1 << 26) | (val & 0x03ffffff);
		}
	}

	static final void VSER_UNPACK27(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 27, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 27) | ((val >>> 5));
			out[outoffset + 1] = (val << 22) & 0x07ffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 27) | ((val >>> 10));
			out[outoffset + 2] = (val << 17) & 0x07ffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 27) | ((val >>> 15));
			out[outoffset + 3] = (val << 12) & 0x07ffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 27) | ((val >>> 20));
			out[outoffset + 4] = (val << 7) & 0x07ffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 27) | ((val >>> 25));
			out[outoffset + 5] = (val << 2) & 0x07ffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= (1 << 27) | ((val >>> 30));
			out[outoffset + 6] = (1 << 27) | ((val >> 3) & 0x07ffffff);
			out[outoffset + 7] = (val << 24) & 0x07ffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 7] |= (1 << 27) | ((val >>> 8));
			out[outoffset + 8] = (val << 19) & 0x07ffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 8] |= (1 << 27) | ((val >>> 13));
			out[outoffset + 9] = (val << 14) & 0x07ffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 9] |= (1 << 27) | ((val >>> 18));
			out[outoffset + 10] = (val << 9) & 0x07ffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 10] |= (1 << 27) | ((val >>> 23));
			out[outoffset + 11] = (val << 4) & 0x07ffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 11] |= (1 << 27) | ((val >>> 28));
			out[outoffset + 12] = (1 << 27) | ((val >> 1) & 0x07ffffff);
			out[outoffset + 13] = (val << 26) & 0x07ffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 13] |= (1 << 27) | ((val >>> 6));
			out[outoffset + 14] = (val << 21) & 0x07ffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 14] |= (1 << 27) | ((val >>> 11));
			out[outoffset + 15] = (val << 16) & 0x07ffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 15] |= (1 << 27) | ((val >>> 16));
			out[outoffset + 16] = (val << 11) & 0x07ffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 16] |= (1 << 27) | ((val >>> 21));
			out[outoffset + 17] = (val << 6) & 0x07ffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 17] |= (1 << 27) | ((val >>> 26));
			out[outoffset + 18] = (val << 1) & 0x07ffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 18] |= (1 << 27) | ((val >>> 31));
			out[outoffset + 19] = (1 << 27) | ((val >> 4) & 0x07ffffff);
			out[outoffset + 20] = (val << 23) & 0x07ffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 20] |= (1 << 27) | ((val >>> 9));
			out[outoffset + 21] = (val << 18) & 0x07ffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 21] |= (1 << 27) | ((val >>> 14));
			out[outoffset + 22] = (val << 13) & 0x07ffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 22] |= (1 << 27) | ((val >>> 19));
			out[outoffset + 23] = (val << 8) & 0x07ffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 23] |= (1 << 27) | ((val >>> 24));
			out[outoffset + 24] = (val << 3) & 0x07ffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 24] |= (1 << 27) | ((val >>> 29));
			out[outoffset + 25] = (1 << 27) | ((val >> 2) & 0x07ffffff);
			out[outoffset + 26] = (val << 25) & 0x07ffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 26] |= (1 << 27) | ((val >>> 7));
			out[outoffset + 27] = (val << 20) & 0x07ffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 27] |= (1 << 27) | ((val >>> 12));
			out[outoffset + 28] = (val << 15) & 0x07ffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 28] |= (1 << 27) | ((val >>> 17));
			out[outoffset + 29] = (val << 10) & 0x07ffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 29] |= (1 << 27) | ((val >>> 22));
			out[outoffset + 30] = (val << 5) & 0x07ffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 30] |= (1 << 27) | ((val >>> 27));
			out[outoffset + 31] = (1 << 27) | (val & 0x07ffffff);
		}
	}

	static final void VSER_UNPACK28(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 7, outoffset += 8)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 28) | ((val >>> 4));
			out[outoffset + 1] = (val << 24) & 0x0fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 28) | ((val >>> 8));
			out[outoffset + 2] = (val << 20) & 0x0fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 28) | ((val >>> 12));
			out[outoffset + 3] = (val << 16) & 0x0fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 28) | ((val >>> 16));
			out[outoffset + 4] = (val << 12) & 0x0fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 28) | ((val >>> 20));
			out[outoffset + 5] = (val << 8) & 0x0fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= (1 << 28) | ((val >>> 24));
			out[outoffset + 6] = (val << 4) & 0x0fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= (1 << 28) | ((val >>> 28));
			out[outoffset + 7] = (1 << 28) | (val & 0x0fffffff);
		}
	}

	static final void VSER_UNPACK29(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 29, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 29) | ((val >>> 3));
			out[outoffset + 1] = (val << 26) & 0x1fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 29) | ((val >>> 6));
			out[outoffset + 2] = (val << 23) & 0x1fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 29) | ((val >>> 9));
			out[outoffset + 3] = (val << 20) & 0x1fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 29) | ((val >>> 12));
			out[outoffset + 4] = (val << 17) & 0x1fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 29) | ((val >>> 15));
			out[outoffset + 5] = (val << 14) & 0x1fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= (1 << 29) | ((val >>> 18));
			out[outoffset + 6] = (val << 11) & 0x1fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= (1 << 29) | ((val >>> 21));
			out[outoffset + 7] = (val << 8) & 0x1fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= (1 << 29) | ((val >>> 24));
			out[outoffset + 8] = (val << 5) & 0x1fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= (1 << 29) | ((val >>> 27));
			out[outoffset + 9] = (val << 2) & 0x1fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= (1 << 29) | ((val >>> 30));
			out[outoffset + 10] = (1 << 29) | ((val >> 1) & 0x1fffffff);
			out[outoffset + 11] = (val << 28) & 0x1fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 11] |= (1 << 29) | ((val >>> 4));
			out[outoffset + 12] = (val << 25) & 0x1fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 12] |= (1 << 29) | ((val >>> 7));
			out[outoffset + 13] = (val << 22) & 0x1fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 13] |= (1 << 29) | ((val >>> 10));
			out[outoffset + 14] = (val << 19) & 0x1fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 14] |= (1 << 29) | ((val >>> 13));
			out[outoffset + 15] = (val << 16) & 0x1fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 15] |= (1 << 29) | ((val >>> 16));
			out[outoffset + 16] = (val << 13) & 0x1fffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 16] |= (1 << 29) | ((val >>> 19));
			out[outoffset + 17] = (val << 10) & 0x1fffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 17] |= (1 << 29) | ((val >>> 22));
			out[outoffset + 18] = (val << 7) & 0x1fffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 18] |= (1 << 29) | ((val >>> 25));
			out[outoffset + 19] = (val << 4) & 0x1fffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 19] |= (1 << 29) | ((val >>> 28));
			out[outoffset + 20] = (val << 1) & 0x1fffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 20] |= (1 << 29) | ((val >>> 31));
			out[outoffset + 21] = (1 << 29) | ((val >> 2) & 0x1fffffff);
			out[outoffset + 22] = (val << 27) & 0x1fffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 22] |= (1 << 29) | ((val >>> 5));
			out[outoffset + 23] = (val << 24) & 0x1fffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 23] |= (1 << 29) | ((val >>> 8));
			out[outoffset + 24] = (val << 21) & 0x1fffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 24] |= (1 << 29) | ((val >>> 11));
			out[outoffset + 25] = (val << 18) & 0x1fffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 25] |= (1 << 29) | ((val >>> 14));
			out[outoffset + 26] = (val << 15) & 0x1fffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 26] |= (1 << 29) | ((val >>> 17));
			out[outoffset + 27] = (val << 12) & 0x1fffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 27] |= (1 << 29) | ((val >>> 20));
			out[outoffset + 28] = (val << 9) & 0x1fffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 28] |= (1 << 29) | ((val >>> 23));
			out[outoffset + 29] = (val << 6) & 0x1fffffff;

			val = in[inoffset + i + 27];
			out[outoffset + 29] |= (1 << 29) | ((val >>> 26));
			out[outoffset + 30] = (val << 3) & 0x1fffffff;

			val = in[inoffset + i + 28];
			out[outoffset + 30] |= (1 << 29) | ((val >>> 29));
			out[outoffset + 31] = (1 << 29) | (val & 0x1fffffff);
		}
	}

	static final void VSER_UNPACK30(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 15, outoffset += 16)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 30) | ((val >>> 2));
			out[outoffset + 1] = (val << 28) & 0x3fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 30) | ((val >>> 4));
			out[outoffset + 2] = (val << 26) & 0x3fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 30) | ((val >>> 6));
			out[outoffset + 3] = (val << 24) & 0x3fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 30) | ((val >>> 8));
			out[outoffset + 4] = (val << 22) & 0x3fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 30) | ((val >>> 10));
			out[outoffset + 5] = (val << 20) & 0x3fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= (1 << 30) | ((val >>> 12));
			out[outoffset + 6] = (val << 18) & 0x3fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= (1 << 30) | ((val >>> 14));
			out[outoffset + 7] = (val << 16) & 0x3fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= (1 << 30) | ((val >>> 16));
			out[outoffset + 8] = (val << 14) & 0x3fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= (1 << 30) | ((val >>> 18));
			out[outoffset + 9] = (val << 12) & 0x3fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= (1 << 30) | ((val >>> 20));
			out[outoffset + 10] = (val << 10) & 0x3fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 10] |= (1 << 30) | ((val >>> 22));
			out[outoffset + 11] = (val << 8) & 0x3fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 11] |= (1 << 30) | ((val >>> 24));
			out[outoffset + 12] = (val << 6) & 0x3fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 12] |= (1 << 30) | ((val >>> 26));
			out[outoffset + 13] = (val << 4) & 0x3fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 13] |= (1 << 30) | ((val >>> 28));
			out[outoffset + 14] = (val << 2) & 0x3fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 14] |= (1 << 30) | ((val >>> 30));
			out[outoffset + 15] = (1 << 30) | (val & 0x3fffffff);
		}
	}

	static final void VSER_UNPACK31(int[] out, int outoffset, final int[] in,
	        int inoffset, int bs)
	{
		for (int i = 0; i < bs; i += 31, outoffset += 32)
		{
			int val = in[inoffset + i];
			out[outoffset + 0] = (1 << 31) | ((val >>> 1));
			out[outoffset + 1] = (val << 30) & 0x7fffffff;

			val = in[inoffset + i + 1];
			out[outoffset + 1] |= (1 << 31) | ((val >>> 2));
			out[outoffset + 2] = (val << 29) & 0x7fffffff;

			val = in[inoffset + i + 2];
			out[outoffset + 2] |= (1 << 31) | ((val >>> 3));
			out[outoffset + 3] = (val << 28) & 0x7fffffff;

			val = in[inoffset + i + 3];
			out[outoffset + 3] |= (1 << 31) | ((val >>> 4));
			out[outoffset + 4] = (val << 27) & 0x7fffffff;

			val = in[inoffset + i + 4];
			out[outoffset + 4] |= (1 << 31) | ((val >>> 5));
			out[outoffset + 5] = (val << 26) & 0x7fffffff;

			val = in[inoffset + i + 5];
			out[outoffset + 5] |= (1 << 31) | ((val >>> 6));
			out[outoffset + 6] = (val << 25) & 0x7fffffff;

			val = in[inoffset + i + 6];
			out[outoffset + 6] |= (1 << 31) | ((val >>> 7));
			out[outoffset + 7] = (val << 24) & 0x7fffffff;

			val = in[inoffset + i + 7];
			out[outoffset + 7] |= (1 << 31) | ((val >>> 8));
			out[outoffset + 8] = (val << 23) & 0x7fffffff;

			val = in[inoffset + i + 8];
			out[outoffset + 8] |= (1 << 31) | ((val >>> 9));
			out[outoffset + 9] = (val << 22) & 0x7fffffff;

			val = in[inoffset + i + 9];
			out[outoffset + 9] |= (1 << 31) | ((val >>> 10));
			out[outoffset + 10] = (val << 21) & 0x7fffffff;

			val = in[inoffset + i + 10];
			out[outoffset + 10] |= (1 << 31) | ((val >>> 11));
			out[outoffset + 11] = (val << 20) & 0x7fffffff;

			val = in[inoffset + i + 11];
			out[outoffset + 11] |= (1 << 31) | ((val >>> 12));
			out[outoffset + 12] = (val << 19) & 0x7fffffff;

			val = in[inoffset + i + 12];
			out[outoffset + 12] |= (1 << 31) | ((val >>> 13));
			out[outoffset + 13] = (val << 18) & 0x7fffffff;

			val = in[inoffset + i + 13];
			out[outoffset + 13] |= (1 << 31) | ((val >>> 14));
			out[outoffset + 14] = (val << 17) & 0x7fffffff;

			val = in[inoffset + i + 14];
			out[outoffset + 14] |= (1 << 31) | ((val >>> 15));
			out[outoffset + 15] = (val << 16) & 0x7fffffff;

			val = in[inoffset + i + 15];
			out[outoffset + 15] |= (1 << 31) | ((val >>> 16));
			out[outoffset + 16] = (val << 15) & 0x7fffffff;

			val = in[inoffset + i + 16];
			out[outoffset + 16] |= (1 << 31) | ((val >>> 17));
			out[outoffset + 17] = (val << 14) & 0x7fffffff;

			val = in[inoffset + i + 17];
			out[outoffset + 17] |= (1 << 31) | ((val >>> 18));
			out[outoffset + 18] = (val << 13) & 0x7fffffff;

			val = in[inoffset + i + 18];
			out[outoffset + 18] |= (1 << 31) | ((val >>> 19));
			out[outoffset + 19] = (val << 12) & 0x7fffffff;

			val = in[inoffset + i + 19];
			out[outoffset + 19] |= (1 << 31) | ((val >>> 20));
			out[outoffset + 20] = (val << 11) & 0x7fffffff;

			val = in[inoffset + i + 20];
			out[outoffset + 20] |= (1 << 31) | ((val >>> 21));
			out[outoffset + 21] = (val << 10) & 0x7fffffff;

			val = in[inoffset + i + 21];
			out[outoffset + 21] |= (1 << 31) | ((val >>> 22));
			out[outoffset + 22] = (val << 9) & 0x7fffffff;

			val = in[inoffset + i + 22];
			out[outoffset + 22] |= (1 << 31) | ((val >>> 23));
			out[outoffset + 23] = (val << 8) & 0x7fffffff;

			val = in[inoffset + i + 23];
			out[outoffset + 23] |= (1 << 31) | ((val >>> 24));
			out[outoffset + 24] = (val << 7) & 0x7fffffff;

			val = in[inoffset + i + 24];
			out[outoffset + 24] |= (1 << 31) | ((val >>> 25));
			out[outoffset + 25] = (val << 6) & 0x7fffffff;

			val = in[inoffset + i + 25];
			out[outoffset + 25] |= (1 << 31) | ((val >>> 26));
			out[outoffset + 26] = (val << 5) & 0x7fffffff;

			val = in[inoffset + i + 26];
			out[outoffset + 26] |= (1 << 31) | ((val >>> 27));
			out[outoffset + 27] = (val << 4) & 0x7fffffff;

			val = in[inoffset + i + 27];
			out[outoffset + 27] |= (1 << 31) | ((val >>> 28));
			out[outoffset + 28] = (val << 3) & 0x7fffffff;

			val = in[inoffset + i + 28];
			out[outoffset + 28] |= (1 << 31) | ((val >>> 29));
			out[outoffset + 29] = (val << 2) & 0x7fffffff;

			val = in[inoffset + i + 29];
			out[outoffset + 29] |= (1 << 31) | ((val >>> 30));
			out[outoffset + 30] = (val << 1) & 0x7fffffff;

			val = in[inoffset + i + 30];
			out[outoffset + 30] |= (1 << 31) | ((val >>> 31));
			out[outoffset + 31] = (1 << 31) | (val & 0x7fffffff);
		}
	}

	static final void VSER_UNPACK32(int[] out, int outoffset, final int[] in,
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
	public static void VSER_UNPACK(int option, int[] out, int outoffset,
	        final int[] in, int inoffset, int bs)
	{
		switch (option)
		{
			case 1:
				VSER_UNPACK1(out, outoffset, in, inoffset, bs);
				break;
			case 2:
				VSER_UNPACK2(out, outoffset, in, inoffset, bs);
				break;
			case 3:
				VSER_UNPACK3(out, outoffset, in, inoffset, bs);
				break;
			case 4:
				VSER_UNPACK4(out, outoffset, in, inoffset, bs);
				break;
			case 5:
				VSER_UNPACK5(out, outoffset, in, inoffset, bs);
				break;
			case 6:
				VSER_UNPACK6(out, outoffset, in, inoffset, bs);
				break;
			case 7:
				VSER_UNPACK7(out, outoffset, in, inoffset, bs);
				break;
			case 8:
				VSER_UNPACK8(out, outoffset, in, inoffset, bs);
				break;
			case 9:
				VSER_UNPACK9(out, outoffset, in, inoffset, bs);
				break;
			case 10:
				VSER_UNPACK10(out, outoffset, in, inoffset, bs);
				break;
			case 11:
				VSER_UNPACK11(out, outoffset, in, inoffset, bs);
				break;
			case 12:
				VSER_UNPACK12(out, outoffset, in, inoffset, bs);
				break;
			case 13:
				VSER_UNPACK13(out, outoffset, in, inoffset, bs);
				break;
			case 14:
				VSER_UNPACK14(out, outoffset, in, inoffset, bs);
				break;
			case 15:
				VSER_UNPACK15(out, outoffset, in, inoffset, bs);
				break;
			case 16:
				VSER_UNPACK16(out, outoffset, in, inoffset, bs);
				break;
			case 17:
				VSER_UNPACK17(out, outoffset, in, inoffset, bs);
				break;
			case 18:
				VSER_UNPACK18(out, outoffset, in, inoffset, bs);
				break;
			case 19:
				VSER_UNPACK19(out, outoffset, in, inoffset, bs);
				break;
			case 20:
				VSER_UNPACK20(out, outoffset, in, inoffset, bs);
				break;
			case 21:
				VSER_UNPACK21(out, outoffset, in, inoffset, bs);
				break;
			case 22:
				VSER_UNPACK22(out, outoffset, in, inoffset, bs);
				break;
			case 23:
				VSER_UNPACK23(out, outoffset, in, inoffset, bs);
				break;
			case 24:
				VSER_UNPACK24(out, outoffset, in, inoffset, bs);
				break;
			case 25:
				VSER_UNPACK25(out, outoffset, in, inoffset, bs);
				break;
			case 26:
				VSER_UNPACK26(out, outoffset, in, inoffset, bs);
				break;
			case 27:
				VSER_UNPACK27(out, outoffset, in, inoffset, bs);
				break;
			case 28:
				VSER_UNPACK28(out, outoffset, in, inoffset, bs);
				break;
			case 29:
				VSER_UNPACK29(out, outoffset, in, inoffset, bs);
				break;
			case 30:
				VSER_UNPACK30(out, outoffset, in, inoffset, bs);
				break;
			case 31:
				VSER_UNPACK31(out, outoffset, in, inoffset, bs);
				break;
			case 32:
				VSER_UNPACK32(out, outoffset, in, inoffset, bs);
				break;

			default:
				System.err.println("invalid arguments!");
				break;
		}
	}
}
