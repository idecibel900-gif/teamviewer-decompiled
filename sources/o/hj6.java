package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj6 {
    public static final Class a;
    public static final j88 b;
    public static final n88 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        vw5 vw5Var = vw5.c;
        j88 j88Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            vw5 vw5Var2 = vw5.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                j88Var = (j88) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = j88Var;
        c = new n88();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += bv0.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bv0.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bv0.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += bv0.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += bv0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += bv0.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += bv0.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += bv0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += bv0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static Object j(Object obj, int i, rl3 rl3Var, Object obj2, j88 j88Var) {
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(j88 j88Var, Object obj, Object obj2) {
        ((n88) j88Var).getClass();
        py2 py2Var = (py2) obj;
        l88 l88Var = py2Var.unknownFields;
        l88 l88Var2 = ((py2) obj2).unknownFields;
        l88 l88Var3 = l88.f;
        if (!l88Var3.equals(l88Var2)) {
            if (l88Var3.equals(l88Var)) {
                int i = l88Var.a + l88Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(l88Var.b, i);
                System.arraycopy(l88Var2.b, 0, iArrCopyOf, l88Var.a, l88Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(l88Var.c, i);
                System.arraycopy(l88Var2.c, 0, objArrCopyOf, l88Var.a, l88Var2.a);
                l88Var = new l88(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                l88Var.getClass();
                if (!l88Var2.equals(l88Var3)) {
                    if (!l88Var.e) {
                        gk0.u();
                        return;
                    }
                    int i2 = l88Var.a + l88Var2.a;
                    l88Var.a(i2);
                    System.arraycopy(l88Var2.b, 0, l88Var.b, l88Var.a, l88Var2.a);
                    System.arraycopy(l88Var2.c, 0, l88Var.c, l88Var.a, l88Var2.a);
                    l88Var.a = i2;
                }
            }
        }
        py2Var.unknownFields = l88Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += bv0.j(((Integer) list.get(i3)).intValue());
        }
        bv0Var.D(iJ);
        while (i2 < list.size()) {
            bv0Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += bv0.j(((Integer) list.get(i3)).intValue());
        }
        bv0Var.D(iJ);
        while (i2 < list.size()) {
            bv0Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += bv0.j(((Long) list.get(i3)).longValue());
        }
        bv0Var.D(iJ);
        while (i2 < list.size()) {
            bv0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                bv0Var.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += bv0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            bv0Var.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                bv0Var.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += bv0.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        bv0Var.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            bv0Var.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += bv0.i(((Integer) list.get(i4)).intValue());
        }
        bv0Var.D(i3);
        while (i2 < list.size()) {
            bv0Var.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, xc0 xc0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bv0 bv0Var = (bv0) xc0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bv0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += bv0.j(((Long) list.get(i3)).longValue());
        }
        bv0Var.D(iJ);
        while (i2 < list.size()) {
            bv0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
