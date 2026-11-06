package o;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class kf5 extends xo1 {
    public final Method f;
    public final int g;
    public final vc1 h;

    public kf5(Method method, int i, vc1 vc1Var) {
        this.f = method;
        this.g = i;
        this.h = vc1Var;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        int i = this.g;
        Method method = this.f;
        if (obj == null) {
            throw im3.U(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            fb6Var.k = (db6) this.h.w(obj);
        } catch (IOException e) {
            throw im3.V(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
