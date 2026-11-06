package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class fj implements Executor {
    public final /* synthetic */ byte m;
    public final Handler n;

    public fj(byte b) {
        this.m = b;
        switch (b) {
            case 1:
                this.n = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.n = new Handler(Looper.getMainLooper());
                break;
            default:
                this.n = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.m;
        Handler handler = this.n;
        switch (b) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                handler.post(runnable);
                return;
            case 3:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 4:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ fj(Handler handler, byte b) {
        this.m = b;
        this.n = handler;
    }
}
