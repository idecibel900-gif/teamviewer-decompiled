package o;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 implements rl2 {
    public final e87 a;

    public bo1(e87 e87Var) {
        this.a = e87Var;
    }

    @Override // o.jo
    public final hc8 a(yn1 yn1Var) {
        xn1 xn1Var = new xn1(yn1Var, (byte) 2);
        e87 e87Var = this.a;
        float f = e87Var.a;
        float f2 = e87Var.b;
        Object obj = e87Var.c;
        return new l07(f, f2, obj == null ? null : (qo) xn1Var.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo1)) {
            return false;
        }
        return this.a.equals(((bo1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
