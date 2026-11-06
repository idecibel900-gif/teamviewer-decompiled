package o;

import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class x05 extends jp4 {
    @Override // o.jp4, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        pp4 pp4VarA = a(i, i2, i3, charSequence);
        j15 j15Var = new j15(this.a, this, pp4VarA);
        pp4VarA.f1761o = j15Var;
        j15Var.setHeaderTitle(pp4VarA.e);
        return j15Var;
    }
}
