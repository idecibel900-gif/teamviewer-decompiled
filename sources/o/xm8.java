package o;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class xm8 {
    public final String a;
    public lm8 b;
    public final String c;
    public final String d;
    public final pg1 e;
    public final pg1 f;
    public long g;
    public final long h;
    public final long i;
    public final q61 j;
    public final int k;
    public final g20 l;
    public final long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2535o;
    public final long p;
    public boolean q;
    public final jb5 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        we4.i("WorkSpec");
    }

    public /* synthetic */ xm8(String str, lm8 lm8Var, String str2, String str3, pg1 pg1Var, pg1 pg1Var2, long j, long j2, long j3, q61 q61Var, int i, g20 g20Var, long j4, long j5, long j6, long j7, boolean z, jb5 jb5Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? lm8.m : lm8Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? pg1.b : pg1Var, (i5 & 32) != 0 ? pg1.b : pg1Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? q61.j : q61Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? g20.m : g20Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? jb5.m : jb5Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public final long a() {
        lm8 lm8Var = this.b;
        lm8 lm8Var2 = lm8.m;
        int i = this.k;
        boolean z = lm8Var == lm8Var2 && i > 0;
        long j = this.n;
        boolean zB = b();
        long jScalb = this.g;
        g20 g20Var = this.l;
        g20Var.getClass();
        long j2 = this.u;
        int i2 = this.s;
        if (j2 != Long.MAX_VALUE && zB) {
            if (i2 == 0) {
                return j2;
            }
            long j3 = j + 900000;
            return j2 < j3 ? j3 : j2;
        }
        if (z) {
            g20 g20Var2 = g20.n;
            long j4 = this.m;
            jScalb = g20Var == g20Var2 ? j4 * ((long) i) : (long) Math.scalb(j4, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
        } else {
            if (zB) {
                long j5 = this.h;
                long j6 = i2 == 0 ? j + jScalb : j + j5;
                long j7 = this.i;
                return (j7 == j5 || i2 != 0) ? j6 : j6 + (j5 - j7);
            }
            if (j == -1) {
                return Long.MAX_VALUE;
            }
        }
        return j + jScalb;
    }

    public final boolean b() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm8)) {
            return false;
        }
        xm8 xm8Var = (xm8) obj;
        return im3.n(this.a, xm8Var.a) && this.b == xm8Var.b && im3.n(this.c, xm8Var.c) && im3.n(this.d, xm8Var.d) && im3.n(this.e, xm8Var.e) && im3.n(this.f, xm8Var.f) && this.g == xm8Var.g && this.h == xm8Var.h && this.i == xm8Var.i && im3.n(this.j, xm8Var.j) && this.k == xm8Var.k && this.l == xm8Var.l && this.m == xm8Var.m && this.n == xm8Var.n && this.f2535o == xm8Var.f2535o && this.p == xm8Var.p && this.q == xm8Var.q && this.r == xm8Var.r && this.s == xm8Var.s && this.t == xm8Var.t && this.u == xm8Var.u && this.v == xm8Var.v && this.w == xm8Var.w && im3.n(this.x, xm8Var.x) && im3.n(this.y, xm8Var.y);
    }

    public final int hashCode() {
        int iA = fx3.a(this.w, fx3.a(this.v, fx3.c(fx3.a(this.t, fx3.a(this.s, (this.r.hashCode() + to7.f(fx3.c(fx3.c(fx3.c(fx3.c((this.l.hashCode() + fx3.a(this.k, (this.j.hashCode() + fx3.c(fx3.c(fx3.c((this.f.hashCode() + ((this.e.hashCode() + to7.e(to7.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.f2535o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return fx3.g("{WorkSpec: ", this.a, "}");
    }

    public xm8(String str, lm8 lm8Var, String str2, String str3, pg1 pg1Var, pg1 pg1Var2, long j, long j2, long j3, q61 q61Var, int i, g20 g20Var, long j4, long j5, long j6, long j7, boolean z, jb5 jb5Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        lm8Var.getClass();
        str2.getClass();
        str3.getClass();
        pg1Var.getClass();
        pg1Var2.getClass();
        q61Var.getClass();
        g20Var.getClass();
        jb5Var.getClass();
        this.a = str;
        this.b = lm8Var;
        this.c = str2;
        this.d = str3;
        this.e = pg1Var;
        this.f = pg1Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = q61Var;
        this.k = i;
        this.l = g20Var;
        this.m = j4;
        this.n = j5;
        this.f2535o = j6;
        this.p = j7;
        this.q = z;
        this.r = jb5Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
