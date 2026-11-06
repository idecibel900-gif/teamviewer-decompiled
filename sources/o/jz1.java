package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 {
    public static final jz1 m;
    public static final jz1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final jz1 f1214o;
    public static final jz1 p;
    public static final /* synthetic */ jz1[] q;

    static {
        jz1 jz1Var = new jz1("Desktop", 0);
        m = jz1Var;
        jz1 jz1Var2 = new jz1("Mobile", 1);
        n = jz1Var2;
        jz1 jz1Var3 = new jz1("IoT", 2);
        f1214o = jz1Var3;
        jz1 jz1Var4 = new jz1("NAS", 3);
        p = jz1Var4;
        q = new jz1[]{jz1Var, jz1Var2, jz1Var3, jz1Var4};
    }

    public static jz1 valueOf(String str) {
        return (jz1) Enum.valueOf(jz1.class, str);
    }

    public static jz1[] values() {
        return (jz1[]) q.clone();
    }
}
