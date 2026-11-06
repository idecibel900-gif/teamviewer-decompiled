package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xn4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2537o;

    public /* synthetic */ xn4(Function0 function0, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f2537o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        Function0 function0 = this.n;
        f88 f88Var = f88.a;
        int i = this.f2537o;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                et1.h(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            case 1:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    v67.d(this.n, null, null, false, "accept_permission", au8.O(1219777604, new oa(i, (byte) 3), ux2Var), ux2Var, 221184, 14);
                }
                break;
            case 2:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    v67.d(this.n, null, null, false, "decline_permission", au8.O(-975451262, new oa(i, (byte) 4), ux2Var2), ux2Var2, 221184, 14);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                xo1.y(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                xo1.c(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                xo1.u(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                xo1.x(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                xo1.B(function0, (ux2) obj, yo1.Y(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                xo1.e(function0, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
