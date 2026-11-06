package o;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ef8 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public k(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // o.ef8
    public final void a() {
        this.a = true;
    }

    @Override // o.ef8
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    @Override // o.ef8
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.r = null;
        super/*android.view.View*/.setVisibility(this.b);
    }
}
