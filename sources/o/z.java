package o;

import android.content.DialogInterface;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ z(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.m;
        byte b2 = 1;
        Object obj = this.n;
        switch (b) {
            case 0:
                String str = (String) obj;
                dialogInterface.getClass();
                qi7 qi7Var = qi7.g;
                if (qi7Var == null) {
                    im3.e0("instance");
                    throw null;
                }
                qi7Var.c(str);
                dialogInterface.dismiss();
                return;
            case 1:
                ((tl0) obj).a.finish();
                return;
            case 2:
                ((po0) obj).D = i;
                return;
            case 3:
                MachineId machineIdA = ((MachineListViewModel) obj).a(i);
                if (machineIdA == null) {
                    ye4.c("ChatConversationDefaultLogic", "machine id was null");
                    return;
                } else {
                    ga0.s(machineIdA, true, null);
                    return;
                }
            case 4:
                LockScreenActivity lockScreenActivity = (LockScreenActivity) obj;
                int i2 = LockScreenActivity.O;
                he4 he4Var = (he4) lockScreenActivity.N.getValue();
                ge4 ge4Var = new ge4(lockScreenActivity, (byte) 3);
                he4Var.getClass();
                LogoutViewModel logoutViewModel = he4Var.f966o;
                l6 l6Var = new l6(he4Var, ge4Var, b2);
                LogoutViewModelSWIGJNI.LogoutViewModel_LogOut(logoutViewModel.c, logoutViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var), l6Var);
                return;
            default:
                ye4.a("PilotSessionContainerF", "Clear all markers");
                nd3 nd3Var = ((yk5) obj).s0;
                if (nd3Var != null) {
                    zf8 zf8Var = (zf8) nd3Var;
                    boolean z = zf8Var.C0;
                    IMarkingClientViewModel iMarkingClientViewModel = zf8Var.r0;
                    if (z) {
                        if (iMarkingClientViewModel != null) {
                            IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_ClearAllMarkers(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            return;
                        } else {
                            im3.e0("markingClientViewModel");
                            throw null;
                        }
                    }
                    if (iMarkingClientViewModel != null) {
                        IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_ClearParticipantMarkers(iMarkingClientViewModel.n, iMarkingClientViewModel);
                        return;
                    } else {
                        im3.e0("markingClientViewModel");
                        throw null;
                    }
                }
                return;
        }
    }
}
