package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class st4 implements vc1 {
    public static final jo4 n;
    public final vp3 m;

    static {
        e96 e96Var = jo4.e;
        n = vt1.t("application/json; charset=UTF-8");
    }

    public st4(vp3 vp3Var) {
        this.m = vp3Var;
    }

    @Override // o.vc1
    public final Object w(Object obj) throws EOFException {
        bf0 bf0Var = new bf0();
        this.m.c(new pr3(bf0Var), obj);
        ai0 ai0VarO0 = bf0Var.o0(bf0Var.n);
        int i = db6.a;
        ai0VarO0.getClass();
        return new bb6(n, ai0VarO0);
    }
}
