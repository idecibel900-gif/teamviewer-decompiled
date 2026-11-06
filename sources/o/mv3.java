package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mv3 {
    public static final mv3 m;
    public static final mv3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mv3 f1514o;
    public static final /* synthetic */ mv3[] p;

    static {
        mv3 mv3Var = new mv3("INSTANCE", 0);
        m = mv3Var;
        mv3 mv3Var2 = new mv3("CONTEXT", 1);
        mv3 mv3Var3 = new mv3("EXTENSION_RECEIVER", 2);
        n = mv3Var3;
        mv3 mv3Var4 = new mv3("VALUE", 3);
        f1514o = mv3Var4;
        p = new mv3[]{mv3Var, mv3Var2, mv3Var3, mv3Var4};
    }

    public static mv3 valueOf(String str) {
        return (mv3) Enum.valueOf(mv3.class, str);
    }

    public static mv3[] values() {
        return (mv3[]) p.clone();
    }
}
