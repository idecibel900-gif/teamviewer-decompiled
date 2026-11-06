package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 {
    public static final ua1 m;
    public static final ua1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ua1[] f2191o;

    static {
        ua1 ua1Var = new ua1("VIEW_APPEAR", 0);
        m = ua1Var;
        ua1 ua1Var2 = new ua1("VIEW_DISAPPEAR", 1);
        n = ua1Var2;
        f2191o = new ua1[]{ua1Var, ua1Var2};
    }

    public static ua1 valueOf(String str) {
        return (ua1) Enum.valueOf(ua1.class, str);
    }

    public static ua1[] values() {
        return (ua1[]) f2191o.clone();
    }
}
