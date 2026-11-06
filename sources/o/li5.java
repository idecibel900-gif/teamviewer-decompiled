package o;

import android.content.Context;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.TokenLoginViewModel;
import com.teamviewer.remotecontrollib.swig.TokenLoginViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListSessionID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListSessionIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.SessionIdHelperSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class li5 implements fc3 {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Object f;

    public li5(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // o.fc3
    public final void b(Context context) {
        int i;
        TokenLoginViewModel tokenLoginViewModel;
        int i2;
        TokenLoginViewModel tokenLoginViewModel2;
        byte b = this.a;
        ye4 ye4Var = ye4.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.e;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 2;
        context.getClass();
        switch (b) {
            case 0:
                if (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || str3 == null || str3.length() == 0) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(str3);
                        if (i <= 0) {
                            ye4Var.g("PendingConnectionTv8Scheme", "Tried to use token login with v1 account. Account cannot be logged in!");
                            i = -1;
                        }
                    } catch (NumberFormatException unused) {
                        ye4.c("PendingConnectionTv8Scheme", "checkAccount: invalid tokenId");
                    }
                }
                if (i >= 0) {
                    long jAccountViewModelFactory_GetTokenLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetTokenLoginViewModel();
                    if (jAccountViewModelFactory_GetTokenLoginViewModel == 0) {
                        tokenLoginViewModel = null;
                    } else {
                        tokenLoginViewModel = new TokenLoginViewModel(TokenLoginViewModelSWIGJNI.TokenLoginViewModel_SWIGSmartPtrUpcast(jAccountViewModelFactory_GetTokenLoginViewModel));
                        tokenLoginViewModel.d = true;
                        tokenLoginViewModel.c = jAccountViewModelFactory_GetTokenLoginViewModel;
                    }
                    tokenLoginViewModel.getClass();
                    LoginState loginStateA = tokenLoginViewModel.a();
                    int i3 = loginStateA == null ? -1 : ii5.a[loginStateA.ordinal()];
                    if (i3 == 1) {
                        vy2 vy2Var = new vy2(tokenLoginViewModel, this, context);
                        TokenLoginViewModelSWIGJNI.TokenLoginViewModel_TryLogin(tokenLoginViewModel.c, tokenLoginViewModel, this.c, this.d, i, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
                    } else if (i3 == 2) {
                        if (!TokenLoginViewModelSWIGJNI.TokenLoginViewModel_IsCurrentlyLoggedIn(tokenLoginViewModel.c, tokenLoginViewModel, str2)) {
                            LogoutViewModel logoutViewModelI = di1.i();
                            l6 l6Var = new l6(this, context, b4);
                            LogoutViewModelSWIGJNI.LogoutViewModel_LogOut(logoutViewModelI.c, logoutViewModelI, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var), l6Var);
                        } else {
                            d(context);
                            wi6.a();
                        }
                    } else if (i3 == 3 || i3 == 4) {
                        tokenLoginViewModel.b(new ki5(this, context, (byte) 0));
                    } else if (i3 == 5) {
                        tokenLoginViewModel.b(new ki5(this, context, (byte) 1));
                    } else {
                        ye4.c("PendingConnectionTv8Scheme", "checkForScheduledConnect(): account is in unexpected connection state!");
                    }
                } else {
                    ye4.c("PendingConnectionTv8Scheme", "checkForScheduledConnect(): connection info is not valid!");
                    wi6.a();
                }
                break;
            default:
                if (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || str3 == null || str3.length() == 0) {
                    i2 = -1;
                } else {
                    try {
                        i2 = Integer.parseInt(str3);
                        if (i2 <= 0) {
                            ye4Var.g("PendingConnectionTv8SchemeMDv2", "Tried to use token login with v1 account. Account cannot be logged in!");
                            i2 = -1;
                        }
                    } catch (NumberFormatException unused2) {
                        ye4.c("PendingConnectionTv8SchemeMDv2", "checkAccount: invalid tokenId");
                    }
                }
                if (i2 >= 0) {
                    long jAccountViewModelFactory_GetTokenLoginViewModel2 = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetTokenLoginViewModel();
                    if (jAccountViewModelFactory_GetTokenLoginViewModel2 == 0) {
                        tokenLoginViewModel2 = null;
                    } else {
                        tokenLoginViewModel2 = new TokenLoginViewModel(TokenLoginViewModelSWIGJNI.TokenLoginViewModel_SWIGSmartPtrUpcast(jAccountViewModelFactory_GetTokenLoginViewModel2));
                        tokenLoginViewModel2.d = true;
                        tokenLoginViewModel2.c = jAccountViewModelFactory_GetTokenLoginViewModel2;
                    }
                    tokenLoginViewModel2.getClass();
                    LoginState loginStateA2 = tokenLoginViewModel2.a();
                    int i4 = loginStateA2 == null ? -1 : ni5.a[loginStateA2.ordinal()];
                    if (i4 == 1) {
                        l6 l6Var2 = new l6(tokenLoginViewModel2, this, b3);
                        TokenLoginViewModelSWIGJNI.TokenLoginViewModel_TryLogin(tokenLoginViewModel2.c, tokenLoginViewModel2, this.c, this.d, i2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var2), l6Var2);
                    } else if (i4 == 2) {
                        if (!TokenLoginViewModelSWIGJNI.TokenLoginViewModel_IsCurrentlyLoggedIn(tokenLoginViewModel2.c, tokenLoginViewModel2, str2)) {
                            LogoutViewModel logoutViewModelI2 = di1.i();
                            l6 l6Var3 = new l6(this, context, b2);
                            LogoutViewModelSWIGJNI.LogoutViewModel_LogOut(logoutViewModelI2.c, logoutViewModelI2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) l6Var3), l6Var3);
                        } else {
                            c();
                            wi6.a();
                        }
                    } else if (i4 == 3 || i4 == 4) {
                        tokenLoginViewModel2.b(new pi5(this, context, (byte) 0));
                    } else if (i4 == 5) {
                        tokenLoginViewModel2.b(new pi5(this, context, (byte) 1));
                    } else {
                        ye4.c("PendingConnectionTv8SchemeMDv2", "checkForScheduledConnect(): account is in unexpected connection state!");
                    }
                } else {
                    ye4.c("PendingConnectionTv8SchemeMDv2", "checkForScheduledConnect(): connection info is not valid!");
                    wi6.a();
                }
                break;
        }
    }

    public void c() {
        String str = this.b;
        if (str.length() == 0) {
            ye4.c("PendingConnectionTv8SchemeMDv2", "Cannot connect to invalid dyngate id");
            return;
        }
        ye4.a("PendingConnectionTv8SchemeMDv2", "connectToId(): id=" + str + " type=" + mi5.m);
        String str2 = (String) this.f;
        int i = wt6.k;
        wt6 wt6VarA = vt6.a(48, str, null, str2);
        if (wt6VarA == null) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        if (!wt6VarA.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(wt6VarA);
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    public void d(Context context) {
        hi5 hi5Var = (hi5) this.f;
        StringBuilder sb = new StringBuilder("connectToId(): id=");
        String str = this.b;
        sb.append(str);
        sb.append(" type=");
        sb.append(hi5Var);
        ye4.a("PendingConnectionTv8Scheme", sb.toString());
        if (hi5.m == hi5Var) {
            long jToLong = ep1.z(str).ToLong();
            au6 au6Var = bt1.b;
            if (au6Var == null) {
                im3.e0("instance");
                throw null;
            }
            PListComputerID pListComputerID = new PListComputerID(jToLong);
            context.getClass();
            ck3.i0(pListComputerID, au6Var, context, new q0(pListComputerID, (byte) 26));
            return;
        }
        if (hi5.n != hi5Var) {
            ye4.c("PendingConnectionTv8Scheme", "Invalid connection type");
            return;
        }
        long jNew_PListSessionID = PListSessionIDSWIGJNI.new_PListSessionID(ep1.z(str).ToLong());
        PListSessionID pListSessionID = new PListSessionID();
        pListSessionID.b = true;
        pListSessionID.a = jNew_PListSessionID;
        PListDyngateID pListDyngateID = new PListDyngateID(SessionIdHelperSWIGJNI.SessionIdHelper_GetDyngateIdBySessionId(jNew_PListSessionID, pListSessionID), true);
        if (!PListDyngateIDSWIGJNI.PListDyngateID_Valid(pListDyngateID.a, pListDyngateID)) {
            ye4.c("PendingConnectionTv8Scheme", "Cannot connect to invalid dyngate id");
            return;
        }
        String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
        strPListDyngateID_GetAsString.getClass();
        ck3.h0(strPListDyngateID_GetAsString, null);
    }

    public li5(hi5 hi5Var, String str, String str2, String str3, String str4) {
        str.getClass();
        this.f = hi5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
