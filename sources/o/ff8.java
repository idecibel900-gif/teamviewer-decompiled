package o;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ff8 implements ViewTreeObserver.OnPreDrawListener {
    public boolean m;
    public final /* synthetic */ s46 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f793o;
    public final /* synthetic */ gl0 p;

    public ff8(s46 s46Var, ViewTreeObserver viewTreeObserver, gl0 gl0Var) {
        this.n = s46Var;
        this.f793o = viewTreeObserver;
        this.p = gl0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s46 s46Var = this.n;
        w07 w07VarB = s46Var.b();
        if (w07VarB != null) {
            ViewTreeObserver viewTreeObserver = this.f793o;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                s46Var.b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.m) {
                this.m = true;
                this.p.resumeWith(w07VarB);
            }
        }
        return true;
    }
}
