package o;

/* JADX INFO: loaded from: classes.dex */
public final class ot7 {
    public static final ot7 d = new ot7(0, 0, null, 0, 0, 0, 16777215);
    public final c77 a;
    public final gf5 b;
    public final wm5 c;

    public ot7(long j, long j2, ms2 ms2Var, long j3, int i, long j4, int i2) {
        this(new c77((i2 & 1) != 0 ? rv0.h : j, (i2 & 2) != 0 ? qt7.c : j2, (i2 & 4) != 0 ? null : ms2Var, (ks2) null, (ls2) null, (nr2) null, (String) null, (i2 & 128) != 0 ? qt7.c : j3, (h40) null, (cs7) null, (kd4) null, rv0.h, (vp7) null, (lw6) null, (rm5) null, (v52) null), new gf5((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? qt7.c : j4, null, null, null, 0, 0, null), null);
    }

    public static ot7 a(ot7 ot7Var, long j, long j2, ms2 ms2Var, nr2 nr2Var, long j3, long j4, p94 p94Var, int i) {
        bs7 gw0Var;
        wm5 wm5Var = g68.f867o;
        long jB = (i & 1) != 0 ? ot7Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? ot7Var.a.b : j2;
        ms2 ms2Var2 = (i & 4) != 0 ? ot7Var.a.c : ms2Var;
        c77 c77Var = ot7Var.a;
        ks2 ks2Var = c77Var.d;
        ls2 ls2Var = c77Var.e;
        nr2 nr2Var2 = (i & 32) != 0 ? c77Var.f : nr2Var;
        String str = c77Var.g;
        long j6 = (i & 128) != 0 ? c77Var.h : j3;
        h40 h40Var = c77Var.i;
        cs7 cs7Var = c77Var.j;
        kd4 kd4Var = c77Var.k;
        long j7 = c77Var.l;
        vp7 vp7Var = (i & 4096) != 0 ? c77Var.m : vp7.c;
        lw6 lw6Var = c77Var.n;
        v52 v52Var = c77Var.p;
        int i2 = (i & 32768) != 0 ? ot7Var.b.a : 3;
        int i3 = (i & 65536) != 0 ? ot7Var.b.b : 1;
        long j8 = (i & 131072) != 0 ? ot7Var.b.c : j4;
        gf5 gf5Var = ot7Var.b;
        es7 es7Var = gf5Var.d;
        wm5 wm5Var2 = (i & 524288) != 0 ? ot7Var.c : wm5Var;
        p94 p94Var2 = (i & 1048576) != 0 ? gf5Var.f : p94Var;
        int i4 = gf5Var.g;
        int i5 = gf5Var.h;
        dt7 dt7Var = gf5Var.i;
        long jB2 = c77Var.a.b();
        int i6 = rv0.i;
        if (z68.a(jB, jB2)) {
            gw0Var = c77Var.a;
        } else {
            gw0Var = jB != 16 ? new gw0(jB) : as7.a;
        }
        return new ot7(new c77(gw0Var, j5, ms2Var2, ks2Var, ls2Var, nr2Var2, str, j6, h40Var, cs7Var, kd4Var, j7, vp7Var, lw6Var, wm5Var2 != null ? wm5Var2.a : null, v52Var), new gf5(i2, i3, j8, es7Var, wm5Var2 != null ? wm5Var2.b : null, p94Var2, i4, i5, dt7Var), wm5Var2);
    }

    public static ot7 f(ot7 ot7Var, long j, long j2, ms2 ms2Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? qt7.c : j2;
        ms2 ms2Var2 = (i2 & 4) != 0 ? null : ms2Var;
        long j6 = (i2 & 128) != 0 ? qt7.c : j3;
        long j7 = rv0.h;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? qt7.c : j4;
        c77 c77VarA = d77.a(ot7Var.a, j, null, Float.NaN, j5, ms2Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        gf5 gf5VarA = hf5.a(ot7Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (ot7Var.a == c77VarA && ot7Var.b == gf5VarA) ? ot7Var : new ot7(c77VarA, gf5VarA);
    }

    public final sb0 b() {
        return this.a.a.c();
    }

    public final long c() {
        return this.a.a.b();
    }

    public final boolean d(ot7 ot7Var) {
        if (this != ot7Var) {
            return im3.n(this.b, ot7Var.b) && this.a.a(ot7Var.a);
        }
        return true;
    }

    public final ot7 e(ot7 ot7Var) {
        return (ot7Var == null || ot7Var.equals(d)) ? this : new ot7(this.a.c(ot7Var.a), this.b.a(ot7Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot7)) {
            return false;
        }
        ot7 ot7Var = (ot7) obj;
        return im3.n(this.a, ot7Var.a) && im3.n(this.b, ot7Var.b) && im3.n(this.c, ot7Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wm5 wm5Var = this.c;
        return iHashCode + (wm5Var != null ? wm5Var.hashCode() : 0);
    }

    public final String toString() {
        String strH = rv0.h(c());
        sb0 sb0VarB = b();
        c77 c77Var = this.a;
        float fA = c77Var.a.a();
        String strD = qt7.d(c77Var.b);
        ms2 ms2Var = c77Var.c;
        ks2 ks2Var = c77Var.d;
        ls2 ls2Var = c77Var.e;
        nr2 nr2Var = c77Var.f;
        String str = c77Var.g;
        String strD2 = qt7.d(c77Var.h);
        h40 h40Var = c77Var.i;
        cs7 cs7Var = c77Var.j;
        kd4 kd4Var = c77Var.k;
        String strH2 = rv0.h(c77Var.l);
        vp7 vp7Var = c77Var.m;
        lw6 lw6Var = c77Var.n;
        v52 v52Var = c77Var.p;
        gf5 gf5Var = this.b;
        String strA = qo7.a(gf5Var.a);
        String strA2 = xp7.a(gf5Var.b);
        String strD3 = qt7.d(gf5Var.c);
        es7 es7Var = gf5Var.d;
        p94 p94Var = gf5Var.f;
        String strA3 = k94.a(gf5Var.g);
        String strA4 = k93.a(gf5Var.h);
        dt7 dt7Var = gf5Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(sb0VarB);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(ms2Var);
        sb.append(", fontStyle=");
        sb.append(ks2Var);
        sb.append(", fontSynthesis=");
        sb.append(ls2Var);
        sb.append(", fontFamily=");
        sb.append(nr2Var);
        sb.append(", fontFeatureSettings=");
        e41.t(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(h40Var);
        sb.append(", textGeometricTransform=");
        sb.append(cs7Var);
        sb.append(", localeList=");
        sb.append(kd4Var);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(vp7Var);
        sb.append(", shadow=");
        sb.append(lw6Var);
        sb.append(", drawStyle=");
        sb.append(v52Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        e41.t(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(es7Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(p94Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(dt7Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ot7(c77 c77Var, gf5 gf5Var) {
        rm5 rm5Var = c77Var.f499o;
        gm5 gm5Var = gf5Var.e;
        this(c77Var, gf5Var, (rm5Var == null && gm5Var == null) ? null : new wm5(rm5Var, gm5Var));
    }

    public ot7(c77 c77Var, gf5 gf5Var, wm5 wm5Var) {
        this.a = c77Var;
        this.b = gf5Var;
        this.c = wm5Var;
    }
}
