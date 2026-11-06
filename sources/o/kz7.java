package o;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class kz7 implements iz7, hp4 {
    public final /* synthetic */ lz7 m;

    @Override // o.hp4
    public boolean a(jp4 jp4Var, MenuItem menuItem) {
        return false;
    }

    @Override // o.hp4
    public void h(jp4 jp4Var) {
        lz7 lz7Var = this.m;
        boolean zO = lz7Var.O.a.o();
        Window.Callback callback = lz7Var.P;
        if (zO) {
            callback.onPanelClosed(108, jp4Var);
        } else if (callback.onPreparePanel(0, null, jp4Var)) {
            callback.onMenuOpened(108, jp4Var);
        }
    }
}
