package o;

import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ PilotSessionActivity n;

    public /* synthetic */ uk5(PilotSessionActivity pilotSessionActivity, byte b) {
        this.m = b;
        this.n = pilotSessionActivity;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        PilotSessionActivity pilotSessionActivity = this.n;
        byte b2 = 1;
        ux2 ux2Var = (ux2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                int i = PilotSessionActivity.U;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ut7.a(au8.O(-1953773263, new uk5(pilotSessionActivity, b2), ux2Var), ux2Var, 48);
                }
                break;
            default:
                int i2 = PilotSessionActivity.U;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean zH = ux2Var.h(pilotSessionActivity);
                    Object objK = ux2Var.K();
                    if (zH || objK == e01.a) {
                        objK = new vk5(pilotSessionActivity, (byte) 1);
                        ux2Var.g0(objK);
                    }
                    au8.c((Function0) objK, null, null, ux2Var, 0);
                }
                break;
        }
        return f88Var;
    }
}
