package o;

/* JADX INFO: loaded from: classes2.dex */
public final class oi3 extends jb8 {
    public final sy4 a;
    public final i07 b;

    public oi3(sy4 sy4Var, i07 i07Var) {
        i07Var.getClass();
        this.a = sy4Var;
        this.b = i07Var;
    }

    @Override // o.jb8
    public final boolean a(sy4 sy4Var) {
        return this.a.equals(sy4Var);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
