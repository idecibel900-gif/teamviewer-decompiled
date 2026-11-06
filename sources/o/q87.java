package o;

import java.io.EOFException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class q87 extends vp3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ q87(byte b) {
        this.a = b;
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws qq3, EOFException {
        long j;
        boolean z = true;
        switch (this.a) {
            case 0:
                return nr3Var.r();
            case 1:
                int iJ = nr3Var.u;
                if (iJ == 0) {
                    iJ = nr3Var.j();
                }
                if (iJ == 5) {
                    nr3Var.u = 0;
                    int[] iArr = nr3Var.p;
                    int i = nr3Var.m - 1;
                    iArr[i] = iArr[i] + 1;
                } else {
                    if (iJ != 6) {
                        gk0.o("Expected a boolean but was ", e41.v(nr3Var.c0()), " at path ", nr3Var.z());
                        return null;
                    }
                    nr3Var.u = 0;
                    int[] iArr2 = nr3Var.p;
                    int i2 = nr3Var.m - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) hm3.y(nr3Var, "a byte", -128, 255));
            case 3:
                String strR = nr3Var.r();
                if (strR.length() <= 1) {
                    return Character.valueOf(strR.charAt(0));
                }
                throw new gq3(to7.k("Expected a char but was ", to7.i('\"', "\"", strR), " at path ", nr3Var.z()));
            case 4:
                return Double.valueOf(nr3Var.nextDouble());
            case 5:
                float fNextDouble = (float) nr3Var.nextDouble();
                if (nr3Var.q || !Float.isInfinite(fNextDouble)) {
                    return Float.valueOf(fNextDouble);
                }
                throw new gq3("JSON forbids NaN and infinities: " + fNextDouble + " at path " + nr3Var.z());
            case 6:
                return Integer.valueOf(nr3Var.nextInt());
            case 7:
                int iJ2 = nr3Var.u;
                if (iJ2 == 0) {
                    iJ2 = nr3Var.j();
                }
                if (iJ2 == 16) {
                    nr3Var.u = 0;
                    int[] iArr3 = nr3Var.p;
                    int i3 = nr3Var.m - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    j = nr3Var.v;
                } else {
                    if (iJ2 == 17) {
                        bf0 bf0Var = nr3Var.t;
                        long j2 = nr3Var.w;
                        bf0Var.getClass();
                        nr3Var.x = bf0Var.M0(j2, vn0.a);
                    } else if (iJ2 == 9 || iJ2 == 8) {
                        String strY = iJ2 == 9 ? nr3Var.Y(nr3.z) : nr3Var.Y(nr3.y);
                        nr3Var.x = strY;
                        try {
                            long j3 = Long.parseLong(strY);
                            nr3Var.u = 0;
                            int[] iArr4 = nr3Var.p;
                            int i4 = nr3Var.m - 1;
                            iArr4[i4] = iArr4[i4] + 1;
                            j = j3;
                        } catch (NumberFormatException unused) {
                            nr3Var.u = 11;
                            long jLongValueExact = new BigDecimal(nr3Var.x).longValueExact();
                            nr3Var.x = null;
                            nr3Var.u = 0;
                            int[] iArr5 = nr3Var.p;
                            int i5 = nr3Var.m - 1;
                            iArr5[i5] = iArr5[i5] + 1;
                            j = jLongValueExact;
                        }
                    } else if (iJ2 != 11) {
                        gk0.o("Expected a long but was ", e41.v(nr3Var.c0()), " at path ", nr3Var.z());
                        return null;
                    }
                    nr3Var.u = 11;
                    try {
                        long jLongValueExact2 = new BigDecimal(nr3Var.x).longValueExact();
                        nr3Var.x = null;
                        nr3Var.u = 0;
                        int[] iArr6 = nr3Var.p;
                        int i6 = nr3Var.m - 1;
                        iArr6[i6] = iArr6[i6] + 1;
                        j = jLongValueExact2;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        gk0.o("Expected a long but was ", nr3Var.x, " at path ", nr3Var.z());
                        return null;
                    }
                }
                return Long.valueOf(j);
            default:
                return Short.valueOf((short) hm3.y(nr3Var, "a short", -32768, 32767));
        }
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        switch (this.a) {
            case 0:
                pr3Var.l0((String) obj);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (pr3Var.q) {
                    hk0.l("Boolean cannot be used as a map key in JSON at path ".concat(pr3Var.F()));
                    return;
                }
                pr3Var.o0();
                pr3Var.e();
                pr3Var.s.Z0(zBooleanValue ? "true" : "false");
                int[] iArr = pr3Var.p;
                int i = pr3Var.m - 1;
                iArr[i] = iArr[i] + 1;
                return;
            case 2:
                pr3Var.k0(((Byte) obj).intValue() & 255);
                return;
            case 3:
                pr3Var.l0(((Character) obj).toString());
                return;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                pr3Var.getClass();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                if (pr3Var.q) {
                    pr3Var.q = false;
                    pr3Var.G(Double.toString(dDoubleValue));
                    return;
                }
                pr3Var.o0();
                pr3Var.e();
                pr3Var.s.Z0(Double.toString(dDoubleValue));
                int[] iArr2 = pr3Var.p;
                int i2 = pr3Var.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                pr3Var.getClass();
                String string = f.toString();
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    an4.i(f, "Numeric values must be finite, but was ");
                    return;
                }
                if (pr3Var.q) {
                    pr3Var.q = false;
                    pr3Var.G(string);
                    return;
                }
                pr3Var.o0();
                pr3Var.e();
                pr3Var.s.Z0(string);
                int[] iArr3 = pr3Var.p;
                int i3 = pr3Var.m - 1;
                iArr3[i3] = iArr3[i3] + 1;
                return;
            case 6:
                pr3Var.k0(((Integer) obj).intValue());
                return;
            case 7:
                pr3Var.k0(((Long) obj).longValue());
                return;
            default:
                pr3Var.k0(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
