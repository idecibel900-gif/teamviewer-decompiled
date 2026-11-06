package o;

/* JADX INFO: loaded from: classes.dex */
public final class ry3 extends ny2 {
    private static final ry3 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile jg5 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        ry3 ry3Var = new ry3();
        DEFAULT_INSTANCE = ry3Var;
        ny2.l(ry3.class, ry3Var);
    }

    public static qy3 n() {
        return (qy3) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new ry3();
            case 4:
                return new qy3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (ry3.class) {
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
        return this.keyId_;
    }

    public final void o(int i) {
        this.keyId_ = i;
    }

    public final void p(dc5 dc5Var) {
        this.outputPrefixType_ = dc5Var.b();
    }

    public final void q(ox3 ox3Var) {
        this.status_ = ox3Var.a();
    }

    public final void r(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }
}
