package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eg3 {
    public static final eg3 m;
    public static final eg3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final eg3 f712o;
    public static final /* synthetic */ eg3[] p;

    static {
        eg3 eg3Var = new eg3("UNAVAILABLE", 0);
        m = eg3Var;
        eg3 eg3Var2 = new eg3("UPGRADE", 1);
        n = eg3Var2;
        eg3 eg3Var3 = new eg3("MANAGE", 2);
        f712o = eg3Var3;
        p = new eg3[]{eg3Var, eg3Var2, eg3Var3};
    }

    public static eg3 valueOf(String str) {
        return (eg3) Enum.valueOf(eg3.class, str);
    }

    public static eg3[] values() {
        return (eg3[]) p.clone();
    }
}
