package o;

/* JADX INFO: loaded from: classes.dex */
public final class cd extends ny2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final cd DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile jg5 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        ny2.l(cd.class, cdVar);
    }

    public static cd n() {
        return DEFAULT_INSTANCE;
    }

    public static bd q() {
        return (bd) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new cd();
            case 4:
                return new bd(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (cd.class) {
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
        return this.ciphertextSegmentSize_;
    }

    public final int o() {
        return this.derivedKeySize_;
    }

    public final b53 p() {
        b53 b53VarA = b53.a(this.hkdfHashType_);
        return b53VarA == null ? b53.UNRECOGNIZED : b53VarA;
    }

    public final void r() {
        this.ciphertextSegmentSize_ = 4096;
    }

    public final void s() {
        this.derivedKeySize_ = 32;
    }

    public final void t() {
        this.hkdfHashType_ = 3;
    }
}
