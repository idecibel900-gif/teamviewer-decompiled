package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j44 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ j44(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        x27 x27Var = x27.a;
        w27 w27Var = w27.a;
        f88 f88Var = f88.a;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                return new h44((Function1) px4Var.getValue());
            case 1:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 2:
                int i = MainActivity.w0;
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 3:
                i04 i04Var = (i04) px4Var.getValue();
                if (i04Var != null) {
                    return i04Var;
                }
                ni3.d("Required value was null.");
                hk0.b();
                return null;
            case 4:
                px4Var.setValue(Boolean.valueOf(!((Boolean) px4Var.getValue()).booleanValue()));
                return f88Var;
            case 5:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 6:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(sr6.OnServiceQueueCopySessionLinkClicked);
                ((Function1) px4Var.getValue()).invoke(x27Var);
                return f88Var;
            case 7:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(sr6.OnServiceQueueCopySessionCodeClicked);
                ((Function1) px4Var.getValue()).invoke(w27Var);
                return f88Var;
            case 8:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(kt6.E);
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case ep1.b /* 9 */:
                return (xs6) px4Var.getValue();
            case ep1.c /* 10 */:
                return (xs6) px4Var.getValue();
            case 11:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case ep1.d /* 12 */:
                return (xs6) px4Var.getValue();
            case 13:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(kt6.y);
                ((Function1) px4Var.getValue()).invoke(x27Var);
                return f88Var;
            case 14:
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(kt6.A);
                ((Function1) px4Var.getValue()).invoke(w27Var);
                return f88Var;
            case 15:
                px4Var.setValue(null);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                px4Var.setValue(Boolean.valueOf(!((Boolean) px4Var.getValue()).booleanValue()));
                return f88Var;
            default:
                return (i04) px4Var.getValue();
        }
    }
}
