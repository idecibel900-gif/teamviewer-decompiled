package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xa3 {
    public static final xa3 m;
    public static final xa3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xa3 f2498o;
    public static final xa3 p;
    public static final /* synthetic */ xa3[] q;

    static {
        xa3 xa3Var = new xa3("LocalClose", 0);
        m = xa3Var;
        xa3 xa3Var2 = new xa3("RemoteClose", 1);
        n = xa3Var2;
        xa3 xa3Var3 = new xa3("NoPermissionsGranted", 2);
        f2498o = xa3Var3;
        xa3 xa3Var4 = new xa3("PermissionsRevokedDuringRuntime", 3);
        p = xa3Var4;
        q = new xa3[]{xa3Var, xa3Var2, xa3Var3, xa3Var4};
    }

    public static xa3 valueOf(String str) {
        return (xa3) Enum.valueOf(xa3.class, str);
    }

    public static xa3[] values() {
        return (xa3[]) q.clone();
    }
}
