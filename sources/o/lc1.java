package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 {
    public static final lc1 m;
    public static final /* synthetic */ lc1[] n;

    static {
        lc1 lc1Var = new lc1("Normal", 0);
        m = lc1Var;
        n = new lc1[]{lc1Var, new lc1("High", 1)};
    }

    public static lc1 valueOf(String str) {
        return (lc1) Enum.valueOf(lc1.class, str);
    }

    public static lc1[] values() {
        return (lc1[]) n.clone();
    }
}
