package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sf4 {
    public static final sf4 m;
    public static final sf4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sf4 f2017o;
    public static final /* synthetic */ sf4[] p;

    static {
        sf4 sf4Var = new sf4("BuddyList", 0);
        m = sf4Var;
        sf4 sf4Var2 = new sf4("Chat", 1);
        n = sf4Var2;
        sf4 sf4Var3 = new sf4("InAppPurchase", 2);
        f2017o = sf4Var3;
        p = new sf4[]{sf4Var, sf4Var2, sf4Var3};
    }

    public static sf4 valueOf(String str) {
        return (sf4) Enum.valueOf(sf4.class, str);
    }

    public static sf4[] values() {
        return (sf4[]) p.clone();
    }
}
