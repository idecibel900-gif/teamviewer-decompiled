package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sy {
    public static final sy m;
    public static final sy n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sy f2065o;
    public static final sy p;
    public static final /* synthetic */ sy[] q;

    static {
        sy syVar = new sy("UNKNOWN", 0);
        m = syVar;
        sy syVar2 = new sy("ERROR", 1);
        n = syVar2;
        sy syVar3 = new sy("PAUSED", 2);
        f2065o = syVar3;
        sy syVar4 = new sy("PLAYING", 3);
        p = syVar4;
        q = new sy[]{syVar, syVar2, syVar3, syVar4};
    }

    public static sy valueOf(String str) {
        return (sy) Enum.valueOf(sy.class, str);
    }

    public static sy[] values() {
        return (sy[]) q.clone();
    }
}
