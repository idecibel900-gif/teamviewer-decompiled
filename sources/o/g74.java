package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g74 {
    public static final g74 m;
    public static final /* synthetic */ g74[] n;

    static {
        g74 g74Var = new g74("Traditional", 0);
        m = g74Var;
        n = new g74[]{g74Var, new g74("Refined", 1)};
    }

    public static g74 valueOf(String str) {
        return (g74) Enum.valueOf(g74.class, str);
    }

    public static g74[] values() {
        return (g74[]) n.clone();
    }
}
