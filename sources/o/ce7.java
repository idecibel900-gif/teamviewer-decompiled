package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ce7 {
    public static final ce7 m;
    public static final ce7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ce7[] f519o;

    static {
        ce7 ce7Var = new ce7("Free", 0);
        m = ce7Var;
        ce7 ce7Var2 = new ce7("Business", 1);
        n = ce7Var2;
        f519o = new ce7[]{ce7Var, ce7Var2};
    }

    public static ce7 valueOf(String str) {
        return (ce7) Enum.valueOf(ce7.class, str);
    }

    public static ce7[] values() {
        return (ce7[]) f519o.clone();
    }
}
