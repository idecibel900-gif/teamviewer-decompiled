package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h97 {
    public static final h97 m;
    public static final h97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h97 f961o;
    public static final /* synthetic */ h97[] p;

    static {
        h97 h97Var = new h97("BEGINNING", 0);
        m = h97Var;
        h97 h97Var2 = new h97("MIDDLE", 1);
        n = h97Var2;
        h97 h97Var3 = new h97("AFTER_DOT", 2);
        f961o = h97Var3;
        p = new h97[]{h97Var, h97Var2, h97Var3};
    }

    public static h97 valueOf(String str) {
        return (h97) Enum.valueOf(h97.class, str);
    }

    public static h97[] values() {
        return (h97[]) p.clone();
    }
}
