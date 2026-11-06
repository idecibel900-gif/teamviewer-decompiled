package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b65 {
    public static final b65 m;
    public static final b65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b65 f402o;
    public static final /* synthetic */ b65[] p;

    static {
        b65 b65Var = new b65("FORCE_FLEXIBILITY", 0);
        m = b65Var;
        b65 b65Var2 = new b65("NULLABLE", 1);
        n = b65Var2;
        b65 b65Var3 = new b65("NOT_NULL", 2);
        f402o = b65Var3;
        p = new b65[]{b65Var, b65Var2, b65Var3};
    }

    public static b65 valueOf(String str) {
        return (b65) Enum.valueOf(b65.class, str);
    }

    public static b65[] values() {
        return (b65[]) p.clone();
    }
}
