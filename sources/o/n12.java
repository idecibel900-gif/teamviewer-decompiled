package o;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n12 implements Executor {
    public static final n12 m;
    public static final /* synthetic */ n12[] n;

    static {
        n12 n12Var = new n12("INSTANCE", 0);
        m = n12Var;
        n = new n12[]{n12Var};
    }

    public static n12 valueOf(String str) {
        return (n12) Enum.valueOf(n12.class, str);
    }

    public static n12[] values() {
        return (n12[]) n.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
