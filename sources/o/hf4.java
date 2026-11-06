package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hf4 {
    public static final hf4 m;
    public static final hf4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ hf4[] f967o;

    static {
        hf4 hf4Var = new hf4("SignIn", 0);
        m = hf4Var;
        hf4 hf4Var2 = new hf4("SignUp", 1);
        n = hf4Var2;
        f967o = new hf4[]{hf4Var, hf4Var2};
    }

    public static hf4 valueOf(String str) {
        return (hf4) Enum.valueOf(hf4.class, str);
    }

    public static hf4[] values() {
        return (hf4[]) f967o.clone();
    }
}
