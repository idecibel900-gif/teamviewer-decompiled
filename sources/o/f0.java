package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ p0 n;

    public /* synthetic */ f0(p0 p0Var, byte b) {
        this.m = b;
        this.n = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        um1 um1Var;
        byte b = this.m;
        p0 p0Var = this.n;
        switch (b) {
            case 0:
                xg3 xg3Var = (xg3) xk0.q(p0Var, ug3.a);
                if (xg3Var == null) {
                    ni3.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + xg3Var);
                }
                xg3 xg3Var2 = p0Var.K;
                p0Var.K = xg3Var;
                if (xg3Var2 != null && !im3.n(xg3Var, xg3Var2) && ((um1Var = p0Var.N) != null || !p0Var.U)) {
                    if (um1Var != null) {
                        p0Var.V0(um1Var);
                    }
                    p0Var.N = null;
                    p0Var.f1();
                }
                return f88.a;
            default:
                p0Var.j1();
                return Boolean.TRUE;
        }
    }
}
