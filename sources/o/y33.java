package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y33 {
    public static final y33 m;
    public static final y33 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y33 f2574o;
    public static final y33 p;
    public static final /* synthetic */ y33[] q;

    static {
        y33 y33Var = new y33("ADD_OPTIONS", 0);
        m = y33Var;
        y33 y33Var2 = new y33("ADD_REMOTE_DEVICE_VIA_ID", 1);
        n = y33Var2;
        y33 y33Var3 = new y33("ADD_REMOTE_DEVICE_TO_YOUR_ACCOUNT", 2);
        f2574o = y33Var3;
        y33 y33Var4 = new y33("ADD_CONTACT", 3);
        p = y33Var4;
        q = new y33[]{y33Var, y33Var2, y33Var3, y33Var4};
    }

    public static y33 valueOf(String str) {
        return (y33) Enum.valueOf(y33.class, str);
    }

    public static y33[] values() {
        return (y33[]) q.clone();
    }
}
