package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class py4 {
    public static final py4 m;
    public static final py4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ py4[] f1788o;

    static {
        py4 py4Var = new py4("UNREGISTERED", 0);
        m = py4Var;
        py4 py4Var2 = new py4("REGISTERED", 1);
        n = py4Var2;
        f1788o = new py4[]{py4Var, py4Var2};
    }

    public static py4 valueOf(String str) {
        return (py4) Enum.valueOf(py4.class, str);
    }

    public static py4[] values() {
        return (py4[]) f1788o.clone();
    }
}
