package o;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class nm6 {
    public static final Set a = cx.h1(new b41[]{b41.n, b41.f389o});
    public static final Set b = cx.h1(new b41[]{b41.r, b41.q});
    public static final List c = qf0.L(zl6.Devices, zl6.Contacts, zl6.Groups);

    public static final List a(zl6 zl6Var, yl6 yl6Var) {
        int iOrdinal = zl6Var.ordinal();
        if (iOrdinal == 0) {
            return lv0.A0(lv0.A0(lv0.A0(yl6Var.g, yl6Var.i), yl6Var.h), yl6Var.j);
        }
        if (iOrdinal == 1) {
            return yl6Var.i;
        }
        if (iOrdinal == 2) {
            return yl6Var.h;
        }
        if (iOrdinal == 3) {
            return yl6Var.j;
        }
        gk0.s();
        return null;
    }
}
