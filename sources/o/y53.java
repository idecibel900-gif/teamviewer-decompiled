package o;

/* JADX INFO: loaded from: classes.dex */
public final class y53 extends ny2 {
    private static final y53 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile jg5 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        y53 y53Var = new y53();
        DEFAULT_INSTANCE = y53Var;
        ny2.l(y53.class, y53Var);
    }

    public static y53 m() {
        return DEFAULT_INSTANCE;
    }

    @Override // o.ny2
    public final Object f(int i) {
        jg5 hy2Var;
        switch (ua5.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v06(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new y53();
            case 4:
                return new pc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (y53.class) {
                    try {
                        hy2Var = PARSER;
                        if (hy2Var == null) {
                            hy2Var = new hy2();
                            PARSER = hy2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return hy2Var;
            default:
                gk0.u();
                return null;
        }
    }

    public final b53 n() {
        b53 b53VarA = b53.a(this.hash_);
        return b53VarA == null ? b53.UNRECOGNIZED : b53VarA;
    }

    public final int o() {
        return this.tagSize_;
    }
}
