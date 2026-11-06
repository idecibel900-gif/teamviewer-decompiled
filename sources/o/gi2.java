package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gi2 {
    public static final gi2 m;
    public static final gi2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gi2 f895o;
    public static final /* synthetic */ gi2[] p;

    static {
        gi2 gi2Var = new gi2("Idea", 0);
        m = gi2Var;
        gi2 gi2Var2 = new gi2("Problem", 1);
        n = gi2Var2;
        gi2 gi2Var3 = new gi2("SecurityFeedback", 2);
        f895o = gi2Var3;
        p = new gi2[]{gi2Var, gi2Var2, gi2Var3};
    }

    public static gi2 valueOf(String str) {
        return (gi2) Enum.valueOf(gi2.class, str);
    }

    public static gi2[] values() {
        return (gi2[]) p.clone();
    }
}
