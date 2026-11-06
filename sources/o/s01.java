package o;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s01 implements m01 {
    public boolean A;
    public hz6 B;
    public yh5 C;
    public s01 D;
    public int E;
    public final xc0 F;
    public final au2 G;
    public final ux2 H;
    public byte I;
    public final n01 m;
    public final l78 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f1968o = new AtomicReference(null);
    public final Object p = new Object();
    public final mx4 q;
    public final h17 r;
    public final jx4 s;
    public final kx4 t;
    public final kx4 u;
    public final jx4 v;
    public final tm0 w;
    public final tm0 x;
    public final jx4 y;
    public jx4 z;

    public s01(n01 n01Var, l78 l78Var) {
        this.m = n01Var;
        this.n = l78Var;
        kx4 kx4Var = new kx4();
        mx4 mx4Var = kx4Var.e;
        if (mx4Var == null) {
            mx4Var = new mx4(kx4Var);
            kx4Var.e = mx4Var;
        }
        mx4 mx4Var2 = mx4Var;
        this.q = mx4Var2;
        h17 h17Var = new h17();
        if (n01Var.d()) {
            h17Var.w = new kw4();
        }
        if (n01Var.f()) {
            h17Var.b();
        }
        this.r = h17Var;
        this.s = xo1.G();
        this.t = new kx4();
        this.u = new kx4();
        this.v = xo1.G();
        tm0 tm0Var = new tm0();
        this.w = tm0Var;
        tm0 tm0Var2 = new tm0();
        this.x = tm0Var2;
        this.y = xo1.G();
        this.z = xo1.G();
        xc0 xc0Var = new xc0((Object) n01Var, (byte) 14);
        this.F = xc0Var;
        this.G = new au2((byte) 3);
        ux2 ux2Var = new ux2(l78Var, n01Var, j17.a(h17Var), mx4Var2, tm0Var, tm0Var2, xc0Var, this);
        n01Var.p(ux2Var);
        this.H = ux2Var;
    }

    public final void A(hw2 hw2Var) {
        boolean zI = i();
        q();
        n01 n01Var = this.m;
        if (!zI) {
            n01Var.a(this, hw2Var);
            return;
        }
        ux2 ux2Var = this.H;
        ux2Var.z = 0;
        ux2Var.y = true;
        n01Var.a(this, hw2Var);
        if (ux2Var.F || ux2Var.z != 0) {
            up5.a("Cannot disable reuse from root if it was caused by other groups");
        }
        ux2Var.z = -1;
        ux2Var.y = false;
    }

    public final void a() {
        this.f1968o.set(null);
        this.w.V.s0();
        this.x.V.s0();
        mx4 mx4Var = this.q;
        if (mx4Var.m.g()) {
            return;
        }
        au2 au2Var = this.G;
        try {
            au2Var.k(mx4Var, this.H.y());
            au2Var.c();
        } finally {
            au2Var.b();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.s.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof kx4;
        um3 um3Var = um3.m;
        kx4 kx4Var = this.t;
        kx4 kx4Var2 = this.u;
        jx4 jx4Var = this.y;
        if (!z2) {
            j56 j56Var = (j56) objG;
            if (xo1.V(jx4Var, obj, j56Var) || j56Var.b(obj) == um3Var) {
                return;
            }
            if (j56Var.g == null || z) {
                kx4Var.a(j56Var);
                return;
            } else {
                kx4Var2.a(j56Var);
                return;
            }
        }
        kx4 kx4Var3 = (kx4) objG;
        Object[] objArr = kx4Var3.b;
        long[] jArr = kx4Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        j56 j56Var2 = (j56) objArr[(i << 3) + i3];
                        if (!xo1.V(jx4Var, obj, j56Var2) && j56Var2.b(obj) != um3Var) {
                            if (j56Var2.g == null || z) {
                                kx4Var.a(j56Var2);
                            } else {
                                kx4Var2.a(j56Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof vi6;
        jx4 jx4Var = this.v;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            kx4 kx4Var = ((vi6) set).m;
            Object[] objArr = kx4Var.b;
            long[] jArr9 = kx4Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof j56) {
                                    ((j56) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = jx4Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof kx4) {
                                            kx4 kx4Var2 = (kx4) objG;
                                            Object[] objArr2 = kx4Var2.b;
                                            long[] jArr10 = kx4Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                b((eo1) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            b((eo1) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof j56) {
                    ((j56) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = jx4Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof kx4) {
                            kx4 kx4Var3 = (kx4) objG2;
                            Object[] objArr3 = kx4Var3.b;
                            long[] jArr12 = kx4Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((eo1) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((eo1) objG2, z);
                        }
                    }
                }
            }
        }
        jx4 jx4Var2 = this.s;
        kx4 kx4Var4 = this.t;
        if (z) {
            kx4 kx4Var5 = this.u;
            if (kx4Var5.h()) {
                long[] jArr13 = jx4Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = jx4Var2.b[i18];
                                    Object obj5 = jx4Var2.c[i18];
                                    if (obj5 instanceof kx4) {
                                        kx4 kx4Var6 = (kx4) obj5;
                                        Object[] objArr4 = kx4Var6.b;
                                        long[] jArr14 = kx4Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            j56 j56Var = (j56) objArr5[i22];
                                                            if (kx4Var5.c(j56Var) || kx4Var4.c(j56Var)) {
                                                                kx4Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = kx4Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        j56 j56Var2 = (j56) obj5;
                                        zG = kx4Var5.c(j56Var2) || kx4Var4.c(j56Var2);
                                    }
                                    if (zG) {
                                        jx4Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                kx4Var5.b();
                h();
                return;
            }
        }
        if (kx4Var4.h()) {
            long[] jArr16 = jx4Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = jx4Var2.b[i26];
                                Object obj7 = jx4Var2.c[i26];
                                if (obj7 instanceof kx4) {
                                    kx4 kx4Var7 = (kx4) obj7;
                                    Object[] objArr6 = kx4Var7.b;
                                    long[] jArr17 = kx4Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (kx4Var4.c((j56) objArr7[i30])) {
                                                            kx4Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = kx4Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = kx4Var4.c((j56) obj7);
                                }
                                if (zC) {
                                    jx4Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            h();
            kx4Var4.b();
        }
    }

    public final void d() {
        synchronized (this.p) {
            try {
                e(this.w);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.q.m.g()) {
                        au2 au2Var = this.G;
                        try {
                            au2Var.k(this.q, this.H.y());
                            au2Var.c();
                        } finally {
                            au2Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void e(tm0 tm0Var) throws Throwable {
        au2 au2Var;
        long[] jArr;
        int i;
        long[] jArr2;
        au2 au2Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        tm0 tm0Var2 = this.x;
        ux2 ux2Var = this.H;
        q01 q01VarY = ux2Var.y();
        au2 au2Var3 = this.G;
        au2Var3.k(this.q, q01VarY);
        try {
            if (tm0Var.V.u0()) {
                try {
                    if (tm0Var2.V.u0() && this.C == null) {
                        au2Var3.c();
                    }
                    return;
                } finally {
                    au2Var3.b();
                }
            }
            yh5 yh5Var = this.C;
            jv jvVar = yh5Var != null ? yh5Var.l : this.n;
            try {
                Trace.beginSection(jvVar.equals(yh5Var != null ? yh5Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    yh5 yh5Var2 = this.C;
                    au2 au2Var4 = yh5Var2 != null ? yh5Var2.k : au2Var3;
                    h17 h17Var = this.r;
                    q01 q01VarY2 = ux2Var.y();
                    k17 k17VarD = j17.a(h17Var).d();
                    int i3 = 0;
                    try {
                        tm0Var.C(jvVar, k17VarD, au2Var4, q01VarY2);
                        k17VarD.e(true);
                        jvVar.l();
                        Trace.endSection();
                        au2Var3.d();
                        au2Var3.e();
                        if (this.A) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.A = false;
                                jx4 jx4Var = this.s;
                                long[] jArr3 = jx4Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = jx4Var.b[i8];
                                                    Object obj2 = jx4Var.c[i8];
                                                    if (obj2 instanceof kx4) {
                                                        kx4 kx4Var = (kx4) obj2;
                                                        Object[] objArr = kx4Var.b;
                                                        long[] jArr4 = kx4Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        au2Var2 = au2Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((j56) objArr[i13]).a()) {
                                                                                    kx4Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = kx4Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        au2Var2 = au2Var3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((j56) obj2).a();
                                                    }
                                                    if (zG) {
                                                        jx4Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    au2Var2 = au2Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                au2Var3 = au2Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            au2Var = au2Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            au2Var = au2Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        au2Var3 = au2Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    au2Var = au2Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            au2Var = au2Var3;
                        }
                        try {
                            if (tm0Var2.V.u0() && this.C == null) {
                                au2Var.c();
                            }
                            return;
                        } finally {
                            au2Var.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            k17VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (tm0Var2.V.u0() && this.C == null) {
                au2Var3.c();
            }
            throw th;
        } finally {
            au2Var3.b();
        }
    }

    public final void f() {
        synchronized (this.p) {
            try {
                tm0 tm0Var = this.x;
                tm0Var.getClass();
                if (!tm0Var.V.u0()) {
                    e(this.x);
                }
            } catch (Throwable th) {
                try {
                    if (!this.q.m.g()) {
                        au2 au2Var = this.G;
                        try {
                            au2Var.k(this.q, this.H.y());
                            au2Var.c();
                        } finally {
                            au2Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.p) {
            try {
                this.H.v = null;
                if (!this.q.m.g()) {
                    au2 au2Var = this.G;
                    try {
                        au2Var.k(this.q, this.H.y());
                        au2Var.c();
                        au2Var.b();
                    } catch (Throwable th) {
                        au2Var.b();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.q.m.g()) {
                        au2 au2Var2 = this.G;
                        try {
                            au2Var2.k(this.q, this.H.y());
                            au2Var2.c();
                        } finally {
                            au2Var2.b();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        jx4 jx4Var = this.v;
        long[] jArr3 = jx4Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = jx4Var.b[i10];
                            Object obj2 = jx4Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof kx4;
                            j5 = j8;
                            jx4 jx4Var2 = this.s;
                            if (z) {
                                kx4 kx4Var = (kx4) obj2;
                                Object[] objArr = kx4Var.b;
                                long[] jArr4 = kx4Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!jx4Var2.c((eo1) objArr[i15])) {
                                                        kx4Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = kx4Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !jx4Var2.c((eo1) obj2);
                            }
                            if (zG) {
                                jx4Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        kx4 kx4Var2 = this.u;
        if (!kx4Var2.h()) {
            return;
        }
        Object[] objArr2 = kx4Var2.b;
        long[] jArr5 = kx4Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((j56) objArr2[i20]).g == null) {
                            kx4Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.p) {
            z = true;
            if (this.I != 1) {
                z = false;
            }
            if (z) {
                this.I = (byte) 0;
            }
        }
        return z;
    }

    public final void j(hw2 hw2Var) {
        try {
            synchronized (this.p) {
                n();
                jx4 jx4Var = this.z;
                this.z = xo1.G();
                try {
                    ux2 ux2Var = this.H;
                    hz6 hz6Var = this.B;
                    if (!ux2Var.e.V.u0()) {
                        i01.a("Expected applyChanges() to have been called");
                    }
                    ux2Var.P = hz6Var;
                    try {
                        ux2Var.n(jx4Var, hw2Var);
                        ux2Var.P = null;
                    } catch (Throwable th) {
                        ux2Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.z = jx4Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.q.m.g()) {
                    au2 au2Var = this.G;
                    try {
                        au2Var.k(this.q, this.H.y());
                        au2Var.c();
                    } finally {
                        au2Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final yh5 k(boolean z, hw2 hw2Var) {
        if (this.C != null) {
            up5.b("A pausable composition is in progress");
        }
        yh5 yh5Var = new yh5(this, this.m, this.H, this.q, hw2Var, z, this.n, this.p);
        this.C = yh5Var;
        return yh5Var;
    }

    public final void l() {
        synchronized (this.p) {
            try {
                if (this.C != null) {
                    up5.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.r.n == 0;
                if (!z || !this.q.m.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        au2 au2Var = this.G;
                        try {
                            au2Var.k(this.q, this.H.y());
                            if (!z) {
                                h17 h17Var = this.r;
                                au2 au2Var2 = this.G;
                                k17 k17VarD = h17Var.d();
                                try {
                                    k17VarD.m(k17VarD.t, new c9((Object) au2Var2, (Object) k17VarD, (byte) 23));
                                    k17VarD.e(true);
                                    this.n.l();
                                    au2Var.d();
                                } catch (Throwable th) {
                                    k17VarD.e(false);
                                    throw th;
                                }
                            }
                            au2Var.c();
                            au2Var.b();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            au2Var.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.s.a();
                this.v.a();
                this.z.a();
                this.w.V.s0();
                this.x.V.s0();
                ux2 ux2Var = this.H;
                ux2Var.E.clear();
                ux2Var.s.clear();
                ux2Var.e.V.s0();
                ux2Var.v = null;
                this.I = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.p) {
            try {
                if (this.H.F) {
                    up5.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.I != 3) {
                    this.I = (byte) 3;
                    tm0 tm0Var = this.H.L;
                    if (tm0Var != null) {
                        e(tm0Var);
                    }
                    boolean z = this.r.n == 0;
                    if (!z || !this.q.m.g()) {
                        au2 au2Var = this.G;
                        try {
                            au2Var.k(this.q, this.H.y());
                            if (!z) {
                                h17 h17Var = this.r;
                                au2 au2Var2 = this.G;
                                k17 k17VarD = h17Var.d();
                                try {
                                    k17VarD.m(k17VarD.t, new t0(au2Var2, (byte) 10));
                                    k17VarD.G();
                                    k17VarD.e(true);
                                    this.n.a();
                                    this.n.l();
                                    au2Var.d();
                                } catch (Throwable th) {
                                    k17VarD.e(false);
                                    throw th;
                                }
                            }
                            au2Var.c();
                            au2Var.b();
                        } catch (Throwable th2) {
                            au2Var.b();
                            throw th2;
                        }
                    }
                    this.y.a();
                    ux2 ux2Var = this.H;
                    ux2Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ux2Var.b.u(ux2Var);
                        ux2Var.E.clear();
                        ux2Var.s.clear();
                        ux2Var.e.V.s0();
                        ux2Var.v = null;
                        ux2Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.m.v(this);
    }

    public final void n() {
        Object obj = uf0.E;
        AtomicReference atomicReference = this.f1968o;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                i01.b("pending composition has not been applied");
                hk0.b();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                i01.b("corrupt pendingModifications drain: " + atomicReference);
                hk0.b();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f1968o;
        Object andSet = atomicReference.getAndSet(null);
        if (im3.n(andSet, uf0.E)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.C == null) {
                i01.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            i01.b("corrupt pendingModifications drain: " + atomicReference);
            hk0.b();
        }
    }

    public final void p() {
        la2 la2Var = la2.m;
        AtomicReference atomicReference = this.f1968o;
        Object andSet = atomicReference.getAndSet(la2Var);
        if (im3.n(andSet, uf0.E) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            i01.b("corrupt pendingModifications drain: " + atomicReference);
            hk0.b();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        byte b = this.I;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            up5.b(str);
        }
        if (this.C == null) {
            return;
        }
        up5.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        mx4 mx4Var = this.q;
        ux2 ux2Var = this.H;
        if (arrayList.size() > 0) {
            ((pu4) ((vd5) arrayList.get(0)).m).getClass();
            i01.a("Check failed");
        }
        try {
            ux2Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    ux2Var.A(arrayList);
                    ux2Var.i();
                    Trace.endSection();
                } catch (Throwable th) {
                    ux2Var.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!mx4Var.m.g()) {
                    au2 au2Var = this.G;
                    try {
                        au2Var.k(mx4Var, ux2Var.y());
                        au2Var.c();
                    } finally {
                        au2Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final um3 s(j56 j56Var, Object obj) {
        s01 s01Var;
        int i = j56Var.b;
        if ((i & 2) != 0) {
            j56Var.b = i | 4;
        }
        px2 px2Var = j56Var.c;
        if (px2Var == null || !px2Var.a()) {
            return um3.m;
        }
        h17 h17Var = this.r;
        h17Var.getClass();
        px2 px2Var2 = j56Var.c;
        if (px2Var2 != null && h17Var.f(ep1.l(px2Var2))) {
            if (j56Var.d == null) {
                return um3.m;
            }
            um3 um3VarT = t(j56Var, px2Var, obj);
            if (um3VarT != um3.m) {
                this.F.H();
            }
            return um3VarT;
        }
        synchronized (this.p) {
            s01Var = this.D;
        }
        if (s01Var != null) {
            ux2 ux2Var = s01Var.H;
            if (ux2Var.F && ux2Var.c0(j56Var, obj)) {
                return um3.p;
            }
        }
        return um3.m;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final um3 t(j56 j56Var, px2 px2Var, Object obj) {
        synchronized (this.p) {
            try {
                s01 s01Var = this.D;
                s01 s01Var2 = null;
                if (s01Var != null) {
                    h17 h17Var = this.r;
                    int i = this.E;
                    if (h17Var.s) {
                        i01.a("Writer is active");
                    }
                    if (i < 0 || i >= h17Var.n) {
                        i01.a("Invalid group index");
                    }
                    px2 px2VarL = ep1.l(px2Var);
                    if (h17Var.f(px2VarL)) {
                        int i2 = h17Var.m[(i * 5) + 3] + i;
                        int i3 = px2VarL.a;
                        if (i > i3 || i3 >= i2) {
                            s01Var = null;
                        }
                    } else {
                        s01Var = null;
                    }
                    s01Var2 = s01Var;
                }
                if (s01Var2 == null) {
                    ux2 ux2Var = this.H;
                    if (ux2Var.F && ux2Var.c0(j56Var, obj)) {
                        return um3.p;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof eo1;
                        jx4 jx4Var = this.z;
                        if (z) {
                            Object objG = jx4Var.g(j56Var);
                            if (objG == null) {
                                xo1.C(this.z, j56Var, obj);
                                break;
                            }
                            if (objG instanceof kx4) {
                                kx4 kx4Var = (kx4) objG;
                                Object[] objArr = kx4Var.b;
                                long[] jArr = kx4Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    xo1.C(this.z, j56Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == xz2.V) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        xo1.C(this.z, j56Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        xo1.C(this.z, j56Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != xz2.V) {
                                    xo1.C(this.z, j56Var, obj);
                                    break;
                                }
                            }
                        } else {
                            jx4Var.m(j56Var, xz2.V);
                        }
                    } else {
                        this.z.m(j56Var, xz2.V);
                    }
                }
                if (s01Var2 != null) {
                    return s01Var2.t(j56Var, px2Var, obj);
                }
                this.m.l(this);
                return this.H.F ? um3.f2227o : um3.n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.s.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof kx4;
        um3 um3Var = um3.p;
        jx4 jx4Var = this.y;
        if (!z) {
            j56 j56Var = (j56) objG;
            if (j56Var.b(obj) != um3Var || (obj instanceof eo1)) {
                return;
            }
            xo1.C(jx4Var, obj, j56Var);
            return;
        }
        kx4 kx4Var = (kx4) objG;
        Object[] objArr = kx4Var.b;
        long[] jArr = kx4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        j56 j56Var2 = (j56) objArr[(i << 3) + i3];
                        if (j56Var2.b(obj) == um3Var && !(obj instanceof eo1)) {
                            xo1.C(jx4Var, obj, j56Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof vi6;
        jx4 jx4Var = this.v;
        jx4 jx4Var2 = this.s;
        if (z) {
            kx4 kx4Var = ((vi6) set).m;
            Object[] objArr = kx4Var.b;
            long[] jArr = kx4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (jx4Var2.c(obj) || jx4Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (jx4Var2.c(obj2) || jx4Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.p) {
            yh5 yh5Var = this.C;
            boolean z = false;
            if (yh5Var != null && (yh5Var.h.get() != ai5.q || yh5Var.i != o67.f())) {
                AtomicReference atomicReference = yh5Var.h;
                ai5 ai5Var = ai5.r;
                ai5 ai5Var2 = ai5.p;
                while (!atomicReference.compareAndSet(ai5Var, ai5Var2) && atomicReference.get() == ai5Var) {
                }
                yh5Var.l.m.a(9);
                return false;
            }
            n();
            try {
                jx4 jx4Var = this.z;
                this.z = xo1.G();
                try {
                    ux2 ux2Var = this.H;
                    hz6 hz6Var = this.B;
                    va5 va5Var = ux2Var.e.V;
                    if (!va5Var.u0()) {
                        i01.a("Expected applyChanges() to have been called");
                    }
                    if (jx4Var.e > 0 || !ux2Var.s.isEmpty()) {
                        ux2Var.P = hz6Var;
                        try {
                            ux2Var.n(jx4Var, null);
                            ux2Var.P = null;
                            z = !va5Var.u0();
                        } catch (Throwable th) {
                            ux2Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.z = jx4Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.q.m.g()) {
                        au2 au2Var = this.G;
                        try {
                            au2Var.k(this.q, this.H.y());
                            au2Var.c();
                        } finally {
                            au2Var.b();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(vi6 vi6Var) {
        Object obj;
        while (true) {
            Object obj2 = this.f1968o.get();
            if (obj2 == null || obj2.equals(uf0.E)) {
                obj = vi6Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, vi6Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    yq4.u(this.f1968o, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = vi6Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f1968o;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.p) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        j56 j56VarW;
        int i;
        boolean z;
        ux2 ux2Var = this.H;
        if (ux2Var.A <= 0 && (j56VarW = ux2Var.w()) != null) {
            int i2 = j56VarW.b | 1;
            j56VarW.b = i2;
            if ((i2 & 32) == 0) {
                vw4 vw4Var = j56VarW.f;
                if (vw4Var == null) {
                    vw4Var = new vw4();
                    j56VarW.f = vw4Var;
                }
                int i3 = j56VarW.e;
                int iC = vw4Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = vw4Var.c[iC];
                }
                vw4Var.b[iC] = obj;
                vw4Var.c[iC] = i3;
                if (i == j56VarW.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.F.H();
            if (z) {
                return;
            }
            if (obj instanceof t97) {
                ((t97) obj).u(1);
            }
            xo1.C(this.s, obj, j56VarW);
            if (obj instanceof eo1) {
                eo1 eo1Var = (eo1) obj;
                do1 do1VarA = eo1Var.A();
                jx4 jx4Var = this.v;
                xo1.W(jx4Var, obj);
                vw4 vw4Var2 = do1VarA.e;
                Object[] objArr = vw4Var2.b;
                long[] jArr = vw4Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    s97 s97Var = (s97) objArr[(i4 << 3) + i7];
                                    if (s97Var instanceof t97) {
                                        ((t97) s97Var).u(1);
                                    }
                                    xo1.C(jx4Var, s97Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = do1VarA.f;
                jx4 jx4Var2 = j56VarW.g;
                if (jx4Var2 == null) {
                    jx4Var2 = new jx4();
                    j56VarW.g = jx4Var2;
                }
                jx4Var2.m(eo1Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.p) {
            try {
                u(obj);
                Object objG = this.v.g(obj);
                if (objG != null) {
                    if (objG instanceof kx4) {
                        kx4 kx4Var = (kx4) objG;
                        Object[] objArr = kx4Var.b;
                        long[] jArr = kx4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((eo1) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((eo1) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
