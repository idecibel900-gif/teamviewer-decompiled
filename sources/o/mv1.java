package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 {
    public static final mv1 m;
    public static final mv1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mv1[] f1512o;

    static {
        mv1 mv1Var = new mv1("Groups", 0);
        m = mv1Var;
        mv1 mv1Var2 = new mv1("Contacts", 1);
        n = mv1Var2;
        f1512o = new mv1[]{mv1Var, mv1Var2};
    }

    public static mv1 valueOf(String str) {
        return (mv1) Enum.valueOf(mv1.class, str);
    }

    public static mv1[] values() {
        return (mv1[]) f1512o.clone();
    }
}
