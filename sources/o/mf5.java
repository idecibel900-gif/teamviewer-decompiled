package o;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mf5 extends xo1 {
    public final /* synthetic */ byte f;
    public final Method g;
    public final int h;
    public final boolean i;

    public /* synthetic */ mf5(byte b, int i, Method method, boolean z) {
        this.f = b;
        this.g = method;
        this.h = i;
        this.i = z;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        byte b = this.f;
        boolean z = this.i;
        Method method = this.g;
        int i = this.h;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw im3.U(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw im3.U(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw im3.U(method, i, fx3.g("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw im3.U(method, i, "Field map value '" + value + "' converted to null by " + uf0.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    fb6Var.a(z, str, string);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw im3.U(method, i, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw im3.U(method, i, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw im3.U(method, i, fx3.g("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    fb6Var.b(z, str2, value2.toString());
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw im3.U(method, i, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw im3.U(method, i, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw im3.U(method, i, fx3.g("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw im3.U(method, i, "Query map value '" + value3 + "' converted to null by " + uf0.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    fb6Var.d(z, str3, string2);
                }
                return;
        }
    }
}
