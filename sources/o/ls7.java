package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ls7 {
    public static final ls7 m;
    public static final ls7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ls7 f1401o;
    public static final ls7 p;
    public static final /* synthetic */ ls7[] q;

    static {
        ls7 ls7Var = new ls7("StartInput", 0);
        m = ls7Var;
        ls7 ls7Var2 = new ls7("StopInput", 1);
        n = ls7Var2;
        ls7 ls7Var3 = new ls7("ShowKeyboard", 2);
        f1401o = ls7Var3;
        ls7 ls7Var4 = new ls7("HideKeyboard", 3);
        p = ls7Var4;
        q = new ls7[]{ls7Var, ls7Var2, ls7Var3, ls7Var4};
    }

    public static ls7 valueOf(String str) {
        return (ls7) Enum.valueOf(ls7.class, str);
    }

    public static ls7[] values() {
        return (ls7[]) q.clone();
    }
}
