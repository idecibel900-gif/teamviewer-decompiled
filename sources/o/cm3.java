package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cm3 {
    public static final cm3 m;
    public static final cm3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cm3[] f539o;

    static {
        cm3 cm3Var = new cm3("Min", 0);
        m = cm3Var;
        cm3 cm3Var2 = new cm3("Max", 1);
        n = cm3Var2;
        f539o = new cm3[]{cm3Var, cm3Var2};
    }

    public static cm3 valueOf(String str) {
        return (cm3) Enum.valueOf(cm3.class, str);
    }

    public static cm3[] values() {
        return (cm3[]) f539o.clone();
    }
}
