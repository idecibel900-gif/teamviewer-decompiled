package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 {
    public static final jj2 m;
    public static final jj2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jj2[] f1171o;

    static {
        jj2 jj2Var = new jj2("Ok", 0);
        m = jj2Var;
        jj2 jj2Var2 = new jj2("Error", 1);
        n = jj2Var2;
        f1171o = new jj2[]{jj2Var, jj2Var2};
    }

    public static jj2 valueOf(String str) {
        return (jj2) Enum.valueOf(jj2.class, str);
    }

    public static jj2[] values() {
        return (jj2[]) f1171o.clone();
    }
}
