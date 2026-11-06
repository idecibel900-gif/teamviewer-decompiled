package o;

/* JADX INFO: loaded from: classes.dex */
public final class cc7 extends v52 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public cc7(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc7)) {
            return false;
        }
        cc7 cc7Var = (cc7) obj;
        return this.a == cc7Var.a && this.b == cc7Var.b && this.c == cc7Var.c && this.d == cc7Var.d;
    }

    public final int hashCode() {
        return fx3.a(this.d, fx3.a(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        return e41.m(e41.n("Stroke(width=", this.a, ", miter=", this.b, ", cap="), str, ", join=", str2, ", pathEffect=null)");
    }
}
