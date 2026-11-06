package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ru4 implements do4 {
    public final qu4 a;

    public ru4(qu4 qu4Var) {
        this.a = qu4Var;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        return this.a.a(bm3Var, it1.z(bm3Var), i);
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        return this.a.b(bm3Var, it1.z(bm3Var), i);
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        return this.a.c(fo4Var, it1.z(fo4Var), j);
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        return this.a.d(bm3Var, it1.z(bm3Var), i);
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        return this.a.e(bm3Var, it1.z(bm3Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru4) && im3.n(this.a, ((ru4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
