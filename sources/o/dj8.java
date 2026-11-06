package o;

/* JADX INFO: loaded from: classes.dex */
public final class dj8 implements cq4 {
    public final x50 a;

    public dj8(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // o.cq4
    public final int a(zk3 zk3Var, long j, int i) {
        return this.a.a(i, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj8) && this.a.equals(((dj8) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ")";
    }
}
