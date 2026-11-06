package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bt6 {
    public static final bt6 m;
    public static final bt6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bt6 f455o;
    public static final /* synthetic */ bt6[] p;

    static {
        bt6 bt6Var = new bt6("Failure", 0);
        m = bt6Var;
        bt6 bt6Var2 = new bt6("Ignore", 1);
        n = bt6Var2;
        bt6 bt6Var3 = new bt6("Success", 2);
        f455o = bt6Var3;
        p = new bt6[]{bt6Var, bt6Var2, bt6Var3};
    }

    public static bt6 valueOf(String str) {
        return (bt6) Enum.valueOf(bt6.class, str);
    }

    public static bt6[] values() {
        return (bt6[]) p.clone();
    }
}
