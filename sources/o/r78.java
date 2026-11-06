package o;

/* JADX INFO: loaded from: classes2.dex */
public final class r78 extends fe1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r78 f1901o = new r78();

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        fo8 fo8Var = (fo8) de1Var.l0(fo8.f819o);
        if (fo8Var != null) {
            fo8Var.n = true;
        } else {
            yq4.r("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o.fe1
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
