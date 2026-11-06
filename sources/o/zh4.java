package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh4 implements di4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ei4 b;

    public /* synthetic */ zh4(ei4 ei4Var, byte b) {
        this.a = b;
        this.b = ei4Var;
    }

    @Override // o.di4
    public final void run() {
        byte b = this.a;
        ei4 ei4Var = this.b;
        switch (b) {
            case 0:
                ei4Var.k();
                break;
            default:
                ei4Var.i();
                break;
        }
    }
}
