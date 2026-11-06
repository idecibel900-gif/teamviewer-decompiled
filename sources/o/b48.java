package o;

/* JADX INFO: loaded from: classes.dex */
public final class b48 implements ke5 {
    public final yu7 a;
    public final yu7 b;

    public b48(yu7 yu7Var, yu7 yu7Var2) {
        this.a = yu7Var;
        this.b = yu7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b48 b48Var = obj instanceof b48 ? (b48) obj : null;
        return b48Var != null && this.a == b48Var.a && this.b == b48Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
