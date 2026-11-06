package o;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ AndroidComposeView n;

    public /* synthetic */ ng(AndroidComposeView androidComposeView, byte b) {
        this.m = b;
        this.n = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        AndroidComposeView androidComposeView = this.n;
        switch (b) {
            case 0:
                kw kwVar = androidComposeView.u;
                Class cls = AndroidComposeView.U0;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!kwVar.isEmpty()) {
                    try {
                        ((Function0) kwVar.removeLast()).a();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                androidComposeView.J0 = false;
                MotionEvent motionEvent = androidComposeView.z0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.H(motionEvent);
                    return;
                } else {
                    hk0.l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
            default:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
        }
    }
}
