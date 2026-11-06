package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vt7 implements my5 {
    public static final rk5 m;
    public static final vt7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vt7 f2345o;
    public static final /* synthetic */ vt7[] p;

    static {
        vt7 vt7Var = new vt7("LIGHT", 0);
        n = vt7Var;
        vt7 vt7Var2 = new vt7("DARK", 1);
        f2345o = vt7Var2;
        p = new vt7[]{vt7Var, vt7Var2};
        m = new rk5((byte) 13);
    }

    public static vt7 valueOf(String str) {
        return (vt7) Enum.valueOf(vt7.class, str);
    }

    public static vt7[] values() {
        return (vt7[]) p.clone();
    }
}
