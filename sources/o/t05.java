package o;

/* JADX INFO: loaded from: classes.dex */
public final class t05 extends nv1 {
    public final m05 e;

    public t05(m05 m05Var) {
        m05Var.getClass();
        this.e = m05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t05.class == obj.getClass() && im3.n(this.e, ((t05) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.e + ", direction=-1)";
    }
}
