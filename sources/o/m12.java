package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m12 implements Executor {
    public static final m12 n = new m12(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ m12 f1424o = new m12(2);
    public static final /* synthetic */ m12 p = new m12(3);
    public final /* synthetic */ byte m;

    public /* synthetic */ m12(byte b) {
        this.m = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
