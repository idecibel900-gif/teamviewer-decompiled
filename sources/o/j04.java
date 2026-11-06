package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j04 {
    public static final j04 m;
    public static final j04 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ j04[] f1117o;

    static {
        j04 j04Var = new j04("Ltr", 0);
        m = j04Var;
        j04 j04Var2 = new j04("Rtl", 1);
        n = j04Var2;
        f1117o = new j04[]{j04Var, j04Var2};
    }

    public static j04 valueOf(String str) {
        return (j04) Enum.valueOf(j04.class, str);
    }

    public static j04[] values() {
        return (j04[]) f1117o.clone();
    }
}
