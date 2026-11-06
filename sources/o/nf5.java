package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class nf5 extends xo1 {
    public final /* synthetic */ byte f;
    public final Method g;
    public final int h;

    public /* synthetic */ nf5(Method method, int i, byte b) {
        this.f = b;
        this.g = method;
        this.h = i;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        byte b = this.f;
        int i = this.h;
        Method method = this.g;
        switch (b) {
            case 0:
                k53 k53Var = (k53) obj;
                if (k53Var == null) {
                    throw im3.U(method, i, "Headers parameter must not be null.", new Object[0]);
                }
                nm nmVar = fb6Var.f;
                nmVar.getClass();
                int size = k53Var.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i67.h(nmVar, i67.j(k53Var, i2), i67.l(k53Var, i2));
                }
                return;
            default:
                if (obj == null) {
                    throw im3.U(method, i, "@Url parameter is null.", new Object[0]);
                }
                fb6Var.c = obj.toString();
                return;
        }
    }
}
