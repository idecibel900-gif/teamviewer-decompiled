package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rd8 implements View.OnApplyWindowInsetsListener {
    public sk8 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ f75 c;

    public rd8(View view, f75 f75Var) {
        this.b = view;
        this.c = f75Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        sk8 sk8VarG = sk8.g(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        f75 f75Var = this.c;
        if (i < 30) {
            sd8.a(windowInsets, this.b);
            if (sk8VarG.equals(this.a)) {
                return f75Var.t(view, sk8VarG).f();
            }
        }
        this.a = sk8VarG;
        sk8 sk8VarT = f75Var.t(view, sk8VarG);
        if (i >= 30) {
            return sk8VarT.f();
        }
        WeakHashMap weakHashMap = be8.a;
        view.requestApplyInsets();
        return sk8VarT.f();
    }
}
