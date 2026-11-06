package o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fz7 implements o7, hp4 {
    public final /* synthetic */ Toolbar m;

    public /* synthetic */ fz7(Toolbar toolbar) {
        this.m = toolbar;
    }

    @Override // o.hp4
    public boolean a(jp4 jp4Var, MenuItem menuItem) {
        return false;
    }

    @Override // o.hp4
    public void h(jp4 jp4Var) {
        Toolbar toolbar = this.m;
        l7 l7Var = toolbar.m.F;
        if (l7Var == null || !l7Var.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.f733o).iterator();
            while (it.hasNext()) {
                ((hq4) it.next()).x(jp4Var);
            }
        }
        kz7 kz7Var = toolbar.d0;
        if (kz7Var != null) {
            kz7Var.h(jp4Var);
        }
    }
}
