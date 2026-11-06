package o;

/* JADX INFO: loaded from: classes.dex */
public final class jd6 implements in1 {
    public pw6 A;
    public boolean B;
    public long C;
    public d04 D;
    public in1 E;
    public j04 F;
    public tv0 G;
    public byte H;
    public vs1 I;
    public int m;
    public float n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1153o = 1.0f;
    public float p = 1.0f;
    public float q;
    public float r;
    public float s;
    public long t;
    public long u;
    public float v;
    public float w;
    public float x;
    public float y;
    public long z;

    public jd6() {
        long j = p03.a;
        this.t = j;
        this.u = j;
        this.y = 8.0f;
        this.z = d18.b;
        this.A = kh.V;
        this.C = 9205357640488583168L;
        this.D = d04.a;
        this.E = mo8.b();
        this.F = j04.m;
        this.H = (byte) 3;
    }

    public final void A(float f) {
        if (this.q == f) {
            return;
        }
        this.m |= 8;
        this.q = f;
    }

    public final void C(float f) {
        if (this.r == f) {
            return;
        }
        this.m |= 16;
        this.r = f;
    }

    @Override // o.in1
    public final float Z() {
        return this.E.Z();
    }

    public final void a() {
        k(1.0f);
        l(1.0f);
        b(1.0f);
        A(0.0f);
        C(0.0f);
        m(0.0f);
        long j = p03.a;
        c(j);
        s(j);
        g(0.0f);
        h(0.0f);
        j(0.0f);
        if (this.y != 8.0f) {
            this.m |= 2048;
            this.y = 8.0f;
        }
        z(d18.b);
        o(kh.V);
        e(false);
        f(null);
        if (this.H != 3) {
            this.m |= 524288;
            this.H = (byte) 3;
        }
        d04 d04Var = d04.a;
        if (!im3.n(this.D, d04Var)) {
            this.m |= 1048576;
            this.D = d04Var;
        }
        this.C = 9205357640488583168L;
        this.I = null;
        this.m = 0;
    }

    public final void b(float f) {
        if (this.p == f) {
            return;
        }
        this.m |= 4;
        this.p = f;
    }

    public final void c(long j) {
        long j2 = this.t;
        int i = rv0.i;
        if (z68.a(j2, j)) {
            return;
        }
        this.m |= 64;
        this.t = j;
    }

    public final void e(boolean z) {
        if (this.B != z) {
            this.m |= 16384;
            this.B = z;
        }
    }

    public final void f(tv0 tv0Var) {
        if (im3.n(this.G, tv0Var)) {
            return;
        }
        this.m |= 262144;
        this.G = tv0Var;
    }

    public final void g(float f) {
        if (this.v == f) {
            return;
        }
        this.m |= 256;
        this.v = f;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.E.getDensity();
    }

    public final void h(float f) {
        if (this.w == f) {
            return;
        }
        this.m |= 512;
        this.w = f;
    }

    public final void j(float f) {
        if (this.x == f) {
            return;
        }
        this.m |= 1024;
        this.x = f;
    }

    public final void k(float f) {
        if (this.n == f) {
            return;
        }
        this.m |= 1;
        this.n = f;
    }

    public final void l(float f) {
        if (this.f1153o == f) {
            return;
        }
        this.m |= 2;
        this.f1153o = f;
    }

    public final void m(float f) {
        if (this.s == f) {
            return;
        }
        this.m |= 32;
        this.s = f;
    }

    public final void o(pw6 pw6Var) {
        if (im3.n(this.A, pw6Var)) {
            return;
        }
        this.m |= 8192;
        this.A = pw6Var;
    }

    public final void s(long j) {
        long j2 = this.u;
        int i = rv0.i;
        if (z68.a(j2, j)) {
            return;
        }
        this.m |= 128;
        this.u = j;
    }

    public final void z(long j) {
        if (d18.a(this.z, j)) {
            return;
        }
        this.m |= 4096;
        this.z = j;
    }
}
