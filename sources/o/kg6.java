package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kg6 {
    public static final kg6 m;
    public static final kg6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kg6 f1263o;
    public static final kg6 p;
    public static final kg6 q;
    public static final kg6 r;
    public static final /* synthetic */ kg6[] s;

    static {
        kg6 kg6Var = new kg6("Undefined", 0);
        m = kg6Var;
        kg6 kg6Var2 = new kg6("Initialized", 1);
        n = kg6Var2;
        kg6 kg6Var3 = new kg6("Pending", 2);
        f1263o = kg6Var3;
        kg6 kg6Var4 = new kg6("Started", 3);
        p = kg6Var4;
        kg6 kg6Var5 = new kg6("Stopped", 4);
        q = kg6Var5;
        kg6 kg6Var6 = new kg6("Error", 5);
        r = kg6Var6;
        s = new kg6[]{kg6Var, kg6Var2, kg6Var3, kg6Var4, kg6Var5, kg6Var6, new kg6("Disabled", 6)};
    }

    public static kg6 valueOf(String str) {
        return (kg6) Enum.valueOf(kg6.class, str);
    }

    public static kg6[] values() {
        return (kg6[]) s.clone();
    }
}
