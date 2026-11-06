package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pc7 {
    public static final pc7 m;
    public static final pc7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final pc7 f1726o;
    public static final pc7 p;
    public static final pc7 q;
    public static final pc7 r;
    public static final /* synthetic */ pc7[] s;

    static {
        pc7 pc7Var = new pc7("Untouched", 0);
        m = pc7Var;
        pc7 pc7Var2 = new pc7("Unchanged", 1);
        n = pc7Var2;
        pc7 pc7Var3 = new pc7("Changed", 2);
        f1726o = pc7Var3;
        pc7 pc7Var4 = new pc7("Inserted", 3);
        p = pc7Var4;
        pc7 pc7Var5 = new pc7("Interrupted", 4);
        q = pc7Var5;
        pc7 pc7Var6 = new pc7("Removing", 5);
        r = pc7Var6;
        s = new pc7[]{pc7Var, pc7Var2, pc7Var3, pc7Var4, pc7Var5, pc7Var6};
    }

    public static pc7 valueOf(String str) {
        return (pc7) Enum.valueOf(pc7.class, str);
    }

    public static pc7[] values() {
        return (pc7[]) s.clone();
    }
}
