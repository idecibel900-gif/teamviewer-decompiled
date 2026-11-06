package o;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez7 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Toolbar n;

    public /* synthetic */ ez7(Toolbar toolbar, byte b) {
        this.m = b;
        this.n = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Toolbar toolbar = this.n;
        switch (b) {
            case 0:
                gz7 gz7Var = toolbar.b0;
                pp4 pp4Var = gz7Var == null ? null : gz7Var.n;
                if (pp4Var != null) {
                    pp4Var.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
