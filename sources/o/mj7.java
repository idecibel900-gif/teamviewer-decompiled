package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mj7 implements i10 {
    public static final mj7 m;
    public static final /* synthetic */ mj7[] n;

    static {
        mj7 mj7Var = new mj7("TVCmdMMQuitType", 0);
        m = mj7Var;
        n = new mj7[]{mj7Var};
    }

    public static mj7 valueOf(String str) {
        return (mj7) Enum.valueOf(mj7.class, str);
    }

    public static mj7[] values() {
        return (mj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 1;
    }
}
