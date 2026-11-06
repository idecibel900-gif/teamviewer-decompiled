package o;

/* JADX INFO: loaded from: classes.dex */
public final class cj8 implements bq4 {
    public final u50 a;

    public cj8(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // o.bq4
    public final int a(zk3 zk3Var, long j, int i, j04 j04Var) {
        return this.a.a(i, (int) (j >> 32), j04Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj8) && this.a.equals(((cj8) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ")";
    }
}
