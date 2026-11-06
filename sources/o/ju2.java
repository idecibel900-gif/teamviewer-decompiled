package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class ju2 implements hq4 {
    public final /* synthetic */ su2 m;

    public ju2(su2 su2Var) {
        this.m = su2Var;
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        return this.m.q(menuItem);
    }

    @Override // o.hq4
    public final void s(Menu menu) {
        this.m.r();
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        this.m.l(menu, menuInflater);
    }

    @Override // o.hq4
    public final void x(Menu menu) {
        this.m.u();
    }
}
