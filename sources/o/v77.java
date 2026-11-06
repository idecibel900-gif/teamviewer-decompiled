package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v77 {
    public static final v77 m;
    public static final v77 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v77 f2283o;
    public static final /* synthetic */ v77[] p;

    static {
        v77 v77Var = new v77("ONE_COLLECTION_PARAMETER", 0);
        m = v77Var;
        v77 v77Var2 = new v77("OBJECT_PARAMETER_NON_GENERIC", 1);
        n = v77Var2;
        v77 v77Var3 = new v77("OBJECT_PARAMETER_GENERIC", 2);
        f2283o = v77Var3;
        p = new v77[]{v77Var, v77Var2, v77Var3};
    }

    public static v77 valueOf(String str) {
        return (v77) Enum.valueOf(v77.class, str);
    }

    public static v77[] values() {
        return (v77[]) p.clone();
    }
}
