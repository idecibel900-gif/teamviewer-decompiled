package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n22 extends es4 implements t52 {
    public m34 A;

    @Override // o.es4
    public final void M0() {
        this.A.j = this;
    }

    @Override // o.es4
    public final void N0() {
        m34 m34Var = this.A;
        m34Var.d();
        m34Var.b = null;
        m34Var.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n22) && im3.n(this.A, ((n22) obj).A);
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        nl0 nl0Var = d14Var.m;
        ArrayList arrayList = this.A.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i34 i34Var = (i34) arrayList.get(i);
            l03 l03Var = i34Var.f1031o;
            if (l03Var != null) {
                long j = i34Var.m;
                long j2 = l03Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((xc0) nl0Var.n.f1103o).V(f, f2);
                try {
                    qs1.J(d14Var, l03Var);
                    ((xc0) nl0Var.n.f1103o).V(-f, -f2);
                } catch (Throwable th) {
                    ((xc0) nl0Var.n.f1103o).V(-f, -f2);
                    throw th;
                }
            }
        }
        d14Var.a();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.A + ")";
    }
}
