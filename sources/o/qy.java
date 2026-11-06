package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qy {
    public static final qy m;
    public static final qy n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qy f1876o;
    public static final /* synthetic */ qy[] p;

    static {
        qy qyVar = new qy("UNKNOWN", 0);
        m = qyVar;
        qy qyVar2 = new qy("ERROR", 1);
        n = qyVar2;
        qy qyVar3 = new qy("PAUSED", 2);
        qy qyVar4 = new qy("PLAYING", 3);
        f1876o = qyVar4;
        p = new qy[]{qyVar, qyVar2, qyVar3, qyVar4};
    }

    public static qy valueOf(String str) {
        return (qy) Enum.valueOf(qy.class, str);
    }

    public static qy[] values() {
        return (qy[]) p.clone();
    }
}
