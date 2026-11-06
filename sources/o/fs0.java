package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fs0 {
    public static final fs0 m;
    public static final fs0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final fs0 f824o;
    public static final /* synthetic */ fs0[] p;

    static {
        fs0 fs0Var = new fs0("NONE", 0);
        m = fs0Var;
        fs0 fs0Var2 = new fs0("ALL_JSON_OBJECTS", 1);
        n = fs0Var2;
        fs0 fs0Var3 = new fs0("POLYMORPHIC", 2);
        f824o = fs0Var3;
        p = new fs0[]{fs0Var, fs0Var2, fs0Var3};
    }

    public static fs0 valueOf(String str) {
        return (fs0) Enum.valueOf(fs0.class, str);
    }

    public static fs0[] values() {
        return (fs0[]) p.clone();
    }
}
