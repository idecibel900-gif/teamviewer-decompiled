package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yu7 {
    public static final yu7 m;
    public static final yu7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yu7 f2646o;
    public static final /* synthetic */ yu7[] p;

    static {
        yu7 yu7Var = new yu7("Primary", 0);
        m = yu7Var;
        yu7 yu7Var2 = new yu7("Secondary", 1);
        n = yu7Var2;
        yu7 yu7Var3 = new yu7("Tertiary", 2);
        f2646o = yu7Var3;
        p = new yu7[]{yu7Var, yu7Var2, yu7Var3};
    }

    public static yu7 valueOf(String str) {
        return (yu7) Enum.valueOf(yu7.class, str);
    }

    public static yu7[] values() {
        return (yu7[]) p.clone();
    }
}
