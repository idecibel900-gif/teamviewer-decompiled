package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z83 {
    public static final z83 m;
    public static final z83 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z83 f2680o;
    public static final z83 p;
    public static final /* synthetic */ z83[] q;

    static {
        z83 z83Var = new z83("NONE", 0);
        m = z83Var;
        z83 z83Var2 = new z83("BASIC", 1);
        n = z83Var2;
        z83 z83Var3 = new z83("HEADERS", 2);
        f2680o = z83Var3;
        z83 z83Var4 = new z83("BODY", 3);
        p = z83Var4;
        q = new z83[]{z83Var, z83Var2, z83Var3, z83Var4};
    }

    public static z83 valueOf(String str) {
        return (z83) Enum.valueOf(z83.class, str);
    }

    public static z83[] values() {
        return (z83[]) q.clone();
    }
}
