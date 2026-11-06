package o;

import java.io.Closeable;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class lc6 implements Closeable {
    public final v08 A;
    public final boolean B;
    public final ab6 m;
    public final yw5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1350o;
    public final int p;
    public final s43 q;
    public final k53 r;
    public final nc6 s;
    public final n57 t;
    public final lc6 u;
    public final lc6 v;
    public final lc6 w;
    public final long x;
    public final long y;
    public final io.sentry.z7 z;

    public lc6(ab6 ab6Var, yw5 yw5Var, String str, int i, s43 s43Var, k53 k53Var, nc6 nc6Var, n57 n57Var, lc6 lc6Var, lc6 lc6Var2, lc6 lc6Var3, long j, long j2, io.sentry.z7 z7Var, v08 v08Var) {
        ab6Var.getClass();
        yw5Var.getClass();
        str.getClass();
        nc6Var.getClass();
        v08Var.getClass();
        this.m = ab6Var;
        this.n = yw5Var;
        this.f1350o = str;
        this.p = i;
        this.q = s43Var;
        this.r = k53Var;
        this.s = nc6Var;
        this.t = n57Var;
        this.u = lc6Var;
        this.v = lc6Var2;
        this.w = lc6Var3;
        this.x = j;
        this.y = j2;
        this.z = z7Var;
        this.A = v08Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.B = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final jc6 e() {
        jc6 jc6Var = new jc6();
        jc6Var.c = -1;
        jc6Var.g = nc6.m;
        jc6Var.f1148o = v08.j;
        jc6Var.a = this.m;
        jc6Var.b = this.n;
        jc6Var.c = this.p;
        jc6Var.d = this.f1350o;
        jc6Var.e = this.q;
        jc6Var.f = i67.k(this.r);
        jc6Var.g = this.s;
        jc6Var.h = this.t;
        jc6Var.i = this.u;
        jc6Var.j = this.v;
        jc6Var.k = this.w;
        jc6Var.l = this.x;
        jc6Var.m = this.y;
        jc6Var.n = this.z;
        jc6Var.f1148o = this.A;
        return jc6Var;
    }

    public final mc6 j() throws EOFException {
        nc6 nc6Var = this.s;
        w36 w36VarPeek = nc6Var.E0().peek();
        bf0 bf0Var = new bf0();
        w36VarPeek.m0(153601L);
        long jMin = Math.min(153601L, w36VarPeek.n.n);
        while (jMin > 0) {
            long jI0 = w36VarPeek.i0(bf0Var, jMin);
            if (jI0 == -1) {
                throw new EOFException();
            }
            jMin -= jI0;
        }
        mc6 mc6Var = nc6.m;
        return new mc6(nc6Var.q(), bf0Var.n, bf0Var);
    }

    public final String toString() {
        return "Response{protocol=" + this.n + ", code=" + this.p + ", message=" + this.f1350o + ", url=" + this.m.a + '}';
    }
}
