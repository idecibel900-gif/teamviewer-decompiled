package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wg4 {
    public static final wg4 m;
    public static final wg4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wg4 f2410o;
    public static final /* synthetic */ wg4[] p;

    static {
        wg4 wg4Var = new wg4("IsPlacedInLookahead", 0);
        m = wg4Var;
        wg4 wg4Var2 = new wg4("IsPlacedInApproach", 1);
        n = wg4Var2;
        wg4 wg4Var3 = new wg4("IsNotPlaced", 2);
        f2410o = wg4Var3;
        p = new wg4[]{wg4Var, wg4Var2, wg4Var3};
    }

    public static wg4 valueOf(String str) {
        return (wg4) Enum.valueOf(wg4.class, str);
    }

    public static wg4[] values() {
        return (wg4[]) p.clone();
    }
}
