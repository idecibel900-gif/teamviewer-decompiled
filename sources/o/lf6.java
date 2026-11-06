package o;

/* JADX INFO: loaded from: classes.dex */
public final class lf6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        float fIntBitsToFloat = Float.intBitsToFloat(0);
        float fIntBitsToFloat2 = Float.intBitsToFloat(0);
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(fIntBitsToFloat2);
    }

    public lf6(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf6)) {
            return false;
        }
        lf6 lf6Var = (lf6) obj;
        return Float.compare(this.a, lf6Var.a) == 0 && Float.compare(this.b, lf6Var.b) == 0 && Float.compare(this.c, lf6Var.c) == 0 && Float.compare(this.d, lf6Var.d) == 0 && qf0.v(this.e, lf6Var.e) && qf0.v(this.f, lf6Var.f) && qf0.v(this.g, lf6Var.g) && qf0.v(this.h, lf6Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + fx3.c(fx3.c(fx3.c(e41.e(this.d, e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strN = lq1.N(this.a);
        String strN2 = lq1.N(this.b);
        String strN3 = lq1.N(this.c);
        String strN4 = lq1.N(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strN);
        sb.append(", ");
        sb.append(strN2);
        sb.append(", ");
        sb.append(strN3);
        String strL = e41.l(sb, ", ", strN4);
        long j = this.e;
        long j2 = this.f;
        boolean zV = qf0.v(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zV && qf0.v(j2, j3) && qf0.v(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return fx3.h("RoundRect(rect=", strL, ", radius=", lq1.N(Float.intBitsToFloat(i)), ")");
            }
            String strN5 = lq1.N(Float.intBitsToFloat(i));
            return e41.l(e41.o("RoundRect(rect=", strL, ", x=", strN5, ", y="), lq1.N(Float.intBitsToFloat(i2)), ")");
        }
        String strX = qf0.X(j);
        String strX2 = qf0.X(j2);
        String strX3 = qf0.X(j3);
        String strX4 = qf0.X(j4);
        StringBuilder sbO = e41.o("RoundRect(rect=", strL, ", topLeft=", strX, ", topRight=");
        e41.t(sbO, strX2, ", bottomRight=", strX3, ", bottomLeft=");
        return e41.l(sbO, strX4, ")");
    }
}
