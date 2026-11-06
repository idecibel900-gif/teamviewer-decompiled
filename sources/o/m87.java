package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class m87 extends p7 implements hp4 {
    public Context p;
    public ActionBarContextView q;
    public cj3 r;
    public WeakReference s;
    public boolean t;
    public jp4 u;

    @Override // o.hp4
    public final boolean a(jp4 jp4Var, MenuItem menuItem) {
        return ((pn5) this.r.n).m(this, menuItem);
    }

    @Override // o.p7
    public final void c() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.r.M(this);
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
        return this.u;
    }

    @Override // o.p7
    public final MenuInflater g() {
        return new xe7(this.q.getContext());
    }

    @Override // o.hp4
    public final void h(jp4 jp4Var) {
        k();
        l7 l7Var = this.q.p;
        if (l7Var != null) {
            l7Var.n();
        }
    }

    @Override // o.p7
    public final CharSequence i() {
        return this.q.getSubtitle();
    }

    @Override // o.p7
    public final CharSequence j() {
        return this.q.getTitle();
    }

    @Override // o.p7
    public final void k() {
        this.r.P(this, this.u);
    }

    @Override // o.p7
    public final boolean l() {
        return this.q.E;
    }

    @Override // o.p7
    public final void n(View view) {
        this.q.setCustomView(view);
        this.s = view != null ? new WeakReference(view) : null;
    }

    @Override // o.p7
    public final void o(int i) {
        p(this.p.getString(i));
    }

    @Override // o.p7
    public final void p(CharSequence charSequence) {
        this.q.setSubtitle(charSequence);
    }

    @Override // o.p7
    public final void q(int i) {
        r(this.p.getString(i));
    }

    @Override // o.p7
    public final void r(CharSequence charSequence) {
        this.q.setTitle(charSequence);
    }

    @Override // o.p7
    public final void s(boolean z) {
        this.n = z;
        this.q.setTitleOptional(z);
    }
}
