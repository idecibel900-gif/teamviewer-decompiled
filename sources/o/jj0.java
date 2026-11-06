package o;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 extends p2 {
    public final /* synthetic */ kj0 m;

    public jj0(kj0 kj0Var) {
        this.m = kj0Var;
    }

    @Override // o.p2
    public final String pendingToString() {
        gj0 gj0Var = (gj0) this.m.m.get();
        if (gj0Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + gj0Var.a + "]";
    }
}
