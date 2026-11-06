package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sv6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ iv6 n;

    public /* synthetic */ sv6(iv6 iv6Var, byte b) {
        this.m = b;
        this.n = iv6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        iv6 iv6Var = this.n;
        switch (b) {
            case 0:
                iv6Var.i.invoke(Boolean.FALSE);
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ew6.OnTeamViewerVersionGUIDClicked);
                iv6Var.h.a();
                break;
            default:
                iv6Var.k.a();
                break;
        }
        return f88Var;
    }
}
