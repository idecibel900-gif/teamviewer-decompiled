package o;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kj8 implements Comparable {
    public static final Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List f1272o;
    public final byte m;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        n = cx.h1(new kj8[]{new kj8(i), new kj8(i2), new kj8(i3)});
        List listL = qf0.L(new kj8(i3), new kj8(i2), new kj8(i));
        f1272o = listL;
        lv0.T0(listL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kj8(int i) {
        this.m = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return w32.a(o67.d(this.m), o67.d(((kj8) obj).m));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kj8) {
            return this.m == ((kj8) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        String str;
        byte b = this.m;
        if (b == 0) {
            str = "Compact";
        } else if (b == 1) {
            str = "Medium";
        } else {
            str = b == 2 ? "Expanded" : "";
        }
        return "WindowHeightSizeClass.".concat(str);
    }
}
