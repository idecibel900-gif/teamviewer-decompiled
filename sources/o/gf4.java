package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gf4 {
    public static final gf4 m;
    public static final gf4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ gf4[] f888o;

    static {
        gf4 gf4Var = new gf4("SignIn", 0);
        m = gf4Var;
        gf4 gf4Var2 = new gf4("SignUp", 1);
        n = gf4Var2;
        f888o = new gf4[]{gf4Var, gf4Var2};
    }

    public static gf4 valueOf(String str) {
        return (gf4) Enum.valueOf(gf4.class, str);
    }

    public static gf4[] values() {
        return (gf4[]) f888o.clone();
    }
}
