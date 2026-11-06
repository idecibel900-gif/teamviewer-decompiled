package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ci3 {
    public static final ci3 m;
    public static final ci3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ci3 f529o;
    public static final /* synthetic */ ci3[] p;
    public static final /* synthetic */ jc2 q;

    static {
        ci3 ci3Var = new ci3("LOGIN_CALLBACK", 0);
        m = ci3Var;
        ci3 ci3Var2 = new ci3("MANAGED_GROUPS", 1);
        n = ci3Var2;
        ci3 ci3Var3 = new ci3("DIRECT_DEVICES", 2);
        f529o = ci3Var3;
        ci3[] ci3VarArr = {ci3Var, ci3Var2, ci3Var3};
        p = ci3VarArr;
        q = new jc2(ci3VarArr);
    }

    public static ci3 valueOf(String str) {
        return (ci3) Enum.valueOf(ci3.class, str);
    }

    public static ci3[] values() {
        return (ci3[]) p.clone();
    }
}
