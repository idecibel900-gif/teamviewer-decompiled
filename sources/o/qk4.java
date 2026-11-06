package o;

/* JADX INFO: loaded from: classes.dex */
public final class qk4 extends f8 {
    public final g8 a;

    public qk4(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // o.f8
    public final void a(Object obj, df6 df6Var) {
        k8 k8Var = this.a.a;
        if (k8Var != null) {
            k8Var.a(obj, df6Var);
        } else {
            hk0.l("Launcher has not been initialized");
        }
    }
}
