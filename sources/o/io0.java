package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class io0 implements View.OnLayoutChangeListener {
    public final go0 m;
    public final /* synthetic */ po0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f1083o;

    public io0(LinearLayoutManager linearLayoutManager, po0 po0Var) {
        this.n = po0Var;
        this.f1083o = linearLayoutManager;
        this.m = new go0(po0Var, (byte) 1);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerView;
        view.getClass();
        po0 po0Var = this.n;
        RecyclerView recyclerView2 = po0Var.t;
        boolean z = true;
        if ((recyclerView2 == null || !recyclerView2.canScrollVertically(1)) && ((recyclerView = po0Var.t) == null || !recyclerView.canScrollVertically(-1))) {
            z = false;
        }
        LinearLayoutManager linearLayoutManager = this.f1083o;
        if (linearLayoutManager == null || linearLayoutManager.H != z) {
            if (linearLayoutManager != null) {
                linearLayoutManager.k1(z);
            }
            RecyclerView recyclerView3 = po0Var.t;
            if (recyclerView3 != null) {
                recyclerView3.post(this.m);
            }
        }
    }
}
