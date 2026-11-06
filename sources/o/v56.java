package o;

/* JADX INFO: loaded from: classes.dex */
public final class v56 {
    public static final v56 e = new v56(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public v56(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final v56 e(v56 v56Var) {
        return new v56(Math.max(this.a, v56Var.a), Math.max(this.b, v56Var.b), Math.min(this.c, v56Var.c), Math.min(this.d, v56Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v56)) {
            return false;
        }
        v56 v56Var = (v56) obj;
        return Float.compare(this.a, v56Var.a) == 0 && Float.compare(this.b, v56Var.b) == 0 && Float.compare(this.c, v56Var.c) == 0 && Float.compare(this.d, v56Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(v56 v56Var) {
        return (this.a < v56Var.c) & (v56Var.a < this.c) & (this.b < v56Var.d) & (v56Var.b < this.d);
    }

    public final v56 h(float f, float f2) {
        return new v56(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final v56 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new v56(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strN = lq1.N(this.a);
        String strN2 = lq1.N(this.b);
        return e41.m(e41.o("Rect.fromLTRB(", strN, ", ", strN2, ", "), lq1.N(this.c), ", ", lq1.N(this.d), ")");
    }
}
