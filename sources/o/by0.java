package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ my0 n;

    public /* synthetic */ by0(my0 my0Var, byte b) {
        this.m = b;
        this.n = my0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        my0 my0Var = this.n;
        switch (b) {
            case 0:
                my0.B(my0Var);
                break;
            default:
                my0Var.invalidateOptionsMenu();
                break;
        }
    }
}
