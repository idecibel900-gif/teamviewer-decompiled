package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l67 {
    public static final l67 m;
    public static final l67 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ l67[] f1333o;

    static {
        l67 l67Var = new l67("ASCENDING", 0);
        m = l67Var;
        l67 l67Var2 = new l67("DESCENDING", 1);
        n = l67Var2;
        f1333o = new l67[]{l67Var, l67Var2};
    }

    public static l67 valueOf(String str) {
        return (l67) Enum.valueOf(l67.class, str);
    }

    public static l67[] values() {
        return (l67[]) f1333o.clone();
    }
}
