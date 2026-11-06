package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 {
    public static final zg1 m;
    public static final zg1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zg1 f2697o;
    public static final zg1 p;
    public static final /* synthetic */ zg1[] q;

    static {
        zg1 zg1Var = new zg1("MEMORY_CACHE", 0);
        m = zg1Var;
        zg1 zg1Var2 = new zg1("MEMORY", 1);
        n = zg1Var2;
        zg1 zg1Var3 = new zg1("DISK", 2);
        f2697o = zg1Var3;
        zg1 zg1Var4 = new zg1("NETWORK", 3);
        p = zg1Var4;
        q = new zg1[]{zg1Var, zg1Var2, zg1Var3, zg1Var4};
    }

    public static zg1 valueOf(String str) {
        return (zg1) Enum.valueOf(zg1.class, str);
    }

    public static zg1[] values() {
        return (zg1[]) q.clone();
    }
}
