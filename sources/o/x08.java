package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x08 {
    public static final x08 m;
    public static final x08 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x08[] f2466o;

    static {
        x08 x08Var = new x08("DEFERRED", 0);
        m = x08Var;
        x08 x08Var2 = new x08("IMMEDIATE", 1);
        n = x08Var2;
        f2466o = new x08[]{x08Var, x08Var2, new x08("EXCLUSIVE", 2)};
    }

    public static x08 valueOf(String str) {
        return (x08) Enum.valueOf(x08.class, str);
    }

    public static x08[] values() {
        return (x08[]) f2466o.clone();
    }
}
