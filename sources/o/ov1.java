package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 {
    public static final ov1 m;
    public static final ov1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ov1 f1680o;
    public static final ov1 p;
    public static final /* synthetic */ ov1[] q;

    static {
        ov1 ov1Var = new ov1("GROUPS", 0);
        m = ov1Var;
        ov1 ov1Var2 = new ov1("CONTACTS", 1);
        n = ov1Var2;
        ov1 ov1Var3 = new ov1("MONITORING_OVERVIEW", 2);
        f1680o = ov1Var3;
        ov1 ov1Var4 = new ov1("SERVICE_QUEUE", 3);
        p = ov1Var4;
        q = new ov1[]{ov1Var, ov1Var2, ov1Var3, ov1Var4};
    }

    public static ov1 valueOf(String str) {
        return (ov1) Enum.valueOf(ov1.class, str);
    }

    public static ov1[] values() {
        return (ov1[]) q.clone();
    }
}
