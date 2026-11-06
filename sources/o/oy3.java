package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oy3 extends ny2 {
    private static final oy3 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile jg5 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private ql3 key_ = ww5.p;
    private int primaryKeyId_;

    static {
        oy3 oy3Var = new oy3();
        DEFAULT_INSTANCE = oy3Var;
        ny2.l(oy3.class, oy3Var);
    }

    public static ly3 r() {
        return (ly3) DEFAULT_INSTANCE.e();
    }

    public static oy3 s(byte[] bArr, cg2 cg2Var) {
        return (oy3) ny2.k(DEFAULT_INSTANCE, bArr, cg2Var);
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
                return new v06(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", ny3.class});
            case 3:
                return new oy3();
            case 4:
                return new ly3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jg5 jg5Var = PARSER;
                if (jg5Var != null) {
                    return jg5Var;
                }
                synchronized (oy3.class) {
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

    public final void m(ny3 ny3Var) {
        ql3 ql3VarZ = this.key_;
        if (!((e2) ql3VarZ).m) {
            int size = ql3VarZ.size();
            ql3VarZ = ql3VarZ.z(size == 0 ? 10 : size * 2);
            this.key_ = ql3VarZ;
        }
        ql3VarZ.add(ny3Var);
    }

    public final ny3 n(int i) {
        return (ny3) this.key_.get(i);
    }

    public final int o() {
        return this.key_.size();
    }

    public final List p() {
        return this.key_;
    }

    public final int q() {
        return this.primaryKeyId_;
    }

    public final void t(int i) {
        this.primaryKeyId_ = i;
    }
}
