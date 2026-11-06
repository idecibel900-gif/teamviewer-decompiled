package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l71 {
    public static final l71 m;
    public static final l71 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l71 f1335o;
    public static final l71 p;
    public static final /* synthetic */ l71[] q;

    static {
        l71 l71Var = new l71("ALL", 0);
        m = l71Var;
        l71 l71Var2 = new l71("PERSONAL", 1);
        n = l71Var2;
        l71 l71Var3 = new l71("COMPANY", 2);
        f1335o = l71Var3;
        l71 l71Var4 = new l71("INVITATION", 3);
        p = l71Var4;
        q = new l71[]{l71Var, l71Var2, l71Var3, l71Var4};
    }

    public static l71 valueOf(String str) {
        return (l71) Enum.valueOf(l71.class, str);
    }

    public static l71[] values() {
        return (l71[]) q.clone();
    }
}
