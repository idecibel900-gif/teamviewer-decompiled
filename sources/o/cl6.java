package o;

/* JADX INFO: loaded from: classes.dex */
public final class cl6 implements el6 {
    public final z31 a;

    public cl6(z31 z31Var) {
        z31Var.getClass();
        this.a = z31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl6) && im3.n(this.a, ((cl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Connectable(item=" + this.a + ")";
    }
}
