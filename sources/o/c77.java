package o;

/* JADX INFO: loaded from: classes.dex */
public final class c77 implements to {
    public final bs7 a;
    public final long b;
    public final ms2 c;
    public final ks2 d;
    public final ls2 e;
    public final nr2 f;
    public final String g;
    public final long h;
    public final h40 i;
    public final cs7 j;
    public final kd4 k;
    public final long l;
    public final vp7 m;
    public final lw6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final rm5 f499o;
    public final v52 p;

    public c77(long j, long j2, ms2 ms2Var, ks2 ks2Var, ls2 ls2Var, nr2 nr2Var, String str, long j3, h40 h40Var, cs7 cs7Var, kd4 kd4Var, long j4, vp7 vp7Var, lw6 lw6Var, int i) {
        this((i & 1) != 0 ? rv0.h : j, (i & 2) != 0 ? qt7.c : j2, (i & 4) != 0 ? null : ms2Var, (i & 8) != 0 ? null : ks2Var, (i & 16) != 0 ? null : ls2Var, (i & 32) != 0 ? null : nr2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? qt7.c : j3, (i & 256) != 0 ? null : h40Var, (i & 512) != 0 ? null : cs7Var, (i & 1024) != 0 ? null : kd4Var, (i & 2048) != 0 ? rv0.h : j4, (i & 4096) != 0 ? null : vp7Var, (i & 8192) != 0 ? null : lw6Var, (rm5) null, (v52) null);
    }

    public final boolean a(c77 c77Var) {
        if (this == c77Var) {
            return true;
        }
        if (!qt7.a(this.b, c77Var.b) || !im3.n(this.c, c77Var.c) || !im3.n(this.d, c77Var.d) || !im3.n(this.e, c77Var.e) || !im3.n(this.f, c77Var.f) || !im3.n(this.g, c77Var.g) || !qt7.a(this.h, c77Var.h) || !im3.n(this.i, c77Var.i) || !im3.n(this.j, c77Var.j) || !im3.n(this.k, c77Var.k)) {
            return false;
        }
        long j = c77Var.l;
        int i = rv0.i;
        return z68.a(this.l, j) && im3.n(this.f499o, c77Var.f499o);
    }

    public final boolean b(c77 c77Var) {
        return im3.n(this.a, c77Var.a) && im3.n(this.m, c77Var.m) && im3.n(this.n, c77Var.n) && im3.n(this.p, c77Var.p);
    }

    public final c77 c(c77 c77Var) {
        if (c77Var == null) {
            return this;
        }
        bs7 bs7Var = c77Var.a;
        return d77.a(this, bs7Var.b(), bs7Var.c(), bs7Var.a(), c77Var.b, c77Var.c, c77Var.d, c77Var.e, c77Var.f, c77Var.g, c77Var.h, c77Var.i, c77Var.j, c77Var.k, c77Var.l, c77Var.m, c77Var.n, c77Var.f499o, c77Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c77)) {
            return false;
        }
        c77 c77Var = (c77) obj;
        return a(c77Var) && b(c77Var);
    }

    public final int hashCode() {
        bs7 bs7Var = this.a;
        long jB = bs7Var.b();
        int i = rv0.i;
        int iHashCode = Long.hashCode(jB) * 31;
        sb0 sb0VarC = bs7Var.c();
        int iHashCode2 = (Float.hashCode(bs7Var.a()) + ((iHashCode + (sb0VarC != null ? sb0VarC.hashCode() : 0)) * 31)) * 31;
        rt7[] rt7VarArr = qt7.b;
        int iC = fx3.c(iHashCode2, 31, this.b);
        ms2 ms2Var = this.c;
        int i2 = (iC + (ms2Var != null ? ms2Var.m : 0)) * 31;
        ks2 ks2Var = this.d;
        int iHashCode3 = (i2 + (ks2Var != null ? Integer.hashCode(ks2Var.a) : 0)) * 31;
        ls2 ls2Var = this.e;
        int iHashCode4 = (iHashCode3 + (ls2Var != null ? Integer.hashCode(ls2Var.a) : 0)) * 31;
        nr2 nr2Var = this.f;
        int iHashCode5 = (iHashCode4 + (nr2Var != null ? nr2Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = fx3.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        h40 h40Var = this.i;
        int iHashCode6 = (iC2 + (h40Var != null ? Float.hashCode(h40Var.a) : 0)) * 31;
        cs7 cs7Var = this.j;
        int iHashCode7 = (iHashCode6 + (cs7Var != null ? cs7Var.hashCode() : 0)) * 31;
        kd4 kd4Var = this.k;
        int iC3 = fx3.c((iHashCode7 + (kd4Var != null ? kd4Var.m.hashCode() : 0)) * 31, 31, this.l);
        vp7 vp7Var = this.m;
        int i3 = (iC3 + (vp7Var != null ? vp7Var.a : 0)) * 31;
        lw6 lw6Var = this.n;
        int iHashCode8 = (i3 + (lw6Var != null ? lw6Var.hashCode() : 0)) * 31;
        rm5 rm5Var = this.f499o;
        int iHashCode9 = (iHashCode8 + (rm5Var != null ? rm5Var.hashCode() : 0)) * 31;
        v52 v52Var = this.p;
        return iHashCode9 + (v52Var != null ? v52Var.hashCode() : 0);
    }

    public final String toString() {
        bs7 bs7Var = this.a;
        String strH = rv0.h(bs7Var.b());
        sb0 sb0VarC = bs7Var.c();
        float fA = bs7Var.a();
        String strD = qt7.d(this.b);
        String strD2 = qt7.d(this.h);
        String strH2 = rv0.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(sb0VarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        e41.t(sb, this.g, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.f499o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public c77(bs7 bs7Var, long j, ms2 ms2Var, ks2 ks2Var, ls2 ls2Var, nr2 nr2Var, String str, long j2, h40 h40Var, cs7 cs7Var, kd4 kd4Var, long j3, vp7 vp7Var, lw6 lw6Var, rm5 rm5Var, v52 v52Var) {
        this.a = bs7Var;
        this.b = j;
        this.c = ms2Var;
        this.d = ks2Var;
        this.e = ls2Var;
        this.f = nr2Var;
        this.g = str;
        this.h = j2;
        this.i = h40Var;
        this.j = cs7Var;
        this.k = kd4Var;
        this.l = j3;
        this.m = vp7Var;
        this.n = lw6Var;
        this.f499o = rm5Var;
        this.p = v52Var;
    }

    public c77(long j, long j2, ms2 ms2Var, ks2 ks2Var, ls2 ls2Var, nr2 nr2Var, String str, long j3, h40 h40Var, cs7 cs7Var, kd4 kd4Var, long j4, vp7 vp7Var, lw6 lw6Var, rm5 rm5Var, v52 v52Var) {
        bs7 gw0Var;
        if (j != 16) {
            gw0Var = new gw0(j);
        } else {
            gw0Var = as7.a;
        }
        this(gw0Var, j2, ms2Var, ks2Var, ls2Var, nr2Var, str, j3, h40Var, cs7Var, kd4Var, j4, vp7Var, lw6Var, rm5Var, v52Var);
    }
}
