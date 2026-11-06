package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class np {
    public static final np m;
    public static final np n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final np f1588o;
    public static final np p;
    public static final np q;
    public static final np r;
    public static final np s;
    public static final /* synthetic */ np[] t;

    static {
        np npVar = new np("Paragraph", 0);
        m = npVar;
        np npVar2 = new np("Span", 1);
        n = npVar2;
        np npVar3 = new np("VerbatimTts", 2);
        f1588o = npVar3;
        np npVar4 = new np("Url", 3);
        p = npVar4;
        np npVar5 = new np("Link", 4);
        q = npVar5;
        np npVar6 = new np("Clickable", 5);
        r = npVar6;
        np npVar7 = new np("String", 6);
        s = npVar7;
        t = new np[]{npVar, npVar2, npVar3, npVar4, npVar5, npVar6, npVar7};
    }

    public static np valueOf(String str) {
        return (np) Enum.valueOf(np.class, str);
    }

    public static np[] values() {
        return (np[]) t.clone();
    }
}
