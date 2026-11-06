package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qs8 {
    public static final qs8 d = new qs8();
    public final Runnable a;
    public final Executor b;
    public qs8 c;

    public qs8() {
        this.a = null;
        this.b = null;
    }

    public qs8(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
