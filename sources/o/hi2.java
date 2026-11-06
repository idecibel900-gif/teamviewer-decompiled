package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 implements m02 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ii2 n;

    public /* synthetic */ hi2(ii2 ii2Var, byte b) {
        this.m = b;
        this.n = ii2Var;
    }

    @Override // o.m02
    public final void l() {
        byte b = this.m;
        ii2 ii2Var = this.n;
        switch (b) {
            case 0:
                xt2 xt2VarC = ii2Var.C();
                if (xt2VarC != null) {
                    xt2VarC.finish();
                }
                break;
            default:
                ii2Var.B0(R.string.tv_feedback_YourRatingHasBeenSubmittedSuccessfully);
                break;
        }
    }
}
