package o;

/* JADX INFO: loaded from: classes2.dex */
public final class k24 {
    public final sy4 a;
    public final a86 b;

    public k24(sy4 sy4Var, a86 a86Var) {
        sy4Var.getClass();
        this.a = sy4Var;
        this.b = a86Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k24) {
            return im3.n(this.a, ((k24) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
