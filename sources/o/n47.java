package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class n47 {
    public t47 a;
    public long b;
    public boolean c;
    public int d;

    public n47(long j, t47 t47Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = t47Var;
        this.b = j;
        vs6 vs6Var = v47.a;
        if (j != 0) {
            t47 t47VarD = d();
            long j2 = t47VarD.f2083o;
            long[] jArr = t47VarD.p;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = t47VarD.n;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = t47VarD.m;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (v47.c) {
                iA = v47.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(n47 n47Var) {
        v47.b.E(n47Var);
    }

    public final void a() {
        synchronized (v47.c) {
            b();
            p();
        }
    }

    public void b() {
        v47.d = v47.d.b(g());
    }

    public abstract void c();

    public t47 d() {
        return this.a;
    }

    public abstract Function1 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public Function1 i() {
        return null;
    }

    public final n47 j() {
        ep3 ep3Var = v47.b;
        n47 n47Var = (n47) ep3Var.get();
        ep3Var.E(this);
        return n47Var;
    }

    public void k() {
        j51.X();
        throw null;
    }

    public void l() {
        j51.X();
        throw null;
    }

    public void m() {
    }

    public void n(s97 s97Var) {
        vs6 vs6Var = v47.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            v47.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(t47 t47Var) {
        this.a = t47Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract n47 u(Function1 function1);
}
