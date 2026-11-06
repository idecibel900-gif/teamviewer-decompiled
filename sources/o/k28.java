package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k28 {
    public static final k28 m;
    public static final k28 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k28 f1225o;
    public static final /* synthetic */ k28[] p;

    static {
        k28 k28Var = new k28("ContinueTraversal", 0);
        m = k28Var;
        k28 k28Var2 = new k28("SkipSubtreeAndContinueTraversal", 1);
        n = k28Var2;
        k28 k28Var3 = new k28("CancelTraversal", 2);
        f1225o = k28Var3;
        p = new k28[]{k28Var, k28Var2, k28Var3};
    }

    public static k28 valueOf(String str) {
        return (k28) Enum.valueOf(k28.class, str);
    }

    public static k28[] values() {
        return (k28[]) p.clone();
    }
}
