package o;

/* JADX INFO: loaded from: classes.dex */
public final class qx3 extends ny2 {
    private static final qx3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile jg5 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private yh0 value_ = yh0.n;

    static {
        qx3 qx3Var = new qx3();
        DEFAULT_INSTANCE = qx3Var;
        ny2.l(qx3.class, qx3Var);
    }

    public static px3 p() {
        return (px3) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new qx3();
            case 4:
                return new px3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (qx3.class) {
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

    public final dc5 m() {
        dc5 dc5VarA = dc5.a(this.outputPrefixType_);
        return dc5VarA == null ? dc5.UNRECOGNIZED : dc5VarA;
    }

    public final String n() {
        return this.typeUrl_;
    }

    public final yh0 o() {
        return this.value_;
    }

    public final void q(dc5 dc5Var) {
        this.outputPrefixType_ = dc5Var.b();
    }

    public final void r() {
        this.typeUrl_ = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    public final void s(vh0 vh0Var) {
        this.value_ = vh0Var;
    }
}
