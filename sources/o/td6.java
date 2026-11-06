package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class td6 extends cw0 {
    public static final yq4 r = new yq4(12);
    public final wi8 d;
    public final float e;
    public final float f;
    public final a18 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final q32 k;
    public final sd6 l;
    public final pd6 m;
    public final q32 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sd6 f2103o;
    public final pd6 p;
    public final boolean q;

    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0248  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public td6(String str, float[] fArr, wi8 wi8Var, float[] fArr2, q32 q32Var, q32 q32Var2, float f, float f2, a18 a18Var, int i) {
        char c;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        td6 td6Var;
        double d;
        boolean z;
        int i2;
        super(i, 12884901888L, str);
        this.d = wi8Var;
        this.e = f;
        this.f = f2;
        this.g = a18Var;
        this.k = q32Var;
        byte b = 1;
        this.l = new sd6(this, b);
        byte b2 = 0;
        this.m = new pd6(this, b2);
        this.n = q32Var2;
        this.f2103o = new sd6(this, b2);
        this.p = new pd6(this, b);
        if (fArr.length != 6 && fArr.length != 9) {
            hk0.g("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            an4.k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 6);
        }
        this.h = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = wi8Var.a;
            c = 1;
            float f21 = wi8Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.i = fArr3;
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                hk0.g(fx3.e(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = ck3.V(fArr3);
        float fQ = et1.q(fArr5);
        float[] fArr6 = ew0.a;
        if (fQ / et1.q(ew0.b) > 0.9f) {
            float[] fArr7 = ew0.a;
            float f38 = fArr5[0];
            float f39 = fArr7[0];
            float f40 = fArr5[c];
            float f41 = fArr7[c];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[0] = f38 - f39;
            fArr8[c] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[0];
            float f51 = fArr8[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = ew0.a;
                if (fArr5 == fArr4) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr5[i2], fArr4[i2]) != 0 || Math.abs(fArr5[i2] - fArr4[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (ck3.v(wi8Var, db8.z)) {
                            float[] fArr9 = ew0.a;
                            td6Var = ew0.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(q32Var.e(d) - td6Var.k.e(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (ck3.v(wi8Var, db8.z) && f == f4 && f2 == f3) {
                    float[] fArr10 = ew0.a;
                    td6Var = ew0.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(q32Var.e(d) - td6Var.k.e(d)) > 0.001d && Math.abs(q32Var2.e(d) - td6Var.n.e(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = ew0.a;
            if (fArr5 == fArr4) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr5[i2], fArr4[i2]) != 0) {
                        }
                        i2++;
                    } else if (ck3.v(wi8Var, db8.z)) {
                        float[] fArr11 = ew0.a;
                        td6Var = ew0.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(q32Var.e(d) - td6Var.k.e(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (ck3.v(wi8Var, db8.z)) {
                float[] fArr12 = ew0.a;
                td6Var = ew0.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(q32Var.e(d) - td6Var.k.e(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.q = z;
    }

    @Override // o.cw0
    public final float a(int i) {
        return this.f;
    }

    @Override // o.cw0
    public final float b(int i) {
        return this.e;
    }

    @Override // o.cw0
    public final boolean c() {
        return this.q;
    }

    @Override // o.cw0
    public final long d(float f, float f2, float f3) {
        double d = f;
        pd6 pd6Var = this.p;
        float fE = (float) pd6Var.e(d);
        float fE2 = (float) pd6Var.e(f2);
        float fE3 = (float) pd6Var.e(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fE3) + ((fArr[3] * fE2) + (fArr[0] * fE)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fE3) + (fArr[4] * fE2) + (fArr[1] * fE))));
    }

    @Override // o.cw0
    public final float e(float f, float f2, float f3) {
        double d = f;
        pd6 pd6Var = this.p;
        float fE = (float) pd6Var.e(d);
        float fE2 = (float) pd6Var.e(f2);
        float fE3 = (float) pd6Var.e(f3);
        float[] fArr = this.i;
        return (fArr[8] * fE3) + (fArr[5] * fE2) + (fArr[2] * fE);
    }

    @Override // o.cw0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || td6.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        td6 td6Var = (td6) obj;
        if (Float.compare(td6Var.e, this.e) != 0 || Float.compare(td6Var.f, this.f) != 0 || !im3.n(this.d, td6Var.d) || !Arrays.equals(this.h, td6Var.h)) {
            return false;
        }
        a18 a18Var = td6Var.g;
        a18 a18Var2 = this.g;
        if (a18Var2 != null) {
            return im3.n(a18Var2, a18Var);
        }
        if (a18Var == null) {
            return true;
        }
        if (im3.n(this.k, td6Var.k)) {
            return im3.n(this.n, td6Var.n);
        }
        return false;
    }

    @Override // o.cw0
    public final long f(float f, float f2, float f3, float f4, cw0 cw0Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        pd6 pd6Var = this.m;
        return j51.h((float) pd6Var.e(f5), (float) pd6Var.e(f6), (float) pd6Var.e(f7), f4, cw0Var);
    }

    @Override // o.cw0
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        a18 a18Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (a18Var != null ? a18Var.hashCode() : 0);
        if (a18Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public td6(String str, float[] fArr, wi8 wi8Var, final a18 a18Var, int i) {
        double d;
        q32 q32Var;
        q32 q32Var2;
        double d2 = a18Var.a;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = a18Var.g;
        double d4 = a18Var.f;
        if (z) {
            d = -3.0d;
            final byte b3 = 4;
            q32Var = new q32() { // from class: o.rd6
                @Override // o.q32
                public final double e(double d5) {
                    byte b4 = b3;
                    a18 a18Var2 = a18Var;
                    switch (b4) {
                        case 0:
                            float[] fArr2 = ew0.a;
                            return ew0.a(a18Var2, d5);
                        case 1:
                            float[] fArr3 = ew0.a;
                            return ew0.c(a18Var2, d5);
                        case 2:
                            double d6 = a18Var2.b;
                            return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                        case 3:
                            double d7 = a18Var2.b;
                            double d8 = a18Var2.c;
                            double d9 = a18Var2.d;
                            return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                        case 4:
                            float[] fArr4 = ew0.a;
                            return ew0.b(a18Var2, d5);
                        case 5:
                            float[] fArr5 = ew0.a;
                            return ew0.d(a18Var2, d5);
                        case 6:
                            double d10 = a18Var2.b;
                            double d11 = a18Var2.c;
                            double d12 = a18Var2.d;
                            return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a18Var2.b;
                            double d14 = a18Var2.c;
                            double d15 = a18Var2.d;
                            return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final byte b4 = 5;
                q32Var = new q32() { // from class: o.rd6
                    @Override // o.q32
                    public final double e(double d5) {
                        byte b5 = b4;
                        a18 a18Var2 = a18Var;
                        switch (b5) {
                            case 0:
                                float[] fArr2 = ew0.a;
                                return ew0.a(a18Var2, d5);
                            case 1:
                                float[] fArr3 = ew0.a;
                                return ew0.c(a18Var2, d5);
                            case 2:
                                double d6 = a18Var2.b;
                                return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                            case 3:
                                double d7 = a18Var2.b;
                                double d8 = a18Var2.c;
                                double d9 = a18Var2.d;
                                return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                            case 4:
                                float[] fArr4 = ew0.a;
                                return ew0.b(a18Var2, d5);
                            case 5:
                                float[] fArr5 = ew0.a;
                                return ew0.d(a18Var2, d5);
                            case 6:
                                double d10 = a18Var2.b;
                                double d11 = a18Var2.c;
                                double d12 = a18Var2.d;
                                return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a18Var2.b;
                                double d14 = a18Var2.c;
                                double d15 = a18Var2.d;
                                return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final byte b5 = 6;
                q32Var = new q32() { // from class: o.rd6
                    @Override // o.q32
                    public final double e(double d5) {
                        byte b6 = b5;
                        a18 a18Var2 = a18Var;
                        switch (b6) {
                            case 0:
                                float[] fArr2 = ew0.a;
                                return ew0.a(a18Var2, d5);
                            case 1:
                                float[] fArr3 = ew0.a;
                                return ew0.c(a18Var2, d5);
                            case 2:
                                double d6 = a18Var2.b;
                                return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                            case 3:
                                double d7 = a18Var2.b;
                                double d8 = a18Var2.c;
                                double d9 = a18Var2.d;
                                return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                            case 4:
                                float[] fArr4 = ew0.a;
                                return ew0.b(a18Var2, d5);
                            case 5:
                                float[] fArr5 = ew0.a;
                                return ew0.d(a18Var2, d5);
                            case 6:
                                double d10 = a18Var2.b;
                                double d11 = a18Var2.c;
                                double d12 = a18Var2.d;
                                return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a18Var2.b;
                                double d14 = a18Var2.c;
                                double d15 = a18Var2.d;
                                return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                        }
                    }
                };
            } else {
                final byte b6 = 7;
                q32Var = new q32() { // from class: o.rd6
                    @Override // o.q32
                    public final double e(double d5) {
                        byte b7 = b6;
                        a18 a18Var2 = a18Var;
                        switch (b7) {
                            case 0:
                                float[] fArr2 = ew0.a;
                                return ew0.a(a18Var2, d5);
                            case 1:
                                float[] fArr3 = ew0.a;
                                return ew0.c(a18Var2, d5);
                            case 2:
                                double d6 = a18Var2.b;
                                return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                            case 3:
                                double d7 = a18Var2.b;
                                double d8 = a18Var2.c;
                                double d9 = a18Var2.d;
                                return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                            case 4:
                                float[] fArr4 = ew0.a;
                                return ew0.b(a18Var2, d5);
                            case 5:
                                float[] fArr5 = ew0.a;
                                return ew0.d(a18Var2, d5);
                            case 6:
                                double d10 = a18Var2.b;
                                double d11 = a18Var2.c;
                                double d12 = a18Var2.d;
                                return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a18Var2.b;
                                double d14 = a18Var2.c;
                                double d15 = a18Var2.d;
                                return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            q32Var2 = new q32() { // from class: o.rd6
                @Override // o.q32
                public final double e(double d5) {
                    byte b7 = b;
                    a18 a18Var2 = a18Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = ew0.a;
                            return ew0.a(a18Var2, d5);
                        case 1:
                            float[] fArr3 = ew0.a;
                            return ew0.c(a18Var2, d5);
                        case 2:
                            double d6 = a18Var2.b;
                            return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                        case 3:
                            double d7 = a18Var2.b;
                            double d8 = a18Var2.c;
                            double d9 = a18Var2.d;
                            return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                        case 4:
                            float[] fArr4 = ew0.a;
                            return ew0.b(a18Var2, d5);
                        case 5:
                            float[] fArr5 = ew0.a;
                            return ew0.d(a18Var2, d5);
                        case 6:
                            double d10 = a18Var2.b;
                            double d11 = a18Var2.c;
                            double d12 = a18Var2.d;
                            return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a18Var2.b;
                            double d14 = a18Var2.c;
                            double d15 = a18Var2.d;
                            return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            q32Var2 = new q32() { // from class: o.rd6
                @Override // o.q32
                public final double e(double d5) {
                    byte b7 = b2;
                    a18 a18Var2 = a18Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = ew0.a;
                            return ew0.a(a18Var2, d5);
                        case 1:
                            float[] fArr3 = ew0.a;
                            return ew0.c(a18Var2, d5);
                        case 2:
                            double d6 = a18Var2.b;
                            return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                        case 3:
                            double d7 = a18Var2.b;
                            double d8 = a18Var2.c;
                            double d9 = a18Var2.d;
                            return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                        case 4:
                            float[] fArr4 = ew0.a;
                            return ew0.b(a18Var2, d5);
                        case 5:
                            float[] fArr5 = ew0.a;
                            return ew0.d(a18Var2, d5);
                        case 6:
                            double d10 = a18Var2.b;
                            double d11 = a18Var2.c;
                            double d12 = a18Var2.d;
                            return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a18Var2.b;
                            double d14 = a18Var2.c;
                            double d15 = a18Var2.d;
                            return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final byte b7 = 2;
            q32Var2 = new q32() { // from class: o.rd6
                @Override // o.q32
                public final double e(double d5) {
                    byte b8 = b7;
                    a18 a18Var2 = a18Var;
                    switch (b8) {
                        case 0:
                            float[] fArr2 = ew0.a;
                            return ew0.a(a18Var2, d5);
                        case 1:
                            float[] fArr3 = ew0.a;
                            return ew0.c(a18Var2, d5);
                        case 2:
                            double d6 = a18Var2.b;
                            return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                        case 3:
                            double d7 = a18Var2.b;
                            double d8 = a18Var2.c;
                            double d9 = a18Var2.d;
                            return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                        case 4:
                            float[] fArr4 = ew0.a;
                            return ew0.b(a18Var2, d5);
                        case 5:
                            float[] fArr5 = ew0.a;
                            return ew0.d(a18Var2, d5);
                        case 6:
                            double d10 = a18Var2.b;
                            double d11 = a18Var2.c;
                            double d12 = a18Var2.d;
                            return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a18Var2.b;
                            double d14 = a18Var2.c;
                            double d15 = a18Var2.d;
                            return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                    }
                }
            };
        } else {
            final byte b8 = 3;
            q32Var2 = new q32() { // from class: o.rd6
                @Override // o.q32
                public final double e(double d5) {
                    byte b9 = b8;
                    a18 a18Var2 = a18Var;
                    switch (b9) {
                        case 0:
                            float[] fArr2 = ew0.a;
                            return ew0.a(a18Var2, d5);
                        case 1:
                            float[] fArr3 = ew0.a;
                            return ew0.c(a18Var2, d5);
                        case 2:
                            double d6 = a18Var2.b;
                            return d5 >= a18Var2.e ? Math.pow((d6 * d5) + a18Var2.c, a18Var2.a) : a18Var2.d * d5;
                        case 3:
                            double d7 = a18Var2.b;
                            double d8 = a18Var2.c;
                            double d9 = a18Var2.d;
                            return d5 >= a18Var2.e ? Math.pow((d7 * d5) + d8, a18Var2.a) + a18Var2.f : (d9 * d5) + a18Var2.g;
                        case 4:
                            float[] fArr4 = ew0.a;
                            return ew0.b(a18Var2, d5);
                        case 5:
                            float[] fArr5 = ew0.a;
                            return ew0.d(a18Var2, d5);
                        case 6:
                            double d10 = a18Var2.b;
                            double d11 = a18Var2.c;
                            double d12 = a18Var2.d;
                            return d5 >= a18Var2.e * d12 ? (Math.pow(d5, 1.0d / a18Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a18Var2.b;
                            double d14 = a18Var2.c;
                            double d15 = a18Var2.d;
                            return d5 >= a18Var2.e * d15 ? (Math.pow(d5 - a18Var2.f, 1.0d / a18Var2.a) - d14) / d13 : (d5 - a18Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, wi8Var, null, q32Var, q32Var2, 0.0f, 1.0f, a18Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public td6(String str, float[] fArr, wi8 wi8Var, final double d, float f, float f2, int i) {
        q32 q32Var;
        q32 q32Var2 = r;
        if (d == 1.0d) {
            q32Var = q32Var2;
        } else {
            final byte b = 0;
            q32Var = new q32() { // from class: o.qd6
                @Override // o.q32
                public final double e(double d2) {
                    switch (b) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final byte b2 = 1;
            q32Var2 = new q32() { // from class: o.qd6
                @Override // o.q32
                public final double e(double d2) {
                    switch (b2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        q32 q32Var3 = q32Var2;
        this(str, fArr, wi8Var, null, q32Var, q32Var3, f, f2, new a18(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
