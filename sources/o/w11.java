package o;

import com.teamviewer.remotecontrolviewlib.activity.ConditionalAccessAuthenticationResponseFeedbackActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w11 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ConditionalAccessAuthenticationResponseFeedbackActivity n;

    public /* synthetic */ w11(ConditionalAccessAuthenticationResponseFeedbackActivity conditionalAccessAuthenticationResponseFeedbackActivity, byte b) {
        this.m = b;
        this.n = conditionalAccessAuthenticationResponseFeedbackActivity;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ConditionalAccessAuthenticationResponseFeedbackActivity conditionalAccessAuthenticationResponseFeedbackActivity = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                int i = ConditionalAccessAuthenticationResponseFeedbackActivity.H;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    conditionalAccessAuthenticationResponseFeedbackActivity.D(0, ux2Var);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                int i2 = ConditionalAccessAuthenticationResponseFeedbackActivity.H;
                if (!ux2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    conditionalAccessAuthenticationResponseFeedbackActivity.E(0, ux2Var);
                }
                break;
            case 2:
                num.getClass();
                int i3 = ConditionalAccessAuthenticationResponseFeedbackActivity.H;
                conditionalAccessAuthenticationResponseFeedbackActivity.D(yo1.Y(1), ux2Var);
                break;
            default:
                num.getClass();
                int i4 = ConditionalAccessAuthenticationResponseFeedbackActivity.H;
                conditionalAccessAuthenticationResponseFeedbackActivity.E(yo1.Y(1), ux2Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ w11(ConditionalAccessAuthenticationResponseFeedbackActivity conditionalAccessAuthenticationResponseFeedbackActivity, int i, byte b) {
        this.m = b;
        this.n = conditionalAccessAuthenticationResponseFeedbackActivity;
    }
}
