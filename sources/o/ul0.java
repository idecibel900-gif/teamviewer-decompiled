package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ul0 {
    public static final ul0 m;
    public static final /* synthetic */ ul0[] n;

    static {
        ul0 ul0Var = new ul0("FOR_SUBTYPING", 0);
        m = ul0Var;
        n = new ul0[]{ul0Var, new ul0("FOR_INCORPORATION", 1), new ul0("FROM_EXPRESSION", 2)};
    }

    public static ul0 valueOf(String str) {
        return (ul0) Enum.valueOf(ul0.class, str);
    }

    public static ul0[] values() {
        return (ul0[]) n.clone();
    }
}
