package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ll8 {
    public static final List c;
    public static final List d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        List listL = qf0.L(0, 600, 840);
        c = listL;
        ArrayList arrayListA0 = lv0.A0(listL, qf0.L(1200, 1600));
        List listL2 = qf0.L(0, 480, 900);
        d = listL2;
        e = listL2;
        rk5.g(listL, listL2);
        rk5.g(arrayListA0, listL2);
    }

    public ll8(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            gk0.g(i, "Expected minWidthDp to be at least 0, minWidthDp: ");
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        gk0.g(i2, "Expected minHeightDp to be at least 0, minHeightDp: ");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ll8.class != obj.getClass()) {
            return false;
        }
        ll8 ll8Var = (ll8) obj;
        return this.a == ll8Var.a && this.b == ll8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return e41.j(sb, this.b, ')');
    }
}
