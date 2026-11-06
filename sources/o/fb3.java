package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fb3 {
    public static final fb3 m;
    public static final fb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final fb3 f784o;
    public static final fb3 p;
    public static final /* synthetic */ fb3[] q;

    static {
        fb3 fb3Var = new fb3("ShiftKey", 0);
        m = fb3Var;
        fb3 fb3Var2 = new fb3("CtrlKey", 1);
        n = fb3Var2;
        fb3 fb3Var3 = new fb3("AltKey", 2);
        f784o = fb3Var3;
        fb3 fb3Var4 = new fb3("WinKey", 3);
        p = fb3Var4;
        q = new fb3[]{fb3Var, fb3Var2, fb3Var3, fb3Var4};
    }

    public static fb3 valueOf(String str) {
        return (fb3) Enum.valueOf(fb3.class, str);
    }

    public static fb3[] values() {
        return (fb3[]) q.clone();
    }
}
