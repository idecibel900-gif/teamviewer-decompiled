package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ja4 extends s0 {
    public final nw3 a;
    public final nw3 b;
    public final ia4 c;

    public ja4(nw3 nw3Var, nw3 nw3Var2) {
        nw3Var.getClass();
        nw3Var2.getClass();
        this.a = nw3Var;
        this.b = nw3Var2;
        this.c = new ia4(nw3Var.d(), nw3Var2.d());
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        h(obj);
        ia4 ia4Var = this.c;
        bb7 bb7VarA = bb7Var.a(ia4Var);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            bb7VarA.n(ia4Var, i, this.a, key);
            i += 2;
            bb7VarA.n(ia4Var, i2, this.b, value);
        }
        bb7VarA.s(ia4Var);
    }

    @Override // o.nw3
    public final fq6 d() {
        return this.c;
    }

    @Override // o.s0
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // o.s0
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // o.s0
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // o.s0
    public final int h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        nw3 nw3Var = this.a;
        ia4 ia4Var = this.c;
        Object objC = k01Var.C(ia4Var, i, nw3Var, null);
        int iL = k01Var.l(ia4Var);
        if (iL != i + 1) {
            gk0.h(ua5.l("Value must follow key in a map, index for key: ", i, iL, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objC);
        nw3 nw3Var2 = this.b;
        map.put(objC, (!zContainsKey || (nw3Var2.d().k() instanceof is5)) ? k01Var.C(ia4Var, iL, nw3Var2, null) : k01Var.C(ia4Var, iL, nw3Var2, xm4.P(objC, map)));
    }

    @Override // o.s0
    public final Object k(Object obj) {
        throw null;
    }

    @Override // o.s0
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
