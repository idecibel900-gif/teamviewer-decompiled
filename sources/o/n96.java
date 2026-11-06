package o;

/* JADX INFO: loaded from: classes.dex */
public final class n96 extends x67 {
    public final x67 a;
    public final int b;

    public n96(x67 x67Var, int i) {
        this.a = x67Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n96)) {
            return false;
        }
        n96 n96Var = (n96) obj;
        return n96Var.a.equals(this.a) && n96Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
