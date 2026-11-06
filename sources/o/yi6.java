package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yi6 {
    public static final yi6 m;
    public static final yi6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yi6 f2611o;
    public static final /* synthetic */ yi6[] p;

    static {
        yi6 yi6Var = new yi6("NETWORK_UNMETERED", 0);
        m = yi6Var;
        yi6 yi6Var2 = new yi6("DEVICE_IDLE", 1);
        n = yi6Var2;
        yi6 yi6Var3 = new yi6("DEVICE_CHARGING", 2);
        f2611o = yi6Var3;
        p = new yi6[]{yi6Var, yi6Var2, yi6Var3};
    }

    public static yi6 valueOf(String str) {
        return (yi6) Enum.valueOf(yi6.class, str);
    }

    public static yi6[] values() {
        return (yi6[]) p.clone();
    }
}
