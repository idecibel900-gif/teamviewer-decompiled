package o;

import com.teamviewer.apidefinitions.contacts.infrastructure.Serializer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq6 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ oq6(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return Serializer.moshi_delegate$lambda$0();
            case 1:
                return com.teamviewer.apidefinitions.custommodules.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 2:
                return com.teamviewer.apidefinitions.legacydevices.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 3:
                return com.teamviewer.apidefinitions.manageddevices.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 4:
                return com.teamviewer.apidefinitions.mobilewake.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 5:
                return com.teamviewer.apidefinitions.policies.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 6:
                return com.teamviewer.apidefinitions.recentconnections.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 7:
                return com.teamviewer.apidefinitions.remotecontrol.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 8:
                return com.teamviewer.apidefinitions.account.infrastructure.Serializer.moshi_delegate$lambda$0();
            case ep1.b /* 9 */:
                try {
                    Iterator it = Arrays.asList(new d75()).iterator();
                    it.getClass();
                    return uf0.y(bq6.l0(new v51(new fx(it, (byte) 4))));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case ep1.c /* 10 */:
                try {
                    Iterator it2 = Arrays.asList(new ej1[0]).iterator();
                    it2.getClass();
                    return uf0.y(bq6.l0(new v51(new fx(it2, (byte) 4))));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(sr6.OnServiceQueueShareSessionLinkClicked);
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                return f88Var;
            case 17:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(sr6.OnServiceQueueShareSessionCodeClicked);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return f88Var;
            case 20:
                if (zu1.c != null) {
                    return new xr6(0);
                }
                hk0.g("Required value was null.");
                return null;
            case 21:
                return h57.p(null);
            case 22:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(kt6.D);
                return f88Var;
            case 23:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(kt6.F);
                return f88Var;
            case 24:
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(kt6.G);
                return f88Var;
            case 25:
                return h57.p(Boolean.FALSE);
            case 27:
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(kt6.z);
            case 26:
                return f88Var;
            case 28:
                IStatisticsHandler iStatisticsHandler7 = ga7.a;
                ga7.a(kt6.B);
                return f88Var;
            default:
                if (zu1.c != null) {
                    return new su6(0);
                }
                hk0.g("Required value was null.");
                return null;
        }
    }
}
