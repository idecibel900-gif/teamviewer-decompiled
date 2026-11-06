package o;

import android.content.Context;
import com.teamviewer.commonresourcelib.swig.DefaultMessageViewModel;
import com.teamviewer.commonresourcelib.swig.MessageDataSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jz6 extends MessageDataSignalCallbackImpl {
    public jz6() {
        super.swigReleaseOwnership();
    }

    @Override // com.teamviewer.commonresourcelib.swig.MessageDataSignalCallback
    public final void OnCallback(DefaultMessageViewModel defaultMessageViewModel) {
        String strGetText = defaultMessageViewModel != null ? defaultMessageViewModel.GetText() : null;
        if (strGetText == null || strGetText.length() == 0) {
            return;
        }
        ye4.a("ShowToastMessageDataCallback", "Received message. Showing toast.");
        Context context = d82.M;
        if (context != null) {
            d82.u(context, strGetText);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }
}
