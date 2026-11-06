package o;

/* JADX INFO: loaded from: classes.dex */
public final class dl6 implements el6 {
    public final tx1 a;

    public dl6(tx1 tx1Var) {
        tx1Var.getClass();
        this.a = tx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl6) && im3.n(this.a, ((dl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchSelection(searchSelection=" + this.a + ")";
    }
}
