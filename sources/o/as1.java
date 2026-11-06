package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class as1 {
    public static final as1 m;
    public static final as1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final as1 f353o;
    public static final /* synthetic */ as1[] p;

    static {
        as1 as1Var = new as1("Desktop", 0);
        m = as1Var;
        as1 as1Var2 = new as1("Mobile", 1);
        n = as1Var2;
        as1 as1Var3 = new as1("Unknown", 2);
        f353o = as1Var3;
        p = new as1[]{as1Var, as1Var2, as1Var3};
    }

    public static as1 valueOf(String str) {
        return (as1) Enum.valueOf(as1.class, str);
    }

    public static as1[] values() {
        return (as1[]) p.clone();
    }
}
