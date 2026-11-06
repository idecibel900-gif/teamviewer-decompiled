package o;

import com.teamviewer.apidefinitions.rolloutconfigurations.infrastructure.Serializer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.ISolutionsViewModel;
import com.teamviewer.remotecontrollib.swig.SolutionsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MonitoringOverviewViewModelFactorySWIGJNI;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w26 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ w26(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ISolutionsViewModel iSolutionsViewModel = null;
        IMonitoringOverviewViewModel iMonitoringOverviewViewModel = null;
        switch (this.m) {
            case 0:
                long jSolutionsViewModelFactory_GetSolutionsViewModel = SolutionsViewModelFactorySWIGJNI.SolutionsViewModelFactory_GetSolutionsViewModel();
                if (jSolutionsViewModelFactory_GetSolutionsViewModel != 0) {
                    iSolutionsViewModel = new ISolutionsViewModel();
                    iSolutionsViewModel.b = true;
                    iSolutionsViewModel.a = jSolutionsViewModelFactory_GetSolutionsViewModel;
                }
                iSolutionsViewModel.getClass();
                cg3 cg3Var = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                return new e67(iSolutionsViewModel, new wf3(cg3Var, iInAppPurchaseViewModelD, EventHub.e.f()));
            case 1:
                cg3 cg3Var2 = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD2 = et1.d();
                iInAppPurchaseViewModelD2.getClass();
                return new zo0(new wf3(cg3Var2, iInAppPurchaseViewModelD2, EventHub.e.f()));
            case 2:
                long jMonitoringOverviewViewModelFactory_GetMonitoringOverviewViewModel = MonitoringOverviewViewModelFactorySWIGJNI.MonitoringOverviewViewModelFactory_GetMonitoringOverviewViewModel();
                if (jMonitoringOverviewViewModelFactory_GetMonitoringOverviewViewModel != 0) {
                    iMonitoringOverviewViewModel = new IMonitoringOverviewViewModel();
                    iMonitoringOverviewViewModel.b = true;
                    iMonitoringOverviewViewModel.a = jMonitoringOverviewViewModelFactory_GetMonitoringOverviewViewModel;
                }
                iMonitoringOverviewViewModel.getClass();
                return new it4(iMonitoringOverviewViewModel);
            case 3:
                cg3 cg3Var3 = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD3 = et1.d();
                iInAppPurchaseViewModelD3.getClass();
                return new vh8(new wf3(cg3Var3, iInAppPurchaseViewModelD3, EventHub.e.f()));
            case 4:
                List listJ0 = lv0.J0((List) vq6.a.getValue(), new gj2((byte) 25));
                ArrayList arrayList = new ArrayList();
                int size = listJ0.size();
                for (int i = 0; i < size; i++) {
                    ((d75) listJ0.get(i)).getClass();
                    arrayList.add(new vd5(new r25(new ti4((byte) 19)), w86.a.b(x98.class)));
                }
                return arrayList;
            case 5:
                List listJ1 = lv0.J0((List) vq6.b.getValue(), new gj2((byte) 26));
                ArrayList arrayList2 = new ArrayList();
                if (listJ1.size() <= 0) {
                    return arrayList2;
                }
                listJ1.get(0).getClass();
                io.sentry.h2.f();
                return null;
            case 6:
                return h57.p(Boolean.FALSE);
            case 7:
                int i2 = RemoteControlApplication.G;
                qi7 qi7Var = qi7.g;
                if (qi7Var != null) {
                    return qi7Var;
                }
                im3.e0("instance");
                throw null;
            case 8:
                int i3 = RemoteControlApplication.G;
                return EventHub.e.f();
            case ep1.b /* 9 */:
                return wb6.a;
            case ep1.c /* 10 */:
                h72 h72Var = dc6.a;
                return jj1.a;
            case 11:
                h72 h72Var2 = zd6.a;
                return uf0.H;
            case ep1.d /* 12 */:
                return new lh6(new LinkedHashMap());
            case 13:
                return null;
            case 14:
                return new hk6(0);
            case 15:
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new yf5(0);
            case 17:
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return f88.a;
            case 20:
                return f88.a;
            case 21:
                return f88.a;
            case 22:
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return new bn6(c36Var.e());
                }
                hk0.g("Required value was null.");
                return null;
            case 23:
                return h57.p("");
            case 24:
                return h57.p("");
            case 25:
                return null;
            case 26:
                return Serializer.moshi_delegate$lambda$0();
            case 27:
                return com.teamviewer.apidefinitions.supportsessions.infrastructure.Serializer.moshi_delegate$lambda$0();
            case 28:
                return com.teamviewer.apidefinitions.wakeonlan.infrastructure.Serializer.moshi_delegate$lambda$0();
            default:
                return com.teamviewer.apidefinitions.chat.infrastructure.Serializer.moshi_delegate$lambda$0();
        }
    }
}
