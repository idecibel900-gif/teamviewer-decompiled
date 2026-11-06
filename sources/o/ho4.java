package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ho4 {
    public static final ho4 m;
    public static final ho4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ho4[] f995o;

    static {
        ho4 ho4Var = new ho4("Min", 0);
        m = ho4Var;
        ho4 ho4Var2 = new ho4("Max", 1);
        n = ho4Var2;
        f995o = new ho4[]{ho4Var, ho4Var2};
    }

    public static ho4 valueOf(String str) {
        return (ho4) Enum.valueOf(ho4.class, str);
    }

    public static ho4[] values() {
        return (ho4[]) f995o.clone();
    }
}
