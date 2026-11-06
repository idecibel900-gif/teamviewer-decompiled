package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wx3 {
    public final q57 a;
    public xx3 b;
    public iq2 c;

    public wx3(q57 q57Var) {
        this.a = q57Var;
    }

    public final xx3 a() {
        xx3 xx3Var = this.b;
        if (xx3Var != null) {
            return xx3Var;
        }
        im3.e0("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        Function1 function1;
        q57 q57Var;
        if (i == 7) {
            function1 = a().a;
        } else {
            if (i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                hk0.l("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            iq2 iq2Var = this.c;
            if (iq2Var != null) {
                ((lq2) iq2Var).h(1, true);
                return true;
            }
            im3.e0("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (q57Var = this.a) == null) {
                return false;
            }
            ((zm1) q57Var).a();
            return true;
        }
        iq2 iq2Var2 = this.c;
        if (iq2Var2 != null) {
            ((lq2) iq2Var2).h(2, true);
            return true;
        }
        im3.e0("focusManager");
        throw null;
    }
}
