package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class q43 extends fe1 implements nm1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f1802o;
    public final String p;
    public final boolean q;
    public final q43 r;

    public q43(Handler handler, String str, boolean z) {
        this.f1802o = handler;
        this.p = str;
        this.q = z;
        this.r = z ? this : new q43(handler, str, true);
    }

    @Override // o.nm1
    public final void J(long j, gl0 gl0Var) {
        io.sentry.u4 u4Var = new io.sentry.u4((Object) gl0Var, (Object) this, (byte) 29);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1802o.postDelayed(u4Var, j)) {
            gl0Var.v(new o43(this, u4Var, (byte) 0));
        } else {
            O0(gl0Var.q, u4Var);
        }
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        if (this.f1802o.post(runnable)) {
            return;
        }
        O0(de1Var, runnable);
    }

    @Override // o.fe1
    public final boolean M0(de1 de1Var) {
        return (this.q && im3.n(Looper.myLooper(), this.f1802o.getLooper())) ? false : true;
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        xs1.x(i);
        return this;
    }

    public final void O0(de1 de1Var, Runnable runnable) {
        ds1.A(de1Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        tk1 tk1Var = g22.a;
        gk1.f901o.K0(de1Var, runnable);
    }

    @Override // o.nm1
    public final t22 Y(long j, final Runnable runnable, de1 de1Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1802o.postDelayed(runnable, j)) {
            return new t22() { // from class: o.p43
                @Override // o.t22
                public final void a() {
                    this.m.f1802o.removeCallbacks(runnable);
                }
            };
        }
        O0(de1Var, runnable);
        return r45.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43Var = (q43) obj;
        return q43Var.f1802o == this.f1802o && q43Var.q == this.q;
    }

    public final int hashCode() {
        return (this.q ? 1231 : 1237) ^ System.identityHashCode(this.f1802o);
    }

    @Override // o.fe1
    public final String toString() {
        q43 q43Var;
        String str;
        tk1 tk1Var = g22.a;
        q43 q43Var2 = ok4.a;
        if (this == q43Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                q43Var = q43Var2.r;
            } catch (UnsupportedOperationException unused) {
                q43Var = null;
            }
            str = this == q43Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.p;
        if (string == null) {
            string = this.f1802o.toString();
        }
        return this.q ? ua5.z(string, ".immediate") : string;
    }

    public q43(Handler handler) {
        this(handler, null, false);
    }
}
