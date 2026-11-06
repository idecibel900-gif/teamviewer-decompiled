package o;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l12 implements Executor {
    public static final l12 m;
    public static final /* synthetic */ l12[] n;

    static {
        l12 l12Var = new l12("INSTANCE", 0);
        m = l12Var;
        n = new l12[]{l12Var};
    }

    public static l12 valueOf(String str) {
        return (l12) Enum.valueOf(l12.class, str);
    }

    public static l12[] values() {
        return (l12[]) n.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
