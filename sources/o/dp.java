package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dp {
    public static final dp m;
    public static final dp n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ dp[] f640o;

    static {
        dp dpVar = new dp("JAVA", 0);
        m = dpVar;
        dp dpVar2 = new dp("KOTLIN", 1);
        n = dpVar2;
        f640o = new dp[]{dpVar, dpVar2};
    }

    public static dp valueOf(String str) {
        return (dp) Enum.valueOf(dp.class, str);
    }

    public static dp[] values() {
        return (dp[]) f640o.clone();
    }
}
