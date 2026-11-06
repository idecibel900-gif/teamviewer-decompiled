package o;

import android.content.res.Resources;
import android.text.Spanned;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class m77 {
    public static final String A(int i, Object[] objArr, ux2 ux2Var) {
        return ((Resources) ux2Var.j(lh.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final float B(ux2 ux2Var) {
        float f = ((w32) ux2Var.j(ml3.c)).m;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - ka0.x) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public static final wj3 C(nj3 nj3Var) {
        return new wj3(nj3Var.a, nj3Var.b, nj3Var.c, nj3Var.d);
    }

    public static int D(int i, int i2) {
        if (i2 < 0) {
            hk0.g("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:247:0x03dc  */
    public static final void a(final CharSequence charSequence, final hw2 hw2Var, final n37 n37Var, final iw2 iw2Var, final hw2 hw2Var2, final hw2 hw2Var3, final hw2 hw2Var4, final hw2 hw2Var5, final boolean z, final boolean z2, final boolean z3, final mw4 mw4Var, final nd5 nd5Var, final cq7 cq7Var, final hw2 hw2Var6, ux2 ux2Var, final int i, final int i2) {
        CharSequence charSequence2;
        int i3;
        int i4;
        ux2 ux2Var2;
        kj3 kj3Var;
        g2 g2Var;
        q18 q18VarZ;
        u18 u18Var;
        ux2 ux2Var3;
        boolean z4;
        q18 q18VarZ2;
        boolean z5;
        q18 q18Var;
        cq7 cq7Var2;
        yy0 yy0Var;
        final long j;
        yl7 yl7Var;
        yy0 yy0Var2;
        long j2;
        yy0 yy0Var3;
        long j3;
        yy0 yy0Var4;
        long j4;
        boolean z6;
        yy0 yy0Var5;
        Object objP0;
        float f;
        Object objP1;
        float f2;
        Object objB;
        float f3;
        yl7 yl7Var2 = yl7.X;
        yn1 yn1Var = vn4.j0;
        ux2Var.Y(-1478429597);
        if ((i & 6) == 0) {
            charSequence2 = charSequence;
            i3 = i | (ux2Var.h(charSequence2) ? 4 : 2);
        } else {
            charSequence2 = charSequence;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(n37Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(iw2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(hw2Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.h(hw2Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(hw2Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var.h(hw2Var5) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.g(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.f(mw4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.f(nd5Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ux2Var.f(cq7Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ux2Var.h(hw2Var6) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (ux2Var.N(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 599187) == 599186) ? false : true)) {
            boolean zBooleanValue = ((Boolean) qs1.H(mw4Var, ux2Var, (i6 >> 9) & 14).getValue()).booleanValue();
            kj3 kj3Var2 = kj3.f1271o;
            kj3 kj3Var3 = kj3.n;
            kj3 kj3Var4 = kj3.m;
            if (zBooleanValue) {
                kj3Var = kj3Var4;
            } else {
                kj3Var = charSequence2.length() == 0 ? kj3Var3 : kj3Var2;
            }
            h68 h68Var = ((rn4) ux2Var.j(un4.a)).b;
            final ot7 ot7Var = h68Var.j;
            ot7 ot7Var2 = h68Var.l;
            long jC = ot7Var.c();
            long j5 = rv0.h;
            boolean z7 = (z68.a(jC, j5) && !z68.a(ot7Var2.c(), j5)) || (!z68.a(ot7Var.c(), j5) && z68.a(ot7Var2.c(), j5));
            u18 u18VarY0 = ck3.y0(kj3Var, "TextFieldInputState", ux2Var, 48, 0);
            g2 g2Var2 = u18VarY0.a;
            boolean z8 = iw2Var != null && ((n37Var instanceof xq7) || (n37Var instanceof wq7));
            float f4 = 1.0f;
            aw awVar = e01.a;
            if (iw2Var != null) {
                ux2Var.W(994993276);
                e87 e87VarC0 = xs1.c0(du4.n, ux2Var);
                if (u18VarY0.g()) {
                    z7 = z7;
                    g2Var = g2Var2;
                    z8 = z8;
                    ux2Var.W(1666827533);
                    ux2Var.p(false);
                    objP1 = g2Var.p0();
                } else {
                    ux2Var.W(1666573488);
                    boolean zF = ux2Var.f(u18VarY0);
                    objP1 = ux2Var.K();
                    if (zF || objP1 == awVar) {
                        n47 n47VarC = el5.c();
                        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                        g2Var = g2Var2;
                        n47 n47VarF = el5.f(n47VarC);
                        try {
                            Object objP2 = g2Var.p0();
                            el5.h(n47VarC, n47VarF, function1E);
                            ux2Var.g0(objP2);
                            objP1 = objP2;
                        } catch (Throwable th) {
                            el5.h(n47VarC, n47VarF, function1E);
                            throw th;
                        }
                    } else {
                        z7 = z7;
                        g2Var = g2Var2;
                    }
                    ux2Var.p(false);
                }
                ux2Var.W(1071902915);
                int iOrdinal = ((kj3) objP1).ordinal();
                if (iOrdinal == 0) {
                    f2 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            gk0.s();
                            return;
                        }
                    } else if (z8) {
                        f2 = 0.0f;
                    }
                    f2 = 1.0f;
                }
                ux2Var.p(false);
                Float fValueOf = Float.valueOf(f2);
                boolean zF2 = ux2Var.f(u18VarY0);
                Object objK = ux2Var.K();
                if (zF2 || objK == awVar) {
                    objB = d57.b(new iq0(u18VarY0, (byte) 12));
                    ux2Var.g0(objB);
                } else {
                    objB = objK;
                }
                kj3 kj3Var5 = (kj3) ((i97) objB).getValue();
                ux2Var.W(1071902915);
                int iOrdinal2 = kj3Var5.ordinal();
                if (iOrdinal2 == 0) {
                    f3 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            gk0.s();
                            return;
                        }
                    } else if (z8) {
                        f3 = 0.0f;
                    }
                    f3 = 1.0f;
                }
                ux2Var.p(false);
                Float fValueOf2 = Float.valueOf(f3);
                boolean zF3 = ux2Var.f(u18VarY0);
                Object objK2 = ux2Var.K();
                if (zF3 || objK2 == awVar) {
                    objK2 = d57.b(new iq0(u18VarY0, (byte) 13));
                    ux2Var.g0(objK2);
                }
                ux2Var.W(1806589607);
                ux2Var.p(false);
                q18VarZ = ck3.z(u18VarY0, fValueOf, fValueOf2, e87VarC0, yn1Var, ux2Var, 196608);
                ux2Var.p(false);
            } else {
                z7 = z7;
                g2Var = g2Var2;
                z8 = z8;
                ux2Var.W(995064483);
                ux2Var.p(false);
                q18VarZ = null;
            }
            if (hw2Var2 != null) {
                ux2Var.W(995155127);
                e87 e87VarC1 = xs1.c0(du4.p, ux2Var);
                e87 e87VarC2 = xs1.c0(du4.q, ux2Var);
                if (u18VarY0.g()) {
                    e87VarC1 = e87VarC1;
                    e87VarC2 = e87VarC2;
                    ux2Var.W(1666827533);
                    ux2Var.p(false);
                    objP0 = g2Var.p0();
                } else {
                    ux2Var.W(1666573488);
                    boolean zF4 = ux2Var.f(u18VarY0);
                    objP0 = ux2Var.K();
                    if (zF4 || objP0 == awVar) {
                        n47 n47VarC2 = el5.c();
                        Function1 function1E2 = n47VarC2 != null ? n47VarC2.e() : null;
                        n47 n47VarF2 = el5.f(n47VarC2);
                        try {
                            Object objP3 = g2Var.p0();
                            el5.h(n47VarC2, n47VarF2, function1E2);
                            ux2Var.g0(objP3);
                            objP0 = objP3;
                        } catch (Throwable th2) {
                            el5.h(n47VarC2, n47VarF2, function1E2);
                            throw th2;
                        }
                    }
                    ux2Var.p(false);
                }
                ux2Var.W(-2037958114);
                int iOrdinal3 = ((kj3) objP0).ordinal();
                if (iOrdinal3 == 0) {
                    f = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            gk0.s();
                            return;
                        }
                    } else if (!z8) {
                        f = 1.0f;
                    }
                    f = 0.0f;
                }
                ux2Var.p(false);
                Float fValueOf3 = Float.valueOf(f);
                boolean zF5 = ux2Var.f(u18VarY0);
                Object objK3 = ux2Var.K();
                if (zF5 || objK3 == awVar) {
                    objK3 = d57.b(new iq0(u18VarY0, (byte) 16));
                    ux2Var.g0(objK3);
                }
                kj3 kj3Var6 = (kj3) ((i97) objK3).getValue();
                ux2Var.W(-2037958114);
                int iOrdinal4 = kj3Var6.ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            gk0.s();
                            return;
                        }
                    } else if (z8) {
                    }
                    f4 = 0.0f;
                }
                ux2Var.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                boolean zF6 = ux2Var.f(u18VarY0);
                Object objK4 = ux2Var.K();
                if (zF6 || objK4 == awVar) {
                    objK4 = d57.b(new iq0(u18VarY0, (byte) 17));
                    ux2Var.g0(objK4);
                }
                o18 o18Var = (o18) ((i97) objK4).getValue();
                ux2Var.W(-1370891590);
                e87 e87Var = (!o18Var.c(kj3Var4, kj3Var3) && (o18Var.c(kj3Var3, kj3Var4) || o18Var.c(kj3Var2, kj3Var3))) ? e87VarC2 : e87VarC1;
                z4 = false;
                ux2Var.p(false);
                u18Var = u18VarY0;
                q18VarZ2 = ck3.z(u18Var, fValueOf3, fValueOf4, e87Var, yn1Var, ux2Var, 196608);
                ux2Var3 = ux2Var;
                ux2Var3.p(false);
            } else {
                q18VarZ = q18VarZ;
                u18Var = u18VarY0;
                ux2Var3 = ux2Var;
                z4 = false;
                ux2Var3.W(995231139);
                ux2Var3.p(false);
                q18VarZ2 = null;
            }
            ux2Var3.W(995398787);
            ux2Var3.p(z4);
            if (iw2Var == null) {
                ux2Var3.W(995485028);
                ux2Var3.p(z4);
                cq7Var2 = cq7Var;
                z5 = zBooleanValue;
                q18Var = q18VarZ;
                yy0Var = null;
            } else {
                ux2Var3.W(995485029);
                z5 = zBooleanValue;
                q18 q18Var2 = q18VarZ;
                q18Var = q18Var2;
                cq7Var2 = cq7Var;
                yy0 yy0VarO = au8.O(-568812970, new gq7(q18Var2, cq7Var, z2, z3, z5, z7, u18Var, ot7Var2, ot7Var, iw2Var), ux2Var3);
                ux2Var3.p(z4);
                yy0Var = yy0VarO;
            }
            if (!z2) {
                j = cq7Var2.D;
            } else if (z3) {
                j = cq7Var2.E;
            } else {
                j = z5 ? cq7Var2.B : cq7Var2.C;
            }
            Object objK5 = ux2Var3.K();
            if (objK5 == awVar) {
                b5 b5Var = new b5(q18VarZ2, (byte) 11);
                ep3 ep3Var = d57.a;
                yl7Var = yl7Var2;
                eo1 eo1Var = new eo1(b5Var, yl7Var);
                ux2Var3.g0(eo1Var);
                objK5 = eo1Var;
            } else {
                yl7Var = r23;
            }
            i97 i97Var = (i97) objK5;
            if (hw2Var2 != null && charSequence.length() == 0 && ((Boolean) i97Var.getValue()).booleanValue()) {
                ux2Var3.W(996556513);
                yy0 yy0VarO2 = au8.O(1789869489, new iw2() { // from class: o.nq7
                    @Override // o.iw2
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        fs4 fs4Var = (fs4) obj;
                        ux2 ux2Var4 = (ux2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ux2Var4.f(fs4Var) ? 4 : 2;
                        }
                        if (ux2Var4.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                            do4 do4VarC = ua0.c(xz2.f2564o, false);
                            int iHashCode = Long.hashCode(ux2Var4.T);
                            yj5 yj5VarL = ux2Var4.l();
                            fs4 fs4VarS = uf0.s(ux2Var4, fs4Var);
                            yz0.c.getClass();
                            ux2Var4.a0();
                            if (ux2Var4.S) {
                                ux2Var4.k(LayoutNode.e0);
                            } else {
                                ux2Var4.j0();
                            }
                            o67.n(do4VarC, d82.v, ux2Var4);
                            o67.n(yj5VarL, d82.u, ux2Var4);
                            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var4);
                            o67.l(ux2Var4);
                            o67.n(fs4VarS, d82.t, ux2Var4);
                            m77.d(j, ot7Var, hw2Var2, ux2Var4, 0);
                            ux2Var4.p(true);
                        } else {
                            ux2Var4.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var3);
                ux2Var3.p(false);
                yy0Var2 = yy0VarO2;
            } else {
                ux2Var3.W(996868186);
                ux2Var3.p(false);
                yy0Var2 = null;
            }
            Object objK6 = ux2Var3.K();
            if (objK6 == awVar) {
                b5 b5Var2 = new b5(null, (byte) 12);
                ep3 ep3Var2 = d57.a;
                eo1 eo1Var2 = new eo1(b5Var2, yl7Var);
                ux2Var3.g0(eo1Var2);
                objK6 = eo1Var2;
            }
            ux2Var3.W(997311610);
            ux2Var3.p(false);
            ux2Var3.W(997632026);
            ux2Var3.p(false);
            if (!z2) {
                j2 = cq7Var2.r;
            } else if (z3) {
                j2 = cq7Var2.s;
            } else {
                j2 = z5 ? cq7Var2.p : cq7Var2.q;
            }
            if (hw2Var3 == null) {
                ux2Var3.W(997794745);
                ux2Var3.p(false);
                yy0Var3 = null;
            } else {
                ux2Var3.W(997794746);
                yy0 yy0VarO3 = au8.O(-341635739, new hq7(j2, hw2Var3, (byte) 0), ux2Var3);
                ux2Var3.p(false);
                yy0Var3 = yy0VarO3;
            }
            if (!z2) {
                j3 = cq7Var2.v;
            } else if (z3) {
                j3 = cq7Var2.w;
            } else {
                j3 = z5 ? cq7Var2.t : cq7Var2.u;
            }
            if (hw2Var4 == null) {
                ux2Var3.W(998054680);
                ux2Var3.p(false);
                yy0Var4 = null;
            } else {
                ux2Var3.W(998054681);
                yy0 yy0VarO4 = au8.O(-1014805251, new hq7(j3, hw2Var4, (byte) 1), ux2Var3);
                ux2Var3.p(false);
                yy0Var4 = yy0VarO4;
            }
            if (!z2) {
                j4 = cq7Var2.H;
            } else if (z3) {
                j4 = cq7Var2.I;
            } else {
                j4 = z5 ? cq7Var2.F : cq7Var2.G;
            }
            long j6 = j4;
            if (hw2Var5 == null) {
                ux2Var3.W(998325155);
                z6 = false;
                ux2Var3.p(false);
                yy0Var5 = null;
            } else {
                z6 = false;
                ux2Var3.W(998325156);
                yy0 yy0VarO5 = au8.O(-1718586554, new uh(j6, (Object) ot7Var2, (Object) hw2Var5, (byte) 4), ux2Var3);
                ux2Var3.p(false);
                yy0Var5 = yy0VarO5;
            }
            boolean zF7 = ux2Var3.f(q18Var);
            Object objK7 = ux2Var3.K();
            if (zF7 || objK7 == awVar) {
                objK7 = new b5(q18Var, (byte) 8);
                ux2Var3.g0(objK7);
            }
            Function0 function0 = (Function0) objK7;
            boolean zF8 = ux2Var3.f(q18VarZ2);
            Object objK8 = ux2Var3.K();
            if (zF8 || objK8 == awVar) {
                objK8 = new b5(q18VarZ2, (byte) 9);
                ux2Var3.g0(objK8);
            }
            Function0 function1 = (Function0) objK8;
            i97 i97Var2 = null;
            boolean zF9 = ux2Var3.f(null);
            Object objK9 = ux2Var3.K();
            if (zF9 || objK9 == awVar) {
                objK9 = new b5(i97Var2, (byte) 10);
                ux2Var3.g0(objK9);
            }
            Function0 function2 = (Function0) objK9;
            if (n37Var instanceof wq7) {
                ux2Var3.W(998773354);
                Object objK10 = ux2Var3.K();
                if (objK10 == awVar) {
                    objK10 = h57.p(new y07(0L));
                    ux2Var3.g0(objK10);
                }
                px4 px4Var = (px4) objK10;
                boolean z9 = z6;
                ux2 ux2Var4 = ux2Var3;
                yy0 yy0VarO6 = au8.O(-852893942, new z8((Object) px4Var, (Object) n37Var, (Object) nd5Var, (Object) hw2Var6, (byte) 21), ux2Var4);
                wq7 wq7Var = (wq7) n37Var;
                rq7 rq7Var = new rq7(function0);
                rq7 rq7Var2 = new rq7(function1);
                rq7 rq7Var3 = new rq7(function2);
                boolean zF10 = ux2Var4.f(function0);
                Object objK11 = ux2Var4.K();
                if (zF10 || objK11 == awVar) {
                    objK11 = new py5((Object) function0, (Object) px4Var, (byte) 18);
                    ux2Var4.g0(objK11);
                }
                b(hw2Var, yy0Var2, yy0Var, yy0Var3, yy0Var4, null, null, z, wq7Var, rq7Var, rq7Var2, rq7Var3, (Function1) objK11, yy0VarO6, yy0Var5, nd5Var, ux2Var4, (i5 & 112) | 6 | ((i6 << 24) & 234881024) | ((i5 << 21) & 1879048192), (3670016 & (i6 << 6)) | 24576);
                ux2Var2 = ux2Var4;
                ux2Var2.p(z9);
            } else {
                ux2Var3.W(1000456933);
                ux2 ux2Var5 = ux2Var3;
                f(hw2Var, yy0Var, yy0Var2, yy0Var3, yy0Var4, null, null, z, n37Var, new rq7(function0), new rq7(function1), new rq7(function2), au8.O(590261845, new xd(hw2Var6, (byte) 6), ux2Var3), yy0Var5, nd5Var, ux2Var5, 6 | (i5 & 112) | ((i6 << 24) & 234881024) | ((i5 << 21) & 1879048192), ((i6 << 3) & 458752) | 3072);
                ux2Var2 = ux2Var5;
                ux2Var2.p(false);
            }
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.mq7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    m77.a(charSequence, hw2Var, n37Var, iw2Var, hw2Var2, hw2Var3, hw2Var4, hw2Var5, z, z2, z3, mw4Var, nd5Var, cq7Var, hw2Var6, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x055e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0562  */
    /* JADX WARN: Code duplicated, block: B:267:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:269:0x05a6  */
    public static final void b(hw2 hw2Var, iw2 iw2Var, final hw2 hw2Var2, final hw2 hw2Var3, final hw2 hw2Var4, final hw2 hw2Var5, final hw2 hw2Var6, final boolean z, final wq7 wq7Var, final rq7 rq7Var, final rq7 rq7Var2, final rq7 rq7Var3, final Function1 function1, final yy0 yy0Var, hw2 hw2Var7, nd5 nd5Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        final hw2 hw2Var8;
        hw2 hw2Var9;
        nd5 nd5Var2;
        ux2 ux2Var2;
        iw2 iw2Var2;
        float f;
        Object cc5Var;
        y50 y50Var;
        boolean z2;
        y50 y50Var2;
        float f2;
        hw2 hw2Var10;
        boolean z3;
        rq7 rq7Var4;
        boolean z4;
        Object objK;
        y50 y50Var3 = xz2.s;
        y50 y50Var4 = xz2.f2564o;
        ux2Var.Y(-1572199315);
        int i5 = i & 6;
        cs4 cs4Var = cs4.b;
        if (i5 == 0) {
            i3 = i | (ux2Var.f(cs4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(iw2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(hw2Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(hw2Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.h(hw2Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(hw2Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.h(hw2Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.f(wq7Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? ux2Var.f(rq7Var) : ux2Var.h(rq7Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? ux2Var.f(rq7Var2) : ux2Var.h(rq7Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? ux2Var.f(rq7Var3) : ux2Var.h(rq7Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ux2Var.h(hw2Var7) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ux2Var.f(nd5Var) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            float fB = B(ux2Var);
            int i7 = i6 & 14;
            boolean zC = ((i6 & 7168) == 2048) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && ux2Var.f(rq7Var))) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && ux2Var.f(rq7Var2))) | ((i6 & 896) == 256 || ((i6 & 512) != 0 && ux2Var.f(rq7Var3))) | ((3670016 & i6) == 1048576) | ux2Var.c(fB);
            Object objK2 = ux2Var.K();
            aw awVar = e01.a;
            if (zC || objK2 == awVar) {
                f = fB;
                ux2Var2 = ux2Var;
                y50Var = y50Var3;
                cc5Var = new cc5(function1, z, wq7Var, rq7Var, rq7Var2, rq7Var3, nd5Var, f);
                ux2Var2.g0(cc5Var);
            } else {
                ux2Var2 = ux2Var;
                y50Var = y50Var3;
                f = fB;
                cc5Var = objK2;
            }
            cc5 cc5Var2 = (cc5) cc5Var;
            j04 j04Var = (j04) ux2Var2.j(b11.n);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z5 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z5) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(cc5Var2, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            yy0Var.invoke(ux2Var2, Integer.valueOf((i6 >> 12) & 14));
            jr4 jr4Var = jr4.b;
            if (hw2Var3 != null) {
                ux2Var2.W(1051742060);
                fs4 fs4VarF = hm3.w(cs4Var, "Leading").f(jr4Var);
                do4 do4VarC = ua0.c(y50Var, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS2, iz0Var4, ux2Var2);
                hw2Var3.invoke(ux2Var2, Integer.valueOf((i3 >> 12) & 14));
                ux2Var2.p(true);
                z2 = false;
                ux2Var2.p(false);
            } else {
                z2 = false;
                ux2Var2.W(1051988076);
                ux2Var2.p(false);
            }
            if (hw2Var4 != null) {
                ux2Var2.W(1052030794);
                fs4 fs4VarF2 = hm3.w(cs4Var, "Trailing").f(jr4Var);
                do4 do4VarC2 = ua0.c(y50Var, z2);
                int iHashCode3 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL3 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarF2);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC2, iz0Var, ux2Var2);
                o67.n(yj5VarL3, iz0Var2, ux2Var2);
                e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS3, iz0Var4, ux2Var2);
                hw2Var4.invoke(ux2Var2, Integer.valueOf((i3 >> 15) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1052278732);
                ux2Var2.p(z2);
            }
            nd5Var2 = nd5Var;
            float fP = ka0.p(nd5Var2, j04Var);
            float fO = ka0.o(nd5Var2, j04Var);
            if (hw2Var3 != null) {
                fP -= f;
                if (fP < 0.0f) {
                    fP = 0.0f;
                }
            }
            float f3 = fP;
            if (hw2Var4 != null) {
                fO -= f;
                if (fO < 0.0f) {
                    fO = 0.0f;
                }
            }
            if (hw2Var5 != null) {
                ux2Var2.W(1052982711);
                fs4 fs4VarF3 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Prefix"), 24.0f, 0.0f, 2)), f3, 0.0f, 2.0f, 0.0f, 10);
                y50Var2 = y50Var4;
                do4 do4VarC3 = ua0.c(y50Var2, false);
                int iHashCode4 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL4 = ux2Var2.l();
                fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarF3);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC3, iz0Var, ux2Var2);
                o67.n(yj5VarL4, iz0Var2, ux2Var2);
                e41.r(iHashCode4, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS4, iz0Var4, ux2Var2);
                hw2Var5.invoke(ux2Var2, Integer.valueOf((i3 >> 18) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                y50Var2 = r17;
                ux2Var2.W(1053310412);
                ux2Var2.p(false);
            }
            if (hw2Var6 != null) {
                ux2Var2.W(1053353657);
                f2 = fO;
                fs4 fs4VarF4 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                do4 do4VarC4 = ua0.c(y50Var2, false);
                int iHashCode5 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL5 = ux2Var2.l();
                fs4 fs4VarS5 = uf0.s(ux2Var2, fs4VarF4);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC4, iz0Var, ux2Var2);
                o67.n(yj5VarL5, iz0Var2, ux2Var2);
                e41.r(iHashCode5, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS5, iz0Var4, ux2Var2);
                hw2Var10 = hw2Var6;
                hw2Var10.invoke(ux2Var2, Integer.valueOf((i3 >> 21) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                f2 = fO;
                hw2Var10 = hw2Var6;
                ux2Var2.W(1053679436);
                ux2Var2.p(false);
            }
            fs4 fs4VarF5 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(cs4Var, 24.0f, 0.0f, 2)), hw2Var5 == null ? f3 : 0.0f, 0.0f, hw2Var10 == null ? f2 : 0.0f, 0.0f, 10);
            if (iw2Var != null) {
                ux2Var2.W(1054049421);
                iw2Var2 = iw2Var;
                iw2Var2.d(hm3.w(cs4Var, "Hint").f(fs4VarF5), ux2Var2, Integer.valueOf((i3 >> 3) & 112));
                ux2Var2.p(false);
            } else {
                iw2Var2 = iw2Var;
                ux2Var2.W(1054140716);
                ux2Var2.p(false);
            }
            fs4 fs4VarF6 = hm3.w(cs4Var, "TextField").f(fs4VarF5);
            do4 do4VarC5 = ua0.c(y50Var2, true);
            int iHashCode6 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL6 = ux2Var2.l();
            fs4 fs4VarS6 = uf0.s(ux2Var2, fs4VarF6);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC5, iz0Var, ux2Var2);
            o67.n(yj5VarL6, iz0Var2, ux2Var2);
            e41.r(iHashCode6, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS6, iz0Var4, ux2Var2);
            hw2Var8 = hw2Var;
            hw2Var8.invoke(ux2Var2, Integer.valueOf((i3 >> 3) & 14));
            ux2Var2.p(true);
            if (hw2Var2 != null) {
                ux2Var2.W(1054793359);
                byte b = 4;
                if (i7 != 4) {
                    if ((i6 & 8) != 0) {
                        rq7Var4 = rq7Var;
                        if (ux2Var2.h(rq7Var4)) {
                        }
                        objK = ux2Var2.K();
                        if (z4 || objK == awVar) {
                            objK = new iq7(rq7Var4, (byte) 1);
                            ux2Var2.g0(objK);
                        }
                        fs4 fs4VarF7 = hm3.w(androidx.compose.foundation.layout.b.r(vn4.j0(cs4Var, new k80((Function0) objK, b))), "Label").f(cs4Var);
                        do4 do4VarC6 = ua0.c(y50Var2, false);
                        int iHashCode7 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL7 = ux2Var2.l();
                        fs4 fs4VarS7 = uf0.s(ux2Var2, fs4VarF7);
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(do4VarC6, iz0Var, ux2Var2);
                        o67.n(yj5VarL7, iz0Var2, ux2Var2);
                        e41.r(iHashCode7, ux2Var2, iz0Var3, ux2Var2);
                        o67.n(fs4VarS7, iz0Var4, ux2Var2);
                        hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 9) & 14));
                        ux2Var2.p(true);
                        ux2Var2.p(false);
                    } else {
                        rq7Var4 = rq7Var;
                    }
                    z4 = false;
                    objK = ux2Var2.K();
                    if (z4) {
                        objK = new iq7(rq7Var4, (byte) 1);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new iq7(rq7Var4, (byte) 1);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarF8 = hm3.w(androidx.compose.foundation.layout.b.r(vn4.j0(cs4Var, new k80((Function0) objK, b))), "Label").f(cs4Var);
                    do4 do4VarC7 = ua0.c(y50Var2, false);
                    int iHashCode8 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL8 = ux2Var2.l();
                    fs4 fs4VarS8 = uf0.s(ux2Var2, fs4VarF8);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC7, iz0Var, ux2Var2);
                    o67.n(yj5VarL8, iz0Var2, ux2Var2);
                    e41.r(iHashCode8, ux2Var2, iz0Var3, ux2Var2);
                    o67.n(fs4VarS8, iz0Var4, ux2Var2);
                    hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 9) & 14));
                    ux2Var2.p(true);
                    ux2Var2.p(false);
                } else {
                    rq7Var4 = rq7Var;
                }
                z4 = true;
                objK = ux2Var2.K();
                if (z4) {
                    objK = new iq7(rq7Var4, (byte) 1);
                    ux2Var2.g0(objK);
                } else {
                    objK = new iq7(rq7Var4, (byte) 1);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarF9 = hm3.w(androidx.compose.foundation.layout.b.r(vn4.j0(cs4Var, new k80((Function0) objK, b))), "Label").f(cs4Var);
                do4 do4VarC8 = ua0.c(y50Var2, false);
                int iHashCode9 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL9 = ux2Var2.l();
                fs4 fs4VarS9 = uf0.s(ux2Var2, fs4VarF9);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC8, iz0Var, ux2Var2);
                o67.n(yj5VarL9, iz0Var2, ux2Var2);
                e41.r(iHashCode9, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS9, iz0Var4, ux2Var2);
                hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 9) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1055190252);
                ux2Var2.p(false);
            }
            if (hw2Var7 != null) {
                ux2Var2.W(1055238767);
                fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Supporting"), 16.0f, 0.0f, 2)), new pd5(16.0f, 4.0f, 16.0f, 0.0f));
                do4 do4VarC9 = ua0.c(y50Var2, false);
                int iHashCode10 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL10 = ux2Var2.l();
                fs4 fs4VarS10 = uf0.s(ux2Var2, fs4VarA);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC9, iz0Var, ux2Var2);
                o67.n(yj5VarL10, iz0Var2, ux2Var2);
                e41.r(iHashCode10, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS10, iz0Var4, ux2Var2);
                hw2Var9 = hw2Var7;
                hw2Var9.invoke(ux2Var2, Integer.valueOf((i6 >> 15) & 14));
                z3 = true;
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                hw2Var9 = hw2Var7;
                z3 = true;
                ux2Var2.W(1055574156);
                ux2Var2.p(false);
            }
            ux2Var2.p(z3);
        } else {
            hw2Var8 = hw2Var;
            hw2Var9 = hw2Var7;
            nd5Var2 = nd5Var;
            ux2Var2 = ux2Var;
            iw2Var2 = iw2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final iw2 iw2Var3 = iw2Var2;
            final nd5 nd5Var3 = nd5Var2;
            final hw2 hw2Var11 = hw2Var9;
            j56VarR.d = new hw2() { // from class: o.kq7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    m77.b(hw2Var8, iw2Var3, hw2Var2, hw2Var3, hw2Var4, hw2Var5, hw2Var6, z, wq7Var, rq7Var, rq7Var2, rq7Var3, function1, yy0Var, hw2Var11, nd5Var3, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x020a  */
    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0238  */
    /* JADX WARN: Code duplicated, block: B:145:0x025e  */
    /* JADX WARN: Code duplicated, block: B:192:0x037b  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:216:0x041b A[PHI: r11
      0x041b: PHI (r11v27 o.as7) = (r11v26 o.as7), (r11v26 o.as7), (r11v42 o.as7) binds: [B:223:0x043c, B:228:0x044d, B:214:0x0413] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x041f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0422  */
    /* JADX WARN: Code duplicated, block: B:235:0x0466  */
    /* JADX WARN: Code duplicated, block: B:238:0x0486  */
    /* JADX WARN: Code duplicated, block: B:241:0x048c  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:249:0x04df  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:261:0x0533 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0535  */
    /* JADX WARN: Code duplicated, block: B:264:0x0555  */
    /* JADX WARN: Code duplicated, block: B:266:0x0558  */
    /* JADX WARN: Code duplicated, block: B:267:0x0572  */
    /* JADX WARN: Code duplicated, block: B:272:0x0582 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0584  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:285:0x060e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0612  */
    /* JADX WARN: Code duplicated, block: B:290:0x0617  */
    /* JADX WARN: Code duplicated, block: B:293:0x061c  */
    /* JADX WARN: Code duplicated, block: B:294:0x061f  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c8  */
    public static final void c(i97 i97Var, cq7 cq7Var, boolean z, boolean z2, boolean z3, boolean z4, u18 u18Var, ot7 ot7Var, ot7 ot7Var2, iw2 iw2Var, ux2 ux2Var, int i) {
        long j;
        g2 g2Var;
        boolean z5;
        q18 q18VarZ;
        boolean z6;
        Object objP0;
        int i2;
        boolean z7;
        Object objK;
        boolean z8;
        Object objK2;
        float fFloatValue;
        ot7 ot7Var3;
        bs7 bs7Var;
        bs7 bs7Var2;
        boolean z9;
        as7 as7Var;
        as7 as7Var2;
        bs7 ub0Var;
        ms2 ms2Var;
        ms2 ms2Var2;
        h40 h40Var;
        float f;
        h40 h40Var2;
        float f2;
        cs7 cs7Var;
        cs7 cs7Var2;
        cs7 cs7Var3;
        lw6 lw6Var;
        lw6 lw6Var2;
        lw6 lw6VarW;
        lw6 lw6Var3;
        rm5 rm5Var;
        rm5 rm5Var2;
        es7 es7Var;
        es7 es7Var2;
        gm5 gm5Var;
        gm5 gm5Var2;
        gm5 gm5Var3;
        boolean z10;
        boolean z11;
        gm5 gm5Var4;
        ot7 ot7VarA;
        int i3;
        boolean z12;
        Object objP1;
        int i4;
        boolean z13;
        Object objK3;
        kj3 kj3Var;
        long j2;
        boolean z14;
        Object objK4;
        g2 g2Var2 = u18Var.a;
        bg5 bg5Var = u18Var.d;
        zm zmVar = zm.t;
        ux2Var.Y(376119213);
        int i5 = i | (ux2Var.f(i97Var) ? 4 : 2) | (ux2Var.f(cq7Var) ? 32 : 16) | (ux2Var.g(z) ? 256 : 128) | (ux2Var.g(z2) ? 2048 : 1024) | (ux2Var.g(z3) ? 16384 : 8192) | (ux2Var.g(z4) ? 131072 : 65536) | (ux2Var.f(u18Var) ? 1048576 : 524288) | (ux2Var.f(ot7Var) ? 8388608 : 4194304) | (ux2Var.f(ot7Var2) ? 67108864 : 33554432) | (ux2Var.h(iw2Var) ? 536870912 : 268435456);
        if (ux2Var.N(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object objK5 = ux2Var.K();
            aw awVar = e01.a;
            if (objK5 == awVar) {
                objK5 = new pq7();
                ux2Var.g0(objK5);
            }
            pq7 pq7Var = (pq7) objK5;
            if (!z) {
                j = cq7Var.z;
            } else if (z2) {
                j = cq7Var.A;
            } else {
                j = z3 ? cq7Var.x : cq7Var.y;
            }
            du4 du4Var = du4.p;
            if (z4) {
                byte b = 14;
                ux2Var.W(-601510006);
                long jC = ot7Var.c();
                if (z4 && jC == 16) {
                    jC = j;
                }
                long jC2 = ot7Var2.c();
                if (z4 && jC2 == 16) {
                    jC2 = j;
                }
                e87 e87VarC0 = xs1.c0(du4Var, ux2Var);
                int i6 = ((i5 >> 18) & 14) | 384;
                kj3 kj3Var2 = (kj3) bg5Var.getValue();
                ux2Var.W(-759924327);
                int[] iArr = qq7.a;
                long j3 = iArr[kj3Var2.ordinal()] == 1 ? jC : jC2;
                ux2Var.p(false);
                cw0 cw0VarE = rv0.e(j3);
                boolean zF = ux2Var.f(cw0VarE);
                Object objK6 = ux2Var.K();
                if (zF || objK6 == awVar) {
                    yn1 yn1Var = new yn1(zmVar, new io.sentry.okhttp.b(cw0VarE, (byte) 5));
                    ux2Var.g0(yn1Var);
                    objK6 = yn1Var;
                }
                yn1 yn1Var2 = (yn1) objK6;
                int i7 = (i6 & 14) | 3072;
                if (u18Var.g()) {
                    i3 = i7;
                    yn1Var2 = yn1Var2;
                    g2Var = g2Var2;
                    z12 = false;
                    ux2Var.W(1666827533);
                    ux2Var.p(false);
                    objP1 = g2Var.p0();
                } else {
                    ux2Var.W(1666573488);
                    i3 = i7;
                    boolean z15 = (((i7 & 14) ^ 6) > 4 && ux2Var.f(u18Var)) || (i3 & 6) == 4;
                    objP1 = ux2Var.K();
                    if (z15 || objP1 == awVar) {
                        n47 n47VarC = el5.c();
                        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                        n47 n47VarF = el5.f(n47VarC);
                        g2Var = g2Var2;
                        try {
                            Object objP2 = g2Var.p0();
                            el5.h(n47VarC, n47VarF, function1E);
                            ux2Var.g0(objP2);
                            objP1 = objP2;
                        } catch (Throwable th) {
                            el5.h(n47VarC, n47VarF, function1E);
                            throw th;
                        }
                    } else {
                        g2Var = g2Var2;
                    }
                    z12 = false;
                    ux2Var.p(false);
                }
                ux2Var.W(-759924327);
                long j4 = iArr[((kj3) objP1).ordinal()] == 1 ? jC : jC2;
                ux2Var.p(z12);
                rv0 rv0Var = new rv0(j4);
                int i8 = i3 & 14;
                int i9 = i8 ^ 6;
                if (i9 <= 4 || !ux2Var.f(u18Var)) {
                    i4 = i8;
                    if ((i3 & 6) != 4) {
                        z13 = false;
                    }
                    objK3 = ux2Var.K();
                    if (z13 || objK3 == awVar) {
                        objK3 = d57.b(new iq0(u18Var, b));
                        ux2Var.g0(objK3);
                    }
                    kj3Var = (kj3) ((i97) objK3).getValue();
                    ux2Var.W(-759924327);
                    if (iArr[kj3Var.ordinal()] == 1) {
                        j2 = jC;
                    } else {
                        j2 = jC2;
                    }
                    ux2Var.p(false);
                    rv0 rv0Var2 = new rv0(j2);
                    z14 = (i9 <= 4 && ux2Var.f(u18Var)) || (i3 & 6) == 4;
                    objK4 = ux2Var.K();
                    if (z14 || objK4 == awVar) {
                        objK4 = d57.b(new iq0(u18Var, (byte) 15));
                        ux2Var.g0(objK4);
                    }
                    ux2Var.W(1730286052);
                    z5 = false;
                    ux2Var.p(false);
                    q18VarZ = ck3.z(u18Var, rv0Var, rv0Var2, e87VarC0, yn1Var2, ux2Var, i4 | 196608);
                    ux2Var.p(false);
                } else {
                    i4 = i8;
                }
                z13 = true;
                objK3 = ux2Var.K();
                if (z13) {
                    objK3 = d57.b(new iq0(u18Var, b));
                    ux2Var.g0(objK3);
                } else {
                    objK3 = d57.b(new iq0(u18Var, b));
                    ux2Var.g0(objK3);
                }
                kj3Var = (kj3) ((i97) objK3).getValue();
                ux2Var.W(-759924327);
                if (iArr[kj3Var.ordinal()] == 1) {
                    j2 = jC;
                } else {
                    j2 = jC2;
                }
                ux2Var.p(false);
                rv0 rv0Var3 = new rv0(j2);
                if (i9 <= 4) {
                }
                objK4 = ux2Var.K();
                if (z14) {
                    objK4 = d57.b(new iq0(u18Var, (byte) 15));
                    ux2Var.g0(objK4);
                } else {
                    objK4 = d57.b(new iq0(u18Var, (byte) 15));
                    ux2Var.g0(objK4);
                }
                ux2Var.W(1730286052);
                z5 = false;
                ux2Var.p(false);
                q18VarZ = ck3.z(u18Var, rv0Var, rv0Var3, e87VarC0, yn1Var2, ux2Var, i4 | 196608);
                ux2Var.p(false);
            } else {
                g2Var = g2Var2;
                bg5Var = bg5Var;
                z5 = false;
                ux2Var.W(-601031335);
                ux2Var.p(false);
                q18VarZ = null;
            }
            e87 e87VarC1 = xs1.c0(du4Var, ux2Var);
            int i10 = ((i5 >> 18) & 14) | 384;
            ux2Var.W(1139343725);
            ux2Var.p(z5);
            cw0 cw0VarE2 = rv0.e(j);
            boolean zF2 = ux2Var.f(cw0VarE2);
            Object objK7 = ux2Var.K();
            if (zF2 || objK7 == awVar) {
                objK7 = new yn1(zmVar, new io.sentry.okhttp.b(cw0VarE2, (byte) 5));
                ux2Var.g0(objK7);
            }
            yn1 yn1Var3 = (yn1) objK7;
            int i11 = (i10 & 14) | 3072;
            if (u18Var.g()) {
                z6 = false;
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP0 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean z16 = (((i11 & 14) ^ 6) > 4 && ux2Var.f(u18Var)) || (i11 & 6) == 4;
                objP0 = ux2Var.K();
                if (z16 || objP0 == awVar) {
                    n47 n47VarC2 = el5.c();
                    Function1 function1E2 = n47VarC2 != null ? n47VarC2.e() : null;
                    n47 n47VarF2 = el5.f(n47VarC2);
                    try {
                        Object objP3 = g2Var.p0();
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        ux2Var.g0(objP3);
                        objP0 = objP3;
                    } catch (Throwable th2) {
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        throw th2;
                    }
                }
                z6 = false;
                ux2Var.p(false);
            }
            ux2Var.W(1139343725);
            ux2Var.p(z6);
            q18 q18Var = q18VarZ;
            rv0 rv0Var4 = new rv0(j);
            int i12 = i11 & 14;
            int i13 = i12 ^ 6;
            if (i13 <= 4 || !ux2Var.f(u18Var)) {
                i2 = i11;
                if ((i2 & 6) != 4) {
                    z7 = false;
                }
                objK = ux2Var.K();
                if (z7 || objK == awVar) {
                    objK = d57.b(new iq0(u18Var, (byte) 10));
                    ux2Var.g0(objK);
                }
                ux2Var.W(1139343725);
                ux2Var.p(false);
                rv0 rv0Var5 = new rv0(j);
                z8 = (i13 <= 4 && ux2Var.f(u18Var)) || (i2 & 6) == 4;
                objK2 = ux2Var.K();
                if (z8 || objK2 == awVar) {
                    objK2 = d57.b(new iq0(u18Var, (byte) 11));
                    ux2Var.g0(objK2);
                }
                ux2Var.W(-1207102280);
                ux2Var.p(false);
                q18 q18VarZ2 = ck3.z(u18Var, rv0Var4, rv0Var5, e87VarC1, yn1Var3, ux2Var, i12 | 196608);
                if (i97Var != null) {
                    fFloatValue = ((Number) i97Var.getValue()).floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                c77 c77Var = ot7Var2.a;
                c77 c77Var2 = ot7Var.a;
                bs7 bs7Var3 = d77.d;
                bs7Var = c77Var.a;
                bs7Var2 = c77Var2.a;
                z9 = bs7Var instanceof ub0;
                as7Var = as7.a;
                if (!z9 || (bs7Var2 instanceof ub0)) {
                    as7Var2 = as7Var;
                    if (z9 || !(bs7Var2 instanceof ub0)) {
                        ub0Var = (bs7) d77.b(fFloatValue, bs7Var, bs7Var2);
                    } else {
                        ub0 ub0Var2 = (ub0) bs7Var;
                        ub0 ub0Var3 = (ub0) bs7Var2;
                        sb0 sb0Var = (sb0) d77.b(fFloatValue, ub0Var2.a, ub0Var3.a);
                        float fG = vs1.G(ub0Var2.b, ub0Var3.b, fFloatValue);
                        if (sb0Var == null) {
                            ub0Var = as7Var2;
                        } else if (sb0Var instanceof t57) {
                            long jR = x67.r(fG, ((t57) sb0Var).a);
                            if (jR != 16) {
                                ub0Var = new gw0(jR);
                            } else {
                                ub0Var = as7Var2;
                            }
                        } else {
                            if (!(sb0Var instanceof iw6)) {
                                gk0.s();
                                return;
                            }
                            ub0Var = new ub0((iw6) sb0Var, fG);
                        }
                    }
                } else {
                    as7Var2 = as7Var;
                    long jK = j51.K(bs7Var.b(), bs7Var2.b(), fFloatValue);
                    if (jK != 16) {
                        ub0Var = new gw0(jK);
                    } else {
                        ub0Var = as7Var2;
                    }
                }
                bs7 bs7Var4 = ub0Var;
                nr2 nr2Var = (nr2) d77.b(fFloatValue, c77Var.f, c77Var2.f);
                long jC3 = d77.c(c77Var.b, c77Var2.b, fFloatValue);
                ms2Var = c77Var.c;
                if (ms2Var == null) {
                    ms2Var = ms2.f1503o;
                }
                ms2Var2 = c77Var2.c;
                if (ms2Var2 == null) {
                    ms2Var2 = ms2.f1503o;
                }
                ms2 ms2Var3 = new ms2(ct1.v(vs1.H(fFloatValue, ms2Var.m, ms2Var2.m), 1, 1000));
                ks2 ks2Var = (ks2) d77.b(fFloatValue, c77Var.d, c77Var2.d);
                ls2 ls2Var = (ls2) d77.b(fFloatValue, c77Var.e, c77Var2.e);
                String str = (String) d77.b(fFloatValue, c77Var.g, c77Var2.g);
                long jC4 = d77.c(c77Var.h, c77Var2.h, fFloatValue);
                h40Var = c77Var.i;
                if (h40Var != null) {
                    f = h40Var.a;
                } else {
                    f = 0.0f;
                }
                h40Var2 = c77Var2.i;
                if (h40Var2 != null) {
                    f2 = h40Var2.a;
                } else {
                    f2 = 0.0f;
                }
                float fG2 = vs1.G(f, f2, fFloatValue);
                cs7Var = c77Var.j;
                cs7Var2 = cs7.c;
                if (cs7Var == null) {
                    cs7Var = cs7Var2;
                }
                cs7Var3 = c77Var2.j;
                if (cs7Var3 != null) {
                    cs7Var2 = cs7Var3;
                }
                cs7 cs7Var4 = new cs7(vs1.G(cs7Var.a, cs7Var2.a, fFloatValue), vs1.G(cs7Var.b, cs7Var2.b, fFloatValue));
                kd4 kd4Var = (kd4) d77.b(fFloatValue, c77Var.k, c77Var2.k);
                long jK2 = j51.K(c77Var.l, c77Var2.l, fFloatValue);
                vp7 vp7Var = (vp7) d77.b(fFloatValue, c77Var.m, c77Var2.m);
                lw6Var = c77Var.n;
                lw6Var2 = c77Var2.n;
                if (lw6Var == null || lw6Var2 != null) {
                    if (lw6Var == null) {
                        lw6Var2.getClass();
                        lw6VarW = ep1.w(new lw6(rv0.b(0.0f, lw6Var2.a), lw6Var2.b, lw6Var2.c), lw6Var2, fFloatValue);
                    } else if (lw6Var2 == null) {
                        lw6VarW = ep1.w(lw6Var, new lw6(rv0.b(0.0f, lw6Var.a), lw6Var.b, lw6Var.c), fFloatValue);
                    } else {
                        lw6VarW = ep1.w(lw6Var, lw6Var2, fFloatValue);
                    }
                    lw6Var3 = lw6VarW;
                } else {
                    lw6Var3 = null;
                }
                rm5Var = c77Var.f499o;
                rm5 rm5Var3 = c77Var2.f499o;
                if (rm5Var == null || rm5Var3 != null) {
                    if (rm5Var == null) {
                        rm5Var = rm5.a;
                    }
                    rm5Var2 = rm5Var;
                } else {
                    rm5Var2 = null;
                }
                c77 c77Var3 = new c77(bs7Var4, jC3, ms2Var3, ks2Var, ls2Var, nr2Var, str, jC4, new h40(fG2), cs7Var4, kd4Var, jK2, vp7Var, lw6Var3, rm5Var2, (v52) d77.b(fFloatValue, c77Var.p, c77Var2.p));
                gf5 gf5Var = ot7Var2.b;
                gf5 gf5Var2 = ot7Var.b;
                int i14 = hf5.b;
                int i15 = ((qo7) d77.b(fFloatValue, new qo7(gf5Var.a), new qo7(gf5Var2.a))).a;
                int i16 = ((xp7) d77.b(fFloatValue, new xp7(gf5Var.b), new xp7(gf5Var2.b))).a;
                long jC5 = d77.c(gf5Var.c, gf5Var2.c, fFloatValue);
                es7Var = gf5Var.d;
                if (es7Var == null) {
                    es7Var = es7.c;
                }
                es7Var2 = gf5Var2.d;
                if (es7Var2 == null) {
                    es7Var2 = es7.c;
                }
                es7 es7Var3 = new es7(d77.c(es7Var.a, es7Var2.a, fFloatValue), d77.c(es7Var.b, es7Var2.b, fFloatValue));
                gm5Var = gf5Var.e;
                gm5Var2 = gf5Var2.e;
                if (gm5Var == null || gm5Var2 != null) {
                    gm5Var3 = gm5.c;
                    if (gm5Var == null) {
                        gm5Var = gm5Var3;
                    }
                    z10 = gm5Var.a;
                    if (gm5Var2 == null) {
                        gm5Var2 = gm5Var3;
                    }
                    z11 = gm5Var2.a;
                    if (z10 == z11) {
                        gm5Var4 = gm5Var;
                    } else {
                        gm5Var4 = new gm5(((o92) d77.b(fFloatValue, new o92(gm5Var.b), new o92(gm5Var2.b))).a, ((Boolean) d77.b(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                    }
                } else {
                    gm5Var4 = null;
                }
                ot7Var3 = new ot7(c77Var3, new gf5(i15, i16, jC5, es7Var3, gm5Var4, (p94) d77.b(fFloatValue, gf5Var.f, gf5Var2.f), ((k94) d77.b(fFloatValue, new k94(gf5Var.g), new k94(gf5Var2.g))).a, ((k93) d77.b(fFloatValue, new k93(gf5Var.h), new k93(gf5Var2.h))).a, (dt7) d77.b(fFloatValue, gf5Var.i, gf5Var2.i)));
                if (z4) {
                    q18Var.getClass();
                    ot7VarA = ot7.a(ot7Var3, ((rv0) q18Var.v.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                } else {
                    ot7VarA = ot7Var3;
                }
                d(((rv0) q18VarZ2.v.getValue()).a, ot7VarA, au8.O(57043598, new l64(iw2Var, pq7Var, (byte) 29), ux2Var), ux2Var, 384);
            } else {
                i2 = i11;
            }
            z7 = true;
            objK = ux2Var.K();
            if (z7) {
                objK = d57.b(new iq0(u18Var, (byte) 10));
                ux2Var.g0(objK);
            } else {
                objK = d57.b(new iq0(u18Var, (byte) 10));
                ux2Var.g0(objK);
            }
            ux2Var.W(1139343725);
            ux2Var.p(false);
            rv0 rv0Var6 = new rv0(j);
            if (i13 <= 4) {
            }
            objK2 = ux2Var.K();
            if (z8) {
                objK2 = d57.b(new iq0(u18Var, (byte) 11));
                ux2Var.g0(objK2);
            } else {
                objK2 = d57.b(new iq0(u18Var, (byte) 11));
                ux2Var.g0(objK2);
            }
            ux2Var.W(-1207102280);
            ux2Var.p(false);
            q18 q18VarZ3 = ck3.z(u18Var, rv0Var4, rv0Var6, e87VarC1, yn1Var3, ux2Var, i12 | 196608);
            if (i97Var != null) {
                fFloatValue = ((Number) i97Var.getValue()).floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            c77 c77Var4 = ot7Var2.a;
            c77 c77Var5 = ot7Var.a;
            bs7 bs7Var5 = d77.d;
            bs7Var = c77Var4.a;
            bs7Var2 = c77Var5.a;
            z9 = bs7Var instanceof ub0;
            as7Var = as7.a;
            if (z9) {
                as7Var2 = as7Var;
                if (z9) {
                    ub0Var = (bs7) d77.b(fFloatValue, bs7Var, bs7Var2);
                } else {
                    ub0Var = (bs7) d77.b(fFloatValue, bs7Var, bs7Var2);
                }
            } else {
                as7Var2 = as7Var;
                if (z9) {
                    ub0Var = (bs7) d77.b(fFloatValue, bs7Var, bs7Var2);
                } else {
                    ub0Var = (bs7) d77.b(fFloatValue, bs7Var, bs7Var2);
                }
            }
            bs7 bs7Var6 = ub0Var;
            nr2 nr2Var2 = (nr2) d77.b(fFloatValue, c77Var4.f, c77Var5.f);
            long jC6 = d77.c(c77Var4.b, c77Var5.b, fFloatValue);
            ms2Var = c77Var4.c;
            if (ms2Var == null) {
                ms2Var = ms2.f1503o;
            }
            ms2Var2 = c77Var5.c;
            if (ms2Var2 == null) {
                ms2Var2 = ms2.f1503o;
            }
            ms2 ms2Var4 = new ms2(ct1.v(vs1.H(fFloatValue, ms2Var.m, ms2Var2.m), 1, 1000));
            ks2 ks2Var2 = (ks2) d77.b(fFloatValue, c77Var4.d, c77Var5.d);
            ls2 ls2Var2 = (ls2) d77.b(fFloatValue, c77Var4.e, c77Var5.e);
            String str2 = (String) d77.b(fFloatValue, c77Var4.g, c77Var5.g);
            long jC7 = d77.c(c77Var4.h, c77Var5.h, fFloatValue);
            h40Var = c77Var4.i;
            if (h40Var != null) {
                f = h40Var.a;
            } else {
                f = 0.0f;
            }
            h40Var2 = c77Var5.i;
            if (h40Var2 != null) {
                f2 = h40Var2.a;
            } else {
                f2 = 0.0f;
            }
            float fG3 = vs1.G(f, f2, fFloatValue);
            cs7Var = c77Var4.j;
            cs7Var2 = cs7.c;
            if (cs7Var == null) {
                cs7Var = cs7Var2;
            }
            cs7Var3 = c77Var5.j;
            if (cs7Var3 != null) {
                cs7Var2 = cs7Var3;
            }
            cs7 cs7Var5 = new cs7(vs1.G(cs7Var.a, cs7Var2.a, fFloatValue), vs1.G(cs7Var.b, cs7Var2.b, fFloatValue));
            kd4 kd4Var2 = (kd4) d77.b(fFloatValue, c77Var4.k, c77Var5.k);
            long jK3 = j51.K(c77Var4.l, c77Var5.l, fFloatValue);
            vp7 vp7Var2 = (vp7) d77.b(fFloatValue, c77Var4.m, c77Var5.m);
            lw6Var = c77Var4.n;
            lw6Var2 = c77Var5.n;
            if (lw6Var == null) {
                if (lw6Var == null) {
                    lw6Var2.getClass();
                    lw6VarW = ep1.w(new lw6(rv0.b(0.0f, lw6Var2.a), lw6Var2.b, lw6Var2.c), lw6Var2, fFloatValue);
                } else if (lw6Var2 == null) {
                    lw6VarW = ep1.w(lw6Var, new lw6(rv0.b(0.0f, lw6Var.a), lw6Var.b, lw6Var.c), fFloatValue);
                } else {
                    lw6VarW = ep1.w(lw6Var, lw6Var2, fFloatValue);
                }
                lw6Var3 = lw6VarW;
            } else {
                if (lw6Var == null) {
                    lw6Var2.getClass();
                    lw6VarW = ep1.w(new lw6(rv0.b(0.0f, lw6Var2.a), lw6Var2.b, lw6Var2.c), lw6Var2, fFloatValue);
                } else if (lw6Var2 == null) {
                    lw6VarW = ep1.w(lw6Var, new lw6(rv0.b(0.0f, lw6Var.a), lw6Var.b, lw6Var.c), fFloatValue);
                } else {
                    lw6VarW = ep1.w(lw6Var, lw6Var2, fFloatValue);
                }
                lw6Var3 = lw6VarW;
            }
            rm5Var = c77Var4.f499o;
            rm5 rm5Var4 = c77Var5.f499o;
            if (rm5Var == null) {
                if (rm5Var == null) {
                    rm5Var = rm5.a;
                }
                rm5Var2 = rm5Var;
            } else {
                if (rm5Var == null) {
                    rm5Var = rm5.a;
                }
                rm5Var2 = rm5Var;
            }
            c77 c77Var6 = new c77(bs7Var6, jC6, ms2Var4, ks2Var2, ls2Var2, nr2Var2, str2, jC7, new h40(fG3), cs7Var5, kd4Var2, jK3, vp7Var2, lw6Var3, rm5Var2, (v52) d77.b(fFloatValue, c77Var4.p, c77Var5.p));
            gf5 gf5Var3 = ot7Var2.b;
            gf5 gf5Var4 = ot7Var.b;
            int i17 = hf5.b;
            int i18 = ((qo7) d77.b(fFloatValue, new qo7(gf5Var3.a), new qo7(gf5Var4.a))).a;
            int i19 = ((xp7) d77.b(fFloatValue, new xp7(gf5Var3.b), new xp7(gf5Var4.b))).a;
            long jC8 = d77.c(gf5Var3.c, gf5Var4.c, fFloatValue);
            es7Var = gf5Var3.d;
            if (es7Var == null) {
                es7Var = es7.c;
            }
            es7Var2 = gf5Var4.d;
            if (es7Var2 == null) {
                es7Var2 = es7.c;
            }
            es7 es7Var4 = new es7(d77.c(es7Var.a, es7Var2.a, fFloatValue), d77.c(es7Var.b, es7Var2.b, fFloatValue));
            gm5Var = gf5Var3.e;
            gm5Var2 = gf5Var4.e;
            if (gm5Var == null) {
                gm5Var3 = gm5.c;
                if (gm5Var == null) {
                    gm5Var = gm5Var3;
                }
                z10 = gm5Var.a;
                if (gm5Var2 == null) {
                    gm5Var2 = gm5Var3;
                }
                z11 = gm5Var2.a;
                if (z10 == z11) {
                    gm5Var4 = gm5Var;
                } else {
                    gm5Var4 = new gm5(((o92) d77.b(fFloatValue, new o92(gm5Var.b), new o92(gm5Var2.b))).a, ((Boolean) d77.b(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                }
            } else {
                gm5Var3 = gm5.c;
                if (gm5Var == null) {
                    gm5Var = gm5Var3;
                }
                z10 = gm5Var.a;
                if (gm5Var2 == null) {
                    gm5Var2 = gm5Var3;
                }
                z11 = gm5Var2.a;
                if (z10 == z11) {
                    gm5Var4 = gm5Var;
                } else {
                    gm5Var4 = new gm5(((o92) d77.b(fFloatValue, new o92(gm5Var.b), new o92(gm5Var2.b))).a, ((Boolean) d77.b(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                }
            }
            ot7Var3 = new ot7(c77Var6, new gf5(i18, i19, jC8, es7Var4, gm5Var4, (p94) d77.b(fFloatValue, gf5Var3.f, gf5Var4.f), ((k94) d77.b(fFloatValue, new k94(gf5Var3.g), new k94(gf5Var4.g))).a, ((k93) d77.b(fFloatValue, new k93(gf5Var3.h), new k93(gf5Var4.h))).a, (dt7) d77.b(fFloatValue, gf5Var3.i, gf5Var4.i)));
            if (z4) {
                q18Var.getClass();
                ot7VarA = ot7.a(ot7Var3, ((rv0) q18Var.v.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            } else {
                ot7VarA = ot7Var3;
            }
            d(((rv0) q18VarZ3.v.getValue()).a, ot7VarA, au8.O(57043598, new l64(iw2Var, pq7Var, (byte) 29), ux2Var), ux2Var, 384);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gq7(i97Var, cq7Var, z, z2, z3, z4, u18Var, ot7Var, ot7Var2, iw2Var, i);
        }
    }

    public static final void d(long j, ot7 ot7Var, hw2 hw2Var, ux2 ux2Var, final int i) {
        ux2 ux2Var2;
        final hw2 hw2Var2;
        final ot7 ot7Var2;
        final long j2;
        ux2Var.Y(396611577);
        int i2 = (ux2Var.e(j) ? 4 : 2) | i | (ux2Var.f(ot7Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2 = ux2Var;
            lv1.x(j, ot7Var, hw2Var, ux2Var2, i2 & 1022);
            j2 = j;
            ot7Var2 = ot7Var;
            hw2Var2 = hw2Var;
        } else {
            ux2Var2 = ux2Var;
            hw2Var2 = hw2Var;
            ot7Var2 = ot7Var;
            j2 = j;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.lq7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m77.d(j2, ot7Var2, hw2Var2, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void e(long j, hw2 hw2Var, ux2 ux2Var, int i) {
        ux2Var.Y(590397809);
        int i2 = (ux2Var.e(j) ? 4 : 2) | i | (ux2Var.h(hw2Var) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            j51.l(wa1.a.a(new rv0(j)), hw2Var, ux2Var, (i2 & 112) | 8);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hq7(j, hw2Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:242:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:243:0x04f3  */
    public static final void f(hw2 hw2Var, final hw2 hw2Var2, iw2 iw2Var, final hw2 hw2Var3, final hw2 hw2Var4, final hw2 hw2Var5, final hw2 hw2Var6, final boolean z, final n37 n37Var, rq7 rq7Var, final rq7 rq7Var2, final rq7 rq7Var3, final yy0 yy0Var, hw2 hw2Var7, nd5 nd5Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        hw2 hw2Var8;
        iw2 iw2Var2;
        hw2 hw2Var9;
        nd5 nd5Var2;
        ux2 ux2Var2;
        rq7 rq7Var4;
        Object zq7Var;
        int i5;
        boolean z2;
        hw2 hw2Var10;
        y50 y50Var;
        float f;
        boolean z3;
        boolean z4;
        Object objK;
        y50 y50Var2 = xz2.s;
        y50 y50Var3 = xz2.f2564o;
        ux2Var.Y(-766806902);
        int i6 = i & 6;
        cs4 cs4Var = cs4.b;
        if (i6 == 0) {
            i3 = i | (ux2Var.f(cs4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(hw2Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(iw2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(hw2Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.h(hw2Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(hw2Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.h(hw2Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.f(n37Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? ux2Var.f(rq7Var) : ux2Var.h(rq7Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? ux2Var.f(rq7Var2) : ux2Var.h(rq7Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? ux2Var.f(rq7Var3) : ux2Var.h(rq7Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.h(hw2Var7) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ux2Var.f(nd5Var) ? 131072 : 65536;
        }
        int i7 = i4;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            float fU = u(ux2Var);
            int i8 = i7 & 14;
            boolean zC = ((458752 & i7) == 131072) | ((i3 & 1879048192) == 536870912) | ((i3 & 234881024) == 67108864) | (i8 == 4 || ((i7 & 8) != 0 && ux2Var.f(rq7Var))) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && ux2Var.f(rq7Var2))) | ((i7 & 896) == 256 || ((i7 & 512) != 0 && ux2Var.f(rq7Var3))) | ux2Var.c(fU);
            Object objK2 = ux2Var.K();
            aw awVar = e01.a;
            if (zC || objK2 == awVar) {
                i5 = i8;
                ux2Var2 = ux2Var;
                zq7Var = new zq7(z, n37Var, rq7Var, rq7Var2, rq7Var3, nd5Var, fU);
                ux2Var2.g0(zq7Var);
            } else {
                i5 = i8;
                zq7Var = objK2;
                ux2Var2 = ux2Var;
            }
            zq7 zq7Var2 = (zq7) zq7Var;
            j04 j04Var = (j04) ux2Var2.j(b11.n);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z5 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z5) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(zq7Var2, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            yy0Var.invoke(ux2Var2, Integer.valueOf((i7 >> 9) & 14));
            jr4 jr4Var = jr4.b;
            if (hw2Var3 != null) {
                ux2Var2.W(-42889297);
                fs4 fs4VarW = hm3.w(cs4Var, "Leading");
                b63 b63Var = ml3.a;
                fs4 fs4VarF = fs4VarW.f(jr4Var);
                do4 do4VarC = ua0.c(y50Var2, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS2, iz0Var4, ux2Var2);
                hw2Var3.invoke(ux2Var2, Integer.valueOf((i3 >> 12) & 14));
                ux2Var2.p(true);
                z2 = false;
                ux2Var2.p(false);
            } else {
                z2 = false;
                ux2Var2.W(-42643281);
                ux2Var2.p(false);
            }
            if (hw2Var4 != null) {
                ux2Var2.W(-42600563);
                fs4 fs4VarW2 = hm3.w(cs4Var, "Trailing");
                b63 b63Var2 = ml3.a;
                fs4 fs4VarF2 = fs4VarW2.f(jr4Var);
                do4 do4VarC2 = ua0.c(r16, z2);
                int iHashCode3 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL3 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarF2);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC2, iz0Var, ux2Var2);
                o67.n(yj5VarL3, iz0Var2, ux2Var2);
                e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS3, iz0Var4, ux2Var2);
                hw2Var4.invoke(ux2Var2, Integer.valueOf((i3 >> 15) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-42352625);
                ux2Var2.p(z2);
            }
            nd5Var2 = nd5Var;
            float fP = ka0.p(nd5Var2, j04Var);
            float fO = ka0.o(nd5Var2, j04Var);
            float fB = B(ux2Var2);
            if (hw2Var3 != null) {
                fP -= fB;
                if (fP < 0.0f) {
                    fP = 0.0f;
                }
            }
            float f2 = fP;
            if (hw2Var4 != null) {
                fO -= fB;
                if (fO < 0.0f) {
                    fO = 0.0f;
                }
            }
            if (hw2Var5 != null) {
                ux2Var2.W(-41576230);
                fs4 fs4VarF3 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                y50Var = y50Var3;
                do4 do4VarC3 = ua0.c(y50Var, false);
                int iHashCode4 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL4 = ux2Var2.l();
                fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarF3);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC3, iz0Var, ux2Var2);
                o67.n(yj5VarL4, iz0Var2, ux2Var2);
                e41.r(iHashCode4, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS4, iz0Var4, ux2Var2);
                hw2Var10 = hw2Var5;
                hw2Var10.invoke(ux2Var2, Integer.valueOf((i3 >> 18) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                hw2Var10 = hw2Var5;
                y50Var = y50Var3;
                ux2Var2.W(-41248529);
                ux2Var2.p(false);
            }
            if (hw2Var6 != null) {
                ux2Var2.W(-41205284);
                f = fO;
                fs4 fs4VarF4 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f, 0.0f, 10);
                do4 do4VarC4 = ua0.c(y50Var, false);
                int iHashCode5 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL5 = ux2Var2.l();
                fs4 fs4VarS5 = uf0.s(ux2Var2, fs4VarF4);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC4, iz0Var, ux2Var2);
                o67.n(yj5VarL5, iz0Var2, ux2Var2);
                e41.r(iHashCode5, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS5, iz0Var4, ux2Var2);
                hw2Var6.invoke(ux2Var2, Integer.valueOf((i3 >> 21) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                f = fO;
                ux2Var2.W(-40879505);
                ux2Var2.p(false);
            }
            y50 y50Var4 = y50Var;
            fs4 fs4VarF5 = ka0.F(cs4Var, f2, 0.0f, f, 0.0f, 10);
            if (hw2Var2 != null) {
                ux2Var2.W(-40379630);
                fs4 fs4VarW3 = hm3.w(cs4Var, "Label");
                if (i5 != 4) {
                    if ((i7 & 8) != 0) {
                        rq7Var4 = rq7Var;
                        if (ux2Var2.h(rq7Var4)) {
                        }
                        objK = ux2Var2.K();
                        if (z4 || objK == awVar) {
                            objK = new iq7(rq7Var4, (byte) 0);
                            ux2Var2.g0(objK);
                        }
                        fs4 fs4VarF6 = androidx.compose.foundation.layout.b.r(vn4.j0(fs4VarW3, new k80((Function0) objK, (byte) 4))).f(fs4VarF5);
                        do4 do4VarC5 = ua0.c(y50Var4, false);
                        int iHashCode6 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL6 = ux2Var2.l();
                        fs4 fs4VarS6 = uf0.s(ux2Var2, fs4VarF6);
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(do4VarC5, iz0Var, ux2Var2);
                        o67.n(yj5VarL6, iz0Var2, ux2Var2);
                        e41.r(iHashCode6, ux2Var2, iz0Var3, ux2Var2);
                        o67.n(fs4VarS6, iz0Var4, ux2Var2);
                        hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 6) & 14));
                        ux2Var2.p(true);
                        ux2Var2.p(false);
                    } else {
                        rq7Var4 = rq7Var;
                    }
                    z4 = false;
                    objK = ux2Var2.K();
                    if (z4) {
                        objK = new iq7(rq7Var4, (byte) 0);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new iq7(rq7Var4, (byte) 0);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarF7 = androidx.compose.foundation.layout.b.r(vn4.j0(fs4VarW3, new k80((Function0) objK, (byte) 4))).f(fs4VarF5);
                    do4 do4VarC6 = ua0.c(y50Var4, false);
                    int iHashCode7 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL7 = ux2Var2.l();
                    fs4 fs4VarS7 = uf0.s(ux2Var2, fs4VarF7);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC6, iz0Var, ux2Var2);
                    o67.n(yj5VarL7, iz0Var2, ux2Var2);
                    e41.r(iHashCode7, ux2Var2, iz0Var3, ux2Var2);
                    o67.n(fs4VarS7, iz0Var4, ux2Var2);
                    hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 6) & 14));
                    ux2Var2.p(true);
                    ux2Var2.p(false);
                } else {
                    rq7Var4 = rq7Var;
                }
                z4 = true;
                objK = ux2Var2.K();
                if (z4) {
                    objK = new iq7(rq7Var4, (byte) 0);
                    ux2Var2.g0(objK);
                } else {
                    objK = new iq7(rq7Var4, (byte) 0);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarF8 = androidx.compose.foundation.layout.b.r(vn4.j0(fs4VarW3, new k80((Function0) objK, (byte) 4))).f(fs4VarF5);
                do4 do4VarC7 = ua0.c(y50Var4, false);
                int iHashCode8 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL8 = ux2Var2.l();
                fs4 fs4VarS8 = uf0.s(ux2Var2, fs4VarF8);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC7, iz0Var, ux2Var2);
                o67.n(yj5VarL8, iz0Var2, ux2Var2);
                e41.r(iHashCode8, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS8, iz0Var4, ux2Var2);
                hw2Var2.invoke(ux2Var2, Integer.valueOf((i3 >> 6) & 14));
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                rq7Var4 = rq7Var;
                ux2Var2.W(-39982737);
                ux2Var2.p(false);
            }
            fs4 fs4VarF9 = ka0.F(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(cs4Var, 24.0f, 0.0f, 2)), hw2Var10 == null ? f2 : 0.0f, 0.0f, hw2Var6 == null ? f : 0.0f, 0.0f, 10);
            if (iw2Var != null) {
                ux2Var2.W(-39612752);
                iw2Var2 = iw2Var;
                iw2Var2.d(hm3.w(cs4Var, "Hint").f(fs4VarF9), ux2Var2, Integer.valueOf((i3 >> 6) & 112));
                ux2Var2.p(false);
            } else {
                iw2Var2 = iw2Var;
                ux2Var2.W(-39521457);
                ux2Var2.p(false);
            }
            fs4 fs4VarF10 = hm3.w(cs4Var, "TextField").f(fs4VarF9);
            do4 do4VarC8 = ua0.c(y50Var4, true);
            int iHashCode9 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL9 = ux2Var2.l();
            fs4 fs4VarS9 = uf0.s(ux2Var2, fs4VarF10);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC8, iz0Var, ux2Var2);
            o67.n(yj5VarL9, iz0Var2, ux2Var2);
            e41.r(iHashCode9, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS9, iz0Var4, ux2Var2);
            hw2Var8 = hw2Var;
            hw2Var8.invoke(ux2Var2, Integer.valueOf((i3 >> 3) & 14));
            ux2Var2.p(true);
            if (hw2Var7 != null) {
                ux2Var2.W(-39272806);
                fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.f(hm3.w(cs4Var, "Supporting"), 16.0f, 0.0f, 2)), new pd5(16.0f, 4.0f, 16.0f, 0.0f));
                do4 do4VarC9 = ua0.c(y50Var4, false);
                int iHashCode10 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL10 = ux2Var2.l();
                fs4 fs4VarS10 = uf0.s(ux2Var2, fs4VarA);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC9, iz0Var, ux2Var2);
                o67.n(yj5VarL10, iz0Var2, ux2Var2);
                e41.r(iHashCode10, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS10, iz0Var4, ux2Var2);
                hw2Var9 = hw2Var7;
                hw2Var9.invoke(ux2Var2, Integer.valueOf((i7 >> 12) & 14));
                z3 = true;
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                hw2Var9 = hw2Var7;
                z3 = true;
                ux2Var2.W(-38883601);
                ux2Var2.p(false);
            }
            ux2Var2.p(z3);
        } else {
            hw2Var8 = hw2Var;
            iw2Var2 = iw2Var;
            hw2Var9 = hw2Var7;
            nd5Var2 = nd5Var;
            ux2Var2 = ux2Var;
            rq7Var4 = rq7Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final hw2 hw2Var11 = hw2Var8;
            final rq7 rq7Var5 = rq7Var4;
            final iw2 iw2Var3 = iw2Var2;
            final nd5 nd5Var3 = nd5Var2;
            final hw2 hw2Var12 = hw2Var9;
            j56VarR.d = new hw2() { // from class: o.jq7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    m77.f(hw2Var11, hw2Var2, iw2Var3, hw2Var3, hw2Var4, hw2Var5, hw2Var6, z, n37Var, rq7Var5, rq7Var2, rq7Var3, yy0Var, hw2Var12, nd5Var3, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void g(Function0 function0, fs4 fs4Var, pw6 pw6Var, boolean z, String str, ng0 ng0Var, iw2 iw2Var, ux2 ux2Var, int i, int i2) {
        Function0 function1;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        ng0 ng0Var2;
        boolean z3;
        pw6 pw6Var2;
        boolean z4;
        String str3;
        ng0 ng0Var3;
        j56 j56VarR;
        qf6 qf6VarA;
        int i6;
        boolean z5;
        String str4;
        ng0 ng0VarA;
        pw6 pw6Var3;
        int i7;
        int i8;
        function0.getClass();
        iw2Var.getClass();
        ux2Var.Y(1857479834);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (ux2Var.h(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= ux2Var.g(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (ux2Var.f(str2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        ng0Var2 = ng0Var;
                        int i10 = ux2Var.f(ng0Var2) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        ng0Var2 = ng0Var;
                    }
                    i3 |= i10;
                } else {
                    ng0Var2 = ng0Var;
                }
                if ((1572864 & i) == 0) {
                    if (ux2Var.h(iw2Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i3 & 1, z3)) {
                    ux2Var.S();
                    if ((i & 1) != 0 || ux2Var.x()) {
                        qf6VarA = sf6.a(8.0f);
                        i6 = i3 & (-897);
                        z5 = i9 == 0 ? z2 : true;
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if ((i2 & 32) != 0) {
                            str4 = str2;
                            pw6Var3 = qf6VarA;
                            z2 = z5;
                            ng0VarA = og0.a(ux2Var);
                            i7 = i3 & (-459649);
                        } else {
                            str4 = str2;
                            ng0VarA = ng0Var2;
                            pw6Var3 = qf6VarA;
                            z2 = z5;
                            i7 = i6;
                        }
                    } else {
                        ux2Var.Q();
                        i7 = i3 & (-897);
                        if ((i2 & 32) != 0) {
                            i7 = i3 & (-459649);
                        }
                        pw6Var3 = pw6Var;
                        str4 = str2;
                        ng0VarA = ng0Var2;
                    }
                    ux2Var.q();
                    int i11 = i7 >> 3;
                    au8.d(function1, androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVButton"), z2, pw6Var3, ng0VarA, null, null, null, iw2Var, ux2Var, (i7 & 14) | (i11 & 896) | (i11 & 57344) | ((i7 << 9) & 1879048192), 480);
                    z4 = z2;
                    pw6Var2 = pw6Var3;
                    ng0Var3 = ng0VarA;
                    str3 = str4;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    z4 = z2;
                    str3 = str2;
                    ng0Var3 = ng0Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, ng0Var3, iw2Var, i, i2, (byte) 0);
                }
            }
            i3 |= 24576;
            str2 = str;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    ng0Var2 = ng0Var;
                    if (ux2Var.f(ng0Var2)) {
                    }
                    i3 |= i10;
                } else {
                    ng0Var2 = ng0Var;
                }
                i3 |= i10;
            } else {
                ng0Var2 = ng0Var;
            }
            if ((1572864 & i) == 0) {
                if (ux2Var.h(iw2Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i3 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    qf6VarA = sf6.a(8.0f);
                    i6 = i3 & (-897);
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if ((i2 & 32) != 0) {
                        str4 = str2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        ng0VarA = og0.a(ux2Var);
                        i7 = i3 & (-459649);
                    } else {
                        str4 = str2;
                        ng0VarA = ng0Var2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        i7 = i6;
                    }
                } else {
                    qf6VarA = sf6.a(8.0f);
                    i6 = i3 & (-897);
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if ((i2 & 32) != 0) {
                        str4 = str2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        ng0VarA = og0.a(ux2Var);
                        i7 = i3 & (-459649);
                    } else {
                        str4 = str2;
                        ng0VarA = ng0Var2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        i7 = i6;
                    }
                }
                ux2Var.q();
                int i12 = i7 >> 3;
                au8.d(function1, androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVButton"), z2, pw6Var3, ng0VarA, null, null, null, iw2Var, ux2Var, (i7 & 14) | (i12 & 896) | (i12 & 57344) | ((i7 << 9) & 1879048192), 480);
                z4 = z2;
                pw6Var2 = pw6Var3;
                ng0Var3 = ng0VarA;
                str3 = str4;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z4 = z2;
                str3 = str2;
                ng0Var3 = ng0Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, ng0Var3, iw2Var, i, i2, (byte) 0);
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (ux2Var.f(str2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    ng0Var2 = ng0Var;
                    if (ux2Var.f(ng0Var2)) {
                    }
                    i3 |= i10;
                } else {
                    ng0Var2 = ng0Var;
                }
                i3 |= i10;
            } else {
                ng0Var2 = ng0Var;
            }
            if ((1572864 & i) == 0) {
                if (ux2Var.h(iw2Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i3 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    qf6VarA = sf6.a(8.0f);
                    i6 = i3 & (-897);
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if ((i2 & 32) != 0) {
                        str4 = str2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        ng0VarA = og0.a(ux2Var);
                        i7 = i3 & (-459649);
                    } else {
                        str4 = str2;
                        ng0VarA = ng0Var2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        i7 = i6;
                    }
                } else {
                    qf6VarA = sf6.a(8.0f);
                    i6 = i3 & (-897);
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if ((i2 & 32) != 0) {
                        str4 = str2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        ng0VarA = og0.a(ux2Var);
                        i7 = i3 & (-459649);
                    } else {
                        str4 = str2;
                        ng0VarA = ng0Var2;
                        pw6Var3 = qf6VarA;
                        z2 = z5;
                        i7 = i6;
                    }
                }
                ux2Var.q();
                int i13 = i7 >> 3;
                au8.d(function1, androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVButton"), z2, pw6Var3, ng0VarA, null, null, null, iw2Var, ux2Var, (i7 & 14) | (i13 & 896) | (i13 & 57344) | ((i7 << 9) & 1879048192), 480);
                z4 = z2;
                pw6Var2 = pw6Var3;
                ng0Var3 = ng0VarA;
                str3 = str4;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z4 = z2;
                str3 = str2;
                ng0Var3 = ng0Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, ng0Var3, iw2Var, i, i2, (byte) 0);
            }
        }
        i3 |= 24576;
        str2 = str;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                ng0Var2 = ng0Var;
                if (ux2Var.f(ng0Var2)) {
                }
                i3 |= i10;
            } else {
                ng0Var2 = ng0Var;
            }
            i3 |= i10;
        } else {
            ng0Var2 = ng0Var;
        }
        if ((1572864 & i) == 0) {
            if (ux2Var.h(iw2Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i3 & 1, z3)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                qf6VarA = sf6.a(8.0f);
                i6 = i3 & (-897);
                if (i9 == 0) {
                }
                if (i4 != 0) {
                    str2 = "";
                }
                if ((i2 & 32) != 0) {
                    str4 = str2;
                    pw6Var3 = qf6VarA;
                    z2 = z5;
                    ng0VarA = og0.a(ux2Var);
                    i7 = i3 & (-459649);
                } else {
                    str4 = str2;
                    ng0VarA = ng0Var2;
                    pw6Var3 = qf6VarA;
                    z2 = z5;
                    i7 = i6;
                }
            } else {
                qf6VarA = sf6.a(8.0f);
                i6 = i3 & (-897);
                if (i9 == 0) {
                }
                if (i4 != 0) {
                    str2 = "";
                }
                if ((i2 & 32) != 0) {
                    str4 = str2;
                    pw6Var3 = qf6VarA;
                    z2 = z5;
                    ng0VarA = og0.a(ux2Var);
                    i7 = i3 & (-459649);
                } else {
                    str4 = str2;
                    ng0VarA = ng0Var2;
                    pw6Var3 = qf6VarA;
                    z2 = z5;
                    i7 = i6;
                }
            }
            ux2Var.q();
            int i14 = i7 >> 3;
            au8.d(function1, androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVButton"), z2, pw6Var3, ng0VarA, null, null, null, iw2Var, ux2Var, (i7 & 14) | (i14 & 896) | (i14 & 57344) | ((i7 << 9) & 1879048192), 480);
            z4 = z2;
            pw6Var2 = pw6Var3;
            ng0Var3 = ng0VarA;
            str3 = str4;
        } else {
            ux2Var.Q();
            pw6Var2 = pw6Var;
            z4 = z2;
            str3 = str2;
            ng0Var3 = ng0Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, ng0Var3, iw2Var, i, i2, (byte) 0);
        }
    }

    public static final void h(String str, hi7 hi7Var, long j, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        String string;
        str.getClass();
        hi7Var.getClass();
        ux2Var.Y(1061600086);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.d(hi7Var.ordinal()) ? 32 : 16) | (ux2Var.e(j) ? 256 : 128) | 3072;
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarB = ka0.B(cs4Var, 4.0f);
            List listN0 = ub7.n0(str, new String[]{" "}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                Character chV = ub7.V((String) it.next());
                String strValueOf = chV != null ? String.valueOf(chV.charValue()) : null;
                if (strValueOf != null) {
                    arrayList.add(strValueOf);
                }
            }
            if (arrayList.size() == 1) {
                string = (String) lv0.m0(arrayList);
            } else {
                Object objM0 = lv0.m0(arrayList);
                Object objV0 = lv0.v0(arrayList);
                StringBuilder sb = new StringBuilder();
                sb.append(objM0);
                sb.append(objV0);
                string = sb.toString();
            }
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            qs7.b(upperCase, fs4VarB, j, hi7Var.n, new ms2(500), 0L, new qo7(3), 0L, 0, false, 0, 0, null, null, ux2Var, (i2 & 896) | 1572864, 0, 261032);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ql7(str, hi7Var, j, fs4Var2, i);
        }
    }

    public static final void i(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-2138914950);
        int i2 = i | 6;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            x67.b(z(R.string.tv_teamviewer, ux2Var), null, ux2Var, 432);
            fs4Var = cs4.b;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0206  */
    /* JADX WARN: Code duplicated, block: B:105:0x0217  */
    /* JADX WARN: Code duplicated, block: B:108:0x0228  */
    /* JADX WARN: Code duplicated, block: B:111:0x0264  */
    /* JADX WARN: Code duplicated, block: B:112:0x0266  */
    /* JADX WARN: Code duplicated, block: B:116:0x0270  */
    /* JADX WARN: Code duplicated, block: B:118:0x0295  */
    /* JADX WARN: Code duplicated, block: B:121:0x029f  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01db  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fd  */
    public static final void j(SupportSession supportSession, a06 a06Var, xg8 xg8Var, fs4 fs4Var, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        final byte b;
        boolean z;
        fs4 fs4Var3;
        j56 j56VarR;
        cs4 cs4Var;
        fs4 fs4Var4;
        Object objK;
        aw awVar;
        boolean zF;
        Object objK2;
        int i4;
        boolean z2;
        Object objK3;
        boolean z3;
        boolean z4;
        Object objK4;
        hc1 hc1Var;
        boolean z5;
        tg3 tg3Var;
        fs4 fs4VarQ;
        final byte b2;
        boolean z6;
        Object objK5;
        boolean z7;
        Object objK6;
        Object objK7;
        Object objK8;
        boolean z8;
        Object objK9;
        final xg8 xg8Var2 = xg8Var;
        ux2 ux2Var2 = ux2Var;
        supportSession.getClass();
        a06Var.getClass();
        ux2Var2.Y(-421305807);
        if ((i & 6) == 0) {
            i3 = (ux2Var2.h(supportSession) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.f(a06Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var2.f(xg8Var2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var2.f(fs4Var2) ? 2048 : 1024;
            }
            b = 0;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var2.N(i3 & 1, z)) {
                cs4Var = cs4.b;
                if (i5 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                hk6 hk6VarW = im3.W(ux2Var2);
                objK = ux2Var2.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = ck3.w(ux2Var2);
                    ux2Var2.g0(objK);
                }
                me1 me1Var = (me1) objK;
                zF = ux2Var2.f(supportSession.getJoinSessionUrlForRecipient());
                objK2 = ux2Var2.K();
                if (zF || objK2 == awVar) {
                    objK2 = wf7.a.d(supportSession.getJoinSessionUrlForRecipient(), "");
                    ux2Var2.g0(objK2);
                }
                String str = (String) objK2;
                i4 = i3 & 896;
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK3 = ux2Var2.K();
                if (z2 || objK3 == awVar) {
                    objK3 = new Function0() { // from class: o.yg8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b3 = b;
                            f88 f88Var = f88.a;
                            xg8 xg8Var3 = xg8Var2;
                            switch (b3) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                                case 1:
                                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                    ga7.a(q31.x);
                                    xg8Var3.b.a();
                                    break;
                                case 2:
                                    IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                    ga7.a(q31.z);
                                    xg8Var3.c.a();
                                    break;
                                default:
                                    IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK3);
                }
                kh.c(false, (Function0) objK3, ux2Var2, 0, 1);
                Integer numValueOf = Integer.valueOf(supportSession.getSessioncode());
                SupportSessionRecipientStatus recipientStatus = supportSession.getRecipientStatus();
                boolean zH = ux2Var2.h(supportSession);
                if (i4 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zH | z3;
                objK4 = ux2Var2.K();
                hc1Var = null;
                if (z4 || objK4 == awVar) {
                    objK4 = new i9(supportSession, xg8Var2, hc1Var, (byte) 27);
                    ux2Var2.g0(objK4);
                }
                ck3.h(numValueOf, recipientStatus, (hw2) objK4, ux2Var2);
                fs4 fs4VarF = fs4Var4.f(androidx.compose.foundation.layout.b.c);
                do4 do4VarC = ua0.c(xz2.p, false);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
                yz0.c.getClass();
                ux2Var2.a0();
                z5 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z5) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                iz0 iz0Var = d82.v;
                o67.n(do4VarC, iz0Var, ux2Var2);
                iz0 iz0Var2 = d82.u;
                o67.n(yj5VarL, iz0Var2, ux2Var2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                iz0 iz0Var3 = d82.w;
                o67.n(numValueOf2, iz0Var3, ux2Var2);
                o67.l(ux2Var2);
                iz0 iz0Var4 = d82.t;
                o67.n(fs4VarS, iz0Var4, ux2Var2);
                bw bwVar = iq8.c;
                w50 w50Var = xz2.B;
                fs4 fs4Var5 = fs4Var4;
                fs4 fs4VarD = ka0.D(o77.t(cs4Var, hk6VarW, me1Var), 24.0f, 0.0f, 2);
                if (a06Var.a()) {
                    fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 768.0f, 1);
                } else {
                    fs4VarQ = cs4Var;
                }
                fs4 fs4VarF2 = fs4VarD.f(fs4VarQ);
                kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 54);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF2);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS2, iz0Var4, ux2Var2);
                l(null, ux2Var2, 0);
                if (a06Var.d) {
                    ux2Var2.W(909579117);
                } else {
                    ux2Var2.W(-801943816);
                    m(a06Var.a(), null, ux2Var2, 0);
                }
                ux2Var2.p(false);
                k(null, ux2Var2, 0);
                String strM = qs1.M(String.valueOf(supportSession.getSessioncode()));
                b2 = 1;
                fs4 fs4VarD2 = ka0.D(cs4Var, 0.0f, 34.0f, 1);
                if (i4 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objK5 = ux2Var2.K();
                if (!z6 || objK5 == awVar) {
                    xg8Var2 = xg8Var;
                    objK5 = new Function0() { // from class: o.yg8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b3 = b2;
                            f88 f88Var = f88.a;
                            xg8 xg8Var3 = xg8Var2;
                            switch (b3) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                                case 1:
                                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                    ga7.a(q31.x);
                                    xg8Var3.b.a();
                                    break;
                                case 2:
                                    IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                    ga7.a(q31.z);
                                    xg8Var3.c.a();
                                    break;
                                default:
                                    IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK5);
                } else {
                    xg8Var2 = xg8Var;
                }
                Function0 function0 = (Function0) objK5;
                if (i4 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objK6 = ux2Var2.K();
                if (z7 || objK6 == awVar) {
                    final byte b3 = 2;
                    objK6 = new Function0() { // from class: o.yg8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            xg8 xg8Var3 = xg8Var2;
                            switch (b4) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                                case 1:
                                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                    ga7.a(q31.x);
                                    xg8Var3.b.a();
                                    break;
                                case 2:
                                    IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                    ga7.a(q31.z);
                                    xg8Var3.c.a();
                                    break;
                                default:
                                    IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK6);
                }
                Function0 function1 = (Function0) objK6;
                objK7 = ux2Var2.K();
                if (objK7 == awVar) {
                    objK7 = new j68((byte) 5);
                    ux2Var2.g0(objK7);
                }
                Function0 function2 = (Function0) objK7;
                objK8 = ux2Var2.K();
                if (objK8 == awVar) {
                    objK8 = new j68((byte) 6);
                    ux2Var2.g0(objK8);
                }
                wf7.b(str, strM, fs4VarD2, function0, function1, function2, (Function0) objK8, null, ux2Var, 1769856, 128);
                ux2Var2 = ux2Var;
                fs4 fs4VarF3 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7);
                if (i4 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objK9 = ux2Var2.K();
                if (z8 || objK9 == awVar) {
                    final byte b4 = 3;
                    objK9 = new Function0() { // from class: o.yg8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b5 = b4;
                            f88 f88Var = f88.a;
                            xg8 xg8Var3 = xg8Var2;
                            switch (b5) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                                case 1:
                                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                    ga7.a(q31.x);
                                    xg8Var3.b.a();
                                    break;
                                case 2:
                                    IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                    ga7.a(q31.z);
                                    xg8Var3.c.a();
                                    break;
                                default:
                                    IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                    ga7.a(q31.C);
                                    xg8Var3.a.a();
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK9);
                }
                g((Function0) objK9, fs4VarF3, null, false, "TVTA-waitingRoom-leaveSession", null, ga0.r, ux2Var2, 1597488, 44);
                ux2Var2.p(true);
                ux2Var2.p(true);
                fs4Var3 = fs4Var5;
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new ck(supportSession, a06Var, xg8Var2, fs4Var3, i, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        fs4Var2 = fs4Var;
        b = 0;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var2.N(i3 & 1, z)) {
            cs4Var = cs4.b;
            if (i5 != 0) {
                fs4Var4 = cs4Var;
            } else {
                fs4Var4 = fs4Var2;
            }
            hk6 hk6VarW2 = im3.W(ux2Var2);
            objK = ux2Var2.K();
            awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var2 = (me1) objK;
            zF = ux2Var2.f(supportSession.getJoinSessionUrlForRecipient());
            objK2 = ux2Var2.K();
            if (zF) {
                objK2 = wf7.a.d(supportSession.getJoinSessionUrlForRecipient(), "");
                ux2Var2.g0(objK2);
            } else {
                objK2 = wf7.a.d(supportSession.getJoinSessionUrlForRecipient(), "");
                ux2Var2.g0(objK2);
            }
            String str2 = (String) objK2;
            i4 = i3 & 896;
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objK3 = ux2Var2.K();
            if (z2) {
                objK3 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b5) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK3);
            } else {
                objK3 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b5) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK3);
            }
            kh.c(false, (Function0) objK3, ux2Var2, 0, 1);
            Integer numValueOf3 = Integer.valueOf(supportSession.getSessioncode());
            SupportSessionRecipientStatus recipientStatus2 = supportSession.getRecipientStatus();
            boolean zH2 = ux2Var2.h(supportSession);
            if (i4 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zH2 | z3;
            objK4 = ux2Var2.K();
            hc1Var = null;
            if (z4) {
                objK4 = new i9(supportSession, xg8Var2, hc1Var, (byte) 27);
                ux2Var2.g0(objK4);
            } else {
                objK4 = new i9(supportSession, xg8Var2, hc1Var, (byte) 27);
                ux2Var2.g0(objK4);
            }
            ck3.h(numValueOf3, recipientStatus2, (hw2) objK4, ux2Var2);
            fs4 fs4VarF4 = fs4Var4.f(androidx.compose.foundation.layout.b.c);
            do4 do4VarC2 = ua0.c(xz2.p, false);
            int iHashCode3 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL3 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarF4);
            yz0.c.getClass();
            ux2Var2.a0();
            z5 = ux2Var2.S;
            tg3Var = LayoutNode.e0;
            if (z5) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var5 = d82.v;
            o67.n(do4VarC2, iz0Var5, ux2Var2);
            iz0 iz0Var6 = d82.u;
            o67.n(yj5VarL3, iz0Var6, ux2Var2);
            Integer numValueOf4 = Integer.valueOf(iHashCode3);
            iz0 iz0Var7 = d82.w;
            o67.n(numValueOf4, iz0Var7, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var8 = d82.t;
            o67.n(fs4VarS3, iz0Var8, ux2Var2);
            bw bwVar2 = iq8.c;
            w50 w50Var2 = xz2.B;
            fs4 fs4Var6 = fs4Var4;
            fs4 fs4VarD3 = ka0.D(o77.t(cs4Var, hk6VarW2, me1Var2), 24.0f, 0.0f, 2);
            if (a06Var.a()) {
                fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 768.0f, 1);
            } else {
                fs4VarQ = cs4Var;
            }
            fs4 fs4VarF5 = fs4VarD3.f(fs4VarQ);
            kw0 kw0VarA2 = iw0.a(bwVar2, w50Var2, ux2Var2, 54);
            int iHashCode4 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL4 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarF5);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var5, ux2Var2);
            o67.n(yj5VarL4, iz0Var6, ux2Var2);
            e41.r(iHashCode4, ux2Var2, iz0Var7, ux2Var2);
            o67.n(fs4VarS4, iz0Var8, ux2Var2);
            l(null, ux2Var2, 0);
            if (a06Var.d) {
                ux2Var2.W(-801943816);
                m(a06Var.a(), null, ux2Var2, 0);
            } else {
                ux2Var2.W(909579117);
            }
            ux2Var2.p(false);
            k(null, ux2Var2, 0);
            String strM2 = qs1.M(String.valueOf(supportSession.getSessioncode()));
            b2 = 1;
            fs4 fs4VarD4 = ka0.D(cs4Var, 0.0f, 34.0f, 1);
            if (i4 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            objK5 = ux2Var2.K();
            if (z6) {
                xg8Var2 = xg8Var;
                objK5 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b2;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b5) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK5);
            } else {
                xg8Var2 = xg8Var;
                objK5 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b2;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b5) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK5);
            }
            Function0 function3 = (Function0) objK5;
            if (i4 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            objK6 = ux2Var2.K();
            if (z7) {
                final byte b5 = 2;
                objK6 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b6 = b5;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b6) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK6);
            } else {
                final byte b6 = 2;
                objK6 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b7 = b6;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b7) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK6);
            }
            Function0 function4 = (Function0) objK6;
            objK7 = ux2Var2.K();
            if (objK7 == awVar) {
                objK7 = new j68((byte) 5);
                ux2Var2.g0(objK7);
            }
            Function0 function5 = (Function0) objK7;
            objK8 = ux2Var2.K();
            if (objK8 == awVar) {
                objK8 = new j68((byte) 6);
                ux2Var2.g0(objK8);
            }
            wf7.b(str2, strM2, fs4VarD4, function3, function4, function5, (Function0) objK8, null, ux2Var, 1769856, 128);
            ux2Var2 = ux2Var;
            fs4 fs4VarF6 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            if (i4 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            objK9 = ux2Var2.K();
            if (z8) {
                final byte b7 = 3;
                objK9 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b7;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b8) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK9);
            } else {
                final byte b8 = 3;
                objK9 = new Function0() { // from class: o.yg8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b9 = b8;
                        f88 f88Var = f88.a;
                        xg8 xg8Var3 = xg8Var2;
                        switch (b9) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                            case 1:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(q31.x);
                                xg8Var3.b.a();
                                break;
                            case 2:
                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                ga7.a(q31.z);
                                xg8Var3.c.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                ga7.a(q31.C);
                                xg8Var3.a.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK9);
            }
            g((Function0) objK9, fs4VarF6, null, false, "TVTA-waitingRoom-leaveSession", null, ga0.r, ux2Var2, 1597488, 44);
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4Var3 = fs4Var6;
        } else {
            ux2Var2.Q();
            fs4Var3 = fs4Var2;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ck(supportSession, a06Var, xg8Var2, fs4Var3, i, i2, (byte) 2);
        }
    }

    public static final void k(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2122536209);
        int i2 = i | 6;
        byte b = 2;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            ew ewVar = new ew(8.0f, new hk0(b));
            w50 w50Var = xz2.B;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 24.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(ewVar, w50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = z(R.string.waiting_room_title_remotecontrol, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.h, ux2Var, 48, 0, 130040);
            qs7.b(z(R.string.waiting_room_description, ux2Var), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.l, ux2Var, 48, 0, 130040);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 13);
        }
    }

    public static final void l(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-666283830);
        int i2 = i | 6;
        byte b = 2;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(cs4Var, 0.0f, 18.0f, 1);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0(b)), xz2.y, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            qs1.l(lv1.T(R.drawable.tv_icon, ux2Var2, 0), z(R.string.rc_logo_content_description, ux2Var2), null, null, null, 0.0f, null, ux2Var2, 8, 124);
            qs7.b(z(R.string.waiting_room_top_title, ux2Var2), null, ((tf2) ux2Var2.j(vf2.a)).l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.h, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 12);
        }
    }

    public static final void m(boolean z, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(87420820);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            float f = z ? 220.0f : 170.0f;
            cs4 cs4Var = cs4.b;
            fs4Var2 = cs4Var;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), f), sf6.a(16.0f));
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarJ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            qs1.l(lv1.T(R.drawable.waiting_room_background, ux2Var, 0), z(R.string.animation_background_content_description, ux2Var), androidx.compose.foundation.layout.b.c, null, rb1.a, 0.0f, null, ux2Var, 24968, 104);
            qs1.l(lv1.T(R.drawable.ic_laptop, ux2Var, 0), z(R.string.animation_background_content_description, ux2Var), ya0.a.a(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), xz2.s), null, null, 0.0f, null, ux2Var, 8, 120);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z, fs4Var2, i, (byte) 7);
        }
    }

    public static final void n(l07 l07Var, in5 in5Var) {
        io.sentry.util.network.b bVar = (io.sentry.util.network.b) l07Var.n;
        pc8 pc8Var = (pc8) bVar.d;
        pc8 pc8Var2 = (pc8) bVar.c;
        boolean zD = qs1.D(in5Var);
        long j = in5Var.b;
        if (zD) {
            yg1[] yg1VarArr = pc8Var2.d;
            cx.N0(0, yg1VarArr.length, null, yg1VarArr);
            pc8Var2.e = 0;
            yg1[] yg1VarArr2 = pc8Var.d;
            cx.N0(0, yg1VarArr2.length, null, yg1VarArr2);
            pc8Var.e = 0;
            bVar.b = 0L;
        }
        if (!qs1.F(in5Var)) {
            List listB = in5Var.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                t53 t53Var = (t53) listB.get(i);
                bVar.a(t53Var.a, t65.e(t53Var.e, 0L));
            }
            bVar.a(j, t65.e(in5Var.n, 0L));
        }
        if (qs1.F(in5Var) && j - bVar.b > 40) {
            yg1[] yg1VarArr3 = pc8Var2.d;
            cx.N0(0, yg1VarArr3.length, null, yg1VarArr3);
            pc8Var2.e = 0;
            yg1[] yg1VarArr4 = pc8Var.d;
            cx.N0(0, yg1VarArr4.length, null, yg1VarArr4);
            pc8Var.e = 0;
            bVar.b = 0L;
        }
        bVar.b = j;
    }

    public static final g07 o(oz3 oz3Var) {
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        g07 g07Var = m98VarR0 instanceof g07 ? (g07) m98VarR0 : null;
        if (g07Var != null) {
            return g07Var;
        }
        hk0.f(oz3Var, "This is should be simple type: ");
        return null;
    }

    public static final float p(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final ge q(n37 n37Var) {
        w50 w50Var = xz2.A;
        if ((n37Var instanceof xq7) || (n37Var instanceof wq7)) {
            return w50Var;
        }
        an4.i(n37Var, "Unknown position: ");
        return null;
    }

    public static final ge r(n37 n37Var) {
        w50 w50Var = xz2.A;
        if ((n37Var instanceof xq7) || (n37Var instanceof wq7)) {
            return w50Var;
        }
        an4.i(n37Var, "Unknown position: ");
        return null;
    }

    public static final boolean s(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static boolean t(byte b) {
        return b > -65;
    }

    public static final float u(ux2 ux2Var) {
        long j = ((rn4) ux2Var.j(un4.a)).b.l.b.c;
        long j2 = i58.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((in1) ux2Var.j(b11.h)).v(j) / 2.0f;
    }

    public static final void v(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ki3.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fP = p(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fP);
                }
            }
            float fSqrt = (float) Math.sqrt(p(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : p(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fP2 = p(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fP2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fP2 / fArr11[i14];
        }
    }

    public static final g07 w(g07 g07Var, List list, g48 g48Var) {
        g07Var.getClass();
        list.getClass();
        g48Var.getClass();
        if (list.isEmpty() && g48Var == g07Var.n0()) {
            return g07Var;
        }
        if (list.isEmpty()) {
            return g07Var.u0(g48Var);
        }
        if (!(g07Var instanceof ed2)) {
            return bt1.P(list, g48Var, g07Var.o0(), g07Var.p0());
        }
        ed2 ed2Var = (ed2) g07Var;
        k48 k48Var = ed2Var.n;
        cd2 cd2Var = ed2Var.f705o;
        gd2 gd2Var = ed2Var.p;
        boolean z = ed2Var.r;
        String[] strArr = ed2Var.s;
        return new ed2(k48Var, cd2Var, gd2Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static oz3 x(oz3 oz3Var, List list, up upVar, int i) {
        if ((i & 2) != 0) {
            upVar = oz3Var.getAnnotations();
        }
        oz3Var.getClass();
        if ((list.isEmpty() || list == oz3Var.m0()) && upVar == oz3Var.getAnnotations()) {
            return oz3Var;
        }
        g48 g48VarN0 = oz3Var.n0();
        if ((upVar instanceof dl2) && ((dl2) upVar).isEmpty()) {
            upVar = yl7.p;
        }
        g48 g48VarX = i67.x(g48VarN0, upVar);
        m98 m98VarR0 = oz3Var.r0();
        if (m98VarR0 instanceof um2) {
            um2 um2Var = (um2) m98VarR0;
            return bt1.v(w(um2Var.n, list, g48VarX), w(um2Var.f2226o, list, g48VarX));
        }
        if (m98VarR0 instanceof g07) {
            return w((g07) m98VarR0, list, g48VarX);
        }
        gk0.s();
        return null;
    }

    public static /* synthetic */ g07 y(g07 g07Var, List list, g48 g48Var, int i) {
        if ((i & 1) != 0) {
            list = g07Var.m0();
        }
        if ((i & 2) != 0) {
            g48Var = g07Var.n0();
        }
        return w(g07Var, list, g48Var);
    }

    public static final String z(int i, ux2 ux2Var) {
        return ((Resources) ux2Var.j(lh.c)).getString(i);
    }
}
