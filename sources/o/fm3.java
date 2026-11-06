package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fm3 {
    public static final fm3 m;
    public static final fm3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ fm3[] f811o;

    static {
        fm3 fm3Var = new fm3("Width", 0);
        m = fm3Var;
        fm3 fm3Var2 = new fm3("Height", 1);
        n = fm3Var2;
        f811o = new fm3[]{fm3Var, fm3Var2};
    }

    public static fm3 valueOf(String str) {
        return (fm3) Enum.valueOf(fm3.class, str);
    }

    public static fm3[] values() {
        return (fm3[]) f811o.clone();
    }
}
