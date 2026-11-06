package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class x77 {
    public static final x77 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x77 f2488o;
    public static final x77 p;
    public static final w77 q;
    public static final /* synthetic */ x77[] r;
    public final Object m;

    static {
        x77 x77Var = new x77(0, null, "NULL");
        n = x77Var;
        x77 x77Var2 = new x77(1, -1, "INDEX");
        f2488o = x77Var2;
        x77 x77Var3 = new x77(2, Boolean.FALSE, "FALSE");
        p = x77Var3;
        w77 w77Var = new w77(3, null, "MAP_GET_OR_DEFAULT");
        q = w77Var;
        r = new x77[]{x77Var, x77Var2, x77Var3, w77Var};
    }

    public x77(int i, Object obj, String str) {
        super(str, i);
        this.m = obj;
    }

    public static x77 valueOf(String str) {
        return (x77) Enum.valueOf(x77.class, str);
    }

    public static x77[] values() {
        return (x77[]) r.clone();
    }
}
