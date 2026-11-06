package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z48 {
    public static final x48 m;
    public static final v48 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y48 f2669o;
    public static final w48 p;
    public static final /* synthetic */ z48[] q;

    static {
        x48 x48Var = new x48();
        m = x48Var;
        v48 v48Var = new v48();
        n = v48Var;
        y48 y48Var = new y48();
        f2669o = y48Var;
        w48 w48Var = new w48();
        p = w48Var;
        q = new z48[]{x48Var, v48Var, y48Var, w48Var};
    }

    public static z48 b(m98 m98Var) {
        m98Var.getClass();
        if (m98Var.p0()) {
            return n;
        }
        return db8.G(g68.n(false, null, 24), bt1.I(m98Var), h48.b) ? p : f2669o;
    }

    public static z48 valueOf(String str) {
        return (z48) Enum.valueOf(z48.class, str);
    }

    public static z48[] values() {
        return (z48[]) q.clone();
    }

    public z48 a(m98 m98Var) {
        m98Var.getClass();
        return b(m98Var);
    }
}
