package o;

import com.teamviewer.commonresourcelib.swig.DefaultMessageViewModel;
import com.teamviewer.commonresourcelib.swig.MessageDataSignalCallbackImpl;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class iz6 extends MessageDataSignalCallbackImpl {
    public final u7 a;

    public iz6(u7 u7Var) {
        u7Var.getClass();
        this.a = u7Var;
        super.swigReleaseOwnership();
    }

    @Override // com.teamviewer.commonresourcelib.swig.MessageDataSignalCallback
    public final void OnCallback(DefaultMessageViewModel defaultMessageViewModel) {
        if (defaultMessageViewModel == null) {
            ye4.a("ShowDialogMessageDataCallback", "Cannot show dialog message, messageViewModel is null");
            return;
        }
        MainActivity mainActivity = this.a.c;
        if (mainActivity == null) {
            mainActivity = null;
        }
        if (mainActivity != null) {
            mainActivity.runOnUiThread(new be3(defaultMessageViewModel, mainActivity, (byte) 11));
        }
    }
}
