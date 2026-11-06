package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o96 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final es4 g;

    public o96(long j, long j2, long j3, long j4, long j5, float[] fArr, es4 es4Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = es4Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && o96.class == obj.getClass()) {
                o96 o96Var = (o96) obj;
                if (this.a == o96Var.a && this.b == o96Var.b && this.e == o96Var.e && vk3.a(this.c, o96Var.c) && vk3.a(this.d, o96Var.d)) {
                    float[] fArr = o96Var.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.g.equals(o96Var.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iC = fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
