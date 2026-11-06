package o;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class et8 implements Executor {
    public static final et8 m;
    public static final /* synthetic */ et8[] n;

    static {
        et8 et8Var = new et8("INSTANCE", 0);
        m = et8Var;
        n = new et8[]{et8Var};
    }

    public static et8[] values() {
        return (et8[]) n.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
