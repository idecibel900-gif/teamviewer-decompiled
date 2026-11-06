package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.g3;
import io.sentry.u4;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Closeable {
    public static final k0 q = new k0();
    public volatile j0 n;
    public final io.sentry.util.a m = new io.sentry.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f117o = new w0();
    public volatile Boolean p = null;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z();
    }

    public final void e(h0 h0Var) {
        io.sentry.util.a aVar = this.m;
        aVar.e();
        try {
            q(g3.m);
            if (this.n != null) {
                this.n.m.add(h0Var);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(io.sentry.g1 g1Var) {
        j0 j0Var = this.n;
        if (j0Var != null) {
            try {
                ProcessLifecycleOwner.u.r.a(j0Var);
            } catch (Throwable th) {
                this.n = null;
                g1Var.d(f6.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void q(io.sentry.g1 g1Var) {
        if (this.n != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.u;
            this.n = new j0(this);
            if (io.sentry.android.core.internal.util.g.a.c()) {
                j(g1Var);
                return;
            }
            w0 w0Var = this.f117o;
            ((Handler) w0Var.a).post(new u4((Object) this, (Object) g1Var, (byte) 4));
        } catch (ClassNotFoundException unused) {
            g1Var.g(f6.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            g1Var.d(f6.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void u(h0 h0Var) {
        io.sentry.util.a aVar = this.m;
        aVar.e();
        try {
            if (this.n != null) {
                this.n.m.remove(h0Var);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void z() {
        if (this.n == null) {
            return;
        }
        io.sentry.util.a aVar = this.m;
        aVar.e();
        try {
            j0 j0Var = this.n;
            this.n.m.clear();
            this.n = null;
            aVar.close();
            if (io.sentry.android.core.internal.util.g.a.c()) {
                if (j0Var != null) {
                    ProcessLifecycleOwner.u.r.f(j0Var);
                }
            } else {
                w0 w0Var = this.f117o;
                ((Handler) w0Var.a).post(new b5(this, j0Var, (byte) 5));
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
