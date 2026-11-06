package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sl7 {
    public static final sl7 m;
    public static final sl7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sl7 f2030o;
    public static final sl7 p;
    public static final sl7 q;
    public static final /* synthetic */ sl7[] r;

    /* JADX INFO: Fake field, exist only in values array */
    sl7 EF0;

    static {
        sl7 sl7Var = new sl7("None", 0);
        sl7 sl7Var2 = new sl7("Action", 1);
        m = sl7Var2;
        sl7 sl7Var3 = new sl7("Info", 2);
        n = sl7Var3;
        sl7 sl7Var4 = new sl7("Error", 3);
        f2030o = sl7Var4;
        sl7 sl7Var5 = new sl7("Success", 4);
        sl7 sl7Var6 = new sl7("Offline", 5);
        p = sl7Var6;
        sl7 sl7Var7 = new sl7("Warning", 6);
        q = sl7Var7;
        r = new sl7[]{sl7Var, sl7Var2, sl7Var3, sl7Var4, sl7Var5, sl7Var6, sl7Var7, new sl7("Danger", 7), new sl7("Disabled", 8)};
    }

    public static sl7 valueOf(String str) {
        return (sl7) Enum.valueOf(sl7.class, str);
    }

    public static sl7[] values() {
        return (sl7[]) r.clone();
    }
}
