package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z44 {
    public static final o44 a = new o44(null, 0, false, 0.0f, new y44(), 0.0f, false, hm3.c(ba2.m), mo8.b(), t61.b(0, 0, 0, 0, 15), 0, ea2.m, 0, 0, 0, gb5.m, 0, 0);

    public static final w44 a(final int i, final int i2, ux2 ux2Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        a65 a65Var = w44.y;
        boolean zD = ux2Var.d(i) | ux2Var.d(i2);
        Object objK = ux2Var.K();
        if (zD || objK == e01.a) {
            objK = new Function0() { // from class: o.x44
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    return new w44(i, i2);
                }
            };
            ux2Var.g0(objK);
        }
        return (w44) zu1.O(objArr, a65Var, (Function0) objK, ux2Var, 0);
    }
}
