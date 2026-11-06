package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oc8 {
    public static final oc8 m;
    public static final oc8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ oc8[] f1648o;

    static {
        oc8 oc8Var = new oc8("Lsq2", 0);
        m = oc8Var;
        oc8 oc8Var2 = new oc8("Impulse", 1);
        n = oc8Var2;
        f1648o = new oc8[]{oc8Var, oc8Var2};
    }

    public static oc8 valueOf(String str) {
        return (oc8) Enum.valueOf(oc8.class, str);
    }

    public static oc8[] values() {
        return (oc8[]) f1648o.clone();
    }
}
