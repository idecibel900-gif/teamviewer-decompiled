package o;

/* JADX INFO: loaded from: classes.dex */
public final class om2 implements Comparable {
    public int m;
    public int n;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        om2 om2Var = (om2) obj;
        int i = this.n;
        int i2 = om2Var.n;
        return i != i2 ? i - i2 : this.m - om2Var.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.n);
        sb.append(", index=");
        return e41.j(sb, this.m, '}');
    }
}
