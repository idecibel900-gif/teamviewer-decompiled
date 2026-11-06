package o;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class p83 implements n57 {
    public final int m;
    public final i83 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fj8 f1713o;
    public long p;
    public long q;
    public final ArrayDeque r;
    public boolean s;
    public final n83 t;
    public final m83 u;
    public final o83 v;
    public final o83 w;
    public tc2 x;
    public IOException y;

    public p83(int i, i83 i83Var, boolean z, boolean z2, k53 k53Var) {
        i83Var.getClass();
        this.m = i;
        this.n = i83Var;
        this.f1713o = new fj8(i);
        this.q = i83Var.D.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.r = arrayDeque;
        this.t = new n83(this, i83Var.C.a(), z2);
        this.u = new m83(this, z);
        this.v = new o83(this);
        this.w = new o83(this);
        if (k53Var == null) {
            if (h()) {
                return;
            }
            hk0.l("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            hk0.l("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(k53Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zI;
        TimeZone timeZone = ro8.a;
        synchronized (this) {
            try {
                n83 n83Var = this.t;
                if (n83Var.n || !n83Var.q) {
                    z = false;
                } else {
                    m83 m83Var = this.u;
                    if (m83Var.m || m83Var.f1445o) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zI = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            d(tc2.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.n.q(this.m);
        }
    }

    public final void b() throws IOException {
        m83 m83Var = this.u;
        if (m83Var.f1445o) {
            gk0.l("stream closed");
            return;
        }
        if (m83Var.m) {
            gk0.l("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.y;
            if (iOException != null) {
                throw iOException;
            }
            tc2 tc2VarG = g();
            tc2VarG.getClass();
            throw new qa7(tc2VarG);
        }
    }

    @Override // o.n57
    public final q67 c() {
        return this.t;
    }

    public final void d(tc2 tc2Var, IOException iOException) {
        if (e(tc2Var, iOException)) {
            i83 i83Var = this.n;
            i83Var.getClass();
            i83Var.I.G(this.m, tc2Var);
        }
    }

    public final boolean e(tc2 tc2Var, IOException iOException) {
        TimeZone timeZone = ro8.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.x = tc2Var;
            this.y = iOException;
            notifyAll();
            if (this.t.n && this.u.m) {
                return false;
            }
            this.n.q(this.m);
            return true;
        }
    }

    public final void f(tc2 tc2Var) {
        if (e(tc2Var, null)) {
            this.n.G(this.m, tc2Var);
        }
    }

    public final tc2 g() {
        tc2 tc2Var;
        synchronized (this) {
            tc2Var = this.x;
        }
        return tc2Var;
    }

    public final boolean h() {
        boolean z = (this.m & 1) == 1;
        this.n.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                n83 n83Var = this.t;
                if (n83Var.n || n83Var.q) {
                    m83 m83Var = this.u;
                    if ((m83Var.m || m83Var.f1445o) && this.s) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(k53 k53Var, boolean z) {
        boolean zI;
        k53Var.getClass();
        TimeZone timeZone = ro8.a;
        synchronized (this) {
            try {
                if (this.s && k53Var.a(":status") == null && k53Var.a(":method") == null) {
                    this.t.getClass();
                } else {
                    this.s = true;
                    this.r.add(k53Var);
                }
                if (z) {
                    this.t.n = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.n.q(this.m);
    }

    @Override // o.n57
    public final v07 u() {
        return this.u;
    }
}
