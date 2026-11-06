package o;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class s22 implements t22 {
    public final ScheduledFuture m;

    public s22(ScheduledFuture scheduledFuture) {
        this.m = scheduledFuture;
    }

    @Override // o.t22
    public final void a() {
        this.m.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.m + ']';
    }
}
