package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class au5 {
    public static final au5 m;
    public static final au5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ au5[] f362o;

    /* JADX INFO: Fake field, exist only in values array */
    au5 EF0;

    static {
        au5 au5Var = new au5("PRETTY", 0);
        au5 au5Var2 = new au5("DEBUG", 1);
        m = au5Var2;
        au5 au5Var3 = new au5("NONE", 2);
        n = au5Var3;
        f362o = new au5[]{au5Var, au5Var2, au5Var3};
    }

    public static au5 valueOf(String str) {
        return (au5) Enum.valueOf(au5.class, str);
    }

    public static au5[] values() {
        return (au5[]) f362o.clone();
    }
}
