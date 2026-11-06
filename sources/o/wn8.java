package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class wn8 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final sn8 a(u0 u0Var, c01 c01Var, yy0 yy0Var) {
        AndroidComposeView androidComposeView;
        sn8 sn8Var;
        Object[] objArr = 0;
        if (mz2.a.compareAndSet(false, true)) {
            kf0 kf0VarD = ka0.d(1, 6, null);
            im3.R(hm3.c((de1) kl.y.getValue()), null, null, new ko2(kf0VarD, objArr == true ? 1 : 0, (byte) 2), 3);
            a81 a81Var = new a81(kf0VarD, (byte) 20);
            synchronized (v47.c) {
                v47.i = lv0.B0(v47.i, a81Var);
            }
            v47.c();
        }
        if (u0Var.getChildCount() > 0) {
            View childAt = u0Var.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(c01Var);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(u0Var.getContext(), c01Var);
                u0Var.addView(androidComposeView.getView(), a);
            }
            androidComposeView.setComposeViewContext(c01Var);
            if (u0Var.getComposeViewContext$ui() != null) {
                c01Var.e();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
            sn8Var = tag instanceof sn8 ? (sn8) tag : null;
            if (sn8Var == null) {
                sn8Var = new sn8(androidComposeView, new s01(c01Var.c(), new l78(androidComposeView.getRoot())));
                androidComposeView.setTag(R.id.wrapped_composition_tag, sn8Var);
            }
            sn8Var.b(yy0Var);
            androidComposeView.setFrameEndScheduler$ui(new vn8(c01Var.c()));
            return sn8Var;
        }
        u0Var.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(u0Var.getContext(), c01Var);
            u0Var.addView(androidComposeView.getView(), a);
        }
        androidComposeView.setComposeViewContext(c01Var);
        if (u0Var.getComposeViewContext$ui() != null) {
            c01Var.e();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof sn8) {
        }
        if (sn8Var == null) {
            sn8Var = new sn8(androidComposeView, new s01(c01Var.c(), new l78(androidComposeView.getRoot())));
            androidComposeView.setTag(R.id.wrapped_composition_tag, sn8Var);
        }
        sn8Var.b(yy0Var);
        androidComposeView.setFrameEndScheduler$ui(new vn8(c01Var.c()));
        return sn8Var;
    }
}
