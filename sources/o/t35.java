package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t35 {
    public static final t35 m;
    public static final t35 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t35 f2077o;
    public static final t35 p;
    public static final t35 q;
    public static final t35 r;
    public static final t35 s;
    public static final t35 t;
    public static final /* synthetic */ t35[] u;

    /* JADX INFO: Fake field, exist only in values array */
    t35 EF1;

    static {
        t35 t35Var = new t35("FROM_IDE", 0);
        t35 t35Var2 = new t35("FROM_BACKEND", 1);
        t35 t35Var3 = new t35("FROM_TEST", 2);
        t35 t35Var4 = new t35("FROM_BUILTINS", 3);
        m = t35Var4;
        t35 t35Var5 = new t35("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        t35 t35Var6 = new t35("WHEN_CHECK_OVERRIDES", 5);
        t35 t35Var7 = new t35("FOR_SCRIPT", 6);
        t35 t35Var8 = new t35("FROM_REFLECTION", 7);
        n = t35Var8;
        t35 t35Var9 = new t35("WHEN_RESOLVE_DECLARATION", 8);
        t35 t35Var10 = new t35("WHEN_GET_DECLARATION_SCOPE", 9);
        t35 t35Var11 = new t35("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        t35 t35Var12 = new t35("FOR_ALREADY_TRACKED", 11);
        f2077o = t35Var12;
        t35 t35Var13 = new t35("WHEN_GET_ALL_DESCRIPTORS", 12);
        p = t35Var13;
        t35 t35Var14 = new t35("WHEN_TYPING", 13);
        t35 t35Var15 = new t35("WHEN_GET_SUPER_MEMBERS", 14);
        q = t35Var15;
        t35 t35Var16 = new t35("FOR_NON_TRACKED_SCOPE", 15);
        r = t35Var16;
        t35 t35Var17 = new t35("FROM_SYNTHETIC_SCOPE", 16);
        t35 t35Var18 = new t35("FROM_DESERIALIZATION", 17);
        s = t35Var18;
        t35 t35Var19 = new t35("FROM_JAVA_LOADER", 18);
        t = t35Var19;
        u = new t35[]{t35Var, t35Var2, t35Var3, t35Var4, t35Var5, t35Var6, t35Var7, t35Var8, t35Var9, t35Var10, t35Var11, t35Var12, t35Var13, t35Var14, t35Var15, t35Var16, t35Var17, t35Var18, t35Var19, new t35("WHEN_GET_LOCAL_VARIABLE", 19), new t35("WHEN_FIND_BY_FQNAME", 20), new t35("WHEN_GET_COMPANION_OBJECT", 21), new t35("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static t35 valueOf(String str) {
        return (t35) Enum.valueOf(t35.class, str);
    }

    public static t35[] values() {
        return (t35[]) u.clone();
    }
}
