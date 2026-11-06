package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zu4 {
    public xo a;
    public mr2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public hr4 h;
    public in1 j;
    public ot7 k;
    public yc4 l;
    public j04 m;
    public vs7 n;
    public long q;
    public long i = qi3.a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2736o = -1;
    public int p = -1;

    public zu4(xo xoVar, ot7 ot7Var, mr2 mr2Var, int i, boolean z, int i2, int i3, List list) {
        this.a = xoVar;
        this.b = mr2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = ot7Var;
    }

    public final int a(int i, j04 j04Var) {
        int i2 = this.f2736o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = t61.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            hr4 hr4Var = this.h;
            ot7 ot7Var = this.k;
            in1 in1Var = this.j;
            in1Var.getClass();
            hr4 hr4VarN = xo1.N(hr4Var, j04Var, ot7Var, in1Var, this.b);
            this.h = hr4VarN;
            jA = hr4VarN.a(this.f, jA);
        }
        int iF = v67.f(b(jA, j04Var).e);
        int iJ = r61.j(jA);
        if (iF < iJ) {
            iF = iJ;
        }
        this.f2736o = i;
        this.p = iF;
        return iF;
    }

    public final xu4 b(long j, j04 j04Var) {
        yc4 yc4VarE = e(j04Var);
        long jK = xo1.K(j, this.d, this.c, yc4VarE.i());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new xu4(yc4VarE, jK, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, j04 j04Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            hr4 hr4Var = this.h;
            ot7 ot7Var = this.k;
            in1 in1Var = this.j;
            in1Var.getClass();
            hr4 hr4VarN = xo1.N(hr4Var, j04Var, ot7Var, in1Var, this.b);
            this.h = hr4VarN;
            j = hr4VarN.a(this.f, j);
        }
        vs7 vs7Var = this.n;
        if (vs7Var != null) {
            xu4 xu4Var = vs7Var.b;
            us7 us7Var = vs7Var.a;
            if (!xu4Var.a.b()) {
                j04 j04Var2 = us7Var.h;
                long j2 = us7Var.j;
                if (j04Var == j04Var2 && (r61.c(j, j2) || (r61.i(j) == r61.i(j2) && r61.k(j) == r61.k(j2) && r61.h(j) >= xu4Var.e && !xu4Var.c))) {
                    vs7 vs7Var2 = this.n;
                    vs7Var2.getClass();
                    if (r61.c(j, vs7Var2.a.j)) {
                        return false;
                    }
                    vs7 vs7Var3 = this.n;
                    vs7Var3.getClass();
                    this.n = f(j04Var, j, vs7Var3.b);
                    return true;
                }
            }
        }
        this.n = f(j04Var, j, b(j, j04Var));
        return true;
    }

    public final void d(in1 in1Var) {
        long jA;
        in1 in1Var2 = this.j;
        if (in1Var != null) {
            int i = qi3.b;
            jA = qi3.a(in1Var.getDensity(), in1Var.Z());
        } else {
            jA = qi3.a;
        }
        if (in1Var2 == null) {
            this.j = in1Var;
            this.i = jA;
        } else if (in1Var == null || this.i != jA) {
            this.j = in1Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.f2736o = -1;
        }
    }

    public final yc4 e(j04 j04Var) {
        yc4 yc4Var = this.l;
        if (yc4Var == null || j04Var != this.m || yc4Var.b()) {
            this.m = j04Var;
            xo xoVar = this.a;
            ot7 ot7VarC = y57.C(this.k, j04Var);
            in1 in1Var = this.j;
            in1Var.getClass();
            mr2 mr2Var = this.b;
            List list = this.g;
            if (list == null) {
                list = ea2.m;
            }
            yc4Var = new yc4(list, xoVar, in1Var, mr2Var, ot7VarC, this.d);
        }
        this.l = yc4Var;
        return yc4Var;
    }

    public final vs7 f(j04 j04Var, long j, xu4 xu4Var) {
        float fMin = Math.min(xu4Var.a.i(), xu4Var.d);
        xo xoVar = this.a;
        ot7 ot7Var = this.k;
        List list = this.g;
        if (list == null) {
            list = ea2.m;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        in1 in1Var = this.j;
        in1Var.getClass();
        return new vs7(new us7(xoVar, ot7Var, list, i, z, i2, in1Var, j04Var, this.b, j), xu4Var, t61.d(j, (((long) v67.f(fMin)) << 32) | (((long) v67.f(xu4Var.e)) & 4294967295L)));
    }

    public final void g(xo xoVar, ot7 ot7Var, mr2 mr2Var, int i, boolean z, int i2, int i3, List list) {
        this.a = xoVar;
        boolean zD = ot7Var.d(this.k);
        this.k = ot7Var;
        if (!zD) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.f2736o = -1;
        }
        this.b = mr2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.f2736o = -1;
    }

    public final String toString() {
        us7 us7Var;
        Object r61Var = "null";
        String str = this.n != null ? "<TextLayoutResult>" : "null";
        String strB = qi3.b(this.i);
        long j = this.q;
        vs7 vs7Var = this.n;
        if (vs7Var != null && (us7Var = vs7Var.a) != null) {
            r61Var = new r61(us7Var.j);
        }
        StringBuilder sbO = e41.o("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbO.append(j);
        sbO.append(", constraints=");
        sbO.append(r61Var);
        sbO.append(")");
        return sbO.toString();
    }
}
