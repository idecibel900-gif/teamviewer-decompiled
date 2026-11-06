package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface ic4 extends Future {
    void addListener(Runnable runnable, Executor executor);
}
