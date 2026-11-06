package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class od3 {
    public static final od3 m;
    public static final od3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ od3[] f1650o;

    static {
        od3 od3Var = new od3("Connected", 0);
        m = od3Var;
        od3 od3Var2 = new od3("Disconnected", 1);
        n = od3Var2;
        f1650o = new od3[]{od3Var, od3Var2};
    }

    public static od3 valueOf(String str) {
        return (od3) Enum.valueOf(od3.class, str);
    }

    public static od3[] values() {
        return (od3[]) f1650o.clone();
    }
}
