package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oc3 {
    public static final oc3 m;
    public static final oc3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ oc3[] f1646o;

    static {
        oc3 oc3Var = new oc3("Start", 0);
        m = oc3Var;
        oc3 oc3Var2 = new oc3("End", 1);
        n = oc3Var2;
        f1646o = new oc3[]{oc3Var, oc3Var2};
    }

    public static oc3 valueOf(String str) {
        return (oc3) Enum.valueOf(oc3.class, str);
    }

    public static oc3[] values() {
        return (oc3[]) f1646o.clone();
    }
}
