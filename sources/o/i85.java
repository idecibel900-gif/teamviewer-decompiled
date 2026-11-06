package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i85 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ wh8 n;

    public /* synthetic */ i85(wh8 wh8Var, byte b) {
        this.m = b;
        this.n = wh8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        wh8 wh8Var = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(h57.D(zh8.OnSignInClicked, "onboarding"));
                wh8Var.a(false);
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(h57.D(zh8.OnCreateAccountClicked, "onboarding"));
                wh8Var.a(true);
                break;
            case 2:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(h57.D(zh8.OnSignInClicked, "global-search-screen"));
                wh8Var.a(false);
                break;
            case 3:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(h57.D(zh8.OnCreateAccountClicked, "global-search-screen"));
                wh8Var.a(true);
                break;
            case 4:
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(h57.D(zh8.OnSignInClicked, "settings"));
                wh8Var.a(false);
                break;
            default:
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(h57.D(zh8.OnCreateAccountClicked, "settings"));
                wh8Var.a(true);
                break;
        }
        return f88Var;
    }
}
