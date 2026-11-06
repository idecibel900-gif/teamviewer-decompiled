package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ms0 {
    public static final ms0 m;
    public static final ms0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ms0 f1501o;
    public static final ms0 p;
    public static final ms0 q;
    public static final ms0 r;
    public static final /* synthetic */ ms0[] s;

    static {
        ms0 ms0Var = new ms0("CLASS", 0);
        m = ms0Var;
        ms0 ms0Var2 = new ms0("INTERFACE", 1);
        n = ms0Var2;
        ms0 ms0Var3 = new ms0("ENUM_CLASS", 2);
        f1501o = ms0Var3;
        ms0 ms0Var4 = new ms0("ENUM_ENTRY", 3);
        p = ms0Var4;
        ms0 ms0Var5 = new ms0("ANNOTATION_CLASS", 4);
        q = ms0Var5;
        ms0 ms0Var6 = new ms0("OBJECT", 5);
        r = ms0Var6;
        s = new ms0[]{ms0Var, ms0Var2, ms0Var3, ms0Var4, ms0Var5, ms0Var6};
    }

    public static ms0 valueOf(String str) {
        return (ms0) Enum.valueOf(ms0.class, str);
    }

    public static ms0[] values() {
        return (ms0[]) s.clone();
    }

    public final boolean a() {
        return this == r || this == p;
    }
}
