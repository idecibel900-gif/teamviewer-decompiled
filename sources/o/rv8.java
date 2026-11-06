package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rv8 {
    public static final rk5 a;

    static {
        int i = ku8.a;
        a = new rk5((byte) 20);
    }

    public static void a(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    cv0Var.S(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iW += cv0.W((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            cv0Var.T(iW);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                cv0Var.T((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                int iB = wu8Var.b(i2);
                cv0Var.S(i, (iB >> 31) ^ (iB + iB));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < wu8Var.f2446o; i4++) {
            int iB2 = wu8Var.b(i4);
            iW2 += cv0.W((iB2 >> 31) ^ (iB2 + iB2));
        }
        cv0Var.T(iW2);
        while (i2 < wu8Var.f2446o) {
            int iB3 = wu8Var.b(i2);
            cv0Var.T((iB3 >> 31) ^ (iB3 + iB3));
            i2++;
        }
    }

    public static void b(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cv0Var.U(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iX += cv0.X((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        cv0Var.T(iX);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            cv0Var.V((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void c(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    cv0Var.S(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += cv0.W(((Integer) list.get(i3)).intValue());
            }
            cv0Var.T(iW);
            while (i2 < list.size()) {
                cv0Var.T(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                cv0Var.S(i, wu8Var.b(i2));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < wu8Var.f2446o; i4++) {
            iW2 += cv0.W(wu8Var.b(i4));
        }
        cv0Var.T(iW2);
        while (i2 < wu8Var.f2446o) {
            cv0Var.T(wu8Var.b(i2));
            i2++;
        }
    }

    public static void d(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.U(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += cv0.X(((Long) list.get(i3)).longValue());
        }
        cv0Var.T(iX);
        while (i2 < list.size()) {
            cv0Var.V(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wu8)) {
            int iX = 0;
            while (i < size) {
                iX += cv0.X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        wu8 wu8Var = (wu8) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += cv0.X(wu8Var.b(i));
            i++;
        }
        return iX2;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (cv0.W(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (cv0.W(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wu8)) {
            int iX = 0;
            while (i < size) {
                iX += cv0.X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        wu8 wu8Var = (wu8) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += cv0.X(wu8Var.b(i));
            i++;
        }
        return iX2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += cv0.X(((Long) list.get(i)).longValue());
        }
        return iX;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wu8)) {
            int iW = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iW += cv0.W((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iW;
        }
        wu8 wu8Var = (wu8) list;
        int iW2 = 0;
        while (i < size) {
            int iB = wu8Var.b(i);
            iW2 += cv0.W((iB >> 31) ^ (iB + iB));
            i++;
        }
        return iW2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iX += cv0.X((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wu8)) {
            int iW = 0;
            while (i < size) {
                iW += cv0.W(((Integer) list.get(i)).intValue());
                i++;
            }
            return iW;
        }
        wu8 wu8Var = (wu8) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += cv0.W(wu8Var.b(i));
            i++;
        }
        return iW2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += cv0.X(((Long) list.get(i)).longValue());
        }
        return iX;
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
    public static void o(Object obj, Object obj2) {
        vu8 vu8Var = (vu8) obj;
        tv8 tv8Var = vu8Var.zzc;
        tv8 tv8Var2 = ((vu8) obj2).zzc;
        tv8 tv8Var3 = tv8.f;
        if (!tv8Var3.equals(tv8Var2)) {
            if (tv8Var3.equals(tv8Var)) {
                int i = tv8Var.a + tv8Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(tv8Var.b, i);
                System.arraycopy(tv8Var2.b, 0, iArrCopyOf, tv8Var.a, tv8Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(tv8Var.c, i);
                System.arraycopy(tv8Var2.c, 0, objArrCopyOf, tv8Var.a, tv8Var2.a);
                tv8Var = new tv8(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                tv8Var.getClass();
                if (!tv8Var2.equals(tv8Var3)) {
                    if (!tv8Var.e) {
                        gk0.u();
                        return;
                    }
                    int i2 = tv8Var.a + tv8Var2.a;
                    tv8Var.e(i2);
                    System.arraycopy(tv8Var2.b, 0, tv8Var.b, tv8Var.a, tv8Var2.a);
                    System.arraycopy(tv8Var2.c, 0, tv8Var.c, tv8Var.a, tv8Var2.a);
                    tv8Var.a = i2;
                }
            }
        }
        vu8Var.zzc = tv8Var;
    }

    public static void p(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                cv0Var.T(i << 3);
                cv0Var.J(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        cv0Var.T(i3);
        while (i2 < list.size()) {
            cv0Var.J(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.N(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        cv0Var.T(i3);
        while (i2 < list.size()) {
            cv0Var.O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    cv0Var.P(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += cv0.X(((Integer) list.get(i3)).intValue());
            }
            cv0Var.T(iX);
            while (i2 < list.size()) {
                cv0Var.Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                cv0Var.P(i, wu8Var.b(i2));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < wu8Var.f2446o; i4++) {
            iX2 += cv0.X(wu8Var.b(i4));
        }
        cv0Var.T(iX2);
        while (i2 < wu8Var.f2446o) {
            cv0Var.Q(wu8Var.b(i2));
            i2++;
        }
    }

    public static void s(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    cv0Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            cv0Var.T(i3);
            while (i2 < list.size()) {
                cv0Var.M(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                cv0Var.L(i, wu8Var.b(i2));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wu8Var.f2446o; i6++) {
            wu8Var.b(i6);
            i5 += 4;
        }
        cv0Var.T(i5);
        while (i2 < wu8Var.f2446o) {
            cv0Var.M(wu8Var.b(i2));
            i2++;
        }
    }

    public static void t(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cv0Var.T(i3);
        while (i2 < list.size()) {
            cv0Var.O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.L(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        cv0Var.T(i3);
        while (i2 < list.size()) {
            cv0Var.M(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    cv0Var.P(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += cv0.X(((Integer) list.get(i3)).intValue());
            }
            cv0Var.T(iX);
            while (i2 < list.size()) {
                cv0Var.Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                cv0Var.P(i, wu8Var.b(i2));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < wu8Var.f2446o; i4++) {
            iX2 += cv0.X(wu8Var.b(i4));
        }
        cv0Var.T(iX2);
        while (i2 < wu8Var.f2446o) {
            cv0Var.Q(wu8Var.b(i2));
            i2++;
        }
    }

    public static void w(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.U(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += cv0.X(((Long) list.get(i3)).longValue());
        }
        cv0Var.T(iX);
        while (i2 < list.size()) {
            cv0Var.V(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!(list instanceof wu8)) {
            if (!z) {
                while (i2 < list.size()) {
                    cv0Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cv0Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            cv0Var.T(i3);
            while (i2 < list.size()) {
                cv0Var.M(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wu8 wu8Var = (wu8) list;
        if (!z) {
            while (i2 < wu8Var.f2446o) {
                cv0Var.L(i, wu8Var.b(i2));
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wu8Var.f2446o; i6++) {
            wu8Var.b(i6);
            i5 += 4;
        }
        cv0Var.T(i5);
        while (i2 < wu8Var.f2446o) {
            cv0Var.M(wu8Var.b(i2));
            i2++;
        }
    }

    public static void y(int i, List list, hj8 hj8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cv0 cv0Var = (cv0) hj8Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cv0Var.N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cv0Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cv0Var.T(i3);
        while (i2 < list.size()) {
            cv0Var.O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
