package o;

/* JADX INFO: loaded from: classes.dex */
public final class xc7 {
    public sb0 A;
    public long B;
    public sb0 C;
    public boolean D;
    public pw6 E;
    public Object F;
    public Object G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public tv0 S;
    public long T;
    public sb0 U;
    public es7 V;
    public long W;
    public long X;
    public long Y;
    public int Z;
    public long a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float p;
    public float q;
    public float r;
    public float s;
    public sb0 y;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2506o = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public long x = rv0.b;
    public long z = rv0.g;

    public xc7() {
        long j = rv0.h;
        this.B = j;
        this.E = kh.V;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        long j2 = d18.b;
        this.P = d18.b(j2);
        this.Q = d18.c(j2);
        this.T = j;
        long j3 = qt7.c;
        this.W = j3;
        this.X = j3;
        this.Y = j3;
    }

    public final void A(int i) {
        this.a |= 4398046511104L;
        this.Z = ((i << 4) & 112) | (this.Z & (-113));
    }

    public final void a(sb0 sb0Var) {
        this.a &= -17179869185L;
        int i = this.b;
        this.b = sb0Var != null ? i | 2 : i & (-3);
        this.A = sb0Var;
        int i2 = rv0.i;
        this.z = rv0.h;
    }

    public final void b(long j) {
        this.a |= 17179869184L;
        this.b &= -3;
        this.z = j;
        this.A = null;
    }

    public final void c(sb0 sb0Var) {
        this.a &= -34359738369L;
        int i = this.b;
        this.b = sb0Var != null ? i | 1 : i & (-2);
        this.y = sb0Var;
        int i2 = rv0.i;
        this.x = rv0.h;
    }

    public final void d(long j) {
        this.a |= 34359738368L;
        this.b &= -2;
        this.x = j;
        this.y = null;
    }

    public final void e(sb0 sb0Var) {
        this.a &= -137438953473L;
        int i = this.b;
        this.b = sb0Var != null ? i | 128 : i & (-129);
        this.U = sb0Var;
        int i2 = rv0.i;
        this.T = rv0.h;
    }

    public final void f(xc7 xc7Var) {
        xc7Var.a = this.a;
        xc7Var.b = this.b;
        xc7Var.p = this.p;
        xc7Var.q = this.q;
        xc7Var.r = this.r;
        xc7Var.s = this.s;
        xc7Var.t = this.t;
        xc7Var.u = this.u;
        xc7Var.v = this.v;
        xc7Var.w = this.w;
        xc7Var.c = this.c;
        xc7Var.d = this.d;
        xc7Var.e = this.e;
        xc7Var.f = this.f;
        xc7Var.g = this.g;
        xc7Var.h = this.h;
        xc7Var.i = this.i;
        xc7Var.j = this.j;
        xc7Var.k = this.k;
        xc7Var.E = this.E;
        xc7Var.H = this.H;
        xc7Var.I = this.I;
        xc7Var.J = this.J;
        xc7Var.K = this.K;
        xc7Var.L = this.L;
        xc7Var.M = this.M;
        xc7Var.N = this.N;
        xc7Var.O = this.O;
        xc7Var.P = this.P;
        xc7Var.Q = this.Q;
        xc7Var.R = this.R;
        xc7Var.S = this.S;
        xc7Var.x = this.x;
        xc7Var.y = this.y;
        xc7Var.z = this.z;
        xc7Var.A = this.A;
        xc7Var.B = this.B;
        xc7Var.C = this.C;
        xc7Var.F = this.F;
        xc7Var.G = this.G;
        xc7Var.D = this.D;
        xc7Var.l = this.l;
        xc7Var.m = this.m;
        xc7Var.n = this.n;
        xc7Var.f2506o = this.f2506o;
        xc7Var.T = this.T;
        xc7Var.U = this.U;
        xc7Var.V = this.V;
        xc7Var.W = this.W;
        xc7Var.X = this.X;
        xc7Var.Y = this.Y;
        xc7Var.Z = this.Z;
    }

    public final void g(xc7 xc7Var, long j, int i) {
        long j2 = j & this.a;
        if (j2 != 0) {
            if ((j2 & 8192) != 0) {
                float f = this.p;
                xc7Var.a = 8192 | xc7Var.a;
                xc7Var.p = f;
            }
            if ((j2 & 16384) != 0) {
                float f2 = this.q;
                xc7Var.a = 16384 | xc7Var.a;
                xc7Var.q = f2;
            }
            if ((j2 & 32768) != 0) {
                float f3 = this.r;
                xc7Var.a = 32768 | xc7Var.a;
                xc7Var.r = f3;
            }
            if ((j2 & 65536) != 0) {
                float f4 = this.s;
                xc7Var.a = 65536 | xc7Var.a;
                xc7Var.s = f4;
            }
            if ((j2 & 262144) != 0) {
                float f5 = this.t;
                xc7Var.a = 262144 | xc7Var.a;
                xc7Var.t = f5;
            }
            if ((j2 & io.sentry.g7.MAX_EVENT_SIZE_BYTES) != 0) {
                float f6 = this.u;
                xc7Var.a = io.sentry.g7.MAX_EVENT_SIZE_BYTES | xc7Var.a;
                xc7Var.u = f6;
            }
            if ((j2 & 131072) != 0) {
                float f7 = this.v;
                xc7Var.a = 131072 | xc7Var.a;
                xc7Var.v = f7;
            }
            if ((j2 & 524288) != 0) {
                float f8 = this.w;
                xc7Var.a = 524288 | xc7Var.a;
                xc7Var.w = f8;
            }
            if ((j2 & 1) != 0) {
                float f9 = this.c;
                xc7Var.a = 1 | xc7Var.a;
                xc7Var.c = f9;
            }
            if ((j2 & 2) != 0) {
                float f10 = this.d;
                xc7Var.a = 2 | xc7Var.a;
                xc7Var.d = f10;
            }
            if ((j2 & 4) != 0) {
                float f11 = this.e;
                xc7Var.a = 4 | xc7Var.a;
                xc7Var.e = f11;
            }
            if ((j2 & 8) != 0) {
                float f12 = this.f;
                xc7Var.a = 8 | xc7Var.a;
                xc7Var.f = f12;
            }
            if ((j2 & 16) != 0) {
                float f13 = this.g;
                xc7Var.a = 16 | xc7Var.a;
                xc7Var.g = f13;
            }
            if ((j2 & 32) != 0) {
                float f14 = this.h;
                xc7Var.a = 32 | xc7Var.a;
                xc7Var.h = f14;
            }
            if ((j2 & 64) != 0) {
                float f15 = this.i;
                xc7Var.a = 64 | xc7Var.a;
                xc7Var.i = f15;
            }
            if ((j2 & 128) != 0) {
                float f16 = this.j;
                xc7Var.a = 128 | xc7Var.a;
                xc7Var.j = f16;
            }
            if ((j2 & 256) != 0) {
                float f17 = this.k;
                xc7Var.a = 256 | xc7Var.a;
                xc7Var.k = f17;
            }
            if ((j2 & 2097152) != 0) {
                float f18 = this.H;
                xc7Var.a = 2097152 | xc7Var.a;
                xc7Var.H = f18;
            }
            if ((j2 & 4194304) != 0) {
                float f19 = this.I;
                xc7Var.a = 4194304 | xc7Var.a;
                xc7Var.I = f19;
            }
            if ((j2 & 8388608) != 0) {
                float f20 = this.J;
                xc7Var.a = 8388608 | xc7Var.a;
                xc7Var.J = f20;
            }
            if ((j2 & 16777216) != 0) {
                float f21 = this.K;
                xc7Var.a = 16777216 | xc7Var.a;
                xc7Var.K = f21;
            }
            if ((j2 & 33554432) != 0) {
                float f22 = this.L;
                xc7Var.a = 33554432 | xc7Var.a;
                xc7Var.L = f22;
            }
            if ((j2 & 67108864) != 0) {
                float f23 = this.M;
                xc7Var.a = 67108864 | xc7Var.a;
                xc7Var.M = f23;
            }
            if ((j2 & 134217728) != 0) {
                float f24 = this.N;
                xc7Var.a = 134217728 | xc7Var.a;
                xc7Var.N = f24;
            }
            if ((j2 & 268435456) != 0) {
                float f25 = this.O;
                xc7Var.a = 268435456 | xc7Var.a;
                xc7Var.O = f25;
            }
            if ((j2 & 536870912) != 0) {
                float f26 = this.P;
                xc7Var.a = 536870912 | xc7Var.a;
                xc7Var.P = f26;
            }
            if ((j2 & 1073741824) != 0) {
                float f27 = this.Q;
                xc7Var.a = 1073741824 | xc7Var.a;
                xc7Var.Q = f27;
            }
            if ((j2 & 4294967296L) != 0) {
                float f28 = this.R;
                xc7Var.a = 4294967296L | xc7Var.a;
                xc7Var.R = f28;
            }
            if ((j2 & 8589934592L) != 0) {
                xc7Var.a = 8589934592L | xc7Var.a;
            }
            if ((34359738368L & j2) != 0) {
                xc7Var.d(this.x);
            }
            if ((17179869184L & j2) != 0) {
                xc7Var.b(this.z);
            }
            if ((j2 & 68719476736L) != 0) {
                long j3 = this.B;
                xc7Var.a = 68719476736L | xc7Var.a;
                xc7Var.b &= -5;
                xc7Var.B = j3;
                xc7Var.C = null;
            }
            if ((j2 & 2147483648L) != 0) {
                boolean z = this.D;
                xc7Var.a = 2147483648L | xc7Var.a;
                xc7Var.D = z;
            }
            if ((j2 & 512) != 0) {
                float f29 = this.l;
                xc7Var.a = (512 | xc7Var.a) & (-2049);
                xc7Var.l = f29;
                xc7Var.n = Float.NaN;
            }
            if ((j2 & 1024) != 0) {
                float f30 = this.m;
                xc7Var.a = (1024 | xc7Var.a) & (-4097);
                xc7Var.m = f30;
                xc7Var.f2506o = Float.NaN;
            }
            if ((j2 & 2048) != 0) {
                float f31 = this.n;
                xc7Var.a = 2048 | (xc7Var.a & (-513));
                xc7Var.n = f31;
                xc7Var.l = Float.NaN;
            }
            if ((j2 & 4096) != 0) {
                float f32 = this.f2506o;
                xc7Var.a = 4096 | (xc7Var.a & (-1025));
                xc7Var.f2506o = f32;
                xc7Var.m = Float.NaN;
            }
            if ((j2 & 137438953472L) != 0) {
                long j4 = this.T;
                xc7Var.a = 137438953472L | xc7Var.a;
                xc7Var.b &= -129;
                xc7Var.T = j4;
                xc7Var.U = null;
            }
            if ((j2 & 140737488355328L) != 0) {
                long j5 = this.X;
                xc7Var.a = 140737488355328L | xc7Var.a;
                xc7Var.X = j5;
            }
            if ((j2 & 281474976710656L) != 0) {
                long j6 = this.Y;
                xc7Var.a = 281474976710656L | xc7Var.a;
                xc7Var.Y = j6;
            }
            if ((j2 & 8796093022208L) != 0) {
                xc7Var.a = 8796093022208L | xc7Var.a;
            }
            if ((j2 & 562949953421312L) != 0) {
                xc7Var.a = 562949953421312L | xc7Var.a;
            }
            if ((131666517426176L & j2) != 0) {
                if ((274877906944L & j2) != 0) {
                    xc7Var.z(t());
                }
                if ((j2 & 70368744177664L) != 0) {
                    long j7 = this.W;
                    xc7Var.a = 70368744177664L | xc7Var.a;
                    xc7Var.W = j7;
                }
                if ((2199023255552L & j2) != 0) {
                    xc7Var.y(s());
                }
                if ((4398046511104L & j2) != 0) {
                    xc7Var.A(u());
                }
                if ((17592186044416L & j2) != 0) {
                    xc7Var.x(q());
                }
                if ((35184372088832L & j2) != 0) {
                    xc7Var.k(o());
                }
                if ((549755813888L & j2) != 0) {
                    xc7Var.l(p());
                }
                if ((j2 & 1099511627776L) != 0) {
                    xc7Var.j(n());
                }
            }
        }
        int i2 = this.b & i;
        if (i2 != 0) {
            if ((i2 & 8) != 0) {
                pw6 pw6Var = this.E;
                xc7Var.b |= 8;
                xc7Var.E = pw6Var;
            }
            if ((i2 & 16) != 0) {
                tv0 tv0Var = this.S;
                xc7Var.b |= 16;
                xc7Var.S = tv0Var;
            }
            if ((i2 & 1) != 0) {
                xc7Var.c(this.y);
            }
            if ((i2 & 2) != 0) {
                xc7Var.a(this.A);
            }
            if ((i2 & 4) != 0) {
                xc7Var.m(this.C);
            }
            if ((i2 & 32) != 0) {
                Object obj = this.F;
                int i3 = xc7Var.b;
                xc7Var.b = obj != null ? i3 | 32 : i3 & (-33);
                xc7Var.F = obj;
            }
            if ((i2 & 64) != 0) {
                Object obj2 = this.G;
                int i4 = xc7Var.b;
                xc7Var.b = obj2 != null ? i4 | 64 : i4 & (-65);
                xc7Var.G = obj2;
            }
            if ((i2 & 128) != 0) {
                xc7Var.e(this.U);
            }
            if ((i2 & 256) != 0) {
                xc7Var.b |= 256;
            }
            if ((i2 & 512) != 0) {
                xc7Var.b |= 512;
            }
            if ((i2 & 1024) != 0) {
                es7 es7Var = this.V;
                es7Var.getClass();
                xc7Var.b |= 1024;
                xc7Var.V = es7Var;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int h(int i, xc7 xc7Var) {
        int i2 = this.b;
        int i3 = xc7Var.b;
        int i4 = i2 & i3 & i;
        int i5 = i & (i2 ^ i3);
        if (i4 == 0) {
            return i5;
        }
        if ((i4 & 1) != 0 && im3.n(this.y, xc7Var.y)) {
            i4 &= -2;
        }
        if ((i4 & 2) != 0 && im3.n(this.A, xc7Var.A)) {
            i4 &= -3;
        }
        if ((i4 & 4) != 0 && im3.n(this.C, xc7Var.C)) {
            i4 &= -5;
        }
        if ((i4 & 8) != 0 && im3.n(this.E, xc7Var.E)) {
            i4 &= -9;
        }
        if ((i4 & 16) != 0 && im3.n(this.S, xc7Var.S)) {
            i4 &= -17;
        }
        if ((i4 & 32) != 0 && im3.n(this.F, xc7Var.F)) {
            i4 &= -33;
        }
        if ((i4 & 64) != 0 && im3.n(this.G, xc7Var.G)) {
            i4 &= -65;
        }
        if ((i4 & 128) != 0 && im3.n(this.U, xc7Var.U)) {
            i4 &= -129;
        }
        if ((i4 & 256) != 0) {
            i4 &= -257;
        }
        if ((i4 & 512) != 0) {
            dt7 dt7Var = dt7.c;
            if (dt7Var.equals(dt7Var)) {
                i4 &= -513;
            }
        }
        if ((i4 & 1024) != 0 && im3.n(this.V, xc7Var.V)) {
            i4 &= -1025;
        }
        return i4 | i5;
    }

    public final long i(xc7 xc7Var, long j) {
        long j2 = this.a;
        long j3 = xc7Var.a;
        long j4 = j2 & j3 & j;
        long j5 = j & (j2 ^ j3);
        if (j4 == 0) {
            return j5;
        }
        if ((1 & j4) != 0 && Float.floatToRawIntBits(this.c) == Float.floatToRawIntBits(xc7Var.c)) {
            j4 &= -2;
        }
        if ((2 & j4) != 0 && Float.floatToRawIntBits(this.d) == Float.floatToRawIntBits(xc7Var.d)) {
            j4 &= -3;
        }
        if ((4 & j4) != 0 && Float.floatToRawIntBits(this.e) == Float.floatToRawIntBits(xc7Var.e)) {
            j4 &= -5;
        }
        if ((8 & j4) != 0 && Float.floatToRawIntBits(this.f) == Float.floatToRawIntBits(xc7Var.f)) {
            j4 &= -9;
        }
        if ((16 & j4) != 0 && Float.floatToRawIntBits(this.g) == Float.floatToRawIntBits(xc7Var.g)) {
            j4 &= -17;
        }
        if ((32 & j4) != 0 && Float.floatToRawIntBits(this.h) == Float.floatToRawIntBits(xc7Var.h)) {
            j4 &= -33;
        }
        if ((64 & j4) != 0 && Float.floatToRawIntBits(this.i) == Float.floatToRawIntBits(xc7Var.i)) {
            j4 &= -65;
        }
        if ((128 & j4) != 0 && Float.floatToRawIntBits(this.j) == Float.floatToRawIntBits(xc7Var.j)) {
            j4 &= -129;
        }
        if ((256 & j4) != 0 && Float.floatToRawIntBits(this.k) == Float.floatToRawIntBits(xc7Var.k)) {
            j4 &= -257;
        }
        if ((512 & j4) != 0 && Float.floatToRawIntBits(this.l) == Float.floatToRawIntBits(xc7Var.l)) {
            j4 &= -513;
        }
        if ((1024 & j4) != 0 && Float.floatToRawIntBits(this.m) == Float.floatToRawIntBits(xc7Var.m)) {
            j4 &= -1025;
        }
        if ((2048 & j4) != 0 && Float.floatToRawIntBits(this.n) == Float.floatToRawIntBits(xc7Var.n)) {
            j4 &= -2049;
        }
        if ((4096 & j4) != 0 && Float.floatToRawIntBits(this.f2506o) == Float.floatToRawIntBits(xc7Var.f2506o)) {
            j4 &= -4097;
        }
        if ((8192 & j4) != 0 && Float.floatToRawIntBits(this.p) == Float.floatToRawIntBits(xc7Var.p)) {
            j4 &= -8193;
        }
        if ((16384 & j4) != 0 && Float.floatToRawIntBits(this.q) == Float.floatToRawIntBits(xc7Var.q)) {
            j4 &= -16385;
        }
        if ((32768 & j4) != 0 && Float.floatToRawIntBits(this.r) == Float.floatToRawIntBits(xc7Var.r)) {
            j4 &= -32769;
        }
        if ((65536 & j4) != 0 && Float.floatToRawIntBits(this.s) == Float.floatToRawIntBits(xc7Var.s)) {
            j4 &= -65537;
        }
        if ((131072 & j4) != 0 && Float.floatToRawIntBits(this.v) == Float.floatToRawIntBits(xc7Var.v)) {
            j4 &= -131073;
        }
        if ((262144 & j4) != 0 && Float.floatToRawIntBits(this.t) == Float.floatToRawIntBits(xc7Var.t)) {
            j4 &= -262145;
        }
        if ((524288 & j4) != 0 && Float.floatToRawIntBits(this.w) == Float.floatToRawIntBits(xc7Var.w)) {
            j4 &= -524289;
        }
        if ((io.sentry.g7.MAX_EVENT_SIZE_BYTES & j4) != 0 && Float.floatToRawIntBits(this.u) == Float.floatToRawIntBits(xc7Var.u)) {
            j4 &= -1048577;
        }
        if ((2097152 & j4) != 0 && Float.floatToRawIntBits(this.H) == Float.floatToRawIntBits(xc7Var.H)) {
            j4 &= -2097153;
        }
        if ((4194304 & j4) != 0 && Float.floatToRawIntBits(this.I) == Float.floatToRawIntBits(xc7Var.I)) {
            j4 &= -4194305;
        }
        if ((8388608 & j4) != 0 && Float.floatToRawIntBits(this.J) == Float.floatToRawIntBits(xc7Var.J)) {
            j4 &= -8388609;
        }
        if ((16777216 & j4) != 0 && Float.floatToRawIntBits(this.K) == Float.floatToRawIntBits(xc7Var.K)) {
            j4 &= -16777217;
        }
        if ((33554432 & j4) != 0 && Float.floatToRawIntBits(this.L) == Float.floatToRawIntBits(xc7Var.L)) {
            j4 &= -33554433;
        }
        if ((67108864 & j4) != 0 && Float.floatToRawIntBits(this.M) == Float.floatToRawIntBits(xc7Var.M)) {
            j4 &= -67108865;
        }
        if ((134217728 & j4) != 0 && Float.floatToRawIntBits(this.N) == Float.floatToRawIntBits(xc7Var.N)) {
            j4 &= -134217729;
        }
        if ((268435456 & j4) != 0 && Float.floatToRawIntBits(this.O) == Float.floatToRawIntBits(xc7Var.O)) {
            j4 &= -268435457;
        }
        if ((536870912 & j4) != 0 && Float.floatToRawIntBits(this.P) == Float.floatToRawIntBits(xc7Var.P)) {
            j4 &= -536870913;
        }
        if ((1073741824 & j4) != 0 && Float.floatToRawIntBits(this.Q) == Float.floatToRawIntBits(xc7Var.Q)) {
            j4 &= -1073741825;
        }
        if ((2147483648L & j4) != 0 && this.D == xc7Var.D) {
            j4 &= -2147483649L;
        }
        if ((4294967296L & j4) != 0 && Float.floatToRawIntBits(this.R) == Float.floatToRawIntBits(xc7Var.R)) {
            j4 &= -4294967297L;
        }
        if ((8589934592L & j4) != 0 && Float.floatToRawIntBits(1.0f) == Float.floatToRawIntBits(1.0f)) {
            j4 &= -8589934593L;
        }
        if ((17179869184L & j4) != 0) {
            long j6 = this.z;
            long j7 = xc7Var.z;
            int i = rv0.i;
            if (z68.a(j6, j7)) {
                j4 &= -17179869185L;
            }
        }
        if ((34359738368L & j4) != 0) {
            long j8 = this.x;
            long j9 = xc7Var.x;
            int i2 = rv0.i;
            if (z68.a(j8, j9)) {
                j4 &= -34359738369L;
            }
        }
        if ((68719476736L & j4) != 0) {
            long j10 = this.B;
            long j11 = xc7Var.B;
            int i3 = rv0.i;
            if (z68.a(j10, j11)) {
                j4 &= -68719476737L;
            }
        }
        if ((137438953472L & j4) != 0) {
            long j12 = this.T;
            long j13 = xc7Var.T;
            int i4 = rv0.i;
            if (z68.a(j12, j13)) {
                j4 &= -137438953473L;
            }
        }
        if ((274877906944L & j4) != 0 && t().equals(xc7Var.t())) {
            j4 &= -274877906945L;
        }
        if ((549755813888L & j4) != 0 && im3.n(p(), xc7Var.p())) {
            j4 &= -549755813889L;
        }
        if ((1099511627776L & j4) != 0 && n() == xc7Var.n()) {
            j4 &= -1099511627777L;
        }
        if ((2199023255552L & j4) != 0 && s() == xc7Var.s()) {
            j4 &= -2199023255553L;
        }
        if ((4398046511104L & j4) != 0 && u() == xc7Var.u()) {
            j4 &= -4398046511105L;
        }
        if ((8796093022208L & j4) != 0 && Float.compare(Float.NaN, Float.NaN) == 0) {
            j4 &= -8796093022209L;
        }
        if ((17592186044416L & j4) != 0 && q() == xc7Var.q()) {
            j4 &= -17592186044417L;
        }
        if ((35184372088832L & j4) != 0 && o() == xc7Var.o()) {
            j4 &= -35184372088833L;
        }
        if ((70368744177664L & j4) != 0 && qt7.a(this.W, xc7Var.W)) {
            j4 &= -70368744177665L;
        }
        if ((140737488355328L & j4) != 0 && qt7.a(this.X, xc7Var.X)) {
            j4 &= -140737488355329L;
        }
        if ((281474976710656L & j4) != 0 && qt7.a(this.Y, xc7Var.Y)) {
            j4 &= -281474976710657L;
        }
        if ((562949953421312L & j4) != 0) {
            j4 &= -562949953421313L;
        }
        return j4 | j5;
    }

    public final void j(int i) {
        this.a |= 1099511627776L;
        this.Z = ((i | 2) & 3) | (this.Z & (-4));
    }

    public final void k(int i) {
        this.a |= 35184372088832L;
        this.Z = ((i << 10) & 15360) | (this.Z & (-15361));
    }

    public final void l(ms2 ms2Var) {
        this.a |= 549755813888L;
        this.Z = ((ms2Var.m << 17) & 134086656) | (this.Z & (-134086657));
    }

    public final void m(sb0 sb0Var) {
        this.a &= -68719476737L;
        int i = this.b;
        this.b = sb0Var != null ? i | 4 : i & (-5);
        this.C = sb0Var;
        int i2 = rv0.i;
        this.B = rv0.h;
    }

    public final int n() {
        return ((this.a & 1099511627776L) == 0 || (this.Z & 1) != 1) ? 0 : 1;
    }

    public final int o() {
        if ((this.a & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.Z & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            li3.a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final ms2 p() {
        if ((this.a & 549755813888L) != 0) {
            return new ms2((this.Z & 134086656) >> 17);
        }
        ms2 ms2Var = ms2.n;
        return ms2.f1503o;
    }

    public final int q() {
        if ((this.a & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.Z & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        li3.a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int r() {
        return yc7.e(this.b) | yc7.g(this.a);
    }

    public final int s() {
        if ((this.a & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.Z & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        li3.a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    public final vp7 t() {
        int i;
        long j = this.a & 274877906944L;
        vp7 vp7Var = vp7.b;
        if (j == 0 || (i = ((this.Z & 114688) >> 14) & 3) == 0) {
            return vp7Var;
        }
        if (i != 1) {
            return i != 2 ? new vp7(i) : vp7.d;
        }
        return vp7.c;
    }

    public final int u() {
        if ((this.a & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.Z & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        li3.a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final boolean v(byte b) {
        return b < 50 && ((1 << b) & this.a) != 0;
    }

    public final boolean w(int i) {
        return i >= 50 && (this.b & (1 << (i - 50))) != 0;
    }

    public final void x(int i) {
        this.a |= 17592186044416L;
        this.Z = ((i << 8) & 768) | (this.Z & (-769));
    }

    public final void y(int i) {
        this.a |= 2199023255552L;
        this.Z = ((i << 2) & 28) | (this.Z & (-29));
    }

    public final void z(vp7 vp7Var) {
        this.a |= 274877906944L;
        this.Z = (((vp7Var.a | 4) << 14) & 114688) | (this.Z & (-114689));
    }
}
