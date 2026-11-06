package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n45 {
    public static final n45 m;
    public static final n45 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n45[] f1538o;

    static {
        n45 n45Var = new n45("Width", 0);
        m = n45Var;
        n45 n45Var2 = new n45("Height", 1);
        n = n45Var2;
        f1538o = new n45[]{n45Var, n45Var2};
    }

    public static n45 valueOf(String str) {
        return (n45) Enum.valueOf(n45.class, str);
    }

    public static n45[] values() {
        return (n45[]) f1538o.clone();
    }
}
