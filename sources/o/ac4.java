package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ac4 implements kz6 {
    public static final Method L;
    public static final Method M;
    public View A;
    public AdapterView.OnItemClickListener B;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final zs K;
    public final Context m;
    public ListAdapter n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o62 f313o;
    public int r;
    public int s;
    public boolean u;
    public boolean v;
    public boolean w;
    public pf1 z;
    public final int p = -2;
    public int q = -2;
    public final short t = 1002;
    public int x = 0;
    public final int y = Integer.MAX_VALUE;
    public final yb4 C = new yb4(this, (byte) 1);
    public final lo0 D = new lo0(this);
    public final zb4 E = new zb4(this);
    public final yb4 F = new yb4(this, (byte) 0);
    public final Rect H = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ac4(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.m = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zz5.f2743o, i, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.u = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        zs zsVar = new zs(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, zz5.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            zsVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        zsVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : uf0.p(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.K = zsVar;
        zsVar.setInputMethodMode(1);
    }

    @Override // o.kz6
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.r;
    }

    public final void c(int i) {
        this.r = i;
    }

    @Override // o.kz6
    public final void dismiss() {
        zs zsVar = this.K;
        zsVar.dismiss();
        zsVar.setContentView(null);
        this.f313o = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable f() {
        return this.K.getBackground();
    }

    @Override // o.kz6
    public final void g() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        o62 o62Var;
        o62 o62Var2 = this.f313o;
        byte b = 2;
        Context context = this.m;
        zs zsVar = this.K;
        if (o62Var2 == null) {
            o62 o62VarP = p(context, !this.J);
            this.f313o = o62VarP;
            o62VarP.setAdapter(this.n);
            this.f313o.setOnItemClickListener(this.B);
            this.f313o.setFocusable(true);
            this.f313o.setFocusableInTouchMode(true);
            this.f313o.setOnItemSelectedListener(new gc0(this, b));
            this.f313o.setOnScrollListener(this.E);
            zsVar.setContentView(this.f313o);
        }
        Drawable background = zsVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.u) {
                this.s = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = zsVar.getMaxAvailableHeight(this.A, this.s, zsVar.getInputMethodMode() == 2);
        int i3 = this.p;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.q;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA = this.f313o.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.f313o.getPaddingBottom() + this.f313o.getPaddingTop() + i : 0);
        }
        boolean z = zsVar.getInputMethodMode() == 2;
        zsVar.setWindowLayoutType(this.t);
        if (zsVar.isShowing()) {
            if (this.A.isAttachedToWindow()) {
                int width = this.q;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.A.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.q;
                    if (z) {
                        zsVar.setWidth(i5 == -1 ? -1 : 0);
                        zsVar.setHeight(0);
                    } else {
                        zsVar.setWidth(i5 == -1 ? -1 : 0);
                        zsVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                zsVar.setOutsideTouchable(true);
                View view = this.A;
                int i6 = this.r;
                int i7 = this.s;
                if (width < 0) {
                    width = -1;
                }
                zsVar.update(view, i6, i7, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.q;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.A.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        zsVar.setWidth(width2);
        zsVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(zsVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            eq.z(zsVar);
        }
        zsVar.setOutsideTouchable(true);
        zsVar.setTouchInterceptor(this.D);
        if (this.w) {
            zsVar.setOverlapAnchor(this.v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
            if (method2 != null) {
                try {
                    method2.invoke(zsVar, this.I);
                } catch (Exception e) {
                    io.sentry.android.core.v0.d("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            eq.y(zsVar, this.I);
        }
        zsVar.showAsDropDown(this.A, this.r, this.s, this.x);
        this.f313o.setSelection(-1);
        if ((!this.J || this.f313o.isInTouchMode()) && (o62Var = this.f313o) != null) {
            o62Var.setListSelectionHidden(true);
            o62Var.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    @Override // o.kz6
    public final o62 i() {
        return this.f313o;
    }

    public final void j(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.s = i;
        this.u = true;
    }

    public final int n() {
        if (this.u) {
            return this.s;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        pf1 pf1Var = this.z;
        if (pf1Var == null) {
            this.z = new pf1(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(pf1Var);
            }
        }
        this.n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.z);
        }
        o62 o62Var = this.f313o;
        if (o62Var != null) {
            o62Var.setAdapter(this.n);
        }
    }

    public o62 p(Context context, boolean z) {
        return new o62(context, z);
    }

    public final void q(int i) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.q = i;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.q = rect.left + rect.right + i;
    }
}
