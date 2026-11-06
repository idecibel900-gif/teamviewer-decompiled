package o;

/* JADX INFO: loaded from: classes2.dex */
public final class to1 implements m36 {
    public Object m;
    public final /* synthetic */ uo1 n;

    public to1(Object obj, uo1 uo1Var) {
        this.n = uo1Var;
        this.m = obj;
    }

    @Override // o.m36
    public final Object a(Object obj, fw3 fw3Var) {
        fw3Var.getClass();
        return this.m;
    }

    public final void b(Object obj, fw3 fw3Var) {
        fw3Var.getClass();
        if (this.n.a) {
            hk0.l("Cannot modify readonly DescriptorRendererOptions");
        } else {
            this.m = obj;
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.m + ')';
    }
}
