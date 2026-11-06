package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements in1 {
    public sf0 m = z06.t;
    public xk1 n;

    @Override // o.in1
    public final float Z() {
        return this.m.getDensity().Z();
    }

    public final xk1 a(Function1 function1) {
        xk1 xk1Var = new xk1((byte) 10, false);
        xk1Var.n = function1;
        this.n = xk1Var;
        return xk1Var;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity().getDensity();
    }
}
