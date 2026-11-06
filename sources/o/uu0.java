package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu0 {
    public int m;
    public Object n;

    public uu0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i);

    public void F() throws pm3 {
        boolean zE;
        do {
            int iB = B();
            if (iB == 0) {
                return;
            }
            int i = this.m;
            if (i >= 100) {
                throw new pm3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.m = i + 1;
            zE = E(iB);
            this.m--;
        } while (zE);
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public void f(xj8 xj8Var) {
    }

    public void g(xj8 xj8Var) {
    }

    public abstract sk8 h(sk8 sk8Var, List list);

    public abstract lh7 i(xj8 xj8Var, lh7 lh7Var);

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean l();

    public abstract wh0 m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract int s();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public uu0() {
    }

    public uu0(int i) {
        this.m = i;
    }
}
