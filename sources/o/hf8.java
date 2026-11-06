package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class hf8 implements gb6, DefaultLifecycleObserver {
    public final i46 m;
    public final ke3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yy2 f969o;
    public final x84 p;
    public final bp3 q;

    public hf8(i46 i46Var, ke3 ke3Var, yy2 yy2Var, x84 x84Var, bp3 bp3Var) {
        this.m = i46Var;
        this.n = ke3Var;
        this.f969o = yy2Var;
        this.p = x84Var;
        this.q = bp3Var;
    }

    @Override // o.gb6
    public final void a() {
        yy2 yy2Var = this.f969o;
        if (yy2Var.getView().isAttachedToWindow()) {
            return;
        }
        if8 if8VarI = h67.i(yy2Var.getView());
        hf8 hf8Var = if8VarI.p;
        if (hf8Var != null) {
            x84 x84Var = hf8Var.p;
            hf8Var.q.j(null);
            yy2 yy2Var2 = hf8Var.f969o;
            if (yy2Var2 != null && x84Var != null) {
                x84Var.f(yy2Var2);
            }
            if (x84Var != null) {
                x84Var.f(hf8Var);
            }
        }
        if8VarI.p = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // o.gb6
    public final Object b(h46 h46Var) {
        x84 x84Var = this.p;
        return x84Var != null ? vs1.j(x84Var, h46Var) : f88.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if8 if8VarI = h67.i(this.f969o.getView());
        synchronized (if8VarI) {
            try {
                n87 n87Var = if8VarI.f1057o;
                hc1 hc1Var = null;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                iz2 iz2Var = iz2.m;
                tk1 tk1Var = g22.a;
                if8VarI.f1057o = im3.R(iz2Var, ok4.a.r, null, new ac(if8VarI, hc1Var, (byte) 15), 2);
                if8VarI.n = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.gb6
    public final void start() {
        x84 x84Var = this.p;
        if (x84Var != null) {
            x84Var.a(this);
        }
        yy2 yy2Var = this.f969o;
        if (yy2Var != null && x84Var != null) {
            x84Var.f(yy2Var);
            x84Var.a(yy2Var);
        }
        if8 if8VarI = h67.i(yy2Var.getView());
        hf8 hf8Var = if8VarI.p;
        if (hf8Var != null) {
            x84 x84Var2 = hf8Var.p;
            hf8Var.q.j(null);
            yy2 yy2Var2 = hf8Var.f969o;
            if (yy2Var2 != null && x84Var2 != null) {
                x84Var2.f(yy2Var2);
            }
            if (x84Var2 != null) {
                x84Var2.f(hf8Var);
            }
        }
        if8VarI.p = this;
    }
}
