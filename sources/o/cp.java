package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cp {
    public static final cp m;
    public static final cp n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cp[] f548o;

    static {
        cp cpVar = new cp("CALL_BY_NAME", 0);
        m = cpVar;
        cp cpVar2 = new cp("POSITIONAL_CALL", 1);
        n = cpVar2;
        f548o = new cp[]{cpVar, cpVar2};
    }

    public static cp valueOf(String str) {
        return (cp) Enum.valueOf(cp.class, str);
    }

    public static cp[] values() {
        return (cp[]) f548o.clone();
    }
}
