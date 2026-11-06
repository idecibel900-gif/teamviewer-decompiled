package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class aq4 extends ac4 implements op4 {
    public static final Method O;
    public xc0 N;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.op4
    public final void d(jp4 jp4Var, MenuItem menuItem) {
        xc0 xc0Var = this.N;
        if (xc0Var != null) {
            xc0Var.d(jp4Var, menuItem);
        }
    }

    @Override // o.ac4
    public final o62 p(Context context, boolean z) {
        zp4 zp4Var = new zp4(context, z);
        zp4Var.setHoverListener(this);
        return zp4Var;
    }

    @Override // o.op4
    public final void s(jp4 jp4Var, pp4 pp4Var) {
        xc0 xc0Var = this.N;
        if (xc0Var != null) {
            xc0Var.s(jp4Var, pp4Var);
        }
    }
}
