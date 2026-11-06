package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vw3 {
    public static final vw3 m;
    public static final vw3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vw3 f2355o;
    public static final /* synthetic */ vw3[] p;

    static {
        vw3 vw3Var = new vw3("INVARIANT", 0);
        m = vw3Var;
        vw3 vw3Var2 = new vw3("IN", 1);
        n = vw3Var2;
        vw3 vw3Var3 = new vw3("OUT", 2);
        f2355o = vw3Var3;
        p = new vw3[]{vw3Var, vw3Var2, vw3Var3};
    }

    public static vw3 valueOf(String str) {
        return (vw3) Enum.valueOf(vw3.class, str);
    }

    public static vw3[] values() {
        return (vw3[]) p.clone();
    }
}
