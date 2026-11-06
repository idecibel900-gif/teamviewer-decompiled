package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xy1 {
    public static final xy1 m;
    public static final xy1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xy1 f2561o;
    public static final /* synthetic */ xy1[] p;
    public static final /* synthetic */ jc2 q;

    static {
        xy1 xy1Var = new xy1("DIRECTLY_MANAGED_DEVICES", 0);
        m = xy1Var;
        xy1 xy1Var2 = new xy1("GROUP_MANAGED_DEVICES", 1);
        n = xy1Var2;
        xy1 xy1Var3 = new xy1("MANAGED_GROUPS", 2);
        f2561o = xy1Var3;
        xy1[] xy1VarArr = {xy1Var, xy1Var2, xy1Var3};
        p = xy1VarArr;
        q = new jc2(xy1VarArr);
    }

    public static xy1 valueOf(String str) {
        return (xy1) Enum.valueOf(xy1.class, str);
    }

    public static xy1[] values() {
        return (xy1[]) p.clone();
    }
}
