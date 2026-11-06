package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z57 {
    public static final z57 m;
    public static final z57 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z57[] f2672o;

    static {
        z57 z57Var = new z57("ButtonTypeGet", 0);
        m = z57Var;
        z57 z57Var2 = new z57("ButtonTypeOpen", 1);
        n = z57Var2;
        f2672o = new z57[]{z57Var, z57Var2};
    }

    public static z57 valueOf(String str) {
        return (z57) Enum.valueOf(z57.class, str);
    }

    public static z57[] values() {
        return (z57[]) f2672o.clone();
    }
}
