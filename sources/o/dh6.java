package o;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class dh6 implements Runnable {
    public final /* synthetic */ byte m;
    public final Runnable n;

    public /* synthetic */ dh6(Runnable runnable, byte b) {
        this.m = b;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                try {
                    this.n.run();
                } catch (Exception e) {
                    ep1.p("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            default:
                Process.setThreadPriority(0);
                this.n.run();
                break;
        }
    }
}
