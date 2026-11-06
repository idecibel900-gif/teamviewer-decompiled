package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kw0 implements do4, ag6 {
    public final gw a;
    public final w50 b;

    public kw0(gw gwVar, w50 w50Var) {
        this.a = gwVar;
        this.b = w50Var;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        int iQ0 = bm3Var.q0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            zn4 zn4Var = (zn4) list.get(i2);
            float fG = yo1.G(yo1.C(zn4Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(zn4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zn4Var.k(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zn4 zn4Var2 = (zn4) list.get(i3);
            float fG2 = yo1.G(yo1.C(zn4Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, zn4Var2.k(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        int iQ0 = bm3Var.q0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            zn4 zn4Var = (zn4) list.get(i2);
            float fG = yo1.G(yo1.C(zn4Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(zn4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zn4Var.o(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zn4 zn4Var2 = (zn4) list.get(i3);
            float fG2 = yo1.G(yo1.C(zn4Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, zn4Var2.o(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        return ep1.x(this, r61.j(j), r61.k(j), r61.h(j), r61.i(j), fo4Var.q0(this.a.a()), fo4Var, list, new jl5[list.size()], 0, list.size(), null, 0);
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        int iQ0 = bm3Var.q0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zn4 zn4Var = (zn4) list.get(i3);
            float fG = yo1.G(yo1.C(zn4Var));
            int iA = zn4Var.a(i);
            if (fG == 0.0f) {
                i2 += iA;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iA / fG));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f) + i2;
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        int iQ0 = bm3Var.q0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zn4 zn4Var = (zn4) list.get(i3);
            float fG = yo1.G(yo1.C(zn4Var));
            int iV = zn4Var.V(i);
            if (fG == 0.0f) {
                i2 += iV;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iV / fG));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0)) {
            return false;
        }
        kw0 kw0Var = (kw0) obj;
        return im3.n(this.a, kw0Var.a) && this.b.equals(kw0Var.b);
    }

    @Override // o.ag6
    public final int f(jl5 jl5Var) {
        return jl5Var.m;
    }

    @Override // o.ag6
    public final void g(int i, int[] iArr, int[] iArr2, fo4 fo4Var) {
        this.a.b(fo4Var, i, iArr, iArr2);
    }

    @Override // o.ag6
    public final long h(int i, int i2, int i3, boolean z) {
        return !z ? t61.a(0, i3, i, i2) : kh.s(0, i3, i, i2);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // o.ag6
    public final int i(jl5 jl5Var) {
        return jl5Var.n;
    }

    @Override // o.ag6
    public final eo4 j(jl5[] jl5VarArr, fo4 fo4Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return fo4Var.u(i2, i, fa2.m, new jw0(jl5VarArr, this, i2, fo4Var, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
