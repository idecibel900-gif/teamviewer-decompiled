package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vf8 {
    public static final vf8 m;
    public static final vf8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ vf8[] f2307o;

    static {
        vf8 vf8Var = new vf8("ENABLED", 0);
        m = vf8Var;
        vf8 vf8Var2 = new vf8("DISABLED", 1);
        n = vf8Var2;
        f2307o = new vf8[]{vf8Var, vf8Var2};
    }

    public static vf8 valueOf(String str) {
        return (vf8) Enum.valueOf(vf8.class, str);
    }

    public static vf8[] values() {
        return (vf8[]) f2307o.clone();
    }
}
