package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mc3 {
    public static final mc3 m;
    public static final mc3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mc3[] f1459o;

    static {
        mc3 mc3Var = new mc3("Start", 0);
        m = mc3Var;
        mc3 mc3Var2 = new mc3("End", 1);
        n = mc3Var2;
        f1459o = new mc3[]{mc3Var, mc3Var2};
    }

    public static mc3 valueOf(String str) {
        return (mc3) Enum.valueOf(mc3.class, str);
    }

    public static mc3[] values() {
        return (mc3[]) f1459o.clone();
    }
}
