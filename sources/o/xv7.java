package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xv7 {
    public static final xv7 m;
    public static final xv7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xv7 f2554o;
    public static final /* synthetic */ xv7[] p;

    static {
        xv7 xv7Var = new xv7("On", 0);
        m = xv7Var;
        xv7 xv7Var2 = new xv7("Off", 1);
        n = xv7Var2;
        xv7 xv7Var3 = new xv7("Indeterminate", 2);
        f2554o = xv7Var3;
        p = new xv7[]{xv7Var, xv7Var2, xv7Var3};
    }

    public static xv7 valueOf(String str) {
        return (xv7) Enum.valueOf(xv7.class, str);
    }

    public static xv7[] values() {
        return (xv7[]) p.clone();
    }
}
