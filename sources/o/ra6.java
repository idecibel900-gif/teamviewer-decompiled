package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ra6 {
    public static final ra6 m;
    public static final /* synthetic */ ra6[] n;

    static {
        ra6 ra6Var = new ra6("Restart", 0);
        m = ra6Var;
        n = new ra6[]{ra6Var, new ra6("Reverse", 1)};
    }

    public static ra6 valueOf(String str) {
        return (ra6) Enum.valueOf(ra6.class, str);
    }

    public static ra6[] values() {
        return (ra6[]) n.clone();
    }
}
