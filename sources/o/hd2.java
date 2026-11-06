package o;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hd2 {
    public static final hd2 a = new hd2();
    public static final yc2 b = yc2.m;
    public static final sc2 c = new sc2(sy4.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final ed2 d = c(gd2.t, new String[0]);
    public static final ed2 e = c(gd2.G, new String[0]);
    public static final Set f = lv1.V(new zc2());

    public static final cd2 a(dd2 dd2Var, boolean z, String... strArr) {
        if (!z) {
            return new cd2(dd2Var, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new hv7(dd2Var, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final cd2 b(dd2 dd2Var, String... strArr) {
        return a(dd2Var, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ed2 c(gd2 gd2Var, String... strArr) {
        gd2Var.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(gd2Var, ea2.m, d(gd2Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static fd2 d(gd2 gd2Var, String... strArr) {
        gd2Var.getClass();
        return new fd2(gd2Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static ed2 e(gd2 gd2Var, List list, k48 k48Var, String... strArr) {
        gd2Var.getClass();
        return new ed2(k48Var, b(dd2.ERROR_TYPE_SCOPE, k48Var.toString()), gd2Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(fi1 fi1Var) {
        if (fi1Var != null) {
            return (fi1Var instanceof sc2) || (fi1Var.i() instanceof sc2) || fi1Var == b;
        }
        return false;
    }
}
