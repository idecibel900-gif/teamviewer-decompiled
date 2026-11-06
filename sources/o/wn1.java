package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wn1 {
    public static final wn1 m;
    public static final /* synthetic */ wn1[] n;

    /* JADX INFO: Fake field, exist only in values array */
    wn1 EF0;

    static {
        wn1 wn1Var = new wn1("WARNING", 0);
        wn1 wn1Var2 = new wn1("ERROR", 1);
        m = wn1Var2;
        n = new wn1[]{wn1Var, wn1Var2, new wn1("HIDDEN", 2)};
    }

    public static wn1 valueOf(String str) {
        return (wn1) Enum.valueOf(wn1.class, str);
    }

    public static wn1[] values() {
        return (wn1[]) n.clone();
    }
}
