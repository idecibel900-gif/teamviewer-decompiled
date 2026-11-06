package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cx extends vn4 {
    public static zp6 A0(Object[] objArr) {
        return objArr.length == 0 ? ka2.a : new fx(objArr, (byte) 0);
    }

    public static boolean B0(Object obj, Object[] objArr) {
        objArr.getClass();
        return W0(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean C0(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean D0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!D0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof n68) && (obj2 instanceof n68)) {
                            if (!Arrays.equals(((n68) obj).m, ((n68) obj2).m)) {
                            }
                        } else if ((obj instanceof h78) && (obj2 instanceof h78)) {
                            if (!Arrays.equals(((h78) obj).m, ((h78) obj2).m)) {
                            }
                        } else if ((obj instanceof v68) && (obj2 instanceof v68)) {
                            if (!Arrays.equals(((v68) obj).m, ((v68) obj2).m)) {
                            }
                        } else if ((obj instanceof a78) && (obj2 instanceof a78)) {
                            if (!Arrays.equals(((a78) obj).m, ((a78) obj2).m)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void E0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void F0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void G0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void H0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void I0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        F0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void J0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        G0(0, i, i2, objArr, objArr2);
    }

    public static byte[] K0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        vn4.a0(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] L0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        vn4.a0(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static List M0(int i, Object[] objArr) {
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            gk0.h(fx3.f(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return ea2.m;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return g1(objArr);
        }
        if (length == 1) {
            return qf0.K(objArr[length2 - 1]);
        }
        List listAsList = Arrays.asList(L0(objArr, length2 - length, length2));
        listAsList.getClass();
        return listAsList;
    }

    public static void N0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void P0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList Q0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object R0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        an4.j("Array is empty.");
        return null;
    }

    public static Object S0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int T0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer U0(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object V0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int W0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void X0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            o77.e(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String Y0(byte[] bArr, String str, t2 t2Var, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            t2Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (t2Var != null) {
                sb.append((CharSequence) t2Var.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String Z0(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        X0(objArr, sb, str4, str2, str3, "...", function1);
        return sb.toString();
    }

    public static Object a1(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        an4.j("Array is empty.");
        return null;
    }

    public static char b1(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            an4.j("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        hk0.g("Array has more than one element.");
        return (char) 0;
    }

    public static Object c1(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            an4.j("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        hk0.g("Array has more than one element.");
        return null;
    }

    public static final void d1(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List e1(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return qf0.K(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List f1(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return qf0.K(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List g1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return qf0.K(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static Set h1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return la2.m;
        }
        if (length == 1) {
            return lv1.V(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(xm4.Q(objArr.length));
        d1(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
