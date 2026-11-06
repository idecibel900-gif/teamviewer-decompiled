package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rj7 implements i10 {
    public static final rj7 m;
    public static final /* synthetic */ rj7[] n;

    static {
        rj7 rj7Var = new rj7("InputState", 0);
        m = rj7Var;
        n = new rj7[]{rj7Var};
    }

    public static rj7 valueOf(String str) {
        return (rj7) Enum.valueOf(rj7.class, str);
    }

    public static rj7[] values() {
        return (rj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 0;
    }
}
