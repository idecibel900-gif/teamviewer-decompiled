package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class f37 extends f40 {
    public static final int[] s = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager q;
    public boolean r;

    public f37(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static f37 f(View view, int i, int i2) {
        return g(view, view.getResources().getText(i), i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static f37 g(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            hk0.g("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(s);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        f37 f37Var = new f37(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) f37Var.c.getChildAt(0)).getMessageView().setText(charSequence);
        f37Var.e = i;
        return f37Var;
    }

    public final void h(int i, View.OnClickListener onClickListener) {
        CharSequence text = this.b.getText(i);
        Button actionView = ((SnackbarContentLayout) this.c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.r = false;
        } else {
            this.r = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new e37(this, onClickListener));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public final void i() {
        pn5 pn5VarI = pn5.i();
        AccessibilityManager accessibilityManager = this.q;
        int recommendedTimeoutMillis = this.e;
        boolean z = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = this.r;
            if (i >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (z2 ? 4 : 0) | 3);
            } else if (z2 && accessibilityManager.isTouchExplorationEnabled()) {
                recommendedTimeoutMillis = -2;
            }
        }
        a40 a40Var = this.m;
        synchronized (pn5VarI.m) {
            try {
                if (pn5VarI.k(a40Var)) {
                    y37 y37Var = (y37) pn5VarI.f1752o;
                    y37Var.b = recommendedTimeoutMillis;
                    ((Handler) pn5VarI.n).removeCallbacksAndMessages(y37Var);
                    pn5VarI.s((y37) pn5VarI.f1752o);
                    return;
                }
                y37 y37Var2 = (y37) pn5VarI.p;
                if (y37Var2 != null && y37Var2.a.get() == a40Var) {
                    z = true;
                }
                if (z) {
                    ((y37) pn5VarI.p).b = recommendedTimeoutMillis;
                } else {
                    pn5VarI.p = new y37(recommendedTimeoutMillis, a40Var);
                }
                y37 y37Var3 = (y37) pn5VarI.f1752o;
                if (y37Var3 == null || !pn5VarI.e(y37Var3, 4)) {
                    pn5VarI.f1752o = null;
                    pn5VarI.C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
