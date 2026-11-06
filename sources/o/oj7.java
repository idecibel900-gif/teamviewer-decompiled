package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oj7 implements i10 {
    public static final oj7 m;
    public static final /* synthetic */ oj7[] n;

    static {
        oj7 oj7Var = new oj7("Data", 0);
        m = oj7Var;
        n = new oj7[]{oj7Var};
    }

    public static oj7 valueOf(String str) {
        return (oj7) Enum.valueOf(oj7.class, str);
    }

    public static oj7[] values() {
        return (oj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 1;
    }
}
