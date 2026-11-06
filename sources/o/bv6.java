package o;

/* JADX INFO: loaded from: classes.dex */
public final class bv6 implements e82 {
    public final xo a;
    public final int b;

    public bv6(String str, int i) {
        this.a = new xo(str);
        this.b = i;
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        String str = this.a.n;
        int i = h82Var.d;
        if (i != -1) {
            h82Var.d(i, h82Var.e, str);
            if (str.length() > 0) {
                h82Var.e(i, str.length() + i);
            }
        } else {
            int i2 = h82Var.b;
            h82Var.d(i2, h82Var.c, str);
            if (str.length() > 0) {
                h82Var.e(i2, str.length() + i2);
            }
        }
        int i3 = h82Var.b;
        int i4 = h82Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iV = ct1.v(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, h82Var.a.k());
        h82Var.f(iV, iV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv6)) {
            return false;
        }
        bv6 bv6Var = (bv6) obj;
        return im3.n(this.a.n, bv6Var.a.n) && this.b == bv6Var.b;
    }

    public final int hashCode() {
        return (this.a.n.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.n + "', newCursorPosition=" + this.b + ")";
    }
}
