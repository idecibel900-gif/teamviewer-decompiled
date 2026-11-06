package o;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class m83 implements v07 {
    public final boolean m;
    public final bf0 n = new bf0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1445o;
    public final /* synthetic */ p83 p;

    public m83(p83 p83Var, boolean z) {
        this.p = p83Var;
        this.m = z;
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) {
        TimeZone timeZone = ro8.a;
        bf0 bf0Var2 = this.n;
        bf0Var2.W(bf0Var, j);
        while (bf0Var2.n >= 16384) {
            e(false);
        }
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        p83 p83Var = this.p;
        TimeZone timeZone = ro8.a;
        synchronized (p83Var) {
            if (this.f1445o) {
                return;
            }
            boolean z = p83Var.g() == null;
            p83 p83Var2 = this.p;
            if (!p83Var2.u.m) {
                if (this.n.n > 0) {
                    while (this.n.n > 0) {
                        e(true);
                    }
                } else if (z) {
                    p83Var2.n.F(p83Var2.m, true, null, 0L);
                }
            }
            p83 p83Var3 = this.p;
            synchronized (p83Var3) {
                this.f1445o = true;
                p83Var3.notifyAll();
            }
            this.p.n.I.flush();
            this.p.a();
        }
    }

    public final void e(boolean z) {
        long jMin;
        boolean z2;
        p83 p83Var = this.p;
        synchronized (p83Var) {
            p83Var.w.h();
            while (p83Var.p >= p83Var.q && !this.m && !this.f1445o && p83Var.g() == null) {
                try {
                    try {
                        p83Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    p83Var.w.k();
                    throw th;
                }
            }
            p83Var.w.k();
            p83Var.b();
            jMin = Math.min(p83Var.q - p83Var.p, this.n.n);
            p83Var.p += jMin;
            z2 = z && jMin == this.n.n;
        }
        this.p.w.h();
        try {
            p83 p83Var2 = this.p;
            p83Var2.n.F(p83Var2.m, z2, this.n, jMin);
        } finally {
            this.p.w.k();
        }
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() {
        p83 p83Var = this.p;
        TimeZone timeZone = ro8.a;
        synchronized (p83Var) {
            p83Var.b();
        }
        while (this.n.n > 0) {
            e(false);
            this.p.n.I.flush();
        }
    }

    @Override // o.v07
    public final ov7 i() {
        return this.p.w;
    }
}
