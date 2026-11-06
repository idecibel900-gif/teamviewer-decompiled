package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l84 {
    private static final /* synthetic */ ic2 $ENTRIES;
    private static final /* synthetic */ l84[] $VALUES;
    public static final j84 Companion;
    public static final l84 ON_ANY;
    public static final l84 ON_CREATE;
    public static final l84 ON_DESTROY;
    public static final l84 ON_PAUSE;
    public static final l84 ON_RESUME;
    public static final l84 ON_START;
    public static final l84 ON_STOP;

    static {
        l84 l84Var = new l84("ON_CREATE", 0);
        ON_CREATE = l84Var;
        l84 l84Var2 = new l84("ON_START", 1);
        ON_START = l84Var2;
        l84 l84Var3 = new l84("ON_RESUME", 2);
        ON_RESUME = l84Var3;
        l84 l84Var4 = new l84("ON_PAUSE", 3);
        ON_PAUSE = l84Var4;
        l84 l84Var5 = new l84("ON_STOP", 4);
        ON_STOP = l84Var5;
        l84 l84Var6 = new l84("ON_DESTROY", 5);
        ON_DESTROY = l84Var6;
        l84 l84Var7 = new l84("ON_ANY", 6);
        ON_ANY = l84Var7;
        l84[] l84VarArr = {l84Var, l84Var2, l84Var3, l84Var4, l84Var5, l84Var6, l84Var7};
        $VALUES = l84VarArr;
        $ENTRIES = new jc2(l84VarArr);
        Companion = new j84();
    }

    public static l84 valueOf(String str) {
        return (l84) Enum.valueOf(l84.class, str);
    }

    public static l84[] values() {
        return (l84[]) $VALUES.clone();
    }

    public final m84 a() {
        switch (k84.a[ordinal()]) {
            case 1:
            case 2:
                return m84.f1446o;
            case 3:
            case 4:
                return m84.p;
            case 5:
                return m84.q;
            case 6:
                return m84.m;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                gk0.s();
                return null;
        }
    }
}
