package o;

/* JADX INFO: loaded from: classes.dex */
public final class yc extends ny2 {
    private static final yc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jg5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yh0 keyValue_ = yh0.n;
    private cd params_;
    private int version_;

    static {
        yc ycVar = new yc();
        DEFAULT_INSTANCE = ycVar;
        ny2.l(yc.class, ycVar);
    }

    public static xc p() {
        return (xc) DEFAULT_INSTANCE.e();
    }

    public static yc q(yh0 yh0Var, cg2 cg2Var) {
        return (yc) ny2.j(DEFAULT_INSTANCE, yh0Var, cg2Var);
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new yc();
            case 4:
                return new xc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (yc.class) {
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

    public final yh0 m() {
        return this.keyValue_;
    }

    public final cd n() {
        cd cdVar = this.params_;
        return cdVar == null ? cd.n() : cdVar;
    }

    public final int o() {
        return this.version_;
    }

    public final void r(vh0 vh0Var) {
        this.keyValue_ = vh0Var;
    }

    public final void s(cd cdVar) {
        cdVar.getClass();
        this.params_ = cdVar;
    }

    public final void t() {
        this.version_ = 0;
    }
}
