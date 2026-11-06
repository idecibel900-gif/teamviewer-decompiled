package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class lp7 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ lp7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                long j = ((rv0) obj).a;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    z06.J.l((Drawable) obj4, ux2Var, 48);
                }
                break;
            case 1:
                long j2 = ((rv0) obj).a;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    z06.J.l((Drawable) obj4, ux2Var2, 48);
                }
                break;
            default:
                long j3 = ((rv0) obj).a;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ux2Var3.e(j3) ? 4 : 2;
                }
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ux2Var3.Q();
                } else {
                    rl1.b(((mp7) obj4).c, j3, ux2Var3, (iIntValue3 << 3) & 112);
                }
                break;
        }
        return f88Var;
    }
}
