package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ih8 {
    public static final ih8 m;
    public static final ih8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ih8[] f1061o;

    static {
        ih8 ih8Var = new ih8("SignIn", 0);
        m = ih8Var;
        ih8 ih8Var2 = new ih8("SignUp", 1);
        n = ih8Var2;
        f1061o = new ih8[]{ih8Var, ih8Var2};
    }

    public static ih8 valueOf(String str) {
        return (ih8) Enum.valueOf(ih8.class, str);
    }

    public static ih8[] values() {
        return (ih8[]) f1061o.clone();
    }
}
