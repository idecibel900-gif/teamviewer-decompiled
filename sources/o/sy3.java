package o;

/* JADX INFO: loaded from: classes.dex */
public final class sy3 extends ny2 {
    private static final sy3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile jg5 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private ql3 keyInfo_ = ww5.p;
    private int primaryKeyId_;

    static {
        sy3 sy3Var = new sy3();
        DEFAULT_INSTANCE = sy3Var;
        ny2.l(sy3.class, sy3Var);
    }

    public static py3 o() {
        return (py3) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", ry3.class});
            case 3:
                return new sy3();
            case 4:
                return new py3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (sy3.class) {
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

    public final void m(ry3 ry3Var) {
        ql3 ql3VarZ = this.keyInfo_;
        if (!((e2) ql3VarZ).m) {
            int size = ql3VarZ.size();
            ql3VarZ = ql3VarZ.z(size == 0 ? 10 : size * 2);
            this.keyInfo_ = ql3VarZ;
        }
        ql3VarZ.add(ry3Var);
    }

    public final ry3 n() {
        return (ry3) this.keyInfo_.get(0);
    }

    public final void p(int i) {
        this.primaryKeyId_ = i;
    }
}
