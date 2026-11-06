package o;

/* JADX INFO: loaded from: classes.dex */
public final class pb6 implements in1, u01 {
    public float m;
    public wc7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xc7 f1723o;
    public xc7 p;
    public xc7 q;
    public xc7 r;
    public kw4 s;
    public kw4 t;
    public kw4 u;
    public long v;
    public int w;
    public jo x;
    public jo y;
    public a65 z;

    @Override // o.u01
    public final Object T(zw5 zw5Var) {
        wc7 wc7Var = this.n;
        wc7Var.getClass();
        return xk0.q(wc7Var, zw5Var);
    }

    @Override // o.in1
    public final float Z() {
        return 1.0f;
    }

    public final void a(long j) {
        e((byte) 34, this.x, this.y);
        jo joVar = this.x;
        jo joVar2 = this.y;
        j98 j98Var = j98.a;
        if (joVar == j98Var) {
            if ((this.w & 2) != 0) {
                kw4 kw4Var = this.s;
                if (kw4Var == null || (joVar = (jo) kw4Var.b(51)) == null) {
                    joVar = qb6.a;
                }
            } else {
                joVar = null;
            }
        }
        if (joVar2 == j98Var) {
            if ((this.w & 2) != 0) {
                kw4 kw4Var2 = this.t;
                if (kw4Var2 == null || (joVar2 = (jo) kw4Var2.b(51)) == null) {
                    joVar2 = qb6.a;
                }
            } else {
                joVar2 = null;
            }
        }
        this.w = (joVar == null || joVar2 == null) ? this.w & (-3) : this.w | 2;
        f(51, joVar, joVar2);
        xc7 xc7Var = this.f1723o;
        if (xc7Var != null) {
            xc7Var.b(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0106 A[EDGE_INSN: B:132:0x0106->B:61:0x0106 BREAK  A[LOOP:0: B:40:0x009e->B:59:0x00ff], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff A[Catch: all -> 0x0121, LOOP:0: B:40:0x009e->B:59:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:37:0x0088, B:40:0x009e, B:42:0x00b3, B:44:0x00c1, B:46:0x00cb, B:55:0x00f4, B:53:0x00eb, B:66:0x0112, B:68:0x0118, B:82:0x013e, B:87:0x014f, B:90:0x015d, B:93:0x0166, B:98:0x017d, B:94:0x016b, B:97:0x017c, B:96:0x0174, B:74:0x0126, B:78:0x0132, B:81:0x013c, B:99:0x0180, B:59:0x00ff), top: B:125:0x0088 }] */
    public final void b() {
        xc7 xc7Var;
        long j;
        long j2;
        boolean z;
        jo joVar;
        long j3;
        int i;
        boolean z2;
        wc7 wc7Var = this.n;
        wc7Var.getClass();
        this.n = null;
        a65 a65Var = this.z;
        if (a65Var != null) {
            synchronized (a65Var.n) {
                z2 = ((kw4) a65Var.f302o).e == 0;
            }
            if (z2) {
                if (this.v == 0 && this.w == 0) {
                    return;
                }
            }
        } else if (this.v == 0) {
            return;
        }
        xc7 xc7Var2 = this.f1723o;
        if (xc7Var2 == null || (xc7Var = this.p) == null) {
            return;
        }
        int iH = yc7.h(this.w, this.v);
        long jI = yc7.i(this.w, this.v);
        int iH2 = xc7Var.h(iH, xc7Var2);
        long jI2 = xc7Var.i(xc7Var2, jI);
        if (jI2 == 0 && iH2 == 0) {
            return;
        }
        a65 a65Var2 = this.z;
        if (a65Var2 == null) {
            a65Var2 = new a65((byte) 29);
            this.z = a65Var2;
        }
        long jH = (((long) yc7.h(iH2, jI2)) << 50) | ((-257698037761L) & jI2);
        long j4 = (((long) iH) << 50) | jI;
        kw4 kw4Var = this.s;
        kw4 kw4Var2 = this.t;
        kw4 kw4Var3 = this.u;
        synchronized (a65Var2.n) {
            try {
                kw4 kw4Var4 = (kw4) a65Var2.f302o;
                int[] iArr = kw4Var4.b;
                Object[] objArr = kw4Var4.c;
                long[] jArr = kw4Var4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j5 = jArr[i2];
                        j = jH;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            } else {
                                i2++;
                                jH = j;
                            }
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j5 & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    int i6 = iArr[i5];
                                    j3 = j5;
                                    oc7 oc7Var = (oc7) objArr[i5];
                                    int iOrdinal = oc7Var.c.ordinal();
                                    i = i4;
                                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                                        oc7Var.c = pc7.m;
                                    }
                                } else {
                                    j3 = j5;
                                    i = i4;
                                }
                                j5 = j3 >> 8;
                                i4 = i + 1;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                            jH = j;
                        }
                    }
                } else {
                    j = jH;
                }
                j2 = 0;
                if (j4 != 0) {
                    long j6 = j4;
                    while (j6 != 0) {
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                        if (kw4Var == null || (joVar = (jo) kw4Var.b(iNumberOfTrailingZeros)) == null) {
                            joVar = kw4Var3 != null ? (jo) kw4Var3.b(iNumberOfTrailingZeros) : null;
                            if (joVar == null) {
                                joVar = kw4Var2 != null ? (jo) kw4Var2.b(iNumberOfTrailingZeros) : null;
                                if (joVar == null) {
                                    joVar = qb6.a;
                                }
                            }
                        }
                        long j7 = 1 << iNumberOfTrailingZeros;
                        boolean z3 = (j & j7) != 0;
                        long j8 = j6;
                        kw4 kw4Var5 = (kw4) a65Var2.f302o;
                        oc7 oc7Var2 = (oc7) kw4Var5.b(iNumberOfTrailingZeros);
                        if (oc7Var2 != null) {
                            if (z3 || !im3.n(oc7Var2.a, joVar)) {
                                oc7Var2.a = joVar;
                                oc7Var2.c = pc7.f1726o;
                            } else {
                                oc7Var2.c = pc7.n;
                            }
                            j6 = j8 ^ j7;
                        } else if (z3) {
                            kw4Var5.i(iNumberOfTrailingZeros, new oc7(a65Var2, joVar));
                        }
                        j2 |= j7;
                        j6 = j8 ^ j7;
                    }
                }
                a65Var2.P0(wc7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j2 != 0) {
            xc7 xc7Var3 = this.r;
            if (xc7Var3 == null) {
                xc7Var3 = new xc7();
                this.r = xc7Var3;
            }
            long j9 = 2251799813685247L & j2;
            int i7 = (int) (j2 >> 50);
            long jI3 = yc7.i(i7, j9);
            int iH3 = yc7.h(i7, j9);
            xc7Var.g(xc7Var3, jI3, iH3);
            xc7 xc7Var4 = this.q;
            if (xc7Var4 != null) {
                xc7Var4.g(xc7Var3, jI3, iH3);
            }
            this.q = null;
        }
        synchronized (a65Var2.n) {
            z = ((kw4) a65Var2.f302o).e == 0;
        }
        if (z) {
            this.z = null;
        }
    }

    public final int c() {
        int i;
        a65 a65Var = this.z;
        int i2 = 0;
        if (a65Var == null) {
            return 0;
        }
        kw4 kw4Var = (kw4) a65Var.f302o;
        int[] iArr = kw4Var.b;
        Object[] objArr = kw4Var.c;
        long[] jArr = kw4Var.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length < 0) {
            i = i2;
            break;
        }
        int i3 = 0;
        i = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        if (i7 < 50) {
                            j |= 1 << ((byte) i7);
                        } else {
                            i |= 1 << (i7 - 50);
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    break;
                }
            }
            if (i3 == length) {
                i2 = i;
                i = i2;
                break;
            }
            i3++;
        }
        return yc7.e(i) | yc7.g(j);
    }

    public final void e(byte b, jo joVar, jo joVar2) {
        j98 j98Var = j98.a;
        if (joVar == j98Var) {
            long j = this.v;
            if (b >= 50 || (j & (1 << b)) == 0) {
                joVar = null;
            } else {
                kw4 kw4Var = this.s;
                if (kw4Var == null || (joVar = (jo) kw4Var.b(b)) == null) {
                    joVar = qb6.a;
                }
            }
        }
        if (joVar2 == j98Var) {
            long j2 = this.v;
            if (b >= 50 || (j2 & (1 << b)) == 0) {
                joVar2 = null;
            } else {
                kw4 kw4Var2 = this.t;
                if (kw4Var2 == null || (joVar2 = (jo) kw4Var2.b(b)) == null) {
                    joVar2 = qb6.a;
                }
            }
        }
        this.v = (joVar == null || joVar2 == null) ? this.v & (~(1 << b)) : this.v | (1 << b);
        f(b, joVar, joVar2);
    }

    public final void f(int i, jo joVar, jo joVar2) {
        if (joVar == null || joVar.equals(qb6.a)) {
            kw4 kw4Var = this.s;
            if (kw4Var != null) {
            }
        } else {
            kw4 kw4Var2 = this.s;
            if (kw4Var2 == null) {
                kw4 kw4Var3 = uk3.a;
                kw4Var2 = new kw4();
                this.s = kw4Var2;
            }
            kw4Var2.i(i, joVar);
        }
        if (joVar2 != null && !joVar2.equals(qb6.a)) {
            kw4 kw4Var4 = this.t;
            if (kw4Var4 == null) {
                kw4 kw4Var5 = uk3.a;
                kw4Var4 = new kw4();
                this.t = kw4Var4;
            }
            kw4Var4.i(i, joVar2);
            return;
        }
        kw4 kw4Var6 = this.t;
        if (kw4Var6 != null) {
            jo joVar3 = (jo) kw4Var6.b(i);
            kw4Var6.g(i);
            if (joVar3 != null) {
                kw4 kw4Var7 = this.u;
                if (kw4Var7 == null) {
                    kw4 kw4Var8 = uk3.a;
                    kw4Var7 = new kw4();
                    this.u = kw4Var7;
                }
                kw4Var7.i(i, joVar3);
            }
        }
    }

    public final void g(int i, xc7 xc7Var) {
        boolean z;
        xc7 xc7Var2 = this.f1723o;
        if (xc7Var2 == null) {
            xc7Var2 = yc7.n;
        }
        xc7 xc7Var3 = xc7Var2;
        xc7Var3.f(xc7Var);
        a65 a65Var = this.z;
        if (a65Var == null) {
            return;
        }
        xc7 xc7Var4 = this.r;
        if (xc7Var4 == null && (xc7Var4 = this.p) == null) {
            return;
        }
        xc7 xc7Var5 = xc7Var4;
        synchronized (a65Var.n) {
            z = ((kw4) a65Var.f302o).e == 0;
        }
        if (z) {
            this.r = null;
            this.z = null;
            return;
        }
        int i2 = i & 1;
        int i3 = i & 8;
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 32;
        int i7 = i & 16;
        long j = (i2 != 0 ? yc7.b : 0L) | (i3 != 0 ? yc7.c : 0L) | (i4 != 0 ? yc7.d : 0L) | (i5 != 0 ? yc7.e : 0L) | (i6 != 0 ? yc7.f : 0L) | (i7 != 0 ? yc7.g : 0L);
        int i8 = (i2 != 0 ? yc7.h : 0) | (i3 != 0 ? yc7.i : 0) | (i4 != 0 ? yc7.j : 0) | (i5 != 0 ? yc7.k : 0) | (i6 != 0 ? yc7.l : 0);
        int i9 = i7 != 0 ? yc7.m : 0;
        long jF0 = a65Var.F0();
        int i10 = (int) (jF0 >> 50);
        long jI = yc7.i(i10, 2251799813685247L & jF0) & j;
        int iH = yc7.h(i10, jI) & (i8 | i9);
        if (jI == 0 && iH == 0) {
            return;
        }
        yc7.a(xc7Var5, xc7Var3, a65Var, jI, iH, xc7Var);
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m;
    }

    public final void h(pw6 pw6Var) {
        jo joVar = this.x;
        jo joVar2 = this.y;
        j98 j98Var = j98.a;
        if (joVar == j98Var) {
            if ((this.w & 8) != 0) {
                kw4 kw4Var = this.s;
                if (kw4Var == null || (joVar = (jo) kw4Var.b(53)) == null) {
                    joVar = qb6.a;
                }
            } else {
                joVar = null;
            }
        }
        if (joVar2 == j98Var) {
            if ((this.w & 8) != 0) {
                kw4 kw4Var2 = this.t;
                if (kw4Var2 == null || (joVar2 = (jo) kw4Var2.b(53)) == null) {
                    joVar2 = qb6.a;
                }
            } else {
                joVar2 = null;
            }
        }
        this.w = (joVar == null || joVar2 == null) ? this.w & (-9) : this.w | 8;
        f(53, joVar, joVar2);
        xc7 xc7Var = this.f1723o;
        if (xc7Var != null) {
            xc7Var.b |= 8;
            xc7Var.E = pw6Var;
        }
    }
}
