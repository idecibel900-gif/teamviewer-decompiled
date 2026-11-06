package o;

/* JADX INFO: loaded from: classes.dex */
public final class we3 {
    public static int k;
    public static final ir l = new ir(20);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ac8 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public we3(String str, float f, float f2, float f3, float f4, ac8 ac8Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ac8Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we3)) {
            return false;
        }
        we3 we3Var = (we3) obj;
        if (!im3.n(this.a, we3Var.a) || !w32.b(this.b, we3Var.b) || !w32.b(this.c, we3Var.c) || this.d != we3Var.d || this.e != we3Var.e || !this.f.equals(we3Var.f)) {
            return false;
        }
        long j = we3Var.g;
        int i = rv0.i;
        return z68.a(this.g, j) && this.h == we3Var.h && this.i == we3Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + e41.e(this.e, e41.e(this.d, e41.e(this.c, e41.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = rv0.i;
        return Boolean.hashCode(this.i) + fx3.a(this.h, fx3.c(iHashCode, 31, this.g), 31);
    }
}
