package o;

/* JADX INFO: loaded from: classes.dex */
public final class kg0 implements to {
    public static final long d = h67.n(1.0f, 8589934592L);
    public static final kg0 e;
    public final long a;
    public final long b;
    public final long c;

    static {
        long jH = h67.h(0.25d);
        e = new kg0(jH, jH, h67.h(0.25d));
    }

    public kg0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kg0)) {
            return false;
        }
        kg0 kg0Var = (kg0) obj;
        if (!qt7.a(this.a, kg0Var.a) || !qt7.a(this.b, kg0Var.b)) {
            return false;
        }
        qt7.a(this.c, kg0Var.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = pr0.b.hashCode() * 31;
        rt7[] rt7VarArr = qt7.b;
        return zk2.a.hashCode() + e41.e(Float.NaN, fx3.c(fx3.c(fx3.c(iHashCode, 31, this.a), 31, this.b), 961, this.c), 31);
    }

    public final String toString() {
        pr0 pr0Var = pr0.b;
        String strD = qt7.d(this.a);
        String strD2 = qt7.d(this.b);
        String strD3 = qt7.d(this.c);
        StringBuilder sb = new StringBuilder("Bullet(shape=");
        sb.append(pr0Var);
        sb.append(", size=(");
        sb.append(strD);
        sb.append(", ");
        e41.t(sb, strD2, "), padding=", strD3, ", brush=null, alpha=NaN, drawStyle=");
        sb.append(zk2.a);
        sb.append(")");
        return sb.toString();
    }
}
