package o;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class nj3 {
    public static final nj3 e = new nj3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nj3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static nj3 a(nj3 nj3Var, nj3 nj3Var2) {
        return b(Math.max(nj3Var.a, nj3Var2.a), Math.max(nj3Var.b, nj3Var2.b), Math.max(nj3Var.c, nj3Var2.c), Math.max(nj3Var.d, nj3Var2.d));
    }

    public static nj3 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new nj3(i, i2, i3, i4);
    }

    public static nj3 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return eq.r(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj3.class != obj.getClass()) {
            return false;
        }
        nj3 nj3Var = (nj3) obj;
        return this.d == nj3Var.d && this.a == nj3Var.a && this.c == nj3Var.c && this.b == nj3Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return e41.j(sb, this.d, '}');
    }
}
