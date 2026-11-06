package o;

/* JADX INFO: loaded from: classes.dex */
public final class w07 {
    public static final w07 c;
    public final j12 a;
    public final j12 b;

    static {
        h12 h12Var = h12.a;
        c = new w07(h12Var, h12Var);
    }

    public w07(j12 j12Var, j12 j12Var2) {
        this.a = j12Var;
        this.b = j12Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w07)) {
            return false;
        }
        w07 w07Var = (w07) obj;
        return this.a.equals(w07Var.a) && this.b.equals(w07Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
