package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p08 implements do4 {
    public final jn2 a;
    public final w50 b;
    public final float c;
    public final nd5 d;

    public p08(jn2 jn2Var, w50 w50Var, float f, nd5 nd5Var) {
        this.a = jn2Var;
        this.b = w50Var;
        this.c = f;
        this.d = nd5Var;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        int size = list.size();
        int iK = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iK += ((zn4) list.get(i2)).k(i);
        }
        return iK;
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        int size = list.size();
        int iO = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO += ((zn4) list.get(i2)).o(i);
        }
        return iO;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, final long j) {
        int i;
        int i2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zn4 zn4Var = (zn4) list.get(i3);
            if (im3.n(hm3.p(zn4Var), "navigationIcon")) {
                final jl5 jl5VarC = zn4Var.C(r61.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    zn4 zn4Var2 = (zn4) list.get(i4);
                    if (im3.n(hm3.p(zn4Var2), "actionIcons")) {
                        final jl5 jl5VarC2 = zn4Var2.C(r61.b(j, 0, 0, 0, 0, 14));
                        j04 layoutDirection = fo4Var.getLayoutDirection();
                        nd5 nd5Var = this.d;
                        float fP = ka0.p(nd5Var, layoutDirection);
                        float fO = ka0.o(nd5Var, fo4Var.getLayoutDirection());
                        int iMax = Math.max(fo4Var.q0(qr.c), jl5VarC.m);
                        if (r61.i(j) == Integer.MAX_VALUE) {
                            i = r61.i(j);
                        } else {
                            int i5 = (((r61.i(j) - iMax) - jl5VarC2.m) - fo4Var.q0(fP)) - fo4Var.q0(fO);
                            i = i5 < 0 ? 0 : i5;
                        }
                        int i6 = i;
                        int size3 = list.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            zn4 zn4Var3 = (zn4) list.get(i7);
                            if (im3.n(hm3.p(zn4Var3), "title")) {
                                final jl5 jl5VarC3 = zn4Var3.C(r61.b(j, 0, i6, 0, 0, 12));
                                b63 b63Var = le.b;
                                final int iW = jl5VarC3.W(b63Var) != Integer.MIN_VALUE ? jl5VarC3.W(b63Var) : 0;
                                float fA = this.a.a();
                                int iS0 = Float.isNaN(fA) ? 0 : vn4.s0(fA);
                                final int iMax2 = Math.max(fo4Var.q0(this.c), jl5VarC3.n) + fo4Var.q0(nd5Var.d()) + fo4Var.q0(nd5Var.c());
                                if (r61.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax2;
                                } else {
                                    int i8 = iS0 + iMax2;
                                    i2 = i8 >= 0 ? i8 : 0;
                                }
                                int iQ0 = fo4Var.q0(nd5Var.d());
                                int iQ1 = fo4Var.q0(nd5Var.c());
                                final int iQ2 = fo4Var.q0(ka0.p(nd5Var, fo4Var.getLayoutDirection()));
                                final int iQ3 = fo4Var.q0(ka0.o(nd5Var, fo4Var.getLayoutDirection()));
                                final int i9 = (iQ0 + i2) - iQ1;
                                return fo4Var.u(r61.i(j), i2, fa2.m, new Function1(iQ2, i9, jl5VarC3, jl5VarC2, j, iQ3, this, iW, iMax2) { // from class: o.o08
                                    public final /* synthetic */ int n;

                                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                                    public final /* synthetic */ int f1618o;
                                    public final /* synthetic */ jl5 p;
                                    public final /* synthetic */ jl5 q;
                                    public final /* synthetic */ long r;
                                    public final /* synthetic */ int s;
                                    public final /* synthetic */ p08 t;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i10;
                                        il5 il5Var = (il5) obj;
                                        jl5 jl5Var = this.m;
                                        int i11 = jl5Var.n;
                                        int i12 = this.f1618o;
                                        int i13 = this.n;
                                        il5.k(il5Var, jl5Var, i13, (i12 - i11) / 2);
                                        int iMax3 = Math.max(il5Var.q0(qr.c), jl5Var.m);
                                        jl5 jl5Var2 = this.q;
                                        int i14 = jl5Var2.m;
                                        w50 w50Var = this.t.b;
                                        jl5 jl5Var3 = this.p;
                                        int i15 = jl5Var3.m;
                                        long j2 = this.r;
                                        int iA = w50Var.a(i15, r61.i(j2), j04.m);
                                        if (iA >= iMax3) {
                                            if (jl5Var3.m + iA > r61.i(j2) - i14) {
                                                i10 = (r61.i(j2) - i14) - (jl5Var3.m + iA);
                                            }
                                            il5.k(il5Var, jl5Var3, iA, (i12 - jl5Var3.n) / 2);
                                            il5.k(il5Var, jl5Var2, (r61.i(j2) - jl5Var2.m) - this.s, (i12 - jl5Var2.n) / 2);
                                            return f88.a;
                                        }
                                        i10 = iMax3 - iA;
                                        iA += i10 + i13;
                                        il5.k(il5Var, jl5Var3, iA, (i12 - jl5Var3.n) / 2);
                                        il5.k(il5Var, jl5Var2, (r61.i(j2) - jl5Var2.m) - this.s, (i12 - jl5Var2.n) / 2);
                                        return f88.a;
                                    }
                                });
                            }
                            i7++;
                            this = this;
                        }
                        gc4.b("Collection contains no element matching the predicate.");
                        hk0.b();
                        return null;
                    }
                    i4++;
                    this = this;
                }
                gc4.b("Collection contains no element matching the predicate.");
                hk0.b();
                return null;
            }
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return null;
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        int iQ0 = bm3Var.q0(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iQ0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        int iQ0 = bm3Var.q0(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).V(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iQ0, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
