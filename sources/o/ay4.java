package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ay4 {
    public static final ay4 m;
    public static final ay4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ay4 f374o;
    public static final /* synthetic */ ay4[] p;

    static {
        ay4 ay4Var = new ay4("Default", 0);
        m = ay4Var;
        ay4 ay4Var2 = new ay4("UserInput", 1);
        n = ay4Var2;
        ay4 ay4Var3 = new ay4("PreventUserInput", 2);
        f374o = ay4Var3;
        p = new ay4[]{ay4Var, ay4Var2, ay4Var3};
    }

    public static ay4 valueOf(String str) {
        return (ay4) Enum.valueOf(ay4.class, str);
    }

    public static ay4[] values() {
        return (ay4[]) p.clone();
    }
}
