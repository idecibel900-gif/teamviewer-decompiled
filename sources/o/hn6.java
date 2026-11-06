package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hn6 {
    public static final hn6 m;
    public static final hn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ hn6[] f992o;

    static {
        hn6 hn6Var = new hn6("Inherit", 0);
        m = hn6Var;
        hn6 hn6Var2 = new hn6("SecureOn", 1);
        n = hn6Var2;
        f992o = new hn6[]{hn6Var, hn6Var2, new hn6("SecureOff", 2)};
    }

    public static hn6 valueOf(String str) {
        return (hn6) Enum.valueOf(hn6.class, str);
    }

    public static hn6[] values() {
        return (hn6[]) f992o.clone();
    }
}
