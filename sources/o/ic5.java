package o;

/* JADX INFO: loaded from: classes.dex */
public final class ic5 {
    public final long a;
    public final pd5 b;

    public ic5() {
        long j = j51.j(4284900966L);
        pd5 pd5VarI = ka0.i(3, 0.0f);
        this.a = j;
        this.b = pd5VarI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ic5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ic5 ic5Var = (ic5) obj;
        long j = ic5Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && this.b.equals(ic5Var.b);
    }

    public final int hashCode() {
        int i = rv0.i;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + rv0.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
