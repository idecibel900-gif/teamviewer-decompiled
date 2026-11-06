package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ nr6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SupportSession f551o;
    public final /* synthetic */ px4 p;

    public /* synthetic */ cr6(nr6 nr6Var, SupportSession supportSession, px4 px4Var, byte b) {
        this.m = b;
        this.n = nr6Var;
        this.f551o = supportSession;
        this.p = px4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.p;
        SupportSession supportSession = this.f551o;
        nr6 nr6Var = this.n;
        switch (b) {
            case 0:
                px4Var.setValue(Boolean.TRUE);
                nr6Var.e.invoke(supportSession);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(sr6.OnServiceQueueMoreActionsClicked);
                break;
            case 1:
                px4Var.setValue(Boolean.TRUE);
                nr6Var.e.invoke(supportSession);
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(sr6.OnServiceQueueMoreActionsClicked);
                break;
            case 2:
                px4Var.setValue(Boolean.FALSE);
                nr6Var.f.invoke(supportSession);
                break;
            default:
                px4Var.setValue(Boolean.FALSE);
                nr6Var.f.invoke(supportSession);
                break;
        }
        return f88Var;
    }
}
