package o;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bp1 {
    public static final /* synthetic */ int a = 0;

    static {
        sy4.e("value");
    }

    public static final boolean a(qb8 qb8Var) {
        Boolean boolQ = ga0.q(qf0.K(qb8Var), yl7.x, ap1.n);
        boolQ.getClass();
        return boolQ.booleanValue();
    }

    public static zi0 b(zi0 zi0Var, Function1 function1) {
        zi0Var.getClass();
        return (zi0) ga0.j(qf0.K(zi0Var), new cr((byte) 12), new kg1(new k76(), function1));
    }

    public static final ht2 c(fi1 fi1Var) {
        it2 it2VarG = zo1.g(fi1Var);
        it2VarG.getClass();
        if (!it2VarG.d()) {
            it2VarG = null;
        }
        if (it2VarG != null) {
            return it2VarG.g();
        }
        return null;
    }

    public static final ns4 d(hp hpVar) {
        hpVar.getClass();
        ys0 ys0VarA = hpVar.getType().o0().a();
        if (ys0VarA instanceof ns4) {
            return (ns4) ys0VarA;
        }
        return null;
    }

    public static final wy3 e(fi1 fi1Var) {
        fi1Var.getClass();
        ps4 ps4VarD = zo1.d(fi1Var);
        ps4VarD.getClass();
        return ps4VarD.h();
    }

    public static final js0 f(ys0 ys0Var) {
        fi1 fi1VarI;
        js0 js0VarF;
        if (ys0Var == null || (fi1VarI = ys0Var.i()) == null) {
            return null;
        }
        if (fi1VarI instanceof ad5) {
            ht2 ht2Var = ((bd5) ((ad5) fi1VarI)).q;
            sy4 name = ys0Var.getName();
            name.getClass();
            return new js0(ht2Var, name);
        }
        if (!(fi1VarI instanceof zs0) || (js0VarF = f((ys0) fi1VarI)) == null) {
            return null;
        }
        sy4 name2 = ys0Var.getName();
        name2.getClass();
        return js0VarF.d(name2);
    }

    public static final ht2 g(fi1 fi1Var) {
        fi1Var.getClass();
        ht2 ht2VarH = zo1.h(fi1Var);
        return ht2VarH != null ? ht2VarH : zo1.g(fi1Var.i()).b(fi1Var.getName()).g();
    }

    public static final void h(ps4 ps4Var) {
        ps4Var.getClass();
        if (ps4Var.L(ck3.D) == null) {
            return;
        }
        io.sentry.h2.f();
    }

    public static final zi0 i(zi0 zi0Var) {
        zi0Var.getClass();
        return zi0Var instanceof zt5 ? ((zt5) zi0Var).t : zi0Var;
    }

    public static final km2 j(zi0 zi0Var) {
        zp6 zp6VarA0 = cx.A0(new zi0[]{zi0Var});
        Collection collectionJ = zi0Var.j();
        collectionJ.getClass();
        return bq6.g0(cx.A0(new zp6[]{zp6VarA0, new km2(new fx(collectionJ, (byte) 1), new o48((byte) 14), eq6.n)}));
    }
}
