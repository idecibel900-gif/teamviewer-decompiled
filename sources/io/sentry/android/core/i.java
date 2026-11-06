package io.sentry.android.core;

import io.sentry.b4;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.d8;
import io.sentry.e4;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.k3;
import io.sentry.l5;
import io.sentry.o6;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i implements io.sentry.b1, io.sentry.transport.o {
    public io.sentry.protocol.w A;
    public final AtomicBoolean B;
    public l5 C;
    public volatile boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public final io.sentry.util.a H;
    public final io.sentry.util.a I;
    public final io.sentry.g1 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f107o;
    public final io.sentry.util.g p;
    public final q0 q;
    public final io.sentry.android.core.internal.util.t s;
    public io.sentry.n1 v;
    public Future w;
    public io.sentry.p x;
    public io.sentry.protocol.w z;
    public boolean r = false;
    public w t = null;
    public boolean u = false;
    public final ArrayList y = new ArrayList();

    public i(q0 q0Var, io.sentry.android.core.internal.util.t tVar, io.sentry.g1 g1Var, String str, int i, io.sentry.util.g gVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        this.z = wVar;
        this.A = wVar;
        this.B = new AtomicBoolean(false);
        this.C = new o6();
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = new io.sentry.util.a();
        this.I = new io.sentry.util.a();
        this.m = g1Var;
        this.s = tVar;
        this.q = q0Var;
        this.n = str;
        this.f107o = i;
        this.p = gVar;
    }

    @Override // io.sentry.transport.o
    public final void J(io.sentry.transport.p pVar) {
        if (pVar.j(io.sentry.q.All) || pVar.j(io.sentry.q.ProfileChunkUi)) {
            this.m.g(f6.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
        }
    }

    @Override // io.sentry.b1
    public final void a(boolean z) {
        io.sentry.util.a aVar = this.H;
        aVar.e();
        try {
            this.G = 0;
            this.E = true;
            if (z) {
                i(false);
                this.B.set(true);
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

    @Override // io.sentry.b1
    public final io.sentry.profiling.c b(io.sentry.protocol.w wVar, l5 l5Var, l5 l5Var2) {
        return io.sentry.profiling.c.UNKNOWN;
    }

    @Override // io.sentry.b1
    public final void c(e4 e4Var) {
        io.sentry.util.a aVar = this.H;
        aVar.e();
        try {
            int i = h.a[e4Var.ordinal()];
            if (i == 1) {
                int i2 = this.G - 1;
                this.G = i2;
                if (i2 > 0) {
                    aVar.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.G = 0;
                    }
                    this.E = true;
                }
            } else if (i == 2) {
                this.E = true;
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

    @Override // io.sentry.b1
    public final void d(e4 e4Var, d8 d8Var) {
        io.sentry.util.a aVar = this.H;
        aVar.e();
        try {
            if (this.D) {
                this.F = d8Var.b(io.sentry.util.p.a().c());
                this.D = false;
            }
            if (!this.F) {
                this.m.g(f6.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = h.a[e4Var.ordinal()];
            if (i == 1) {
                int i2 = this.G;
                if (i2 < 0) {
                    this.G = 0;
                    i2 = 0;
                }
                this.G = i2 + 1;
            } else if (i == 2 && this.u) {
                this.m.g(f6.DEBUG, "Profiler is already running.", new Object[0]);
                aVar.close();
                return;
            }
            if (!this.u) {
                this.m.g(f6.DEBUG, "Started Profiler.", new Object[0]);
                h();
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

    @Override // io.sentry.b1
    public final void e() {
        this.D = true;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.w f() {
        return this.z;
    }

    public final void g() {
        io.sentry.n1 n1Var = this.v;
        if ((n1Var == null || n1Var == k3.b) && d5.c() != k3.b) {
            this.v = d5.c();
            this.x = d5.c().l().getCompositePerformanceCollector();
            io.sentry.transport.p pVarC = this.v.c();
            if (pVarC != null) {
                pVarC.p.add(this);
            }
        }
    }

    public final void h() {
        g();
        this.q.getClass();
        if (!this.r) {
            this.r = true;
            io.sentry.g1 g1Var = this.m;
            String str = this.n;
            if (str == null) {
                g1Var.g(f6.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.f107o;
                if (i <= 0) {
                    g1Var.g(f6.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.t = new w(str, 1000000 / i, this.s, null, g1Var);
                }
            }
        }
        if (this.t == null) {
            return;
        }
        io.sentry.n1 n1Var = this.v;
        io.sentry.g1 g1Var2 = this.m;
        if (n1Var != null) {
            io.sentry.transport.p pVarC = n1Var.c();
            if (pVarC != null && (pVarC.j(io.sentry.q.All) || pVarC.j(io.sentry.q.ProfileChunkUi))) {
                g1Var2.g(f6.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                i(false);
                return;
            } else {
                if (this.v.l().getConnectionStatusProvider().g0() == io.sentry.y0.DISCONNECTED) {
                    g1Var2.g(f6.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    i(false);
                    return;
                }
                this.C = this.v.l().getDateProvider().a();
            }
        } else {
            this.C = new o6();
        }
        if (this.t.c() == null) {
            return;
        }
        this.u = true;
        io.sentry.protocol.w wVar = this.z;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
        if (wVar.equals(wVar2)) {
            this.z = new io.sentry.protocol.w();
        }
        if (this.A.equals(wVar2)) {
            this.A = new io.sentry.protocol.w();
        }
        io.sentry.p pVar = this.x;
        if (pVar != null) {
            pVar.a(this.A.a());
        }
        try {
            this.w = ((io.sentry.r1) this.p.e()).b(new b5((Object) this, (byte) 3), 60000L);
        } catch (RejectedExecutionException e) {
            g1Var2.d(f6.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.E = true;
        }
    }

    public final void i(boolean z) {
        g();
        io.sentry.util.a aVar = this.H;
        aVar.e();
        try {
            Future future = this.w;
            if (future != null) {
                future.cancel(true);
            }
            if (this.t != null && this.u) {
                this.q.getClass();
                io.sentry.p pVar = this.x;
                u uVarA = this.t.a(pVar != null ? pVar.c(this.A.a()) : null, false);
                io.sentry.g1 g1Var = this.m;
                if (uVarA == null) {
                    g1Var.g(f6.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.util.a aVar2 = this.I;
                    aVar2.e();
                    try {
                        this.y.add(new b4(this.z, this.A, uVarA.d, uVarA.c, this.C));
                        aVar2.close();
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                this.u = false;
                this.A = io.sentry.protocol.w.n;
                io.sentry.n1 n1Var = this.v;
                if (n1Var != null) {
                    g7 g7VarL = n1Var.l();
                    try {
                        g7VarL.getExecutorService().submit(new d2(this, g7VarL, n1Var, (byte) 2));
                    } catch (Throwable th3) {
                        g7VarL.getLogger().d(f6.DEBUG, "Failed to send profile chunks.", th3);
                    }
                }
                if (!z || this.E) {
                    this.z = io.sentry.protocol.w.n;
                    g1Var.g(f6.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    g1Var.g(f6.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    h();
                }
                aVar.close();
                return;
            }
            io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
            this.z = wVar;
            this.A = wVar;
            aVar.close();
        } catch (Throwable th4) {
            try {
                aVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
