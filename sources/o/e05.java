package o;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class e05 extends jp4 {
    public final int A;
    public final Class z;

    public e05(Context context, Class cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // o.jp4
    public final pp4 a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size <= i4) {
            y();
            pp4 pp4VarA = super.a(i, i2, i3, charSequence);
            pp4VarA.f(true);
            x();
            return pp4VarA;
        }
        String simpleName = this.z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        hk0.g(e41.l(sb, simpleName, "#getMaxItemCount()"));
        return null;
    }

    @Override // o.jp4, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
