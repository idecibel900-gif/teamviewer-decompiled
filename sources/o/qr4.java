package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qr4 {
    public static final qr4 m;
    public static final qr4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qr4 f1857o;
    public static final qr4 p;
    public static final /* synthetic */ qr4[] q;

    static {
        qr4 qr4Var = new qr4("NOTHING", 0);
        m = qr4Var;
        qr4 qr4Var2 = new qr4("START", 1);
        n = qr4Var2;
        qr4 qr4Var3 = new qr4("SUCCESS", 2);
        f1857o = qr4Var3;
        qr4 qr4Var4 = new qr4("ERROR", 3);
        p = qr4Var4;
        q = new qr4[]{qr4Var, qr4Var2, qr4Var3, qr4Var4};
    }

    public static qr4 valueOf(String str) {
        return (qr4) Enum.valueOf(qr4.class, str);
    }

    public static qr4[] values() {
        return (qr4[]) q.clone();
    }
}
