package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 {
    public static final mt0 m;
    public static final /* synthetic */ mt0[] n;

    /* JADX INFO: Fake field, exist only in values array */
    mt0 EF0;

    static {
        mt0 mt0Var = new mt0("UNKNOWN", 0);
        mt0 mt0Var2 = new mt0("ANDROID_FIREBASE", 1);
        m = mt0Var2;
        n = new mt0[]{mt0Var, mt0Var2};
    }

    public static mt0 valueOf(String str) {
        return (mt0) Enum.valueOf(mt0.class, str);
    }

    public static mt0[] values() {
        return (mt0[]) n.clone();
    }
}
