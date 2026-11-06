package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d21 {
    public static final d21 m;
    public static final /* synthetic */ d21[] n;

    /* JADX INFO: Fake field, exist only in values array */
    d21 EF0;

    static {
        d21 d21Var = new d21("ALWAYS_OVERRIDE", 0);
        d21 d21Var2 = new d21("HIGH_PRIORITY_REQUIRED", 1);
        d21 d21Var3 = new d21("REQUIRED", 2);
        d21 d21Var4 = new d21("OPTIONAL", 3);
        m = d21Var4;
        n = new d21[]{d21Var, d21Var2, d21Var3, d21Var4};
    }

    public static d21 valueOf(String str) {
        return (d21) Enum.valueOf(d21.class, str);
    }

    public static d21[] values() {
        return (d21[]) n.clone();
    }
}
