package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ba {
    public static final ba m;
    public static final ba n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ba[] f409o;

    static {
        ba baVar = new ba("DEFAULT", 0);
        m = baVar;
        ba baVar2 = new ba("NO_PERMISSION", 1);
        n = baVar2;
        f409o = new ba[]{baVar, baVar2};
    }

    public static ba valueOf(String str) {
        return (ba) Enum.valueOf(ba.class, str);
    }

    public static ba[] values() {
        return (ba[]) f409o.clone();
    }
}
