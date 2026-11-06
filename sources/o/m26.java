package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.BuddyListMainViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainer;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;

/* JADX INFO: loaded from: classes.dex */
public final class m26 implements se8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au2 b;

    public /* synthetic */ m26(au2 au2Var, byte b) {
        this.a = b;
        this.b = au2Var;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        IBuddyListMainViewModel iBuddyListMainViewModel;
        switch (this.a) {
            case 0:
                long jBuddyListMainViewModelFactory_GetBuddyListMainViewModel = BuddyListMainViewModelFactorySWIGJNI.BuddyListMainViewModelFactory_GetBuddyListMainViewModel();
                if (jBuddyListMainViewModelFactory_GetBuddyListMainViewModel == 0) {
                    iBuddyListMainViewModel = null;
                } else {
                    IBuddyListMainViewModel iBuddyListMainViewModel2 = new IBuddyListMainViewModel();
                    iBuddyListMainViewModel2.b = true;
                    iBuddyListMainViewModel2.a = jBuddyListMainViewModelFactory_GetBuddyListMainViewModel;
                    iBuddyListMainViewModel = iBuddyListMainViewModel2;
                }
                GroupListViewModel groupListViewModelL = ds1.l(false);
                IPLSynchronizationStateViewModel iPLSynchronizationStateViewModelP = ds1.p();
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer = (IManagedDeviceV2FactoryContainer) this.b.a;
                PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModelB = iManagedDeviceV2FactoryContainer != null ? iManagedDeviceV2FactoryContainer.b() : null;
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer2 = (IManagedDeviceV2FactoryContainer) this.b.a;
                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModelA = iManagedDeviceV2FactoryContainer2 != null ? iManagedDeviceV2FactoryContainer2.a() : null;
                cg3 cg3Var = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                return new ud0(iBuddyListMainViewModel, groupListViewModelL, iPLSynchronizationStateViewModelP, pLManagerGroupsListV2ViewModelB, pLManagerDevicesV2ViewModelA, new wf3(cg3Var, iInAppPurchaseViewModelD, EventHub.e.f()));
            case 1:
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer3 = (IManagedDeviceV2FactoryContainer) this.b.a;
                return new zd0(iManagedDeviceV2FactoryContainer3 != null ? iManagedDeviceV2FactoryContainer3.a() : null);
            case 2:
                return new oi7((EventHub) this.b.d);
            case 3:
                au2 au2Var = this.b;
                return new xj2((RemoteControlApplication) au2Var.b, (xt6) au2Var.f, (tk2) ((ep3) au2Var.h).n);
            case 4:
                au2 au2Var2 = this.b;
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) au2Var2.b;
                SharedPreferences sharedPreferences = (SharedPreferences) au2Var2.c;
                xt6 xt6Var = (xt6) au2Var2.f;
                sharedPreferences.getClass();
                bd4 bd4Var = bd4.k;
                if (bd4Var == null) {
                    bd4Var = new bd4();
                    bd4.k = bd4Var;
                }
                cd4 cd4Var = new cd4(remoteControlApplication, bd4Var, sharedPreferences, xt6Var);
                cd4Var.v = true;
                return cd4Var;
            default:
                au2 au2Var3 = this.b;
                return new da6((RemoteControlApplication) au2Var3.b, (SharedPreferences) au2Var3.c, (xt6) au2Var3.f);
        }
    }
}
