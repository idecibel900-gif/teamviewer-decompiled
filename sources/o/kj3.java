package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kj3 {
    public static final kj3 m;
    public static final kj3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kj3 f1271o;
    public static final /* synthetic */ kj3[] p;

    static {
        kj3 kj3Var = new kj3("Focused", 0);
        m = kj3Var;
        kj3 kj3Var2 = new kj3("UnfocusedEmpty", 1);
        n = kj3Var2;
        kj3 kj3Var3 = new kj3("UnfocusedNotEmpty", 2);
        f1271o = kj3Var3;
        p = new kj3[]{kj3Var, kj3Var2, kj3Var3};
    }

    public static kj3 valueOf(String str) {
        return (kj3) Enum.valueOf(kj3.class, str);
    }

    public static kj3[] values() {
        return (kj3[]) p.clone();
    }
}
