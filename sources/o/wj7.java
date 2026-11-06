package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wj7 implements i10 {
    public static final wj7 m;
    public static final /* synthetic */ wj7[] n;

    static {
        wj7 wj7Var = new wj7("Number", 0);
        m = wj7Var;
        n = new wj7[]{wj7Var};
    }

    public static wj7 valueOf(String str) {
        return (wj7) Enum.valueOf(wj7.class, str);
    }

    public static wj7[] values() {
        return (wj7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 0;
    }
}
