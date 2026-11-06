package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 {
    public static final rs1 m;
    public static final rs1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final rs1 f1945o;
    public static final rs1 p;
    public static final /* synthetic */ rs1[] q;

    static {
        rs1 rs1Var = new rs1("BookmarkedDevice", 0);
        m = rs1Var;
        rs1 rs1Var2 = new rs1("PasswordWarning", 1);
        n = rs1Var2;
        rs1 rs1Var3 = new rs1("Policy", 2);
        f1945o = rs1Var3;
        rs1 rs1Var4 = new rs1("MoreOptions", 3);
        p = rs1Var4;
        q = new rs1[]{rs1Var, rs1Var2, rs1Var3, rs1Var4};
    }

    public static rs1 valueOf(String str) {
        return (rs1) Enum.valueOf(rs1.class, str);
    }

    public static rs1[] values() {
        return (rs1[]) q.clone();
    }
}
