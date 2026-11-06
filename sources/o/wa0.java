package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 implements do4 {
    public final he a;
    public final boolean b;

    public wa0(he heVar, boolean z) {
        this.a = heVar;
        this.b = z;
    }

    @Override // o.do4
    public final eo4 c(final fo4 fo4Var, List list, long j) {
        int iK;
        int iJ;
        jl5 jl5VarC;
        boolean zIsEmpty = list.isEmpty();
        fa2 fa2Var = fa2.m;
        if (zIsEmpty) {
            return fo4Var.u(r61.k(j), r61.j(j), fa2Var, new px((byte) 10));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final zn4 zn4Var = (zn4) list.get(0);
            Object objE = zn4Var.E();
            sa0 sa0Var = objE instanceof sa0 ? (sa0) objE : null;
            if (sa0Var != null ? sa0Var.B : false) {
                iK = r61.k(j);
                iJ = r61.j(j);
                int iK2 = r61.k(j);
                int iJ2 = r61.j(j);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    mi3.a("width and height must be >= 0");
                }
                jl5VarC = zn4Var.C(t61.h(iK2, iK2, iJ2, iJ2));
            } else {
                jl5VarC = zn4Var.C(j2);
                iK = Math.max(r61.k(j), jl5VarC.m);
                iJ = Math.max(r61.j(j), jl5VarC.n);
            }
            final int i = iJ;
            final int i2 = iK;
            final jl5 jl5Var = jl5VarC;
            return fo4Var.u(i2, i, fa2Var, new Function1() { // from class: o.va0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ua0.d((il5) obj, jl5Var, zn4Var, fo4Var.getLayoutDirection(), i2, i, this.a);
                    return f88.a;
                }
            });
        }
        jl5[] jl5VarArr = new jl5[list.size()];
        i76 i76Var = new i76();
        i76Var.m = r61.k(j);
        i76 i76Var2 = new i76();
        i76Var2.m = r61.j(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            zn4 zn4Var2 = (zn4) list.get(i3);
            Object objE2 = zn4Var2.E();
            sa0 sa0Var2 = objE2 instanceof sa0 ? (sa0) objE2 : null;
            if (sa0Var2 != null ? sa0Var2.B : false) {
                z = true;
            } else {
                jl5 jl5VarC2 = zn4Var2.C(j2);
                jl5VarArr[i3] = jl5VarC2;
                i76Var.m = Math.max(i76Var.m, jl5VarC2.m);
                i76Var2.m = Math.max(i76Var2.m, jl5VarC2.n);
            }
        }
        if (z) {
            int i4 = i76Var.m;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = i76Var2.m;
            long jA = t61.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                zn4 zn4Var3 = (zn4) list.get(i7);
                Object objE3 = zn4Var3.E();
                sa0 sa0Var3 = objE3 instanceof sa0 ? (sa0) objE3 : null;
                if (sa0Var3 != null ? sa0Var3.B : false) {
                    jl5VarArr[i7] = zn4Var3.C(jA);
                }
            }
        }
        return fo4Var.u(i76Var.m, i76Var2.m, fa2Var, new w80(jl5VarArr, list, fo4Var, i76Var, i76Var2, this, (byte) 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return im3.n(this.a, wa0Var.a) && this.b == wa0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
