package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ls implements Window.Callback {
    public final Window.Callback m;
    public kz7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1399o;
    public boolean p;
    public boolean q;
    public final /* synthetic */ qs r;

    public ls(qs qsVar, Window.Callback callback) {
        this.r = qsVar;
        if (callback != null) {
            this.m = callback;
        } else {
            hk0.g("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1399o = true;
            callback.onContentChanged();
        } finally {
            this.f1399o = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.m.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.m.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.m.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.m.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.p;
        Window.Callback callback = this.m;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.r.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.m.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            qs qsVar = this.r;
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            if (ck3Var == null || !ck3Var.d0(keyCode, keyEvent)) {
                ps psVar = qsVar.W;
                if (psVar == null || !qsVar.F(psVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (qsVar.W == null) {
                        ps psVarZ = qsVar.z(0);
                        qsVar.G(psVarZ, keyEvent);
                        boolean zF = qsVar.F(psVarZ, keyEvent.getKeyCode(), keyEvent);
                        psVarZ.k = false;
                        if (zF) {
                        }
                    }
                    return false;
                }
                ps psVar2 = qsVar.W;
                if (psVar2 != null) {
                    psVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.m.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.m.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.m.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.m.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.m.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1399o) {
            this.m.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof jp4)) {
            return this.m.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        kz7 kz7Var = this.n;
        if (kz7Var != null) {
            View view = i == 0 ? new View(kz7Var.m.O.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.m.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.m.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.m.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            qs qsVar = this.r;
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            if (ck3Var != null) {
                ck3Var.O(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.q) {
            this.m.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        qs qsVar = this.r;
        if (i == 108) {
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            if (ck3Var != null) {
                ck3Var.O(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ps psVarZ = qsVar.z(i);
            if (psVarZ.m) {
                qsVar.s(psVarZ, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.m.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        jp4 jp4Var = menu instanceof jp4 ? (jp4) menu : null;
        if (i == 0 && jp4Var == null) {
            return false;
        }
        if (jp4Var != null) {
            jp4Var.x = true;
        }
        kz7 kz7Var = this.n;
        if (kz7Var != null && i == 0) {
            lz7 lz7Var = kz7Var.m;
            if (!lz7Var.R) {
                lz7Var.O.l = true;
                lz7Var.R = true;
            }
        }
        boolean zOnPreparePanel = this.m.onPreparePanel(i, view, menu);
        if (jp4Var != null) {
            jp4Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        jp4 jp4Var = this.r.z(0).h;
        if (jp4Var != null) {
            d(list, jp4Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.m.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.m.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.m.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        qs qsVar = this.r;
        Context context = qsVar.w;
        if (i != 0) {
            return this.m.onWindowStartingActionMode(callback, i);
        }
        pn5 pn5Var = new pn5();
        pn5Var.n = context;
        pn5Var.m = callback;
        pn5Var.f1752o = new ArrayList();
        pn5Var.p = new a07(0);
        p7 p7Var = qsVar.F;
        if (p7Var != null) {
            p7Var.c();
        }
        cj3 cj3Var = new cj3(qsVar, pn5Var);
        qsVar.A();
        ck3 ck3Var = qsVar.z;
        if (ck3Var != null) {
            qsVar.F = ck3Var.t0(cj3Var);
        }
        if (qsVar.F == null) {
            bf8 bf8Var = qsVar.J;
            if (bf8Var != null) {
                bf8Var.b();
            }
            p7 p7Var2 = qsVar.F;
            if (p7Var2 != null) {
                p7Var2.c();
            }
            byte b = 1;
            if (qsVar.G == null) {
                if (qsVar.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        gc1 gc1Var = new gc1(context, 0);
                        gc1Var.getTheme().setTo(themeNewTheme);
                        context = gc1Var;
                    }
                    qsVar.G = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    qsVar.H = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    qsVar.H.setContentView(qsVar.G);
                    qsVar.H.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    qsVar.G.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    qsVar.H.setHeight(-2);
                    qsVar.I = new is(qsVar, b);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) qsVar.L.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        qsVar.A();
                        ck3 ck3Var2 = qsVar.z;
                        Context contextS = ck3Var2 != null ? ck3Var2.S() : null;
                        if (contextS != null) {
                            context = contextS;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        qsVar.G = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (qsVar.G != null) {
                bf8 bf8Var2 = qsVar.J;
                if (bf8Var2 != null) {
                    bf8Var2.b();
                }
                qsVar.G.e();
                Context context2 = qsVar.G.getContext();
                ActionBarContextView actionBarContextView = qsVar.G;
                m87 m87Var = new m87();
                m87Var.p = context2;
                m87Var.q = actionBarContextView;
                m87Var.r = cj3Var;
                jp4 jp4Var = new jp4(actionBarContextView.getContext());
                jp4Var.l = true;
                m87Var.u = jp4Var;
                jp4Var.e = m87Var;
                if (((pn5) cj3Var.n).o(m87Var, jp4Var)) {
                    m87Var.k();
                    qsVar.G.c(m87Var);
                    qsVar.F = m87Var;
                    boolean z = qsVar.K && (viewGroup = qsVar.L) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = qsVar.G;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        bf8 bf8VarA = be8.a(qsVar.G);
                        bf8VarA.a(1.0f);
                        qsVar.J = bf8VarA;
                        bf8VarA.d(new ks(qsVar, b));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        qsVar.G.setVisibility(0);
                        if (qsVar.G.getParent() instanceof View) {
                            View view = (View) qsVar.G.getParent();
                            WeakHashMap weakHashMap = be8.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (qsVar.H != null) {
                        qsVar.x.getDecorView().post(qsVar.I);
                    }
                } else {
                    qsVar.F = null;
                }
            }
            qsVar.I();
            qsVar.F = qsVar.F;
        }
        qsVar.I();
        p7 p7Var3 = qsVar.F;
        if (p7Var3 != null) {
            return pn5Var.g(p7Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.m.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
