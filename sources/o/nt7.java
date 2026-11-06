package o;

import android.graphics.Paint;
import android.os.Trace;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nt7 extends es4 implements r04, t52, dp6 {
    public String A;
    public ot7 B;
    public mr2 C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public xv0 H;
    public HashMap I;
    public ff5 J;
    public lt7 K;
    public mt7 L;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        ff5 ff5VarU0;
        mt7 mt7Var = this.L;
        if (mt7Var == null) {
            ff5VarU0 = U0();
        } else {
            if (!mt7Var.c) {
                mt7Var = null;
            }
            if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                ff5VarU0 = U0();
            }
        }
        ff5VarU0.d(rg4Var);
        return v67.f(ff5VarU0.e(rg4Var.getLayoutDirection()).c());
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    public final ff5 U0() {
        ot7 ot7Var = this.B;
        ff5 ff5Var = this.J;
        if (ff5Var == null) {
            ff5Var = new ff5(this.A, ot7Var, this.C, this.D, this.E, this.F, this.G);
            this.J = ff5Var;
        }
        ff5Var.getClass();
        return ff5Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:24:0x0059, B:26:0x0069, B:28:0x0084, B:30:0x0094, B:29:0x008d, B:25:0x0062, B:31:0x00a1, B:12:0x0015), top: B:37:0x0005 }] */
    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        ff5 ff5VarU0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            mt7 mt7Var = this.L;
            if (mt7Var == null) {
                ff5VarU0 = U0();
            } else {
                if (!mt7Var.c) {
                    mt7Var = null;
                }
                if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                    ff5VarU0 = U0();
                }
            }
            ff5VarU0.d(fo4Var);
            boolean zB = ff5VarU0.b(j, fo4Var.getLayoutDirection());
            ef5 ef5Var = ff5VarU0.n;
            if (ef5Var != null) {
                ef5Var.b();
            }
            mj mjVar = ff5VarU0.j;
            mjVar.getClass();
            ts7 ts7Var = mjVar.d;
            long j2 = ff5VarU0.l;
            if (zB) {
                vn4.n0(this, 2).i1();
                HashMap map = this.I;
                if (map == null) {
                    map = new HashMap(2);
                    this.I = map;
                }
                b63 b63Var = le.a;
                Paint.FontMetricsInt fontMetricsInt = ts7Var.l;
                map.put(b63Var, Integer.valueOf(Math.round(ts7Var.h + ((ts7Var.g + (-1) != 0 || fontMetricsInt == null) ? ts7Var.f.getLineBaseline(0) : ts7Var.h(0) - fontMetricsInt.ascent) + 0.0f)));
                b63 b63Var2 = le.b;
                int i = ts7Var.g - 1;
                Paint.FontMetricsInt fontMetricsInt2 = ts7Var.l;
                map.put(b63Var2, Integer.valueOf(Math.round(ts7Var.h + (fontMetricsInt2 != null ? ts7Var.h(i) - fontMetricsInt2.ascent : ts7Var.f.getLineBaseline(i)) + 0.0f)));
            }
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            jl5 jl5VarC = zn4Var.C(kh.t(i2, i2, i3, i3));
            HashMap map2 = this.I;
            map2.getClass();
            return fo4Var.u(i2, i3, map2, new v0(jl5VarC, (byte) 15));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        ff5 ff5VarU0;
        mt7 mt7Var = this.L;
        if (mt7Var == null) {
            ff5VarU0 = U0();
        } else {
            if (!mt7Var.c) {
                mt7Var = null;
            }
            if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                ff5VarU0 = U0();
            }
        }
        ff5VarU0.d(rg4Var);
        return v67.f(ff5VarU0.e(rg4Var.getLayoutDirection()).i());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        ff5 ff5VarU0;
        mt7 mt7Var = this.L;
        if (mt7Var == null) {
            ff5VarU0 = U0();
        } else {
            if (!mt7Var.c) {
                mt7Var = null;
            }
            if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                ff5VarU0 = U0();
            }
        }
        ff5VarU0.d(rg4Var);
        return ff5VarU0.a(i, rg4Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // o.t52
    public final void j(d14 d14Var) {
        ff5 ff5VarU0;
        if (this.z) {
            mt7 mt7Var = this.L;
            if (mt7Var == null) {
                ff5VarU0 = U0();
            } else {
                if (!mt7Var.c) {
                    mt7Var = null;
                }
                if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                    ff5VarU0 = U0();
                }
            }
            mj mjVar = ff5VarU0.j;
            if (mjVar == null) {
                ni3.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.J + ", textSubstitution=" + this.L + ")");
                hk0.b();
                return;
            }
            ll0 ll0VarX = d14Var.m.n.x();
            boolean z = ff5VarU0.k;
            if (z) {
                long j = ff5VarU0.l;
                ll0VarX.g();
                ll0VarX.n(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                ot7 ot7Var = this.B;
                c77 c77Var = ot7Var.a;
                vp7 vp7Var = c77Var.m;
                if (vp7Var == null) {
                    vp7Var = vp7.b;
                }
                vp7 vp7Var2 = vp7Var;
                lw6 lw6Var = c77Var.n;
                if (lw6Var == null) {
                    lw6Var = lw6.d;
                }
                lw6 lw6Var2 = lw6Var;
                v52 v52Var = c77Var.p;
                if (v52Var == null) {
                    v52Var = zk2.a;
                }
                v52 v52Var2 = v52Var;
                sb0 sb0VarB = ot7Var.b();
                if (sb0VarB != null) {
                    mjVar.f(ll0VarX, sb0VarB, ot7Var.a.a.a(), lw6Var2, vp7Var2, v52Var2);
                } else {
                    xv0 xv0Var = this.H;
                    long jA = xv0Var != null ? xv0Var.a() : rv0.h;
                    if (jA == 16) {
                        jA = ot7Var.c() != 16 ? ot7Var.c() : rv0.b;
                    }
                    mjVar.e(ll0VarX, jA, lw6Var2, vp7Var2, v52Var2);
                }
            } finally {
                if (z) {
                    ll0VarX.p();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        ff5 ff5VarU0;
        mt7 mt7Var = this.L;
        if (mt7Var == null) {
            ff5VarU0 = U0();
        } else {
            if (!mt7Var.c) {
                mt7Var = null;
            }
            if (mt7Var == null || (ff5VarU0 = mt7Var.d) == null) {
                ff5VarU0 = U0();
            }
        }
        ff5VarU0.d(rg4Var);
        return ff5VarU0.a(i, rg4Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.lt7] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // o.dp6
    public final void z(op6 op6Var) {
        lt7 lt7Var = this.K;
        ?? r0 = lt7Var;
        if (lt7Var == null) {
            final byte b = 0;
            ?? r1 = new Function1(this) { // from class: o.lt7
                public final /* synthetic */ nt7 n;

                {
                    this.n = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    in1 in1Var;
                    vs7 vs7Var;
                    byte b2 = b;
                    boolean z = true;
                    nt7 nt7Var = this.n;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            ff5 ff5VarU0 = nt7Var.U0();
                            ot7 ot7Var = nt7Var.B;
                            xv0 xv0Var = nt7Var.H;
                            ot7 ot7VarF = ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214);
                            j04 j04Var = ff5VarU0.f792o;
                            vs7 vs7Var2 = null;
                            if (j04Var == null || (in1Var = ff5VarU0.i) == null) {
                                vs7Var = null;
                            } else {
                                xo xoVar = new xo(ff5VarU0.a);
                                if (ff5VarU0.j == null || ff5VarU0.n == null) {
                                    vs7Var = null;
                                } else {
                                    long j = ff5VarU0.p & (-8589934589L);
                                    int i = ff5VarU0.f;
                                    boolean z2 = ff5VarU0.e;
                                    int i2 = ff5VarU0.d;
                                    mr2 mr2Var = ff5VarU0.c;
                                    ea2 ea2Var = ea2.m;
                                    vs7Var = new vs7(new us7(xoVar, ot7VarF, ea2Var, i, z2, i2, in1Var, j04Var, mr2Var, j), new xu4(new yc4(ea2Var, xoVar, in1Var, mr2Var, ot7VarF, z2), j, ff5VarU0.f, ff5VarU0.d), ff5VarU0.l);
                                }
                            }
                            if (vs7Var != null) {
                                list.add(vs7Var);
                                vs7Var2 = vs7Var;
                            }
                            return Boolean.valueOf(vs7Var2 != null);
                        case 1:
                            String str = ((xo) obj).n;
                            mt7 mt7Var = nt7Var.L;
                            if (mt7Var == null) {
                                mt7 mt7Var2 = new mt7(nt7Var.A, str);
                                ff5 ff5Var = new ff5(str, nt7Var.B, nt7Var.C, nt7Var.D, nt7Var.E, nt7Var.F, nt7Var.G);
                                ff5Var.d(nt7Var.U0().i);
                                mt7Var2.d = ff5Var;
                                nt7Var.L = mt7Var2;
                            } else if (!im3.n(str, mt7Var.b)) {
                                mt7Var.b = str;
                                ff5 ff5Var2 = mt7Var.d;
                                if (ff5Var2 != null) {
                                    ot7 ot7Var2 = nt7Var.B;
                                    mr2 mr2Var2 = nt7Var.C;
                                    int i3 = nt7Var.D;
                                    boolean z3 = nt7Var.E;
                                    int i4 = nt7Var.F;
                                    int i5 = nt7Var.G;
                                    ff5Var2.a = str;
                                    ff5Var2.b = ot7Var2;
                                    ff5Var2.c = mr2Var2;
                                    ff5Var2.d = i3;
                                    ff5Var2.e = z3;
                                    ff5Var2.f = i4;
                                    ff5Var2.g = i5;
                                    ff5Var2.s = (ff5Var2.s << 2) | 2;
                                    ff5Var2.c();
                                }
                            }
                            vn4.p0(nt7Var).U();
                            vn4.p0(nt7Var).S();
                            yo1.H(nt7Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            mt7 mt7Var3 = nt7Var.L;
                            if (mt7Var3 == null) {
                                z = false;
                            } else {
                                mt7Var3.c = zBooleanValue;
                                vn4.p0(nt7Var).U();
                                vn4.p0(nt7Var).S();
                                yo1.H(nt7Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.K = r1;
            r0 = r1;
        }
        xo xoVar = new xo(this.A);
        fw3[] fw3VarArr = lp6.a;
        op6Var.d(kp6.C, qf0.K(xoVar));
        mt7 mt7Var = this.L;
        if (mt7Var != null) {
            boolean z = mt7Var.c;
            np6 np6Var = kp6.E;
            fw3[] fw3VarArr2 = lp6.a;
            fw3 fw3Var = fw3VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            np6Var.getClass();
            op6Var.d(np6Var, boolValueOf);
            xo xoVar2 = new xo(mt7Var.b);
            np6 np6Var2 = kp6.D;
            fw3 fw3Var2 = fw3VarArr2[16];
            np6Var2.getClass();
            op6Var.d(np6Var2, xoVar2);
        }
        final byte b2 = 1;
        op6Var.d(zo6.l, new m3(null, new Function1(this) { // from class: o.lt7
            public final /* synthetic */ nt7 n;

            {
                this.n = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                in1 in1Var;
                vs7 vs7Var;
                byte b3 = b2;
                boolean z2 = true;
                nt7 nt7Var = this.n;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        ff5 ff5VarU0 = nt7Var.U0();
                        ot7 ot7Var = nt7Var.B;
                        xv0 xv0Var = nt7Var.H;
                        ot7 ot7VarF = ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214);
                        j04 j04Var = ff5VarU0.f792o;
                        vs7 vs7Var2 = null;
                        if (j04Var == null || (in1Var = ff5VarU0.i) == null) {
                            vs7Var = null;
                        } else {
                            xo xoVar3 = new xo(ff5VarU0.a);
                            if (ff5VarU0.j == null || ff5VarU0.n == null) {
                                vs7Var = null;
                            } else {
                                long j = ff5VarU0.p & (-8589934589L);
                                int i = ff5VarU0.f;
                                boolean z3 = ff5VarU0.e;
                                int i2 = ff5VarU0.d;
                                mr2 mr2Var = ff5VarU0.c;
                                ea2 ea2Var = ea2.m;
                                vs7Var = new vs7(new us7(xoVar3, ot7VarF, ea2Var, i, z3, i2, in1Var, j04Var, mr2Var, j), new xu4(new yc4(ea2Var, xoVar3, in1Var, mr2Var, ot7VarF, z3), j, ff5VarU0.f, ff5VarU0.d), ff5VarU0.l);
                            }
                        }
                        if (vs7Var != null) {
                            list.add(vs7Var);
                            vs7Var2 = vs7Var;
                        }
                        return Boolean.valueOf(vs7Var2 != null);
                    case 1:
                        String str = ((xo) obj).n;
                        mt7 mt7Var2 = nt7Var.L;
                        if (mt7Var2 == null) {
                            mt7 mt7Var3 = new mt7(nt7Var.A, str);
                            ff5 ff5Var = new ff5(str, nt7Var.B, nt7Var.C, nt7Var.D, nt7Var.E, nt7Var.F, nt7Var.G);
                            ff5Var.d(nt7Var.U0().i);
                            mt7Var3.d = ff5Var;
                            nt7Var.L = mt7Var3;
                        } else if (!im3.n(str, mt7Var2.b)) {
                            mt7Var2.b = str;
                            ff5 ff5Var2 = mt7Var2.d;
                            if (ff5Var2 != null) {
                                ot7 ot7Var2 = nt7Var.B;
                                mr2 mr2Var2 = nt7Var.C;
                                int i3 = nt7Var.D;
                                boolean z4 = nt7Var.E;
                                int i4 = nt7Var.F;
                                int i5 = nt7Var.G;
                                ff5Var2.a = str;
                                ff5Var2.b = ot7Var2;
                                ff5Var2.c = mr2Var2;
                                ff5Var2.d = i3;
                                ff5Var2.e = z4;
                                ff5Var2.f = i4;
                                ff5Var2.g = i5;
                                ff5Var2.s = (ff5Var2.s << 2) | 2;
                                ff5Var2.c();
                            }
                        }
                        vn4.p0(nt7Var).U();
                        vn4.p0(nt7Var).S();
                        yo1.H(nt7Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        mt7 mt7Var4 = nt7Var.L;
                        if (mt7Var4 == null) {
                            z2 = false;
                        } else {
                            mt7Var4.c = zBooleanValue;
                            vn4.p0(nt7Var).U();
                            vn4.p0(nt7Var).S();
                            yo1.H(nt7Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        op6Var.d(zo6.m, new m3(null, new Function1(this) { // from class: o.lt7
            public final /* synthetic */ nt7 n;

            {
                this.n = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                in1 in1Var;
                vs7 vs7Var;
                byte b4 = b3;
                boolean z2 = true;
                nt7 nt7Var = this.n;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        ff5 ff5VarU0 = nt7Var.U0();
                        ot7 ot7Var = nt7Var.B;
                        xv0 xv0Var = nt7Var.H;
                        ot7 ot7VarF = ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214);
                        j04 j04Var = ff5VarU0.f792o;
                        vs7 vs7Var2 = null;
                        if (j04Var == null || (in1Var = ff5VarU0.i) == null) {
                            vs7Var = null;
                        } else {
                            xo xoVar3 = new xo(ff5VarU0.a);
                            if (ff5VarU0.j == null || ff5VarU0.n == null) {
                                vs7Var = null;
                            } else {
                                long j = ff5VarU0.p & (-8589934589L);
                                int i = ff5VarU0.f;
                                boolean z3 = ff5VarU0.e;
                                int i2 = ff5VarU0.d;
                                mr2 mr2Var = ff5VarU0.c;
                                ea2 ea2Var = ea2.m;
                                vs7Var = new vs7(new us7(xoVar3, ot7VarF, ea2Var, i, z3, i2, in1Var, j04Var, mr2Var, j), new xu4(new yc4(ea2Var, xoVar3, in1Var, mr2Var, ot7VarF, z3), j, ff5VarU0.f, ff5VarU0.d), ff5VarU0.l);
                            }
                        }
                        if (vs7Var != null) {
                            list.add(vs7Var);
                            vs7Var2 = vs7Var;
                        }
                        return Boolean.valueOf(vs7Var2 != null);
                    case 1:
                        String str = ((xo) obj).n;
                        mt7 mt7Var2 = nt7Var.L;
                        if (mt7Var2 == null) {
                            mt7 mt7Var3 = new mt7(nt7Var.A, str);
                            ff5 ff5Var = new ff5(str, nt7Var.B, nt7Var.C, nt7Var.D, nt7Var.E, nt7Var.F, nt7Var.G);
                            ff5Var.d(nt7Var.U0().i);
                            mt7Var3.d = ff5Var;
                            nt7Var.L = mt7Var3;
                        } else if (!im3.n(str, mt7Var2.b)) {
                            mt7Var2.b = str;
                            ff5 ff5Var2 = mt7Var2.d;
                            if (ff5Var2 != null) {
                                ot7 ot7Var2 = nt7Var.B;
                                mr2 mr2Var2 = nt7Var.C;
                                int i3 = nt7Var.D;
                                boolean z4 = nt7Var.E;
                                int i4 = nt7Var.F;
                                int i5 = nt7Var.G;
                                ff5Var2.a = str;
                                ff5Var2.b = ot7Var2;
                                ff5Var2.c = mr2Var2;
                                ff5Var2.d = i3;
                                ff5Var2.e = z4;
                                ff5Var2.f = i4;
                                ff5Var2.g = i5;
                                ff5Var2.s = (ff5Var2.s << 2) | 2;
                                ff5Var2.c();
                            }
                        }
                        vn4.p0(nt7Var).U();
                        vn4.p0(nt7Var).S();
                        yo1.H(nt7Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        mt7 mt7Var4 = nt7Var.L;
                        if (mt7Var4 == null) {
                            z2 = false;
                        } else {
                            mt7Var4.c = zBooleanValue;
                            vn4.p0(nt7Var).U();
                            vn4.p0(nt7Var).S();
                            yo1.H(nt7Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        op6Var.d(zo6.n, new m3(null, new ks7(this, (byte) 2)));
        lp6.a(op6Var, r0);
    }
}
