package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ua3 {
    public static final ua3 m;
    public static final ua3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ua3 f2192o;
    public static final ua3 p;
    public static final /* synthetic */ ua3[] q;

    static {
        ua3 ua3Var = new ua3("Online", 0);
        m = ua3Var;
        ua3 ua3Var2 = new ua3("Away", 1);
        n = ua3Var2;
        ua3 ua3Var3 = new ua3("Busy", 2);
        f2192o = ua3Var3;
        ua3 ua3Var4 = new ua3("Offline", 3);
        p = ua3Var4;
        q = new ua3[]{ua3Var, ua3Var2, ua3Var3, ua3Var4};
    }

    public static ua3 valueOf(String str) {
        return (ua3) Enum.valueOf(ua3.class, str);
    }

    public static ua3[] values() {
        return (ua3[]) q.clone();
    }
}
