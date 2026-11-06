package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class gd7 extends jp4 implements SubMenu {
    public final pp4 A;
    public final jp4 z;

    public gd7(Context context, jp4 jp4Var, pp4 pp4Var) {
        super(context);
        this.z = jp4Var;
        this.A = pp4Var;
    }

    @Override // o.jp4
    public final boolean d(pp4 pp4Var) {
        return this.z.d(pp4Var);
    }

    @Override // o.jp4
    public final boolean e(jp4 jp4Var, MenuItem menuItem) {
        return super.e(jp4Var, menuItem) || this.z.e(jp4Var, menuItem);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.jp4
    public final boolean h(pp4 pp4Var) {
        return this.z.h(pp4Var);
    }

    @Override // o.jp4
    public final String l() {
        pp4 pp4Var = this.A;
        int i = pp4Var != null ? pp4Var.a : 0;
        if (i == 0) {
            return null;
        }
        return fx3.e(i, "android:menu:actionviewstates:");
    }

    @Override // o.jp4
    public final jp4 m() {
        return this.z.m();
    }

    @Override // o.jp4
    public final boolean o() {
        return this.z.o();
    }

    @Override // o.jp4
    public final boolean p() {
        return this.z.p();
    }

    @Override // o.jp4
    public final boolean q() {
        return this.z.q();
    }

    @Override // o.jp4, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // o.jp4, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }
}
