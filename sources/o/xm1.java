package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xm1 extends g07 {
    @Override // o.oz3
    public final zo4 I() {
        return x0().I();
    }

    @Override // o.oz3
    public final List m0() {
        return x0().m0();
    }

    @Override // o.oz3
    public g48 n0() {
        return x0().n0();
    }

    @Override // o.oz3
    public final k48 o0() {
        return x0().o0();
    }

    @Override // o.oz3
    public boolean p0() {
        return x0().p0();
    }

    public abstract g07 x0();

    @Override // o.m98
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g07 t0(uz3 uz3Var) {
        g07 g07VarX0 = x0();
        g07VarX0.getClass();
        return z0(g07VarX0);
    }

    public xm1 z0(g07 g07Var) {
        return new h55(g07Var);
    }
}
