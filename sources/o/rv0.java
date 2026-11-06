package o;

/* JADX INFO: loaded from: classes.dex */
public final class rv0 {
    public static final long b = j51.j(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        j51.j(4282664004L);
        c = j51.j(4287137928L);
        j51.j(4291611852L);
        d = j51.j(4294967295L);
        e = j51.j(4294901760L);
        j51.j(4278255360L);
        f = j51.j(4278190335L);
        j51.j(4294967040L);
        j51.j(4278255615L);
        j51.j(4294902015L);
        g = j51.i(0);
        float[] fArr = ew0.a;
        h = j51.h(0.0f, 0.0f, 0.0f, 0.0f, ew0.u);
    }

    public /* synthetic */ rv0(long j) {
        this.a = j;
    }

    public static final long a(long j, cw0 cw0Var) {
        p51 p51VarX;
        cw0 cw0VarE = e(j);
        int i2 = cw0VarE.c;
        int i3 = cw0Var.c;
        if ((i2 | i3) < 0) {
            p51VarX = ck3.x(cw0VarE, cw0Var);
        } else {
            kw4 kw4Var = q51.a;
            int i4 = i2 | (i3 << 6);
            Object objB = kw4Var.b(i4);
            if (objB == null) {
                objB = ck3.x(cw0VarE, cw0Var);
                kw4Var.i(i4, objB);
            }
            p51VarX = (p51) objB;
        }
        return p51VarX.a(j);
    }

    public static long b(float f2, long j) {
        return j51.h(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fX;
        float f2;
        if ((63 & j) == 0) {
            fX = (float) n67.x((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fX = (float) n67.x((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fX / f2;
    }

    public static final float d(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) n67.x((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - dn2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final cw0 e(long j) {
        float[] fArr = ew0.a;
        return ew0.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) n67.x((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - dn2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) n67.x((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - dn2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fD = d(j);
        float fC = c(j);
        String str = e(j).a;
        StringBuilder sbN = e41.n("Color(", fG, ", ", f2, ", ");
        sbN.append(fD);
        sbN.append(", ");
        sbN.append(fC);
        sbN.append(", ");
        return e41.l(sbN, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rv0) {
            return this.a == ((rv0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
