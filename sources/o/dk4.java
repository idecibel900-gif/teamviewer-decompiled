package o;

import com.teamviewer.chatviewmodel.swig.ErrorMessage;
import com.teamviewer.chatviewmodel.swig.ErrorMessageSignalCallbackImpl;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class dk4 extends ErrorMessageSignalCallbackImpl {
    public final /* synthetic */ MainActivity a;

    public dk4(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // com.teamviewer.chatviewmodel.swig.ErrorMessageSignalCallback
    public final void OnCallback(ErrorMessage errorMessage) {
        String string;
        int i = errorMessage == null ? -1 : ck4.a[errorMessage.ordinal()];
        MainActivity mainActivity = this.a;
        if (i == 1) {
            string = mainActivity.getString(R.string.tv_IDS_CANT_CHAT_OFFLINE_MACHINE);
        } else if (i == 2) {
            string = mainActivity.getString(R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS);
        } else if (i != 3) {
            return;
        } else {
            string = mainActivity.getString(R.string.tv_IDS_CANT_CHAT_WHILE_OWN_ACCOUNT);
        }
        string.getClass();
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.L0(string);
        gk7Var.O0 = R.string.tv_ok;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        gk7.O0(gk7Var, mainActivity);
    }
}
