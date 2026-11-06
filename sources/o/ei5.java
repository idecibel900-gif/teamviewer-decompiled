package o;

import android.content.Context;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ei5 implements fc3 {
    public final ae a;

    public ei5(ae aeVar) {
        this.a = aeVar;
    }

    @Override // o.fc3
    public final void b(Context context) {
        context.getClass();
        ae aeVar = this.a;
        String str = (String) aeVar.c;
        ij6 ij6Var = ij6.n;
        if (str != null) {
            wi6.a();
            if (((ij6) aeVar.d) != ij6Var) {
                ye4.c("PendingConnectionTv10Scheme", "in device mode only password authentication is allowed");
                return;
            }
            String str2 = (String) aeVar.c;
            if (str2 == null) {
                str2 = "";
            }
            ck3.h0(str2, "");
            return;
        }
        if (aeVar.b != -1) {
            LoginState loginStateA = di1.g().a();
            int i = loginStateA != null ? di5.a[loginStateA.ordinal()] : -1;
            if (i != 1) {
                if (i != 2) {
                    ye4.c("PendingConnectionTv10Scheme", "buddylist is in unexpected connection state!");
                    return;
                }
                return;
            }
            wi6.a();
            MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(aeVar.b), true, false);
            if (MachineListViewModelSWIGJNI.MachineListViewModel_GetSize(machineListViewModelO.a, machineListViewModelO) <= 0) {
                ye4.c("PendingConnectionTv10Scheme", "connectToContact: No machine found!");
                Context context2 = d82.M;
                if (context2 == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string = context2.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
                string.getClass();
                fx3.r(string, 1, context2, bu7.MAIN);
                return;
            }
            MachineId machineIdA = machineListViewModelO.a(0L);
            if (machineIdA == null) {
                ye4.c("PendingConnectionTv10Scheme", "machine id was null");
                return;
            }
            ij6 ij6Var2 = (ij6) aeVar.d;
            if (ij6Var2 == ij6Var) {
                ga0.s(machineIdA, false, null);
            } else if (ij6Var2 == ij6.m) {
                ga0.s(machineIdA, true, null);
            }
        }
    }
}
