package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r74 {
    public static final r74 m;
    public static final r74 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r74[] f1898o;

    /* JADX INFO: Fake field, exist only in values array */
    r74 EF0;

    static {
        r74 r74Var = new r74("None", 0);
        r74 r74Var2 = new r74("Inline", 1);
        m = r74Var2;
        r74 r74Var3 = new r74("Sheet", 2);
        n = r74Var3;
        f1898o = new r74[]{r74Var, r74Var2, r74Var3, new r74("Dialog", 3)};
    }

    public static r74 valueOf(String str) {
        return (r74) Enum.valueOf(r74.class, str);
    }

    public static r74[] values() {
        return (r74[]) f1898o.clone();
    }
}
