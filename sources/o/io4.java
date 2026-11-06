package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class io4 {
    public static final io4 m;
    public static final io4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ io4[] f1085o;

    static {
        io4 io4Var = new io4("Width", 0);
        m = io4Var;
        io4 io4Var2 = new io4("Height", 1);
        n = io4Var2;
        f1085o = new io4[]{io4Var, io4Var2};
    }

    public static io4 valueOf(String str) {
        return (io4) Enum.valueOf(io4.class, str);
    }

    public static io4[] values() {
        return (io4[]) f1085o.clone();
    }
}
