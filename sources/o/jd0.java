package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 {
    public static final jd0 m;
    public static final jd0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jd0[] f1151o;

    static {
        jd0 jd0Var = new jd0("MonitoringOverview", 0);
        m = jd0Var;
        jd0 jd0Var2 = new jd0("DEFAULT", 1);
        n = jd0Var2;
        f1151o = new jd0[]{jd0Var, jd0Var2};
    }

    public static jd0 valueOf(String str) {
        return (jd0) Enum.valueOf(jd0.class, str);
    }

    public static jd0[] values() {
        return (jd0[]) f1151o.clone();
    }
}
