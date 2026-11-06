package o;

/* JADX INFO: loaded from: classes.dex */
public final class ev7 {
    public final kw4 a;
    public dv7 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public ev7() {
        kw4 kw4Var = uk3.a;
        this.a = new kw4();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public static long a(dv7 dv7Var, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = dv7Var.c;
        if (j5 > 0) {
            long j6 = dv7Var.j;
            if (j6 > 0) {
                if (j3 - j6 < j5) {
                    return Math.min(j4, j6 + j5);
                }
                dv7Var.i = j3;
                dv7Var.j = -1L;
                dv7Var.a(dv7Var.g, dv7Var.h, j, j2, fArr);
                return j4;
            }
        }
        return j4;
    }

    public final void b(dv7 dv7Var, long j, long j2, float[] fArr, long j3) {
        long j4 = dv7Var.i;
        long j5 = dv7Var.c;
        boolean z = j3 - j4 > ((long) dv7Var.b) || j4 == Long.MIN_VALUE;
        boolean z2 = j5 == 0;
        dv7Var.j = j3;
        if (z && z2) {
            dv7Var.i = j3;
            dv7Var.a(dv7Var.g, dv7Var.h, j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j6 = this.c;
        long j7 = j3 + j5;
        if (j6 <= 0 || j7 >= j6) {
            return;
        }
        this.c = j6;
    }

    public final boolean c(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (vk3.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!vk3.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
