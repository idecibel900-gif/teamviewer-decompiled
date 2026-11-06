package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class as4 {
    public static final ir m;
    public static final as4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final as4 f355o;
    public static final as4 p;
    public static final as4 q;
    public static final /* synthetic */ as4[] r;

    static {
        as4 as4Var = new as4("FINAL", 0);
        n = as4Var;
        as4 as4Var2 = new as4("SEALED", 1);
        f355o = as4Var2;
        as4 as4Var3 = new as4("OPEN", 2);
        p = as4Var3;
        as4 as4Var4 = new as4("ABSTRACT", 3);
        q = as4Var4;
        r = new as4[]{as4Var, as4Var2, as4Var3, as4Var4};
        m = new ir((byte) 27);
    }

    public static as4 valueOf(String str) {
        return (as4) Enum.valueOf(as4.class, str);
    }

    public static as4[] values() {
        return (as4[]) r.clone();
    }
}
