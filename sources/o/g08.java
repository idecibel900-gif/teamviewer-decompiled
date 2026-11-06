package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g08 {
    public static final pd5 a = new pd5(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final i08 i08Var, final fs4 fs4Var, final float f, final pw6 pw6Var, final long j, final long j2, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        long j3;
        ux2Var.Y(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(i08Var) : ux2Var.h(i08Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(pw6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j3 = j2;
            i2 |= ux2Var.e(j3) ? 1048576 : 524288;
        } else {
            j3 = j2;
        }
        if ((i & 12582912) == 0) {
            i2 |= ux2Var.c(0.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ux2Var.c(0.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 536870912 : 268435456;
        }
        if (ux2Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            ux2Var.W(-1719803223);
            ux2Var.p(false);
            int i3 = 12582912 | ((i2 >> 12) & 896);
            int i4 = i2 >> 9;
            ig7.a(fs4Var, pw6Var, j3, 0L, 0.0f, 0.0f, au8.O(-1573998995, new hw2() { // from class: o.e08
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.o(cs4.b, 40.0f, 24.0f, f, 8), g08.a);
                        do4 do4VarC = ua0.c(xz2.f2564o, false);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(LayoutNode.e0);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(do4VarC, d82.v, ux2Var2);
                        o67.n(yj5VarL, d82.u, ux2Var2);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                        o67.l(ux2Var2);
                        o67.n(fs4VarS, d82.t, ux2Var2);
                        j51.m(new dx5[]{wa1.a.a(new rv0(j)), qs7.a.a(k68.a(xk0.u, ux2Var2))}, yy0Var, ux2Var2, 8);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, i3 | (57344 & i4) | (i4 & 458752), 72);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.f08
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g08.a(i08Var, fs4Var, f, pw6Var, j, j2, yy0Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final i08 i08Var, final String str, fs4 fs4Var, float f, pw6 pw6Var, long j, long j2, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        final fs4 fs4Var2;
        final float f2;
        final pw6 pw6Var2;
        final long j3;
        final long j4;
        float f3;
        pw6 pw6VarB;
        int i3;
        long jC;
        long j5;
        fs4 fs4Var3;
        ux2Var.Y(1931523930);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ux2Var.f(i08Var) : ux2Var.h(i08Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(str) ? 32 : 16;
        }
        int i4 = i2 | 28032;
        if ((i & 196608) == 0) {
            i4 = 93568 | i2;
        }
        if ((i & 1572864) == 0) {
            i4 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= 4194304;
        }
        int i5 = 905969664 | i4;
        if (ux2Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            ux2Var.S();
            int i6 = i & 1;
            cs4 cs4Var = cs4.b;
            if (i6 == 0 || ux2Var.x()) {
                f3 = b08.a;
                pw6VarB = ux6.b(xk0.s, ux2Var);
                long jC2 = bw0.c(xk0.t, ux2Var);
                i3 = i5 & (-33488897);
                jC = bw0.c(xk0.r, ux2Var);
                j5 = jC2;
                fs4Var3 = cs4Var;
            } else {
                ux2Var.Q();
                i3 = i5 & (-33488897);
                fs4Var3 = fs4Var;
                f3 = f;
                pw6VarB = pw6Var;
                j5 = j;
                jC = j2;
            }
            ux2Var.q();
            boolean z = (i3 & 112) == 32;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new fy(str, (byte) 24);
                ux2Var.g0(objK);
            }
            fs4 fs4VarF = cp6.a(cs4Var, false, (Function1) objK).f(fs4Var3);
            int i7 = i3 & 14;
            int i8 = i3 >> 3;
            int i9 = (i8 & 234881024) | i7 | (i8 & 896) | (i8 & 7168) | (29360128 & i8) | 805306368;
            pw6 pw6Var3 = pw6VarB;
            long j6 = j5;
            a(i08Var, fs4VarF, f3, pw6Var3, j6, jC, yy0Var, ux2Var, i9);
            j4 = jC;
            j3 = j6;
            f2 = f3;
            pw6Var2 = pw6Var3;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            f2 = f;
            pw6Var2 = pw6Var;
            j3 = j;
            j4 = j2;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.d08
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g08.b(i08Var, str, fs4Var2, f2, pw6Var2, j3, j4, yy0Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0237  */
    /* JADX WARN: Code duplicated, block: B:125:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:130:0x026a  */
    /* JADX WARN: Code duplicated, block: B:134:0x028a  */
    /* JADX WARN: Code duplicated, block: B:138:0x029f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0305  */
    /* JADX WARN: Code duplicated, block: B:143:0x0311  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    public static final void c(final bp5 bp5Var, final yy0 yy0Var, final k08 k08Var, fs4 fs4Var, boolean z, final hw2 hw2Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        boolean z2;
        final fs4 fs4Var3;
        final boolean z3;
        j56 j56VarR;
        fs4 fs4Var4;
        u18 u18VarG0;
        Object objK;
        Object obj;
        px4 px4Var;
        Object objK2;
        Object objK3;
        px4 px4Var2;
        Object objK4;
        boolean zG;
        g2 g2Var;
        Object objP0;
        boolean zBooleanValue;
        float f;
        boolean zF;
        Object objK5;
        boolean zBooleanValue2;
        float f2;
        boolean zF2;
        Object objK6;
        boolean z4;
        Object objP1;
        boolean zBooleanValue3;
        float f3;
        boolean zF3;
        Object objK7;
        boolean zF4;
        Object objK8;
        boolean zF5;
        n47 n47VarC;
        Function1 function1E;
        n47 n47VarF;
        boolean zF6;
        Object objK9;
        n47 n47VarC2;
        Function1 function1E2;
        n47 n47VarF2;
        int i5;
        ux2Var.Y(-293753984);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(bp5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? ux2Var.f(k08Var) : ux2Var.h(k08Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
            }
            i4 = i3 | 14376960;
            if ((100663296 & i) == 0) {
                if (ux2Var.h(hw2Var)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i4 |= i5;
            }
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i4 & 1, z2)) {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                u18VarG0 = ck3.g0(k08Var.b, "tooltip transition", ux2Var, 48);
                objK = ux2Var.K();
                obj = e01.a;
                if (objK == obj) {
                    objK = h57.p(null);
                    ux2Var.g0(objK);
                }
                px4Var = (px4) objK;
                objK2 = ux2Var.K();
                if (objK2 == obj) {
                    new j44(px4Var, (byte) 17);
                    objK2 = new i08();
                    ux2Var.g0(objK2);
                }
                i08 i08Var = (i08) objK2;
                yy0 yy0VarO = au8.O(-23901870, new sr7(px4Var, hw2Var, (byte) 1), ux2Var);
                objK3 = ux2Var.K();
                if (objK3 == obj) {
                    objK3 = h57.p(null);
                    ux2Var.g0(objK3);
                }
                px4Var2 = (px4) objK3;
                objK4 = ux2Var.K();
                if (objK4 == obj) {
                    objK4 = d57.b(new fn3(px4Var, px4Var2, (byte) 1));
                    ux2Var.g0(objK4);
                }
                i97 i97Var = (i97) objK4;
                e87 e87VarC0 = xs1.c0(du4.n, ux2Var);
                e87 e87VarC1 = xs1.c0(du4.p, ux2Var);
                yn1 yn1Var = vn4.j0;
                zG = u18VarG0.g();
                g2Var = u18VarG0.a;
                if (zG) {
                    ux2Var.W(1666827533);
                    ux2Var.p(false);
                    objP0 = g2Var.p0();
                } else {
                    ux2Var.W(1666573488);
                    zF6 = ux2Var.f(u18VarG0);
                    objK9 = ux2Var.K();
                    if (zF6 || objK9 == obj) {
                        n47VarC2 = el5.c();
                        if (n47VarC2 != null) {
                            function1E2 = n47VarC2.e();
                        } else {
                            function1E2 = null;
                        }
                        n47VarF2 = el5.f(n47VarC2);
                        try {
                            Object objP2 = g2Var.p0();
                            el5.h(n47VarC2, n47VarF2, function1E2);
                            ux2Var.g0(objP2);
                            objK9 = objP2;
                        } catch (Throwable th) {
                            el5.h(n47VarC2, n47VarF2, function1E2);
                            throw th;
                        }
                    }
                    ux2Var.p(false);
                    objP0 = objK9;
                }
                zBooleanValue = ((Boolean) objP0).booleanValue();
                ux2Var.W(838300572);
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                ux2Var.p(false);
                Float fValueOf = Float.valueOf(f);
                zF = ux2Var.f(u18VarG0);
                objK5 = ux2Var.K();
                if (zF || objK5 == obj) {
                    objK5 = d57.b(new iq0(u18VarG0, (byte) 18));
                    ux2Var.g0(objK5);
                }
                zBooleanValue2 = ((Boolean) ((i97) objK5).getValue()).booleanValue();
                ux2Var.W(838300572);
                if (zBooleanValue2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.8f;
                }
                ux2Var.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                zF2 = ux2Var.f(u18VarG0);
                objK6 = ux2Var.K();
                if (zF2 || objK6 == obj) {
                    objK6 = d57.b(new iq0(u18VarG0, (byte) 19));
                    ux2Var.g0(objK6);
                }
                ux2Var.W(-1664496585);
                ux2Var.p(false);
                q18 q18VarZ = ck3.z(u18VarG0, fValueOf, fValueOf2, e87VarC0, yn1Var, ux2Var, 196608);
                if (u18VarG0.g()) {
                    z4 = false;
                    ux2Var.W(1666827533);
                    ux2Var.p(false);
                    objP1 = g2Var.p0();
                } else {
                    ux2Var.W(1666573488);
                    zF5 = ux2Var.f(u18VarG0);
                    objP1 = ux2Var.K();
                    if (zF5 || objP1 == obj) {
                        n47VarC = el5.c();
                        if (n47VarC != null) {
                            function1E = n47VarC.e();
                        } else {
                            function1E = null;
                        }
                        n47VarF = el5.f(n47VarC);
                        try {
                            Object objP3 = g2Var.p0();
                            el5.h(n47VarC, n47VarF, function1E);
                            ux2Var.g0(objP3);
                            objP1 = objP3;
                        } catch (Throwable th2) {
                            el5.h(n47VarC, n47VarF, function1E);
                            throw th2;
                        }
                    }
                    z4 = false;
                    ux2Var.p(false);
                }
                zBooleanValue3 = ((Boolean) objP1).booleanValue();
                ux2Var.W(-1903393104);
                if (zBooleanValue3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ux2Var.p(z4);
                Float fValueOf3 = Float.valueOf(f3);
                zF3 = ux2Var.f(u18VarG0);
                objK7 = ux2Var.K();
                if (zF3 || objK7 == obj) {
                    objK7 = d57.b(new iq0(u18VarG0, (byte) 20));
                    ux2Var.g0(objK7);
                }
                boolean zBooleanValue4 = ((Boolean) ((i97) objK7).getValue()).booleanValue();
                ux2Var.W(-1903393104);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                ux2Var.p(z4);
                Float fValueOf4 = Float.valueOf(f4);
                zF4 = ux2Var.f(u18VarG0);
                objK8 = ux2Var.K();
                if (zF4 || objK8 == obj) {
                    objK8 = d57.b(new iq0(u18VarG0, (byte) 21));
                    ux2Var.g0(objK8);
                }
                ux2Var.W(-111222965);
                ux2Var.p(z4);
                di1.d(bp5Var, au8.O(-527401546, new q41(px4Var2, q18VarZ, ck3.z(u18VarG0, fValueOf3, fValueOf4, e87VarC1, yn1Var, ux2Var, 196608), i97Var, yy0Var, i08Var), ux2Var), k08Var, fs4Var4, yy0VarO, ux2Var, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
                fs4Var3 = fs4Var4;
                z3 = true;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                z3 = z;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.c08
                    @Override // o.hw2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        g08.c(bp5Var, yy0Var, k08Var, fs4Var3, z3, hw2Var, (ux2) obj2, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 3072;
        fs4Var2 = fs4Var;
        i4 = i3 | 14376960;
        if ((100663296 & i) == 0) {
            if (ux2Var.h(hw2Var)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i4 |= i5;
        }
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i4 & 1, z2)) {
            if (i6 != 0) {
                fs4Var4 = cs4.b;
            } else {
                fs4Var4 = fs4Var2;
            }
            u18VarG0 = ck3.g0(k08Var.b, "tooltip transition", ux2Var, 48);
            objK = ux2Var.K();
            obj = e01.a;
            if (objK == obj) {
                objK = h57.p(null);
                ux2Var.g0(objK);
            }
            px4Var = (px4) objK;
            objK2 = ux2Var.K();
            if (objK2 == obj) {
                new j44(px4Var, (byte) 17);
                objK2 = new i08();
                ux2Var.g0(objK2);
            }
            i08 i08Var2 = (i08) objK2;
            yy0 yy0VarO2 = au8.O(-23901870, new sr7(px4Var, hw2Var, (byte) 1), ux2Var);
            objK3 = ux2Var.K();
            if (objK3 == obj) {
                objK3 = h57.p(null);
                ux2Var.g0(objK3);
            }
            px4Var2 = (px4) objK3;
            objK4 = ux2Var.K();
            if (objK4 == obj) {
                objK4 = d57.b(new fn3(px4Var, px4Var2, (byte) 1));
                ux2Var.g0(objK4);
            }
            i97 i97Var2 = (i97) objK4;
            e87 e87VarC2 = xs1.c0(du4.n, ux2Var);
            e87 e87VarC3 = xs1.c0(du4.p, ux2Var);
            yn1 yn1Var2 = vn4.j0;
            zG = u18VarG0.g();
            g2Var = u18VarG0.a;
            if (zG) {
                ux2Var.W(1666573488);
                zF6 = ux2Var.f(u18VarG0);
                objK9 = ux2Var.K();
                if (zF6) {
                    n47VarC2 = el5.c();
                    if (n47VarC2 != null) {
                        function1E2 = n47VarC2.e();
                    } else {
                        function1E2 = null;
                    }
                    n47VarF2 = el5.f(n47VarC2);
                    Object objP4 = g2Var.p0();
                    el5.h(n47VarC2, n47VarF2, function1E2);
                    ux2Var.g0(objP4);
                    objK9 = objP4;
                } else {
                    n47VarC2 = el5.c();
                    if (n47VarC2 != null) {
                        function1E2 = n47VarC2.e();
                    } else {
                        function1E2 = null;
                    }
                    n47VarF2 = el5.f(n47VarC2);
                    Object objP5 = g2Var.p0();
                    el5.h(n47VarC2, n47VarF2, function1E2);
                    ux2Var.g0(objP5);
                    objK9 = objP5;
                }
                ux2Var.p(false);
                objP0 = objK9;
            } else {
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP0 = g2Var.p0();
            }
            zBooleanValue = ((Boolean) objP0).booleanValue();
            ux2Var.W(838300572);
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            ux2Var.p(false);
            Float fValueOf5 = Float.valueOf(f);
            zF = ux2Var.f(u18VarG0);
            objK5 = ux2Var.K();
            if (zF) {
                objK5 = d57.b(new iq0(u18VarG0, (byte) 18));
                ux2Var.g0(objK5);
            } else {
                objK5 = d57.b(new iq0(u18VarG0, (byte) 18));
                ux2Var.g0(objK5);
            }
            zBooleanValue2 = ((Boolean) ((i97) objK5).getValue()).booleanValue();
            ux2Var.W(838300572);
            if (zBooleanValue2) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            ux2Var.p(false);
            Float fValueOf6 = Float.valueOf(f2);
            zF2 = ux2Var.f(u18VarG0);
            objK6 = ux2Var.K();
            if (zF2) {
                objK6 = d57.b(new iq0(u18VarG0, (byte) 19));
                ux2Var.g0(objK6);
            } else {
                objK6 = d57.b(new iq0(u18VarG0, (byte) 19));
                ux2Var.g0(objK6);
            }
            ux2Var.W(-1664496585);
            ux2Var.p(false);
            q18 q18VarZ2 = ck3.z(u18VarG0, fValueOf5, fValueOf6, e87VarC2, yn1Var2, ux2Var, 196608);
            if (u18VarG0.g()) {
                ux2Var.W(1666573488);
                zF5 = ux2Var.f(u18VarG0);
                objP1 = ux2Var.K();
                if (zF5) {
                    n47VarC = el5.c();
                    if (n47VarC != null) {
                        function1E = n47VarC.e();
                    } else {
                        function1E = null;
                    }
                    n47VarF = el5.f(n47VarC);
                    Object objP6 = g2Var.p0();
                    el5.h(n47VarC, n47VarF, function1E);
                    ux2Var.g0(objP6);
                    objP1 = objP6;
                } else {
                    n47VarC = el5.c();
                    if (n47VarC != null) {
                        function1E = n47VarC.e();
                    } else {
                        function1E = null;
                    }
                    n47VarF = el5.f(n47VarC);
                    Object objP7 = g2Var.p0();
                    el5.h(n47VarC, n47VarF, function1E);
                    ux2Var.g0(objP7);
                    objP1 = objP7;
                }
                z4 = false;
                ux2Var.p(false);
            } else {
                z4 = false;
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP1 = g2Var.p0();
            }
            zBooleanValue3 = ((Boolean) objP1).booleanValue();
            ux2Var.W(-1903393104);
            if (zBooleanValue3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ux2Var.p(z4);
            Float fValueOf7 = Float.valueOf(f3);
            zF3 = ux2Var.f(u18VarG0);
            objK7 = ux2Var.K();
            if (zF3) {
                objK7 = d57.b(new iq0(u18VarG0, (byte) 20));
                ux2Var.g0(objK7);
            } else {
                objK7 = d57.b(new iq0(u18VarG0, (byte) 20));
                ux2Var.g0(objK7);
            }
            boolean zBooleanValue5 = ((Boolean) ((i97) objK7).getValue()).booleanValue();
            ux2Var.W(-1903393104);
            if (zBooleanValue5) {
            }
            ux2Var.p(z4);
            Float fValueOf8 = Float.valueOf(f4);
            zF4 = ux2Var.f(u18VarG0);
            objK8 = ux2Var.K();
            if (zF4) {
                objK8 = d57.b(new iq0(u18VarG0, (byte) 21));
                ux2Var.g0(objK8);
            } else {
                objK8 = d57.b(new iq0(u18VarG0, (byte) 21));
                ux2Var.g0(objK8);
            }
            ux2Var.W(-111222965);
            ux2Var.p(z4);
            di1.d(bp5Var, au8.O(-527401546, new q41(px4Var2, q18VarZ2, ck3.z(u18VarG0, fValueOf7, fValueOf8, e87VarC3, yn1Var2, ux2Var, 196608), i97Var2, yy0Var, i08Var2), ux2Var), k08Var, fs4Var4, yy0VarO2, ux2Var, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
            fs4Var3 = fs4Var4;
            z3 = true;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
            z3 = z;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.c08
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    g08.c(bp5Var, yy0Var, k08Var, fs4Var3, z3, hw2Var, (ux2) obj2, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final k08 d(ux2 ux2Var) {
        iy4 iy4Var = z40.a;
        boolean zG = ux2Var.g(false) | ux2Var.f(iy4Var);
        Object objK = ux2Var.K();
        if (zG || objK == e01.a) {
            objK = new k08(iy4Var);
            ux2Var.g0(objK);
        }
        return (k08) objK;
    }
}
