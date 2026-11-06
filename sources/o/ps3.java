package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ps3 extends h60 {
    public static final ps3 g;
    public static final ps3 h;
    public final boolean f;

    static {
        ps3 ps3Var = new ps3(new int[]{2, 0, 0}, false);
        g = ps3Var;
        int i = ps3Var.c;
        int i2 = ps3Var.b;
        h = (i2 == 1 && i == 9) ? new ps3(new int[]{2, 0, 0}, false) : new ps3(new int[]{i2, i + 1, 0}, false);
        new ps3(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps3(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }

    public final boolean b(ps3 ps3Var) {
        ps3Var.getClass();
        ps3 ps3Var2 = g;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 2 && i == 0 && ps3Var2.b == 1 && ps3Var2.c == 8) {
            return true;
        }
        if (!this.f) {
            ps3Var2 = h;
        }
        int i3 = ps3Var2.b;
        int i4 = ps3Var.b;
        if (i3 > i4 || (i3 >= i4 && ps3Var2.c > ps3Var.c)) {
            ps3Var = ps3Var2;
        }
        boolean z = false;
        if ((i2 == 1 && i == 0) || i2 == 0) {
            return false;
        }
        int i5 = ps3Var.b;
        if (i2 > i5 || (i2 >= i5 && i > ps3Var.c)) {
            z = true;
        }
        return !z;
    }
}
