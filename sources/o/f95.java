package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f95 {
    public static final f95 m;
    public static final f95 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f95 f778o;
    public static final f95 p;
    public static final f95 q;
    public static final f95 r;
    public static final f95 s;
    public static final /* synthetic */ f95[] t;

    static {
        f95 f95Var = new f95("Busy", 0);
        m = f95Var;
        f95 f95Var2 = new f95("Offline", 1);
        n = f95Var2;
        f95 f95Var3 = new f95("Online", 2);
        f778o = f95Var3;
        f95 f95Var4 = new f95("Away", 3);
        p = f95Var4;
        f95 f95Var5 = new f95("Standby", 4);
        q = f95Var5;
        f95 f95Var6 = new f95("Sleeping", 5);
        r = f95Var6;
        f95 f95Var7 = new f95("Unknown", 6);
        s = f95Var7;
        t = new f95[]{f95Var, f95Var2, f95Var3, f95Var4, f95Var5, f95Var6, f95Var7};
    }

    public static f95 valueOf(String str) {
        return (f95) Enum.valueOf(f95.class, str);
    }

    public static f95[] values() {
        return (f95[]) t.clone();
    }
}
