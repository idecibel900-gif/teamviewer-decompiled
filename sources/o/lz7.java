package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lz7 extends ck3 {
    public final a08 O;
    public final Window.Callback P;
    public final kz7 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final ArrayList U = new ArrayList();
    public final mt8 V = new mt8((Object) this, (byte) 19);

    public lz7(Toolbar toolbar, CharSequence charSequence, ls lsVar) {
        kz7 kz7Var = new kz7(this);
        toolbar.getClass();
        a08 a08Var = new a08(toolbar, false);
        this.O = a08Var;
        lsVar.getClass();
        this.P = lsVar;
        a08Var.k = lsVar;
        toolbar.setOnMenuItemClickListener(kz7Var);
        if (!a08Var.g) {
            a08Var.h = charSequence;
            if ((a08Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (a08Var.g) {
                    be8.n(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.Q = new kz7(this);
    }

    @Override // o.ck3
    public final void O(boolean z) {
        if (z == this.T) {
            return;
        }
        this.T = z;
        ArrayList arrayList = this.U;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        io.sentry.h2.f();
    }

    @Override // o.ck3
    public final int R() {
        return this.O.b;
    }

    @Override // o.ck3
    public final Context S() {
        return this.O.a.getContext();
    }

    @Override // o.ck3
    public final boolean U() {
        a08 a08Var = this.O;
        Toolbar toolbar = a08Var.a;
        mt8 mt8Var = this.V;
        toolbar.removeCallbacks(mt8Var);
        Toolbar toolbar2 = a08Var.a;
        WeakHashMap weakHashMap = be8.a;
        toolbar2.postOnAnimation(mt8Var);
        return true;
    }

    @Override // o.ck3
    public final void c0() {
        this.O.a.removeCallbacks(this.V);
    }

    @Override // o.ck3
    public final boolean d0(int i, KeyEvent keyEvent) {
        Menu menuZ0 = z0();
        if (menuZ0 == null) {
            return false;
        }
        menuZ0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuZ0.performShortcut(i, keyEvent, 0);
    }

    @Override // o.ck3
    public final boolean e0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            f0();
        }
        return true;
    }

    @Override // o.ck3
    public final boolean f0() {
        return this.O.a.u();
    }

    @Override // o.ck3
    public final void l0() {
        this.O.a.setBackground(null);
    }

    @Override // o.ck3
    public final void n0(boolean z) {
        int i = z ? 4 : 0;
        a08 a08Var = this.O;
        a08Var.a((i & 4) | (a08Var.b & (-5)));
    }

    @Override // o.ck3
    public final void o0() {
        a08 a08Var = this.O;
        a08Var.a(a08Var.b & (-9));
    }

    @Override // o.ck3
    public final void p0() {
        a08 a08Var = this.O;
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
    public final void r0(String str) {
        a08 a08Var = this.O;
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
    public final boolean s() {
        l7 l7Var;
        ActionMenuView actionMenuView = this.O.a.m;
        return (actionMenuView == null || (l7Var = actionMenuView.F) == null || !l7Var.g()) ? false : true;
    }

    @Override // o.ck3
    public final void s0(CharSequence charSequence) {
        a08 a08Var = this.O;
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
        pp4 pp4Var;
        gz7 gz7Var = this.O.a.b0;
        if (gz7Var == null || (pp4Var = gz7Var.n) == null) {
            return false;
        }
        if (gz7Var == null) {
            pp4Var = null;
        }
        if (pp4Var == null) {
            return true;
        }
        pp4Var.collapseActionView();
        return true;
    }

    public final Menu z0() {
        boolean z = this.S;
        a08 a08Var = this.O;
        if (!z) {
            io.sentry.android.core.u0 u0Var = new io.sentry.android.core.u0(this, (byte) 7);
            kz7 kz7Var = new kz7(this);
            Toolbar toolbar = a08Var.a;
            toolbar.c0 = u0Var;
            toolbar.d0 = kz7Var;
            ActionMenuView actionMenuView = toolbar.m;
            if (actionMenuView != null) {
                actionMenuView.G = u0Var;
                actionMenuView.H = kz7Var;
            }
            this.S = true;
        }
        return a08Var.a.getMenu();
    }
}
