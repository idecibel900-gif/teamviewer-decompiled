package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yq6 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ me1 f2630o;
    public final /* synthetic */ nr6 p;
    public final /* synthetic */ w44 q;
    public final /* synthetic */ int r;

    public /* synthetic */ yq6(boolean z, me1 me1Var, nr6 nr6Var, w44 w44Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f2630o = me1Var;
        this.p = nr6Var;
        this.q = w44Var;
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        nr6 nr6Var = this.p;
        int i = this.r;
        w44 w44Var = this.q;
        me1 me1Var = this.f2630o;
        boolean z = this.n;
        switch (b) {
            case 0:
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                if (z) {
                    im3.R(me1Var, null, null, new fa1(w44Var, i, null, (byte) 3), 3);
                }
                nr6Var.c.invoke(supportSession);
                break;
            default:
                SupportSession supportSession2 = (SupportSession) obj;
                supportSession2.getClass();
                if (z) {
                    im3.R(me1Var, null, null, new fa1(w44Var, i, null, (byte) 4), 3);
                }
                nr6Var.j.invoke(supportSession2);
                break;
        }
        return f88Var;
    }
}
