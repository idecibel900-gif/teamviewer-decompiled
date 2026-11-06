package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 {
    public static final lf2 m;
    public static final lf2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ lf2[] f1357o;

    static {
        lf2 lf2Var = new lf2("COLLAPSED", 0);
        m = lf2Var;
        lf2 lf2Var2 = new lf2("EXPANDED", 1);
        n = lf2Var2;
        f1357o = new lf2[]{lf2Var, lf2Var2};
    }

    public static lf2 valueOf(String str) {
        return (lf2) Enum.valueOf(lf2.class, str);
    }

    public static lf2[] values() {
        return (lf2[]) f1357o.clone();
    }
}
