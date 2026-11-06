package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ha7 {
    public static final ha7 m;
    public static final ha7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ha7 f963o;
    public static final /* synthetic */ ha7[] p;

    /* JADX INFO: Fake field, exist only in values array */
    ha7 EF0;

    static {
        ha7 ha7Var = new ha7("Unknown", 0);
        ha7 ha7Var2 = new ha7("Ok", 1);
        ha7 ha7Var3 = new ha7("Error", 2);
        ha7 ha7Var4 = new ha7("Disconnected", 3);
        m = ha7Var4;
        ha7 ha7Var5 = new ha7("ClosedByUser", 4);
        ha7 ha7Var6 = new ha7("SessionTimeout", 5);
        ha7 ha7Var7 = new ha7("ConnectTimeout", 6);
        ha7 ha7Var8 = new ha7("ViewScreenDenied", 7);
        n = ha7Var8;
        ha7 ha7Var9 = new ha7("ReadOnly", 8);
        f963o = ha7Var9;
        p = new ha7[]{ha7Var, ha7Var2, ha7Var3, ha7Var4, ha7Var5, ha7Var6, ha7Var7, ha7Var8, ha7Var9};
    }

    public static ha7 valueOf(String str) {
        return (ha7) Enum.valueOf(ha7.class, str);
    }

    public static ha7[] values() {
        return (ha7[]) p.clone();
    }
}
