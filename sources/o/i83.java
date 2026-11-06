package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class i83 implements Closeable {
    public static final hv6 L;
    public long A;
    public final io2 B;
    public final hv6 C;
    public hv6 D;
    public final fj8 E;
    public long F;
    public long G;
    public final iu H;
    public final q83 I;
    public final e3 J;
    public final LinkedHashSet K;
    public final g83 m;
    public final LinkedHashMap n = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1043o;
    public int p;
    public int q;
    public boolean r;
    public final io7 s;
    public final go7 t;
    public final go7 u;
    public final go7 v;
    public final z06 w;
    public long x;
    public long y;
    public long z;

    static {
        hv6 hv6Var = new hv6();
        hv6Var.b(4, 65535);
        hv6Var.b(5, 16384);
        L = hv6Var;
    }

    public i83(yc4 yc4Var) {
        this.m = (g83) yc4Var.p;
        String str = (String) yc4Var.f2598o;
        if (str == null) {
            im3.e0("connectionName");
            throw null;
        }
        this.f1043o = str;
        this.q = 3;
        io7 io7Var = (io7) yc4Var.m;
        this.s = io7Var;
        this.t = io7Var.d();
        this.u = io7Var.d();
        this.v = io7Var.d();
        this.w = z06.E;
        this.B = (io2) yc4Var.q;
        hv6 hv6Var = new hv6();
        hv6Var.b(4, 16777216);
        this.C = hv6Var;
        hv6 hv6Var2 = L;
        this.D = hv6Var2;
        this.E = new fj8(0);
        this.G = hv6Var2.a();
        iu iuVar = (iu) yc4Var.n;
        if (iuVar == null) {
            im3.e0("socket");
            throw null;
        }
        this.H = iuVar;
        this.I = new q83((u36) iuVar.n);
        this.J = new e3((Object) this, (Object) new l83((w36) iuVar.p), (byte) 8);
        this.K = new LinkedHashSet();
    }

    public final void F(int i, boolean z, bf0 bf0Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.I.j(z, i, bf0Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.F;
                            j3 = this.G;
                            if (j2 >= j3) {
                                if (!this.n.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.I.f1808o);
                j4 = iMin;
                this.F += j4;
            }
            j -= j4;
            this.I.j(z && j == 0, i, bf0Var, iMin);
        }
    }

    public final void G(int i, tc2 tc2Var) {
        go7.b(this.t, this.f1043o + '[' + i + "] writeSynReset", new gc2(this, i, tc2Var));
    }

    public final void J(final int i, final long j) {
        go7.b(this.t, this.f1043o + '[' + i + "] windowUpdate", new Function0() { // from class: o.b83
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                i83 i83Var = this.m;
                try {
                    i83Var.I.J(i, j);
                } catch (IOException e) {
                    tc2 tc2Var = tc2.PROTOCOL_ERROR;
                    i83Var.e(tc2Var, tc2Var, e);
                }
                return f88.a;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e(tc2.NO_ERROR, tc2.CANCEL, null);
    }

    public final void e(tc2 tc2Var, tc2 tc2Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = ro8.a;
        try {
            u(tc2Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.n.isEmpty()) {
                array = null;
            } else {
                array = this.n.values().toArray(new p83[0]);
                this.n.clear();
            }
        }
        p83[] p83VarArr = (p83[]) array;
        if (p83VarArr != null) {
            for (p83 p83Var : p83VarArr) {
                try {
                    p83Var.d(tc2Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.I.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((j93) this.H.f1103o).n).close();
        } catch (IOException unused4) {
        }
        this.t.e();
        this.u.e();
        this.v.e();
    }

    public final p83 j(int i) {
        p83 p83Var;
        synchronized (this) {
            p83Var = (p83) this.n.get(Integer.valueOf(i));
        }
        return p83Var;
    }

    public final p83 q(int i) {
        p83 p83Var;
        synchronized (this) {
            p83Var = (p83) this.n.remove(Integer.valueOf(i));
            notifyAll();
        }
        return p83Var;
    }

    public final void u(tc2 tc2Var) {
        synchronized (this.I) {
            synchronized (this) {
                if (this.r) {
                    return;
                }
                this.r = true;
                this.I.u(this.p, tc2Var, po8.a);
            }
        }
    }

    public final void z(long j) {
        synchronized (this) {
            try {
                fj8.b(this.E, j, 0L, 2);
                long jA = this.E.a();
                if (jA >= this.C.a() / 2) {
                    J(0, jA);
                    fj8.b(this.E, 0L, jA, 1);
                }
                io2 io2Var = this.B;
                fj8 fj8Var = this.E;
                io2Var.getClass();
                fj8Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
