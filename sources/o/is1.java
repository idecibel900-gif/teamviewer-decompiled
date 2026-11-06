package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class is1 {
    public static final is1 m;
    public static final is1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final is1 f1095o;
    public static final /* synthetic */ is1[] p;

    static {
        is1 is1Var = new is1("Name", 0);
        m = is1Var;
        is1 is1Var2 = new is1("Password", 1);
        n = is1Var2;
        is1 is1Var3 = new is1("Description", 2);
        f1095o = is1Var3;
        p = new is1[]{is1Var, is1Var2, is1Var3};
    }

    public static is1 valueOf(String str) {
        return (is1) Enum.valueOf(is1.class, str);
    }

    public static is1[] values() {
        return (is1[]) p.clone();
    }
}
