package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xi7 implements i10 {
    public static final xi7 m;
    public static final /* synthetic */ xi7[] n;

    static {
        xi7 xi7Var = new xi7("Text", 0);
        m = xi7Var;
        n = new xi7[]{xi7Var};
    }

    public static xi7 valueOf(String str) {
        return (xi7) Enum.valueOf(xi7.class, str);
    }

    public static xi7[] values() {
        return (xi7[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 0;
    }
}
