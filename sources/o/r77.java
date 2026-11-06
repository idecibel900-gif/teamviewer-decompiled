package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r77 {
    public static final r77 m;
    public static final r77 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r77 f1900o;
    public static final /* synthetic */ r77[] p;

    static {
        r77 r77Var = new r77("NONE", 0);
        m = r77Var;
        r77 r77Var2 = new r77("ADDING", 1);
        n = r77Var2;
        r77 r77Var3 = new r77("REMOVING", 2);
        f1900o = r77Var3;
        p = new r77[]{r77Var, r77Var2, r77Var3};
    }

    public static r77 valueOf(String str) {
        return (r77) Enum.valueOf(r77.class, str);
    }

    public static r77[] values() {
        return (r77[]) p.clone();
    }
}
