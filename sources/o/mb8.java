package o;

/* JADX INFO: loaded from: classes.dex */
public final class mb8 implements qj8 {
    public final String a;
    public final bg5 b;

    public mb8(wj3 wj3Var, String str) {
        this.a = str;
        this.b = h57.p(wj3Var);
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

    public final wj3 e() {
        return (wj3) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mb8) {
            return im3.n(e(), ((mb8) obj).e());
        }
        return false;
    }

    public final void f(wj3 wj3Var) {
        this.b.setValue(wj3Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
