package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ml8 {
    public final int a;
    public final int b;

    public ml8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ml8.class == obj.getClass()) {
            ml8 ml8Var = (ml8) obj;
            int i = ml8Var.a;
            Set set = ol8.n;
            if (this.a == i) {
                int i2 = ml8Var.b;
                Set set2 = kj8.n;
                if (this.b == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = ol8.n;
        int iHashCode = Integer.hashCode(this.a) * 31;
        Set set2 = kj8.n;
        return Integer.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        String str;
        Set set = ol8.n;
        String str2 = "";
        int i = this.a;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else {
            str = i == 2 ? "Expanded" : "";
        }
        String strConcat = "WindowWidthSizeClass.".concat(str);
        Set set2 = kj8.n;
        int i2 = this.b;
        if (i2 == 0) {
            str2 = "Compact";
        } else if (i2 == 1) {
            str2 = "Medium";
        } else if (i2 == 2) {
            str2 = "Expanded";
        }
        return fx3.h("WindowSizeClass(", strConcat, ", ", "WindowHeightSizeClass.".concat(str2), ")");
    }
}
