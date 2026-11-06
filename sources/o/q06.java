package o;

/* JADX INFO: loaded from: classes2.dex */
public final class q06 {
    public static final q06 f = new q06();
    public final r94 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public q06(r94 r94Var, int i, int i2, int i3, int i4) {
        this.a = r94Var;
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            hk0.g("Attribute range positions must be non-negative");
            throw null;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q06.class == obj.getClass()) {
            q06 q06Var = (q06) obj;
            if (this.b == q06Var.b && this.c == q06Var.c && this.d == q06Var.d && this.e == q06Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbB = lb7.b();
        r94 r94Var = this.a;
        int i = this.b;
        sbB.append(i != -1 ? new t06(r94Var, i, this.c) : t06.g);
        sbB.append('=');
        sbB.append(i != -1 ? new t06(r94Var, this.d, this.e) : t06.g);
        return lb7.k(sbB);
    }

    public q06() {
        this.a = t06.d;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}
