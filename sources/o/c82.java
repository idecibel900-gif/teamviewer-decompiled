package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c82 extends b82 {
    @Override // o.a82, o.y72
    public void b(oh7 oh7Var, oh7 oh7Var2, Window window, View view, boolean z, boolean z2) {
        tk8 tk8Var;
        oh7Var.getClass();
        oh7Var2.getClass();
        window.getClass();
        view.getClass();
        n67.r(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof yv0)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        l07 l07Var = new l07(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            tk8Var = new vk8(window, l07Var, (byte) 1);
        } else {
            tk8Var = i3 >= 30 ? new tk8(window, l07Var, (byte) 1) : new tk8(window, l07Var, (byte) 0);
        }
        tk8Var.v(!z);
        tk8Var.u(!z2);
    }
}
