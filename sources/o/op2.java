package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class op2 {
    public static final op2 m;
    public static final /* synthetic */ op2[] n;

    /* JADX INFO: Fake field, exist only in values array */
    op2 EF0;

    static {
        op2 op2Var = new op2("Visible", 0);
        op2 op2Var2 = new op2("Clip", 1);
        m = op2Var2;
        n = new op2[]{op2Var, op2Var2, new op2("ExpandIndicator", 2), new op2("ExpandOrCollapseIndicator", 3)};
    }

    public static op2 valueOf(String str) {
        return (op2) Enum.valueOf(op2.class, str);
    }

    public static op2[] values() {
        return (op2[]) n.clone();
    }
}
