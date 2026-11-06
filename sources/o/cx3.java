package o;

/* JADX INFO: loaded from: classes.dex */
public final class cx3 extends ny2 {
    private static final cx3 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile jg5 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private yh0 value_ = yh0.n;

    static {
        cx3 cx3Var = new cx3();
        DEFAULT_INSTANCE = cx3Var;
        ny2.l(cx3.class, cx3Var);
    }

    public static cx3 m() {
        return DEFAULT_INSTANCE;
    }

    public static ax3 q() {
        return (ax3) DEFAULT_INSTANCE.e();
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new cx3();
            case 4:
                return new ax3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (cx3.class) {
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

    public final bx3 n() {
        bx3 bx3Var;
        int i = this.keyMaterialType_;
        if (i == 0) {
            bx3Var = bx3.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            bx3Var = bx3.SYMMETRIC;
        } else if (i == 2) {
            bx3Var = bx3.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            bx3Var = i != 4 ? null : bx3.REMOTE;
        } else {
            bx3Var = bx3.ASYMMETRIC_PUBLIC;
        }
        return bx3Var == null ? bx3.UNRECOGNIZED : bx3Var;
    }

    public final String o() {
        return this.typeUrl_;
    }

    public final yh0 p() {
        return this.value_;
    }

    public final void r(bx3 bx3Var) {
        if (bx3Var != bx3.UNRECOGNIZED) {
            this.keyMaterialType_ = bx3Var.m;
        } else {
            bx3Var.getClass();
            hk0.g("Can't get the number of an unknown enum value.");
        }
    }

    public final void s(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void t(vh0 vh0Var) {
        this.value_ = vh0Var;
    }
}
