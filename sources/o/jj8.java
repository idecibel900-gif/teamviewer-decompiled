package o;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jj8 extends ck3 implements r6 {
    public static final AccelerateInterpolator m0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator n0 = new DecelerateInterpolator();
    public Context O;
    public Context P;
    public ActionBarOverlayLayout Q;
    public ActionBarContainer R;
    public fj1 S;
    public ActionBarContextView T;
    public final View U;
    public boolean V;
    public ij8 W;
    public ij8 X;
    public cj3 Y;
    public boolean Z;
    public final ArrayList a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public df8 g0;
    public boolean h0;
    public boolean i0;
    public final gj8 j0;
    public final gj8 k0;
    public final hj8 l0;

    public jj8(Activity activity, boolean z) {
        new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = 0;
        this.c0 = true;
        this.f0 = true;
        this.j0 = new gj8(this, (byte) 0);
        this.k0 = new gj8(this, (byte) 1);
        this.l0 = new hj8(this, (byte) 0);
        View decorView = activity.getWindow().getDecorView();
        A0(decorView);
        if (z) {
            return;
        }
        this.U = decorView.findViewById(R.id.content);
    }

    public final void A0(View view) {
        fj1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.decor_content_parent);
        this.Q = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.action_bar);
        if (callbackFindViewById instanceof fj1) {
            wrapper = (fj1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.S = wrapper;
        this.T = (ActionBarContextView) view.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.action_bar_container);
        this.R = actionBarContainer;
        fj1 fj1Var = this.S;
        if (fj1Var == null || this.T == null || actionBarContainer == null) {
            hk0.l(jj8.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((a08) fj1Var).a.getContext();
        this.O = context;
        if ((((a08) this.S).b & 4) != 0) {
            this.V = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.S.getClass();
        B0(context.getResources().getBoolean(com.teamviewer.teamviewer.market.mobile.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.O.obtainStyledAttributes(null, zz5.a, com.teamviewer.teamviewer.market.mobile.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Q;
            if (!actionBarOverlayLayout2.s) {
                hk0.l("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.i0 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.R;
            WeakHashMap weakHashMap = be8.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void B0(boolean z) {
        if (z) {
            this.R.setTabContainer(null);
            ((a08) this.S).getClass();
        } else {
            ((a08) this.S).getClass();
            this.R.setTabContainer(null);
        }
        this.S.getClass();
        ((a08) this.S).a.setCollapsible(false);
        this.Q.setHasNonEmbeddedTabs(false);
    }

    public final void C0(boolean z) {
        boolean z2 = this.e0 || !this.d0;
        boolean z3 = this.f0;
        final hj8 hj8Var = this.l0;
        View view = this.U;
        if (!z2) {
            if (z3) {
                this.f0 = false;
                df8 df8Var = this.g0;
                if (df8Var != null) {
                    df8Var.a();
                }
                int i = this.b0;
                gj8 gj8Var = this.j0;
                if (i != 0 || (!this.h0 && !z)) {
                    gj8Var.c();
                    return;
                }
                this.R.setAlpha(1.0f);
                this.R.setTransitioning(true);
                df8 df8Var2 = new df8();
                float f = -this.R.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.R.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                bf8 bf8VarA = be8.a(this.R);
                bf8VarA.e(f);
                final View view2 = (View) bf8VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(hj8Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.af8
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((jj8) hj8Var.n).R.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = df8Var2.e;
                ArrayList arrayList = df8Var2.a;
                if (!z4) {
                    arrayList.add(bf8VarA);
                }
                if (this.c0 && view != null) {
                    bf8 bf8VarA2 = be8.a(view);
                    bf8VarA2.e(f);
                    if (!df8Var2.e) {
                        arrayList.add(bf8VarA2);
                    }
                }
                boolean z5 = df8Var2.e;
                if (!z5) {
                    df8Var2.c = m0;
                }
                if (!z5) {
                    df8Var2.b = 250L;
                }
                if (!z5) {
                    df8Var2.d = gj8Var;
                }
                this.g0 = df8Var2;
                df8Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f0 = true;
        df8 df8Var3 = this.g0;
        if (df8Var3 != null) {
            df8Var3.a();
        }
        this.R.setVisibility(0);
        int i2 = this.b0;
        gj8 gj8Var2 = this.k0;
        if (i2 == 0 && (this.h0 || z)) {
            this.R.setTranslationY(0.0f);
            float f2 = -this.R.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.R.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.R.setTranslationY(f2);
            df8 df8Var4 = new df8();
            bf8 bf8VarA3 = be8.a(this.R);
            bf8VarA3.e(0.0f);
            final View view3 = (View) bf8VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(hj8Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.af8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((jj8) hj8Var.n).R.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = df8Var4.e;
            ArrayList arrayList2 = df8Var4.a;
            if (!z6) {
                arrayList2.add(bf8VarA3);
            }
            if (this.c0 && view != null) {
                view.setTranslationY(f2);
                bf8 bf8VarA4 = be8.a(view);
                bf8VarA4.e(0.0f);
                if (!df8Var4.e) {
                    arrayList2.add(bf8VarA4);
                }
            }
            boolean z7 = df8Var4.e;
            if (!z7) {
                df8Var4.c = n0;
            }
            if (!z7) {
                df8Var4.b = 250L;
            }
            if (!z7) {
                df8Var4.d = gj8Var2;
            }
            this.g0 = df8Var4;
            df8Var4.b();
        } else {
            this.R.setAlpha(1.0f);
            this.R.setTranslationY(0.0f);
            if (this.c0 && view != null) {
                view.setTranslationY(0.0f);
            }
            gj8Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.Q;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = be8.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // o.ck3
    public final void O(boolean z) {
        if (z == this.Z) {
            return;
        }
        this.Z = z;
        ArrayList arrayList = this.a0;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        io.sentry.h2.f();
    }

    @Override // o.ck3
    public final int R() {
        return ((a08) this.S).b;
    }

    @Override // o.ck3
    public final Context S() {
        Context context = this.P;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.O.getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.O, i);
            this.P = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.O;
        this.P = context2;
        return context2;
    }

    @Override // o.ck3
    public final void b0() {
        B0(this.O.getResources().getBoolean(com.teamviewer.teamviewer.market.mobile.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // o.ck3
    public final boolean d0(int i, KeyEvent keyEvent) {
        jp4 jp4Var;
        ij8 ij8Var = this.W;
        if (ij8Var == null || (jp4Var = ij8Var.q) == null) {
            return false;
        }
        jp4Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return jp4Var.performShortcut(i, keyEvent, 0);
    }

    @Override // o.ck3
    public final void l0() {
        this.R.setPrimaryBackground(null);
    }

    @Override // o.ck3
    public final void m0(boolean z) {
        if (this.V) {
            return;
        }
        n0(z);
    }

    @Override // o.ck3
    public final void n0(boolean z) {
        int i = z ? 4 : 0;
        a08 a08Var = (a08) this.S;
        int i2 = a08Var.b;
        this.V = true;
        a08Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // o.ck3
    public final void o0() {
        a08 a08Var = (a08) this.S;
        a08Var.a(a08Var.b & (-9));
    }

    @Override // o.ck3
    public final void p0() {
        a08 a08Var = (a08) this.S;
        Toolbar toolbar = a08Var.a;
        Drawable drawableP = uf0.p(toolbar.getContext(), 2131230828);
        a08Var.f = drawableP;
        if ((a08Var.b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableP == null) {
            drawableP = a08Var.f279o;
        }
        toolbar.setNavigationIcon(drawableP);
    }

    @Override // o.ck3
    public final void q0(boolean z) {
        df8 df8Var;
        this.h0 = z;
        if (z || (df8Var = this.g0) == null) {
            return;
        }
        df8Var.a();
    }

    @Override // o.ck3
    public final void r0(String str) {
        a08 a08Var = (a08) this.S;
        a08Var.g = true;
        Toolbar toolbar = a08Var.a;
        a08Var.h = str;
        if ((a08Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (a08Var.g) {
                be8.n(toolbar.getRootView(), str);
            }
        }
    }

    @Override // o.ck3
    public final void s0(CharSequence charSequence) {
        a08 a08Var = (a08) this.S;
        if (a08Var.g) {
            return;
        }
        Toolbar toolbar = a08Var.a;
        a08Var.h = charSequence;
        if ((a08Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (a08Var.g) {
                be8.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.ck3
    public final boolean t() {
        gz7 gz7Var;
        fj1 fj1Var = this.S;
        if (fj1Var == null || (gz7Var = ((a08) fj1Var).a.b0) == null || gz7Var.n == null) {
            return false;
        }
        gz7 gz7Var2 = ((a08) fj1Var).a.b0;
        pp4 pp4Var = gz7Var2 == null ? null : gz7Var2.n;
        if (pp4Var == null) {
            return true;
        }
        pp4Var.collapseActionView();
        return true;
    }

    @Override // o.ck3
    public final p7 t0(cj3 cj3Var) {
        ij8 ij8Var = this.W;
        if (ij8Var != null) {
            ij8Var.c();
        }
        this.Q.setHideOnContentScrollEnabled(false);
        this.T.e();
        ij8 ij8Var2 = new ij8(this, this.T.getContext(), cj3Var);
        jp4 jp4Var = ij8Var2.q;
        jp4Var.y();
        try {
            boolean zO = ((pn5) ij8Var2.r.n).o(ij8Var2, jp4Var);
            jp4Var.x();
            if (!zO) {
                return null;
            }
            this.W = ij8Var2;
            ij8Var2.k();
            this.T.c(ij8Var2);
            z0(true);
            return ij8Var2;
        } catch (Throwable th) {
            jp4Var.x();
            throw th;
        }
    }

    public final void z0(boolean z) {
        bf8 bf8VarJ;
        bf8 bf8VarJ2;
        boolean z2 = this.e0;
        if (z) {
            if (!z2) {
                this.e0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.Q;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                C0(false);
            }
        } else if (z2) {
            this.e0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Q;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            C0(false);
        }
        boolean zIsLaidOut = this.R.isLaidOut();
        fj1 fj1Var = this.S;
        if (!zIsLaidOut) {
            if (z) {
                ((a08) fj1Var).a.setVisibility(4);
                this.T.setVisibility(0);
                return;
            } else {
                ((a08) fj1Var).a.setVisibility(0);
                this.T.setVisibility(8);
                return;
            }
        }
        if (z) {
            a08 a08Var = (a08) fj1Var;
            bf8VarJ = be8.a(a08Var.a);
            bf8VarJ.a(0.0f);
            bf8VarJ.c(100L);
            bf8VarJ.d(new zz7(a08Var, 4));
            bf8VarJ2 = this.T.j(0, 200L);
        } else {
            a08 a08Var2 = (a08) fj1Var;
            bf8 bf8VarA = be8.a(a08Var2.a);
            bf8VarA.a(1.0f);
            bf8VarA.c(200L);
            bf8VarA.d(new zz7(a08Var2, 0));
            bf8VarJ = this.T.j(8, 100L);
            bf8VarJ2 = bf8VarA;
        }
        df8 df8Var = new df8();
        ArrayList arrayList = df8Var.a;
        arrayList.add(bf8VarJ);
        View view = (View) bf8VarJ.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) bf8VarJ2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(bf8VarJ2);
        df8Var.b();
    }

    public jj8(Dialog dialog) {
        new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = 0;
        this.c0 = true;
        this.f0 = true;
        this.j0 = new gj8(this, (byte) 0);
        this.k0 = new gj8(this, (byte) 1);
        this.l0 = new hj8(this, (byte) 0);
        A0(dialog.getWindow().getDecorView());
    }
}
