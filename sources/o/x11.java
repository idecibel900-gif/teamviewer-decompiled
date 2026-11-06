package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x11 {
    public static final x11 m;
    public static final x11 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x11[] f2468o;

    static {
        x11 x11Var = new x11("APPROVED", 0);
        m = x11Var;
        x11 x11Var2 = new x11("DENIED", 1);
        n = x11Var2;
        f2468o = new x11[]{x11Var, x11Var2};
    }

    public static x11 valueOf(String str) {
        return (x11) Enum.valueOf(x11.class, str);
    }

    public static x11[] values() {
        return (x11[]) f2468o.clone();
    }
}
