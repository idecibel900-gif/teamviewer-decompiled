package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ei8 {
    public static final ei8 m;
    public static final ei8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ei8 f717o;
    public static final ei8 p;
    public static final ei8 q;
    public static final /* synthetic */ ei8[] r;

    static {
        ei8 ei8Var = new ei8("SUCCESS", 0);
        m = ei8Var;
        ei8 ei8Var2 = new ei8("GENERIC_ERROR", 1);
        n = ei8Var2;
        ei8 ei8Var3 = new ei8("ACCOUNT_DEVICE_LIMIT_EXCEEDED", 2);
        f717o = ei8Var3;
        ei8 ei8Var4 = new ei8("ACTIVATION_EXPIRED", 3);
        p = ei8Var4;
        ei8 ei8Var5 = new ei8("WRONG_EMAIL_OR_PASSWORD", 4);
        q = ei8Var5;
        r = new ei8[]{ei8Var, ei8Var2, ei8Var3, ei8Var4, ei8Var5};
    }

    public static ei8 valueOf(String str) {
        return (ei8) Enum.valueOf(ei8.class, str);
    }

    public static ei8[] values() {
        return (ei8[]) r.clone();
    }
}
