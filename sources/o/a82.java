package o;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class a82 extends z72 {
    @Override // o.y72
    public void b(oh7 oh7Var, oh7 oh7Var2, Window window, View view, boolean z, boolean z2) {
        tk8 tk8Var;
        oh7Var.getClass();
        oh7Var2.getClass();
        window.getClass();
        view.getClass();
        n67.r(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        l07 l07Var = new l07(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            tk8Var = new vk8(window, l07Var, (byte) 1);
        } else {
            tk8Var = i >= 30 ? new tk8(window, l07Var, (byte) 1) : new tk8(window, l07Var, (byte) 0);
        }
        tk8Var.v(!z);
        tk8Var.u(!z2);
    }
}
