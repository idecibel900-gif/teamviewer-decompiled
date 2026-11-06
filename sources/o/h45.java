package o;

/* JADX INFO: loaded from: classes2.dex */
public final class h45 extends i45 {
    public final Class a;
    public final String b;

    public h45(Class cls, String str) {
        this.a = cls;
        this.b = "::".concat(str);
    }

    @Override // o.td2
    public final int a() {
        return 1;
    }

    @Override // o.i45
    public final boolean g(x35 x35Var) {
        return this.a.isInstance(x35Var);
    }

    public final String toString() {
        return this.b;
    }
}
