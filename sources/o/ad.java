package o;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends ny2 {
    private static final ad DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile jg5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private cd params_;
    private int version_;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        ny2.l(ad.class, adVar);
    }

    public static zc o() {
        return (zc) DEFAULT_INSTANCE.e();
    }

    public static ad p(yh0 yh0Var, cg2 cg2Var) {
        return (ad) ny2.j(DEFAULT_INSTANCE, yh0Var, cg2Var);
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new ad();
            case 4:
                return new zc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (ad.class) {
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

    public final int m() {
        return this.keySize_;
    }

    public final cd n() {
        cd cdVar = this.params_;
        return cdVar == null ? cd.n() : cdVar;
    }

    public final void q() {
        this.keySize_ = 32;
    }

    public final void r(cd cdVar) {
        this.params_ = cdVar;
    }
}
