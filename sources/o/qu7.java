package o;

/* JADX INFO: loaded from: classes.dex */
public final class qu7 {
    public final yu7 a;
    public final Object b;

    public qu7(yu7 yu7Var, Object obj) {
        this.a = yu7Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu7)) {
            return false;
        }
        qu7 qu7Var = (qu7) obj;
        return this.a == qu7Var.a && im3.n(this.b, qu7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "ThreePaneScaffoldDestinationItem(pane=" + this.a + ", contentKey=" + this.b + ")";
    }
}
