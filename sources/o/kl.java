package o;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends fe1 {
    public static final kh7 y = new kh7(new e5(16));
    public static final io.sentry.c z = new io.sentry.c((byte) 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Choreographer f1276o;
    public final Handler p;
    public boolean u;
    public boolean v;
    public final ml x;
    public final Object q = new Object();
    public final kw r = new kw();
    public ArrayList s = new ArrayList();
    public ArrayList t = new ArrayList();
    public final jl w = new jl(this);

    public kl(Choreographer choreographer, Handler handler) {
        this.f1276o = choreographer;
        this.p = handler;
        this.x = new ml(choreographer, this);
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        synchronized (this.q) {
            this.r.addLast(runnable);
            if (!this.u) {
                this.u = true;
                this.p.post(this.w);
                if (!this.v) {
                    this.v = true;
                    this.f1276o.postFrameCallback(this.w);
                }
            }
        }
    }

    public final void O0() {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (this.q) {
                kw kwVar = this.r;
                runnable = (Runnable) (kwVar.isEmpty() ? null : kwVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.q) {
                    kw kwVar2 = this.r;
                    runnable = (Runnable) (kwVar2.isEmpty() ? null : kwVar2.removeFirst());
                }
            }
            synchronized (this.q) {
                if (this.r.isEmpty()) {
                    z2 = false;
                    this.u = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }
}
