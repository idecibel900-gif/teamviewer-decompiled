package o;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class am6 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ SearchView n;

    public /* synthetic */ am6(SearchView searchView, byte b) {
        this.m = b;
        this.n = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        SearchView searchView = this.n;
        switch (b) {
            case 0:
                searchView.t();
                break;
            default:
                qf1 qf1Var = searchView.e0;
                if (qf1Var instanceof pe7) {
                    qf1Var.b(null);
                }
                break;
        }
    }
}
