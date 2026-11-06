package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i42 {
    public static final i42 m;
    public static final i42 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i42 f1034o;
    public static final /* synthetic */ i42[] p;

    static {
        i42 i42Var = new i42("Yes", 0);
        m = i42Var;
        i42 i42Var2 = new i42("No", 1);
        n = i42Var2;
        i42 i42Var3 = new i42("NotInitialized", 2);
        f1034o = i42Var3;
        p = new i42[]{i42Var, i42Var2, i42Var3};
    }

    public static i42 valueOf(String str) {
        return (i42) Enum.valueOf(i42.class, str);
    }

    public static i42[] values() {
        return (i42[]) p.clone();
    }
}
