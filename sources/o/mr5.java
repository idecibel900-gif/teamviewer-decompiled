package o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class mr5 extends py2 {
    private static final mr5 DEFAULT_INSTANCE;
    private static volatile lg5 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private rl3 strings_ = xw5.p;

    static {
        mr5 mr5Var = new mr5();
        DEFAULT_INSTANCE = mr5Var;
        py2.j(mr5.class, mr5Var);
    }

    public static mr5 m() {
        return DEFAULT_INSTANCE;
    }

    public static lr5 o() {
        return (lr5) ((gy2) DEFAULT_INSTANCE.c(5));
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
                return new w06(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new mr5();
            case 4:
                return new lr5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lg5 lg5Var = PARSER;
                if (lg5Var != null) {
                    return lg5Var;
                }
                synchronized (mr5.class) {
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

    public final void l(Iterable iterable) {
        rl3 rl3VarC = this.strings_;
        if (!((xw5) rl3VarC).m) {
            xw5 xw5Var = (xw5) rl3VarC;
            int i = xw5Var.f2558o;
            rl3VarC = xw5Var.c(i == 0 ? 10 : i * 2);
            this.strings_ = rl3VarC;
        }
        Charset charset = ul3.a;
        if (iterable instanceof j54) {
            ((j54) iterable).e();
            io.sentry.h2.f();
            return;
        }
        if (iterable instanceof ks5) {
            ((xw5) rl3VarC).addAll((Collection) iterable);
            return;
        }
        if ((rl3VarC instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) rl3VarC).ensureCapacity(((Collection) iterable).size() + ((xw5) rl3VarC).f2558o);
        }
        xw5 xw5Var2 = (xw5) rl3VarC;
        int i2 = xw5Var2.f2558o;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (xw5Var2.f2558o - i2) + " is null.";
                for (int i3 = xw5Var2.f2558o - 1; i3 >= i2; i3--) {
                    xw5Var2.remove(i3);
                }
                yq4.l(str);
                return;
            }
            xw5Var2.add(obj);
        }
    }

    public final rl3 n() {
        return this.strings_;
    }
}
