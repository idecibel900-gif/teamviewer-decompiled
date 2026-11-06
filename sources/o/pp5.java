package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pp5 {
    public static final pp5 m;
    public static final pp5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ pp5[] f1762o;

    static {
        pp5 pp5Var = new pp5("EXACT", 0);
        m = pp5Var;
        pp5 pp5Var2 = new pp5("INEXACT", 1);
        n = pp5Var2;
        f1762o = new pp5[]{pp5Var, pp5Var2};
    }

    public static pp5 valueOf(String str) {
        return (pp5) Enum.valueOf(pp5.class, str);
    }

    public static pp5[] values() {
        return (pp5[]) f1762o.clone();
    }
}
