package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l74 {
    public static final l74 m;
    public static final l74 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l74 f1336o;
    public static final l74 p;
    public static final /* synthetic */ l74[] q;

    static {
        l74 l74Var = new l74("Source", 0);
        m = l74Var;
        l74 l74Var2 = new l74("Website", 1);
        n = l74Var2;
        l74 l74Var3 = new l74("Sponsor", 2);
        f1336o = l74Var3;
        l74 l74Var4 = new l74("License", 3);
        p = l74Var4;
        q = new l74[]{l74Var, l74Var2, l74Var3, l74Var4};
    }

    public static l74 valueOf(String str) {
        return (l74) Enum.valueOf(l74.class, str);
    }

    public static l74[] values() {
        return (l74[]) q.clone();
    }
}
