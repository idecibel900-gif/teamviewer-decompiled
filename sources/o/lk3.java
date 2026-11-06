package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lk3 {
    public static final lk3 m;
    public static final lk3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ lk3[] f1371o;

    static {
        lk3 lk3Var = new lk3("MaxZoomReachedView", 0);
        m = lk3Var;
        lk3 lk3Var2 = new lk3("IntroVideosView", 1);
        n = lk3Var2;
        f1371o = new lk3[]{lk3Var, lk3Var2};
    }

    public static lk3 valueOf(String str) {
        return (lk3) Enum.valueOf(lk3.class, str);
    }

    public static lk3[] values() {
        return (lk3[]) f1371o.clone();
    }
}
