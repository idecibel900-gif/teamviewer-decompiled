package o;

import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class og8 extends y18 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ hh2 d;

    public og8(hh2 hh2Var, ViewGroup viewGroup, View view, View view2) {
        this.d = hh2Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // o.y18, o.r18
    public final void a() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // o.r18
    public final void c(s18 s18Var) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        s18Var.v(this);
    }

    @Override // o.y18, o.r18
    public final void d() {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.d.cancel();
        }
    }
}
