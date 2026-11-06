package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 {
    public static final ef4 m;
    public static final ef4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ef4 f708o;
    public static final /* synthetic */ ef4[] p;

    static {
        ef4 ef4Var = new ef4("Success", 0);
        m = ef4Var;
        ef4 ef4Var2 = new ef4("ProtocolError", 1);
        n = ef4Var2;
        ef4 ef4Var3 = new ef4("InvalidVersion", 2);
        f708o = ef4Var3;
        p = new ef4[]{ef4Var, ef4Var2, ef4Var3};
    }

    public static ef4 valueOf(String str) {
        return (ef4) Enum.valueOf(ef4.class, str);
    }

    public static ef4[] values() {
        return (ef4[]) p.clone();
    }
}
