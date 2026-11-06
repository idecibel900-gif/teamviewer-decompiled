package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2 {
    public x2[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2366o;
    public qd7 p;

    public final x2 e() {
        x2 x2VarF;
        qd7 qd7Var;
        synchronized (this) {
            try {
                x2[] x2VarArrG = this.m;
                if (x2VarArrG == null) {
                    x2VarArrG = g();
                    this.m = x2VarArrG;
                } else if (this.n >= x2VarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(x2VarArrG, x2VarArrG.length * 2);
                    this.m = (x2[]) objArrCopyOf;
                    x2VarArrG = (x2[]) objArrCopyOf;
                }
                int i = this.f2366o;
                do {
                    x2VarF = x2VarArrG[i];
                    if (x2VarF == null) {
                        x2VarF = f();
                        x2VarArrG[i] = x2VarF;
                    }
                    i++;
                    if (i >= x2VarArrG.length) {
                        i = 0;
                    }
                } while (!x2VarF.a(this));
                this.f2366o = i;
                this.n++;
                qd7Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qd7Var != null) {
            qd7Var.x(1);
        }
        return x2VarF;
    }

    public x2 f() {
        return new m97();
    }

    public x2[] g() {
        return new m97[2];
    }

    public final void h(x2 x2Var) {
        qd7 qd7Var;
        int i;
        hc1[] hc1VarArrB;
        synchronized (this) {
            try {
                int i2 = this.n - 1;
                this.n = i2;
                qd7Var = this.p;
                if (i2 == 0) {
                    this.f2366o = 0;
                }
                x2Var.getClass();
                hc1VarArrB = x2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (hc1 hc1Var : hc1VarArrB) {
            if (hc1Var != null) {
                hc1Var.resumeWith(f88.a);
            }
        }
        if (qd7Var != null) {
            qd7Var.x(-1);
        }
    }

    public final qd7 i() {
        qd7 qd7Var;
        synchronized (this) {
            qd7Var = this.p;
            if (qd7Var == null) {
                int i = this.n;
                qd7Var = new qd7(1, Integer.MAX_VALUE, df0.n);
                qd7Var.r(Integer.valueOf(i));
                this.p = qd7Var;
            }
        }
        return qd7Var;
    }
}
