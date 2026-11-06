package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y04 {
    public static final y04 m;
    public static final y04 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y04 f2568o;
    public static final y04 p;
    public static final y04 q;
    public static final /* synthetic */ y04[] r;

    static {
        y04 y04Var = new y04("Measuring", 0);
        m = y04Var;
        y04 y04Var2 = new y04("LookaheadMeasuring", 1);
        n = y04Var2;
        y04 y04Var3 = new y04("LayingOut", 2);
        f2568o = y04Var3;
        y04 y04Var4 = new y04("LookaheadLayingOut", 3);
        p = y04Var4;
        y04 y04Var5 = new y04("Idle", 4);
        q = y04Var5;
        r = new y04[]{y04Var, y04Var2, y04Var3, y04Var4, y04Var5};
    }

    public static y04 valueOf(String str) {
        return (y04) Enum.valueOf(y04.class, str);
    }

    public static y04[] values() {
        return (y04[]) r.clone();
    }
}
