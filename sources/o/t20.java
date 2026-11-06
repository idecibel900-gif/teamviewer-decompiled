package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t20 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    public /* synthetic */ t20(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    qs7.b(this.n, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(this.n, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 0, 0, 262142);
                }
                break;
            case 2:
                i08 i08Var = (i08) obj;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? ux2Var3.f(i08Var) : ux2Var3.h(i08Var) ? 4 : 2;
                }
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ux2Var3.Q();
                } else {
                    String str = this.n;
                    g08.b(i08Var, str, null, 0.0f, null, 0L, 0L, au8.O(660974002, new qa(str, (byte) 9), ux2Var3), ux2Var3, iIntValue3 & 14);
                }
                break;
            case 3:
                i08 i08Var2 = (i08) obj;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? ux2Var4.f(i08Var2) : ux2Var4.h(i08Var2) ? 4 : 2;
                }
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ux2Var4.Q();
                } else {
                    String str2 = this.n;
                    g08.b(i08Var2, str2, null, 0.0f, null, 0L, 0L, au8.O(-1253910984, new qa(str2, (byte) 10), ux2Var4), ux2Var4, iIntValue4 & 14);
                }
                break;
            default:
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ux2Var5.Q();
                } else {
                    qs7.b(this.n, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262142);
                }
                break;
        }
        return f88Var;
    }
}
