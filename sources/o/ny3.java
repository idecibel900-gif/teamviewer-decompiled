package o;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends ny2 {
    private static final ny3 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile jg5 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private cx3 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        ny3 ny3Var = new ny3();
        DEFAULT_INSTANCE = ny3Var;
        ny2.l(ny3.class, ny3Var);
    }

    public static my3 r() {
        return (my3) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new ny3();
            case 4:
                return new my3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (ny3.class) {
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

    public final cx3 m() {
        cx3 cx3Var = this.keyData_;
        return cx3Var == null ? cx3.m() : cx3Var;
    }

    public final int n() {
        return this.keyId_;
    }

    public final dc5 o() {
        dc5 dc5VarA = dc5.a(this.outputPrefixType_);
        return dc5VarA == null ? dc5.UNRECOGNIZED : dc5VarA;
    }

    public final ox3 p() {
        ox3 ox3Var;
        int i = this.status_;
        if (i == 0) {
            ox3Var = ox3.UNKNOWN_STATUS;
        } else if (i == 1) {
            ox3Var = ox3.ENABLED;
        } else if (i != 2) {
            ox3Var = i != 3 ? null : ox3.DESTROYED;
        } else {
            ox3Var = ox3.DISABLED;
        }
        return ox3Var == null ? ox3.UNRECOGNIZED : ox3Var;
    }

    public final boolean q() {
        return this.keyData_ != null;
    }

    public final void s(cx3 cx3Var) {
        this.keyData_ = cx3Var;
    }

    public final void t(int i) {
        this.keyId_ = i;
    }

    public final void u(dc5 dc5Var) {
        this.outputPrefixType_ = dc5Var.b();
    }

    public final void v() {
        this.status_ = ox3.ENABLED.a();
    }
}
