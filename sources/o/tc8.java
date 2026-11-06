package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tc8 {
    public static final tc8 m;
    public static final tc8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tc8[] f2100o;

    /* JADX INFO: Fake field, exist only in values array */
    tc8 EF0;

    static {
        tc8 tc8Var = new tc8("STRICT", 0);
        tc8 tc8Var2 = new tc8("LOG", 1);
        m = tc8Var2;
        tc8 tc8Var3 = new tc8("QUIET", 2);
        n = tc8Var3;
        f2100o = new tc8[]{tc8Var, tc8Var2, tc8Var3};
    }

    public static tc8 valueOf(String str) {
        return (tc8) Enum.valueOf(tc8.class, str);
    }

    public static tc8[] values() {
        return (tc8[]) f2100o.clone();
    }
}
