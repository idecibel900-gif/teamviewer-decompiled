package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class te7 extends ActionMode {
    public final Context a;
    public final p7 b;

    public te7(Context context, p7 p7Var) {
        this.a = context;
        this.b = p7Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new kq4(this.a, this.b.f());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.f1709o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.n;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.n(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.f1709o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.q(i);
    }
}
