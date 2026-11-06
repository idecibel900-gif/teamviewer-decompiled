package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jb5 {
    public static final jb5 m;
    public static final jb5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jb5[] f1145o;

    static {
        jb5 jb5Var = new jb5("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        m = jb5Var;
        jb5 jb5Var2 = new jb5("DROP_WORK_REQUEST", 1);
        n = jb5Var2;
        f1145o = new jb5[]{jb5Var, jb5Var2};
    }

    public static jb5 valueOf(String str) {
        return (jb5) Enum.valueOf(jb5.class, str);
    }

    public static jb5[] values() {
        return (jb5[]) f1145o.clone();
    }
}
