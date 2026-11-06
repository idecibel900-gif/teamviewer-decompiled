package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rr6 {
    public static final rr6 m;
    public static final rr6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final rr6 f1944o;
    public static final rr6 p;
    public static final /* synthetic */ rr6[] q;

    static {
        rr6 rr6Var = new rr6("ASCENDING", 0);
        m = rr6Var;
        rr6 rr6Var2 = new rr6("DESCENDING", 1);
        n = rr6Var2;
        rr6 rr6Var3 = new rr6("USER_WAITING", 2);
        f1944o = rr6Var3;
        rr6 rr6Var4 = new rr6("USER_NOT_JOINED", 3);
        p = rr6Var4;
        q = new rr6[]{rr6Var, rr6Var2, rr6Var3, rr6Var4};
    }

    public static rr6 valueOf(String str) {
        return (rr6) Enum.valueOf(rr6.class, str);
    }

    public static rr6[] values() {
        return (rr6[]) q.clone();
    }
}
