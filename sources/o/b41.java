package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b41 {
    public static final b41 m;
    public static final b41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b41 f389o;
    public static final b41 p;
    public static final b41 q;
    public static final b41 r;
    public static final b41 s;
    public static final /* synthetic */ b41[] t;

    static {
        b41 b41Var = new b41("Contact", 0);
        m = b41Var;
        b41 b41Var2 = new b41("LegacyDevice", 1);
        n = b41Var2;
        b41 b41Var3 = new b41("ManagedDevice", 2);
        f389o = b41Var3;
        b41 b41Var4 = new b41("RecentConnection", 3);
        p = b41Var4;
        b41 b41Var5 = new b41("ManagedGroup", 4);
        q = b41Var5;
        b41 b41Var6 = new b41("LegacyGroup", 5);
        r = b41Var6;
        b41 b41Var7 = new b41("Unknown", 6);
        s = b41Var7;
        t = new b41[]{b41Var, b41Var2, b41Var3, b41Var4, b41Var5, b41Var6, b41Var7};
    }

    public static b41 valueOf(String str) {
        return (b41) Enum.valueOf(b41.class, str);
    }

    public static b41[] values() {
        return (b41[]) t.clone();
    }
}
