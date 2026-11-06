package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b91 {
    public static final b91 m;
    public static final b91 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b91 f407o;
    public static final /* synthetic */ b91[] p;

    static {
        b91 b91Var = new b91("PERSONAL_CONTACT", 0);
        m = b91Var;
        b91 b91Var2 = new b91("COMPANY_CONTACT", 1);
        n = b91Var2;
        b91 b91Var3 = new b91("INVITATION_CONTACT", 2);
        f407o = b91Var3;
        p = new b91[]{b91Var, b91Var2, b91Var3};
    }

    public static b91 valueOf(String str) {
        return (b91) Enum.valueOf(b91.class, str);
    }

    public static b91[] values() {
        return (b91[]) p.clone();
    }
}
