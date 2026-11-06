package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ty {
    public static final ty m;
    public static final ty n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ty f2154o;
    public static final ty p;
    public static final /* synthetic */ ty[] q;

    static {
        ty tyVar = new ty("UNKNOWN", 0);
        m = tyVar;
        ty tyVar2 = new ty("ERROR", 1);
        n = tyVar2;
        ty tyVar3 = new ty("PAUSED", 2);
        f2154o = tyVar3;
        ty tyVar4 = new ty("RECORDING", 3);
        p = tyVar4;
        q = new ty[]{tyVar, tyVar2, tyVar3, tyVar4};
    }

    public static ty valueOf(String str) {
        return (ty) Enum.valueOf(ty.class, str);
    }

    public static ty[] values() {
        return (ty[]) q.clone();
    }
}
