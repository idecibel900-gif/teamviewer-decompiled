package o;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wo7 extends es4 implements r04, t52, dp6 {
    public xo A;
    public ot7 B;
    public mr2 C;
    public Function1 D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public List I;
    public Function1 J;
    public xv0 K;
    public Function1 L;
    public Map M;
    public zu4 N;
    public uo7 O;
    public vo7 P;

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        return v67.f(V0(rg4Var).e(rg4Var.getLayoutDirection()).c());
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    public final zu4 U0() {
        zu4 zu4Var = this.N;
        if (zu4Var != null) {
            return zu4Var;
        }
        zu4 zu4Var2 = new zu4(this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I);
        this.N = zu4Var2;
        return zu4Var2;
    }

    public final zu4 V0(in1 in1Var) {
        zu4 zu4Var;
        vo7 vo7Var = this.P;
        if (vo7Var != null && vo7Var.c && (zu4Var = vo7Var.d) != null) {
            zu4Var.d(in1Var);
            return zu4Var;
        }
        zu4 zu4VarU0 = U0();
        zu4VarU0.d(in1Var);
        return zu4VarU0;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            zu4 zu4VarV0 = V0(fo4Var);
            boolean zC = zu4VarV0.c(j, fo4Var.getLayoutDirection());
            vs7 vs7Var = zu4VarV0.n;
            if (vs7Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + zu4VarV0);
            }
            long j2 = vs7Var.c;
            vs7Var.b.a.b();
            if (zC) {
                vn4.n0(this, 2).i1();
                Function1 function1 = this.D;
                if (function1 != null) {
                    function1.invoke(vs7Var);
                }
                Map linkedHashMap = this.M;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(le.a, Integer.valueOf(Math.round(vs7Var.d)));
                linkedHashMap.put(le.b, Integer.valueOf(Math.round(vs7Var.e)));
                this.M = linkedHashMap;
            }
            Function1 function2 = this.J;
            if (function2 != null) {
                function2.invoke(vs7Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            jl5 jl5VarC = zn4Var.C(kh.t(i, i, i2, i2));
            Map map = this.M;
            map.getClass();
            eo4 eo4VarU = fo4Var.u(i, i2, map, new v0(jl5VarC, (byte) 12));
            Trace.endSection();
            return eo4VarU;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        return v67.f(V0(rg4Var).e(rg4Var.getLayoutDirection()).i());
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        return V0(rg4Var).a(i, rg4Var.getLayoutDirection());
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        List list;
        if (this.z) {
            ll0 ll0VarX = d14Var.m.n.x();
            zu4 zu4VarV0 = V0(d14Var);
            vs7 vs7Var = zu4VarV0.n;
            if (vs7Var == null) {
                yq4.t(zu4VarV0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            xu4 xu4Var = vs7Var.b;
            boolean z = vs7Var.d() && this.E != 3;
            if (z) {
                long j = vs7Var.c;
                v56 v56VarV = qs1.v(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                ll0VarX.g();
                ll0.e(ll0VarX, v56VarV);
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
                    xu4.j(xu4Var, ll0VarX, sb0VarB, this.B.a.a.a(), lw6Var2, vp7Var2, v52Var2);
                } else {
                    xv0 xv0Var = this.K;
                    long jA = xv0Var != null ? xv0Var.a() : rv0.h;
                    if (jA == 16) {
                        jA = this.B.c() != 16 ? this.B.c() : rv0.b;
                    }
                    xu4.i(xu4Var, ll0VarX, jA, lw6Var2, vp7Var2, v52Var2);
                }
                if (z) {
                    ll0VarX.p();
                }
                vo7 vo7Var = this.P;
                if (((vo7Var == null || !vo7Var.c) ? h67.l(this.A) : false) || !((list = this.I) == null || list.isEmpty())) {
                    d14Var.a();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                ll0VarX.p();
                throw th;
            }
        }
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        return V0(rg4Var).a(i, rg4Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.uo7] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // o.dp6
    public final void z(op6 op6Var) {
        uo7 uo7Var = this.O;
        ?? r0 = uo7Var;
        if (uo7Var == null) {
            final byte b = 0;
            ?? r1 = new Function1(this) { // from class: o.uo7
                public final /* synthetic */ wo7 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    vs7 vs7Var;
                    boolean z;
                    byte b2 = b;
                    wo7 wo7Var = this.n;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            vs7 vs7Var2 = wo7Var.U0().n;
                            if (vs7Var2 != null) {
                                us7 us7Var = vs7Var2.a;
                                xo xoVar = us7Var.a;
                                ot7 ot7Var = wo7Var.B;
                                xv0 xv0Var = wo7Var.K;
                                vs7Var = new vs7(new us7(xoVar, ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214), us7Var.c, us7Var.d, us7Var.e, us7Var.f, us7Var.g, us7Var.h, us7Var.i, us7Var.j), vs7Var2.b, vs7Var2.c);
                                list.add(vs7Var);
                            } else {
                                vs7Var = null;
                            }
                            return Boolean.valueOf(vs7Var != null);
                        case 1:
                            xo xoVar2 = (xo) obj;
                            vo7 vo7Var = wo7Var.P;
                            ea2 ea2Var = ea2.m;
                            if (vo7Var == null) {
                                vo7 vo7Var2 = new vo7(wo7Var.A, xoVar2);
                                zu4 zu4Var = new zu4(xoVar2, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                                zu4Var.d(wo7Var.U0().j);
                                vo7Var2.d = zu4Var;
                                wo7Var.P = vo7Var2;
                            } else if (!im3.n(xoVar2, vo7Var.b)) {
                                vo7Var.b = xoVar2;
                                zu4 zu4Var2 = vo7Var.d;
                                if (zu4Var2 != null) {
                                    zu4Var2.g(xoVar2, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                                }
                            }
                            vn4.p0(wo7Var).U();
                            vn4.p0(wo7Var).S();
                            yo1.H(wo7Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            vo7 vo7Var3 = wo7Var.P;
                            if (vo7Var3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = wo7Var.L;
                                if (function1 != null) {
                                    function1.invoke(vo7Var3);
                                }
                                vo7 vo7Var4 = wo7Var.P;
                                if (vo7Var4 != null) {
                                    vo7Var4.c = zBooleanValue;
                                }
                                vn4.p0(wo7Var).U();
                                vn4.p0(wo7Var).S();
                                yo1.H(wo7Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.O = r1;
            r0 = r1;
        }
        xo xoVar = this.A;
        fw3[] fw3VarArr = lp6.a;
        op6Var.d(kp6.C, qf0.K(xoVar));
        vo7 vo7Var = this.P;
        if (vo7Var != null) {
            xo xoVar2 = vo7Var.b;
            np6 np6Var = kp6.D;
            fw3[] fw3VarArr2 = lp6.a;
            fw3 fw3Var = fw3VarArr2[16];
            np6Var.getClass();
            op6Var.d(np6Var, xoVar2);
            boolean z = vo7Var.c;
            np6 np6Var2 = kp6.E;
            fw3 fw3Var2 = fw3VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            np6Var2.getClass();
            op6Var.d(np6Var2, boolValueOf);
        }
        final byte b2 = 1;
        op6Var.d(zo6.l, new m3(null, new Function1(this) { // from class: o.uo7
            public final /* synthetic */ wo7 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vs7 vs7Var;
                boolean z2;
                byte b3 = b2;
                wo7 wo7Var = this.n;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        vs7 vs7Var2 = wo7Var.U0().n;
                        if (vs7Var2 != null) {
                            us7 us7Var = vs7Var2.a;
                            xo xoVar3 = us7Var.a;
                            ot7 ot7Var = wo7Var.B;
                            xv0 xv0Var = wo7Var.K;
                            vs7Var = new vs7(new us7(xoVar3, ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214), us7Var.c, us7Var.d, us7Var.e, us7Var.f, us7Var.g, us7Var.h, us7Var.i, us7Var.j), vs7Var2.b, vs7Var2.c);
                            list.add(vs7Var);
                        } else {
                            vs7Var = null;
                        }
                        return Boolean.valueOf(vs7Var != null);
                    case 1:
                        xo xoVar4 = (xo) obj;
                        vo7 vo7Var2 = wo7Var.P;
                        ea2 ea2Var = ea2.m;
                        if (vo7Var2 == null) {
                            vo7 vo7Var3 = new vo7(wo7Var.A, xoVar4);
                            zu4 zu4Var = new zu4(xoVar4, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                            zu4Var.d(wo7Var.U0().j);
                            vo7Var3.d = zu4Var;
                            wo7Var.P = vo7Var3;
                        } else if (!im3.n(xoVar4, vo7Var2.b)) {
                            vo7Var2.b = xoVar4;
                            zu4 zu4Var2 = vo7Var2.d;
                            if (zu4Var2 != null) {
                                zu4Var2.g(xoVar4, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                            }
                        }
                        vn4.p0(wo7Var).U();
                        vn4.p0(wo7Var).S();
                        yo1.H(wo7Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        vo7 vo7Var4 = wo7Var.P;
                        if (vo7Var4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = wo7Var.L;
                            if (function1 != null) {
                                function1.invoke(vo7Var4);
                            }
                            vo7 vo7Var5 = wo7Var.P;
                            if (vo7Var5 != null) {
                                vo7Var5.c = zBooleanValue;
                            }
                            vn4.p0(wo7Var).U();
                            vn4.p0(wo7Var).S();
                            yo1.H(wo7Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        op6Var.d(zo6.m, new m3(null, new Function1(this) { // from class: o.uo7
            public final /* synthetic */ wo7 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vs7 vs7Var;
                boolean z2;
                byte b4 = b3;
                wo7 wo7Var = this.n;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        vs7 vs7Var2 = wo7Var.U0().n;
                        if (vs7Var2 != null) {
                            us7 us7Var = vs7Var2.a;
                            xo xoVar3 = us7Var.a;
                            ot7 ot7Var = wo7Var.B;
                            xv0 xv0Var = wo7Var.K;
                            vs7Var = new vs7(new us7(xoVar3, ot7.f(ot7Var, xv0Var != null ? xv0Var.a() : rv0.h, 0L, null, 0L, 0, 0L, 16777214), us7Var.c, us7Var.d, us7Var.e, us7Var.f, us7Var.g, us7Var.h, us7Var.i, us7Var.j), vs7Var2.b, vs7Var2.c);
                            list.add(vs7Var);
                        } else {
                            vs7Var = null;
                        }
                        return Boolean.valueOf(vs7Var != null);
                    case 1:
                        xo xoVar4 = (xo) obj;
                        vo7 vo7Var2 = wo7Var.P;
                        ea2 ea2Var = ea2.m;
                        if (vo7Var2 == null) {
                            vo7 vo7Var3 = new vo7(wo7Var.A, xoVar4);
                            zu4 zu4Var = new zu4(xoVar4, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                            zu4Var.d(wo7Var.U0().j);
                            vo7Var3.d = zu4Var;
                            wo7Var.P = vo7Var3;
                        } else if (!im3.n(xoVar4, vo7Var2.b)) {
                            vo7Var2.b = xoVar4;
                            zu4 zu4Var2 = vo7Var2.d;
                            if (zu4Var2 != null) {
                                zu4Var2.g(xoVar4, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, ea2Var);
                            }
                        }
                        vn4.p0(wo7Var).U();
                        vn4.p0(wo7Var).S();
                        yo1.H(wo7Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        vo7 vo7Var4 = wo7Var.P;
                        if (vo7Var4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = wo7Var.L;
                            if (function1 != null) {
                                function1.invoke(vo7Var4);
                            }
                            vo7 vo7Var5 = wo7Var.P;
                            if (vo7Var5 != null) {
                                vo7Var5.c = zBooleanValue;
                            }
                            vn4.p0(wo7Var).U();
                            vn4.p0(wo7Var).S();
                            yo1.H(wo7Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        op6Var.d(zo6.n, new m3(null, new y26(this, (byte) 27)));
        lp6.a(op6Var, r0);
    }
}
