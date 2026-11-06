package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mi5 {
    public static final mi5 m;
    public static final /* synthetic */ mi5[] n;

    /* JADX INFO: Fake field, exist only in values array */
    mi5 EF0;

    static {
        mi5 mi5Var = new mi5("Invalid", 0);
        mi5 mi5Var2 = new mi5("ManagedDeviceV2", 1);
        m = mi5Var2;
        n = new mi5[]{mi5Var, mi5Var2};
    }

    public static mi5 valueOf(String str) {
        return (mi5) Enum.valueOf(mi5.class, str);
    }

    public static mi5[] values() {
        return (mi5[]) n.clone();
    }
}
