package o;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wk8 {
    public static final WeakHashMap w = new WeakHashMap();
    public final gm a;
    public final gm b;
    public final gm c;
    public final gm d;
    public final gm e;
    public final gm f;
    public final gm g;
    public final gm h;
    public final gm i;
    public final mb8 j;
    public final bg5 k;
    public final c88 l;
    public final mb8 m;
    public final mb8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mb8 f2424o;
    public final mb8 p;
    public final mb8 q;
    public final mb8 r;
    public final mb8 s;
    public final boolean t;
    public int u;
    public final rj3 v;

    public wk8(View view) {
        gm gmVar = new gm(4, "captionBar");
        this.a = gmVar;
        gm gmVar2 = new gm(128, "displayCutout");
        this.b = gmVar2;
        gm gmVar3 = new gm(8, "ime");
        this.c = gmVar3;
        gm gmVar4 = new gm(32, "mandatorySystemGestures");
        this.d = gmVar4;
        gm gmVar5 = new gm(2, "navigationBars");
        this.e = gmVar5;
        gm gmVar6 = new gm(1, "statusBars");
        this.f = gmVar6;
        gm gmVar7 = new gm(519, "systemBars");
        this.g = gmVar7;
        gm gmVar8 = new gm(16, "systemGestures");
        this.h = gmVar8;
        gm gmVar9 = new gm(64, "tappableElement");
        this.i = gmVar9;
        mb8 mb8Var = new mb8(new wj3(0, 0, 0, 0), "waterfall");
        this.j = mb8Var;
        this.k = h57.p(null);
        c88 c88Var = new c88(new c88(gmVar7, gmVar3), gmVar2);
        this.l = c88Var;
        new c88(c88Var, new c88(new c88(new c88(gmVar9, gmVar4), gmVar8), mb8Var));
        this.m = b77.o(4, "captionBarIgnoringVisibility");
        this.n = b77.o(2, "navigationBarsIgnoringVisibility");
        this.f2424o = b77.o(1, "statusBarsIgnoringVisibility");
        this.p = b77.o(519, "systemBarsIgnoringVisibility");
        this.q = b77.o(64, "tappableElementIgnoringVisibility");
        this.r = new mb8(new wj3(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new mb8(new wj3(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new rj3(this);
        WeakHashMap weakHashMap = be8.a;
        sk8 sk8VarA = td8.a(view);
        if (sk8VarA != null) {
            pk8 pk8Var = sk8VarA.a;
            gmVar.f(pk8Var.u(4));
            gmVar2.f(pk8Var.u(128));
            gmVar3.f(pk8Var.u(8));
            gmVar4.f(pk8Var.u(32));
            gmVar5.f(pk8Var.u(2));
            gmVar6.f(pk8Var.u(1));
            gmVar7.f(pk8Var.u(519));
            gmVar8.f(pk8Var.u(16));
            gmVar9.f(pk8Var.u(64));
        }
    }

    public static void b(wk8 wk8Var, sk8 sk8Var) {
        boolean z = false;
        wk8Var.a.g(sk8Var, 0);
        wk8Var.c.g(sk8Var, 0);
        wk8Var.b.g(sk8Var, 0);
        wk8Var.e.g(sk8Var, 0);
        wk8Var.f.g(sk8Var, 0);
        wk8Var.g.g(sk8Var, 0);
        wk8Var.h.g(sk8Var, 0);
        wk8Var.i.g(sk8Var, 0);
        wk8Var.d.g(sk8Var, 0);
        wk8Var.m.f(m77.C(sk8Var.a.j(4)));
        wk8Var.n.f(m77.C(sk8Var.a.j(2)));
        wk8Var.f2424o.f(m77.C(sk8Var.a.j(1)));
        wk8Var.p.f(m77.C(sk8Var.a.j(519)));
        wk8Var.q.f(m77.C(sk8Var.a.j(64)));
        h22 h22VarH = sk8Var.a.h();
        wk8Var.j.f(m77.C(h22VarH != null ? h22VarH.c() : nj3.e));
        rj rjVar = null;
        if (h22VarH != null) {
            Path pathC = Build.VERSION.SDK_INT >= 31 ? nh.c(h22VarH.a) : null;
            if (pathC != null) {
                rjVar = new rj(pathC);
            }
        }
        wk8Var.k.setValue(rjVar);
        synchronized (v47.c) {
            kx4 kx4Var = v47.j.h;
            if (kx4Var != null && kx4Var.h()) {
                z = true;
            }
        }
        if (z) {
            v47.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            rj3 rj3Var = this.v;
            rj3Var.p = false;
            rj3Var.q = false;
            rj3Var.r = null;
            WeakHashMap weakHashMap = be8.a;
            sd8.c(view, rj3Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(rj3Var);
            xj8.a(view, rj3Var);
        }
        this.u++;
    }
}
