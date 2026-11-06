package o;

/* JADX INFO: loaded from: classes.dex */
public final class z43 {
    public final ma0 a;
    public final hr2 b;
    public final hr2 c;

    public z43(ma0 ma0Var, hr2 hr2Var, hr2 hr2Var2) {
        this.a = ma0Var;
        this.b = hr2Var;
        this.c = hr2Var2;
        if (ma0Var.b() == 0 && ma0Var.a() == 0) {
            hk0.g("Bounds must be non zero");
            throw null;
        }
        if (ma0Var.a == 0 || ma0Var.b == 0) {
            return;
        }
        hk0.g("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (z43.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            z43 z43Var = (z43) obj;
            return this.a.equals(z43Var.a) && this.b == z43Var.b && this.c == z43Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return z43.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
