package o;

import android.content.Context;
import com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallbackImpl;
import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public final class pi5 extends AccountLoginStateChangedSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ li5 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ pi5(li5 li5Var, Context context, byte b) {
        this.a = b;
        this.b = li5Var;
        this.c = context;
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallback
    public final void OnCallback(LoginState loginState) {
        byte b = this.a;
        Context context = this.c;
        li5 li5Var = this.b;
        switch (b) {
            case 0:
                if (LoginState.LoggedIn == loginState) {
                    li5Var.b(context);
                }
                break;
            default:
                if (LoginState.ReadyForLogin == loginState) {
                    li5Var.b(context);
                }
                break;
        }
    }
}
