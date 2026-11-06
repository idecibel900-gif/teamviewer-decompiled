package o;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class zb4 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ac4 a;

    public zb4(ac4 ac4Var) {
        this.a = ac4Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ac4 ac4Var = this.a;
        yb4 yb4Var = ac4Var.C;
        zs zsVar = ac4Var.K;
        if (i != 1 || zsVar.getInputMethodMode() == 2 || zsVar.getContentView() == null) {
            return;
        }
        ac4Var.G.removeCallbacks(yb4Var);
        yb4Var.run();
    }
}
