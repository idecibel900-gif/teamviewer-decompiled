package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mv2 {
    public static final mv2 m;
    public static final mv2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mv2 f1513o;
    public static final mv2 p;
    public static final mv2 q;
    public static final /* synthetic */ mv2[] r;

    static {
        mv2 mv2Var = new mv2("ON_CONFIGURE", 0);
        m = mv2Var;
        mv2 mv2Var2 = new mv2("ON_CREATE", 1);
        n = mv2Var2;
        mv2 mv2Var3 = new mv2("ON_UPGRADE", 2);
        f1513o = mv2Var3;
        mv2 mv2Var4 = new mv2("ON_DOWNGRADE", 3);
        p = mv2Var4;
        mv2 mv2Var5 = new mv2("ON_OPEN", 4);
        q = mv2Var5;
        r = new mv2[]{mv2Var, mv2Var2, mv2Var3, mv2Var4, mv2Var5};
    }

    public static mv2 valueOf(String str) {
        return (mv2) Enum.valueOf(mv2.class, str);
    }

    public static mv2[] values() {
        return (mv2[]) r.clone();
    }
}
