package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 {
    public static final ef1 m;
    public static final ef1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ef1 f707o;
    public static final /* synthetic */ ef1[] p;

    static {
        ef1 ef1Var = new ef1("CROSSED", 0);
        m = ef1Var;
        ef1 ef1Var2 = new ef1("NOT_CROSSED", 1);
        n = ef1Var2;
        ef1 ef1Var3 = new ef1("COLLAPSED", 2);
        f707o = ef1Var3;
        p = new ef1[]{ef1Var, ef1Var2, ef1Var3};
    }

    public static ef1 valueOf(String str) {
        return (ef1) Enum.valueOf(ef1.class, str);
    }

    public static ef1[] values() {
        return (ef1[]) p.clone();
    }
}
