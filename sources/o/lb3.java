package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lb3 {
    public static final lb3 m;
    public static final lb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ lb3[] f1347o;

    static {
        lb3 lb3Var = new lb3("Expanded", 0);
        m = lb3Var;
        lb3 lb3Var2 = new lb3("Collapsed", 1);
        n = lb3Var2;
        f1347o = new lb3[]{lb3Var, lb3Var2};
    }

    public static lb3 valueOf(String str) {
        return (lb3) Enum.valueOf(lb3.class, str);
    }

    public static lb3[] values() {
        return (lb3[]) f1347o.clone();
    }
}
