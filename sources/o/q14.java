package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q14 {
    public static final q14 m;
    public static final /* synthetic */ q14[] n;

    static {
        q14 q14Var = new q14("Horizontal", 0);
        m = q14Var;
        n = new q14[]{q14Var, new q14("Vertical", 1)};
    }

    public static q14 valueOf(String str) {
        return (q14) Enum.valueOf(q14.class, str);
    }

    public static q14[] values() {
        return (q14[]) n.clone();
    }
}
