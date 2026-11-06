package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class iv8 implements qv8 {
    public static final int[] i = new int[0];
    public static final Unsafe j = vv8.d();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final iu8 e;
    public final int[] f;
    public final int g;
    public final int h;

    public iv8(int[] iArr, Object[] objArr, int i2, int i3, iu8 iu8Var, int[] iArr2, int i4, int i5, rk5 rk5Var, wj5 wj5Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.e = iu8Var;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbO = e41.o("Field ", str, " for ", name, " not found. Known fields are ");
            sbO.append(string);
            throw new RuntimeException(sbO.toString(), e);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vu8) {
            return ((vu8) obj).h();
        }
        return true;
    }

    public static int s(long j2, Object obj) {
        return ((Integer) vv8.c(j2, obj)).intValue();
    }

    public static int u(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long w(long j2, Object obj) {
        return ((Long) vv8.c(j2, obj)).longValue();
    }

    public final Object A(int i2, int i3, Object obj) {
        qv8 qv8VarY = y(i3);
        if (!q(i2, i3, obj)) {
            return qv8VarY.g();
        }
        Object object = j.getObject(obj, v(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        vu8 vu8VarG = qv8VarY.g();
        if (object != null) {
            qv8VarY.f(vu8VarG, object);
        }
        return vu8VarG;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // o.qv8
    public final void a(Object obj) {
        if (!p(obj)) {
            return;
        }
        if (obj instanceof vu8) {
            vu8 vu8Var = (vu8) obj;
            vu8Var.g();
            vu8Var.zza = 0;
            vu8Var.e();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                tv8 tv8Var = ((vu8) obj).zzc;
                if (tv8Var.e) {
                    tv8Var.e = false;
                    return;
                }
                return;
            }
            int iV = v(i2);
            int i3 = 1048575 & iV;
            int iU = u(iV);
            long j2 = i3;
            Unsafe unsafe = j;
            if (iU != 9) {
                if (iU != 60 && iU != 68) {
                    switch (iU) {
                        case 17:
                            if (n(i2, obj)) {
                                y(i2).a(unsafe.getObject(obj, j2));
                            }
                            break;
                        case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ju8 ju8Var = (ju8) ((yu8) vv8.c(j2, obj));
                            if (ju8Var.m) {
                                ju8Var.m = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((gv8) object).m = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (q(iArr[i2], i2, obj)) {
                    y(i2).a(unsafe.getObject(obj, j2));
                }
            } else if (n(i2, obj)) {
                y(i2).a(unsafe.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // o.qv8
    public final boolean b(vu8 vu8Var, vu8 vu8Var2) {
        boolean zE;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int iV = v(i2);
                int iU = u(iV);
                if (iU <= 50 || iU >= 69) {
                    long j2 = iV & 1048575;
                    switch (iU) {
                        case 0:
                            if (m(vu8Var, vu8Var2, i2)) {
                                c98 c98Var = vv8.c;
                                if (Double.doubleToLongBits(c98Var.k(j2, vu8Var)) != Double.doubleToLongBits(c98Var.k(j2, vu8Var2))) {
                                }
                            }
                            break;
                        case 1:
                            if (m(vu8Var, vu8Var2, i2)) {
                                c98 c98Var2 = vv8.c;
                                if (Float.floatToIntBits(c98Var2.l(j2, vu8Var)) != Float.floatToIntBits(c98Var2.l(j2, vu8Var2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.b(j2, vu8Var) != vv8.b(j2, vu8Var2)) {
                            }
                            break;
                        case 3:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.b(j2, vu8Var) != vv8.b(j2, vu8Var2)) {
                            }
                            break;
                        case 4:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case 5:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.b(j2, vu8Var) != vv8.b(j2, vu8Var2)) {
                            }
                            break;
                        case 6:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case 7:
                            if (m(vu8Var, vu8Var2, i2)) {
                                c98 c98Var3 = vv8.c;
                                if (c98Var3.p(j2, vu8Var) != c98Var3.p(j2, vu8Var2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m(vu8Var, vu8Var2, i2) || !rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2))) {
                            }
                            break;
                        case ep1.b /* 9 */:
                            if (!m(vu8Var, vu8Var2, i2) || !rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2))) {
                            }
                            break;
                        case ep1.c /* 10 */:
                            if (!m(vu8Var, vu8Var2, i2) || !rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2))) {
                            }
                            break;
                        case 11:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case ep1.d /* 12 */:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case 13:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case 14:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.b(j2, vu8Var) != vv8.b(j2, vu8Var2)) {
                            }
                            break;
                        case 15:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.a(j2, vu8Var) != vv8.a(j2, vu8Var2)) {
                            }
                            break;
                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                            if (!m(vu8Var, vu8Var2, i2) || vv8.b(j2, vu8Var) != vv8.b(j2, vu8Var2)) {
                            }
                            break;
                        case 17:
                            if (!m(vu8Var, vu8Var2, i2) || !rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2))) {
                            }
                            break;
                        case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zE = rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2));
                            if (zE) {
                            }
                            break;
                        case 50:
                            zE = rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2));
                            if (zE) {
                            }
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j3 = iArr[i2 + 2] & 1048575;
                            if (vv8.a(j3, vu8Var) == vv8.a(j3, vu8Var2) && rv8.e(vv8.c(j2, vu8Var), vv8.c(j2, vu8Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.h;
                while (true) {
                    int[] iArr2 = this.f;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (vv8.a(j4, vu8Var) != vv8.a(j4, vu8Var2)) {
                            return false;
                        }
                        if (!q(0, i4, vu8Var)) {
                            long jV = v(i4) & 1048575;
                            if (!rv8.e(vv8.c(jV, vu8Var), vv8.c(jV, vu8Var2))) {
                            }
                        }
                        i3++;
                    } else if (vu8Var.zzc.equals(vu8Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.qv8
    public final int c(vu8 vu8Var) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int i4;
        int i5;
        int iHashCode = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int iV = v(i6);
            int iU = u(iV);
            if (iU <= 50 || iU >= 69) {
                long j2 = iV & 1048575;
                int iHashCode2 = 37;
                switch (iU) {
                    case 0:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(vv8.c.k(j2, vu8Var));
                        byte[] bArr = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 1:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(vv8.c.l(j2, vu8Var));
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = vv8.b(j2, vu8Var);
                        byte[] bArr2 = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = vv8.b(j2, vu8Var);
                        byte[] bArr3 = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 4:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = vv8.b(j2, vu8Var);
                        byte[] bArr4 = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 6:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zP = vv8.c.p(j2, vu8Var);
                        byte[] bArr5 = zu8.a;
                        i4 = zP ? 1231 : 1237;
                        iHashCode = i2 + i4;
                        break;
                    case 8:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = ((String) vv8.c(j2, vu8Var)).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case ep1.b /* 9 */:
                        i5 = iHashCode * 53;
                        Object objC = vv8.c(j2, vu8Var);
                        if (objC != null) {
                            iHashCode2 = objC.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
                        break;
                    case ep1.c /* 10 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.c(j2, vu8Var).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 11:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case ep1.d /* 12 */:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 13:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = vv8.b(j2, vu8Var);
                        byte[] bArr6 = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 15:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.a(j2, vu8Var);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = vv8.b(j2, vu8Var);
                        byte[] bArr7 = zu8.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 17:
                        i5 = iHashCode * 53;
                        Object objC2 = vv8.c(j2, vu8Var);
                        if (objC2 != null) {
                            iHashCode2 = objC2.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.c(j2, vu8Var).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 50:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = vv8.c(j2, vu8Var).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.h;
        while (true) {
            int[] iArr = this.f;
            if (i7 >= iArr.length) {
                return vu8Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!q(0, i8, vu8Var)) {
                iHashCode = vv8.c(v(i8) & 1048575, vu8Var).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    @Override // o.qv8
    public final boolean d(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.g) {
            int i7 = this.f[i4];
            int iV = this.v(i7);
            int[] iArr = this.a;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = j.getInt(obj, i9);
                }
                i3 = i5;
                i2 = i9;
            } else {
                i2 = i6;
                i3 = i5;
            }
            iv8 iv8Var = this;
            Object obj2 = obj;
            if ((268435456 & iV) == 0 || iv8Var.o(obj2, i7, i2, i3, i10)) {
                int iU = u(iV);
                if (iU != 9 && iU != 17) {
                    if (iU != 27) {
                        if (iU == 60 || iU == 68) {
                            if (!iv8Var.q(iArr[i7], i7, obj2) || iv8Var.y(i7).d(vv8.c(iV & 1048575, obj2))) {
                            }
                        } else if (iU != 49) {
                            if (iU == 50 && !((gv8) vv8.c(iV & 1048575, obj2)).isEmpty()) {
                                int i11 = i7 / 3;
                                throw ua5.i(iv8Var.b[i11 + i11]);
                            }
                        }
                        i4++;
                        this = iv8Var;
                        obj = obj2;
                        i6 = i2;
                        i5 = i3;
                    }
                    List list = (List) vv8.c(iV & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qv8 qv8VarY = iv8Var.y(i7);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (qv8VarY.d(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    this = iv8Var;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                } else if (!iv8Var.o(obj2, i7, i2, i3, i10) || iv8Var.y(i7).d(vv8.c(iV & 1048575, obj2))) {
                    i4++;
                    this = iv8Var;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0363  */
    /* JADX WARN: Code duplicated, block: B:191:0x0487  */
    /* JADX WARN: Code duplicated, block: B:223:0x0578  */
    /* JADX WARN: Code duplicated, block: B:226:0x0586  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // o.qv8
    public final int e(iu8 iu8Var) {
        int i2;
        int iW;
        int iX;
        int iW2;
        int iB;
        int iW3;
        int iC;
        int i3;
        int iW4;
        int iH;
        int i4;
        int iC2;
        int iW5;
        int size;
        int iN;
        int iW6;
        int iW7;
        int iB2;
        int iW8;
        int size2;
        int iW9;
        int iC3;
        int iW10;
        int iX2;
        int iS;
        int iW11;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iC4 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                return ((vu8) iu8Var).zzc.a() + iC4;
            }
            int iV = v(i7);
            int iU = u(iV);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            Unsafe unsafe = j;
            if (iU <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(iu8Var, i11);
                    i6 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i2 = 0;
            }
            int i12 = iV & i5;
            if (iU >= tu8.n.m) {
                byte b = tu8.f2146o.m;
            }
            long j2 = i12;
            switch (iU) {
                case 0:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        long j3 = unsafe.getLong(iu8Var, j2);
                        iW = cv0.W(i9 << 3);
                        iX = cv0.X(j3);
                        iH = iX + iW;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        long j4 = unsafe.getLong(iu8Var, j2);
                        iW = cv0.W(i9 << 3);
                        iX = cv0.X(j4);
                        iH = iX + iW;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        long j5 = unsafe.getInt(iu8Var, j2);
                        iW = cv0.W(i9 << 3);
                        iX = cv0.X(j5);
                        iH = iX + iW;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 1, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(iu8Var, j2);
                        if (object instanceof mu8) {
                            iW2 = cv0.W(i13);
                            iB = ((mu8) object).c();
                        } else {
                            iW2 = cv0.W(i13);
                            int i14 = ew8.a;
                            iB = uf0.B((String) object);
                        }
                        iC4 = to7.d(iB, iB, iW2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case ep1.b /* 9 */:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        Object object2 = unsafe.getObject(iu8Var, j2);
                        qv8 qv8VarY = y(i7);
                        rk5 rk5Var = rv8.a;
                        iW3 = cv0.W(i9 << 3);
                        iC = ((iu8) object2).c(qv8VarY);
                        iC4 = to7.d(iC, iC, iW3, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case ep1.c /* 10 */:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        mu8 mu8Var = (mu8) unsafe.getObject(iu8Var, j2);
                        iW2 = cv0.W(i9 << 3);
                        iB = mu8Var.c();
                        iC4 = to7.d(iB, iB, iW2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        i3 = unsafe.getInt(iu8Var, j2);
                        iW4 = cv0.W(i9 << 3);
                        iC4 = to7.c(i3, iW4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case ep1.d /* 12 */:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        long j6 = unsafe.getInt(iu8Var, j2);
                        iW = cv0.W(i9 << 3);
                        iX = cv0.X(j6);
                        iH = iX + iW;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        int i15 = unsafe.getInt(iu8Var, j2);
                        iW4 = cv0.W(i9 << 3);
                        i3 = (i15 >> 31) ^ (i15 + i15);
                        iC4 = to7.c(i3, iW4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        long j7 = unsafe.getLong(iu8Var, j2);
                        iW = cv0.W(i9 << 3);
                        iX = cv0.X((j7 >> 63) ^ (j7 + j7));
                        iH = iX + iW;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (o(iu8Var, i7, i6, i8, i2)) {
                        iu8 iu8Var2 = (iu8) unsafe.getObject(iu8Var, j2);
                        qv8 qv8VarY2 = y(i7);
                        rk5 rk5Var2 = rv8.a;
                        int iW12 = cv0.W(i9 << 3);
                        i4 = iW12 + iW12;
                        iC2 = iu8Var2.c(qv8VarY2);
                        iH = iC2 + i4;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    iH = rv8.h(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    iH = rv8.g(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var3 = rv8.a;
                    if (list.size() == 0) {
                        iW5 = 0;
                    } else {
                        iW5 = (cv0.W(i9 << 3) * list.size()) + rv8.j(list);
                    }
                    iC4 += iW5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var4 = rv8.a;
                    size = list2.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.n(list2);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var5 = rv8.a;
                    size = list3.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.i(list3);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iH = rv8.h(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iH = rv8.g(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var6 = rv8.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iW5 = 0;
                    } else {
                        iW5 = (cv0.W(i9 << 3) + 1) * size3;
                    }
                    iC4 += iW5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var7 = rv8.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iW7 = 0;
                    } else {
                        iW7 = cv0.W(i9 << 3) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof mu8) {
                                iB2 = ((mu8) obj).c();
                            } else {
                                int i17 = ew8.a;
                                iB2 = uf0.B((String) obj);
                            }
                            iW7 = to7.c(iB2, iB2, iW7);
                        }
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(iu8Var, j2);
                    qv8 qv8VarY3 = y(i7);
                    rk5 rk5Var8 = rv8.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iW8 = 0;
                    } else {
                        iW8 = cv0.W(i9 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int iC5 = ((iu8) list6.get(i18)).c(qv8VarY3);
                            iW8 = to7.c(iC5, iC5, iW8);
                        }
                    }
                    iC4 += iW8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var9 = rv8.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iW7 = 0;
                    } else {
                        iW7 = cv0.W(i9 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iC6 = ((mu8) list7.get(i19)).c();
                            iW7 = to7.c(iC6, iC6, iW7);
                        }
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var10 = rv8.a;
                    size = list8.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.m(list8);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var11 = rv8.a;
                    size = list9.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.f(list9);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iH = rv8.g(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iH = rv8.h(i9, (List) unsafe.getObject(iu8Var, j2));
                    iC4 += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var12 = rv8.a;
                    size = list10.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.k(list10);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var13 = rv8.a;
                    size = list11.size();
                    if (size == 0) {
                        iW7 = 0;
                    } else {
                        iN = rv8.l(list11);
                        iW6 = cv0.W(i9 << 3);
                        iW7 = (iW6 * size) + iN;
                    }
                    iC4 += iW7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var14 = rv8.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var15 = rv8.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    size2 = rv8.j((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    size2 = rv8.n((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    size2 = rv8.i((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var16 = rv8.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var17 = rv8.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var18 = rv8.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    size2 = rv8.m((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    size2 = rv8.f((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var19 = rv8.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(iu8Var, j2);
                    rk5 rk5Var20 = rv8.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    size2 = rv8.k((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    size2 = rv8.l((List) unsafe.getObject(iu8Var, j2));
                    if (size2 > 0) {
                        iW9 = cv0.W(i9 << 3);
                        iC4 = to7.d(size2, iW9, size2, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(iu8Var, j2);
                    qv8 qv8VarY4 = y(i7);
                    rk5 rk5Var21 = rv8.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC3 = 0;
                    } else {
                        iC3 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            iu8 iu8Var3 = (iu8) list19.get(i20);
                            int iW13 = cv0.W(i9 << 3);
                            iC3 += iu8Var3.c(qv8VarY4) + iW13 + iW13;
                        }
                    }
                    iC4 += iC3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    int i21 = i7 / 3;
                    gv8 gv8Var = (gv8) unsafe.getObject(iu8Var, j2);
                    if (this.b[i21 + i21] != null) {
                        io.sentry.h2.f();
                        return 0;
                    }
                    if (gv8Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = gv8Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (q(i9, i7, iu8Var)) {
                        long jW = w(j2, iu8Var);
                        iW10 = cv0.W(i9 << 3);
                        iX2 = cv0.X(jW);
                        iC4 += iX2 + iW10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (q(i9, i7, iu8Var)) {
                        long jW2 = w(j2, iu8Var);
                        iW10 = cv0.W(i9 << 3);
                        iX2 = cv0.X(jW2);
                        iC4 += iX2 + iW10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (q(i9, i7, iu8Var)) {
                        long jS = s(j2, iu8Var);
                        iW10 = cv0.W(i9 << 3);
                        iX2 = cv0.X(jS);
                        iC4 += iX2 + iW10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 1, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (q(i9, i7, iu8Var)) {
                        int i22 = i9 << 3;
                        Object object3 = unsafe.getObject(iu8Var, j2);
                        if (object3 instanceof mu8) {
                            iW3 = cv0.W(i22);
                            iC = ((mu8) object3).c();
                        } else {
                            iW3 = cv0.W(i22);
                            int i23 = ew8.a;
                            iC = uf0.B((String) object3);
                        }
                        iC4 = to7.d(iC, iC, iW3, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (q(i9, i7, iu8Var)) {
                        Object object4 = unsafe.getObject(iu8Var, j2);
                        qv8 qv8VarY5 = y(i7);
                        rk5 rk5Var22 = rv8.a;
                        iW3 = cv0.W(i9 << 3);
                        iC = ((iu8) object4).c(qv8VarY5);
                        iC4 = to7.d(iC, iC, iW3, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (q(i9, i7, iu8Var)) {
                        mu8 mu8Var2 = (mu8) unsafe.getObject(iu8Var, j2);
                        iW3 = cv0.W(i9 << 3);
                        iC = mu8Var2.c();
                        iC4 = to7.d(iC, iC, iW3, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (q(i9, i7, iu8Var)) {
                        iS = s(j2, iu8Var);
                        iW11 = cv0.W(i9 << 3);
                        iC4 = to7.c(iS, iW11, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (q(i9, i7, iu8Var)) {
                        long jS2 = s(j2, iu8Var);
                        iW10 = cv0.W(i9 << 3);
                        iX2 = cv0.X(jS2);
                        iC4 += iX2 + iW10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 4, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (q(i9, i7, iu8Var)) {
                        iC4 = to7.c(i9 << 3, 8, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (q(i9, i7, iu8Var)) {
                        int iS2 = s(j2, iu8Var);
                        iW11 = cv0.W(i9 << 3);
                        iS = (iS2 >> 31) ^ (iS2 + iS2);
                        iC4 = to7.c(iS, iW11, iC4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (q(i9, i7, iu8Var)) {
                        long jW3 = w(j2, iu8Var);
                        iW10 = cv0.W(i9 << 3);
                        iX2 = cv0.X((jW3 >> 63) ^ (jW3 + jW3));
                        iC4 += iX2 + iW10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (q(i9, i7, iu8Var)) {
                        iu8 iu8Var4 = (iu8) unsafe.getObject(iu8Var, j2);
                        qv8 qv8VarY6 = y(i7);
                        rk5 rk5Var23 = rv8.a;
                        int iW14 = cv0.W(i9 << 3);
                        i4 = iW14 + iW14;
                        iC2 = iu8Var4.c(qv8VarY6);
                        iH = iC2 + i4;
                        iC4 += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    @Override // o.qv8
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            hk0.g("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                rv8.o(obj, obj2);
                return;
            }
            int iV = v(i2);
            int i3 = iV & 1048575;
            int iU = u(iV);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iU) {
                case 0:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        c98 c98Var = vv8.c;
                        c98Var.n(obj3, j2, c98Var.k(j2, obj2));
                        l(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        c98 c98Var2 = vv8.c;
                        c98Var2.o(obj3, j2, c98Var2.l(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.c.a.putLong(obj3, j2, vv8.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.c.a.putLong(obj3, j2, vv8.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.c.a.putLong(obj3, j2, vv8.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        c98 c98Var3 = vv8.c;
                        c98Var3.m(obj3, j2, c98Var3.p(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.h(j2, obj3, vv8.c(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case ep1.b /* 9 */:
                    obj3 = obj;
                    j(i2, obj3, obj2);
                    continue;
                    i2 += 3;
                    obj = obj3;
                    break;
                case ep1.c /* 10 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.h(j2, obj3, vv8.c(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case ep1.d /* 12 */:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.c.a.putLong(obj3, j2, vv8.b(j2, obj2));
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (n(i2, obj2)) {
                        vv8.g(vv8.a(j2, obj2), j2, obj3);
                        l(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (n(i2, obj2)) {
                        obj3 = obj;
                        vv8.c.a.putLong(obj3, j2, vv8.b(j2, obj2));
                        l(i2, obj3);
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 17:
                    j(i2, obj, obj2);
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    yu8 yu8VarQ = (yu8) vv8.c(j2, obj);
                    yu8 yu8Var = (yu8) vv8.c(j2, obj2);
                    int size = yu8VarQ.size();
                    int size2 = yu8Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((ju8) yu8VarQ).m) {
                            yu8VarQ = yu8VarQ.q(size2 + size);
                        }
                        yu8VarQ.addAll(yu8Var);
                    }
                    if (size > 0) {
                        yu8Var = yu8VarQ;
                    }
                    vv8.h(j2, obj, yu8Var);
                    break;
                case 50:
                    rk5 rk5Var = rv8.a;
                    vv8.h(j2, obj, g57.u(vv8.c(j2, obj), vv8.c(j2, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i4, i2, obj2)) {
                        vv8.h(j2, obj, vv8.c(j2, obj2));
                        vv8.g(i4, iArr[i2 + 2] & 1048575, obj);
                    }
                    break;
                case 60:
                    k(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i4, i2, obj2)) {
                        vv8.h(j2, obj, vv8.c(j2, obj2));
                        vv8.g(i4, iArr[i2 + 2] & 1048575, obj);
                    }
                    break;
                case 68:
                    k(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // o.qv8
    public final vu8 g() {
        return (vu8) ((vu8) this.e).j(4);
    }

    @Override // o.qv8
    public final void h(Object obj, byte[] bArr, int i2, int i3, lp2 lp2Var) {
        r(obj, bArr, i2, i3, 0, lp2Var);
    }

    @Override // o.qv8
    public final void i(Object obj, hj8 hj8Var) throws ou8 {
        int i2;
        cv0 cv0Var = (cv0) hj8Var.n;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                ((vu8) obj).zzc.d(hj8Var);
                return;
            }
            int iV = v(i5);
            int iU = u(iV);
            int i7 = iArr[i5];
            Unsafe unsafe = j;
            if (iU <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iV & i3;
            int i10 = 3;
            switch (iU) {
                case 0:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.N(i7, Double.doubleToRawLongBits(vv8.c.k(j2, obj)));
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.L(i7, Float.floatToRawIntBits(vv8.c.l(j2, obj)));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.U(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.U(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.P(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.N(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.L(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (o(obj, i5, i4, i6, i2)) {
                        boolean zP = vv8.c.p(j2, obj);
                        cv0Var.T(i7 << 3);
                        cv0Var.J(zP ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            cv0Var.T((i7 << 3) | 2);
                            byte[] bArr = (byte[]) cv0Var.d;
                            int i11 = cv0Var.c;
                            try {
                                int iW = cv0.W(str.length() * 3);
                                int iW2 = cv0.W(str.length());
                                if (iW2 == iW) {
                                    int i12 = i11 + iW2;
                                    cv0Var.c = i12;
                                    int iA = ew8.a(i12, bArr.length - i12, str, bArr);
                                    cv0Var.c = i11;
                                    cv0Var.T((iA - i11) - iW2);
                                    cv0Var.c = iA;
                                } else {
                                    int i13 = ew8.a;
                                    cv0Var.T(uf0.B(str));
                                    int i14 = cv0Var.c;
                                    cv0Var.c = ew8.a(i14, bArr.length - i14, str, bArr);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new ou8("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                            }
                        } else {
                            mu8 mu8Var = (mu8) object;
                            cv0Var.T((i7 << 3) | 2);
                            cv0Var.T(mu8Var.c());
                            mu8Var.g(cv0Var);
                        }
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ep1.b /* 9 */:
                    if (o(obj, i5, i4, i6, i2)) {
                        hj8Var.b(i7, unsafe.getObject(obj, j2), y(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ep1.c /* 10 */:
                    if (o(obj, i5, i4, i6, i2)) {
                        mu8 mu8Var2 = (mu8) unsafe.getObject(obj, j2);
                        cv0Var.T((i7 << 3) | 2);
                        cv0Var.T(mu8Var2.c());
                        mu8Var2.g(cv0Var);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.S(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ep1.d /* 12 */:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.P(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.L(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (o(obj, i5, i4, i6, i2)) {
                        cv0Var.N(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (o(obj, i5, i4, i6, i2)) {
                        int i15 = unsafe.getInt(obj, j2);
                        cv0Var.S(i7, (i15 >> 31) ^ (i15 + i15));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (o(obj, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(obj, j2);
                        cv0Var.U(i7, (j3 >> 63) ^ (j3 + j3));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (o(obj, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        cv0Var.R(i7, 3);
                        y(i5).i((iu8) object2, hj8Var);
                        cv0Var.R(i7, 4);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    rv8.q(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    rv8.u(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    rv8.w(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    rv8.d(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    rv8.v(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    rv8.t(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    rv8.s(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    rv8.p(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    int i16 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j2);
                    rk5 rk5Var = rv8.a;
                    if (list != null && !list.isEmpty()) {
                        int i17 = 0;
                        while (i17 < list.size()) {
                            String str2 = (String) list.get(i17);
                            cv0Var.T((i16 << 3) | 2);
                            byte[] bArr2 = (byte[]) cv0Var.d;
                            int i18 = cv0Var.c;
                            try {
                                int iW3 = cv0.W(str2.length() * i10);
                                int iW4 = cv0.W(str2.length());
                                if (iW4 == iW3) {
                                    int i19 = i18 + iW4;
                                    cv0Var.c = i19;
                                    int iA2 = ew8.a(i19, bArr2.length - i19, str2, bArr2);
                                    cv0Var.c = i18;
                                    cv0Var.T((iA2 - i18) - iW4);
                                    cv0Var.c = iA2;
                                } else {
                                    int i20 = ew8.a;
                                    cv0Var.T(uf0.B(str2));
                                    int i21 = cv0Var.c;
                                    cv0Var.c = ew8.a(i21, bArr2.length - i21, str2, bArr2);
                                }
                                i17++;
                                i10 = 3;
                            } catch (IndexOutOfBoundsException e2) {
                                throw new ou8("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                            }
                        }
                    }
                    break;
                case 27:
                    int i22 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    qv8 qv8VarY = y(i5);
                    rk5 rk5Var2 = rv8.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            hj8Var.b(i22, list2.get(i23), qv8VarY);
                        }
                    }
                    break;
                case 28:
                    int i24 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    rk5 rk5Var3 = rv8.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            mu8 mu8Var3 = (mu8) list3.get(i25);
                            cv0Var.T((i24 << 3) | 2);
                            cv0Var.T(mu8Var3.c());
                            mu8Var3.g(cv0Var);
                        }
                    }
                    break;
                case 29:
                    rv8.c(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    rv8.r(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    rv8.x(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    rv8.y(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    rv8.a(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    rv8.b(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    rv8.q(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 36:
                    rv8.u(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 37:
                    rv8.w(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 38:
                    rv8.d(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 39:
                    rv8.v(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 40:
                    rv8.t(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 41:
                    rv8.s(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 42:
                    rv8.p(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 43:
                    rv8.c(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 44:
                    rv8.r(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 45:
                    rv8.x(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 46:
                    rv8.y(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 47:
                    rv8.a(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 48:
                    rv8.b(iArr[i5], (List) unsafe.getObject(obj, j2), hj8Var, true);
                    break;
                case 49:
                    int i26 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    qv8 qv8VarY2 = y(i5);
                    rk5 rk5Var4 = rv8.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            iu8 iu8Var = (iu8) list4.get(i27);
                            cv0Var.R(i26, 3);
                            qv8VarY2.i(iu8Var, hj8Var);
                            cv0Var.R(i26, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i28 = i5 / 3;
                        throw ua5.i(this.b[i28 + i28]);
                    }
                    break;
                case 51:
                    if (q(i7, i5, obj)) {
                        cv0Var.N(i7, Double.doubleToRawLongBits(((Double) vv8.c(j2, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (q(i7, i5, obj)) {
                        cv0Var.L(i7, Float.floatToRawIntBits(((Float) vv8.c(j2, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (q(i7, i5, obj)) {
                        cv0Var.U(i7, w(j2, obj));
                    }
                    break;
                case 54:
                    if (q(i7, i5, obj)) {
                        cv0Var.U(i7, w(j2, obj));
                    }
                    break;
                case 55:
                    if (q(i7, i5, obj)) {
                        cv0Var.P(i7, s(j2, obj));
                    }
                    break;
                case 56:
                    if (q(i7, i5, obj)) {
                        cv0Var.N(i7, w(j2, obj));
                    }
                    break;
                case 57:
                    if (q(i7, i5, obj)) {
                        cv0Var.L(i7, s(j2, obj));
                    }
                    break;
                case 58:
                    if (q(i7, i5, obj)) {
                        boolean zBooleanValue = ((Boolean) vv8.c(j2, obj)).booleanValue();
                        cv0Var.T(i7 << 3);
                        cv0Var.J(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (q(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (!(object3 instanceof String)) {
                            mu8 mu8Var4 = (mu8) object3;
                            cv0Var.T((i7 << 3) | 2);
                            cv0Var.T(mu8Var4.c());
                            mu8Var4.g(cv0Var);
                        } else {
                            String str3 = (String) object3;
                            cv0Var.T((i7 << 3) | 2);
                            byte[] bArr3 = (byte[]) cv0Var.d;
                            int i29 = cv0Var.c;
                            try {
                                int iW5 = cv0.W(str3.length() * 3);
                                int iW6 = cv0.W(str3.length());
                                if (iW6 == iW5) {
                                    int i30 = i29 + iW6;
                                    cv0Var.c = i30;
                                    int iA3 = ew8.a(i30, bArr3.length - i30, str3, bArr3);
                                    cv0Var.c = i29;
                                    cv0Var.T((iA3 - i29) - iW6);
                                    cv0Var.c = iA3;
                                } else {
                                    int i31 = ew8.a;
                                    cv0Var.T(uf0.B(str3));
                                    int i32 = cv0Var.c;
                                    cv0Var.c = ew8.a(i32, bArr3.length - i32, str3, bArr3);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new ou8("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                            }
                        }
                    }
                    break;
                case 60:
                    if (q(i7, i5, obj)) {
                        hj8Var.b(i7, unsafe.getObject(obj, j2), y(i5));
                    }
                    break;
                case 61:
                    if (q(i7, i5, obj)) {
                        mu8 mu8Var5 = (mu8) unsafe.getObject(obj, j2);
                        cv0Var.T((i7 << 3) | 2);
                        cv0Var.T(mu8Var5.c());
                        mu8Var5.g(cv0Var);
                    }
                    break;
                case 62:
                    if (q(i7, i5, obj)) {
                        cv0Var.S(i7, s(j2, obj));
                    }
                    break;
                case 63:
                    if (q(i7, i5, obj)) {
                        cv0Var.P(i7, s(j2, obj));
                    }
                    break;
                case 64:
                    if (q(i7, i5, obj)) {
                        cv0Var.L(i7, s(j2, obj));
                    }
                    break;
                case 65:
                    if (q(i7, i5, obj)) {
                        cv0Var.N(i7, w(j2, obj));
                    }
                    break;
                case 66:
                    if (q(i7, i5, obj)) {
                        int iS = s(j2, obj);
                        cv0Var.S(i7, (iS >> 31) ^ (iS + iS));
                    }
                    break;
                case 67:
                    if (q(i7, i5, obj)) {
                        long jW = w(j2, obj);
                        cv0Var.U(i7, (jW >> 63) ^ (jW + jW));
                    }
                    break;
                case 68:
                    if (q(i7, i5, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        cv0Var.R(i7, 3);
                        y(i5).i((iu8) object4, hj8Var);
                        cv0Var.R(i7, 4);
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    public final void j(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long jV = v(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i2] + " is present but null: " + obj2.toString());
            }
            qv8 qv8VarY = y(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    vu8 vu8VarG = qv8VarY.g();
                    qv8VarY.f(vu8VarG, object);
                    unsafe.putObject(obj, jV, vu8VarG);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                l(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!p(object2)) {
                vu8 vu8VarG2 = qv8VarY.g();
                qv8VarY.f(vu8VarG2, object2);
                unsafe.putObject(obj, jV, vu8VarG2);
                object2 = vu8VarG2;
            }
            qv8VarY.f(object2, object);
        }
    }

    public final void k(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (q(i3, i2, obj2)) {
            long jV = v(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2.toString());
            }
            qv8 qv8VarY = y(i2);
            if (!q(i3, i2, obj)) {
                if (p(object)) {
                    vu8 vu8VarG = qv8VarY.g();
                    qv8VarY.f(vu8VarG, object);
                    unsafe.putObject(obj, jV, vu8VarG);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                vv8.g(i3, iArr[i2 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!p(object2)) {
                vu8 vu8VarG2 = qv8VarY.g();
                qv8VarY.f(vu8VarG2, object2);
                unsafe.putObject(obj, jV, vu8VarG2);
                object2 = vu8VarG2;
            }
            qv8VarY.f(object2, object);
        }
    }

    public final void l(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        vv8.g((1 << (i3 >>> 20)) | vv8.a(j2, obj), j2, obj);
    }

    public final boolean m(vu8 vu8Var, vu8 vu8Var2, int i2) {
        return n(i2, vu8Var) == n(i2, vu8Var2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean n(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i3 >>> 20)) & vv8.a(j2, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iV = v(i2);
        long j3 = iV & 1048575;
        switch (u(iV)) {
            case 0:
                if (Double.doubleToRawLongBits(vv8.c.k(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(vv8.c.l(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (vv8.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (vv8.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (vv8.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return vv8.c.p(j3, obj);
            case 8:
                Object objC = vv8.c(j3, obj);
                if (objC instanceof String) {
                    if (((String) objC).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objC instanceof mu8)) {
                    yq4.f();
                    return false;
                }
                if (mu8.n.equals(objC)) {
                    return false;
                }
                return true;
            case ep1.b /* 9 */:
                if (vv8.c(j3, obj) != null) {
                    return true;
                }
                return false;
            case ep1.c /* 10 */:
                if (mu8.n.equals(vv8.c(j3, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case ep1.d /* 12 */:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (vv8.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (vv8.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                if (vv8.b(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (vv8.c(j3, obj) != null) {
                    return true;
                }
                return false;
            default:
                yq4.f();
                return false;
        }
    }

    public final boolean o(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return n(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    public final boolean q(int i2, int i3, Object obj) {
        return vv8.a((long) (this.a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b7 A[LOOP:14: B:99:0x02b1->B:102:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0302  */
    /* JADX WARN: Code duplicated, block: B:122:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x031e  */
    /* JADX WARN: Code duplicated, block: B:126:0x031f A[PHI: r3
      0x031f: PHI (r3v57 byte) = (r3v34 byte), (r3v66 byte) binds: [B:123:0x031a, B:125:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0325  */
    /* JADX WARN: Code duplicated, block: B:130:0x0326 A[PHI: r3
      0x0326: PHI (r3v58 byte) = (r3v57 byte), (r3v65 byte) binds: [B:127:0x0321, B:129:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0351  */
    /* JADX WARN: Code duplicated, block: B:140:0x0357  */
    /* JADX WARN: Code duplicated, block: B:142:0x0369  */
    /* JADX WARN: Code duplicated, block: B:526:0x0ccb A[PHI: r1 r4 r6 r9 r12 r21
      0x0ccb: PHI (r1v82 byte[]) = (r1v81 byte[]), (r1v83 byte[]) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]
      0x0ccb: PHI (r4v103 int) = (r4v102 int), (r4v104 int) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]
      0x0ccb: PHI (r6v82 o.lp2) = (r6v81 o.lp2), (r6v83 o.lp2) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]
      0x0ccb: PHI (r9v64 int) = (r9v63 int), (r9v65 int) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]
      0x0ccb: PHI (r12v22 int) = (r12v21 int), (r12v23 int) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]
      0x0ccb: PHI (r21v35 int) = (r21v34 int), (r21v36 int) binds: [B:528:0x0cd9, B:513:0x0c92] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:552:0x0dc1 A[PHI: r1 r4 r6 r9 r12 r17 r21
      0x0dc1: PHI (r1v111 byte[]) = 
      (r1v75 byte[])
      (r1v76 byte[])
      (r1v77 byte[])
      (r1v78 byte[])
      (r1v79 byte[])
      (r1v80 byte[])
      (r1v82 byte[])
      (r1v85 byte[])
      (r1v93 byte[])
      (r1v101 byte[])
      (r1v112 byte[])
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r4v118 int) = 
      (r4v96 int)
      (r4v97 int)
      (r4v98 int)
      (r4v99 int)
      (r4v100 int)
      (r4v101 int)
      (r4v103 int)
      (r4v105 int)
      (r4v109 int)
      (r4v114 int)
      (r4v119 int)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r6v97 o.lp2) = 
      (r6v75 o.lp2)
      (r6v76 o.lp2)
      (r6v77 o.lp2)
      (r6v78 o.lp2)
      (r6v79 o.lp2)
      (r6v80 o.lp2)
      (r6v82 o.lp2)
      (r6v84 o.lp2)
      (r6v88 o.lp2)
      (r6v93 o.lp2)
      (r6v98 o.lp2)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r9v91 int) = 
      (r9v57 int)
      (r9v58 int)
      (r9v59 int)
      (r9v60 int)
      (r9v61 int)
      (r9v62 int)
      (r9v64 int)
      (r9v67 int)
      (r9v75 int)
      (r9v82 int)
      (r9v92 int)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r12v39 int) = 
      (r12v15 int)
      (r12v16 int)
      (r12v17 int)
      (r12v18 int)
      (r12v19 int)
      (r12v20 int)
      (r12v22 int)
      (r12v24 int)
      (r12v32 int)
      (r12v36 int)
      (r12v40 int)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r17v53 o.tv8) = 
      (r17v29 o.tv8)
      (r17v30 o.tv8)
      (r17v31 o.tv8)
      (r17v32 o.tv8)
      (r17v33 o.tv8)
      (r17v34 o.tv8)
      (r17v36 o.tv8)
      (r17v42 o.tv8)
      (r17v46 o.tv8)
      (r17v50 o.tv8)
      (r17v54 o.tv8)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]
      0x0dc1: PHI (r21v49 int) = 
      (r21v28 int)
      (r21v29 int)
      (r21v30 int)
      (r21v31 int)
      (r21v32 int)
      (r21v33 int)
      (r21v35 int)
      (r21v37 int)
      (r21v40 int)
      (r21v45 int)
      (r21v50 int)
     binds: [B:550:0x0daa, B:547:0x0d86, B:544:0x0d66, B:541:0x0d46, B:538:0x0d26, B:535:0x0d05, B:526:0x0ccb, B:511:0x0c7b, B:490:0x0bcc, B:485:0x0b9b, B:476:0x0b1b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:554:0x0dc4  */
    /* JADX WARN: Code duplicated, block: B:556:0x0dd5  */
    /* JADX WARN: Code duplicated, block: B:558:0x0ddc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:563:0x0df3  */
    /* JADX WARN: Code duplicated, block: B:642:0x0a95 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0aa6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int r(Object obj, byte[] bArr, int i2, int i3, int i4, lp2 lp2Var) {
        int i5;
        int[] iArr;
        Object[] objArr;
        Object obj2;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iA;
        byte[] bArr2;
        vu8 vu8Var;
        tv8 tv8VarB;
        int i10;
        byte[] bArr3;
        int i11;
        int i12;
        lp2 lp2Var2;
        Unsafe unsafe2;
        lp2 lp2Var3;
        Object obj3;
        Unsafe unsafe3;
        int iB;
        int i13;
        int i14;
        int i15;
        byte b;
        byte b2;
        int i16;
        int i17;
        byte b3;
        int i18;
        byte b4;
        int i19;
        byte b5;
        byte[] bArr4;
        lp2 lp2Var4;
        Object obj4;
        Unsafe unsafe4;
        Unsafe unsafe5;
        int i20;
        int i21;
        tv8 tv8Var;
        int i22;
        int i23;
        int i24;
        int i25;
        byte[] bArr5;
        int i26;
        int iW;
        int i27;
        tv8 tv8Var2;
        int iB2;
        gv8 gv8Var;
        Unsafe unsafe6;
        tv8 tv8Var3;
        int i28;
        int i29;
        int i30;
        int iZ;
        int i31;
        int i32;
        int iB3;
        int i33;
        int i34;
        int iD;
        yu8 yu8Var;
        int i35;
        du8 du8Var;
        tv8 tv8VarB2;
        Unsafe unsafe7;
        int i36;
        int i37;
        iv8 iv8Var = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i3 = i3;
        lp2Var = lp2Var;
        if (!p(obj5)) {
            hk0.g("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int iY = i2;
        int i38 = -1;
        int iT = 0;
        int i39 = 1048575;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            Object[] objArr2 = iv8Var.b;
            int[] iArr2 = iv8Var.a;
            Unsafe unsafe8 = j;
            if (iY < i3) {
                int iC = iY + 1;
                int i42 = bArr6[iY];
                if (i42 < 0) {
                    iC = u47.C(i42, bArr6, iC, lp2Var);
                    i42 = lp2Var.a;
                }
                int i43 = iC;
                i41 = i42;
                int i44 = (i41 == true ? 1 : 0) >>> 3;
                int i45 = iv8Var.d;
                int i46 = iv8Var.c;
                iT = i44 > i38 ? (i44 < i46 || i44 > i45) ? -1 : iv8Var.t(i44, iT / 3) : (i44 < i46 || i44 > i45) ? -1 : iv8Var.t(i44, 0);
                tv8 tv8Var4 = tv8.f;
                if (iT == -1) {
                    tv8Var4 = tv8Var4;
                    i6 = i43;
                    i5 = i39;
                    i7 = i40;
                    iArr = iArr2;
                    objArr = objArr2;
                    iT = 0;
                    i8 = i44;
                    obj2 = obj5;
                    unsafe = unsafe8;
                    i9 = i41 == true ? 1 : 0;
                } else {
                    boolean z = (i41 == true ? 1 : 0) & 7;
                    int i47 = iArr2[iT + 1];
                    int iU = u(i47);
                    long j2 = i47 & 1048575;
                    Unsafe unsafe9 = j;
                    String str = "";
                    if (iU <= 17) {
                        int i48 = iArr2[iT + 2];
                        int i49 = 1 << (i48 >>> 20);
                        int i50 = i48 & 1048575;
                        iArr = iArr2;
                        if (i50 != i39) {
                            int i51 = 1048575;
                            if (i39 != 1048575) {
                                unsafe8.putInt(obj5, i39, i40);
                                i51 = 1048575;
                            }
                            int i52 = i50 == i51 ? 0 : unsafe8.getInt(obj5, i50);
                            i10 = i50;
                            i40 = i52;
                        } else {
                            i10 = i39;
                        }
                        switch (iU) {
                            case 0:
                                bArr3 = bArr;
                                i11 = i43;
                                i40 = i40;
                                i12 = i10;
                                i8 = i44;
                                lp2Var2 = lp2Var;
                                tv8Var4 = tv8Var4;
                                unsafe2 = unsafe8;
                                if (z == 1) {
                                    vv8.c.n(obj5, j2, Double.longBitsToDouble(u47.H(bArr3, i11)));
                                    iY = i11 + 8;
                                    i38 = i8;
                                    lp2Var = lp2Var2;
                                    bArr6 = bArr3;
                                    i40 |= i49;
                                    i39 = i12;
                                } else {
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4 || i4 == 0) {
                                        vu8Var = (vu8) obj2;
                                        tv8VarB = vu8Var.zzc;
                                        if (tv8VarB == tv8Var4) {
                                            tv8VarB = tv8.b();
                                            vu8Var.zzc = tv8VarB;
                                        }
                                        tv8 tv8Var5 = tv8VarB;
                                        byte[] bArr7 = bArr2;
                                        int i53 = i9;
                                        iA = u47.A(i53 == true ? 1 : 0, bArr7, i6, i3, tv8Var5, lp2Var);
                                        bArr6 = bArr;
                                        lp2Var = lp2Var;
                                        i41 = i53 == true ? 1 : 0;
                                        i3 = i3;
                                        obj5 = obj2;
                                        i38 = i8;
                                        i40 = i7;
                                        i39 = i5;
                                        iY = iA;
                                        iv8Var = this;
                                    } else {
                                        i3 = i3;
                                        iY = i6;
                                        i41 = i9;
                                        i40 = i7;
                                    }
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i11 = i43;
                                i40 = i40;
                                i12 = i10;
                                i8 = i44;
                                lp2Var2 = lp2Var;
                                tv8Var4 = tv8Var4;
                                unsafe2 = unsafe8;
                                if (z == 5) {
                                    iY = i11 + 4;
                                    vv8.c.o(obj5, j2, Float.intBitsToFloat(u47.x(bArr3, i11)));
                                    i38 = i8;
                                    lp2Var = lp2Var2;
                                    i39 = i12;
                                    i40 |= i49;
                                    bArr6 = bArr3;
                                    i41 = i41;
                                } else {
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var6 = tv8VarB;
                                    byte[] bArr8 = bArr2;
                                    int i54 = i9;
                                    iA = u47.A(i54 == true ? 1 : 0, bArr8, i6, i3, tv8Var6, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i54 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 2:
                            case 3:
                                i40 = i40;
                                i8 = i44;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                lp2Var2 = lp2Var;
                                if (z == 0) {
                                    int iE = u47.E(bArr3, i11, lp2Var2);
                                    unsafe5.putLong(obj5, j2, lp2Var2.b);
                                    iY = iE;
                                    i38 = i8;
                                    lp2Var = lp2Var2;
                                    bArr6 = bArr3;
                                    i39 = i12;
                                    i41 = i41;
                                    i40 |= i49;
                                    iT = iT;
                                } else {
                                    unsafe2 = unsafe5;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var7 = tv8VarB;
                                    byte[] bArr9 = bArr2;
                                    int i55 = i9;
                                    iA = u47.A(i55 == true ? 1 : 0, bArr9, i6, i3, tv8Var7, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i55 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 4:
                            case 11:
                                i40 = i40;
                                i8 = i44;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                lp2Var2 = lp2Var;
                                if (z == 0) {
                                    int iB4 = u47.B(bArr3, i11, lp2Var2);
                                    unsafe5.putInt(obj5, j2, lp2Var2.a);
                                    iY = iB4;
                                    i38 = i8;
                                    iT = iT;
                                    lp2Var = lp2Var2;
                                    bArr6 = bArr3;
                                    i39 = i12;
                                    i41 = i41;
                                    i40 |= i49;
                                    i3 = i3;
                                } else {
                                    unsafe2 = unsafe5;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var8 = tv8VarB;
                                    byte[] bArr10 = bArr2;
                                    int i56 = i9;
                                    iA = u47.A(i56 == true ? 1 : 0, bArr10, i6, i3, tv8Var8, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i56 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                lp2Var3 = lp2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                i40 = i40;
                                i8 = i44;
                                if (z == 1) {
                                    obj5 = obj3;
                                    unsafe3.putLong(obj5, j2, u47.H(bArr3, i11));
                                    i3 = i3;
                                    iY = i11 + 8;
                                    i38 = i8;
                                    iT = iT;
                                    lp2Var = lp2Var3;
                                    bArr6 = bArr3;
                                    i40 |= i49;
                                    i39 = i12;
                                    i41 = i41;
                                } else {
                                    lp2Var2 = lp2Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var9 = tv8VarB;
                                    byte[] bArr11 = bArr2;
                                    int i57 = i9;
                                    iA = u47.A(i57 == true ? 1 : 0, bArr11, i6, i3, tv8Var9, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i57 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                lp2Var3 = lp2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                i40 = i40;
                                i8 = i44;
                                if (z == 5) {
                                    int i58 = i11 + 4;
                                    unsafe3.putInt(obj3, j2, u47.x(bArr3, i11));
                                    i40 |= i49;
                                    i38 = i8;
                                    i3 = i3;
                                    lp2Var = lp2Var3;
                                    iY = i58;
                                    obj5 = obj3;
                                    iT = iT;
                                    bArr6 = bArr3;
                                    i39 = i12;
                                    i41 = i41;
                                } else {
                                    lp2Var2 = lp2Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var10 = tv8VarB;
                                    byte[] bArr12 = bArr2;
                                    int i59 = i9;
                                    iA = u47.A(i59 == true ? 1 : 0, bArr12, i6, i3, tv8Var10, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i59 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                lp2Var3 = lp2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                i40 = i40;
                                i8 = i44;
                                if (z == 0) {
                                    int i60 = i40 | i49;
                                    int iE2 = u47.E(bArr3, i11, lp2Var3);
                                    vv8.c.m(obj3, j2, lp2Var3.b != 0);
                                    lp2Var = lp2Var3;
                                    iY = iE2;
                                    i38 = i8;
                                    bArr6 = bArr3;
                                    i40 = i60;
                                    obj5 = obj3;
                                    i39 = i12;
                                } else {
                                    lp2Var2 = lp2Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var11 = tv8VarB;
                                    byte[] bArr13 = bArr2;
                                    int i510 = i9;
                                    iA = u47.A(i510 == true ? 1 : 0, bArr13, i6, i3, tv8Var11, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i510 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                lp2Var3 = lp2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                i40 = i40;
                                i8 = i44;
                                if (z == 2) {
                                    if ((i47 & 536870912) != 0) {
                                        int i61 = i40 | i49;
                                        int iB5 = u47.B(bArr3, i11, lp2Var3);
                                        int i62 = lp2Var3.a;
                                        if (i62 < 0) {
                                            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i62 == 0) {
                                            lp2Var3.d = "";
                                            i14 = i61;
                                        } else {
                                            int i63 = ew8.a;
                                            int length = bArr3.length;
                                            if ((((length - iB5) - i62) | iB5 | i62) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iB5), Integer.valueOf(i62)));
                                            }
                                            int i64 = iB5 + i62;
                                            char[] cArr = new char[i62];
                                            int i65 = 0;
                                            while (iB5 < i64) {
                                                byte b6 = bArr3[iB5];
                                                if (b6 >= 0) {
                                                    iB5++;
                                                    cArr[i65] = (char) b6;
                                                    i65++;
                                                } else {
                                                    while (iB5 < i64) {
                                                        i15 = iB5 + 1;
                                                        i61 = i61;
                                                        b = bArr3[iB5];
                                                        if (b >= 0) {
                                                            cArr[i65] = (char) b;
                                                            i65++;
                                                            iB5 = i15;
                                                            while (iB5 < i64) {
                                                                b2 = bArr3[iB5];
                                                                if (b2 >= 0) {
                                                                    iB5++;
                                                                    cArr[i65] = (char) b2;
                                                                    i65++;
                                                                } else {
                                                                    i61 = i61;
                                                                }
                                                            }
                                                            i61 = i61;
                                                        } else {
                                                            i16 = iB5;
                                                            if (b >= -32) {
                                                                if (b < -16) {
                                                                    i17 = i64;
                                                                    if (i15 < i17 - 2) {
                                                                        an4.s("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    b3 = bArr3[i15];
                                                                    int i66 = i16 + 3;
                                                                    byte b7 = bArr3[i16 + 2];
                                                                    int i67 = i16 + 4;
                                                                    byte b8 = bArr3[i66];
                                                                    if (!h67.q(b3)) {
                                                                        if ((((b3 + 112) + (b << 28)) >> 30) != 0 && !h67.q(b7) && !h67.q(b8)) {
                                                                            int i68 = ((b & 7) << 18) | ((b3 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                            cArr[i65] = (char) ((i68 >>> 10) + 55232);
                                                                            cArr[i65 + 1] = (char) ((i68 & 1023) + 56320);
                                                                            i65 += 2;
                                                                            iB5 = i67;
                                                                        }
                                                                    }
                                                                    an4.s("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                if (i15 < i64 - 1) {
                                                                    an4.s("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                i18 = i65 + 1;
                                                                int i69 = i16 + 2;
                                                                b4 = bArr3[i15];
                                                                i19 = i16 + 3;
                                                                b5 = bArr3[i69];
                                                                if (!h67.q(b4)) {
                                                                    i17 = i64;
                                                                    if (b != -32) {
                                                                        if (b != -19) {
                                                                            if (!h67.q(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iB5 = i19;
                                                                                i65 = i18;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!h67.q(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iB5 = i19;
                                                                                i65 = i18;
                                                                            }
                                                                        }
                                                                    } else if (b4 >= -96) {
                                                                        b = -32;
                                                                        if (b != -19) {
                                                                            if (!h67.q(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iB5 = i19;
                                                                                i65 = i18;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!h67.q(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iB5 = i19;
                                                                                i65 = i18;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                an4.s("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                                i64 = i17;
                                                            } else {
                                                                if (i15 < i64) {
                                                                    an4.s("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i70 = i65 + 1;
                                                                int i71 = i16 + 2;
                                                                byte b9 = bArr3[i15];
                                                                if (b >= -62 || h67.q(b9)) {
                                                                    an4.s("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                cArr[i65] = (char) (((b & 31) << 6) | (b9 & 63));
                                                                i61 = i61;
                                                                iB5 = i71;
                                                                i65 = i70;
                                                            }
                                                        }
                                                    }
                                                    i14 = i61;
                                                    int i72 = i64;
                                                    str = new String(cArr, 0, i65);
                                                    lp2Var3.d = str;
                                                    iB5 = i72;
                                                }
                                            }
                                            while (iB5 < i64) {
                                                i15 = iB5 + 1;
                                                i61 = i61;
                                                b = bArr3[iB5];
                                                if (b >= 0) {
                                                    cArr[i65] = (char) b;
                                                    i65++;
                                                    iB5 = i15;
                                                    while (iB5 < i64) {
                                                        b2 = bArr3[iB5];
                                                        if (b2 >= 0) {
                                                            iB5++;
                                                            cArr[i65] = (char) b2;
                                                            i65++;
                                                        } else {
                                                            i61 = i61;
                                                        }
                                                    }
                                                    i61 = i61;
                                                } else {
                                                    i16 = iB5;
                                                    if (b >= -32) {
                                                        if (i15 < i64) {
                                                            an4.s("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        int i73 = i65 + 1;
                                                        int i74 = i16 + 2;
                                                        byte b10 = bArr3[i15];
                                                        if (b >= -62) {
                                                        }
                                                        an4.s("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (b < -16) {
                                                        i17 = i64;
                                                        if (i15 < i17 - 2) {
                                                            an4.s("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        b3 = bArr3[i15];
                                                        int i610 = i16 + 3;
                                                        byte b11 = bArr3[i16 + 2];
                                                        int i611 = i16 + 4;
                                                        byte b12 = bArr3[i610];
                                                        if (!h67.q(b3)) {
                                                            if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                                                            }
                                                        }
                                                        an4.s("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (i15 < i64 - 1) {
                                                        an4.s("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    i18 = i65 + 1;
                                                    int i612 = i16 + 2;
                                                    b4 = bArr3[i15];
                                                    i19 = i16 + 3;
                                                    b5 = bArr3[i612];
                                                    if (!h67.q(b4)) {
                                                        i17 = i64;
                                                        if (b != -32) {
                                                            if (b != -19) {
                                                                if (!h67.q(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iB5 = i19;
                                                                    i65 = i18;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!h67.q(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iB5 = i19;
                                                                    i65 = i18;
                                                                }
                                                            }
                                                        } else if (b4 >= -96) {
                                                            b = -32;
                                                            if (b != -19) {
                                                                if (!h67.q(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iB5 = i19;
                                                                    i65 = i18;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!h67.q(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iB5 = i19;
                                                                    i65 = i18;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    an4.s("Protocol message had invalid UTF-8.");
                                                    return 0;
                                                    i64 = i17;
                                                }
                                            }
                                            i14 = i61;
                                            int i75 = i64;
                                            str = new String(cArr, 0, i65);
                                            lp2Var3.d = str;
                                            iB5 = i75;
                                        }
                                        i13 = i14;
                                        iB = iB5;
                                    } else {
                                        iB = u47.B(bArr3, i11, lp2Var3);
                                        int i76 = lp2Var3.a;
                                        if (i76 < 0) {
                                            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i13 = i40 | i49;
                                        if (i76 == 0) {
                                            lp2Var3.d = "";
                                        } else {
                                            str = new String(bArr3, iB, i76, StandardCharsets.UTF_8);
                                            lp2Var3.d = str;
                                            iB += i76;
                                        }
                                    }
                                    unsafe3.putObject(obj3, j2, str);
                                    obj5 = obj3;
                                    i38 = i8;
                                    i39 = i12;
                                    i40 = i13;
                                    lp2Var = lp2Var3;
                                    iY = iB;
                                    bArr6 = bArr3;
                                    i41 = i41;
                                } else {
                                    lp2Var2 = lp2Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var12 = tv8VarB;
                                    byte[] bArr14 = bArr2;
                                    int i511 = i9;
                                    iA = u47.A(i511 == true ? 1 : 0, bArr14, i6, i3, tv8Var12, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i511 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case ep1.b /* 9 */:
                                Object obj6 = obj5;
                                unsafe3 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                if (z == 2) {
                                    i40 |= i49;
                                    Object objZ = iv8Var.z(iT, obj6);
                                    lp2Var = lp2Var;
                                    int iG = u47.G(objZ, iv8Var.y(iT), bArr, i11, i3, lp2Var);
                                    unsafe9.putObject(obj, iv8Var.v(iT) & 1048575, objZ);
                                    iv8Var.l(iT, obj);
                                    iY = iG;
                                    obj5 = obj;
                                    bArr6 = bArr;
                                    i38 = i44;
                                    i39 = i12;
                                    i41 = i41;
                                } else {
                                    obj3 = obj6;
                                    bArr3 = bArr;
                                    lp2Var2 = lp2Var;
                                    i40 = i40;
                                    i8 = i44;
                                    tv8Var4 = tv8Var4;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var13 = tv8VarB;
                                    byte[] bArr15 = bArr2;
                                    int i512 = i9;
                                    iA = u47.A(i512 == true ? 1 : 0, bArr15, i6, i3, tv8Var13, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i512 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case ep1.c /* 10 */:
                                bArr4 = bArr;
                                lp2Var4 = lp2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                if (z == 2) {
                                    i40 |= i49;
                                    int iW2 = u47.w(bArr4, i11, lp2Var4);
                                    unsafe4.putObject(obj4, j2, lp2Var4.d);
                                    obj5 = obj4;
                                    iY = iW2;
                                    bArr6 = bArr4;
                                    lp2Var = lp2Var4;
                                    i38 = i44;
                                    i39 = i12;
                                    i41 = i41;
                                } else {
                                    lp2Var2 = lp2Var4;
                                    i8 = i44;
                                    tv8Var4 = tv8Var4;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var14 = tv8VarB;
                                    byte[] bArr16 = bArr2;
                                    int i513 = i9;
                                    iA = u47.A(i513 == true ? 1 : 0, bArr16, i6, i3, tv8Var14, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i513 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case ep1.d /* 12 */:
                                bArr4 = bArr;
                                lp2Var4 = lp2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i43;
                                i12 = i10;
                                if (z == 0) {
                                    int iB6 = u47.B(bArr4, i11, lp2Var4);
                                    int i77 = lp2Var4.a;
                                    du8 du8VarX = iv8Var.x(iT);
                                    if ((i47 & Integer.MIN_VALUE) == 0 || du8VarX == null || du8VarX.a(i77)) {
                                        i20 = i41;
                                        i40 |= i49;
                                        unsafe4.putInt(obj4, j2, i77);
                                    } else {
                                        vu8 vu8Var2 = (vu8) obj4;
                                        tv8 tv8VarB3 = vu8Var2.zzc;
                                        if (tv8VarB3 == tv8Var4) {
                                            tv8VarB3 = tv8.b();
                                            vu8Var2.zzc = tv8VarB3;
                                        }
                                        i20 = i41;
                                        tv8VarB3.c(i20 == true ? 1 : 0, Long.valueOf(i77));
                                    }
                                    obj5 = obj4;
                                    iY = iB6;
                                    bArr6 = bArr4;
                                    lp2Var = lp2Var4;
                                    i38 = i44;
                                    i39 = i12;
                                    i41 = i20;
                                    iT = iT;
                                } else {
                                    lp2Var2 = lp2Var4;
                                    i8 = i44;
                                    tv8Var4 = tv8Var4;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var15 = tv8VarB;
                                    byte[] bArr17 = bArr2;
                                    int i514 = i9;
                                    iA = u47.A(i514 == true ? 1 : 0, bArr17, i6, i3, tv8Var15, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i514 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                lp2Var4 = lp2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i11 = i43;
                                if (z == 0) {
                                    i40 |= i49;
                                    int iB7 = u47.B(bArr4, i11, lp2Var4);
                                    unsafe4.putInt(obj4, j2, f57.t(lp2Var4.a));
                                    obj5 = obj4;
                                    iY = iB7;
                                    bArr6 = bArr4;
                                    iT = iT;
                                    i39 = i10;
                                    lp2Var = lp2Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    i12 = i10;
                                    lp2Var2 = lp2Var4;
                                    i8 = i44;
                                    tv8Var4 = tv8Var4;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var16 = tv8VarB;
                                    byte[] bArr18 = bArr2;
                                    int i515 = i9;
                                    iA = u47.A(i515 == true ? 1 : 0, bArr18, i6, i3, tv8Var16, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i515 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                bArr4 = bArr;
                                lp2Var4 = lp2Var;
                                i11 = i43;
                                if (z == 0) {
                                    i40 |= i49;
                                    int iE3 = u47.E(bArr4, i11, lp2Var4);
                                    long j3 = lp2Var4.b;
                                    unsafe8.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    iY = iE3;
                                    bArr6 = bArr4;
                                    iT = iT;
                                    i39 = i10;
                                    lp2Var = lp2Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    i40 = i40;
                                    i12 = i10;
                                    lp2Var2 = lp2Var4;
                                    i8 = i44;
                                    tv8Var4 = tv8Var4;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe8;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var17 = tv8VarB;
                                    byte[] bArr19 = bArr2;
                                    int i516 = i9;
                                    iA = u47.A(i516 == true ? 1 : 0, bArr19, i6, i3, tv8Var17, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i516 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                            default:
                                if (z == 3) {
                                    Object objZ2 = iv8Var.z(iT, obj5);
                                    int iF = u47.F(objZ2, iv8Var.y(iT), bArr, i43, i3, (i44 << 3) | 4, lp2Var);
                                    bArr4 = bArr;
                                    lp2Var4 = lp2Var;
                                    unsafe9.putObject(obj5, iv8Var.v(iT) & 1048575, objZ2);
                                    iv8Var.l(iT, obj5);
                                    i40 |= i49;
                                    iY = iF;
                                    bArr6 = bArr4;
                                    iT = iT;
                                    i39 = i10;
                                    lp2Var = lp2Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    bArr3 = bArr;
                                    i40 = i40;
                                    i8 = i44;
                                    i11 = i43;
                                    tv8Var4 = tv8Var4;
                                    unsafe2 = unsafe8;
                                    i12 = i10;
                                    lp2Var2 = lp2Var;
                                    i4 = i4;
                                    obj2 = obj5;
                                    iT = iT;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i5 = i12;
                                    i7 = i40;
                                    i9 = i41;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    lp2Var = lp2Var2;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var18 = tv8VarB;
                                    byte[] bArr110 = bArr2;
                                    int i517 = i9;
                                    iA = u47.A(i517 == true ? 1 : 0, bArr110, i6, i3, tv8Var18, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i517 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                    i39 = i5;
                                    iY = iA;
                                    iv8Var = this;
                                }
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        i7 = i40;
                        i5 = i39;
                        if (iU != 27) {
                            obj2 = obj5;
                            i22 = i43;
                            if (iU <= 49) {
                                long j4 = i47;
                                yu8 yu8VarQ = (yu8) unsafe8.getObject(obj2, j2);
                                if (!((ju8) yu8VarQ).m) {
                                    int size = yu8VarQ.size();
                                    yu8VarQ = yu8VarQ.q(size + size);
                                    unsafe8.putObject(obj2, j2, yu8VarQ);
                                }
                                yu8 yu8Var2 = yu8VarQ;
                                switch (iU) {
                                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                    case 35:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 1) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                                    case 36:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 5) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i30 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            if (z == 0) {
                                                int iD2 = u47.D(i30 == true ? 1 : 0, bArr, i29, i3, yu8Var2, lp2Var);
                                                i28 = i30 == true ? 1 : 0;
                                                i22 = i29;
                                                iY = iD2;
                                            }
                                            i28 = i30;
                                            i22 = i29;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            iZ = u47.z(bArr, i29, yu8Var2, lp2Var);
                                            i28 = i30;
                                            iY = iZ;
                                            i22 = i29;
                                        }
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i30 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 1) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        i28 = i30;
                                        i22 = i29;
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe6 = unsafe8;
                                        i29 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i30 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            if (z == 5) {
                                                iZ = i29 + 4;
                                                wu8 wu8Var = (wu8) yu8Var2;
                                                wu8Var.d(u47.x(bArr, i29));
                                                while (iZ < i3) {
                                                    int iB8 = u47.B(bArr, iZ, lp2Var);
                                                    if (i30 == lp2Var.a) {
                                                        wu8Var.d(u47.x(bArr, iB8));
                                                        iZ = iB8 + 4;
                                                    } else {
                                                        i28 = i30;
                                                        iY = iZ;
                                                    }
                                                }
                                                i28 = i30;
                                                iY = iZ;
                                            }
                                            i28 = i30;
                                            i22 = i29;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            wu8 wu8Var2 = (wu8) yu8Var2;
                                            int iB9 = u47.B(bArr, i29, lp2Var);
                                            int i78 = lp2Var.a;
                                            if (i78 < 0) {
                                                an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i78 > bArr.length - iB9) {
                                                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i79 = iB9 + i78;
                                            int i80 = wu8Var2.f2446o + (i78 >> 2);
                                            int length2 = wu8Var2.n.length;
                                            if (i80 > length2) {
                                                if (length2 != 0) {
                                                    while (length2 < i80) {
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                    }
                                                    wu8Var2.n = Arrays.copyOf(wu8Var2.n, length2);
                                                } else {
                                                    wu8Var2.n = new int[Math.max(i80, 10)];
                                                }
                                            }
                                            while (iB9 < i79) {
                                                wu8Var2.d(u47.x(bArr, iB9));
                                                iB9 += 4;
                                            }
                                            if (iB9 != i79) {
                                                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i28 = i30 == true ? 1 : 0;
                                            iY = iB9;
                                        }
                                        i22 = i29;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe6 = unsafe8;
                                        i31 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i32 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        i28 = i32;
                                        i22 = i31;
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    case 26:
                                        unsafe6 = unsafe8;
                                        i31 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i32 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            if ((j4 & 536870912) == 0) {
                                                iB3 = u47.B(bArr, i31, lp2Var);
                                                int i81 = lp2Var.a;
                                                if (i81 < 0) {
                                                    an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i81 == 0) {
                                                    yu8Var2.add("");
                                                } else {
                                                    yu8Var2.add(new String(bArr, iB3, i81, StandardCharsets.UTF_8));
                                                    iB3 += i81;
                                                }
                                                while (iB3 < i3) {
                                                    int iB10 = u47.B(bArr, iB3, lp2Var);
                                                    if (i32 == lp2Var.a) {
                                                        iB3 = u47.B(bArr, iB10, lp2Var);
                                                        int i82 = lp2Var.a;
                                                        if (i82 < 0) {
                                                            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i82 == 0) {
                                                            yu8Var2.add("");
                                                        } else {
                                                            yu8Var2.add(new String(bArr, iB3, i82, StandardCharsets.UTF_8));
                                                            iB3 += i82;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iB3 = u47.B(bArr, i31, lp2Var);
                                                int i83 = lp2Var.a;
                                                if (i83 < 0) {
                                                    an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i83 == 0) {
                                                    yu8Var2.add("");
                                                } else {
                                                    int i84 = iB3 + i83;
                                                    if (!ew8.b(bArr, iB3, i84)) {
                                                        an4.s("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    yu8Var2.add(new String(bArr, iB3, i83, StandardCharsets.UTF_8));
                                                    iB3 = i84;
                                                }
                                                while (iB3 < i3) {
                                                    int iB11 = u47.B(bArr, iB3, lp2Var);
                                                    if (i32 == lp2Var.a) {
                                                        iB3 = u47.B(bArr, iB11, lp2Var);
                                                        int i85 = lp2Var.a;
                                                        if (i85 < 0) {
                                                            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i85 == 0) {
                                                            yu8Var2.add("");
                                                        } else {
                                                            int i86 = iB3 + i85;
                                                            if (!ew8.b(bArr, iB3, i86)) {
                                                                an4.s("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            yu8Var2.add(new String(bArr, iB3, i85, StandardCharsets.UTF_8));
                                                            iB3 = i86;
                                                        }
                                                    }
                                                }
                                            }
                                            i28 = i32 == true ? 1 : 0;
                                            iY = iB3;
                                            i22 = i31;
                                        } else {
                                            i28 = i32;
                                            i22 = i31;
                                            iY = i22;
                                        }
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 27:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        i30 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            iZ = u47.y(iv8Var.y(iT), i30 == true ? 1 : 0, bArr, i22, i3, yu8Var2, lp2Var);
                                            i30 = i30 == true ? 1 : 0;
                                            i29 = i22;
                                            i28 = i30;
                                            iY = iZ;
                                            i22 = i29;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            i29 = i22;
                                            i28 = i30;
                                            i22 = i29;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        }
                                        break;
                                    case 28:
                                        unsafe6 = unsafe8;
                                        i33 = i22;
                                        objArr = objArr2;
                                        tv8Var3 = tv8Var4;
                                        if (z == 2) {
                                            int iB12 = u47.B(bArr, i33, lp2Var);
                                            int i87 = lp2Var.a;
                                            if (i87 < 0) {
                                                an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i87 > bArr.length - iB12) {
                                                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i87 == 0) {
                                                yu8Var2.add(mu8.n);
                                            } else {
                                                yu8Var2.add(mu8.k(bArr, iB12, i87));
                                                iB12 += i87;
                                            }
                                            while (iB12 < i3) {
                                                int iB13 = u47.B(bArr, iB12, lp2Var);
                                                if (i41 == lp2Var.a) {
                                                    iB12 = u47.B(bArr, iB13, lp2Var);
                                                    int i88 = lp2Var.a;
                                                    if (i88 < 0) {
                                                        an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i88 > bArr.length - iB12) {
                                                        an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i88 == 0) {
                                                        yu8Var2.add(mu8.n);
                                                    } else {
                                                        yu8Var2.add(mu8.k(bArr, iB12, i88));
                                                        iB12 += i88;
                                                    }
                                                } else {
                                                    i28 = i41 == true ? 1 : 0;
                                                    i22 = i33;
                                                    iY = iB12;
                                                }
                                            }
                                            i28 = i41 == true ? 1 : 0;
                                            i22 = i33;
                                            iY = iB12;
                                        } else {
                                            i28 = i41 == true ? 1 : 0;
                                            i22 = i33;
                                            iY = i22;
                                        }
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        Unsafe unsafe10 = unsafe8;
                                        i33 = i22;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            iD = u47.z(bArr, i33, yu8Var2, lp2Var);
                                            i34 = i28 == true ? 1 : 0;
                                            yu8Var = yu8Var2;
                                        } else if (z != 0) {
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            i22 = i33;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            i34 = i28 == true ? 1 : 0;
                                            iD = u47.D(i34 == true ? 1 : 0, bArr, i33, i3, yu8Var2, lp2Var);
                                            yu8Var = yu8Var2;
                                            i33 = i33;
                                        }
                                        du8 du8VarX2 = iv8Var.x(iT);
                                        rk5 rk5Var = rv8.a;
                                        if (du8VarX2 != null) {
                                            int size2 = yu8Var.size();
                                            i35 = iD;
                                            tv8 tv8Var19 = null;
                                            int i89 = 0;
                                            int i90 = 0;
                                            while (i89 < size2) {
                                                Unsafe unsafe11 = unsafe10;
                                                Integer num = (Integer) yu8Var.get(i89);
                                                Object[] objArr3 = objArr2;
                                                int iIntValue = num.intValue();
                                                if (du8VarX2.a(iIntValue)) {
                                                    if (i89 != i90) {
                                                        yu8Var.set(i90, num);
                                                    }
                                                    i90++;
                                                    du8Var = du8VarX2;
                                                    tv8VarB2 = tv8Var19;
                                                } else {
                                                    if (tv8Var19 == null) {
                                                        vu8 vu8Var3 = (vu8) obj2;
                                                        du8Var = du8VarX2;
                                                        tv8VarB2 = vu8Var3.zzc;
                                                        if (tv8VarB2 == tv8Var3) {
                                                            tv8VarB2 = tv8.b();
                                                            vu8Var3.zzc = tv8VarB2;
                                                        }
                                                    } else {
                                                        du8Var = du8VarX2;
                                                        tv8VarB2 = tv8Var19;
                                                    }
                                                    tv8VarB2.c(i44 << 3, Long.valueOf(iIntValue));
                                                }
                                                i89++;
                                                tv8Var19 = tv8VarB2;
                                                du8VarX2 = du8Var;
                                                unsafe10 = unsafe11;
                                                objArr2 = objArr3;
                                            }
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            if (i90 != size2) {
                                                yu8Var.subList(i90, size2).clear();
                                            }
                                        } else {
                                            i35 = iD;
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                        }
                                        i28 = i34;
                                        i22 = i33;
                                        iY = i35;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe7 = unsafe8;
                                        i36 = i22;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            if (z == 0) {
                                                wu8 wu8Var3 = (wu8) yu8Var2;
                                                iY = u47.B(bArr, i36, lp2Var);
                                                wu8Var3.d(f57.t(lp2Var.a));
                                                while (iY < i3) {
                                                    int iB14 = u47.B(bArr, iY, lp2Var);
                                                    if (i28 == lp2Var.a) {
                                                        iY = u47.B(bArr, iB14, lp2Var);
                                                        wu8Var3.d(f57.t(lp2Var.a));
                                                    }
                                                }
                                            }
                                            i22 = i36;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            wu8 wu8Var4 = (wu8) yu8Var2;
                                            iY = u47.B(bArr, i36, lp2Var);
                                            int i91 = lp2Var.a;
                                            if (i91 < 0) {
                                                an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i91 > bArr.length - iY) {
                                                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i92 = i91 + iY;
                                            while (iY < i92) {
                                                iY = u47.B(bArr, iY, lp2Var);
                                                wu8Var4.d(f57.t(lp2Var.a));
                                            }
                                            if (iY != i92) {
                                                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i22 = i36;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        unsafe7 = unsafe8;
                                        i36 = i22;
                                        tv8Var3 = tv8Var4;
                                        i28 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            io.sentry.h2.f();
                                            return 0;
                                        }
                                        i22 = i36;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        iY = i22;
                                        if (iY != i22) {
                                            bArr6 = bArr;
                                            i3 = i3;
                                            lp2Var = lp2Var;
                                            obj5 = obj2;
                                            i41 = i28;
                                            iT = iT;
                                            i40 = i7;
                                            i39 = i5;
                                            i38 = i44;
                                        } else {
                                            i6 = iY;
                                            i9 = i28;
                                            iT = iT;
                                            tv8Var4 = tv8Var3;
                                            unsafe = unsafe6;
                                            i8 = i44;
                                        }
                                        break;
                                        break;
                                    default:
                                        if (z == 3) {
                                            int i93 = ((i41 == true ? 1 : 0) & (-8)) | 4;
                                            qv8 qv8VarY = iv8Var.y(iT);
                                            int i94 = i22;
                                            vu8 vu8VarG = qv8VarY.g();
                                            unsafe7 = unsafe8;
                                            tv8Var3 = tv8Var4;
                                            i28 = i41 == true ? 1 : 0;
                                            int iF2 = u47.F(vu8VarG, qv8VarY, bArr, i94, i3, i93, lp2Var);
                                            lp2 lp2Var5 = lp2Var;
                                            qv8VarY.a(vu8VarG);
                                            lp2Var5.d = vu8VarG;
                                            yu8Var2.add(vu8VarG);
                                            while (true) {
                                                if (iF2 < i3) {
                                                    int i95 = i94;
                                                    int iB15 = u47.B(bArr, iF2, lp2Var5);
                                                    if (i28 == lp2Var5.a) {
                                                        i37 = i93;
                                                        int i96 = i37;
                                                        vu8 vu8VarG2 = qv8VarY.g();
                                                        iF2 = u47.F(vu8VarG2, qv8VarY, bArr, iB15, i3, i96, lp2Var);
                                                        i37 = i96;
                                                        lp2Var5 = lp2Var;
                                                        qv8VarY.a(vu8VarG2);
                                                        lp2Var5.d = vu8VarG2;
                                                        yu8Var2.add(vu8VarG2);
                                                        i94 = i95;
                                                    } else {
                                                        i37 = i93;
                                                        i94 = i95;
                                                    }
                                                } else {
                                                    i37 = i93;
                                                }
                                            }
                                            i22 = i94;
                                            iY = iF2;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        } else {
                                            tv8Var3 = tv8Var4;
                                            i22 = i22;
                                            unsafe6 = unsafe8;
                                            objArr = objArr2;
                                            i28 = i41 == true ? 1 : 0;
                                            iY = i22;
                                            if (iY != i22) {
                                                bArr6 = bArr;
                                                i3 = i3;
                                                lp2Var = lp2Var;
                                                obj5 = obj2;
                                                i41 = i28;
                                                iT = iT;
                                                i40 = i7;
                                                i39 = i5;
                                                i38 = i44;
                                            } else {
                                                i6 = iY;
                                                i9 = i28;
                                                iT = iT;
                                                tv8Var4 = tv8Var3;
                                                unsafe = unsafe6;
                                                i8 = i44;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i21 = i44;
                                objArr = objArr2;
                                tv8Var = tv8Var4;
                                i23 = i41 == true ? 1 : 0;
                                unsafe = unsafe8;
                                if (iU != 50) {
                                    int i97 = iT + 2;
                                    long j5 = iArr[i97] & 1048575;
                                    switch (iU) {
                                        case 51:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 1) {
                                                iA = i24 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(u47.H(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var110 = tv8VarB;
                                                byte[] bArr111 = bArr2;
                                                int i518 = i9;
                                                iA = u47.A(i518 == true ? 1 : 0, bArr111, i6, i3, tv8Var110, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i518 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 52:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 5) {
                                                iA = i24 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(u47.x(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var111 = tv8VarB;
                                                byte[] bArr112 = bArr2;
                                                int i519 = i9;
                                                iA = u47.A(i519 == true ? 1 : 0, bArr112, i6, i3, tv8Var111, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i519 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iA = u47.E(bArr2, i24, lp2Var);
                                                unsafe.putObject(obj2, j2, Long.valueOf(lp2Var.b));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var112 = tv8VarB;
                                                byte[] bArr113 = bArr2;
                                                int i5110 = i9;
                                                iA = u47.A(i5110 == true ? 1 : 0, bArr113, i6, i3, tv8Var112, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5110 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iA = u47.B(bArr2, i24, lp2Var);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(lp2Var.a));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var113 = tv8VarB;
                                                byte[] bArr114 = bArr2;
                                                int i5111 = i9;
                                                iA = u47.A(i5111 == true ? 1 : 0, bArr114, i6, i3, tv8Var113, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5111 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 1) {
                                                iA = i24 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(u47.H(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var114 = tv8VarB;
                                                byte[] bArr115 = bArr2;
                                                int i5112 = i9;
                                                iA = u47.A(i5112 == true ? 1 : 0, bArr115, i6, i3, tv8Var114, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5112 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 5) {
                                                iA = i24 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(u47.x(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var115 = tv8VarB;
                                                byte[] bArr116 = bArr2;
                                                int i5113 = i9;
                                                iA = u47.A(i5113 == true ? 1 : 0, bArr116, i6, i3, tv8Var115, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5113 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 58:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iA = u47.E(bArr2, i24, lp2Var);
                                                tv8Var4 = tv8Var;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(lp2Var.b != 0));
                                                unsafe.putInt(obj2, j5, i8);
                                            } else {
                                                tv8Var4 = tv8Var;
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var116 = tv8VarB;
                                                byte[] bArr117 = bArr2;
                                                int i5114 = i9;
                                                iA = u47.A(i5114 == true ? 1 : 0, bArr117, i6, i3, tv8Var116, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5114 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 59:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 2) {
                                                int iB16 = u47.B(bArr2, i24, lp2Var);
                                                int i98 = lp2Var.a;
                                                if (i98 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i99 = iB16 + i98;
                                                    if ((i47 & 536870912) != 0 && !ew8.b(bArr2, iB16, i99)) {
                                                        an4.s("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, iB16, i98, StandardCharsets.UTF_8));
                                                    iB16 = i99;
                                                }
                                                unsafe.putInt(obj2, j5, i8);
                                                iA = iB16;
                                                tv8Var4 = tv8Var;
                                            } else {
                                                tv8Var4 = tv8Var;
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var117 = tv8VarB;
                                                byte[] bArr118 = bArr2;
                                                int i5115 = i9;
                                                iA = u47.A(i5115 == true ? 1 : 0, bArr118, i6, i3, tv8Var117, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5115 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 60:
                                            i24 = i22;
                                            lp2Var = lp2Var;
                                            if (z == 2) {
                                                i8 = i21;
                                                Object objA = iv8Var.A(i8, iT, obj2);
                                                int iG2 = u47.G(objA, iv8Var.y(iT), bArr, i24, i3, lp2Var);
                                                bArr2 = bArr;
                                                unsafe9.putObject(obj2, iv8Var.v(iT) & 1048575, objA);
                                                vv8.g(i8, iArr[i97] & 1048575, obj2);
                                                iA = iG2;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                i9 = i23 == true ? 1 : 0;
                                            } else {
                                                i8 = i21;
                                                bArr2 = bArr;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                i9 = i23 == true ? 1 : 0;
                                                iA = i24;
                                            }
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var118 = tv8VarB;
                                                byte[] bArr119 = bArr2;
                                                int i5116 = i9;
                                                iA = u47.A(i5116 == true ? 1 : 0, bArr119, i6, i3, tv8Var118, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i5116 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 61:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            i26 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 2) {
                                                iW = u47.w(bArr5, i24, lp2Var);
                                                unsafe.putObject(obj2, j2, lp2Var.d);
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iA = iW;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var119 = tv8VarB;
                                                    byte[] bArr1110 = bArr2;
                                                    int i5117 = i9;
                                                    iA = u47.A(i5117 == true ? 1 : 0, bArr1110, i6, i3, tv8Var119, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i5117 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            } else {
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                iA = i24;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var1110 = tv8VarB;
                                                    byte[] bArr1111 = bArr2;
                                                    int i5118 = i9;
                                                    iA = u47.A(i5118 == true ? 1 : 0, bArr1111, i6, i3, tv8Var1110, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i5118 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i27 = i23 == true ? 1 : 0;
                                            tv8Var2 = tv8Var;
                                            i26 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iW = u47.B(bArr5, i24, lp2Var);
                                                int i100 = lp2Var.a;
                                                du8 du8VarX3 = iv8Var.x(iT);
                                                if (du8VarX3 == null || du8VarX3.a(i100)) {
                                                    tv8Var = tv8Var2;
                                                    i9 = i27 == true ? 1 : 0;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i100));
                                                    unsafe.putInt(obj2, j5, i26);
                                                } else {
                                                    vu8 vu8Var4 = (vu8) obj2;
                                                    tv8 tv8VarB4 = vu8Var4.zzc;
                                                    tv8Var = tv8Var2;
                                                    if (tv8VarB4 == tv8Var) {
                                                        tv8VarB4 = tv8.b();
                                                        vu8Var4.zzc = tv8VarB4;
                                                    }
                                                    Long lValueOf = Long.valueOf(i100);
                                                    i9 = i27 == true ? 1 : 0;
                                                    tv8VarB4.c(i9 == true ? 1 : 0, lValueOf);
                                                }
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iA = iW;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var1111 = tv8VarB;
                                                    byte[] bArr1112 = bArr2;
                                                    int i5119 = i9;
                                                    iA = u47.A(i5119 == true ? 1 : 0, bArr1112, i6, i3, tv8Var1111, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i5119 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            }
                                            i8 = i26;
                                            bArr2 = bArr5;
                                            tv8Var4 = tv8Var2;
                                            i9 = i27;
                                            i25 = iT;
                                            iA = i24;
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var1112 = tv8VarB;
                                                byte[] bArr1113 = bArr2;
                                                int i51110 = i9;
                                                iA = u47.A(i51110 == true ? 1 : 0, bArr1113, i6, i3, tv8Var1112, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i51110 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i27 = i23 == true ? 1 : 0;
                                            tv8Var2 = tv8Var;
                                            i26 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iB2 = u47.B(bArr5, i24, lp2Var);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(f57.t(lp2Var.a)));
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iA = iB2;
                                                tv8Var4 = tv8Var2;
                                                i9 = i27;
                                                i25 = iT;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var1113 = tv8VarB;
                                                    byte[] bArr1114 = bArr2;
                                                    int i51111 = i9;
                                                    iA = u47.A(i51111 == true ? 1 : 0, bArr1114, i6, i3, tv8Var1113, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i51111 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            }
                                            i8 = i26;
                                            bArr2 = bArr5;
                                            tv8Var4 = tv8Var2;
                                            i9 = i27;
                                            i25 = iT;
                                            iA = i24;
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var1114 = tv8VarB;
                                                byte[] bArr1115 = bArr2;
                                                int i51112 = i9;
                                                iA = u47.A(i51112 == true ? 1 : 0, bArr1115, i6, i3, tv8Var1114, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i51112 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            i24 = i22;
                                            i26 = i21;
                                            lp2Var = lp2Var;
                                            if (z == 0) {
                                                iB2 = u47.E(bArr5, i24, lp2Var);
                                                i27 = i23 == true ? 1 : 0;
                                                tv8Var2 = tv8Var;
                                                long j6 = lp2Var.b;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i26);
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iA = iB2;
                                                tv8Var4 = tv8Var2;
                                                i9 = i27;
                                                i25 = iT;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var1115 = tv8VarB;
                                                    byte[] bArr1116 = bArr2;
                                                    int i51113 = i9;
                                                    iA = u47.A(i51113 == true ? 1 : 0, bArr1116, i6, i3, tv8Var1115, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i51113 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            } else {
                                                i9 = i23 == true ? 1 : 0;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                i8 = i26;
                                                bArr2 = bArr5;
                                                iA = i24;
                                                if (iA == i24) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i41 = i9 == true ? 1 : 0;
                                                    i40 = i7;
                                                    iT = i25;
                                                } else {
                                                    i4 = i4;
                                                    i6 = iA;
                                                    iT = i25;
                                                    if (i9 == i4) {
                                                    }
                                                    vu8Var = (vu8) obj2;
                                                    tv8VarB = vu8Var.zzc;
                                                    if (tv8VarB == tv8Var4) {
                                                        tv8VarB = tv8.b();
                                                        vu8Var.zzc = tv8VarB;
                                                    }
                                                    tv8 tv8Var1116 = tv8VarB;
                                                    byte[] bArr1117 = bArr2;
                                                    int i51114 = i9;
                                                    iA = u47.A(i51114 == true ? 1 : 0, bArr1117, i6, i3, tv8Var1116, lp2Var);
                                                    bArr6 = bArr;
                                                    lp2Var = lp2Var;
                                                    i41 = i51114 == true ? 1 : 0;
                                                    i3 = i3;
                                                    obj5 = obj2;
                                                    i38 = i8;
                                                    i40 = i7;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (z == 3) {
                                                int i101 = ((i23 == true ? 1 : 0) & (-8)) | 4;
                                                i24 = i22;
                                                Object objA2 = iv8Var.A(i21, iT, obj2);
                                                int iF3 = u47.F(objA2, iv8Var.y(iT), bArr, i24, i3, i101, lp2Var);
                                                lp2Var = lp2Var;
                                                unsafe9.putObject(obj2, iv8Var.v(iT) & 1048575, objA2);
                                                vv8.g(i21, iArr[i97] & 1048575, obj2);
                                                bArr2 = bArr;
                                                iA = iF3;
                                                i9 = i23 == true ? 1 : 0;
                                                tv8Var4 = tv8Var;
                                                i25 = iT;
                                                i8 = i21;
                                            }
                                            if (iA == i24) {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var1117 = tv8VarB;
                                                byte[] bArr1118 = bArr2;
                                                int i51115 = i9;
                                                iA = u47.A(i51115 == true ? 1 : 0, bArr1118, i6, i3, tv8Var1117, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i51115 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                                break;
                                            } else {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                                break;
                                            }
                                        default:
                                            bArr2 = bArr;
                                            i24 = i22;
                                            i9 = i23 == true ? 1 : 0;
                                            tv8Var4 = tv8Var;
                                            i25 = iT;
                                            i8 = i21;
                                            lp2Var = lp2Var;
                                            iA = i24;
                                            if (iA == i24) {
                                                i3 = i3;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i41 = i9 == true ? 1 : 0;
                                                i40 = i7;
                                                iT = i25;
                                            } else {
                                                i4 = i4;
                                                i6 = iA;
                                                iT = i25;
                                                if (i9 == i4) {
                                                }
                                                vu8Var = (vu8) obj2;
                                                tv8VarB = vu8Var.zzc;
                                                if (tv8VarB == tv8Var4) {
                                                    tv8VarB = tv8.b();
                                                    vu8Var.zzc = tv8VarB;
                                                }
                                                tv8 tv8Var1118 = tv8VarB;
                                                byte[] bArr1119 = bArr2;
                                                int i51116 = i9;
                                                iA = u47.A(i51116 == true ? 1 : 0, bArr1119, i6, i3, tv8Var1118, lp2Var);
                                                bArr6 = bArr;
                                                lp2Var = lp2Var;
                                                i41 = i51116 == true ? 1 : 0;
                                                i3 = i3;
                                                obj5 = obj2;
                                                i38 = i8;
                                                i40 = i7;
                                            }
                                            break;
                                    }
                                } else {
                                    if (z == 2) {
                                        int i102 = iT / 3;
                                        Object obj7 = objArr[i102 + i102];
                                        Object object = unsafe.getObject(obj2, j2);
                                        if (!((gv8) object).m) {
                                            gv8 gv8Var2 = gv8.n;
                                            if (gv8Var2.isEmpty()) {
                                                gv8Var = new gv8();
                                            } else {
                                                gv8 gv8Var3 = new gv8(gv8Var2);
                                                gv8Var3.m = true;
                                                gv8Var = gv8Var3;
                                            }
                                            g57.u(gv8Var, object);
                                            unsafe.putObject(obj2, j2, gv8Var);
                                        }
                                        throw ua5.i(obj7);
                                    }
                                    bArr2 = bArr;
                                    i6 = i22;
                                    i9 = i23;
                                    tv8Var4 = tv8Var;
                                    iT = iT;
                                    i8 = i21;
                                    i4 = i4;
                                    lp2Var = lp2Var;
                                    if (i9 == i4) {
                                    }
                                    vu8Var = (vu8) obj2;
                                    tv8VarB = vu8Var.zzc;
                                    if (tv8VarB == tv8Var4) {
                                        tv8VarB = tv8.b();
                                        vu8Var.zzc = tv8VarB;
                                    }
                                    tv8 tv8Var1119 = tv8VarB;
                                    byte[] bArr11110 = bArr2;
                                    int i51117 = i9;
                                    iA = u47.A(i51117 == true ? 1 : 0, bArr11110, i6, i3, tv8Var1119, lp2Var);
                                    bArr6 = bArr;
                                    lp2Var = lp2Var;
                                    i41 = i51117 == true ? 1 : 0;
                                    i3 = i3;
                                    obj5 = obj2;
                                    i38 = i8;
                                    i40 = i7;
                                }
                                i39 = i5;
                                iY = iA;
                                iv8Var = this;
                            }
                        } else if (z == 2) {
                            yu8 yu8VarQ2 = (yu8) unsafe8.getObject(obj5, j2);
                            if (!((ju8) yu8VarQ2).m) {
                                int size3 = yu8VarQ2.size();
                                yu8VarQ2 = yu8VarQ2.q(size3 == 0 ? 10 : size3 + size3);
                                unsafe8.putObject(obj5, j2, yu8VarQ2);
                            }
                            bArr6 = bArr;
                            i3 = i3;
                            iY = u47.y(iv8Var.y(iT), i41 == true ? 1 : 0, bArr6, i43, i3, yu8VarQ2, lp2Var);
                            lp2Var = lp2Var;
                            i41 = i41 == true ? 1 : 0;
                            i38 = i44;
                            iT = iT;
                            i40 = i7;
                            i39 = i5;
                            obj5 = obj;
                        } else {
                            obj2 = obj;
                            i21 = i44;
                            objArr = objArr2;
                            tv8Var = tv8Var4;
                            i22 = i43;
                            i23 = i41 == true ? 1 : 0;
                            unsafe = unsafe8;
                            bArr2 = bArr;
                            i6 = i22;
                            i9 = i23;
                            tv8Var4 = tv8Var;
                            iT = iT;
                            i8 = i21;
                            i4 = i4;
                            lp2Var = lp2Var;
                            if (i9 == i4) {
                            }
                            vu8Var = (vu8) obj2;
                            tv8VarB = vu8Var.zzc;
                            if (tv8VarB == tv8Var4) {
                                tv8VarB = tv8.b();
                                vu8Var.zzc = tv8VarB;
                            }
                            tv8 tv8Var11110 = tv8VarB;
                            byte[] bArr11111 = bArr2;
                            int i51118 = i9;
                            iA = u47.A(i51118 == true ? 1 : 0, bArr11111, i6, i3, tv8Var11110, lp2Var);
                            bArr6 = bArr;
                            lp2Var = lp2Var;
                            i41 = i51118 == true ? 1 : 0;
                            i3 = i3;
                            obj5 = obj2;
                            i38 = i8;
                            i40 = i7;
                            i39 = i5;
                            iY = iA;
                            iv8Var = this;
                        }
                    }
                }
                bArr2 = bArr;
                if (i9 == i4) {
                }
                vu8Var = (vu8) obj2;
                tv8VarB = vu8Var.zzc;
                if (tv8VarB == tv8Var4) {
                    tv8VarB = tv8.b();
                    vu8Var.zzc = tv8VarB;
                }
                tv8 tv8Var11111 = tv8VarB;
                byte[] bArr11112 = bArr2;
                int i51119 = i9;
                iA = u47.A(i51119 == true ? 1 : 0, bArr11112, i6, i3, tv8Var11111, lp2Var);
                bArr6 = bArr;
                lp2Var = lp2Var;
                i41 = i51119 == true ? 1 : 0;
                i3 = i3;
                obj5 = obj2;
                i38 = i8;
                i40 = i7;
                i39 = i5;
                iY = iA;
                iv8Var = this;
            } else {
                i4 = i4;
                i5 = i39;
                iArr = iArr2;
                objArr = objArr2;
                obj2 = obj5;
                unsafe = unsafe8;
            }
        }
        int i103 = i5;
        if (i103 != 1048575) {
            unsafe.putInt(obj2, i103, i40);
        }
        for (int i104 = this.g; i104 < this.h; i104++) {
            int i105 = this.f[i104];
            int i106 = iArr[i105];
            Object objC = vv8.c(v(i105) & 1048575, obj2);
            if (objC != null && x(i105) != null) {
                int i107 = i105 / 3;
                throw ua5.i(objArr[i107 + i107]);
            }
        }
        if (i4 == 0) {
            if (iY != i3) {
                an4.s("Failed to parse the message.");
                return 0;
            }
        } else if (iY > i3 || i41 != i4) {
            an4.s("Failed to parse the message.");
            return 0;
        }
        return iY;
    }

    public final int t(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int v(int i2) {
        return this.a[i2 + 1];
    }

    public final du8 x(int i2) {
        int i3 = i2 / 3;
        return (du8) this.b[i3 + i3 + 1];
    }

    public final qv8 y(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        qv8 qv8Var = (qv8) objArr[i4];
        if (qv8Var != null) {
            return qv8Var;
        }
        qv8 qv8VarA = kv8.b.a((Class) objArr[i4 + 1]);
        objArr[i4] = qv8VarA;
        return qv8VarA;
    }

    public final Object z(int i2, Object obj) {
        qv8 qv8VarY = y(i2);
        int iV = v(i2) & 1048575;
        if (!n(i2, obj)) {
            return qv8VarY.g();
        }
        Object object = j.getObject(obj, iV);
        if (p(object)) {
            return object;
        }
        vu8 vu8VarG = qv8VarY.g();
        if (object != null) {
            qv8VarY.f(vu8VarG, object);
        }
        return vu8VarG;
    }
}
