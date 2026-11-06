package o;

/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements e82 {
    public final xo a;
    public final int b;

    public cx0(String str, int i) {
        this(new xo(str), i);
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        int i = h82Var.d;
        xo xoVar = this.a;
        if (i != -1) {
            h82Var.d(i, h82Var.e, xoVar.n);
        } else {
            h82Var.d(h82Var.b, h82Var.c, xoVar.n);
        }
        int i2 = h82Var.b;
        int i3 = h82Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iV = ct1.v(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - xoVar.n.length(), 0, h82Var.a.k());
        h82Var.f(iV, iV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx0)) {
            return false;
        }
        cx0 cx0Var = (cx0) obj;
        return im3.n(this.a.n, cx0Var.a.n) && this.b == cx0Var.b;
    }

    public final int hashCode() {
        return (this.a.n.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.n + "', newCursorPosition=" + this.b + ")";
    }

    public cx0(xo xoVar, int i) {
        this.a = xoVar;
        this.b = i;
    }
}
