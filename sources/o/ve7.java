package o;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ve7 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] p = {MenuItem.class};
    public final /* synthetic */ byte m = 0;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2303o;

    public ve7(tp4 tp4Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2303o = tp4Var;
        this.n = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.m) {
            case 0:
                Object obj = this.n;
                Method method = (Method) this.f2303o;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    gk0.r(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.n).onMenuItemClick(((tp4) this.f2303o).j(menuItem));
        }
    }

    public /* synthetic */ ve7() {
    }
}
