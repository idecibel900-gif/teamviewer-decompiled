package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sm3 {
    public static final sm3 m;
    public static final sm3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sm3 f2031o;
    public static final sm3 p;
    public static final /* synthetic */ sm3[] q;

    static {
        sm3 sm3Var = new sm3("LookaheadMeasurement", 0);
        m = sm3Var;
        sm3 sm3Var2 = new sm3("LookaheadPlacement", 1);
        n = sm3Var2;
        sm3 sm3Var3 = new sm3("Measurement", 2);
        f2031o = sm3Var3;
        sm3 sm3Var4 = new sm3("Placement", 3);
        p = sm3Var4;
        q = new sm3[]{sm3Var, sm3Var2, sm3Var3, sm3Var4};
    }

    public static sm3 valueOf(String str) {
        return (sm3) Enum.valueOf(sm3.class, str);
    }

    public static sm3[] values() {
        return (sm3[]) q.clone();
    }
}
