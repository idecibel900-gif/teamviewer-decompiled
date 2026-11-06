package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fo {
    public static final fo m;
    public static final fo n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ fo[] f817o;

    static {
        fo foVar = new fo("BoundReached", 0);
        m = foVar;
        fo foVar2 = new fo("Finished", 1);
        n = foVar2;
        f817o = new fo[]{foVar, foVar2};
    }

    public static fo valueOf(String str) {
        return (fo) Enum.valueOf(fo.class, str);
    }

    public static fo[] values() {
        return (fo[]) f817o.clone();
    }
}
