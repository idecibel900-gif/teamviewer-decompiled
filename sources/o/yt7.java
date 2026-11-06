package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class yt7 implements zt7 {
    public static final ExecutorService m = Executors.newCachedThreadPool();

    @Override // o.zt7
    public final Future submit(Runnable runnable) {
        Future<?> futureSubmit = m.submit(runnable);
        futureSubmit.getClass();
        return futureSubmit;
    }
}
