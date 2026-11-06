package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class po4 implements i10 {
    public static final po4 m;
    public static final /* synthetic */ po4[] n;

    static {
        po4 po4Var = new po4("MeetingStreamSubscribeEnable", 0);
        m = po4Var;
        n = new po4[]{po4Var};
    }

    public static po4 valueOf(String str) {
        return (po4) Enum.valueOf(po4.class, str);
    }

    public static po4[] values() {
        return (po4[]) n.clone();
    }

    @Override // o.i10
    public final byte a() {
        return (byte) 100;
    }
}
