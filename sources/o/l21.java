package o;

import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l21 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ q37 n;

    public /* synthetic */ l21(q37 q37Var, byte b) {
        this.m = b;
        this.n = q37Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        q37 q37Var = this.n;
        ux2 ux2Var = (ux2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            case 1:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            case 2:
                int i = OnBoardingActivity.N;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            case 3:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            case 4:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    qs1.t(q37Var, null, ux2Var, 6);
                }
                break;
            case 5:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            case 6:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
            default:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    us1.j(q37Var, null, ux2Var, 6);
                }
                break;
        }
        return f88Var;
    }
}
