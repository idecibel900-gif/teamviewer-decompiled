package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dm3 {
    public static final dm3 m;
    public static final dm3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ dm3[] f636o;

    static {
        dm3 dm3Var = new dm3("Min", 0);
        m = dm3Var;
        dm3 dm3Var2 = new dm3("Max", 1);
        n = dm3Var2;
        f636o = new dm3[]{dm3Var, dm3Var2};
    }

    public static dm3 valueOf(String str) {
        return (dm3) Enum.valueOf(dm3.class, str);
    }

    public static dm3[] values() {
        return (dm3[]) f636o.clone();
    }
}
