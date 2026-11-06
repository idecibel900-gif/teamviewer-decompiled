package o;

/* JADX INFO: loaded from: classes.dex */
public final class em4 implements qq4 {
    public qq4[] a;

    @Override // o.qq4
    public final w06 a(Class cls) {
        for (qq4 qq4Var : this.a) {
            if (qq4Var.b(cls)) {
                return qq4Var.a(cls);
            }
        }
        yq4.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // o.qq4
    public final boolean b(Class cls) {
        for (qq4 qq4Var : this.a) {
            if (qq4Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
