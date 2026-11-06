package o;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc4 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public nc4(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public kj0 a() {
        Executor executor = this.b.b;
        executor.getClass();
        return j51.H(new io.sentry.q7(executor, new j68(this, (byte) 12), (byte) 29));
    }

    public kj0 b() {
        Executor executor = this.b.b;
        executor.getClass();
        return j51.H(new io.sentry.q7(executor, new ks7(this, (byte) 10), (byte) 29));
    }
}
