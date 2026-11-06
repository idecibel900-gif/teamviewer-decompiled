package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class ji4 extends FutureTask {
    public ki4 m;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.m.d((ii4) get());
            } catch (InterruptedException | ExecutionException e) {
                this.m.d(new ii4(e));
            }
        } finally {
            this.m = null;
        }
    }
}
