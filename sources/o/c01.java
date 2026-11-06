package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c01 {
    public final View a;
    public boolean b;
    public n01 c;
    public LifecycleOwner d;
    public ai6 e;
    public we8 f;
    public final ze3 g;
    public final yb6 h;
    public final Configuration i;
    public final px4 j;
    public final vf k;
    public final nl l;
    public final cj3 m;
    public final au0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ir2 f472o;
    public final px4 p;
    public final v43 q;
    public final pl r;
    public final d14 s;
    public final n54 t;
    public final ol0 u;
    public int v;
    public final zz0 w;
    public wk x;
    public final b01 y;

    public c01(c01 c01Var, View view, n01 n01Var, LifecycleOwner lifecycleOwner, ai6 ai6Var, we8 we8Var) {
        ze3 ze3Var;
        Configuration configuration;
        px4 px4VarP;
        vf vfVar;
        nl nlVar;
        cj3 cj3Var;
        au0 ggVar;
        ir2 jk0Var;
        px4 bg5Var;
        pl plVar;
        boolean zN = im3.n(c01Var != null ? c01Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = n01Var;
        this.d = lifecycleOwner;
        this.e = ai6Var;
        this.f = we8Var;
        if (zN) {
            c01Var.getClass();
            ze3Var = c01Var.g;
        } else {
            ze3Var = new ze3();
        }
        this.g = ze3Var;
        this.h = c01Var != null ? c01Var.h : new yb6();
        if (zN) {
            c01Var.getClass();
            configuration = c01Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zN) {
            c01Var.getClass();
            px4VarP = c01Var.j;
        } else {
            px4VarP = h57.p(new Configuration(configuration));
        }
        this.j = px4VarP;
        if (zN) {
            c01Var.getClass();
            vfVar = c01Var.k;
        } else {
            vfVar = new vf(view.getContext());
        }
        this.k = vfVar;
        if (zN) {
            c01Var.getClass();
            nlVar = c01Var.l;
        } else {
            nlVar = new nl(view.getContext());
        }
        this.l = nlVar;
        if (zN) {
            c01Var.getClass();
            cj3Var = c01Var.m;
        } else {
            cj3Var = new cj3((Object) view.getContext(), (byte) 10);
        }
        this.m = cj3Var;
        if (zN) {
            c01Var.getClass();
            ggVar = c01Var.n;
        } else {
            ggVar = new gg(cj3Var);
        }
        this.n = ggVar;
        if (zN) {
            c01Var.getClass();
            jk0Var = c01Var.f472o;
        } else {
            view.getContext();
            jk0Var = new jk0((byte) 29);
        }
        this.f472o = jk0Var;
        if (zN) {
            c01Var.getClass();
            bg5Var = c01Var.p;
        } else {
            bg5Var = new bg5(bt1.s(view.getContext()), yl7.T);
        }
        this.p = bg5Var;
        this.q = view == (c01Var != null ? c01Var.a : null) ? c01Var.q : new tl5(view);
        if (zN) {
            c01Var.getClass();
            plVar = c01Var.r;
        } else {
            plVar = new pl(ViewConfiguration.get(view.getContext()));
        }
        this.r = plVar;
        this.s = c01Var != null ? c01Var.s : new d14();
        this.t = new n54();
        this.u = c01Var != null ? c01Var.u : new ol0();
        this.w = new zz0(this, (byte) 0);
        this.y = new b01(this);
    }

    public final void a(AndroidComposeView androidComposeView, yy0 yy0Var, ux2 ux2Var, int i) {
        ux2Var.Y(123858079);
        byte b = 4;
        int i2 = (ux2Var.h(androidComposeView) ? 4 : 2) | i | (ux2Var.h(yy0Var) ? 32 : 16) | (ux2Var.h(this) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof su3) && !(tag instanceof fv3))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof su3) || (tag2 instanceof fv3))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(ux2Var.v());
                ux2Var.q = true;
                ux2Var.C = true;
                ux2Var.c.b();
                ux2Var.H.b();
                k17 k17Var = ux2Var.I;
                h17 h17Var = k17Var.a;
                k17Var.e = h17Var.v;
                k17Var.f = h17Var.w;
            }
            boolean zF = ux2Var.f(androidComposeView.getView());
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = new kf8(androidComposeView.getView());
                ux2Var.g0(objK);
            }
            kf8 kf8Var = (kf8) objK;
            dx5 dx5VarA = dd4.a.a(d());
            zw5 zw5Var = hd4.a;
            g();
            ai6 ai6Var = this.e;
            ai6Var.getClass();
            dx5 dx5VarA2 = zw5Var.a(ai6Var);
            dx5 dx5VarA3 = lh.d.a(this.g);
            dx5 dx5VarA4 = lh.e.a(this.h);
            h72 h72Var = b11.v;
            boolean zH = ux2Var.h(this);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == awVar) {
                objK2 = new q0(this, (byte) 24);
                ux2Var.g0(objK2);
            }
            dx5 dx5VarC = h72Var.c((Function1) objK2);
            dx5 dx5VarA5 = lh.b.a(androidComposeView.getContext());
            dx5 dx5VarA6 = yj3.a.a(set);
            dx5 dx5VarA7 = lh.a.a(androidComposeView.getConfiguration());
            h72 h72Var2 = ph6.a;
            boolean zH2 = ux2Var.h(androidComposeView);
            Object objK3 = ux2Var.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new hg(androidComposeView, (byte) 3);
                ux2Var.g0(objK3);
            }
            dx5 dx5VarC2 = h72Var2.c((Function1) objK3);
            dx5 dx5VarA8 = lh.f.a(androidComposeView.getView());
            h72 h72Var3 = b11.x;
            boolean zH3 = ux2Var.h(androidComposeView);
            Object objK4 = ux2Var.K();
            if (zH3 || objK4 == awVar) {
                objK4 = new hg(androidComposeView, b);
                ux2Var.g0(objK4);
            }
            j51.m(new dx5[]{dx5VarA, dx5VarA2, dx5VarA3, dx5VarA4, dx5VarC, dx5VarA5, dx5VarA6, dx5VarA7, dx5VarC2, dx5VarA8, h72Var3.c((Function1) objK4), b11.t.a(androidComposeView.getViewConfiguration()), h63.a.a(kf8Var)}, au8.O(1317454175, new a01(androidComposeView, this, yy0Var), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a01(this, androidComposeView, yy0Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            io.sentry.android.core.v0.c("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            b01 b01Var = this.y;
            context.unregisterComponentCallbacks(b01Var);
            n54 n54Var = this.t;
            if (n54Var.b == null) {
                n54Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(b01Var);
        }
    }

    public final n01 c() {
        g();
        n01 n01Var = this.c;
        n01Var.getClass();
        return n01Var;
    }

    public final LifecycleOwner d() {
        g();
        LifecycleOwner lifecycleOwner = this.d;
        lifecycleOwner.getClass();
        return lifecycleOwner;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            b01 b01Var = this.y;
            context.registerComponentCallbacks(b01Var);
            f(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            n54 n54Var = this.t;
            n54Var.c.setValue(Boolean.valueOf(zHasWindowFocus));
            bg5 bg5Var = n54Var.b;
            zz0 zz0Var = this.w;
            if (bg5Var == null) {
                n54Var.a = zz0Var;
            }
            if (bg5Var != null) {
                bg5Var.setValue(zz0Var.a());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(b01Var);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                xe3 xe3Var = (xe3) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (xe3Var == null || Configuration.needNewResources(iUpdateFrom, xe3Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            yb6 yb6Var = this.h;
            synchronized (yb6Var) {
                yb6Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(bt1.s(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                n54 n54Var = this.t;
                zz0 zz0Var = this.w;
                bg5 bg5Var = n54Var.b;
                if (bg5Var != null) {
                    bg5Var.setValue(zz0Var.a());
                }
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        n01 n01Var = this.c;
        View view = this.a;
        if (n01Var == null) {
            n01 n01VarA = kl8.a(view);
            if (n01VarA == null) {
                Object parent = view.getParent();
                while (n01VarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    n01VarA = kl8.a(view2);
                    parent = i67.q(view2);
                }
            }
            if (n01VarA == null) {
                n01VarA = kl8.b(view);
            }
            this.c = n01VarA;
        }
        if (this.d == null) {
            LifecycleOwner lifecycleOwnerL = n67.l(view);
            if (lifecycleOwnerL == null) {
                hk0.l("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = lifecycleOwnerL;
        }
        if (this.e == null) {
            ai6 ai6VarJ = o67.j(view);
            if (ai6VarJ == null) {
                hk0.l("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = ai6VarJ;
        }
        if (this.f == null) {
            this.f = v67.i(view);
        }
    }
}
