package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kr5 extends py2 {
    private static final kr5 DEFAULT_INSTANCE;
    private static volatile lg5 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private qm4 preferences_ = qm4.n;

    static {
        kr5 kr5Var = new kr5();
        DEFAULT_INSTANCE = kr5Var;
        py2.j(kr5.class, kr5Var);
    }

    public static ir5 n() {
        return (ir5) ((gy2) DEFAULT_INSTANCE.c(5));
    }

    public static kr5 o(InputStream inputStream) {
        kr5 kr5Var = DEFAULT_INSTANCE;
        tu0 tu0Var = new tu0(inputStream);
        eg2 eg2VarA = eg2.a();
        py2 py2VarI = kr5Var.i();
        try {
            vw5 vw5Var = vw5.c;
            vw5Var.getClass();
            cj6 cj6VarA = vw5Var.a(py2VarI.getClass());
            xu0 xu0Var = (xu0) tu0Var.n;
            if (xu0Var == null) {
                xu0Var = new xu0(tu0Var);
            }
            cj6VarA.g(py2VarI, xu0Var, eg2VarA);
            cj6VarA.a(py2VarI);
            if (py2.f(py2VarI, true)) {
                return (kr5) py2VarI;
            }
            throw new pm3(new a88().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof pm3) {
                throw ((pm3) e.getCause());
            }
            throw new pm3(e.getMessage(), e);
        } catch (a88 e2) {
            throw new pm3(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof pm3) {
                throw ((pm3) e3.getCause());
            }
            throw e3;
        } catch (pm3 e4) {
            if (e4.m) {
                throw new pm3(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    @Override // o.py2
    public final Object c(int i) {
        lg5 iy2Var;
        switch (ua5.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w06(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", jr5.a});
            case 3:
                return new kr5();
            case 4:
                return new ir5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lg5 lg5Var = PARSER;
                if (lg5Var != null) {
                    return lg5Var;
                }
                synchronized (kr5.class) {
                    try {
                        iy2Var = PARSER;
                        if (iy2Var == null) {
                            iy2Var = new iy2();
                            PARSER = iy2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return iy2Var;
            default:
                gk0.u();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final qm4 m() {
        qm4 qm4Var = this.preferences_;
        if (qm4Var.m) {
            return qm4Var;
        }
        qm4 qm4VarB = qm4Var.b();
        this.preferences_ = qm4VarB;
        return qm4VarB;
    }
}
