package o;

/* JADX INFO: loaded from: classes.dex */
public final class cf5 {
    public final mj a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public cf5(mj mjVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = mjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final v56 a(v56 v56Var) {
        return v56Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = gt7.b;
            if (gt7.b(j, j2)) {
                return j2;
            }
        }
        int i = gt7.c;
        int i2 = this.b;
        return h57.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final v56 c(v56 v56Var) {
        float f = -this.f;
        return v56Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return ct1.v(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cf5) {
            cf5 cf5Var = (cf5) obj;
            if (this.a == cf5Var.a && this.b == cf5Var.b && this.c == cf5Var.c && this.d == cf5Var.d && this.e == cf5Var.e && Float.compare(this.f, cf5Var.f) == 0 && Float.compare(this.g, cf5Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + e41.e(this.f, fx3.a(this.e, fx3.a(this.d, fx3.a(this.c, fx3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
