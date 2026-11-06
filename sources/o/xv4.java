package o;

import android.os.Process;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class xv4 extends Thread {
    public final /* synthetic */ ep3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv4(ep3 ep3Var) {
        super("MultimediaManager thread");
        this.m = ep3Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        ak7 ak7Var;
        Exception e;
        ep3 ep3Var = this.m;
        ye4.a("MultimediaManager", "MultimediaManager thread started");
        Process.setThreadPriority(-19);
        while (!isInterrupted()) {
            ak7 ak7Var2 = null;
            try {
                try {
                    ak7Var = (ak7) ((LinkedBlockingQueue) ep3Var.n).take();
                    try {
                        try {
                            ep3Var.r(ak7Var);
                            if (ak7Var != null) {
                                ak7Var.k();
                            }
                        } catch (Throwable th) {
                            th = th;
                            ak7Var2 = ak7Var;
                            if (ak7Var2 != null) {
                                ak7Var2.k();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        ak7Var2 = ak7Var;
                        ye4.a("MultimediaManager", "MultimediaManager thread interrupt");
                        interrupt();
                        if (ak7Var2 != null) {
                            ak7Var2.k();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ye4.c("MultimediaManager", "caught exception when processing multimedia data: " + e.getMessage());
                        if (ak7Var != null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (InterruptedException unused2) {
            } catch (Exception e3) {
                ak7Var = null;
                e = e3;
            }
        }
        ye4.a("MultimediaManager", "MultimediaManager thread ending");
    }
}
