package o;

import android.content.Context;
import com.teamviewer.chatviewmodel.swig.ConnectionInfoCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class oo0 extends ConnectionInfoCallback {
    @Override // com.teamviewer.chatviewmodel.swig.ConnectionInfoCallback
    public final void OnConnectionToAccount(long j) {
        MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
        if (MachineListViewModelSWIGJNI.MachineListViewModel_IsContactComputerSelectionRequired(machineListViewModelO.a, machineListViewModelO)) {
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            i71 i71Var = new i71(machineListViewModelO);
            if (nv1.d == null) {
                im3.e0("dialogFactory");
                throw null;
            }
            bb4 bb4VarC = yi5.c(i71Var, new z(machineListViewModelO, (byte) 3));
            bb4VarC.F0 = R.string.tv_action_SelectMachine;
            bb4VarC.N0();
            return;
        }
        if (MachineListViewModelSWIGJNI.MachineListViewModel_GetSize(machineListViewModelO.a, machineListViewModelO) == 1) {
            MachineId machineIdA = machineListViewModelO.a(0L);
            if (machineIdA == null) {
                ye4.c("ChatConversationDefaultLogic", "machine id was null");
                return;
            } else {
                ga0.s(machineIdA, true, null);
                return;
            }
        }
        ye4.c("ChatConversationDefaultLogic", "Remote Control failed: Partner has no valid contact computer");
        Context context = d82.M;
        if (context != null) {
            d82.t(context, R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ConnectionInfoCallback
    public final void OnConnectionToMachine(DyngateID dyngateID) {
        dyngateID.getClass();
        long jToLong = dyngateID.ToLong();
        int i = wt6.k;
        ck3.P(vt6.c(String.valueOf(jToLong)));
    }

    @Override // com.teamviewer.chatviewmodel.swig.ConnectionInfoCallback
    public final void OnConnectionToServiceCase(DyngateID dyngateID) {
        dyngateID.getClass();
        long jToLong = dyngateID.ToLong();
        int i = wt6.k;
        ck3.P(vt6.c(String.valueOf(jToLong)));
    }

    @Override // com.teamviewer.chatviewmodel.swig.ConnectionInfoCallback
    public final void OnError() {
        ye4.c("ChatConversationDefaultLogic", "Error on start remote control");
    }
}
