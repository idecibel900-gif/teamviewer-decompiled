package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class go6 {
    public static final go6 m;
    public static final /* synthetic */ go6[] n;

    static {
        go6 go6Var = new go6("EditableText", 0);
        m = go6Var;
        n = new go6[]{go6Var, new go6("StaticText", 1)};
    }

    public static go6 valueOf(String str) {
        return (go6) Enum.valueOf(go6.class, str);
    }

    public static go6[] values() {
        return (go6[]) n.clone();
    }
}
