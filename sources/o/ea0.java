package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 {
    public static final ea0 m;
    public static final ea0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ea0[] f696o;

    static {
        ea0 ea0Var = new ea0("INPUT_FIELDS", 0);
        m = ea0Var;
        ea0 ea0Var2 = new ea0("GROUP_SELECTOR", 1);
        n = ea0Var2;
        f696o = new ea0[]{ea0Var, ea0Var2};
    }

    public static ea0 valueOf(String str) {
        return (ea0) Enum.valueOf(ea0.class, str);
    }

    public static ea0[] values() {
        return (ea0[]) f696o.clone();
    }
}
