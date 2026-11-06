package o;

/* JADX INFO: loaded from: classes.dex */
public final class gm implements qj8 {
    public final short a;
    public final String b;
    public final bg5 c = h57.p(nj3.e);
    public final bg5 d = h57.p(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public gm(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // o.qj8
    public final int a(in1 in1Var, j04 j04Var) {
        return e().c;
    }

    @Override // o.qj8
    public final int b(in1 in1Var) {
        return e().d;
    }

    @Override // o.qj8
    public final int c(in1 in1Var, j04 j04Var) {
        return e().a;
    }

    @Override // o.qj8
    public final int d(in1 in1Var) {
        return e().b;
    }

    public final nj3 e() {
        return (nj3) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gm) {
            return this.a == ((gm) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(sk8 sk8Var, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(sk8Var.a.i(s));
            f(sk8Var.a.u(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
