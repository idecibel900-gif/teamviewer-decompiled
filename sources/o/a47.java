package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a47 {
    public static final a47 m;
    public static final a47 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a47 f296o;
    public static final a47 p;
    public static final a47 q;
    public static final /* synthetic */ a47[] r;

    static {
        a47 a47Var = new a47("SESSION_REMOVED", 0);
        m = a47Var;
        a47 a47Var2 = new a47("LOGIN_GENERIC_ERROR", 1);
        n = a47Var2;
        a47 a47Var3 = new a47("LOGIN_ACTIVATION_EXPIRED_ERROR", 2);
        f296o = a47Var3;
        a47 a47Var4 = new a47("LOGIN_WRONG_EMAIL_OR_PASSWORD_ERROR", 3);
        p = a47Var4;
        a47 a47Var5 = new a47("LOGIN_TIMEOUT", 4);
        q = a47Var5;
        r = new a47[]{a47Var, a47Var2, a47Var3, a47Var4, a47Var5};
    }

    public static a47 valueOf(String str) {
        return (a47) Enum.valueOf(a47.class, str);
    }

    public static a47[] values() {
        return (a47[]) r.clone();
    }
}
