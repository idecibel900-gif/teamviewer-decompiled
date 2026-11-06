package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class r87 extends wp4 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jp4 f1902o;
    public final gp4 p;
    public final boolean q;
    public final int r;
    public final int s;
    public final aq4 t;
    public PopupWindow.OnDismissListener w;
    public View x;
    public View y;
    public fq4 z;
    public final ft u = new ft(this, 4);
    public final a0 v = new a0(this, 5);
    public int E = 0;

    public r87(Context context, jp4 jp4Var, View view, int i, boolean z) {
        this.n = context;
        this.f1902o = jp4Var;
        this.q = z;
        this.p = new gp4(jp4Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.s = i;
        Resources resources = context.getResources();
        this.r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.t = new aq4(context, null, i, 0);
        jp4Var.b(this, context);
    }

    @Override // o.kz6
    public final boolean a() {
        return !this.B && this.t.K.isShowing();
    }

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
        if (jp4Var != this.f1902o) {
            return;
        }
        dismiss();
        fq4 fq4Var = this.z;
        if (fq4Var != null) {
            fq4Var.b(jp4Var, z);
        }
    }

    @Override // o.gq4
    public final void c(boolean z) {
        this.C = false;
        gp4 gp4Var = this.p;
        if (gp4Var != null) {
            gp4Var.notifyDataSetChanged();
        }
    }

    @Override // o.kz6
    public final void dismiss() {
        if (a()) {
            this.t.dismiss();
        }
    }

    @Override // o.gq4
    public final boolean e() {
        return false;
    }

    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        boolean z;
        if (gd7Var.hasVisibleItems()) {
            yp4 yp4Var = new yp4(this.n, gd7Var, this.y, this.q, this.s, 0);
            fq4 fq4Var = this.z;
            yp4Var.h = fq4Var;
            wp4 wp4Var = yp4Var.i;
            if (wp4Var != null) {
                wp4Var.k(fq4Var);
            }
            int size = gd7Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = gd7Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            yp4Var.g = z;
            wp4 wp4Var2 = yp4Var.i;
            if (wp4Var2 != null) {
                wp4Var2.q(z);
            }
            yp4Var.j = this.w;
            this.w = null;
            this.f1902o.c(false);
            aq4 aq4Var = this.t;
            int width = aq4Var.r;
            int iN = aq4Var.n();
            if ((Gravity.getAbsoluteGravity(this.E, this.x.getLayoutDirection()) & 7) == 5) {
                width += this.x.getWidth();
            }
            if (!yp4Var.b()) {
                if (yp4Var.e != null) {
                    yp4Var.d(width, iN, true, true);
                }
            }
            fq4 fq4Var2 = this.z;
            if (fq4Var2 != null) {
                fq4Var2.m0(gd7Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.kz6
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.B || (view = this.x) == null) {
            hk0.l("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.y = view;
        aq4 aq4Var = this.t;
        zs zsVar = aq4Var.K;
        zs zsVar2 = aq4Var.K;
        zsVar.setOnDismissListener(this);
        aq4Var.B = this;
        aq4Var.J = true;
        zsVar2.setFocusable(true);
        View view2 = this.y;
        boolean z = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.u);
        }
        view2.addOnAttachStateChangeListener(this.v);
        aq4Var.A = view2;
        aq4Var.x = this.E;
        boolean z2 = this.C;
        Context context = this.n;
        gp4 gp4Var = this.p;
        if (!z2) {
            this.D = wp4.o(gp4Var, context, this.r);
            this.C = true;
        }
        aq4Var.q(this.D);
        zsVar2.setInputMethodMode(2);
        Rect rect = this.m;
        aq4Var.I = rect != null ? new Rect(rect) : null;
        aq4Var.g();
        o62 o62Var = aq4Var.f313o;
        o62Var.setOnKeyListener(this);
        if (this.F) {
            jp4 jp4Var = this.f1902o;
            if (jp4Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o62Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jp4Var.m);
                }
                frameLayout.setEnabled(false);
                o62Var.addHeaderView(frameLayout, null, false);
            }
        }
        aq4Var.o(gp4Var);
        aq4Var.g();
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
    }

    @Override // o.kz6
    public final o62 i() {
        return this.t.f313o;
    }

    @Override // o.gq4
    public final void k(fq4 fq4Var) {
        this.z = fq4Var;
    }

    @Override // o.gq4
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.B = true;
        this.f1902o.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.y.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.u);
            this.A = null;
        }
        this.y.removeOnAttachStateChangeListener(this.v);
        PopupWindow.OnDismissListener onDismissListener = this.w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.wp4
    public final void p(View view) {
        this.x = view;
    }

    @Override // o.wp4
    public final void q(boolean z) {
        this.p.f912o = z;
    }

    @Override // o.wp4
    public final void r(int i) {
        this.E = i;
    }

    @Override // o.wp4
    public final void s(int i) {
        this.t.r = i;
    }

    @Override // o.wp4
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    @Override // o.wp4
    public final void u(boolean z) {
        this.F = z;
    }

    @Override // o.wp4
    public final void v(int i) {
        this.t.k(i);
    }
}
