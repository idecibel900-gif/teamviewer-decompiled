package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hy8 extends bo7 {
    public final Object a = new Object();
    public final io.sentry.android.core.n1 b = new io.sentry.android.core.n1();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // o.bo7
    public final hy8 a(Executor executor, s75 s75Var) {
        this.b.q(new bv8(executor, s75Var));
        q();
        return this;
    }

    @Override // o.bo7
    public final hy8 b(Executor executor, t75 t75Var) {
        this.b.q(new bv8(executor, t75Var));
        q();
        return this;
    }

    @Override // o.bo7
    public final hy8 c(t75 t75Var) {
        this.b.q(new bv8(eo7.a, t75Var));
        q();
        return this;
    }

    @Override // o.bo7
    public final hy8 d(Executor executor, x75 x75Var) {
        this.b.q(new bv8(executor, x75Var));
        q();
        return this;
    }

    @Override // o.bo7
    public final hy8 e(Executor executor, d85 d85Var) {
        this.b.q(new bv8(executor, d85Var));
        q();
        return this;
    }

    @Override // o.bo7
    public final hy8 f(Executor executor, ic1 ic1Var) {
        hy8 hy8Var = new hy8();
        this.b.q(new bt8(executor, ic1Var, hy8Var, (byte) 0));
        q();
        return hy8Var;
    }

    @Override // o.bo7
    public final hy8 g(Executor executor, ic1 ic1Var) {
        hy8 hy8Var = new hy8();
        this.b.q(new bt8(executor, ic1Var, hy8Var, (byte) 1));
        q();
        return hy8Var;
    }

    @Override // o.bo7
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // o.bo7
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new lg6(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // o.bo7
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // o.bo7
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.bo7
    public final hy8 l(Executor executor, le7 le7Var) {
        hy8 hy8Var = new hy8();
        this.b.q(new bv8(executor, le7Var, hy8Var));
        q();
        return hy8Var;
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.r(this);
    }

    public final void n(Exception exc) {
        nv1.t(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.r(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.r(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        String strConcat;
        if (this.c) {
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excH = h();
            if (excH != null) {
                strConcat = "failure";
            } else if (k()) {
                strConcat = "result ".concat(String.valueOf(i()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.r(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
