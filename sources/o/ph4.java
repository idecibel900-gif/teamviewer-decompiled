package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ph4 {
    public static final ph4 m;
    public static final /* synthetic */ ph4[] n;

    static {
        ph4 ph4Var = new ph4("Immediately", 0);
        m = ph4Var;
        n = new ph4[]{ph4Var, new ph4("OnIterationFinish", 1)};
    }

    public static ph4 valueOf(String str) {
        return (ph4) Enum.valueOf(ph4.class, str);
    }

    public static ph4[] values() {
        return (ph4[]) n.clone();
    }
}
