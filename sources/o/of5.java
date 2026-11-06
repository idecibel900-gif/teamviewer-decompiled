package o;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class of5 extends xo1 {
    public final /* synthetic */ byte f = 0;
    public final Method g;
    public final int h;
    public final vc1 i;
    public final Object j;

    public of5(Method method, int i, vc1 vc1Var, String str) {
        this.g = method;
        this.h = i;
        this.i = vc1Var;
        this.j = str;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        byte b = this.f;
        vc1 vc1Var = this.i;
        Object obj2 = this.j;
        Method method = this.g;
        int i = this.h;
        switch (b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    fb6Var.c((k53) obj2, (db6) vc1Var.w(obj));
                    return;
                } catch (IOException e) {
                    throw im3.U(method, i, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw im3.U(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw im3.U(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw im3.U(method, i, fx3.g("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", fx3.g("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    k53 k53Var = k53.n;
                    fb6Var.c(us1.K(strArr), (db6) vc1Var.w(value));
                }
                return;
        }
    }

    public of5(Method method, int i, k53 k53Var, vc1 vc1Var) {
        this.g = method;
        this.h = i;
        this.j = k53Var;
        this.i = vc1Var;
    }
}
