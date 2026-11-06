package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class yc7 {
    public static final int[] a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final xc7 n;

    static {
        int[] iArr = new int[61];
        a = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
        b = f(1);
        c = f(8);
        d = f(2);
        e = f(4);
        f = f(32);
        g = f(16);
        h = d(1);
        i = d(8);
        j = d(2);
        k = d(4);
        l = d(32);
        m = d(16);
        n = new xc7();
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0558  */
    /* JADX WARN: Code duplicated, block: B:249:0x0587  */
    /* JADX WARN: Code duplicated, block: B:250:0x0589  */
    public static final void a(xc7 xc7Var, xc7 xc7Var2, a65 a65Var, long j2, int i2, xc7 xc7Var3) {
        double d2;
        int i3;
        float f2;
        es7 es7Var;
        long j3;
        long j4;
        long j5;
        tv0 g94Var;
        Object objB;
        long jI = i(i2, j2);
        int iH = h(i2, j2) & (xc7Var.b | xc7Var2.b);
        long j6 = (xc7Var.a | xc7Var2.a) & jI;
        if ((iH & 135) != 0) {
            if ((iH & 1) != 0) {
                j6 &= -34359738369L;
            }
            if ((iH & 128) != 0) {
                j6 &= -137438953473L;
            }
            if ((iH & 2) != 0) {
                j6 &= -17179869185L;
            }
            if ((iH & 4) != 0) {
                j6 &= -68719476737L;
            }
        }
        long j7 = 0;
        if (j6 == 0 && iH == 0) {
            return;
        }
        float f3 = 1.0f;
        if ((c & j6) != 0) {
            if ((j6 & 16) != 0) {
                float fV0 = a65Var.V0(4);
                float f4 = xc7Var.g;
                float f5 = xc7Var2.g;
                boolean zIsNaN = Float.isNaN(f4);
                boolean zIsNaN2 = Float.isNaN(f5);
                float f6 = (fV0 * f5) + ((1.0f - fV0) * f4);
                if (zIsNaN) {
                    f4 = f5;
                } else if (!zIsNaN2) {
                    f4 = f6;
                }
                xc7Var3.a |= 16;
                xc7Var3.g = f4;
            }
            if ((j6 & 32) != j7) {
                float fV1 = a65Var.V0(5);
                float f7 = xc7Var.h;
                float f8 = xc7Var2.h;
                boolean zIsNaN3 = Float.isNaN(f7);
                boolean zIsNaN4 = Float.isNaN(f8);
                float f9 = (fV1 * f8) + ((1.0f - fV1) * f7);
                if (zIsNaN3) {
                    f7 = f8;
                } else if (!zIsNaN4) {
                    f7 = f9;
                }
                xc7Var3.a = 32 | xc7Var3.a;
                xc7Var3.h = f7;
            }
            if ((j6 & 64) != j7) {
                float fV2 = a65Var.V0(6);
                float f10 = xc7Var.i;
                float f11 = xc7Var2.i;
                boolean zIsNaN5 = Float.isNaN(f10);
                boolean zIsNaN6 = Float.isNaN(f11);
                float f12 = (fV2 * f11) + ((1.0f - fV2) * f10);
                if (zIsNaN5) {
                    f10 = f11;
                } else if (!zIsNaN6) {
                    f10 = f12;
                }
                xc7Var3.a = 64 | xc7Var3.a;
                xc7Var3.i = f10;
            }
            if ((j6 & 128) != j7) {
                float fV3 = a65Var.V0(7);
                float f13 = xc7Var.j;
                float f14 = xc7Var2.j;
                boolean zIsNaN7 = Float.isNaN(f13);
                boolean zIsNaN8 = Float.isNaN(f14);
                float f15 = (fV3 * f14) + ((1.0f - fV3) * f13);
                if (zIsNaN7) {
                    f13 = f14;
                } else if (!zIsNaN8) {
                    f13 = f15;
                }
                xc7Var3.a = 128 | xc7Var3.a;
                xc7Var3.j = f13;
            }
            if ((j6 & 8192) != j7) {
                float fV4 = a65Var.V0(13);
                float f16 = xc7Var.p;
                float f17 = xc7Var2.p;
                boolean zIsNaN9 = Float.isNaN(f16);
                boolean zIsNaN10 = Float.isNaN(f17);
                float f18 = (fV4 * f17) + ((1.0f - fV4) * f16);
                if (zIsNaN9) {
                    f16 = f17;
                } else if (!zIsNaN10) {
                    f16 = f18;
                }
                xc7Var3.a = 8192 | xc7Var3.a;
                xc7Var3.p = f16;
            }
            if ((j6 & 16384) != j7) {
                float fV5 = a65Var.V0(14);
                float f19 = xc7Var.q;
                float f20 = xc7Var2.q;
                boolean zIsNaN11 = Float.isNaN(f19);
                boolean zIsNaN12 = Float.isNaN(f20);
                float f21 = (fV5 * f20) + ((1.0f - fV5) * f19);
                if (zIsNaN11) {
                    f19 = f20;
                } else if (!zIsNaN12) {
                    f19 = f21;
                }
                xc7Var3.a = 16384 | xc7Var3.a;
                xc7Var3.q = f19;
            }
            if ((j6 & 32768) != j7) {
                float fV6 = a65Var.V0(15);
                float f22 = xc7Var.r;
                float f23 = xc7Var2.r;
                boolean zIsNaN13 = Float.isNaN(f22);
                boolean zIsNaN14 = Float.isNaN(f23);
                float f24 = (fV6 * f23) + ((1.0f - fV6) * f22);
                if (zIsNaN13) {
                    f22 = f23;
                } else if (!zIsNaN14) {
                    f22 = f24;
                }
                xc7Var3.a = 32768 | xc7Var3.a;
                xc7Var3.r = f22;
            }
            if ((j6 & 65536) != j7) {
                float fV7 = a65Var.V0(16);
                float f25 = xc7Var.s;
                float f26 = xc7Var2.s;
                boolean zIsNaN15 = Float.isNaN(f25);
                boolean zIsNaN16 = Float.isNaN(f26);
                float f27 = (fV7 * f26) + ((1.0f - fV7) * f25);
                if (zIsNaN15) {
                    f25 = f26;
                } else if (!zIsNaN16) {
                    f25 = f27;
                }
                xc7Var3.a = 65536 | xc7Var3.a;
                xc7Var3.s = f25;
            }
            if ((j6 & 512) != j7) {
                float fV8 = a65Var.V0(9);
                float f28 = xc7Var.l;
                float f29 = xc7Var2.l;
                boolean zIsNaN17 = Float.isNaN(f28);
                boolean zIsNaN18 = Float.isNaN(f29);
                float f30 = (fV8 * f29) + ((1.0f - fV8) * f28);
                if (zIsNaN17) {
                    f28 = f29;
                } else if (!zIsNaN18) {
                    f28 = f30;
                }
                xc7Var3.a = (512 | xc7Var3.a) & (-2049);
                xc7Var3.l = f28;
                xc7Var3.n = Float.NaN;
            }
            if ((j6 & 1024) != j7) {
                float fV9 = a65Var.V0(10);
                float f31 = xc7Var.m;
                float f32 = xc7Var2.m;
                boolean zIsNaN19 = Float.isNaN(f31);
                boolean zIsNaN20 = Float.isNaN(f32);
                float f33 = (fV9 * f32) + ((1.0f - fV9) * f31);
                if (zIsNaN19) {
                    f31 = f32;
                } else if (!zIsNaN20) {
                    f31 = f33;
                }
                xc7Var3.a = (1024 | xc7Var3.a) & (-4097);
                xc7Var3.m = f31;
                xc7Var3.f2506o = Float.NaN;
            }
            if ((j6 & 2048) != j7) {
                float fV10 = a65Var.V0(11);
                float f34 = xc7Var.n;
                float f35 = xc7Var2.n;
                boolean zIsNaN21 = Float.isNaN(f34);
                boolean zIsNaN22 = Float.isNaN(f35);
                float f36 = (fV10 * f35) + ((1.0f - fV10) * f34);
                if (zIsNaN21) {
                    f34 = f35;
                } else if (!zIsNaN22) {
                    f34 = f36;
                }
                xc7Var3.a = 2048 | (xc7Var3.a & (-513));
                xc7Var3.n = f34;
                xc7Var3.l = Float.NaN;
            }
            if ((j6 & 4096) != j7) {
                float fV11 = a65Var.V0(12);
                float f37 = xc7Var.f2506o;
                float f38 = xc7Var2.f2506o;
                boolean zIsNaN23 = Float.isNaN(f37);
                boolean zIsNaN24 = Float.isNaN(f38);
                float f39 = (fV11 * f38) + ((1.0f - fV11) * f37);
                if (zIsNaN23) {
                    f37 = f38;
                } else if (!zIsNaN24) {
                    f37 = f39;
                }
                xc7Var3.a = 4096 | (xc7Var3.a & (-1025));
                xc7Var3.f2506o = f37;
                xc7Var3.m = Float.NaN;
            }
            if ((j6 & 131072) != j7) {
                float fV12 = a65Var.V0(17);
                float f40 = xc7Var.v;
                float f41 = xc7Var2.v;
                boolean zIsNaN25 = Float.isNaN(f40);
                boolean zIsNaN26 = Float.isNaN(f41);
                float f42 = (fV12 * f41) + ((1.0f - fV12) * f40);
                if (zIsNaN25) {
                    f40 = f41;
                } else if (!zIsNaN26) {
                    f40 = f42;
                }
                xc7Var3.a = 131072 | xc7Var3.a;
                xc7Var3.v = f40;
            }
            if ((j6 & 524288) != j7) {
                float fV13 = a65Var.V0(19);
                float f43 = xc7Var.w;
                float f44 = xc7Var2.w;
                boolean zIsNaN27 = Float.isNaN(f43);
                boolean zIsNaN28 = Float.isNaN(f44);
                float f45 = (fV13 * f44) + ((1.0f - fV13) * f43);
                if (zIsNaN27) {
                    f43 = f44;
                } else if (!zIsNaN28) {
                    f43 = f45;
                }
                xc7Var3.a = 524288 | xc7Var3.a;
                xc7Var3.w = f43;
            }
            if ((j6 & 262144) != j7) {
                float fV14 = a65Var.V0(18);
                float f46 = xc7Var.t;
                float f47 = xc7Var2.t;
                boolean zIsNaN29 = Float.isNaN(f46);
                boolean zIsNaN30 = Float.isNaN(f47);
                float f48 = (fV14 * f47) + ((1.0f - fV14) * f46);
                if (zIsNaN29) {
                    f46 = f47;
                } else if (!zIsNaN30) {
                    f46 = f48;
                }
                xc7Var3.a = 262144 | xc7Var3.a;
                xc7Var3.t = f46;
            }
            if ((j6 & io.sentry.g7.MAX_EVENT_SIZE_BYTES) != j7) {
                float fV15 = a65Var.V0(20);
                float f49 = xc7Var.u;
                float f50 = xc7Var2.u;
                boolean zIsNaN31 = Float.isNaN(f49);
                boolean zIsNaN32 = Float.isNaN(f50);
                float f51 = (fV15 * f50) + ((1.0f - fV15) * f49);
                if (zIsNaN31) {
                    f49 = f50;
                } else if (!zIsNaN32) {
                    f49 = f51;
                }
                xc7Var3.a = io.sentry.g7.MAX_EVENT_SIZE_BYTES | xc7Var3.a;
                xc7Var3.u = f49;
            }
        } else {
            j7 = 0;
        }
        if ((b & j6) != j7) {
            if ((j6 & 1) != j7) {
                float fG = vs1.G(xc7Var.c, xc7Var2.c, a65Var.V0(0));
                xc7Var3.a = 1 | xc7Var3.a;
                xc7Var3.c = fG;
            }
            if ((j6 & 2) != j7) {
                float fG2 = vs1.G(xc7Var.d, xc7Var2.d, a65Var.V0(1));
                xc7Var3.a = 2 | xc7Var3.a;
                xc7Var3.d = fG2;
            }
            if ((j6 & 4) != j7) {
                float fG3 = vs1.G(xc7Var.e, xc7Var2.e, a65Var.V0(2));
                xc7Var3.a = 4 | xc7Var3.a;
                xc7Var3.e = fG3;
            }
            if ((j6 & 8) != j7) {
                float fG4 = vs1.G(xc7Var.f, xc7Var2.f, a65Var.V0(3));
                xc7Var3.a = 8 | xc7Var3.a;
                xc7Var3.f = fG4;
            }
        }
        if ((d & j6) != j7) {
            if ((j6 & 256) != j7) {
                float fG5 = vs1.G(xc7Var.k, xc7Var2.k, a65Var.V0(8));
                xc7Var3.a |= 256;
                xc7Var3.k = fG5;
            }
            if ((34359738368L & j6) != j7) {
                xc7Var3.d(j51.K(xc7Var.x, xc7Var2.x, a65Var.V0(50)));
            }
            if ((17179869184L & j6) != j7) {
                xc7Var3.b(j51.K(xc7Var.z, xc7Var2.z, a65Var.V0(51)));
            }
            if ((j6 & 68719476736L) != j7) {
                long jK = j51.K(xc7Var.B, xc7Var2.B, a65Var.V0(52));
                xc7Var3.a |= 68719476736L;
                xc7Var3.b &= -5;
                xc7Var3.B = jK;
                xc7Var3.C = null;
            }
        } else {
            f3 = 1.0f;
        }
        if ((j & iH) != 0) {
            if ((iH & 1) != 0) {
                d2 = 0.5d;
                i3 = 32;
                f2 = 0.5f;
                xc7Var3.c(b(xc7Var.y, xc7Var.x, xc7Var2.y, xc7Var2.x, a65Var.V0(50)));
            } else {
                d2 = 0.5d;
                i3 = 32;
                f2 = 0.5f;
            }
            if ((iH & 2) != 0) {
                xc7Var3.a(b(xc7Var.A, xc7Var.z, xc7Var2.A, xc7Var2.z, a65Var.V0(51)));
            }
            if ((iH & 4) != 0) {
                xc7Var3.m(b(xc7Var.C, xc7Var.B, xc7Var2.C, xc7Var2.B, a65Var.V0(52)));
            }
            if ((iH & 64) != 0) {
                Object objC = c(a65Var.V0(56), xc7Var.G, xc7Var2.G);
                int i4 = xc7Var3.b;
                xc7Var3.b = objC != null ? i4 | 64 : i4 & (-65);
                xc7Var3.G = objC;
            }
            if ((iH & 32) != 0) {
                Object objC2 = c(a65Var.V0(55), xc7Var.F, xc7Var2.F);
                int i5 = xc7Var3.b;
                xc7Var3.b = objC2 != null ? i5 | 32 : i5 & (-33);
                xc7Var3.F = objC2;
            }
            if ((iH & 8) != 0) {
                float fV16 = a65Var.V0(53);
                pw6 pw6Var = xc7Var.E;
                pw6 pw6Var2 = xc7Var2.E;
                if (fV16 != 0.0f) {
                    if (fV16 != f3) {
                        if (!im3.n(pw6Var, pw6Var2)) {
                            objB = pw6Var instanceof yl3 ? ((yl3) pw6Var).b(fV16, pw6Var2) : null;
                            if (objB == null && (pw6Var2 instanceof yl3)) {
                                objB = ((yl3) pw6Var2).b(f3 - fV16, pw6Var);
                            }
                            if (objB == null) {
                                if (fV16 < f2) {
                                    objB = pw6Var;
                                } else {
                                    objB = pw6Var2;
                                }
                            }
                        } else if (fV16 < f2) {
                            objB = pw6Var;
                        } else {
                            objB = pw6Var2;
                        }
                        pw6 pw6Var3 = objB instanceof pw6 ? (pw6) objB : null;
                        if (pw6Var3 != null) {
                            pw6Var = pw6Var3;
                        } else if (fV16 >= d2) {
                            pw6Var = pw6Var2;
                        }
                    } else {
                        pw6Var = pw6Var2;
                    }
                }
                xc7Var3.b |= 8;
                xc7Var3.E = pw6Var;
            }
        } else {
            d2 = 0.5d;
            i3 = 32;
            f2 = 0.5f;
        }
        if ((e & j6) != j7) {
            if ((j6 & 2097152) != j7) {
                float fG6 = vs1.G(xc7Var.H, xc7Var2.H, a65Var.V0(21));
                xc7Var3.a = 2097152 | xc7Var3.a;
                xc7Var3.H = fG6;
            }
            if ((j6 & 4194304) != j7) {
                float fG7 = vs1.G(xc7Var.I, xc7Var2.I, a65Var.V0(22));
                xc7Var3.a = 4194304 | xc7Var3.a;
                xc7Var3.I = fG7;
            }
            if ((j6 & 8388608) != j7) {
                float fG8 = vs1.G(xc7Var.J, xc7Var2.J, a65Var.V0(23));
                xc7Var3.a = 8388608 | xc7Var3.a;
                xc7Var3.J = fG8;
            }
            if ((j6 & 16777216) != j7) {
                float fG9 = vs1.G(xc7Var.K, xc7Var2.K, a65Var.V0(24));
                xc7Var3.a |= 16777216;
                xc7Var3.K = fG9;
            }
            if ((j6 & 33554432) != j7) {
                float fG10 = vs1.G(xc7Var.L, xc7Var2.L, a65Var.V0(25));
                xc7Var3.a |= 33554432;
                xc7Var3.L = fG10;
            }
            if ((j6 & 67108864) != j7) {
                float fG11 = vs1.G(xc7Var.M, xc7Var2.M, a65Var.V0(26));
                xc7Var3.a |= 67108864;
                xc7Var3.M = fG11;
            }
            if ((j6 & 134217728) != j7) {
                float fG12 = vs1.G(xc7Var.N, xc7Var2.N, a65Var.V0(27));
                xc7Var3.a = 134217728 | xc7Var3.a;
                xc7Var3.N = fG12;
            }
            if ((j6 & 268435456) != j7) {
                float fG13 = vs1.G(xc7Var.O, xc7Var2.O, a65Var.V0(28));
                xc7Var3.a = 268435456 | xc7Var3.a;
                xc7Var3.O = fG13;
            }
            if ((536870912 & j6) != j7) {
                float fG14 = vs1.G(xc7Var.P, xc7Var2.P, a65Var.V0(29));
                xc7Var3.a |= 16777216;
                xc7Var3.K = fG14;
            }
            if ((1073741824 & j6) != j7) {
                float fG15 = vs1.G(xc7Var.Q, xc7Var2.Q, a65Var.V0(30));
                xc7Var3.a |= 33554432;
                xc7Var3.L = fG15;
            }
            if ((4294967296L & j6) != j7) {
                float fG16 = vs1.G(xc7Var.R, xc7Var2.R, a65Var.V0(i3));
                xc7Var3.a |= 4294967296L;
                xc7Var3.R = fG16;
            }
            if ((2147483648L & j6) != j7) {
                boolean z = (a65Var.V0(31) < f2 ? xc7Var : xc7Var2).D;
                xc7Var3.a |= 2147483648L;
                xc7Var3.D = z;
            }
        }
        if ((k & iH) != 0 && (iH & 16) != 0) {
            float fV17 = a65Var.V0(54);
            tv0 tv0Var = xc7Var.S;
            tv0 tv0Var2 = xc7Var2.S;
            if ((tv0Var instanceof t70) && (tv0Var2 instanceof t70)) {
                t70 t70Var = (t70) tv0Var;
                t70 t70Var2 = (t70) tv0Var2;
                g94Var = new t70((fV17 <= f2 ? t70Var : t70Var2).c, j51.K(t70Var.b, t70Var2.b, fV17));
            } else {
                if ((tv0Var instanceof g94) && (tv0Var2 instanceof g94)) {
                    g94 g94Var2 = (g94) tv0Var;
                    g94 g94Var3 = (g94) tv0Var2;
                    g94Var = new g94(j51.K(g94Var2.b, g94Var3.b, fV17), j51.K(g94Var2.c, g94Var3.c, fV17));
                } else if (fV17 > f2) {
                    tv0Var = tv0Var2;
                }
                xc7Var3.b |= 16;
                xc7Var3.S = tv0Var;
            }
            tv0Var = g94Var;
            xc7Var3.b |= 16;
            xc7Var3.S = tv0Var;
        }
        if ((137438953472L & j6) != j7) {
            long jK2 = j51.K(xc7Var.T, xc7Var2.T, a65Var.V0(57));
            xc7Var3.a |= 137438953472L;
            xc7Var3.b &= -129;
            xc7Var3.T = jK2;
            xc7Var3.U = null;
        }
        if ((iH & 128) != 0) {
            xc7Var3.e(b(xc7Var.U, xc7Var.T, xc7Var2.U, xc7Var2.T, a65Var.V0(57)));
        }
        if ((g & j6) != j7) {
            if ((j6 & 274877906944L) != j7) {
                xc7Var3.z(((xc7Var.a & 274877906944L) == j7 || ((274877906944L & xc7Var2.a) != j7 && ((double) a65Var.V0(38)) >= d2)) ? xc7Var2.t() : xc7Var.t());
            }
            if ((j6 & 70368744177664L) != j7) {
                if ((xc7Var.a & 70368744177664L) == j7) {
                    j5 = xc7Var2.W;
                } else if ((xc7Var2.a & 70368744177664L) != j7) {
                    j5 = (((double) a65Var.V0(46)) < d2 ? xc7Var : xc7Var2).W;
                } else {
                    j5 = xc7Var.W;
                }
                xc7Var3.a = 70368744177664L | xc7Var3.a;
                xc7Var3.W = j5;
            }
            if ((j6 & 140737488355328L) != j7) {
                if ((xc7Var.a & 140737488355328L) == j7) {
                    j4 = xc7Var2.X;
                } else if ((xc7Var2.a & 140737488355328L) != j7) {
                    j4 = (((double) a65Var.V0(47)) < d2 ? xc7Var : xc7Var2).X;
                } else {
                    j4 = xc7Var.X;
                }
                xc7Var3.a = 140737488355328L | xc7Var3.a;
                xc7Var3.X = j4;
            }
            if ((j6 & 281474976710656L) != j7) {
                if ((xc7Var.a & 281474976710656L) == j7) {
                    j3 = xc7Var2.Y;
                } else if ((xc7Var2.a & 281474976710656L) != j7) {
                    j3 = (((double) a65Var.V0(48)) < d2 ? xc7Var : xc7Var2).Y;
                } else {
                    j3 = xc7Var.Y;
                }
                xc7Var3.a = 281474976710656L | xc7Var3.a;
                xc7Var3.Y = j3;
            }
            if ((j6 & 8796093022208L) != j7) {
                if ((xc7Var.a & 8796093022208L) != j7 && (xc7Var2.a & 8796093022208L) != j7) {
                    a65Var.V0(43);
                }
                xc7Var3.a = 8796093022208L | xc7Var3.a;
            }
            if ((j6 & 562949953421312L) != j7) {
                if ((xc7Var.a & 562949953421312L) != j7 && (xc7Var2.a & 562949953421312L) != j7) {
                    a65Var.V0(49);
                }
                xc7Var3.a = 562949953421312L | xc7Var3.a;
            }
            if ((j6 & 2199023255552L) != j7) {
                xc7Var3.y(((xc7Var.a & 2199023255552L) == j7 || ((2199023255552L & xc7Var2.a) != j7 && ((double) a65Var.V0(41)) >= d2)) ? xc7Var2.s() : xc7Var.s());
            }
            if ((j6 & 4398046511104L) != j7) {
                xc7Var3.A(((xc7Var.a & 4398046511104L) == j7 || ((4398046511104L & xc7Var2.a) != j7 && ((double) a65Var.V0(42)) >= d2)) ? xc7Var2.u() : xc7Var.u());
            }
            if ((j6 & 17592186044416L) != j7) {
                xc7Var3.x(((xc7Var.a & 17592186044416L) == j7 || ((17592186044416L & xc7Var2.a) != j7 && ((double) a65Var.V0(44)) >= d2)) ? xc7Var2.q() : xc7Var.q());
            }
            if ((j6 & 35184372088832L) != j7) {
                xc7Var3.k(((xc7Var.a & 35184372088832L) == j7 || ((35184372088832L & xc7Var2.a) != j7 && ((double) a65Var.V0(45)) >= d2)) ? xc7Var2.o() : xc7Var.o());
            }
            if ((j6 & 549755813888L) != j7) {
                xc7Var3.l(((xc7Var.a & 549755813888L) == j7 || ((549755813888L & xc7Var2.a) != j7 && ((double) a65Var.V0(39)) >= d2)) ? xc7Var2.p() : xc7Var.p());
            }
            if ((j6 & 1099511627776L) != j7) {
                xc7Var3.j(((xc7Var.a & 1099511627776L) == j7 || ((xc7Var2.a & 1099511627776L) != j7 && ((double) a65Var.V0(40)) >= d2)) ? xc7Var2.n() : xc7Var.n());
            }
        }
        if ((m & iH) != 0) {
            if ((iH & 256) != 0) {
                if ((xc7Var.b & 256) != 0 && (xc7Var2.b & 256) != 0) {
                    a65Var.V0(58);
                }
                xc7Var3.b |= 256;
            }
            if ((iH & 512) != 0) {
                if ((xc7Var.b & 512) != 0 && (xc7Var2.b & 512) != 0) {
                    a65Var.V0(59);
                }
                xc7Var3.b |= 512;
            }
            if ((iH & 1024) != 0) {
                if ((xc7Var.b & 1024) != 0) {
                    es7Var = ((xc7Var2.b & 1024) == 0 || ((double) a65Var.V0(60)) < d2) ? xc7Var.V : xc7Var2.V;
                } else {
                    es7Var = xc7Var2.V;
                }
                es7Var.getClass();
                xc7Var3.b |= 1024;
                xc7Var3.V = es7Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    public static final sb0 b(sb0 sb0Var, long j2, sb0 sb0Var2, long j3, float f2) {
        Object objB;
        if (sb0Var == null && sb0Var2 == null) {
            return null;
        }
        if (sb0Var == null) {
            sb0Var = new t57(j2);
        } else if (sb0Var2 == null) {
            sb0Var2 = new t57(j3);
        }
        if (!sb0Var.equals(sb0Var2)) {
            objB = sb0Var instanceof yl3 ? ((yl3) sb0Var).b(f2, sb0Var2) : null;
            if (objB == null && (sb0Var2 instanceof yl3)) {
                objB = ((yl3) sb0Var2).b(1.0f - f2, sb0Var);
            }
            if (objB == null) {
                if (f2 < 0.5f) {
                    objB = sb0Var;
                } else {
                    objB = sb0Var2;
                }
            }
        } else if (f2 < 0.5f) {
            objB = sb0Var;
        } else {
            objB = sb0Var2;
        }
        sb0 sb0Var3 = objB instanceof sb0 ? (sb0) objB : null;
        if (sb0Var3 == null) {
            return ((double) f2) < 0.5d ? sb0Var : sb0Var2;
        }
        return sb0Var3;
    }

    public static final Object c(float f2, Object obj, Object obj2) {
        Object[] objArr;
        Object[] objArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return null;
        }
        if (z) {
            objArr = (kw6[]) obj;
        } else {
            obj.getClass();
            objArr = new kw6[]{obj};
        }
        if (z2) {
            objArr2 = (kw6[]) obj2;
        } else {
            obj2.getClass();
            objArr2 = new kw6[]{obj2};
        }
        int iMax = Math.max(objArr.length, objArr2.length);
        kw6[] kw6VarArr = new kw6[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            kw6VarArr[i2] = null;
        }
        for (int i3 = 0; i3 < iMax; i3++) {
            kw6VarArr[i3] = null;
        }
        return kw6VarArr;
    }

    public static final int d(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((a[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int e(int i2) {
        return ((h & i2) != 0 ? 1 : 0) | ((i & i2) != 0 ? 8 : 0) | ((j & i2) != 0 ? 2 : 0) | ((k & i2) != 0 ? 4 : 0) | ((l & i2) != 0 ? 32 : 0) | ((i2 & m) != 0 ? 16 : 0);
    }

    public static final long f(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((a[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int g(long j2) {
        return ((b & j2) != 0 ? 1 : 0) | ((c & j2) != 0 ? 8 : 0) | ((d & j2) != 0 ? 2 : 0) | ((e & j2) != 0 ? 4 : 0) | ((f & j2) != 0 ? 32 : 0) | ((j2 & g) != 0 ? 16 : 0);
    }

    public static final int h(int i2, long j2) {
        if ((257698037760L & j2) == 0) {
            return i2;
        }
        if ((34359738368L & j2) != 0) {
            i2 |= 1;
        }
        if ((137438953472L & j2) != 0) {
            i2 |= 128;
        }
        if ((17179869184L & j2) != 0) {
            i2 |= 2;
        }
        return (j2 & 68719476736L) != 0 ? i2 | 4 : i2;
    }

    public static final long i(int i2, long j2) {
        if ((i2 & 135) != 0) {
            if ((i2 & 1) != 0) {
                j2 |= 34359738368L;
            }
            if ((i2 & 128) != 0) {
                j2 |= 137438953472L;
            }
            if ((i2 & 2) != 0) {
                j2 |= 17179869184L;
            }
            if ((i2 & 4) != 0) {
                return j2 | 68719476736L;
            }
        }
        return j2;
    }
}
