package o;

import com.teamviewer.swigcallbacklib.IntSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class wf8 extends IntSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zf8 b;

    public /* synthetic */ wf8(zf8 zf8Var, byte b) {
        this.a = b;
        this.b = zf8Var;
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalCallback
    public final void OnCallback(int i) {
        byte b = this.a;
        zf8 zf8Var = this.b;
        switch (b) {
            case 0:
                zf8Var.E0(i, R.string.remote_app_in_background);
                break;
            default:
                zf8Var.E0(i, R.string.tv_message_TcpReconnectStarted);
                break;
        }
    }
}
