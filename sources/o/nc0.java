package o;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 {
    public final ja3 a;
    public final xt6 b;
    public final RemoteControlApplication c;

    public nc0(ja3 ja3Var, xt6 xt6Var, RemoteControlApplication remoteControlApplication) {
        ja3Var.getClass();
        this.a = ja3Var;
        this.b = xt6Var;
        this.c = remoteControlApplication;
    }

    public static void a(long j, t93 t93Var) {
        t93Var.getClass();
        MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), false, true);
        if (MachineListViewModelSWIGJNI.MachineListViewModel_IsContactComputerSelectionRequired(machineListViewModelO.a, machineListViewModelO)) {
            t93Var.y();
            return;
        }
        if (MachineListViewModelSWIGJNI.MachineListViewModel_GetSize(machineListViewModelO.a, machineListViewModelO) != 1) {
            ye4.c("BuddyListConnectorUiModel", "File transfer failed: Partner has no valid contact computer");
            t93Var.n();
            return;
        }
        MachineId machineIdA = machineListViewModelO.a(0L);
        if (machineIdA == null) {
            ye4.c("BuddyListConnectorUiModel", "machine id was null");
        } else {
            b(machineIdA);
        }
    }

    public static void b(MachineId machineId) {
        MachineListElementViewModel machineListElementViewModelN = ds1.n(machineId);
        if (machineListElementViewModelN == null) {
            ye4.c("ContactComputerConnector", "PartnerListViewModel was null");
            return;
        }
        String strMachineListElementViewModel_GetPassword = MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetPassword(machineListElementViewModelN.a, machineListElementViewModelN);
        if (!MachineListElementViewModelSWIGJNI.MachineListElementViewModel_HasPasswordSet(machineListElementViewModelN.a, machineListElementViewModelN)) {
            strMachineListElementViewModel_GetPassword = null;
        }
        if (strMachineListElementViewModel_GetPassword == null) {
            strMachineListElementViewModel_GetPassword = "";
        }
        PListDyngateID pListDyngateID = new PListDyngateID(MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetDyngateID(machineListElementViewModelN.a, machineListElementViewModelN), true);
        int i = rt6.g;
        String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
        strPListDyngateID_GetAsString.getClass();
        rt6 rt6VarA = qt6.a(strPListDyngateID_GetAsString, strMachineListElementViewModel_GetPassword);
        if (rt6VarA == null) {
            ye4.c("ContactComputerConnector", "null login data");
            return;
        }
        long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1(machineId.a, machineId);
        ManagedDeviceViewModel managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1 == 0 ? null : new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1);
        if (managedDeviceViewModel == null) {
            ye4.a.b("EasyAccessHelper", "Machine is not a managed device");
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

    public static void d(DyngateID dyngateID) {
        PListDyngateID pListDyngateID = new PListDyngateID(dyngateID);
        String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
        int i = wt6.k;
        strPListDyngateID_GetAsString.getClass();
        wt6 wt6VarC = vt6.c(strPListDyngateID_GetAsString);
        if (wt6VarC != null) {
            if (strPListDyngateID_GetAsString.length() > 0) {
                ye4.a("EasyAccessHelper", "Enabling easy access for connection");
                wt6VarC.c = Boolean.TRUE;
                wt6VarC.e = strPListDyngateID_GetAsString;
            } else {
                ye4.c("EasyAccessHelper", "Easy access enabled, but ManagementId is empty");
            }
        }
        if (wt6VarC == null) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        if (!wt6VarC.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(wt6VarC);
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    public final void c(long j, boolean z) {
        PListComputerID pListComputerID = new PListComputerID(j);
        RemoteControlApplication remoteControlApplication = this.c;
        xt6 xt6Var = this.b;
        if (z) {
            ck3.i0(pListComputerID, xt6Var, remoteControlApplication, new px((byte) 29));
            return;
        }
        ja3 ja3Var = this.a;
        ja3Var.getClass();
        ck3.i0(pListComputerID, xt6Var, remoteControlApplication, new g0(ja3Var, pListComputerID, (byte) 21));
    }

    public final void e(long j, boolean z, t93 t93Var) {
        MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
        if (MachineListViewModelSWIGJNI.MachineListViewModel_IsContactComputerSelectionRequired(machineListViewModelO.a, machineListViewModelO)) {
            t93Var.y();
            return;
        }
        if (MachineListViewModelSWIGJNI.MachineListViewModel_GetSize(machineListViewModelO.a, machineListViewModelO) != 1) {
            ye4.c("BuddyListConnectorUiModel", "Remote Control failed: Partner has no valid contact computer");
            t93Var.n();
            return;
        }
        MachineId machineIdA = machineListViewModelO.a(0L);
        if (machineIdA == null) {
            ye4.c("BuddyListConnectorUiModel", "machine id was null");
        } else {
            ga0.s(machineIdA, z, this.a);
        }
    }
}
