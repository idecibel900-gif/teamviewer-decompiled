package o;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class b84 {
    public static final a84 Companion = new a84();
    public static final u14[] c;
    public final List a;
    public final Set b;

    static {
        tg3 tg3Var = new tg3((byte) 18);
        l54 l54Var = l54.m;
        c = new u14[]{ds1.X(l54Var, tg3Var), ds1.X(l54Var, new tg3((byte) 19))};
    }

    public /* synthetic */ b84(int i, List list, Set set) {
        if (3 != (i & 3)) {
            lq1.H(i, 3, z74.a.d());
            throw null;
        }
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b84)) {
            return false;
        }
        b84 b84Var = (b84) obj;
        return im3.n(this.a, b84Var.a) && im3.n(this.b, b84Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Libs(libraries=" + this.a + ", licenses=" + this.b + ")";
    }

    public b84(List list, Set set) {
        this.a = list;
        this.b = set;
    }
}
