package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rx0 implements cj0 {
    public final /* synthetic */ byte m;
    public final tx0 n;

    public /* synthetic */ rx0(tx0 tx0Var, byte b) {
        this.m = b;
        this.n = tx0Var;
    }

    @Override // o.cj0
    public final void d(qi0 qi0Var, Throwable th) {
        byte b = this.m;
        tx0 tx0Var = this.n;
        switch (b) {
            case 0:
                tx0Var.completeExceptionally(th);
                break;
            default:
                tx0Var.completeExceptionally(th);
                break;
        }
    }

    @Override // o.cj0
    public final void e(qi0 qi0Var, kc6 kc6Var) {
        byte b = this.m;
        tx0 tx0Var = this.n;
        switch (b) {
            case 0:
                if (!kc6Var.a.B) {
                    tx0Var.completeExceptionally(new w83(kc6Var));
                } else {
                    tx0Var.complete(kc6Var.b);
                }
                break;
            default:
                tx0Var.complete(kc6Var);
                break;
        }
    }
}
