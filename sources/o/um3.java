package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class um3 {
    public static final um3 m;
    public static final um3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final um3 f2227o;
    public static final um3 p;
    public static final /* synthetic */ um3[] q;

    static {
        um3 um3Var = new um3("IGNORED", 0);
        m = um3Var;
        um3 um3Var2 = new um3("SCHEDULED", 1);
        n = um3Var2;
        um3 um3Var3 = new um3("DEFERRED", 2);
        f2227o = um3Var3;
        um3 um3Var4 = new um3("IMMINENT", 3);
        p = um3Var4;
        q = new um3[]{um3Var, um3Var2, um3Var3, um3Var4};
    }

    public static um3 valueOf(String str) {
        return (um3) Enum.valueOf(um3.class, str);
    }

    public static um3[] values() {
        return (um3[]) q.clone();
    }
}
