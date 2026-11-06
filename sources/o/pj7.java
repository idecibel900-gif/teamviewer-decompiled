package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pj7 implements i10 {
    public static final pj7 m;
    public static final /* synthetic */ pj7[] n;

    static {
        pj7 pj7Var = new pj7("MonitorNumber", 0);
        m = pj7Var;
        n = new pj7[]{pj7Var};
    }

    public static pj7 valueOf(String str) {
        return (pj7) Enum.valueOf(pj7.class, str);
    }

    public static pj7[] values() {
        return (pj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 0;
    }
}
