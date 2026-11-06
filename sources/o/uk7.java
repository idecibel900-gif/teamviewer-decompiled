package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sk7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2222o;

    public /* synthetic */ uk7(sk7 sk7Var, String str, byte b) {
        this.m = b;
        this.n = sk7Var;
        this.f2222o = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        cs4 cs4Var = cs4.b;
        String str = this.f2222o;
        sk7 sk7Var = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    qs7.b(sk7Var.a.a(ux2Var), androidx.compose.ui.platform.a.a(cs4Var, str + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(un4.a)).b.j, ux2Var, 0, 0, 131068);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    o78 o78Var = sk7Var.b;
                    if (o78Var != null) {
                        ux2Var2.W(-1909698785);
                        qs7.b(o78Var.a(ux2Var2), androidx.compose.ui.platform.a.a(cs4Var, str + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.k, ux2Var2, 0, 0, 131068);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1909698786);
                        ux2Var2.p(false);
                    }
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(sk7Var.a.a(ux2Var3), androidx.compose.ui.platform.a.a(cs4Var, str.concat("-TVListItemSwitchTitle")), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                }
                break;
            default:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    o78 o78Var2 = sk7Var.b;
                    if (o78Var2 != null) {
                        ux2Var4.W(-679934693);
                        qs7.b(o78Var2.a(ux2Var4), androidx.compose.ui.platform.a.a(cs4Var, str.concat("-TVListItemSwitchSubtitle")), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.k, ux2Var4, 0, 0, 131068);
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-679934694);
                        ux2Var4.p(false);
                    }
                }
                break;
        }
        return f88Var;
    }
}
