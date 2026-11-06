package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x64 {
    public static final x64 m;
    public static final x64 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x64 f2484o;
    public static final x64 p;
    public static final /* synthetic */ x64[] q;

    static {
        x64 x64Var = new x64("EULADPA", 0);
        m = x64Var;
        x64 x64Var2 = new x64("TRANSFER", 1);
        n = x64Var2;
        x64 x64Var3 = new x64("COLLECT", 2);
        f2484o = x64Var3;
        x64 x64Var4 = new x64("MARKETING", 3);
        p = x64Var4;
        q = new x64[]{x64Var, x64Var2, x64Var3, x64Var4};
    }

    public static x64 valueOf(String str) {
        return (x64) Enum.valueOf(x64.class, str);
    }

    public static x64[] values() {
        return (x64[]) q.clone();
    }
}
