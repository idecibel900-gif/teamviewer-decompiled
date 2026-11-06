package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v38 {
    public static final v38 m;
    public static final v38 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v38 f2273o;
    public static final v38 p;
    public static final /* synthetic */ v38[] q;

    static {
        v38 v38Var = new v38("SUCCESSFUL", 0);
        m = v38Var;
        v38 v38Var2 = new v38("REREGISTER", 1);
        n = v38Var2;
        v38 v38Var3 = new v38("CANCELLED", 2);
        f2273o = v38Var3;
        v38 v38Var4 = new v38("ALREADY_SELECTED", 3);
        p = v38Var4;
        q = new v38[]{v38Var, v38Var2, v38Var3, v38Var4};
    }

    public static v38 valueOf(String str) {
        return (v38) Enum.valueOf(v38.class, str);
    }

    public static v38[] values() {
        return (v38[]) q.clone();
    }
}
