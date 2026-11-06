package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class as3 {
    public static final as3 m;
    public static final as3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final as3 f354o;
    public static final as3 p;
    public static final as3 q;
    public static final /* synthetic */ as3[] r;

    static {
        as3 as3Var = new as3("HIDDEN", 0);
        m = as3Var;
        as3 as3Var2 = new as3("VISIBLE", 1);
        n = as3Var2;
        as3 as3Var3 = new as3("DEPRECATED_LIST_METHODS", 2);
        f354o = as3Var3;
        as3 as3Var4 = new as3("NOT_CONSIDERED", 3);
        p = as3Var4;
        as3 as3Var5 = new as3("DROP", 4);
        q = as3Var5;
        r = new as3[]{as3Var, as3Var2, as3Var3, as3Var4, as3Var5};
    }

    public static as3 valueOf(String str) {
        return (as3) Enum.valueOf(as3.class, str);
    }

    public static as3[] values() {
        return (as3[]) r.clone();
    }
}
