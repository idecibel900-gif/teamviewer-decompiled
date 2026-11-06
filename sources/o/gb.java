package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gb {
    public static final gb m;
    public static final gb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gb f877o;
    public static final gb p;
    public static final /* synthetic */ gb[] q;

    static {
        gb gbVar = new gb("DEFAULT", 0);
        m = gbVar;
        gb gbVar2 = new gb("LOADING", 1);
        n = gbVar2;
        gb gbVar3 = new gb("NO_PERMISSION_GENERAL", 2);
        f877o = gbVar3;
        gb gbVar4 = new gb("NO_PERMISSION_GROUP", 3);
        p = gbVar4;
        q = new gb[]{gbVar, gbVar2, gbVar3, gbVar4};
    }

    public static gb valueOf(String str) {
        return (gb) Enum.valueOf(gb.class, str);
    }

    public static gb[] values() {
        return (gb[]) q.clone();
    }
}
