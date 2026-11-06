package o;

/* JADX INFO: loaded from: classes.dex */
public final class zk7 implements al7 {
    public final f62 a;

    public zk7(f62 f62Var) {
        f62Var.getClass();
        this.a = f62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk7) && im3.n(this.a, ((zk7) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Common(resource=" + this.a + ")";
    }
}
