package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a21 {
    public static final a21 m;
    public static final a21 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a21[] f285o;

    static {
        a21 a21Var = new a21("APPROVED", 0);
        m = a21Var;
        a21 a21Var2 = new a21("DENIED", 1);
        n = a21Var2;
        f285o = new a21[]{a21Var, a21Var2};
    }

    public static a21 valueOf(String str) {
        return (a21) Enum.valueOf(a21.class, str);
    }

    public static a21[] values() {
        return (a21[]) f285o.clone();
    }
}
