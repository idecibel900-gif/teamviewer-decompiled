package o;

/* JADX INFO: loaded from: classes.dex */
public final class k96 extends ny2 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final k96 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile jg5 PARSER;
    private String configName_ = "";
    private ql3 entry_ = ww5.p;

    static {
        k96 k96Var = new k96();
        DEFAULT_INSTANCE = k96Var;
        ny2.l(k96.class, k96Var);
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", rx3.class});
            case 3:
                return new k96();
            case 4:
                return new pc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (k96.class) {
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
}
