package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c74 {
    public static final c74 m;
    public static final /* synthetic */ c74[] n;

    static {
        c74 c74Var = new c74("Cozy", 0);
        m = c74Var;
        n = new c74[]{c74Var, new c74("Compact", 1)};
    }

    public static c74 valueOf(String str) {
        return (c74) Enum.valueOf(c74.class, str);
    }

    public static c74[] values() {
        return (c74[]) n.clone();
    }
}
