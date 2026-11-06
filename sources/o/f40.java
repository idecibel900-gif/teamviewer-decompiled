package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f40 {
    public final ViewGroup a;
    public final Context b;
    public final e40 c;
    public final SnackbarContentLayout d;
    public int e;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final AccessibilityManager l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f766o = {R.attr.snackbarStyle};
    public static final String p = f40.class.getSimpleName();
    public static final Handler n = new Handler(Looper.getMainLooper(), new x30());
    public final u30 f = new u30(this, 1);
    public final a40 m = new a40(this);

    public f40(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            hk0.g("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            hk0.g("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.a = viewGroup;
        this.d = snackbarContentLayout;
        this.b = context;
        xk0.o(context, xk0.x, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f766o);
        byte b = 0;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        e40 e40Var = (e40) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.c = e40Var;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = e40Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.n.setTextColor(wo1.R(actionTextColorAlpha, io1.d0(snackbarContentLayout2, R.attr.colorSurface), snackbarContentLayout2.n.getCurrentTextColor()));
            }
        }
        e40Var.addView(view);
        ViewGroup.LayoutParams layoutParams = e40Var.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        WeakHashMap weakHashMap = be8.a;
        e40Var.setAccessibilityLiveRegion(1);
        e40Var.setImportantForAccessibility(1);
        e40Var.setFitsSystemWindows(true);
        sd8.c(e40Var, new y30(this));
        be8.m(e40Var, new z30(this, b));
        this.l = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void a(int i) {
        pn5 pn5VarI = pn5.i();
        a40 a40Var = this.m;
        synchronized (pn5VarI.m) {
            try {
                if (pn5VarI.k(a40Var)) {
                    pn5VarI.e((y37) pn5VarI.f1752o, i);
                } else {
                    y37 y37Var = (y37) pn5VarI.p;
                    if (y37Var != null && y37Var.a.get() == a40Var) {
                        pn5VarI.e((y37) pn5VarI.p, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        pn5 pn5VarI = pn5.i();
        a40 a40Var = this.m;
        synchronized (pn5VarI.m) {
            try {
                if (pn5VarI.k(a40Var)) {
                    pn5VarI.f1752o = null;
                    if (((y37) pn5VarI.p) != null) {
                        pn5VarI.C();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final void c() {
        pn5 pn5VarI = pn5.i();
        a40 a40Var = this.m;
        synchronized (pn5VarI.m) {
            try {
                if (pn5VarI.k(a40Var)) {
                    pn5VarI.s((y37) pn5VarI.f1752o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        byte b = 0;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        e40 e40Var = this.c;
        if (z) {
            e40Var.post(new u30(this, b));
            return;
        }
        if (e40Var.getParent() != null) {
            e40Var.setVisibility(0);
        }
        c();
    }

    public final void e() {
        Rect rect;
        e40 e40Var = this.c;
        ViewGroup.LayoutParams layoutParams = e40Var.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.g) == null) {
            io.sentry.android.core.v0.j(p, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.h;
        marginLayoutParams.leftMargin = rect.left + this.i;
        marginLayoutParams.rightMargin = rect.right + this.j;
        e40Var.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.k <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = e40Var.getLayoutParams();
        if ((layoutParams2 instanceof cd1) && (((cd1) layoutParams2).a instanceof SwipeDismissBehavior)) {
            u30 u30Var = this.f;
            e40Var.removeCallbacks(u30Var);
            e40Var.post(u30Var);
        }
    }
}
