package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mz7 {
    public static final mz7 m;
    public static final mz7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mz7 f1527o;
    public static final /* synthetic */ mz7[] p;

    static {
        mz7 mz7Var = new mz7("Uninitialized", 0);
        m = mz7Var;
        mz7 mz7Var2 = new mz7("Detached", 1);
        n = mz7Var2;
        mz7 mz7Var3 = new mz7("Attached", 2);
        f1527o = mz7Var3;
        p = new mz7[]{mz7Var, mz7Var2, mz7Var3};
    }

    public static mz7 valueOf(String str) {
        return (mz7) Enum.valueOf(mz7.class, str);
    }

    public static mz7[] values() {
        return (mz7[]) p.clone();
    }
}
