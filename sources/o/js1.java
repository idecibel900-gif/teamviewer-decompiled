package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class js1 {
    public static final js1 m;
    public static final js1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final js1 f1197o;
    public static final js1 p;
    public static final /* synthetic */ js1[] q;

    static {
        js1 js1Var = new js1("Desktop", 0);
        m = js1Var;
        js1 js1Var2 = new js1("Mobile", 1);
        n = js1Var2;
        js1 js1Var3 = new js1("IoT", 2);
        f1197o = js1Var3;
        js1 js1Var4 = new js1("NAS", 3);
        p = js1Var4;
        q = new js1[]{js1Var, js1Var2, js1Var3, js1Var4};
    }

    public static js1 valueOf(String str) {
        return (js1) Enum.valueOf(js1.class, str);
    }

    public static js1[] values() {
        return (js1[]) q.clone();
    }
}
