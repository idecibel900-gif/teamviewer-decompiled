package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mz3 {
    public static final mz3 m;
    public static final mz3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mz3 f1525o;
    public static final /* synthetic */ mz3[] p;

    static {
        mz3 mz3Var = new mz3("RUNTIME", 0);
        m = mz3Var;
        mz3 mz3Var2 = new mz3("BINARY", 1);
        n = mz3Var2;
        mz3 mz3Var3 = new mz3("SOURCE", 2);
        f1525o = mz3Var3;
        p = new mz3[]{mz3Var, mz3Var2, mz3Var3};
    }

    public static mz3 valueOf(String str) {
        return (mz3) Enum.valueOf(mz3.class, str);
    }

    public static mz3[] values() {
        return (mz3[]) p.clone();
    }
}
