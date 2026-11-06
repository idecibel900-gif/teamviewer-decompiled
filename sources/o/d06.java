package o;

import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d06 implements hk7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RCClientActivity b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d06(RCClientActivity rCClientActivity, Object obj, byte b) {
        this.a = b;
        this.b = rCClientActivity;
        this.c = obj;
    }

    @Override // o.hk7
    public final void a(gk7 gk7Var) {
        byte b = this.a;
        Object obj = this.c;
        RCClientActivity rCClientActivity = this.b;
        switch (b) {
            case 0:
                ic3 ic3Var = (ic3) obj;
                lc3 lc3Var = rCClientActivity.P;
                if (lc3Var != null) {
                    lc3Var.H0(ic3Var);
                }
                break;
            default:
                ar arVar = (ar) obj;
                lc3 lc3Var2 = rCClientActivity.P;
                if (lc3Var2 != null) {
                    lc3Var2.f0(arVar);
                }
                break;
        }
    }
}
