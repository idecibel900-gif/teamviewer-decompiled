package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hi5 {
    public static final hi5 m;
    public static final hi5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ hi5[] f975o;

    /* JADX INFO: Fake field, exist only in values array */
    hi5 EF0;

    static {
        hi5 hi5Var = new hi5("Invalid", 0);
        hi5 hi5Var2 = new hi5("BuddyId", 1);
        m = hi5Var2;
        hi5 hi5Var3 = new hi5("SessionId", 2);
        n = hi5Var3;
        f975o = new hi5[]{hi5Var, hi5Var2, hi5Var3};
    }

    public static hi5 valueOf(String str) {
        return (hi5) Enum.valueOf(hi5.class, str);
    }

    public static hi5[] values() {
        return (hi5[]) f975o.clone();
    }
}
