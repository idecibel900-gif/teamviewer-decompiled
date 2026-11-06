package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class pb4 {
    public static final float a = ga0.M;
    public static final float b = ga0.a0;

    static {
        int i = kb4.a;
        bg5 bg5Var = qp5.a;
        ((Boolean) bg5Var.getValue()).booleanValue();
        ((Boolean) bg5Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void a(final yy0 yy0Var, final fs4 fs4Var, final hw2 hw2Var, final hw2 hw2Var2, hw2 hw2Var3, jb4 jb4Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        hw2 hw2Var4;
        jb4 jb4Var2;
        int i4;
        final byte b2;
        final byte b3;
        boolean z;
        final hw2 hw2Var5;
        final jb4 jb4Var3;
        j56 j56VarR;
        final jb4 jb4VarB;
        int i5;
        final hw2 hw2Var6;
        yy0 yy0Var2;
        yy0 yy0Var3;
        yy0 yy0Var4;
        Object objK;
        ux2Var.Y(487133126);
        final byte b4 = 2;
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(yy0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= ux2Var.h(hw2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= ux2Var.h(hw2Var2) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                hw2Var4 = hw2Var3;
                i6 |= ux2Var.h(hw2Var4) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jb4Var2 = jb4Var;
                    int i8 = ux2Var.f(jb4Var2) ? 1048576 : 524288;
                    i6 |= i8;
                } else {
                    jb4Var2 = jb4Var;
                }
                i6 |= i8;
            } else {
                jb4Var2 = jb4Var;
            }
            i4 = i6 | 113246208;
            b2 = 0;
            b3 = 1;
            if ((38347923 & i4) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i4 & 1, z)) {
                ux2Var.S();
                yy0 yy0Var5 = null;
                if ((i & 1) != 0 || ux2Var.x()) {
                    if (i7 != 0) {
                        hw2Var4 = null;
                    }
                    if ((i2 & 64) != 0) {
                        int i9 = kb4.a;
                        jb4VarB = kb4.b(((rn4) ux2Var.j(un4.a)).a);
                        i4 &= -3670017;
                    } else {
                        jb4VarB = jb4Var2;
                    }
                    int i10 = kb4.a;
                    hw2 hw2Var7 = hw2Var4;
                    i5 = i4;
                    hw2Var6 = hw2Var7;
                } else {
                    ux2Var.Q();
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    hw2 hw2Var8 = hw2Var4;
                    i5 = i4;
                    hw2Var6 = hw2Var8;
                    jb4VarB = jb4Var2;
                }
                ux2Var.q();
                yy0 yy0VarO = au8.O(629852750, new l64(jb4VarB, yy0Var, b4), ux2Var);
                if (hw2Var == null) {
                    ux2Var.W(-510691457);
                    ux2Var.p(false);
                    yy0Var2 = null;
                } else {
                    ux2Var.W(-510691456);
                    yy0 yy0VarO2 = au8.O(-1291211644, new hw2() { // from class: o.lb4
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b2;
                            tg3 tg3Var = LayoutNode.e0;
                            f88 f88Var = f88.a;
                            jb4 jb4Var4 = jb4VarB;
                            switch (b5) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        pb4.c(jb4Var4.f, ga0.W, hw2Var, ux2Var2, 48);
                                    }
                                    break;
                                case 1:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        fs4 fs4VarF = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                        do4 do4VarC = ua0.c(xz2.f2564o, false);
                                        int iHashCode = Long.hashCode(ux2Var3.T);
                                        yj5 yj5VarL = ux2Var3.l();
                                        fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF);
                                        yz0.c.getClass();
                                        ux2Var3.a0();
                                        if (ux2Var3.S) {
                                            ux2Var3.k(tg3Var);
                                        } else {
                                            ux2Var3.j0();
                                        }
                                        o67.n(do4VarC, d82.v, ux2Var3);
                                        o67.n(yj5VarL, d82.u, ux2Var3);
                                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                        o67.l(ux2Var3);
                                        o67.n(fs4VarS, d82.t, ux2Var3);
                                        j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var, ux2Var3, 8);
                                        ux2Var3.p(true);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var4 = (ux2) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ux2Var4.Q();
                                    } else {
                                        fs4 fs4VarF2 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                        do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                        int iHashCode2 = Long.hashCode(ux2Var4.T);
                                        yj5 yj5VarL2 = ux2Var4.l();
                                        fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF2);
                                        yz0.c.getClass();
                                        ux2Var4.a0();
                                        if (ux2Var4.S) {
                                            ux2Var4.k(tg3Var);
                                        } else {
                                            ux2Var4.j0();
                                        }
                                        o67.n(do4VarC2, d82.v, ux2Var4);
                                        o67.n(yj5VarL2, d82.u, ux2Var4);
                                        o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                        o67.l(ux2Var4);
                                        o67.n(fs4VarS2, d82.t, ux2Var4);
                                        pb4.c(jb4Var4.d, ga0.b0, hw2Var, ux2Var4, 48);
                                        ux2Var4.p(true);
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var);
                    ux2Var.p(false);
                    yy0Var2 = yy0VarO2;
                }
                ux2Var.W(-510230394);
                ux2Var.p(false);
                if (hw2Var2 == null) {
                    ux2Var.W(-509862641);
                    ux2Var.p(false);
                    yy0Var3 = null;
                } else {
                    ux2Var.W(-509862640);
                    yy0 yy0VarO3 = au8.O(449548451, new hw2() { // from class: o.lb4
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b3;
                            tg3 tg3Var = LayoutNode.e0;
                            f88 f88Var = f88.a;
                            jb4 jb4Var4 = jb4VarB;
                            switch (b5) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        pb4.c(jb4Var4.f, ga0.W, hw2Var2, ux2Var2, 48);
                                    }
                                    break;
                                case 1:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        fs4 fs4VarF = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                        do4 do4VarC = ua0.c(xz2.f2564o, false);
                                        int iHashCode = Long.hashCode(ux2Var3.T);
                                        yj5 yj5VarL = ux2Var3.l();
                                        fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF);
                                        yz0.c.getClass();
                                        ux2Var3.a0();
                                        if (ux2Var3.S) {
                                            ux2Var3.k(tg3Var);
                                        } else {
                                            ux2Var3.j0();
                                        }
                                        o67.n(do4VarC, d82.v, ux2Var3);
                                        o67.n(yj5VarL, d82.u, ux2Var3);
                                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                        o67.l(ux2Var3);
                                        o67.n(fs4VarS, d82.t, ux2Var3);
                                        j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var2, ux2Var3, 8);
                                        ux2Var3.p(true);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var4 = (ux2) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ux2Var4.Q();
                                    } else {
                                        fs4 fs4VarF2 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                        do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                        int iHashCode2 = Long.hashCode(ux2Var4.T);
                                        yj5 yj5VarL2 = ux2Var4.l();
                                        fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF2);
                                        yz0.c.getClass();
                                        ux2Var4.a0();
                                        if (ux2Var4.S) {
                                            ux2Var4.k(tg3Var);
                                        } else {
                                            ux2Var4.j0();
                                        }
                                        o67.n(do4VarC2, d82.v, ux2Var4);
                                        o67.n(yj5VarL2, d82.u, ux2Var4);
                                        o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                        o67.l(ux2Var4);
                                        o67.n(fs4VarS2, d82.t, ux2Var4);
                                        pb4.c(jb4Var4.d, ga0.b0, hw2Var2, ux2Var4, 48);
                                        ux2Var4.p(true);
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var);
                    ux2Var.p(false);
                    yy0Var3 = yy0VarO3;
                }
                if (hw2Var6 == null) {
                    ux2Var.W(-509255444);
                    ux2Var.p(false);
                    yy0Var4 = null;
                } else {
                    ux2Var.W(-509255443);
                    yy0 yy0VarO4 = au8.O(1946411067, new hw2() { // from class: o.lb4
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b4;
                            tg3 tg3Var = LayoutNode.e0;
                            f88 f88Var = f88.a;
                            jb4 jb4Var4 = jb4VarB;
                            switch (b5) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        pb4.c(jb4Var4.f, ga0.W, hw2Var6, ux2Var2, 48);
                                    }
                                    break;
                                case 1:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        fs4 fs4VarF = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                        do4 do4VarC = ua0.c(xz2.f2564o, false);
                                        int iHashCode = Long.hashCode(ux2Var3.T);
                                        yj5 yj5VarL = ux2Var3.l();
                                        fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF);
                                        yz0.c.getClass();
                                        ux2Var3.a0();
                                        if (ux2Var3.S) {
                                            ux2Var3.k(tg3Var);
                                        } else {
                                            ux2Var3.j0();
                                        }
                                        o67.n(do4VarC, d82.v, ux2Var3);
                                        o67.n(yj5VarL, d82.u, ux2Var3);
                                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                        o67.l(ux2Var3);
                                        o67.n(fs4VarS, d82.t, ux2Var3);
                                        j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var6, ux2Var3, 8);
                                        ux2Var3.p(true);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var4 = (ux2) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ux2Var4.Q();
                                    } else {
                                        fs4 fs4VarF2 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                        do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                        int iHashCode2 = Long.hashCode(ux2Var4.T);
                                        yj5 yj5VarL2 = ux2Var4.l();
                                        fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF2);
                                        yz0.c.getClass();
                                        ux2Var4.a0();
                                        if (ux2Var4.S) {
                                            ux2Var4.k(tg3Var);
                                        } else {
                                            ux2Var4.j0();
                                        }
                                        o67.n(do4VarC2, d82.v, ux2Var4);
                                        o67.n(yj5VarL2, d82.u, ux2Var4);
                                        o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                        o67.l(ux2Var4);
                                        o67.n(fs4VarS2, d82.t, ux2Var4);
                                        pb4.c(jb4Var4.d, ga0.b0, hw2Var6, ux2Var4, 48);
                                        ux2Var4.p(true);
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var);
                    ux2Var.p(false);
                    yy0Var4 = yy0VarO4;
                }
                objK = ux2Var.K();
                if (objK == e01.a) {
                    objK = new ek3((byte) 16);
                    ux2Var.g0(objK);
                }
                fs4 fs4VarF = cp6.a(cs4.b, true, (Function1) objK).f(fs4Var);
                int i11 = kb4.a;
                int i12 = i5 >> 9;
                ig7.a(fs4VarF, ux6.b(ga0.x, ux2Var), jb4VarB.a, jb4VarB.b, 0.0f, 0.0f, au8.O(1192488737, new mb4(yy0Var3, yy0Var4, yy0VarO, yy0Var5, yy0Var2), ux2Var), ux2Var, (57344 & i12) | 12582912 | (i12 & 458752), 64);
                jb4Var3 = jb4VarB;
                hw2Var5 = hw2Var6;
            } else {
                ux2Var.Q();
                hw2Var5 = hw2Var4;
                jb4Var3 = jb4Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.nb4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pb4.a(yy0Var, fs4Var, hw2Var, hw2Var2, hw2Var5, jb4Var3, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i6 |= 196608;
        hw2Var4 = hw2Var3;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jb4Var2 = jb4Var;
                if (ux2Var.f(jb4Var2)) {
                }
                i6 |= i8;
            } else {
                jb4Var2 = jb4Var;
            }
            i6 |= i8;
        } else {
            jb4Var2 = jb4Var;
        }
        i4 = i6 | 113246208;
        b2 = 0;
        b3 = 1;
        if ((38347923 & i4) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i4 & 1, z)) {
            ux2Var.S();
            yy0 yy0Var6 = null;
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    hw2Var4 = null;
                }
                if ((i2 & 64) != 0) {
                    int i13 = kb4.a;
                    jb4VarB = kb4.b(((rn4) ux2Var.j(un4.a)).a);
                    i4 &= -3670017;
                } else {
                    jb4VarB = jb4Var2;
                }
                int i14 = kb4.a;
                hw2 hw2Var9 = hw2Var4;
                i5 = i4;
                hw2Var6 = hw2Var9;
            } else {
                if (i7 != 0) {
                    hw2Var4 = null;
                }
                if ((i2 & 64) != 0) {
                    int i15 = kb4.a;
                    jb4VarB = kb4.b(((rn4) ux2Var.j(un4.a)).a);
                    i4 &= -3670017;
                } else {
                    jb4VarB = jb4Var2;
                }
                int i16 = kb4.a;
                hw2 hw2Var10 = hw2Var4;
                i5 = i4;
                hw2Var6 = hw2Var10;
            }
            ux2Var.q();
            yy0 yy0VarO5 = au8.O(629852750, new l64(jb4VarB, yy0Var, b4), ux2Var);
            if (hw2Var == null) {
                ux2Var.W(-510691457);
                ux2Var.p(false);
                yy0Var2 = null;
            } else {
                ux2Var.W(-510691456);
                yy0 yy0VarO6 = au8.O(-1291211644, new hw2() { // from class: o.lb4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b2;
                        tg3 tg3Var = LayoutNode.e0;
                        f88 f88Var = f88.a;
                        jb4 jb4Var4 = jb4VarB;
                        switch (b5) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    pb4.c(jb4Var4.f, ga0.W, hw2Var, ux2Var2, 48);
                                }
                                break;
                            case 1:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    fs4 fs4VarF2 = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                                    int iHashCode = Long.hashCode(ux2Var3.T);
                                    yj5 yj5VarL = ux2Var3.l();
                                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF2);
                                    yz0.c.getClass();
                                    ux2Var3.a0();
                                    if (ux2Var3.S) {
                                        ux2Var3.k(tg3Var);
                                    } else {
                                        ux2Var3.j0();
                                    }
                                    o67.n(do4VarC, d82.v, ux2Var3);
                                    o67.n(yj5VarL, d82.u, ux2Var3);
                                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                    o67.l(ux2Var3);
                                    o67.n(fs4VarS, d82.t, ux2Var3);
                                    j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var, ux2Var3, 8);
                                    ux2Var3.p(true);
                                }
                                break;
                            default:
                                ux2 ux2Var4 = (ux2) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    ux2Var4.Q();
                                } else {
                                    fs4 fs4VarF3 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                    do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                    int iHashCode2 = Long.hashCode(ux2Var4.T);
                                    yj5 yj5VarL2 = ux2Var4.l();
                                    fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF3);
                                    yz0.c.getClass();
                                    ux2Var4.a0();
                                    if (ux2Var4.S) {
                                        ux2Var4.k(tg3Var);
                                    } else {
                                        ux2Var4.j0();
                                    }
                                    o67.n(do4VarC2, d82.v, ux2Var4);
                                    o67.n(yj5VarL2, d82.u, ux2Var4);
                                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                    o67.l(ux2Var4);
                                    o67.n(fs4VarS2, d82.t, ux2Var4);
                                    pb4.c(jb4Var4.d, ga0.b0, hw2Var, ux2Var4, 48);
                                    ux2Var4.p(true);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var);
                ux2Var.p(false);
                yy0Var2 = yy0VarO6;
            }
            ux2Var.W(-510230394);
            ux2Var.p(false);
            if (hw2Var2 == null) {
                ux2Var.W(-509862641);
                ux2Var.p(false);
                yy0Var3 = null;
            } else {
                ux2Var.W(-509862640);
                yy0 yy0VarO7 = au8.O(449548451, new hw2() { // from class: o.lb4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b3;
                        tg3 tg3Var = LayoutNode.e0;
                        f88 f88Var = f88.a;
                        jb4 jb4Var4 = jb4VarB;
                        switch (b5) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    pb4.c(jb4Var4.f, ga0.W, hw2Var2, ux2Var2, 48);
                                }
                                break;
                            case 1:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    fs4 fs4VarF2 = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                                    int iHashCode = Long.hashCode(ux2Var3.T);
                                    yj5 yj5VarL = ux2Var3.l();
                                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF2);
                                    yz0.c.getClass();
                                    ux2Var3.a0();
                                    if (ux2Var3.S) {
                                        ux2Var3.k(tg3Var);
                                    } else {
                                        ux2Var3.j0();
                                    }
                                    o67.n(do4VarC, d82.v, ux2Var3);
                                    o67.n(yj5VarL, d82.u, ux2Var3);
                                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                    o67.l(ux2Var3);
                                    o67.n(fs4VarS, d82.t, ux2Var3);
                                    j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var2, ux2Var3, 8);
                                    ux2Var3.p(true);
                                }
                                break;
                            default:
                                ux2 ux2Var4 = (ux2) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    ux2Var4.Q();
                                } else {
                                    fs4 fs4VarF3 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                    do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                    int iHashCode2 = Long.hashCode(ux2Var4.T);
                                    yj5 yj5VarL2 = ux2Var4.l();
                                    fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF3);
                                    yz0.c.getClass();
                                    ux2Var4.a0();
                                    if (ux2Var4.S) {
                                        ux2Var4.k(tg3Var);
                                    } else {
                                        ux2Var4.j0();
                                    }
                                    o67.n(do4VarC2, d82.v, ux2Var4);
                                    o67.n(yj5VarL2, d82.u, ux2Var4);
                                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                    o67.l(ux2Var4);
                                    o67.n(fs4VarS2, d82.t, ux2Var4);
                                    pb4.c(jb4Var4.d, ga0.b0, hw2Var2, ux2Var4, 48);
                                    ux2Var4.p(true);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var);
                ux2Var.p(false);
                yy0Var3 = yy0VarO7;
            }
            if (hw2Var6 == null) {
                ux2Var.W(-509255444);
                ux2Var.p(false);
                yy0Var4 = null;
            } else {
                ux2Var.W(-509255443);
                yy0 yy0VarO8 = au8.O(1946411067, new hw2() { // from class: o.lb4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b4;
                        tg3 tg3Var = LayoutNode.e0;
                        f88 f88Var = f88.a;
                        jb4 jb4Var4 = jb4VarB;
                        switch (b5) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    pb4.c(jb4Var4.f, ga0.W, hw2Var6, ux2Var2, 48);
                                }
                                break;
                            case 1:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    fs4 fs4VarF2 = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                                    int iHashCode = Long.hashCode(ux2Var3.T);
                                    yj5 yj5VarL = ux2Var3.l();
                                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF2);
                                    yz0.c.getClass();
                                    ux2Var3.a0();
                                    if (ux2Var3.S) {
                                        ux2Var3.k(tg3Var);
                                    } else {
                                        ux2Var3.j0();
                                    }
                                    o67.n(do4VarC, d82.v, ux2Var3);
                                    o67.n(yj5VarL, d82.u, ux2Var3);
                                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                    o67.l(ux2Var3);
                                    o67.n(fs4VarS, d82.t, ux2Var3);
                                    j51.l(wa1.a.a(new rv0(jb4Var4.c)), hw2Var6, ux2Var3, 8);
                                    ux2Var3.p(true);
                                }
                                break;
                            default:
                                ux2 ux2Var4 = (ux2) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    ux2Var4.Q();
                                } else {
                                    fs4 fs4VarF3 = ka0.F(cs4.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                                    do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                                    int iHashCode2 = Long.hashCode(ux2Var4.T);
                                    yj5 yj5VarL2 = ux2Var4.l();
                                    fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF3);
                                    yz0.c.getClass();
                                    ux2Var4.a0();
                                    if (ux2Var4.S) {
                                        ux2Var4.k(tg3Var);
                                    } else {
                                        ux2Var4.j0();
                                    }
                                    o67.n(do4VarC2, d82.v, ux2Var4);
                                    o67.n(yj5VarL2, d82.u, ux2Var4);
                                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                                    o67.l(ux2Var4);
                                    o67.n(fs4VarS2, d82.t, ux2Var4);
                                    pb4.c(jb4Var4.d, ga0.b0, hw2Var6, ux2Var4, 48);
                                    ux2Var4.p(true);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var);
                ux2Var.p(false);
                yy0Var4 = yy0VarO8;
            }
            objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new ek3((byte) 16);
                ux2Var.g0(objK);
            }
            fs4 fs4VarF2 = cp6.a(cs4.b, true, (Function1) objK).f(fs4Var);
            int i17 = kb4.a;
            int i18 = i5 >> 9;
            ig7.a(fs4VarF2, ux6.b(ga0.x, ux2Var), jb4VarB.a, jb4VarB.b, 0.0f, 0.0f, au8.O(1192488737, new mb4(yy0Var3, yy0Var4, yy0VarO5, yy0Var6, yy0Var2), ux2Var), ux2Var, (57344 & i18) | 12582912 | (i18 & 458752), 64);
            jb4Var3 = jb4VarB;
            hw2Var5 = hw2Var6;
        } else {
            ux2Var.Q();
            hw2Var5 = hw2Var4;
            jb4Var3 = jb4Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.nb4
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pb4.a(yy0Var, fs4Var, hw2Var, hw2Var2, hw2Var5, jb4Var3, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(hw2 hw2Var, hw2 hw2Var2, yy0 yy0Var, hw2 hw2Var3, hw2 hw2Var4, ux2 ux2Var, int i) {
        ux2Var.Y(-61277522);
        int i2 = i | (ux2Var.h(hw2Var) ? 4 : 2) | (ux2Var.h(hw2Var2) ? 32 : 16) | (ux2Var.h(hw2Var3) ? 2048 : 1024) | (ux2Var.h(hw2Var4) ? 16384 : 8192);
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new ub4();
                ux2Var.g0(objK);
            }
            ub4 ub4Var = (ub4) objK;
            yy0 yy0VarQ = zu1.q(qf0.L(yy0Var, hw2Var3 == null ? au8.d : hw2Var3, hw2Var4 == null ? au8.e : hw2Var4, hw2Var == null ? au8.f : hw2Var, hw2Var2 == null ? au8.g : hw2Var2));
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new ru4(ub4Var);
                ux2Var.g0(objK2);
            }
            do4 do4Var = (do4) objK2;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, cs4.b);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0VarQ.invoke(ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new mb4(hw2Var, hw2Var2, yy0Var, hw2Var3, hw2Var4, i);
        }
    }

    public static final void c(long j, i68 i68Var, hw2 hw2Var, ux2 ux2Var, int i) {
        long j2;
        ux2 ux2Var2;
        hw2 hw2Var2;
        ux2Var.Y(-285397024);
        int i2 = (ux2Var.e(j) ? 4 : 2) | i | (ux2Var.h(hw2Var) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            ux2Var2 = ux2Var;
            lv1.x(j2, k68.a(i68Var, ux2Var), hw2Var, ux2Var2, i2 & 910);
            hw2Var2 = hw2Var;
        } else {
            j2 = j;
            ux2Var2 = ux2Var;
            hw2Var2 = hw2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new uh(j2, i68Var, hw2Var2, i);
        }
    }

    public static final int d(bm3 bm3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (i6 == 1) {
            f = ga0.N;
        } else {
            f = i6 == 2 ? ga0.c0 : ga0.X;
        }
        int iMax = Math.max(Math.max(r61.j(j), bm3Var.q0(f)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iH = r61.h(j);
        return iMax > iH ? iH : iMax;
    }
}
