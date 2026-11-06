package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qa6 {
    public static final pa6 m;
    public static final oa6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ qa6[] f1816o;

    static {
        pa6 pa6Var = new pa6();
        m = pa6Var;
        oa6 oa6Var = new oa6();
        n = oa6Var;
        f1816o = new qa6[]{pa6Var, oa6Var};
    }

    public static qa6 valueOf(String str) {
        return (qa6) Enum.valueOf(qa6.class, str);
    }

    public static qa6[] values() {
        return (qa6[]) f1816o.clone();
    }

    public String a(String str) {
        return bc7.L(bc7.L(str, "<", "&lt;"), ">", "&gt;");
    }
}
