package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a91 {
    public static final a91 m;
    public static final a91 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a91 f309o;
    public static final a91 p;
    public static final a91 q;
    public static final /* synthetic */ a91[] r;

    static {
        a91 a91Var = new a91("ASCENDING", 0);
        m = a91Var;
        a91 a91Var2 = new a91("DESCENDING", 1);
        n = a91Var2;
        a91 a91Var3 = new a91("ONLINE", 2);
        f309o = a91Var3;
        a91 a91Var4 = new a91("OFFLINE", 3);
        p = a91Var4;
        a91 a91Var5 = new a91("PENDING", 4);
        q = a91Var5;
        r = new a91[]{a91Var, a91Var2, a91Var3, a91Var4, a91Var5};
    }

    public static a91 valueOf(String str) {
        return (a91) Enum.valueOf(a91.class, str);
    }

    public static a91[] values() {
        return (a91[]) r.clone();
    }
}
