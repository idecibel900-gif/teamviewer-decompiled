package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class by4 {
    public static final by4 m;
    public static final /* synthetic */ by4[] n;

    static {
        by4 by4Var = new by4("Default", 0);
        m = by4Var;
        n = new by4[]{by4Var, new by4("UserInput", 1), new by4("PreventUserInput", 2)};
    }

    public static by4 valueOf(String str) {
        return (by4) Enum.valueOf(by4.class, str);
    }

    public static by4[] values() {
        return (by4[]) n.clone();
    }
}
