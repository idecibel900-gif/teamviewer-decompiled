package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv implements Executor {
    public final /* synthetic */ byte m;

    public /* synthetic */ xv(byte b) {
        this.m = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                yv.u().b.c.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
