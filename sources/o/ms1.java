package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 {
    public static final ms1 m;
    public static final ms1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ms1[] f1502o;

    static {
        ms1 ms1Var = new ms1("MobileWake", 0);
        m = ms1Var;
        ms1 ms1Var2 = new ms1("WakeOnLan", 1);
        n = ms1Var2;
        f1502o = new ms1[]{ms1Var, ms1Var2};
    }

    public static ms1 valueOf(String str) {
        return (ms1) Enum.valueOf(ms1.class, str);
    }

    public static ms1[] values() {
        return (ms1[]) f1502o.clone();
    }
}
