package o;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uj8 extends WindowInsetsAnimation$Callback {
    public final uu0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public uj8(uu0 uu0Var) {
        super(uu0Var.m);
        this.d = new HashMap();
        this.a = uu0Var;
    }

    public final xj8 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        xj8 xj8Var = (xj8) map.get(windowInsetsAnimation);
        if (xj8Var != null) {
            return xj8Var;
        }
        xj8 xj8Var2 = new xj8(0, null, 0L);
        xj8Var2.a = new vj8(windowInsetsAnimation);
        map.put(windowInsetsAnimation, xj8Var2);
        return xj8Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.f(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.g(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = zc8.j(list.get(size));
            xj8 xj8VarA = a(windowInsetsAnimationJ);
            xj8VarA.a.e(windowInsetsAnimationJ.getFraction());
            this.c.add(xj8VarA);
        }
        return this.a.h(sk8.g(windowInsets, null), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        lh7 lh7VarI = this.a.i(a(windowInsetsAnimation), new lh7(bounds));
        lh7VarI.getClass();
        zc8.m();
        return zc8.h(((nj3) lh7VarI.n).d(), ((nj3) lh7VarI.f1364o).d());
    }
}
