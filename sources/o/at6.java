package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class at6 {
    public static final at6 m;
    public static final at6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final at6 f361o;
    public static final /* synthetic */ at6[] p;

    /* JADX INFO: Fake field, exist only in values array */
    at6 EF0;

    static {
        at6 at6Var = new at6("Undefined", 0);
        at6 at6Var2 = new at6("Ok", 1);
        m = at6Var2;
        at6 at6Var3 = new at6("Error", 2);
        n = at6Var3;
        at6 at6Var4 = new at6("Cancel", 3);
        f361o = at6Var4;
        p = new at6[]{at6Var, at6Var2, at6Var3, at6Var4};
    }

    public static at6 valueOf(String str) {
        return (at6) Enum.valueOf(at6.class, str);
    }

    public static at6[] values() {
        return (at6[]) p.clone();
    }
}
