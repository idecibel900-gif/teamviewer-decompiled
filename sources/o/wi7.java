package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wi7 implements i10 {
    public static final wi7 m;
    public static final /* synthetic */ wi7[] n;

    static {
        wi7 wi7Var = new wi7("ClientInputDisable", 0);
        m = wi7Var;
        n = new wi7[]{wi7Var};
    }

    public static wi7 valueOf(String str) {
        return (wi7) Enum.valueOf(wi7.class, str);
    }

    public static wi7[] values() {
        return (wi7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 0;
    }
}
