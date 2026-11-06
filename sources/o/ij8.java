package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ij8 extends p7 implements hp4 {
    public final Context p;
    public final jp4 q;
    public cj3 r;
    public WeakReference s;
    public final /* synthetic */ jj8 t;

    public ij8(jj8 jj8Var, Context context, cj3 cj3Var) {
        this.t = jj8Var;
        this.p = context;
        this.r = cj3Var;
        jp4 jp4Var = new jp4(context);
        jp4Var.l = true;
        this.q = jp4Var;
        jp4Var.e = this;
    }

    @Override // o.hp4
    public final boolean a(jp4 jp4Var, MenuItem menuItem) {
        cj3 cj3Var = this.r;
        if (cj3Var != null) {
            return ((pn5) cj3Var.n).m(this, menuItem);
        }
        return false;
    }

    @Override // o.p7
    public final void c() {
        jj8 jj8Var = this.t;
        if (jj8Var.W != this) {
            return;
        }
        if (jj8Var.d0) {
            jj8Var.X = this;
            jj8Var.Y = this.r;
        } else {
            this.r.M(this);
        }
        this.r = null;
        jj8Var.z0(false);
        ActionBarContextView actionBarContextView = jj8Var.T;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        jj8Var.Q.setHideOnContentScrollEnabled(jj8Var.i0);
        jj8Var.W = null;
    }

    @Override // o.p7
    public final View d() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.p7
    public final jp4 f() {
        return this.q;
    }

    @Override // o.p7
    public final MenuInflater g() {
        return new xe7(this.p);
    }

    @Override // o.hp4
    public final void h(jp4 jp4Var) {
        if (this.r == null) {
            return;
        }
        k();
        l7 l7Var = this.t.T.p;
        if (l7Var != null) {
            l7Var.n();
        }
    }

    @Override // o.p7
    public final CharSequence i() {
        return this.t.T.getSubtitle();
    }

    @Override // o.p7
    public final CharSequence j() {
        return this.t.T.getTitle();
    }

    @Override // o.p7
    public final void k() {
        if (this.t.W != this) {
            return;
        }
        jp4 jp4Var = this.q;
        jp4Var.y();
        try {
            this.r.P(this, jp4Var);
        } finally {
            jp4Var.x();
        }
    }

    @Override // o.p7
    public final boolean l() {
        return this.t.T.E;
    }

    @Override // o.p7
    public final void n(View view) {
        this.t.T.setCustomView(view);
        this.s = new WeakReference(view);
    }

    @Override // o.p7
    public final void o(int i) {
        p(this.t.O.getResources().getString(i));
    }

    @Override // o.p7
    public final void p(CharSequence charSequence) {
        this.t.T.setSubtitle(charSequence);
    }

    @Override // o.p7
    public final void q(int i) {
        r(this.t.O.getResources().getString(i));
    }

    @Override // o.p7
    public final void r(CharSequence charSequence) {
        this.t.T.setTitle(charSequence);
    }

    @Override // o.p7
    public final void s(boolean z) {
        this.n = z;
        this.t.T.setTitleOptional(z);
    }
}
