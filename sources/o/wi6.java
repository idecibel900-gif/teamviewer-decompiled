package o;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi6 {
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();

    public static void a() {
        a.poll();
    }

    public static void b(fc3 fc3Var) {
        ye4.a("SchedulePendingConnectionHelper", "connection scheduled");
        a.offer(fc3Var);
    }
}
