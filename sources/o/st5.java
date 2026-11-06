package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class st5 {
    public static final jf1 a = gu4.c;

    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(fs4 fs4Var, long j, float f, long j2, int i, float f2, ux2 ux2Var, final int i2, final int i3) {
        fs4 fs4Var2;
        int i4;
        float f3;
        int i5;
        boolean z;
        final long j3;
        final fs4 fs4Var3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        j56 j56VarR;
        fs4 fs4Var4;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final cc7 cc7Var;
        final rh3 rh3VarK;
        final rh3 rh3VarK2;
        final rh3 rh3VarK3;
        boolean z2;
        boolean zF;
        Object objK;
        final long j6;
        final float f7;
        final long j7;
        ux2Var.Y(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            fs4Var2 = fs4Var;
        } else if ((i2 & 6) == 0) {
            fs4Var2 = fs4Var;
            i4 = (ux2Var.f(fs4Var2) ? 4 : 2) | i2;
        } else {
            fs4Var2 = fs4Var;
            i4 = i2;
        }
        long jC = j;
        int i10 = i4 | (((i3 & 2) == 0 && ux2Var.e(jC)) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i10 |= ux2Var.c(f3) ? 256 : 128;
            }
            i5 = i10 | 222208;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i5 & 1, z)) {
                ux2Var.S();
                if ((i2 & 1) != 0 || ux2Var.x()) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jC = bw0.c(iq8.M, ux2Var);
                        i5 &= -113;
                    }
                    if (i11 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = rv0.g;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    ux2Var.Q();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    fs4Var4 = fs4Var2;
                }
                ux2Var.q();
                cc7Var = new cc7(((in1) ux2Var.j(b11.h)).d0(f3), 0.0f, i8, 0, 26);
                th3 th3VarG = nv1.G(null, ux2Var, 1);
                rh3VarK = nv1.k(th3VarG, 0.0f, 1080.0f, db8.J(db8.I0(6000, 2, q72.c), 6), null, ux2Var, 4536, 8);
                le5 le5Var = new le5((byte) 9);
                iy3 iy3Var = new iy3();
                le5Var.invoke(iy3Var);
                rh3VarK2 = nv1.k(th3VarG, 0.0f, 360.0f, db8.J(new jy3(iy3Var), 6), null, ux2Var, 4536, 8);
                iy3 iy3Var2 = new iy3();
                iy3Var2.a = (short) 6000;
                iy3Var2.a(Float.valueOf(0.87f), 3000).b = a;
                iy3Var2.a(Float.valueOf(0.1f), 6000);
                rh3VarK3 = nv1.k(th3VarG, 0.1f, 0.87f, db8.J(new jy3(iy3Var2), 6), null, ux2Var, 4536, 8);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cp6.a(fs4Var4, true, new le5((byte) 10)), 40.0f);
                boolean zF2 = ux2Var.f(rh3VarK3);
                fs4 fs4Var5 = fs4Var4;
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zF = z2 | zF2 | ux2Var.f(rh3VarK) | ux2Var.f(rh3VarK2) | ux2Var.e(j5) | ux2Var.h(cc7Var) | ((((i7 & 112) ^ 48) <= 32 && ux2Var.e(jC)) || (i7 & 48) == 32);
                objK = ux2Var.K();
                if (!zF || objK == e01.a) {
                    j6 = jC;
                    f7 = f3;
                    j7 = j5;
                    objK = new Function1() { // from class: o.qt5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            long j8 = j7;
                            cc7 cc7Var2 = cc7Var;
                            long j9 = j6;
                            u52 u52Var = (u52) obj;
                            float fFloatValue = ((Number) rh3VarK3.getValue()).floatValue() * 360.0f;
                            boolean z3 = i8;
                            float f8 = f6;
                            if (z3 && Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (u52Var.d() >> 32))) {
                                f8 += f7;
                            }
                            float fR = (f8 / ((float) (((double) u52Var.R(Float.intBitsToFloat((int) (u52Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) rh3VarK2.getValue()).floatValue() + ((Number) rh3VarK.getValue()).floatValue();
                            long jT0 = u52Var.t0();
                            iu iuVarH0 = u52Var.h0();
                            long jD = iuVarH0.D();
                            iuVarH0.x().g();
                            try {
                                ((xc0) iuVarH0.f1103o).T(fFloatValue2, jT0);
                                st5.b(u52Var, Math.min(fFloatValue, fR) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fR) * 2.0f), j8, cc7Var2);
                                st5.b(u52Var, 0.0f, fFloatValue, j9, cc7Var2);
                                return f88.a;
                            } finally {
                                ua5.x(iuVarH0, jD);
                            }
                        }
                    };
                    ux2Var.g0(objK);
                } else {
                    j6 = jC;
                    f7 = f3;
                    j7 = j5;
                }
                vn4.K(0, (Function1) objK, ux2Var, fs4VarL);
                fs4Var3 = fs4Var5;
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            } else {
                ux2Var.Q();
                j3 = j2;
                fs4Var3 = fs4Var2;
                j4 = jC;
                f4 = f3;
                i6 = i;
                f5 = f2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.rt5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i2 | 1);
                        fs4 fs4Var6 = fs4Var3;
                        long j8 = j4;
                        float f8 = f4;
                        long j9 = j3;
                        boolean z3 = i6;
                        float f9 = f5;
                        st5.a(fs4Var6, j8, f8, j9, z3 ? 1 : 0, f9, (ux2) obj, iY, i3);
                        return f88.a;
                    }
                };
            }
        }
        i10 |= 384;
        f3 = f;
        i5 = i10 | 222208;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i5 & 1, z)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i3 & 2) != 0) {
                    jC = bw0.c(iq8.M, ux2Var);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = rv0.g;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i3 & 2) != 0) {
                    jC = bw0.c(iq8.M, ux2Var);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = rv0.g;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            ux2Var.q();
            cc7Var = new cc7(((in1) ux2Var.j(b11.h)).d0(f3), 0.0f, i8, 0, 26);
            th3 th3VarG2 = nv1.G(null, ux2Var, 1);
            rh3VarK = nv1.k(th3VarG2, 0.0f, 1080.0f, db8.J(db8.I0(6000, 2, q72.c), 6), null, ux2Var, 4536, 8);
            le5 le5Var2 = new le5((byte) 9);
            iy3 iy3Var3 = new iy3();
            le5Var2.invoke(iy3Var3);
            rh3VarK2 = nv1.k(th3VarG2, 0.0f, 360.0f, db8.J(new jy3(iy3Var3), 6), null, ux2Var, 4536, 8);
            iy3 iy3Var4 = new iy3();
            iy3Var4.a = (short) 6000;
            iy3Var4.a(Float.valueOf(0.87f), 3000).b = a;
            iy3Var4.a(Float.valueOf(0.1f), 6000);
            rh3VarK3 = nv1.k(th3VarG2, 0.1f, 0.87f, db8.J(new jy3(iy3Var4), 6), null, ux2Var, 4536, 8);
            fs4 fs4VarL2 = androidx.compose.foundation.layout.b.l(cp6.a(fs4Var4, true, new le5((byte) 10)), 40.0f);
            boolean zF3 = ux2Var.f(rh3VarK3);
            fs4 fs4Var6 = fs4Var4;
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zF = z2 | zF3 | ux2Var.f(rh3VarK) | ux2Var.f(rh3VarK2) | ux2Var.e(j5) | ux2Var.h(cc7Var) | ((((i7 & 112) ^ 48) <= 32 && ux2Var.e(jC)) || (i7 & 48) == 32);
            objK = ux2Var.K();
            if (zF) {
                j6 = jC;
                f7 = f3;
                j7 = j5;
                objK = new Function1() { // from class: o.qt5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        cc7 cc7Var2 = cc7Var;
                        long j9 = j6;
                        u52 u52Var = (u52) obj;
                        float fFloatValue = ((Number) rh3VarK3.getValue()).floatValue() * 360.0f;
                        boolean z3 = i8;
                        float f8 = f6;
                        if (z3 && Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (u52Var.d() >> 32))) {
                            f8 += f7;
                        }
                        float fR = (f8 / ((float) (((double) u52Var.R(Float.intBitsToFloat((int) (u52Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) rh3VarK2.getValue()).floatValue() + ((Number) rh3VarK.getValue()).floatValue();
                        long jT0 = u52Var.t0();
                        iu iuVarH0 = u52Var.h0();
                        long jD = iuVarH0.D();
                        iuVarH0.x().g();
                        try {
                            ((xc0) iuVarH0.f1103o).T(fFloatValue2, jT0);
                            st5.b(u52Var, Math.min(fFloatValue, fR) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fR) * 2.0f), j8, cc7Var2);
                            st5.b(u52Var, 0.0f, fFloatValue, j9, cc7Var2);
                            return f88.a;
                        } finally {
                            ua5.x(iuVarH0, jD);
                        }
                    }
                };
                ux2Var.g0(objK);
            } else {
                j6 = jC;
                f7 = f3;
                j7 = j5;
                objK = new Function1() { // from class: o.qt5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        cc7 cc7Var2 = cc7Var;
                        long j9 = j6;
                        u52 u52Var = (u52) obj;
                        float fFloatValue = ((Number) rh3VarK3.getValue()).floatValue() * 360.0f;
                        boolean z3 = i8;
                        float f8 = f6;
                        if (z3 && Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (u52Var.d() >> 32))) {
                            f8 += f7;
                        }
                        float fR = (f8 / ((float) (((double) u52Var.R(Float.intBitsToFloat((int) (u52Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) rh3VarK2.getValue()).floatValue() + ((Number) rh3VarK.getValue()).floatValue();
                        long jT0 = u52Var.t0();
                        iu iuVarH0 = u52Var.h0();
                        long jD = iuVarH0.D();
                        iuVarH0.x().g();
                        try {
                            ((xc0) iuVarH0.f1103o).T(fFloatValue2, jT0);
                            st5.b(u52Var, Math.min(fFloatValue, fR) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fR) * 2.0f), j8, cc7Var2);
                            st5.b(u52Var, 0.0f, fFloatValue, j9, cc7Var2);
                            return f88.a;
                        } finally {
                            ua5.x(iuVarH0, jD);
                        }
                    }
                };
                ux2Var.g0(objK);
            }
            vn4.K(0, (Function1) objK, ux2Var, fs4VarL2);
            fs4Var3 = fs4Var6;
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            ux2Var.Q();
            j3 = j2;
            fs4Var3 = fs4Var2;
            j4 = jC;
            f4 = f3;
            i6 = i;
            f5 = f2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.rt5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i2 | 1);
                    fs4 fs4Var7 = fs4Var3;
                    long j8 = j4;
                    float f8 = f4;
                    long j9 = j3;
                    boolean z3 = i6;
                    float f9 = f5;
                    st5.a(fs4Var7, j8, f8, j9, z3 ? 1 : 0, f9, (ux2) obj, iY, i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(u52 u52Var, float f, float f2, long j, cc7 cc7Var) {
        float f3 = cc7Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (u52Var.d() >> 32)) - (2.0f * f3);
        u52Var.i(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), cc7Var);
    }
}
