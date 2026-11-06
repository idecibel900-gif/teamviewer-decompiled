package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fc5 {
    public static final fc5 m;
    public static final fc5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ fc5[] f785o;

    static {
        fc5 fc5Var = new fc5("RENDER_OVERRIDE", 0);
        m = fc5Var;
        fc5 fc5Var2 = new fc5("RENDER_OPEN", 1);
        n = fc5Var2;
        f785o = new fc5[]{fc5Var, fc5Var2, new fc5("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static fc5 valueOf(String str) {
        return (fc5) Enum.valueOf(fc5.class, str);
    }

    public static fc5[] values() {
        return (fc5[]) f785o.clone();
    }
}
