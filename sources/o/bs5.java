package o;

import androidx.compose.ui.tooling.PreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f451o;

    public /* synthetic */ bs5(String str, String str2, byte b) {
        this.m = b;
        this.n = str;
        this.f451o = str2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        String str = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = PreviewActivity.I;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    iq8.s(str, this.f451o, ux2Var, new Object[0]);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(this.f451o, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-title")), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.f, ux2Var2, 0, 0, 131068);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(this.f451o, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-description")), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                }
                break;
            default:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    ot7 ot7Var = ((rn4) ux2Var4.j(un4.a)).b.g;
                    qs7.b(this.f451o, androidx.compose.ui.platform.a.a(cs4Var, str + "-TVTopAppBarTitle"), ((tf2) ux2Var4.j(vf2.a)).l, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ot7Var, ux2Var4, 0, 24960, 110584);
                }
                break;
        }
        return f88Var;
    }
}
