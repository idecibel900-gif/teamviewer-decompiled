package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rd1 implements do4 {
    public final /* synthetic */ j64 a;
    public final /* synthetic */ pr7 b;
    public final /* synthetic */ mj8 c;
    public final /* synthetic */ me1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ zr7 f;
    public final /* synthetic */ v65 g;
    public final /* synthetic */ in1 h;
    public final /* synthetic */ hb0 i;
    public final /* synthetic */ int j;

    public rd1(j64 j64Var, pr7 pr7Var, mj8 mj8Var, me1 me1Var, Function1 function1, zr7 zr7Var, v65 v65Var, in1 in1Var, hb0 hb0Var, int i) {
        this.a = j64Var;
        this.b = pr7Var;
        this.c = mj8Var;
        this.d = me1Var;
        this.e = function1;
        this.f = zr7Var;
        this.g = v65Var;
        this.h = in1Var;
        this.i = hb0Var;
        this.j = i;
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        j64 j64Var = this.a;
        j64Var.a.a(((e45) bm3Var).G.M);
        yc4 yc4Var = (yc4) j64Var.a.g;
        if (yc4Var != null) {
            return v67.f(yc4Var.i());
        }
        hk0.l("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b3  */
    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        vs7 vs7Var;
        int iK;
        yc4 yc4Var;
        vs7 vs7Var2;
        vs7 vs7Var3;
        yc4 yc4Var2;
        rd1 rd1Var;
        j64 j64Var;
        us7 us7Var;
        j64 j64Var2 = this.a;
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            ws7 ws7VarD = j64Var2.d();
            el5.h(n47VarC, n47VarF, function1E);
            vs7 vs7Var4 = ws7VarD != null ? ws7VarD.a : null;
            kv1 kv1Var = j64Var2.a;
            j04 layoutDirection = fo4Var.getLayoutDirection();
            boolean z = kv1Var.a;
            int iV = Integer.MAX_VALUE;
            if (vs7Var4 != null) {
                xu4 xu4Var = vs7Var4.b;
                us7 us7Var2 = vs7Var4.a;
                xo xoVar = (xo) kv1Var.b;
                ot7 ot7Var = (ot7) kv1Var.c;
                List list2 = (List) kv1Var.f;
                in1 in1Var = (in1) kv1Var.d;
                mr2 mr2Var = (mr2) kv1Var.e;
                if (xu4Var.a.b()) {
                    vs7Var = vs7Var4;
                } else {
                    xo xoVar2 = us7Var2.a;
                    vs7 vs7Var5 = vs7Var4;
                    long j2 = us7Var2.j;
                    if (im3.n(xoVar2, xoVar) && us7Var2.b.d(ot7Var) && im3.n(us7Var2.c, list2) && us7Var2.d == Integer.MAX_VALUE && us7Var2.e == z && us7Var2.f == 1 && im3.n(us7Var2.g, in1Var) && us7Var2.h == layoutDirection && im3.n(us7Var2.i, mr2Var) && r61.k(j) == r61.k(j2) && (!z || (r61.i(j) == r61.i(j2) && r61.h(j) == r61.h(j2)))) {
                        vs7Var3 = new vs7(new us7(us7Var2.a, (ot7) kv1Var.c, us7Var2.c, us7Var2.d, us7Var2.e, us7Var2.f, us7Var2.g, us7Var2.h, us7Var2.i, j), xu4Var, t61.d(j, (((long) v67.f(xu4Var.e)) & 4294967295L) | (((long) v67.f(xu4Var.d)) << 32)));
                        vs7Var2 = vs7Var5;
                    } else {
                        vs7Var = vs7Var5;
                    }
                }
                kv1Var.a(layoutDirection);
                iK = r61.k(j);
                if (z && r61.e(j)) {
                    iV = r61.i(j);
                }
                if (iK != iV) {
                    yc4Var2 = (yc4) kv1Var.g;
                    if (yc4Var2 != null) {
                        hk0.l("layoutIntrinsics must be called first");
                        return null;
                    }
                    iV = ct1.v(v67.f(yc4Var2.i()), iK, iV);
                }
                yc4Var = (yc4) kv1Var.g;
                if (yc4Var != null) {
                    hk0.l("layoutIntrinsics must be called first");
                    return null;
                }
                xu4 xu4Var2 = new xu4(yc4Var, kh.t(0, iV, 0, r61.h(j)), Integer.MAX_VALUE, 1);
                vs7Var2 = vs7Var;
                vs7Var3 = new vs7(new us7((xo) kv1Var.b, (ot7) kv1Var.c, (List) kv1Var.f, Integer.MAX_VALUE, kv1Var.a, 1, (in1) kv1Var.d, layoutDirection, (mr2) kv1Var.e, j), xu4Var2, t61.d(j, (((long) v67.f(xu4Var2.d)) << 32) | (((long) v67.f(xu4Var2.e)) & 4294967295L)));
            } else {
                vs7Var = vs7Var4;
                kv1Var.a(layoutDirection);
                iK = r61.k(j);
                if (z) {
                    iV = r61.i(j);
                }
                if (iK != iV) {
                    yc4Var2 = (yc4) kv1Var.g;
                    if (yc4Var2 != null) {
                        hk0.l("layoutIntrinsics must be called first");
                        return null;
                    }
                    iV = ct1.v(v67.f(yc4Var2.i()), iK, iV);
                }
                yc4Var = (yc4) kv1Var.g;
                if (yc4Var != null) {
                    hk0.l("layoutIntrinsics must be called first");
                    return null;
                }
                xu4 xu4Var3 = new xu4(yc4Var, kh.t(0, iV, 0, r61.h(j)), Integer.MAX_VALUE, 1);
                vs7Var2 = vs7Var;
                vs7Var3 = new vs7(new us7((xo) kv1Var.b, (ot7) kv1Var.c, (List) kv1Var.f, Integer.MAX_VALUE, kv1Var.a, 1, (in1) kv1Var.d, layoutDirection, (mr2) kv1Var.e, j), xu4Var3, t61.d(j, (((long) v67.f(xu4Var3.d)) << 32) | (((long) v67.f(xu4Var3.e)) & 4294967295L)));
            }
            long j3 = vs7Var3.c;
            Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            xu4 xu4Var4 = vs7Var3.b;
            xu4Var4.a.b();
            vs7 vs7Var6 = vs7Var2;
            if (im3.n(vs7Var6, vs7Var3)) {
                rd1Var = this;
                j64Var = j64Var2;
            } else {
                j64Var = j64Var2;
                j64Var.i.setValue(new ws7(vs7Var3, ws7VarD != 0 ? ws7VarD.c : null));
                j64Var.p = false;
                rd1Var = this;
                pr7 pr7Var = rd1Var.b;
                if (pr7Var.i() && pr7Var.h() && ((n54) rd1Var.c).b() && gt7.c(((gt7) j64Var.A.getValue()).a) && gt7.c(((gt7) j64Var.B.getValue()).a) && j64Var.b()) {
                    if (!im3.n((vs7Var6 == null || (us7Var = vs7Var6.a) == null) ? null : us7Var.a, vs7Var3.a.a)) {
                        im3.R(rd1Var.d, null, null, new oa1(pr7Var, rd1Var.i, (hc1) null, (byte) 2), 3);
                    }
                }
                rd1Var.e.invoke(vs7Var3);
                ka0.y(j64Var, rd1Var.f, rd1Var.g);
            }
            j64Var.g.setValue(new w32(rd1Var.h.O(rd1Var.j == 1 ? v67.f(xu4Var4.b(0)) : 0)));
            return fo4Var.u(iIntValue, iIntValue2, xm4.R(new vd5(le.a, Integer.valueOf(Math.round(vs7Var3.d))), new vd5(le.b, Integer.valueOf(Math.round(vs7Var3.e)))), new h31((byte) 11));
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }
}
