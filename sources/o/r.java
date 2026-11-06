package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r m;
    public static final r n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r[] f1879o;

    static {
        r rVar = new r("SwipeLeft", 0);
        m = rVar;
        r rVar2 = new r("SwipeRight", 1);
        n = rVar2;
        f1879o = new r[]{rVar, rVar2};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f1879o.clone();
    }
}
