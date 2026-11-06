package o;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ze6 {
    public fc1 a;
    public Executor b;
    public gs c;
    public ve6 d;
    public wm3 e;
    public boolean g;
    public final wk0 f = new wk0(new ax1(0, this, ze6.class, "onClosed", "onClosed()V", 0, 20));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            hk0.l("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        bf7 bf7VarX = g().X();
        if (!bf7VarX.s0()) {
            ds1.g0(new y0(f(), null, (byte) 19));
        }
        if (bf7VarX.y0()) {
            bf7VarX.Q();
        } else {
            bf7VarX.n();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(et1.z((wt3) entry.getKey()), entry.getValue());
        }
        return ea2.m;
    }

    public abstract wm3 d();

    public vy1 e() {
        throw new e55(0);
    }

    public final wm3 f() {
        wm3 wm3Var = this.e;
        if (wm3Var != null) {
            return wm3Var;
        }
        im3.e0("internalTracker");
        throw null;
    }

    public final df7 g() {
        ve6 ve6Var = this.d;
        if (ve6Var == null) {
            im3.e0("connectionManager");
            throw null;
        }
        df7 df7VarC = ve6Var.c();
        if (df7VarC != null) {
            return df7VarC;
        }
        hk0.l("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set h() {
        return lv0.T0(new ArrayList(mv0.Z(la2.m, 10)));
    }

    public LinkedHashMap i() {
        int iQ = xm4.Q(mv0.Z(la2.m, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        return new LinkedHashMap(iQ);
    }

    public final boolean j() {
        ve6 ve6Var = this.d;
        if (ve6Var != null) {
            return ve6Var.c() != null;
        }
        im3.e0("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().X().s0();
    }

    public final void l() {
        g().X().e0();
        if (k()) {
            return;
        }
        wm3 wm3VarF = f();
        wm3VarF.b.c(wm3VarF.e, wm3VarF.f);
    }

    public final boolean m() {
        ve6 ve6Var = this.d;
        if (ve6Var == null) {
            im3.e0("connectionManager");
            throw null;
        }
        bf7 bf7Var = (bf7) ve6Var.g;
        if (bf7Var != null) {
            return bf7Var.isOpen();
        }
        return false;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object objCall = callable.call();
            p();
            return objCall;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().X().O();
    }

    public final Object q(boolean z, hw2 hw2Var, jc1 jc1Var) {
        ve6 ve6Var = this.d;
        if (ve6Var != null) {
            return ((s41) ve6Var.f).p(z, hw2Var, jc1Var);
        }
        im3.e0("connectionManager");
        throw null;
    }
}
