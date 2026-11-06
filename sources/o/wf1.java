package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 {
    public static final wf1 m;
    public static final wf1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wf1 f2408o;
    public static final /* synthetic */ wf1[] p;

    static {
        wf1 wf1Var = new wf1("None", 0);
        m = wf1Var;
        wf1 wf1Var2 = new wf1("Cancelled", 1);
        n = wf1Var2;
        wf1 wf1Var3 = new wf1("Redirected", 2);
        f2408o = wf1Var3;
        p = new wf1[]{wf1Var, wf1Var2, wf1Var3, new wf1("RedirectCancelled", 3)};
    }

    public static wf1 valueOf(String str) {
        return (wf1) Enum.valueOf(wf1.class, str);
    }

    public static wf1[] values() {
        return (wf1[]) p.clone();
    }
}
