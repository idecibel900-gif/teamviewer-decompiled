package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n58 {
    public static final n58 m;
    public static final n58 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n58[] f1542o;

    static {
        n58 n58Var = new n58("SUPERTYPE", 0);
        m = n58Var;
        n58 n58Var2 = new n58("COMMON", 1);
        n = n58Var2;
        f1542o = new n58[]{n58Var, n58Var2};
    }

    public static n58 valueOf(String str) {
        return (n58) Enum.valueOf(n58.class, str);
    }

    public static n58[] values() {
        return (n58[]) f1542o.clone();
    }
}
