package o;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gj8 extends y57 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ jj8 d;

    public /* synthetic */ gj8(jj8 jj8Var, byte b) {
        this.c = b;
        this.d = jj8Var;
    }

    @Override // o.ef8
    public final void c() {
        View view;
        byte b = this.c;
        jj8 jj8Var = this.d;
        switch (b) {
            case 0:
                if (jj8Var.c0 && (view = jj8Var.U) != null) {
                    view.setTranslationY(0.0f);
                    jj8Var.R.setTranslationY(0.0f);
                }
                jj8Var.R.setVisibility(8);
                jj8Var.R.setTransitioning(false);
                jj8Var.g0 = null;
                cj3 cj3Var = jj8Var.Y;
                if (cj3Var != null) {
                    cj3Var.M(jj8Var.X);
                    jj8Var.X = null;
                    jj8Var.Y = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = jj8Var.Q;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = be8.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                jj8Var.g0 = null;
                jj8Var.R.requestLayout();
                break;
        }
    }
}
