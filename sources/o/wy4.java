package o;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class wy4 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final ThreadFactory b;
    public final Serializable c;

    public wy4(c60 c60Var) {
        this.a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        ThreadFactory threadFactory = this.b;
        Serializable serializable = this.c;
        switch (b) {
            case 0:
                Thread threadNewThread = threadFactory.newThread(new dh6(runnable, (byte) 1));
                threadNewThread.setName((String) serializable);
                return threadNewThread;
            default:
                Thread threadNewThread2 = threadFactory.newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
                return threadNewThread2;
        }
    }

    public wy4(String str) {
        this.a = (byte) 0;
        this.b = Executors.defaultThreadFactory();
        nv1.t(str, "Name must not be null");
        this.c = str;
    }
}
