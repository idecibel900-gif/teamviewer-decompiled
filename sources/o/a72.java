package o;

/* JADX INFO: loaded from: classes.dex */
public final class a72 implements bp5 {
    public final long m;
    public final in1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f305o;
    public final iz0 p;
    public final bg5 q;

    public a72(long j, in1 in1Var) {
        float f = vp4.a;
        int iQ0 = in1Var.q0(48.0f);
        iz0 iz0Var = new iz0((byte) 28);
        this.m = j;
        this.n = in1Var;
        this.f305o = iQ0;
        this.p = iz0Var;
        this.q = h57.p(new d18(d18.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a72) {
            a72 a72Var = (a72) obj;
            return this.m == a72Var.m && im3.n(this.n, a72Var.n) && this.f305o == a72Var.f305o && this.p == a72Var.p;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[LOOP:1: B:32:0x00c1->B:46:0x0101, LOOP_START, PHI: r3 r9
      0x00c1: PHI (r3v9 int) = (r3v4 int), (r3v12 int) binds: [B:31:0x00bf, B:46:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r9v7 long) = (r9v3 long), (r9v10 long) binds: [B:31:0x00bf, B:46:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0101 A[LOOP:1: B:32:0x00c1->B:46:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0108 A[SYNTHETIC] */
    @Override // o.bp5
    public final long f(long j, long j2, zk3 zk3Var, j04 j04Var) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        long j3;
        long j4;
        int i5;
        zk3 zk3VarE;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float fMin;
        float fMin2;
        int iC;
        int i14;
        int i15;
        int i16;
        int iV;
        int i17;
        int iV2;
        eq4 eq4Var = new eq4(j, j2, zk3Var, j04Var);
        cj3 cj3Var = cj3.q;
        jw4 jw4Var = (jw4) ((ek3) cj3Var.n).invoke(eq4Var);
        jw4 jw4Var2 = (jw4) ((ek3) cj3Var.f531o).invoke(eq4Var);
        long j5 = this.m;
        float fA = z32.a(j5);
        in1 in1Var = this.n;
        int iQ0 = in1Var.q0(fA);
        j04 j04Var2 = j04.m;
        int i18 = iQ0 * (j04Var == j04Var2 ? 1 : -1);
        int iQ1 = in1Var.q0(z32.b(j5));
        yk3 yk3VarB0 = ct1.b0(0, jw4Var.b);
        int i19 = yk3VarB0.m;
        int i20 = yk3VarB0.n;
        if (i19 <= i20) {
            while (true) {
                int iC2 = jw4Var.c(i19) + i18;
                if (iC2 >= 0) {
                    f = 2.0f;
                    f2 = 1.0f;
                    i17 = iC2;
                    if (((int) (j2 >> 32)) + iC2 <= ((int) (j >> 32))) {
                        i2 = i17;
                        i = 0;
                        break;
                    }
                } else {
                    i17 = iC2;
                    f = 2.0f;
                    f2 = 1.0f;
                }
                if (i19 == jw4Var.b - 1) {
                    int i21 = (int) (j2 >> 32);
                    int i22 = (int) (j >> 32);
                    if (i21 >= i22) {
                        iV2 = Math.round((f2 + (j04Var == j04Var2 ? 0.0f : -0.0f)) * ((i22 - i21) / f));
                        i = 0;
                    } else {
                        i = 0;
                        iV2 = ct1.v(i17, 0, i22 - i21);
                    }
                    i2 = iV2;
                    break;
                }
                i = 0;
                if (i19 != i20) {
                    i19++;
                }
            }
            yk3 yk3VarB1 = ct1.b0(i, jw4Var2.b);
            i3 = yk3VarB1.m;
            i4 = yk3VarB1.n;
            j3 = 4294967295L;
            if (i3 <= i4) {
                while (true) {
                    iC = jw4Var2.c(i3) + iQ1;
                    i14 = this.f305o;
                    if (iC >= i14) {
                        j4 = j3;
                        if (((int) (j2 & j3)) + iC <= ((int) (j & j4)) - i14) {
                            i5 = iC;
                            break;
                        }
                    } else {
                        j4 = j3;
                    }
                    if (i3 == jw4Var2.b - 1) {
                        i15 = (int) (j2 & j4);
                        i16 = (int) (j & j4);
                        if (i15 >= i16 - (i14 * 2)) {
                            iV = Math.round(((i16 - i15) / f) * f2);
                        } else {
                            iV = ct1.v(iC, i14, (i16 - i14) - i15);
                        }
                        i5 = iV;
                        break;
                    }
                    if (i3 != i4) {
                        i3++;
                        j3 = j4;
                    }
                }
                long j6 = (((long) i2) << 32) | (((long) i5) & j4);
                zk3VarE = vs1.e(j6, j2);
                float f3 = vp4.a;
                i6 = zk3VarE.a;
                i7 = zk3VarE.d;
                i8 = zk3VarE.c;
                i9 = zk3VarE.b;
                i10 = zk3Var.c;
                i11 = zk3Var.b;
                i12 = zk3Var.d;
                i13 = zk3Var.a;
                if (i6 < i10) {
                    fMin = 0.0f;
                } else if (i8 <= i13) {
                    fMin = f2;
                } else if (zk3VarE.f() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(zk3Var.c, i8) + Math.max(i13, i6)) / 2) - i6) / zk3VarE.f();
                }
                if (i9 < i12) {
                    fMin2 = 0.0f;
                } else if (i7 <= i11) {
                    fMin2 = f2;
                } else if (zk3VarE.c() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(i12, i7) + Math.max(i11, i9)) / 2) - i9) / zk3VarE.c();
                }
                this.q.setValue(new d18(u47.c(fMin, fMin2)));
                return j6;
            }
            j4 = 4294967295L;
            i5 = i;
            long j7 = (((long) i2) << 32) | (((long) i5) & j4);
            zk3VarE = vs1.e(j7, j2);
            float f4 = vp4.a;
            i6 = zk3VarE.a;
            i7 = zk3VarE.d;
            i8 = zk3VarE.c;
            i9 = zk3VarE.b;
            i10 = zk3Var.c;
            i11 = zk3Var.b;
            i12 = zk3Var.d;
            i13 = zk3Var.a;
            if (i6 < i10) {
                fMin = 0.0f;
            } else if (i8 <= i13) {
                fMin = f2;
            } else if (zk3VarE.f() == 0) {
                fMin = 0.0f;
            } else {
                fMin = (((Math.min(zk3Var.c, i8) + Math.max(i13, i6)) / 2) - i6) / zk3VarE.f();
            }
            if (i9 < i12) {
                fMin2 = 0.0f;
            } else if (i7 <= i11) {
                fMin2 = f2;
            } else if (zk3VarE.c() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i12, i7) + Math.max(i11, i9)) / 2) - i9) / zk3VarE.c();
            }
            this.q.setValue(new d18(u47.c(fMin, fMin2)));
            return j7;
        }
        i = 0;
        f = 2.0f;
        f2 = 1.0f;
        i2 = i;
        yk3 yk3VarB2 = ct1.b0(i, jw4Var2.b);
        i3 = yk3VarB2.m;
        i4 = yk3VarB2.n;
        j3 = 4294967295L;
        if (i3 <= i4) {
            while (true) {
                iC = jw4Var2.c(i3) + iQ1;
                i14 = this.f305o;
                if (iC >= i14) {
                    j4 = j3;
                    if (((int) (j2 & j3)) + iC <= ((int) (j & j4)) - i14) {
                        i5 = iC;
                        break;
                    }
                } else {
                    j4 = j3;
                }
                if (i3 == jw4Var2.b - 1) {
                    i15 = (int) (j2 & j4);
                    i16 = (int) (j & j4);
                    if (i15 >= i16 - (i14 * 2)) {
                        iV = Math.round(((i16 - i15) / f) * f2);
                    } else {
                        iV = ct1.v(iC, i14, (i16 - i14) - i15);
                    }
                    i5 = iV;
                    break;
                }
                if (i3 != i4) {
                    i3++;
                    j3 = j4;
                }
            }
            long j8 = (((long) i2) << 32) | (((long) i5) & j4);
            zk3VarE = vs1.e(j8, j2);
            float f5 = vp4.a;
            i6 = zk3VarE.a;
            i7 = zk3VarE.d;
            i8 = zk3VarE.c;
            i9 = zk3VarE.b;
            i10 = zk3Var.c;
            i11 = zk3Var.b;
            i12 = zk3Var.d;
            i13 = zk3Var.a;
            if (i6 < i10) {
                fMin = 0.0f;
            } else if (i8 <= i13) {
                fMin = f2;
            } else if (zk3VarE.f() == 0) {
                fMin = 0.0f;
            } else {
                fMin = (((Math.min(zk3Var.c, i8) + Math.max(i13, i6)) / 2) - i6) / zk3VarE.f();
            }
            if (i9 < i12) {
                fMin2 = 0.0f;
            } else if (i7 <= i11) {
                fMin2 = f2;
            } else if (zk3VarE.c() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i12, i7) + Math.max(i11, i9)) / 2) - i9) / zk3VarE.c();
            }
            this.q.setValue(new d18(u47.c(fMin, fMin2)));
            return j8;
        }
        j4 = 4294967295L;
        i5 = i;
        long j9 = (((long) i2) << 32) | (((long) i5) & j4);
        zk3VarE = vs1.e(j9, j2);
        float f6 = vp4.a;
        i6 = zk3VarE.a;
        i7 = zk3VarE.d;
        i8 = zk3VarE.c;
        i9 = zk3VarE.b;
        i10 = zk3Var.c;
        i11 = zk3Var.b;
        i12 = zk3Var.d;
        i13 = zk3Var.a;
        if (i6 < i10) {
            fMin = 0.0f;
        } else if (i8 <= i13) {
            fMin = f2;
        } else if (zk3VarE.f() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(zk3Var.c, i8) + Math.max(i13, i6)) / 2) - i6) / zk3VarE.f();
        }
        if (i9 < i12) {
            fMin2 = 0.0f;
        } else if (i7 <= i11) {
            fMin2 = f2;
        } else if (zk3VarE.c() == 0) {
            fMin2 = 0.0f;
        } else {
            fMin2 = (((Math.min(i12, i7) + Math.max(i11, i9)) / 2) - i9) / zk3VarE.c();
        }
        this.q.setValue(new d18(u47.c(fMin, fMin2)));
        return j9;
    }

    public final int hashCode() {
        return this.p.hashCode() + fx3.a(0, fx3.a(this.f305o, (cj3.q.hashCode() + ((this.n.hashCode() + (Long.hashCode(this.m) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + z32.c(this.m) + ", density=" + this.n + ", dropdownMenuAnchorPosition=" + cj3.q + ", verticalMargin=" + this.f305o + ", horizontalMargin=0, onPositionCalculated=" + this.p + ")";
    }
}
