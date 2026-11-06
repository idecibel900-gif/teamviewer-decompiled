package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class td8 {
    public static sk8 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        sk8 sk8VarG = sk8.g(rootWindowInsets, null);
        pk8 pk8Var = sk8VarG.a;
        pk8Var.y(sk8VarG);
        View rootView = view.getRootView();
        pk8Var.d(rootView);
        pk8Var.p(rootView);
        pk8Var.q();
        return sk8VarG;
    }
}
