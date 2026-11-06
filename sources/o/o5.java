package o;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModel;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j6 n;

    public /* synthetic */ o5(j6 j6Var, byte b) {
        this.m = b;
        this.n = j6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        byte b2 = 3;
        byte b3 = 0;
        b12 b12Var = b12.m;
        f88 f88Var = f88.a;
        j6 j6Var = this.n;
        switch (b) {
            case 0:
                ye4.a("AccountViewModel", "Sign out via account settings");
                LogoutViewModel logoutViewModel = j6Var.p;
                d82 d82Var = j6Var.t;
                o5 o5Var = new o5(j6Var, (byte) 8);
                f6 f6Var = new f6(j6Var, b2);
                d82Var.getClass();
                l6 l6Var = new l6(o5Var, f6Var, (byte) 0);
                LogoutViewModelSWIGJNI.LogoutViewModel_LogOut(logoutViewModel.c, logoutViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var), l6Var);
                break;
            case 1:
                j6Var.X0(b12Var);
                break;
            case 2:
                j6Var.X0(b12Var);
                break;
            case 3:
                j6Var.X0(b12Var);
                break;
            case 4:
                DeleteAccountViewModel deleteAccountViewModel = j6Var.q;
                d82 d82Var2 = j6Var.t;
                o5 o5Var2 = new o5(j6Var, (byte) 6);
                f6 f6Var2 = new f6(j6Var, b3);
                d82Var2.getClass();
                l6 l6Var2 = new l6(o5Var2, f6Var2, (byte) 0);
                DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_DeleteAccount(deleteAccountViewModel.c, deleteAccountViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var2), l6Var2);
                j6Var.X0(b12Var);
                break;
            case 5:
                j6Var.X0(b12Var);
                break;
            case 6:
                im3.R(e8.n(j6Var), null, null, new i6(j6Var, null, (byte) 2), 3);
                break;
            case 7:
                j6Var.Y0(new f6(j6Var, (byte) 4));
                break;
            default:
                ye4.a("AccountViewModel", "Successfully signed out");
                PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = j6Var.s;
                if (pLManagerGroupsListV2ViewModel != null) {
                    PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_CleanUp(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel);
                }
                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = j6Var.r;
                if (pLManagerDevicesV2ViewModel != null) {
                    PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_CleanUp(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel);
                }
                break;
        }
        return f88Var;
    }
}
