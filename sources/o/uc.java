package o;

/* JADX INFO: loaded from: classes.dex */
public final class uc extends ny2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final uc DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile jg5 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private y53 hmacParams_;

    static {
        uc ucVar = new uc();
        DEFAULT_INSTANCE = ucVar;
        ny2.l(uc.class, ucVar);
    }

    public static uc n() {
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 3:
                return new uc();
            case 4:
                return new pc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (uc.class) {
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

    public final y53 q() {
        y53 y53Var = this.hmacParams_;
        return y53Var == null ? y53.m() : y53Var;
    }
}
