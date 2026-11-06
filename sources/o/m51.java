package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m51 {
    public static final m51 m;
    public static final m51 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ m51[] f1436o;

    static {
        m51 m51Var = new m51("Connected", 0);
        m = m51Var;
        m51 m51Var2 = new m51("Offline", 1);
        n = m51Var2;
        f1436o = new m51[]{m51Var, m51Var2};
    }

    public static m51 valueOf(String str) {
        return (m51) Enum.valueOf(m51.class, str);
    }

    public static m51[] values() {
        return (m51[]) f1436o.clone();
    }
}
