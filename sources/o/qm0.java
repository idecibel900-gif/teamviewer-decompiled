package o;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class qm0 extends y18 {
    public boolean a = false;
    public final /* synthetic */ ViewGroup b;

    public qm0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // o.y18, o.r18
    public final void a() {
        f57.r(this.b, false);
    }

    @Override // o.y18, o.r18
    public final void b() {
        f57.r(this.b, false);
        this.a = true;
    }

    @Override // o.r18
    public final void c(s18 s18Var) {
        if (!this.a) {
            f57.r(this.b, false);
        }
        s18Var.v(this);
    }

    @Override // o.y18, o.r18
    public final void d() {
        f57.r(this.b, true);
    }
}
