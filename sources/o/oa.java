package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    public /* synthetic */ oa(int i, byte b) {
        this.m = b;
        this.n = i;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.n;
        switch (b) {
            case 0:
                bn7 bn7Var = (bn7) obj;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                bn7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ux2Var.f(bn7Var) : ux2Var.h(bn7Var) ? 4 : 2;
                }
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ux2Var.Q();
                } else {
                    xz2.X.x0(new gm7(bn7Var.a, i, false, bn7Var.b), Float.NaN, 2.0f, 0L, null, ux2Var, 197040, 24);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(m77.z(i, ux2Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.m, ux2Var2, 0, 0, 131070);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(m77.z(i, ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.m, ux2Var3, 0, 0, 131070);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ux2Var4.Q();
                } else {
                    qs7.b(m77.z(i, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.m, ux2Var4, 0, 0, 131070);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ux2Var5.Q();
                } else {
                    qs7.b(m77.z(i, ux2Var5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var5.j(un4.a)).b.m, ux2Var5, 0, 0, 131070);
                }
                break;
            default:
                bn7 bn7Var2 = (bn7) obj;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? ux2Var6.f(bn7Var2) : ux2Var6.h(bn7Var2) ? 4 : 2;
                }
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ux2Var6.Q();
                } else {
                    xz2.X.x0(new gm7(bn7Var2.a, i, true, bn7Var2.b), Float.NaN, 0.0f, 0L, null, ux2Var6, 196656, 28);
                }
                break;
        }
        return f88Var;
    }
}
