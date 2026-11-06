package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b12 {
    public static final b12 m;
    public static final b12 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b12 f382o;
    public static final b12 p;
    public static final b12 q;
    public static final /* synthetic */ b12[] r;

    static {
        b12 b12Var = new b12("Empty", 0);
        m = b12Var;
        b12 b12Var2 = new b12("NotificationChannel", 1);
        n = b12Var2;
        b12 b12Var3 = new b12("BackgroundDataAccess", 2);
        f382o = b12Var3;
        b12 b12Var4 = new b12("DeleteCompanyAccountError", 3);
        p = b12Var4;
        b12 b12Var5 = new b12("ConfirmAccountDeletion", 4);
        q = b12Var5;
        r = new b12[]{b12Var, b12Var2, b12Var3, b12Var4, b12Var5};
    }

    public static b12 valueOf(String str) {
        return (b12) Enum.valueOf(b12.class, str);
    }

    public static b12[] values() {
        return (b12[]) r.clone();
    }
}
