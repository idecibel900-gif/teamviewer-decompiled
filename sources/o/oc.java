package o;

/* JADX INFO: loaded from: classes.dex */
public final class oc extends ny2 {
    private static final oc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jg5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yh0 keyValue_ = yh0.n;
    private uc params_;
    private int version_;

    static {
        oc ocVar = new oc();
        DEFAULT_INSTANCE = ocVar;
        ny2.l(oc.class, ocVar);
    }

    public static nc p() {
        return (nc) DEFAULT_INSTANCE.e();
    }

    public static oc q(yh0 yh0Var, cg2 cg2Var) {
        return (oc) ny2.j(DEFAULT_INSTANCE, yh0Var, cg2Var);
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
                return new oc();
            case 4:
                return new nc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (oc.class) {
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

    public final uc n() {
        uc ucVar = this.params_;
        return ucVar == null ? uc.n() : ucVar;
    }

    public final int o() {
        return this.version_;
    }

    public final void r(vh0 vh0Var) {
        this.keyValue_ = vh0Var;
    }

    public final void s(uc ucVar) {
        ucVar.getClass();
        this.params_ = ucVar;
    }

    public final void t() {
        this.version_ = 0;
    }
}
