package o;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 extends g1 {
    @Override // o.g1
    public final void e1(ab3 ab3Var) {
        ab3Var.getClass();
        PListComputerID pListComputerID = new PListComputerID(a1());
        ComputerEditViewModel computerEditViewModelI = ds1.i(pListComputerID);
        if (computerEditViewModelI == null) {
            ye4.c("BuddyListConnectorUiModel", "The computer id does not exists");
            return;
        }
        PListDyngateID pListDyngateIDA = computerEditViewModelI.a();
        String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
        strPListDyngateID_GetAsString.getClass();
        String strB = ((l41) this.f843o.a).b(strPListDyngateID_GetAsString);
        if (strB == null || strB.length() == 0) {
            strB = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetPassword(computerEditViewModelI.a, computerEditViewModelI);
            strB.getClass();
        }
        int i = rt6.g;
        rt6 rt6VarA = qt6.a(strPListDyngateID_GetAsString, strB);
        if (rt6VarA == null) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0(pListComputerID.a, pListComputerID);
        ManagedDeviceViewModel managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0 == 0 ? null : new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0);
        if (managedDeviceViewModel == null) {
            ye4.a.b("EasyAccessHelper", "Computer is not a managed device");
        } else if (ManagedDeviceViewModelSWIGJNI.ManagedDeviceViewModel_IsEasyAccessEnabled(managedDeviceViewModel.a, managedDeviceViewModel)) {
            String strManagedDeviceViewModel_GetManagementId = ManagedDeviceViewModelSWIGJNI.ManagedDeviceViewModel_GetManagementId(managedDeviceViewModel.a, managedDeviceViewModel);
            strManagedDeviceViewModel_GetManagementId.getClass();
            if (strManagedDeviceViewModel_GetManagementId.length() > 0) {
                ye4.a("EasyAccessHelper", "Enabling easy access for connection");
                rt6VarA.c = Boolean.TRUE;
                rt6VarA.f = strManagedDeviceViewModel_GetManagementId;
            } else {
                ye4.c("EasyAccessHelper", "Easy access enabled, but ManagementId is empty");
            }
        }
        if (!rt6VarA.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(rt6VarA);
        } else {
            im3.e0("instance");
            throw null;
        }
    }
}
