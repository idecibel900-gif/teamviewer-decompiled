package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eh6 implements Executor {
    public final /* synthetic */ byte m;
    public final Object n;

    public eh6() {
        this.m = (byte) 2;
        xp8 xp8Var = new xp8(Looper.getMainLooper());
        Looper.getMainLooper();
        this.n = xp8Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((Executor) obj).execute(new dh6(runnable, (byte) 0));
                break;
            case 1:
                ((Handler) ((yc4) obj).p).post(runnable);
                break;
            default:
                ((xp8) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ eh6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
