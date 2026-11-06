package o;

import com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallbackImpl;
import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public abstract class uf4 extends AccountLoginStateChangedSignalCallbackImpl {
    public uf4() {
        super.swigReleaseOwnership();
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallback
    public final void OnCallback(LoginState loginState) {
        a(loginState);
        super.swigTakeOwnership();
    }

    public abstract void a(LoginState loginState);
}
