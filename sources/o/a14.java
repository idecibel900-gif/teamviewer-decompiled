package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a14 {
    public static final a14 m;
    public static final a14 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a14 f282o;
    public static final /* synthetic */ a14[] p;

    static {
        a14 a14Var = new a14("InMeasureBlock", 0);
        m = a14Var;
        a14 a14Var2 = new a14("InLayoutBlock", 1);
        n = a14Var2;
        a14 a14Var3 = new a14("NotUsed", 2);
        f282o = a14Var3;
        p = new a14[]{a14Var, a14Var2, a14Var3};
    }

    public static a14 valueOf(String str) {
        return (a14) Enum.valueOf(a14.class, str);
    }

    public static a14[] values() {
        return (a14[]) p.clone();
    }
}
