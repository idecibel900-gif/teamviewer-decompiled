package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ny6 {
    public static final ny6 m;
    public static final ny6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ny6 f1612o;
    public static final /* synthetic */ ny6[] p;

    static {
        ny6 ny6Var = new ny6("START", 0);
        m = ny6Var;
        ny6 ny6Var2 = new ny6("STOP", 1);
        n = ny6Var2;
        ny6 ny6Var3 = new ny6("STOP_AND_RESET_REPLAY_CACHE", 2);
        f1612o = ny6Var3;
        p = new ny6[]{ny6Var, ny6Var2, ny6Var3};
    }

    public static ny6 valueOf(String str) {
        return (ny6) Enum.valueOf(ny6.class, str);
    }

    public static ny6[] values() {
        return (ny6[]) p.clone();
    }
}
