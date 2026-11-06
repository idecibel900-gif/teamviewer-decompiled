package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qc6 extends i30 {
    public qc6(hc1 hc1Var) {
        super(hc1Var);
        if (hc1Var == null || hc1Var.getContext() == ba2.m) {
            return;
        }
        hk0.g("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // o.hc1
    public final de1 getContext() {
        return ba2.m;
    }
}
