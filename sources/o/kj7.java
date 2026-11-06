package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kj7 implements i10 {
    public static final kj7 m;
    public static final /* synthetic */ kj7[] n;

    static {
        kj7 kj7Var = new kj7("TVCmdMMDataData", 0);
        m = kj7Var;
        n = new kj7[]{kj7Var};
    }

    public static kj7 valueOf(String str) {
        return (kj7) Enum.valueOf(kj7.class, str);
    }

    public static kj7[] values() {
        return (kj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 1;
    }
}
