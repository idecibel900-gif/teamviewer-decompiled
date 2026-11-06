package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ye6 {
    public static final ye6 m;
    public static final ye6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ye6[] f2602o;

    /* JADX INFO: Fake field, exist only in values array */
    ye6 EF0;

    static {
        ye6 ye6Var = new ye6("AUTOMATIC", 0);
        ye6 ye6Var2 = new ye6("TRUNCATE", 1);
        m = ye6Var2;
        ye6 ye6Var3 = new ye6("WRITE_AHEAD_LOGGING", 2);
        n = ye6Var3;
        f2602o = new ye6[]{ye6Var, ye6Var2, ye6Var3};
    }

    public static ye6 valueOf(String str) {
        return (ye6) Enum.valueOf(ye6.class, str);
    }

    public static ye6[] values() {
        return (ye6[]) f2602o.clone();
    }
}
