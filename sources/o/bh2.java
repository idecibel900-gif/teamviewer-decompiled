package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public static final bh2 m;
    public static final bh2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bh2 f425o;
    public static final /* synthetic */ bh2[] p;

    static {
        bh2 bh2Var = new bh2("ADD_REMOTE_DEVICE", 0);
        m = bh2Var;
        bh2 bh2Var2 = new bh2("ADD_GROUP", 1);
        n = bh2Var2;
        bh2 bh2Var3 = new bh2("ADD_CONTACT", 2);
        f425o = bh2Var3;
        p = new bh2[]{bh2Var, bh2Var2, bh2Var3};
    }

    public static bh2 valueOf(String str) {
        return (bh2) Enum.valueOf(bh2.class, str);
    }

    public static bh2[] values() {
        return (bh2[]) p.clone();
    }
}
