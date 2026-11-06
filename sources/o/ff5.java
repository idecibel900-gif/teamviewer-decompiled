package o;

/* JADX INFO: loaded from: classes.dex */
public final class ff5 {
    public String a;
    public ot7 b;
    public mr2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public in1 i;
    public mj j;
    public boolean k;
    public long l;
    public hr4 m;
    public ef5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j04 f792o;
    public long p;
    public int q;
    public int r;
    public long s;

    public ff5(String str, ot7 ot7Var, mr2 mr2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = ot7Var;
        this.c = mr2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = qi3.b;
        this.h = qi3.a;
        this.l = 0L;
        if (!(true & true)) {
            mi3.a("width and height must be >= 0");
        }
        this.p = t61.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(ff5 ff5Var, long j, j04 j04Var) {
        ot7 ot7Var = ff5Var.b;
        hr4 hr4Var = ff5Var.m;
        in1 in1Var = ff5Var.i;
        in1Var.getClass();
        hr4 hr4VarN = xo1.N(hr4Var, j04Var, ot7Var, in1Var, ff5Var.c);
        ff5Var.m = hr4VarN;
        return hr4VarN.a(ff5Var.g, j);
    }

    public final int a(int i, j04 j04Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = t61.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, j04Var);
        }
        ef5 ef5VarE = e(j04Var);
        long jK = xo1.K(jA, this.e, this.d, ef5VarE.i());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iF = v67.f(new mj((qj) ef5VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jK).f);
        int iJ = r61.j(jA);
        if (iF < iJ) {
            iF = iJ;
        }
        this.q = i;
        this.r = iF;
        return iF;
    }

    public final boolean b(long j, j04 j04Var) {
        ef5 ef5Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, j04Var) : j;
        mj mjVar = this.j;
        boolean z2 = false;
        if (mjVar != null && (ef5Var = this.n) != null && !ef5Var.b() && j04Var == this.f792o && (r61.c(jF, this.p) || (r61.i(jF) == r61.i(this.p) && r61.k(jF) == r61.k(this.p) && r61.h(jF) >= mjVar.f && !mjVar.d.d))) {
            if (!r61.c(jF, this.p)) {
                mj mjVar2 = this.j;
                mjVar2.getClass();
                long jD = t61.d(jF, (((long) v67.f(Math.min(mjVar2.a.u.c(), mjVar2.c()))) << 32) | (((long) v67.f(mjVar2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= mjVar2.c() && ((int) (4294967295L & jD)) >= mjVar2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        ef5 ef5VarE = e(j04Var);
        long jK = xo1.K(jF, this.e, this.d, ef5VarE.i());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        mj mjVar3 = new mj((qj) ef5VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jK);
        this.p = jF;
        int iF = v67.f(mjVar3.c());
        float f = mjVar3.f;
        long jD2 = t61.d(jF, (((long) v67.f(f)) & 4294967295L) | (((long) iF) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < mjVar3.c() || ((int) (jD2 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = mjVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.f792o = null;
        this.q = -1;
        this.r = -1;
        this.p = t61.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(in1 in1Var) {
        long jA;
        in1 in1Var2 = this.i;
        if (in1Var != null) {
            int i = qi3.b;
            jA = qi3.a(in1Var.getDensity(), in1Var.Z());
        } else {
            jA = qi3.a;
        }
        if (in1Var2 == null) {
            this.i = in1Var;
            this.h = jA;
        } else if (in1Var == null || this.h != jA) {
            this.i = in1Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ef5 e(j04 j04Var) {
        ef5 qjVar = this.n;
        if (qjVar == null || j04Var != this.f792o || qjVar.b()) {
            this.f792o = j04Var;
            String str = this.a;
            ot7 ot7VarC = y57.C(this.b, j04Var);
            in1 in1Var = this.i;
            in1Var.getClass();
            mr2 mr2Var = this.c;
            boolean z = this.e;
            ea2 ea2Var = ea2.m;
            qjVar = new qj(str, ot7VarC, ea2Var, ea2Var, mr2Var, in1Var, z);
        }
        this.n = qjVar;
        return qjVar;
    }

    public final String toString() {
        return e41.k(e41.o("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", qi3.b(this.h), ", history="), this.s, ", constraints=$)");
    }
}
