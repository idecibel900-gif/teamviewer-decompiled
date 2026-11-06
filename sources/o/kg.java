package o;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg implements Executor {
    public final /* synthetic */ AndroidComposeView m;

    public /* synthetic */ kg(AndroidComposeView androidComposeView) {
        this.m = androidComposeView;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Class cls = AndroidComposeView.U0;
        AndroidComposeView outOfFrameExecutor = this.m.getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.E(new m9(0, runnable, Runnable.class, "run", "run()V", 0, (byte) 6));
        }
    }
}
