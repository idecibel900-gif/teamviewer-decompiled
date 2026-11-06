package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 {
    public static final nb3 m;
    public static final nb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ nb3[] f1560o;

    static {
        nb3 nb3Var = new nb3("Unlocked", 0);
        m = nb3Var;
        nb3 nb3Var2 = new nb3("Locked", 1);
        n = nb3Var2;
        f1560o = new nb3[]{nb3Var, nb3Var2};
    }

    public static nb3 valueOf(String str) {
        return (nb3) Enum.valueOf(nb3.class, str);
    }

    public static nb3[] values() {
        return (nb3[]) f1560o.clone();
    }
}
