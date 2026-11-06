package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ea6 {
    public static final ea6 m;
    public static final ea6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ea6[] f697o;

    static {
        ea6 ea6Var = new ea6("Windows", 0);
        m = ea6Var;
        ea6 ea6Var2 = new ea6("Mac", 1);
        n = ea6Var2;
        f697o = new ea6[]{ea6Var, ea6Var2};
    }

    public static ea6 valueOf(String str) {
        return (ea6) Enum.valueOf(ea6.class, str);
    }

    public static ea6[] values() {
        return (ea6[]) f697o.clone();
    }
}
