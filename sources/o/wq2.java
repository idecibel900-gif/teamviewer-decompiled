package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wq2 {
    public static final wq2 m;
    public static final wq2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wq2 f2437o;
    public static final /* synthetic */ wq2[] p;

    static {
        wq2 wq2Var = new wq2("Active", 0);
        m = wq2Var;
        wq2 wq2Var2 = new wq2("ActiveParent", 1);
        n = wq2Var2;
        wq2 wq2Var3 = new wq2("Captured", 2);
        wq2 wq2Var4 = new wq2("Inactive", 3);
        f2437o = wq2Var4;
        p = new wq2[]{wq2Var, wq2Var2, wq2Var3, wq2Var4};
    }

    public static wq2 valueOf(String str) {
        return (wq2) Enum.valueOf(wq2.class, str);
    }

    public static wq2[] values() {
        return (wq2[]) p.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        gk0.s();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                gk0.s();
                return false;
            }
        }
        return true;
    }
}
