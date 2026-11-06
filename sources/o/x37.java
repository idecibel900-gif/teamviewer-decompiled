package o;

import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class x37 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static final void a(yy0 yy0Var, hw2 hw2Var, hw2 hw2Var2, ot7 ot7Var, long j, long j2, ux2 ux2Var, int i) {
        ot7 ot7Var2;
        long j3;
        long j4;
        hw2 hw2Var3;
        boolean z;
        int i2;
        boolean z2;
        ux2Var.Y(-321841045);
        int i3 = i | (ux2Var.h(yy0Var) ? 4 : 2) | (ux2Var.h(hw2Var) ? 32 : 16) | (ux2Var.h(hw2Var2) ? 256 : 128) | (ux2Var.f(ot7Var) ? 2048 : 1024) | (ux2Var.e(j) ? 16384 : 8192) | (ux2Var.e(j2) ? 131072 : 65536);
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            float f = hw2Var2 == null ? 8.0f : 0.0f;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new ei((byte) 9);
                ux2Var.g0(objK);
            }
            do4 do4Var = (do4) objK;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(do4Var, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            fs4 fs4VarD = ka0.D(hm3.w(cs4Var, "text"), 0.0f, 6.0f, 1);
            y50 y50Var = xz2.f2564o;
            do4 do4VarC = ua0.c(y50Var, false);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            yy0Var.invoke(ux2Var, Integer.valueOf(i3 & 14));
            ux2Var.p(true);
            if (hw2Var != null) {
                ux2Var.W(989211000);
                fs4 fs4VarW = hm3.w(cs4Var, "action");
                do4 do4VarC2 = ua0.c(y50Var, false);
                int iHashCode3 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL3 = ux2Var.l();
                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarW);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC2, iz0Var, ux2Var);
                o67.n(yj5VarL3, iz0Var2, ux2Var);
                e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS3, iz0Var4, ux2Var);
                i2 = 8;
                j4 = j;
                ot7Var2 = ot7Var;
                j51.m(new dx5[]{wa1.a.a(new rv0(j4)), qs7.a.a(ot7Var2)}, hw2Var, ux2Var, (i3 & 112) | 8);
                ux2Var.p(true);
                z = false;
                ux2Var.p(false);
            } else {
                ot7Var2 = ot7Var;
                z = false;
                i2 = 8;
                j4 = j;
                ux2Var.W(989526208);
                ux2Var.p(false);
            }
            if (hw2Var2 != null) {
                ux2Var.W(989574568);
                fs4 fs4VarW2 = hm3.w(cs4Var, "dismissAction");
                do4 do4VarC3 = ua0.c(y50Var, z);
                int i4 = i2;
                int iHashCode4 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL4 = ux2Var.l();
                fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarW2);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC3, iz0Var, ux2Var);
                o67.n(yj5VarL4, iz0Var2, ux2Var);
                e41.r(iHashCode4, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS4, iz0Var4, ux2Var);
                j3 = j2;
                hw2Var3 = hw2Var2;
                j51.l(wa1.a.a(new rv0(j3)), hw2Var3, ux2Var, i4 | ((i3 >> 3) & 112));
                z2 = true;
                ux2Var.p(true);
                ux2Var.p(false);
            } else {
                hw2Var3 = hw2Var2;
                j3 = j2;
                boolean z4 = z;
                z2 = true;
                ux2Var.W(989843648);
                ux2Var.p(z4);
            }
            ux2Var.p(z2);
        } else {
            ot7Var2 = ot7Var;
            j3 = j2;
            j4 = j;
            hw2Var3 = hw2Var2;
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new r37(yy0Var, hw2Var, hw2Var3, ot7Var2, j4, j3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void b(final int i, final fs4 fs4Var, long j, long j2, iw2 iw2Var, hw2 hw2Var, final yy0 yy0Var, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        fs4 fs4Var2;
        iw2 iw2Var2;
        int i5;
        boolean z;
        final long j3;
        final hw2 hw2Var2;
        final iw2 iw2Var3;
        final long j4;
        j56 j56VarR;
        long jC;
        long jC2;
        int i6;
        iw2 iw2VarO;
        int i7;
        ux2Var.Y(-1012974221);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            fs4Var2 = fs4Var;
            i4 |= ux2Var.f(fs4Var2) ? 32 : 16;
        } else {
            fs4Var2 = fs4Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i8 = i3 & 16;
        if (i8 == 0) {
            if ((i2 & 24576) == 0) {
                iw2Var2 = iw2Var;
                i4 |= ux2Var.h(iw2Var2) ? 16384 : 8192;
            }
            i5 = i4 | 196608;
            if ((1572864 & i2) == 0) {
                if (ux2Var.h(yy0Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i5 & 1, z)) {
                ux2Var.S();
                if ((i2 & 1) != 0 || ux2Var.x()) {
                    jC = bw0.c(es5.d, ux2Var);
                    jC2 = bw0.c(es5.f, ux2Var);
                    i6 = i5 & (-8065);
                    if (i8 != 0) {
                        iw2VarO = au8.O(1338273762, new oa(i, (byte) 5), ux2Var);
                    } else {
                        iw2VarO = iw2Var2;
                    }
                    hw2Var2 = mo8.i;
                } else {
                    ux2Var.Q();
                    i6 = i5 & (-8065);
                    jC = j;
                    jC2 = j2;
                    hw2Var2 = hw2Var;
                    iw2VarO = iw2Var2;
                }
                ux2Var.q();
                int i9 = (i6 >> 3) & 524286;
                fs4 fs4Var3 = fs4Var2;
                iw2Var3 = iw2VarO;
                j3 = jC;
                j4 = jC2;
                f(fs4Var3, j3, j4, iw2Var3, hw2Var2, yy0Var, ux2Var, i9);
            } else {
                ux2Var.Q();
                j3 = j;
                hw2Var2 = hw2Var;
                iw2Var3 = iw2Var2;
                j4 = j2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.ym7
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x37.b(i, fs4Var, j3, j4, iw2Var3, hw2Var2, yy0Var, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 24576;
        iw2Var2 = iw2Var;
        i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            if (ux2Var.h(yy0Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i5 |= i7;
        }
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i5 & 1, z)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                jC = bw0.c(es5.d, ux2Var);
                jC2 = bw0.c(es5.f, ux2Var);
                i6 = i5 & (-8065);
                if (i8 != 0) {
                    iw2VarO = au8.O(1338273762, new oa(i, (byte) 5), ux2Var);
                } else {
                    iw2VarO = iw2Var2;
                }
                hw2Var2 = mo8.i;
            } else {
                jC = bw0.c(es5.d, ux2Var);
                jC2 = bw0.c(es5.f, ux2Var);
                i6 = i5 & (-8065);
                if (i8 != 0) {
                    iw2VarO = au8.O(1338273762, new oa(i, (byte) 5), ux2Var);
                } else {
                    iw2VarO = iw2Var2;
                }
                hw2Var2 = mo8.i;
            }
            ux2Var.q();
            int i10 = (i6 >> 3) & 524286;
            fs4 fs4Var4 = fs4Var2;
            iw2Var3 = iw2VarO;
            j3 = jC;
            j4 = jC2;
            f(fs4Var4, j3, j4, iw2Var3, hw2Var2, yy0Var, ux2Var, i10);
        } else {
            ux2Var.Q();
            j3 = j;
            hw2Var2 = hw2Var;
            iw2Var3 = iw2Var2;
            j4 = j2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.ym7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x37.b(i, fs4Var, j3, j4, iw2Var3, hw2Var2, yy0Var, (ux2) obj, yo1.Y(i2 | 1), i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(final fs4 fs4Var, final hw2 hw2Var, final hw2 hw2Var2, final pw6 pw6Var, final long j, long j2, long j3, long j4, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        hw2 hw2Var3;
        hw2 hw2Var4;
        long jC;
        long jC2;
        long jC3;
        final long j5;
        final long j6;
        final long j7;
        ux2Var.Y(-1218779924);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            hw2Var3 = hw2Var;
            i3 |= ux2Var.h(hw2Var3) ? 32 : 16;
        } else {
            hw2Var3 = hw2Var;
        }
        if ((i & 384) == 0) {
            hw2Var4 = hw2Var2;
            i3 |= ux2Var.h(hw2Var4) ? 256 : 128;
        } else {
            hw2Var4 = hw2Var2;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= ux2Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            jC = j2;
            i3 |= ((i2 & 64) == 0 && ux2Var.e(jC)) ? 1048576 : 524288;
        } else {
            jC = j2;
        }
        if ((12582912 & i) == 0) {
            jC2 = j3;
            i3 |= ((i2 & 128) == 0 && ux2Var.e(jC2)) ? 8388608 : 4194304;
        } else {
            jC2 = j3;
        }
        if ((100663296 & i) == 0) {
            jC3 = j4;
            i3 |= ((i2 & 256) == 0 && ux2Var.e(jC3)) ? 67108864 : 33554432;
        } else {
            jC3 = j4;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 536870912 : 268435456;
        }
        if (ux2Var.N(i3 & 1, (i3 & 306783379) != 306783378)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if ((i2 & 64) != 0) {
                    jC = bw0.c(uf0.O, ux2Var);
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jC2 = bw0.c(uf0.I, ux2Var);
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    jC3 = bw0.c(uf0.N, ux2Var);
                    i3 &= -234881025;
                }
            } else {
                ux2Var.Q();
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
            }
            final long j8 = jC3;
            final long j9 = jC2;
            ux2Var.q();
            final hw2 hw2Var5 = hw2Var3;
            final hw2 hw2Var6 = hw2Var4;
            int i4 = (i3 & 14) | 12779520;
            int i5 = i3 >> 9;
            long j10 = jC;
            ig7.a(fs4Var, pw6Var, j, j10, 0.0f, uf0.L, au8.O(-1343524879, new hw2() { // from class: o.v37
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j51.l(qs7.a.a(k68.a(uf0.P, ux2Var2)), au8.O(969655473, new r37(hw2Var5, yy0Var, hw2Var6, k68.a(uf0.J, ux2Var2), j9, j8), ux2Var2), ux2Var2, 56);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, i4 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 80);
            j5 = j10;
            j6 = j9;
            j7 = j8;
        } else {
            ux2Var.Q();
            j5 = jC;
            j6 = jC2;
            j7 = jC3;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.s37
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    x37.c(fs4Var, hw2Var, hw2Var2, pw6Var, j, j5, j6, j7, yy0Var, (ux2) obj, iY, i2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void d(final o37 o37Var, fs4 fs4Var, pw6 pw6Var, long j, long j2, long j3, long j4, long j5, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        final byte b2;
        final byte b3;
        boolean z;
        final pw6 pw6VarB;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final fs4 fs4Var3;
        final long j10;
        j56 j56VarR;
        fs4 fs4Var4;
        long jC;
        long jC2;
        long jC3;
        long jC4;
        int i5;
        yy0 yy0VarO;
        ux2Var.Y(274621471);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(o37Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                i4 = i3 | 1408;
            }
            if ((i & 24576) == 0) {
                i4 |= 8192;
            }
            if ((196608 & i) == 0) {
                i4 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            if ((12582912 & i) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            b2 = 0;
            b3 = 1;
            if ((38347923 & i4) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i4 & 1, z)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    pw6VarB = ux6.b(uf0.M, ux2Var);
                    long jC5 = bw0.c(uf0.K, ux2Var);
                    jC = bw0.c(uf0.O, ux2Var);
                    aw0 aw0Var = uf0.I;
                    jC2 = bw0.c(aw0Var, ux2Var);
                    jC3 = bw0.c(aw0Var, ux2Var);
                    jC4 = bw0.c(uf0.N, ux2Var);
                    i5 = i4 & (-268434433);
                    j10 = jC5;
                } else {
                    ux2Var.Q();
                    pw6VarB = pw6Var;
                    jC = j2;
                    jC2 = j3;
                    jC3 = j4;
                    jC4 = j5;
                    i5 = i4 & (-268434433);
                    fs4Var4 = fs4Var2;
                    j10 = j;
                }
                ux2Var.q();
                String str = o37Var.a.h;
                ux2Var.W(-663827885);
                long j11 = jC2;
                yy0 yy0VarO2 = au8.O(-1378313599, new uh(j11, (Object) o37Var, (Object) str, (byte) 3), ux2Var);
                ux2Var.p(false);
                if (o37Var.a.i) {
                    ux2Var.W(-663362203);
                    yy0VarO = au8.O(-1812633777, new hw2() { // from class: o.t37
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b2;
                            f88 f88Var = f88.a;
                            o37 o37Var2 = o37Var;
                            switch (b4) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        String strO = n37.o(R.string.m3c_snackbar_dismiss, ux2Var2);
                                        g08.c(b08.a(ux2Var2), au8.O(1030267332, new t20(strO, (byte) 3), ux2Var2), g08.d(ux2Var2), null, false, au8.O(1926608556, new l64(o37Var2, strO, (byte) 21), ux2Var2), ux2Var2, 100663344, 248);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        qs7.b(o37Var2.a.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-662527001);
                    ux2Var.p(false);
                    yy0VarO = null;
                }
                fs4 fs4VarB = ka0.B(fs4Var4, 12.0f);
                yy0 yy0VarO3 = au8.O(-1266389126, new hw2() { // from class: o.t37
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        o37 o37Var2 = o37Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    String strO = n37.o(R.string.m3c_snackbar_dismiss, ux2Var2);
                                    g08.c(b08.a(ux2Var2), au8.O(1030267332, new t20(strO, (byte) 3), ux2Var2), g08.d(ux2Var2), null, false, au8.O(1926608556, new l64(o37Var2, strO, (byte) 21), ux2Var2), ux2Var2, 100663344, 248);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    qs7.b(o37Var2.a.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var);
                int i7 = 805306368 | ((i5 << 3) & 7168);
                j6 = jC;
                long j12 = jC3;
                fs4 fs4Var5 = fs4Var4;
                yy0 yy0Var = yy0VarO;
                long j13 = jC4;
                c(fs4VarB, yy0VarO2, yy0Var, pw6VarB, j10, j6, j12, j13, yy0VarO3, ux2Var, i7, 0);
                j9 = j13;
                fs4Var3 = fs4Var5;
                j8 = j12;
                j7 = j11;
            } else {
                ux2Var.Q();
                pw6VarB = pw6Var;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                j9 = j5;
                fs4Var3 = fs4Var2;
                j10 = j;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.u37
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        x37.d(o37Var, fs4Var3, pw6VarB, j10, j6, j7, j8, j9, (ux2) obj, iY, i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 48;
        fs4Var2 = fs4Var;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        b2 = 0;
        b3 = 1;
        if ((38347923 & i4) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i4 & 1, z)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                pw6VarB = ux6.b(uf0.M, ux2Var);
                long jC6 = bw0.c(uf0.K, ux2Var);
                jC = bw0.c(uf0.O, ux2Var);
                aw0 aw0Var2 = uf0.I;
                jC2 = bw0.c(aw0Var2, ux2Var);
                jC3 = bw0.c(aw0Var2, ux2Var);
                jC4 = bw0.c(uf0.N, ux2Var);
                i5 = i4 & (-268434433);
                j10 = jC6;
            } else {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                pw6VarB = ux6.b(uf0.M, ux2Var);
                long jC7 = bw0.c(uf0.K, ux2Var);
                jC = bw0.c(uf0.O, ux2Var);
                aw0 aw0Var3 = uf0.I;
                jC2 = bw0.c(aw0Var3, ux2Var);
                jC3 = bw0.c(aw0Var3, ux2Var);
                jC4 = bw0.c(uf0.N, ux2Var);
                i5 = i4 & (-268434433);
                j10 = jC7;
            }
            ux2Var.q();
            String str2 = o37Var.a.h;
            ux2Var.W(-663827885);
            long j14 = jC2;
            yy0 yy0VarO4 = au8.O(-1378313599, new uh(j14, (Object) o37Var, (Object) str2, (byte) 3), ux2Var);
            ux2Var.p(false);
            if (o37Var.a.i) {
                ux2Var.W(-663362203);
                yy0VarO = au8.O(-1812633777, new hw2() { // from class: o.t37
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        o37 o37Var2 = o37Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    String strO = n37.o(R.string.m3c_snackbar_dismiss, ux2Var2);
                                    g08.c(b08.a(ux2Var2), au8.O(1030267332, new t20(strO, (byte) 3), ux2Var2), g08.d(ux2Var2), null, false, au8.O(1926608556, new l64(o37Var2, strO, (byte) 21), ux2Var2), ux2Var2, 100663344, 248);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    qs7.b(o37Var2.a.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-662527001);
                ux2Var.p(false);
                yy0VarO = null;
            }
            fs4 fs4VarB2 = ka0.B(fs4Var4, 12.0f);
            yy0 yy0VarO5 = au8.O(-1266389126, new hw2() { // from class: o.t37
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    o37 o37Var2 = o37Var;
                    switch (b4) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                String strO = n37.o(R.string.m3c_snackbar_dismiss, ux2Var2);
                                g08.c(b08.a(ux2Var2), au8.O(1030267332, new t20(strO, (byte) 3), ux2Var2), g08.d(ux2Var2), null, false, au8.O(1926608556, new l64(o37Var2, strO, (byte) 21), ux2Var2), ux2Var2, 100663344, 248);
                            }
                            break;
                        default:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                qs7.b(o37Var2.a.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var);
            int i8 = 805306368 | ((i5 << 3) & 7168);
            j6 = jC;
            long j15 = jC3;
            fs4 fs4Var6 = fs4Var4;
            yy0 yy0Var2 = yy0VarO;
            long j16 = jC4;
            c(fs4VarB2, yy0VarO4, yy0Var2, pw6VarB, j10, j6, j15, j16, yy0VarO5, ux2Var, i8, 0);
            j9 = j16;
            fs4Var3 = fs4Var6;
            j8 = j15;
            j7 = j14;
        } else {
            ux2Var.Q();
            pw6VarB = pw6Var;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            j9 = j5;
            fs4Var3 = fs4Var2;
            j10 = j;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.u37
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    x37.d(o37Var, fs4Var3, pw6VarB, j10, j6, j7, j8, j9, (ux2) obj, iY, i2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x00cb, please report this as an issue */
    public static final void e(sk7 sk7Var, fs4 fs4Var, jb4 jb4Var, Function0 function0, String str, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        byte b2;
        byte b3;
        boolean z;
        jb4 jb4Var2;
        fs4 fs4Var3;
        Function0 function2;
        String str3;
        j56 j56VarR;
        yy0 yy0VarO;
        fs4 fs4Var4;
        fs4 fs4Var5;
        jb4 jb4Var3;
        Function0 function3;
        String str4;
        fs4 fs4VarA;
        hw2 hw2Var;
        hw2 hw2Var2;
        al7 al7Var;
        ux2Var.Y(-1058568225);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? ux2Var.f(sk7Var) : ux2Var.h(sk7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (ux2Var.h(function1)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        str2 = str;
                        if (ux2Var.f(str2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    b2 = 0;
                    b3 = 1;
                    if ((74899 & i8) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ux2Var.N(i8 & 1, z)) {
                        ux2Var.S();
                        yy0VarO = null;
                        if ((i & 1) != 0 || ux2Var.x()) {
                            if (i9 != 0) {
                                fs4Var4 = cs4.b;
                            } else {
                                fs4Var4 = fs4Var2;
                            }
                            int i10 = kb4.a;
                            jb4 jb4VarA = kb4.a(rv0.g, ux2Var);
                            if (i4 != 0) {
                                function1 = null;
                            }
                            if (i6 != 0) {
                                str2 = "";
                            }
                            fs4Var5 = fs4Var4;
                            jb4Var3 = jb4VarA;
                        } else {
                            ux2Var.Q();
                            jb4Var3 = jb4Var;
                            fs4Var5 = fs4Var2;
                        }
                        function3 = function1;
                        str4 = str2;
                        ux2Var.q();
                        if (function3 != null) {
                            fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                        } else {
                            fs4VarA = fs4Var5;
                        }
                        hw2Var = sk7Var.d;
                        if (hw2Var == null) {
                            ux2Var.W(2139552313);
                            al7Var = sk7Var.c;
                            if (al7Var == null) {
                                ux2Var.W(2139552312);
                                ux2Var.p(false);
                            } else {
                                ux2Var.W(2139552313);
                                yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                                ux2Var.p(false);
                            }
                            ux2Var.p(false);
                            hw2Var2 = yy0VarO;
                        } else {
                            ux2Var.W(623205254);
                            ux2Var.p(false);
                            hw2Var2 = hw2Var;
                        }
                        pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                        jb4Var2 = jb4Var3;
                        str3 = str4;
                        fs4Var3 = fs4Var5;
                        function2 = function3;
                    } else {
                        ux2Var.Q();
                        jb4Var2 = jb4Var;
                        fs4Var3 = fs4Var2;
                        function2 = function1;
                        str3 = str2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
                    }
                }
                i3 |= 24576;
                str2 = str;
                i8 = i3 | 196608;
                b2 = 0;
                b3 = 1;
                if ((74899 & i8) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i8 & 1, z)) {
                    ux2Var.S();
                    yy0VarO = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i11 = kb4.a;
                        jb4 jb4VarA2 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA2;
                    } else {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i12 = kb4.a;
                        jb4 jb4VarA3 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA3;
                    }
                    function3 = function1;
                    str4 = str2;
                    ux2Var.q();
                    if (function3 != null) {
                        fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                    } else {
                        fs4VarA = fs4Var5;
                    }
                    hw2Var = sk7Var.d;
                    if (hw2Var == null) {
                        ux2Var.W(2139552313);
                        al7Var = sk7Var.c;
                        if (al7Var == null) {
                            ux2Var.W(2139552312);
                            ux2Var.p(false);
                        } else {
                            ux2Var.W(2139552313);
                            yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                            ux2Var.p(false);
                        }
                        ux2Var.p(false);
                        hw2Var2 = yy0VarO;
                    } else {
                        ux2Var.W(623205254);
                        ux2Var.p(false);
                        hw2Var2 = hw2Var;
                    }
                    pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                    jb4Var2 = jb4Var3;
                    str3 = str4;
                    fs4Var3 = fs4Var5;
                    function2 = function3;
                } else {
                    ux2Var.Q();
                    jb4Var2 = jb4Var;
                    fs4Var3 = fs4Var2;
                    function2 = function1;
                    str3 = str2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
                }
            }
            i3 |= 3072;
            function1 = function0;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (ux2Var.f(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                b2 = 0;
                b3 = 1;
                if ((74899 & i8) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i8 & 1, z)) {
                    ux2Var.S();
                    yy0VarO = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i13 = kb4.a;
                        jb4 jb4VarA4 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA4;
                    } else {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i14 = kb4.a;
                        jb4 jb4VarA5 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA5;
                    }
                    function3 = function1;
                    str4 = str2;
                    ux2Var.q();
                    if (function3 != null) {
                        fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                    } else {
                        fs4VarA = fs4Var5;
                    }
                    hw2Var = sk7Var.d;
                    if (hw2Var == null) {
                        ux2Var.W(2139552313);
                        al7Var = sk7Var.c;
                        if (al7Var == null) {
                            ux2Var.W(2139552312);
                            ux2Var.p(false);
                        } else {
                            ux2Var.W(2139552313);
                            yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                            ux2Var.p(false);
                        }
                        ux2Var.p(false);
                        hw2Var2 = yy0VarO;
                    } else {
                        ux2Var.W(623205254);
                        ux2Var.p(false);
                        hw2Var2 = hw2Var;
                    }
                    pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                    jb4Var2 = jb4Var3;
                    str3 = str4;
                    fs4Var3 = fs4Var5;
                    function2 = function3;
                } else {
                    ux2Var.Q();
                    jb4Var2 = jb4Var;
                    fs4Var3 = fs4Var2;
                    function2 = function1;
                    str3 = str2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
                }
            }
            i3 |= 24576;
            str2 = str;
            i8 = i3 | 196608;
            b2 = 0;
            b3 = 1;
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i8 & 1, z)) {
                ux2Var.S();
                yy0VarO = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i15 = kb4.a;
                    jb4 jb4VarA6 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA6;
                } else {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i16 = kb4.a;
                    jb4 jb4VarA7 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA7;
                }
                function3 = function1;
                str4 = str2;
                ux2Var.q();
                if (function3 != null) {
                    fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                } else {
                    fs4VarA = fs4Var5;
                }
                hw2Var = sk7Var.d;
                if (hw2Var == null) {
                    ux2Var.W(2139552313);
                    al7Var = sk7Var.c;
                    if (al7Var == null) {
                        ux2Var.W(2139552312);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(2139552313);
                        yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                        ux2Var.p(false);
                    }
                    ux2Var.p(false);
                    hw2Var2 = yy0VarO;
                } else {
                    ux2Var.W(623205254);
                    ux2Var.p(false);
                    hw2Var2 = hw2Var;
                }
                pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                jb4Var2 = jb4Var3;
                str3 = str4;
                fs4Var3 = fs4Var5;
                function2 = function3;
            } else {
                ux2Var.Q();
                jb4Var2 = jb4Var;
                fs4Var3 = fs4Var2;
                function2 = function1;
                str3 = str2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
            }
        }
        i3 |= 48;
        fs4Var2 = fs4Var;
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                if (ux2Var.h(function1)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (ux2Var.f(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                b2 = 0;
                b3 = 1;
                if ((74899 & i8) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i8 & 1, z)) {
                    ux2Var.S();
                    yy0VarO = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i17 = kb4.a;
                        jb4 jb4VarA8 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA8;
                    } else {
                        if (i9 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i18 = kb4.a;
                        jb4 jb4VarA9 = kb4.a(rv0.g, ux2Var);
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        fs4Var5 = fs4Var4;
                        jb4Var3 = jb4VarA9;
                    }
                    function3 = function1;
                    str4 = str2;
                    ux2Var.q();
                    if (function3 != null) {
                        fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                    } else {
                        fs4VarA = fs4Var5;
                    }
                    hw2Var = sk7Var.d;
                    if (hw2Var == null) {
                        ux2Var.W(2139552313);
                        al7Var = sk7Var.c;
                        if (al7Var == null) {
                            ux2Var.W(2139552312);
                            ux2Var.p(false);
                        } else {
                            ux2Var.W(2139552313);
                            yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                            ux2Var.p(false);
                        }
                        ux2Var.p(false);
                        hw2Var2 = yy0VarO;
                    } else {
                        ux2Var.W(623205254);
                        ux2Var.p(false);
                        hw2Var2 = hw2Var;
                    }
                    pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                    jb4Var2 = jb4Var3;
                    str3 = str4;
                    fs4Var3 = fs4Var5;
                    function2 = function3;
                } else {
                    ux2Var.Q();
                    jb4Var2 = jb4Var;
                    fs4Var3 = fs4Var2;
                    function2 = function1;
                    str3 = str2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
                }
            }
            i3 |= 24576;
            str2 = str;
            i8 = i3 | 196608;
            b2 = 0;
            b3 = 1;
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i8 & 1, z)) {
                ux2Var.S();
                yy0VarO = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i19 = kb4.a;
                    jb4 jb4VarA10 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA10;
                } else {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i110 = kb4.a;
                    jb4 jb4VarA11 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA11;
                }
                function3 = function1;
                str4 = str2;
                ux2Var.q();
                if (function3 != null) {
                    fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                } else {
                    fs4VarA = fs4Var5;
                }
                hw2Var = sk7Var.d;
                if (hw2Var == null) {
                    ux2Var.W(2139552313);
                    al7Var = sk7Var.c;
                    if (al7Var == null) {
                        ux2Var.W(2139552312);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(2139552313);
                        yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                        ux2Var.p(false);
                    }
                    ux2Var.p(false);
                    hw2Var2 = yy0VarO;
                } else {
                    ux2Var.W(623205254);
                    ux2Var.p(false);
                    hw2Var2 = hw2Var;
                }
                pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                jb4Var2 = jb4Var3;
                str3 = str4;
                fs4Var3 = fs4Var5;
                function2 = function3;
            } else {
                ux2Var.Q();
                jb4Var2 = jb4Var;
                fs4Var3 = fs4Var2;
                function2 = function1;
                str3 = str2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
            }
        }
        i3 |= 3072;
        function1 = function0;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (ux2Var.f(str2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            b2 = 0;
            b3 = 1;
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i8 & 1, z)) {
                ux2Var.S();
                yy0VarO = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i111 = kb4.a;
                    jb4 jb4VarA12 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA12;
                } else {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i112 = kb4.a;
                    jb4 jb4VarA13 = kb4.a(rv0.g, ux2Var);
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    fs4Var5 = fs4Var4;
                    jb4Var3 = jb4VarA13;
                }
                function3 = function1;
                str4 = str2;
                ux2Var.q();
                if (function3 != null) {
                    fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
                } else {
                    fs4VarA = fs4Var5;
                }
                hw2Var = sk7Var.d;
                if (hw2Var == null) {
                    ux2Var.W(2139552313);
                    al7Var = sk7Var.c;
                    if (al7Var == null) {
                        ux2Var.W(2139552312);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(2139552313);
                        yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                        ux2Var.p(false);
                    }
                    ux2Var.p(false);
                    hw2Var2 = yy0VarO;
                } else {
                    ux2Var.W(623205254);
                    ux2Var.p(false);
                    hw2Var2 = hw2Var;
                }
                pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
                jb4Var2 = jb4Var3;
                str3 = str4;
                fs4Var3 = fs4Var5;
                function2 = function3;
            } else {
                ux2Var.Q();
                jb4Var2 = jb4Var;
                fs4Var3 = fs4Var2;
                function2 = function1;
                str3 = str2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
            }
        }
        i3 |= 24576;
        str2 = str;
        i8 = i3 | 196608;
        b2 = 0;
        b3 = 1;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i8 & 1, z)) {
            ux2Var.S();
            yy0VarO = null;
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                int i113 = kb4.a;
                jb4 jb4VarA14 = kb4.a(rv0.g, ux2Var);
                if (i4 != 0) {
                    function1 = null;
                }
                if (i6 != 0) {
                    str2 = "";
                }
                fs4Var5 = fs4Var4;
                jb4Var3 = jb4VarA14;
            } else {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                int i114 = kb4.a;
                jb4 jb4VarA15 = kb4.a(rv0.g, ux2Var);
                if (i4 != 0) {
                    function1 = null;
                }
                if (i6 != 0) {
                    str2 = "";
                }
                fs4Var5 = fs4Var4;
                jb4Var3 = jb4VarA15;
            }
            function3 = function1;
            str4 = str2;
            ux2Var.q();
            if (function3 != null) {
                fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str4 + "-TVListItem");
            } else {
                fs4VarA = fs4Var5;
            }
            hw2Var = sk7Var.d;
            if (hw2Var == null) {
                ux2Var.W(2139552313);
                al7Var = sk7Var.c;
                if (al7Var == null) {
                    ux2Var.W(2139552312);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(2139552313);
                    yy0VarO = au8.O(1763243181, new tk7(al7Var, b2), ux2Var);
                    ux2Var.p(false);
                }
                ux2Var.p(false);
                hw2Var2 = yy0VarO;
            } else {
                ux2Var.W(623205254);
                ux2Var.p(false);
                hw2Var2 = hw2Var;
            }
            pb4.a(au8.O(-1323216575, new uk7(sk7Var, str4, b2), ux2Var), fs4VarA, au8.O(1937003486, new uk7(sk7Var, str4, b3), ux2Var), hw2Var2, au8.O(1247171996, new gg4(sk7Var, (byte) 22), ux2Var), jb4Var3, ux2Var, 199686, 388);
            jb4Var2 = jb4Var3;
            str3 = str4;
            fs4Var3 = fs4Var5;
            function2 = function3;
        } else {
            ux2Var.Q();
            jb4Var2 = jb4Var;
            fs4Var3 = fs4Var2;
            function2 = function1;
            str3 = str2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new n74(sk7Var, fs4Var3, jb4Var2, function2, str3, i, i2);
        }
    }

    public static final void f(final fs4 fs4Var, final long j, final long j2, final iw2 iw2Var, final hw2 hw2Var, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        ux2Var.Y(1955286154);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(iw2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            ig7.a(cp6.a(fs4Var, false, new fk6((byte) 6)), null, j, j2, 0.0f, 0.0f, au8.O(830280655, new xl7(yy0Var, hw2Var, iw2Var, b2), ux2Var), ux2Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.zm7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x37.f(fs4Var, j, j2, iw2Var, hw2Var, yy0Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void g(int i, String str, String str2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str3;
        fs4 fs4Var2;
        str.getClass();
        function0.getClass();
        ux2Var.Y(-1030283587);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.h(function0) ? 32 : 16) | 3456;
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            yk7 yk7Var = new yk7(R.drawable.stack);
            cs4 cs4Var = cs4.b;
            e(new sk7(y57.g(R.string.tv_options_Version), new n78(str), yk7Var, null, 8), cs4Var, null, function0, "TVTA-settings-tvVersion", ux2Var, ((i2 << 6) & 7168) | 24624, 36);
            str3 = "TVTA-settings-tvVersion";
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            str3 = str2;
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) str, (Object) function0, fs4Var2, (Object) str3, i, (byte) 23);
        }
    }

    public static final void h(pb6 pb6Var, float f, long j) {
        float fCeil = 0.0f;
        if (!w32.b(f, Float.NaN)) {
            fCeil = w32.b(f, 0.0f) ? 1.0f : (float) Math.ceil(f * pb6Var.m);
        }
        pb6Var.e((byte) 8, pb6Var.x, pb6Var.y);
        xc7 xc7Var = pb6Var.f1723o;
        if (xc7Var != null) {
            xc7Var.a |= 256;
            xc7Var.k = fCeil;
        }
        pb6Var.e((byte) 35, pb6Var.x, pb6Var.y);
        jo joVar = pb6Var.x;
        jo joVar2 = pb6Var.y;
        j98 j98Var = j98.a;
        if (joVar == j98Var) {
            if ((pb6Var.w & 1) != 0) {
                kw4 kw4Var = pb6Var.s;
                if (kw4Var == null || (joVar = (jo) kw4Var.b(50)) == null) {
                    joVar = qb6.a;
                }
            } else {
                joVar = null;
            }
        }
        if (joVar2 == j98Var) {
            if ((pb6Var.w & 1) != 0) {
                kw4 kw4Var2 = pb6Var.t;
                if (kw4Var2 == null || (joVar2 = (jo) kw4Var2.b(50)) == null) {
                    joVar2 = qb6.a;
                }
            } else {
                joVar2 = null;
            }
        }
        pb6Var.w = (joVar == null || joVar2 == null) ? pb6Var.w & (-2) : pb6Var.w | 1;
        pb6Var.f(50, joVar, joVar2);
        xc7 xc7Var2 = pb6Var.f1723o;
        if (xc7Var2 != null) {
            xc7Var2.d(j);
        }
    }

    public static final v56 i(il5 il5Var, int i, e18 e18Var, vs7 vs7Var, boolean z, int i2) {
        v56 v56VarC = vs7Var != null ? vs7Var.c(e18Var.b.q(i)) : v56.e;
        int iQ0 = il5Var.q0(2.0f);
        float f = v56VarC.a;
        return new v56(z ? (i2 - f) - iQ0 : f, v56VarC.b, z ? i2 - f : iQ0 + f, v56VarC.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final oz3 j(oz3 oz3Var) {
        oz3Var.getClass();
        if (oz3Var instanceof r58) {
            return ((r58) oz3Var).z();
        }
        return null;
    }

    public static int k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int l(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return k(b2, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b2 > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b2);
    }

    public static final m98 m(m98 m98Var, oz3 oz3Var) {
        m98Var.getClass();
        oz3Var.getClass();
        return u(m98Var, j(oz3Var));
    }

    public static final boolean n() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return eq.i();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(a));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = ((InvocationTargetException) e).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            gk0.r(cause);
            return false;
        }
    }

    public static boolean o(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static void p(String str, NetworkCapabilities networkCapabilities) {
        String str2;
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        boolean zHasCapability2 = networkCapabilities.hasCapability(16);
        boolean z = !networkCapabilities.hasCapability(11);
        ye4 ye4Var = ye4.a;
        ye4Var.f("Connectivity", " - " + str + " network - ");
        if (networkCapabilities.hasTransport(1)) {
            str2 = "WIFI";
        } else if (networkCapabilities.hasTransport(0)) {
            str2 = "CELLULAR";
        } else if (networkCapabilities.hasTransport(3)) {
            str2 = "ETHERNET";
        } else if (networkCapabilities.hasTransport(4)) {
            str2 = "VPN";
        } else {
            str2 = networkCapabilities.hasTransport(2) ? "BLUETOOTH" : "UNKNOWN";
        }
        ye4Var.f("Connectivity", " - Transport: ".concat(str2));
        StringBuilder sb = new StringBuilder(" - Internet: ");
        fx3.s(sb, zHasCapability, ", Validated: ", zHasCapability2, ", Metered: ");
        sb.append(z);
        ye4Var.f("Connectivity", sb.toString());
        if (Build.VERSION.SDK_INT >= 28) {
            ye4Var.f("Connectivity", " - Roaming: " + (!networkCapabilities.hasCapability(18)));
        }
    }

    public static m98 q(m98 m98Var) {
        m98Var.getClass();
        lm1 lm1VarL = cr.l(m98Var, false);
        if (lm1VarL != null) {
            return lm1VarL;
        }
        g07 g07VarR = r(m98Var);
        return g07VarR != null ? g07VarR : m98Var.s0(false);
    }

    public static final g07 r(m98 m98Var) {
        zl3 zl3Var;
        k48 k48VarO0 = m98Var.o0();
        zl3 zl3Var2 = k48VarO0 instanceof zl3 ? (zl3) k48VarO0 : null;
        if (zl3Var2 != null) {
            LinkedHashSet<oz3> linkedHashSet = zl3Var2.b;
            ArrayList arrayList = new ArrayList(mv0.Z(linkedHashSet, 10));
            boolean z = false;
            for (oz3 oz3VarQ : linkedHashSet) {
                if (p58.e(oz3VarQ)) {
                    oz3VarQ = q(oz3VarQ.r0());
                    z = true;
                }
                arrayList.add(oz3VarQ);
            }
            if (z) {
                oz3 oz3VarQ2 = zl3Var2.a;
                if (oz3VarQ2 == null) {
                    oz3VarQ2 = null;
                } else if (p58.e(oz3VarQ2)) {
                    oz3VarQ2 = q(oz3VarQ2.r0());
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                zl3Var = new zl3(linkedHashSet2);
                zl3Var.a = oz3VarQ2;
            } else {
                zl3Var = null;
            }
            if (zl3Var != null) {
                return zl3Var.e();
            }
        }
        return null;
    }

    public static int s(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                i = i3;
            } else if (b2 < -32) {
                if (i3 >= i2) {
                    return b2;
                }
                if (b2 < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b2 < -16) {
                if (i3 >= i2 - 1) {
                    return l(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if (b2 == -32 && b3 < -96) {
                    return -1;
                }
                if (b2 == -19 && b3 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return l(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b4 = bArr[i3];
                if (b4 > -65) {
                    return -1;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final g07 t(g07 g07Var, g07 g07Var2) {
        g07Var.getClass();
        g07Var2.getClass();
        return ct1.K(g07Var) ? g07Var : new i(g07Var, g07Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final m98 u(m98 m98Var, oz3 oz3Var) {
        m98Var.getClass();
        if (m98Var instanceof r58) {
            return u(((r58) m98Var).j0(), oz3Var);
        }
        if (oz3Var == null || oz3Var.equals(m98Var)) {
            return m98Var;
        }
        if (m98Var instanceof g07) {
            return new k07((g07) m98Var, oz3Var);
        }
        if (m98Var instanceof um2) {
            return new xm2((um2) m98Var, oz3Var);
        }
        gk0.s();
        return null;
    }

    public static /* synthetic */ boolean v(Unsafe unsafe, vs8 vs8Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(vs8Var, j, obj, obj2)) {
            if (unsafe.getObject(vs8Var, j) != obj && unsafe.getObject(vs8Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
