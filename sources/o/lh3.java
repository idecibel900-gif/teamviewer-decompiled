package o;

/* JADX INFO: loaded from: classes.dex */
public final class lh3 implements l52 {
    public final e52 m;
    public gh3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jh3 f1361o;
    public ih3 p;
    public hh3 q;
    public vt1 r;
    public l07 s;
    public je0 t;
    public final nd u;
    public final nd v;

    public lh3(e52 e52Var) {
        this.m = e52Var;
        nd ndVar = new nd((byte) 6, false);
        ndVar.f1562o = new zw4();
        this.u = ndVar;
        nd ndVar2 = new nd((byte) 11, false);
        ndVar2.f1562o = new ow4();
        this.v = ndVar2;
    }

    public static void c(lh3 lh3Var, eh3 eh3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        e52 e52Var = lh3Var.m;
        ih3 ih3Var = lh3Var.p;
        if (ih3Var == null) {
            ih3Var = new ih3((byte) 8);
            ih3Var.e = null;
            ih3Var.f = Long.MAX_VALUE;
            ih3Var.g = false;
            lh3Var.p = ih3Var;
        }
        ih3Var.e = eh3Var;
        ih3Var.f = j;
        je0 je0Var = lh3Var.t;
        gb5 gb5Var = e52Var.C;
        if (je0Var == null) {
            lh3Var.t = new je0(gb5Var);
        } else {
            je0Var.f1154o = gb5Var;
            je0Var.n = j2;
        }
        ih3Var.g = false;
        lh3Var.r = ih3Var;
    }

    @Override // o.zy2
    public final String N() {
        vt1 vt1Var = this.r;
        if (vt1Var instanceof gh3) {
            return ((gh3) vt1Var).g ? "waiting" : "idle";
        }
        if ((vt1Var instanceof ih3) || (vt1Var instanceof hh3)) {
            return "waiting";
        }
        return vt1Var instanceof jh3 ? "recognized" : "idle";
    }

    @Override // o.l52
    public final gb5 W() {
        return this.m.C;
    }

    public final void a() {
        gh3 gh3Var = this.n;
        fh3 fh3Var = fh3.f798o;
        if (gh3Var == null) {
            gh3Var = new gh3((byte) 8);
            gh3Var.e = fh3Var;
            gh3Var.f = false;
            gh3Var.g = false;
            this.n = gh3Var;
        }
        gh3Var.e = fh3Var;
        gh3Var.f = false;
        gh3Var.g = false;
        this.r = gh3Var;
    }

    public final void b(eh3 eh3Var, long j, je0 je0Var) {
        hh3 hh3Var = this.q;
        if (hh3Var == null) {
            hh3Var = new hh3((byte) 8);
            hh3Var.e = null;
            hh3Var.f = Long.MAX_VALUE;
            this.q = hh3Var;
        }
        hh3Var.e = eh3Var;
        hh3Var.f = j;
        je0Var.n = 0L;
        this.r = hh3Var;
    }

    public final l07 d() {
        l07 l07Var = this.s;
        if (l07Var != null) {
            return l07Var;
        }
        hk0.g("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(eh3 eh3Var, dh3 dh3Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = eh3Var.c;
        e52 e52Var = this.m;
        gb5 gb5Var = e52Var.C;
        gb5Var.getClass();
        int i = n52.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (gb5Var == gb5.m ? j & 4294967295L : j >> 32))) > 2.0f) {
            l07 l07VarD = d();
            gb5 gb5Var2 = e52Var.C;
            nd ndVar = this.u;
            zw4 zw4Var = (zw4) ndVar.f1562o;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (zu1.n(eh3Var)) {
                ndVar.n = 0;
                zw4Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (zu1.o(eh3Var) || zu1.n(eh3Var)) {
                j2 = 4294967295L;
            } else {
                if (zw4Var.b == 3) {
                    int i2 = ndVar.n;
                    ndVar.n = i2 + 1;
                    zw4Var.n(i2, eh3Var);
                } else {
                    zw4Var.a(eh3Var);
                }
                if (ndVar.n == 3) {
                    ndVar.n = 0;
                }
                Object[] objArr = zw4Var.a;
                int i3 = zw4Var.b;
                int i4 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i4 < i3) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((eh3) objArr[i4]).c >> 32));
                    i4++;
                    j4 = j4;
                }
                j2 = j4;
                int i5 = zw4Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i5;
                Object[] objArr2 = zw4Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((eh3) objArr2[i6]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / zw4Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (gb5Var2 != null) {
                int i7 = dh3Var.a;
                if (i7 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i7 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = gb5Var2 == gb5.n ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((io.sentry.util.network.b) l07VarD.n).a(eh3Var.b, jFloatToRawIntBits);
            nd ndVar2 = this.v;
            ow4 ow4Var = (ow4) ndVar2.f1562o;
            int i8 = ow4Var.b;
            if (i8 == 3) {
                int i9 = ndVar2.n;
                ndVar2.n = i9 + 1;
                if (i9 < 0 || i9 >= i8) {
                    hk0.r("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = ow4Var.a;
                    long j5 = jArr[i9];
                    jArr[i9] = j;
                }
            } else {
                ow4Var.a(j);
            }
            if (ndVar2.n == 3) {
                ndVar2.n = 0;
            }
            long[] jArr2 = ow4Var.a;
            int i10 = ow4Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i11] >> 32));
            }
            int i12 = ow4Var.b;
            float f = fIntBitsToFloat7 / i12;
            long[] jArr3 = ow4Var.a;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i13] & j2)) + fIntBitsToFloat4;
            }
            e52Var.c1(new o42((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / ow4Var.b)) & j2), true));
        }
    }

    public final void f(eh3 eh3Var, eh3 eh3Var2, dh3 dh3Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.s == null) {
            this.s = new l07((byte) 21);
        }
        l07 l07VarD = d();
        e52 e52Var = this.m;
        gb5 gb5Var = e52Var.C;
        nd ndVar = this.u;
        zw4 zw4Var = (zw4) ndVar.f1562o;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eh3Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (eh3Var.c & 4294967295L));
        if (zu1.n(eh3Var)) {
            ndVar.n = 0;
            zw4Var.d();
        }
        if (zu1.o(eh3Var) || zu1.n(eh3Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (zw4Var.b == 3) {
                int i = ndVar.n;
                ndVar.n = i + 1;
                zw4Var.n(i, eh3Var);
            } else {
                zw4Var.a(eh3Var);
            }
            if (ndVar.n == 3) {
                ndVar.n = 0;
            }
            Object[] objArr = zw4Var.a;
            int i2 = zw4Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((eh3) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = zw4Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = zw4Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((eh3) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / zw4Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (gb5Var != null) {
            int i6 = dh3Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = gb5Var == gb5.n ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((io.sentry.util.network.b) l07VarD.n).a(eh3Var.b, jFloatToRawIntBits);
        long jD = t65.d(zu1.J(eh3Var2, e52Var.C, dh3Var), j);
        if (((Boolean) e52Var.D.invoke(new sn5(1))).booleanValue()) {
            e52Var.c1(new p42(jD));
        }
        nd ndVar2 = this.v;
        ndVar2.n = 0;
        ((ow4) ndVar2.f1562o).b = 0;
    }
}
