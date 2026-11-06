package o;

/* JADX INFO: loaded from: classes.dex */
public final class zk3 {
    public static final zk3 e = new zk3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zk3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static zk3 a(zk3 zk3Var, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = zk3Var.a;
        }
        if ((i5 & 2) != 0) {
            i2 = zk3Var.b;
        }
        if ((i5 & 4) != 0) {
            i3 = zk3Var.c;
        }
        if ((i5 & 8) != 0) {
            i4 = zk3Var.d;
        }
        zk3Var.getClass();
        return new zk3(i, i2, i3, i4);
    }

    public final long b() {
        return (((long) ((c() / 2) + this.b)) & 4294967295L) | (((long) ((f() / 2) + this.a)) << 32);
    }

    public final int c() {
        return this.d - this.b;
    }

    public final long d() {
        return (((long) f()) << 32) | (((long) c()) & 4294967295L);
    }

    public final long e() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return this.a == zk3Var.a && this.b == zk3Var.b && this.c == zk3Var.c && this.d == zk3Var.d;
    }

    public final int f() {
        return this.c - this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fx3.a(this.c, fx3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = fx3.j(this.a, this.b, "IntRect.fromLTRB(", ", ", ", ");
        sbJ.append(this.c);
        sbJ.append(", ");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
