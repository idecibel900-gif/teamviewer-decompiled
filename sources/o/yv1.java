package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ yv1(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.a();
                }
                return f88Var;
            case 1:
                if (function0 != null) {
                    function0.a();
                }
                return f88Var;
            case 2:
                function0.a();
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(kz1.OnGlobalSearchClicked);
                return f88Var;
            case 3:
                function0.a();
                return f88Var;
            case 4:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(g02.G);
                function0.a();
                return f88Var;
            case 5:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(ra1.I);
                function0.a();
                return f88Var;
            case 6:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(ra1.H);
                function0.a();
                return f88Var;
            case 7:
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(f43.F);
                function0.a();
                return f88Var;
            case 8:
                function0.a();
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(f43.C);
                return f88Var;
            case ep1.b /* 9 */:
                function0.a();
                IStatisticsHandler iStatisticsHandler7 = ga7.a;
                ga7.a(f43.B);
                return f88Var;
            case ep1.c /* 10 */:
                try {
                    return (List) function0.a();
                } catch (SSLPeerUnverifiedException unused) {
                    return ea2.m;
                }
            case 11:
                function0.a();
                return f88Var;
            case ep1.d /* 12 */:
                function0.a();
                return f88Var;
            case 13:
                function0.a();
                return f88Var;
            case 14:
                function0.a();
                return f88Var;
            case 15:
                IStatisticsHandler iStatisticsHandler8 = ga7.a;
                ga7.a(px5.q);
                function0.a();
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                function0.a();
                return f88Var;
            case 17:
                function0.a();
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                function0.a();
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                function0.a();
                return f88Var;
            case 20:
                function0.a();
                return f88Var;
            case 21:
                IStatisticsHandler iStatisticsHandler9 = ga7.a;
                ga7.a(f43.A);
                function0.a();
                return f88Var;
            case 22:
                IStatisticsHandler iStatisticsHandler10 = ga7.a;
                ga7.a(f43.A);
                function0.a();
                return f88Var;
            case 23:
                IStatisticsHandler iStatisticsHandler11 = ga7.a;
                ga7.a(f43.z);
                function0.a();
                return f88Var;
            case 24:
                function0.a();
                return Boolean.TRUE;
            case 25:
                function0.a();
                IStatisticsHandler iStatisticsHandler12 = ga7.a;
                ga7.a(sr6.OnServiceQueueSortByClicked);
                return f88Var;
            case 26:
                IStatisticsHandler iStatisticsHandler13 = ga7.a;
                ga7.a(kt6.r);
                function0.a();
                return f88Var;
            case 27:
                IStatisticsHandler iStatisticsHandler14 = ga7.a;
                ga7.a(kt6.x);
                function0.a();
                return f88Var;
            case 28:
                IStatisticsHandler iStatisticsHandler15 = ga7.a;
                ga7.a(kt6.s);
                function0.a();
                return f88Var;
            default:
                function0.a();
                return f88Var;
        }
    }
}
