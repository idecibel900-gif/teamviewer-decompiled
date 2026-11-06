package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.h4;
import io.sentry.h5;
import io.sentry.i6;
import io.sentry.s7;
import io.sentry.t2;
import io.sentry.v7;
import io.sentry.w7;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h5 implements t2 {
    public String B;
    public Double C;
    public Double D;
    public final ArrayList E;
    public final HashMap F;
    public i6 G;
    public ConcurrentHashMap H;

    public f0(s7 s7Var) {
        super(s7Var.a);
        this.E = new ArrayList();
        this.F = new HashMap();
        v7 v7Var = s7Var.b;
        this.C = Double.valueOf(v7Var.a.d() / 1.0E9d);
        this.D = Double.valueOf(v7Var.a.c(v7Var.b) / 1.0E9d);
        this.B = s7Var.e;
        for (v7 v7Var2 : s7Var.c) {
            Boolean bool = Boolean.TRUE;
            h4 h4Var = v7Var2.c.p;
            if (bool.equals(h4Var == null ? null : (Boolean) h4Var.a)) {
                this.E.add(new z(v7Var2));
            }
        }
        e eVar = this.n;
        eVar.m(s7Var.p);
        w7 w7Var = v7Var.c;
        ConcurrentHashMap concurrentHashMap = v7Var.k;
        w7 w7Var2 = new w7(w7Var.m, w7Var.n, w7Var.f274o, w7Var.q, w7Var.r, w7Var.p, w7Var.s, w7Var.u);
        for (Map.Entry entry : w7Var.t.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str != null) {
                Map map = w7Var2.v;
                if (value == null) {
                    map.remove(str);
                } else {
                    map.put(str, value);
                }
            }
        }
        w7Var.z.h();
        eVar.x(w7Var2);
        this.G = new i6(s7Var.n.apiName(), (byte) 1);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.B != null) {
            cVar.r("transaction");
            cVar.A(this.B);
        }
        cVar.r("start_timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.C.doubleValue()));
        if (this.D != null) {
            cVar.r("timestamp");
            cVar.x(g1Var, io.sentry.config.a.j(this.D.doubleValue()));
        }
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            cVar.r("spans");
            cVar.x(g1Var, arrayList);
        }
        cVar.r("type");
        cVar.A("transaction");
        HashMap map = this.F;
        if (!map.isEmpty()) {
            cVar.r("measurements");
            cVar.x(g1Var, map);
        }
        cVar.r("transaction_info");
        cVar.x(g1Var, this.G);
        io.sentry.config.a.D(this, cVar, g1Var);
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.H, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }

    public f0(ArrayList arrayList, HashMap map, i6 i6Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.E = arrayList2;
        HashMap map2 = new HashMap();
        this.F = map2;
        this.B = "";
        this.C = dValueOf;
        this.D = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.F.putAll(((z) it.next()).x);
        }
        this.G = i6Var;
    }
}
