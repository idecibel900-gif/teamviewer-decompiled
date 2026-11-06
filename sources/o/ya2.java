package o;

/* JADX INFO: loaded from: classes.dex */
public final class ya2 extends ny2 {
    private static final ya2 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile jg5 PARSER;
    private yh0 encryptedKeyset_ = yh0.n;
    private sy3 keysetInfo_;

    static {
        ya2 ya2Var = new ya2();
        DEFAULT_INSTANCE = ya2Var;
        ny2.l(ya2.class, ya2Var);
    }

    public static xa2 n() {
        return (xa2) DEFAULT_INSTANCE.e();
    }

    public static ya2 o(byte[] bArr, cg2 cg2Var) {
        return (ya2) ny2.k(DEFAULT_INSTANCE, bArr, cg2Var);
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new ya2();
            case 4:
                return new xa2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (ya2.class) {
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
        return this.encryptedKeyset_;
    }

    public final void p(vh0 vh0Var) {
        this.encryptedKeyset_ = vh0Var;
    }

    public final void q(sy3 sy3Var) {
        this.keysetInfo_ = sy3Var;
    }
}
