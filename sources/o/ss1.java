package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 {
    public static final ss1 m;
    public static final ss1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ss1 f2046o;
    public static final /* synthetic */ ss1[] p;

    static {
        ss1 ss1Var = new ss1("RemoteControl", 0);
        m = ss1Var;
        ss1 ss1Var2 = new ss1("PromptForConfirmation", 1);
        n = ss1Var2;
        ss1 ss1Var3 = new ss1("FileTransfer", 2);
        f2046o = ss1Var3;
        p = new ss1[]{ss1Var, ss1Var2, ss1Var3};
    }

    public static ss1 valueOf(String str) {
        return (ss1) Enum.valueOf(ss1.class, str);
    }

    public static ss1[] values() {
        return (ss1[]) p.clone();
    }
}
