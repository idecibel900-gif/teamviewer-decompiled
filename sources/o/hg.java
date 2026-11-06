package o;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ AndroidComposeView n;

    public /* synthetic */ hg(AndroidComposeView androidComposeView, byte b) {
        this.m = b;
        this.n = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        AndroidComposeView androidComposeView = this.n;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.U0;
                return new xj(androidComposeView, androidComposeView.getTextInputService(), (me1) obj);
            case 1:
                Function0 function0 = (Function0) obj;
                Class cls2 = AndroidComposeView.U0;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.a();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new lg(function0, (byte) 0));
                    }
                }
                return f88Var;
            case 2:
                Class cls3 = AndroidComposeView.U0;
                ((lq2) androidComposeView.getFocusOwner()).h(((wp2) obj).a, false);
                return f88Var;
            case 3:
                return androidComposeView.getSavedStateRegistry();
            default:
                return Boolean.valueOf(androidComposeView.getScrollCaptureInProgress());
        }
    }
}
