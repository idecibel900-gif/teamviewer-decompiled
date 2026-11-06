package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l54 {
    public static final l54 m;
    public static final l54 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ l54[] f1330o;

    /* JADX INFO: Fake field, exist only in values array */
    l54 EF0;

    static {
        l54 l54Var = new l54("SYNCHRONIZED", 0);
        l54 l54Var2 = new l54("PUBLICATION", 1);
        m = l54Var2;
        l54 l54Var3 = new l54("NONE", 2);
        n = l54Var3;
        f1330o = new l54[]{l54Var, l54Var2, l54Var3};
    }

    public static l54 valueOf(String str) {
        return (l54) Enum.valueOf(l54.class, str);
    }

    public static l54[] values() {
        return (l54[]) f1330o.clone();
    }
}
