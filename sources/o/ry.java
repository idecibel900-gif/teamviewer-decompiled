package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ry {
    public static final ry m;
    public static final ry n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ry f1964o;
    public static final /* synthetic */ ry[] p;

    static {
        ry ryVar = new ry("UNKNOWN", 0);
        m = ryVar;
        ry ryVar2 = new ry("ERROR", 1);
        n = ryVar2;
        ry ryVar3 = new ry("PAUSED", 2);
        ry ryVar4 = new ry("RECORDING", 3);
        f1964o = ryVar4;
        p = new ry[]{ryVar, ryVar2, ryVar3, ryVar4};
    }

    public static ry valueOf(String str) {
        return (ry) Enum.valueOf(ry.class, str);
    }

    public static ry[] values() {
        return (ry[]) p.clone();
    }
}
