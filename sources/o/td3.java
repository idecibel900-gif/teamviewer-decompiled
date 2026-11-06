package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class td3 {
    public static final fs4 a = androidx.compose.foundation.layout.b.l(cs4.b, ka0.x);

    public static final void a(final we3 we3Var, final String str, fs4 fs4Var, long j, ux2 ux2Var, final int i, final int i2) {
        final fs4 fs4Var2;
        final long j2;
        ux2Var.Y(-126890956);
        int i3 = (ux2Var.f(we3Var) ? 4 : 2) | i | (ux2Var.f(str) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && ux2Var.e(j)) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if (i4 != 0) {
                    fs4Var = cs4.b;
                }
                if ((i2 & 8) != 0) {
                    j = ((rv0) ux2Var.j(wa1.a)).a;
                    i3 &= -7169;
                }
            } else {
                ux2Var.Q();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            fs4 fs4Var3 = fs4Var;
            long j3 = j;
            ux2Var.q();
            b(x67.t(we3Var, ux2Var), str, fs4Var3, j3, ux2Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            j2 = j3;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            j2 = j;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.sd3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    td3.a(we3Var, str, fs4Var2, j2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x016e  */
    public static final void b(final ud5 ud5Var, final String str, fs4 fs4Var, long j, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        long j2;
        boolean z;
        final fs4 fs4Var3;
        final long j3;
        j56 j56VarR;
        int i4;
        fs4 fs4Var4;
        long j4;
        boolean z2;
        Object objK;
        fs4 fs4Var5;
        long jI;
        boolean z3;
        Object objK2;
        int i5;
        ux2Var.Y(-2142239481);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? ux2Var.f(ud5Var) : ux2Var.h(ud5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !ux2Var.e(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i3 & 1, z)) {
                ux2Var.S();
                i4 = i & 1;
                fs4Var4 = cs4.b;
                if (i4 != 0 || ux2Var.x()) {
                    if (i6 != 0) {
                        fs4Var2 = fs4Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((rv0) ux2Var.j(wa1.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    ux2Var.Q();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                j4 = j2;
                fs4 fs4Var6 = fs4Var2;
                ux2Var.q();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && ux2Var.e(j4)) || (i3 & 3072) == 2048;
                objK = ux2Var.K();
                aw awVar = e01.a;
                if (z2 || objK == awVar) {
                    if (z68.a(j4, rv0.h)) {
                        objK = null;
                    } else {
                        objK = new t70(5, j4);
                    }
                    ux2Var.g0(objK);
                }
                tv0 tv0Var = (tv0) objK;
                if (str != null) {
                    ux2Var.W(-537002883);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK2 = ux2Var.K();
                    if (z3 || objK2 == awVar) {
                        objK2 = new fy(str, (byte) 11);
                        ux2Var.g0(objK2);
                    }
                    fs4 fs4VarA = cp6.a(fs4Var4, false, (Function1) objK2);
                    ux2Var.p(false);
                    fs4Var5 = fs4VarA;
                } else {
                    ux2Var.W(-536844101);
                    ux2Var.p(false);
                    fs4Var5 = fs4Var4;
                }
                if (y07.a(ud5Var.i(), 9205357640488583168L)) {
                    fs4Var4 = a;
                } else {
                    jI = ud5Var.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                        fs4Var4 = a;
                    }
                }
                ua0.a(androidx.compose.ui.draw.a.a(fs4Var6.f(fs4Var4), ud5Var, null, rb1.b, 0.0f, tv0Var, 22).f(fs4Var5), ux2Var, 0);
                fs4Var3 = fs4Var6;
                j3 = j4;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                j3 = j2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.rd3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        td3.b(ud5Var, str, fs4Var3, j3, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i3 & 1, z)) {
            ux2Var.S();
            i4 = i & 1;
            fs4Var4 = cs4.b;
            if (i4 != 0) {
                if (i6 != 0) {
                    fs4Var2 = fs4Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((rv0) ux2Var.j(wa1.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    fs4Var2 = fs4Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((rv0) ux2Var.j(wa1.a)).a;
                    i3 &= -7169;
                }
            }
            j4 = j2;
            fs4 fs4Var7 = fs4Var2;
            ux2Var.q();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objK = ux2Var.K();
            aw awVar2 = e01.a;
            if (z2) {
                if (z68.a(j4, rv0.h)) {
                    objK = null;
                } else {
                    objK = new t70(5, j4);
                }
                ux2Var.g0(objK);
            } else {
                if (z68.a(j4, rv0.h)) {
                    objK = null;
                } else {
                    objK = new t70(5, j4);
                }
                ux2Var.g0(objK);
            }
            tv0 tv0Var2 = (tv0) objK;
            if (str != null) {
                ux2Var.W(-537002883);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK2 = ux2Var.K();
                if (z3) {
                    objK2 = new fy(str, (byte) 11);
                    ux2Var.g0(objK2);
                } else {
                    objK2 = new fy(str, (byte) 11);
                    ux2Var.g0(objK2);
                }
                fs4 fs4VarA2 = cp6.a(fs4Var4, false, (Function1) objK2);
                ux2Var.p(false);
                fs4Var5 = fs4VarA2;
            } else {
                ux2Var.W(-536844101);
                ux2Var.p(false);
                fs4Var5 = fs4Var4;
            }
            if (y07.a(ud5Var.i(), 9205357640488583168L)) {
                jI = ud5Var.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32)))) {
                    fs4Var4 = a;
                }
            } else {
                fs4Var4 = a;
            }
            ua0.a(androidx.compose.ui.draw.a.a(fs4Var7.f(fs4Var4), ud5Var, null, rb1.b, 0.0f, tv0Var2, 22).f(fs4Var5), ux2Var, 0);
            fs4Var3 = fs4Var7;
            j3 = j4;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
            j3 = j2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.rd3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    td3.b(ud5Var, str, fs4Var3, j3, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }
}
