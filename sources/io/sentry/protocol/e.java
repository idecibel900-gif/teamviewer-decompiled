package io.sentry.protocol;

import io.sentry.d4;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.w7;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e implements t2 {
    public final ConcurrentHashMap m = new ConcurrentHashMap();
    public final io.sentry.util.a n = new io.sentry.util.a();

    public e(e eVar) {
        for (Map.Entry entry : eVar.c()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.s = aVar.s;
                    aVar2.m = aVar.m;
                    aVar2.q = aVar.q;
                    aVar2.n = aVar.n;
                    aVar2.r = aVar.r;
                    aVar2.p = aVar.p;
                    aVar2.f223o = aVar.f223o;
                    aVar2.t = io.sentry.util.b.r(aVar.t);
                    aVar2.w = aVar.w;
                    List list = aVar.u;
                    aVar2.u = list != null ? new ArrayList(list) : null;
                    aVar2.v = aVar.v;
                    aVar2.x = aVar.x;
                    aVar2.y = aVar.y;
                    aVar2.z = io.sentry.util.b.r(aVar.z);
                    o(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.m = dVar.m;
                    dVar2.n = dVar.n;
                    dVar2.f227o = io.sentry.util.b.r(dVar.f227o);
                    p(dVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.m = hVar.m;
                    hVar2.n = hVar.n;
                    hVar2.f230o = hVar.f230o;
                    hVar2.p = hVar.p;
                    hVar2.q = hVar.q;
                    hVar2.r = hVar.r;
                    hVar2.u = hVar.u;
                    hVar2.v = hVar.v;
                    hVar2.w = hVar.w;
                    hVar2.x = hVar.x;
                    hVar2.y = hVar.y;
                    hVar2.z = hVar.z;
                    hVar2.A = hVar.A;
                    hVar2.B = hVar.B;
                    hVar2.C = hVar.C;
                    hVar2.D = hVar.D;
                    hVar2.E = hVar.E;
                    hVar2.F = hVar.F;
                    hVar2.G = hVar.G;
                    hVar2.H = hVar.H;
                    hVar2.I = hVar.I;
                    hVar2.J = hVar.J;
                    hVar2.K = hVar.K;
                    hVar2.M = hVar.M;
                    hVar2.O = hVar.O;
                    hVar2.P = hVar.P;
                    hVar2.t = hVar.t;
                    String[] strArr = hVar.s;
                    hVar2.s = strArr != null ? (String[]) strArr.clone() : null;
                    hVar2.N = hVar.N;
                    TimeZone timeZone = hVar.L;
                    hVar2.L = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    hVar2.Q = hVar.Q;
                    hVar2.R = hVar.R;
                    hVar2.S = hVar.S;
                    hVar2.T = hVar.T;
                    hVar2.U = io.sentry.util.b.r(hVar.U);
                    q(hVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof q)) {
                    q qVar = (q) value;
                    q qVar2 = new q();
                    qVar2.m = qVar.m;
                    qVar2.n = qVar.n;
                    qVar2.f244o = qVar.f244o;
                    qVar2.p = qVar.p;
                    qVar2.q = qVar.q;
                    qVar2.r = qVar.r;
                    qVar2.s = io.sentry.util.b.r(qVar.s);
                    t(qVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof y)) {
                    y yVar = (y) value;
                    y yVar2 = new y();
                    yVar2.m = yVar.m;
                    yVar2.n = yVar.n;
                    yVar2.f251o = yVar.f251o;
                    yVar2.p = io.sentry.util.b.r(yVar.p);
                    v(yVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.m = kVar.m;
                    kVar2.n = kVar.n;
                    kVar2.f234o = kVar.f234o;
                    kVar2.p = kVar.p;
                    kVar2.q = kVar.q;
                    kVar2.r = kVar.r;
                    kVar2.s = io.sentry.util.b.r(kVar.s);
                    l(kVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.m = mVar.m;
                    mVar2.n = mVar.n;
                    mVar2.f237o = mVar.f237o;
                    mVar2.p = mVar.p;
                    mVar2.q = mVar.q;
                    mVar2.r = mVar.r;
                    mVar2.s = mVar.s;
                    mVar2.t = mVar.t;
                    mVar2.u = mVar.u;
                    mVar2.v = io.sentry.util.b.r(mVar.v);
                    s(mVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof w7)) {
                    x(new w7((w7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof d4)) {
                    d4 d4Var = (d4) value;
                    d4 d4Var2 = new d4();
                    d4Var2.m = d4Var.m;
                    ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r(d4Var.n);
                    if (concurrentHashMapR != null) {
                        d4Var2.n = concurrentHashMapR;
                    }
                    l(d4Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof s)) {
                    s sVar = (s) value;
                    s sVar2 = new s();
                    sVar2.m = sVar.m;
                    sVar2.n = io.sentry.util.b.r(sVar.n);
                    sVar2.r = io.sentry.util.b.r(sVar.r);
                    sVar2.f246o = sVar.f246o;
                    sVar2.p = sVar.p;
                    sVar2.q = sVar.q;
                    u(sVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof g0)) {
                    g0 g0Var = (g0) value;
                    g0 g0Var2 = new g0();
                    g0Var2.m = g0Var.m;
                    g0Var2.n = io.sentry.util.b.r(g0Var.n);
                    w(g0Var2);
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    c cVar = (c) value;
                    c cVar2 = new c();
                    cVar2.m = cVar.m;
                    cVar2.n = cVar.n;
                    cVar2.f225o = cVar.f225o;
                    cVar2.p = cVar.p;
                    cVar2.q = cVar.q;
                    cVar2.r = cVar.r;
                    cVar2.s = cVar.s;
                    cVar2.t = cVar.t;
                    cVar2.u = cVar.u;
                    cVar2.v = cVar.v;
                    cVar2.w = cVar.w;
                    cVar2.x = io.sentry.util.b.r(cVar.x);
                    l(cVar2, "art");
                } else {
                    l(value, (String) entry.getKey());
                }
            }
        }
    }

    public void a() {
        this.m.clear();
    }

    public boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.m.containsKey(obj);
    }

    public Set c() {
        return this.m.entrySet();
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.m.get(obj);
    }

    public a e() {
        return (a) y(a.class, "app");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.m.equals(((e) obj).m);
        }
        return false;
    }

    public h f() {
        return (h) y(h.class, "device");
    }

    public j g() {
        return (j) y(j.class, "flags");
    }

    public q h() {
        return (q) y(q.class, "os");
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public y i() {
        return (y) y(y.class, "runtime");
    }

    public w7 j() {
        return (w7) y(w7.class, "trace");
    }

    public Enumeration k() {
        return this.m.keys();
    }

    public Object l(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.m;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void m(e eVar) {
        if (eVar == null) {
            return;
        }
        this.m.putAll(eVar.m);
    }

    public Object n(String str) {
        return this.m.remove(str);
    }

    public void o(a aVar) {
        l(aVar, "app");
    }

    public void p(d dVar) {
        l(dVar, "browser");
    }

    public void q(h hVar) {
        l(hVar, "device");
    }

    public void r(j jVar) {
        l(jVar, "flags");
    }

    public void s(m mVar) {
        l(mVar, "gpu");
    }

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        Enumeration enumerationK = k();
        int size = this.m.size();
        String[] strArr = size == 0 ? io.sentry.util.b.a : new String[size];
        int i = 0;
        while (enumerationK.hasMoreElements()) {
            if (i == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            }
            strArr[i] = (String) enumerationK.nextElement();
            i++;
        }
        if (i != strArr.length) {
            strArr = (String[]) Arrays.copyOf(strArr, i);
        }
        Arrays.sort(strArr);
        for (String str : strArr) {
            Object objD = d(str);
            if (objD != null) {
                cVar.r(str);
                cVar.x(g1Var, objD);
            }
        }
        cVar.m();
    }

    public void t(q qVar) {
        l(qVar, "os");
    }

    public void u(s sVar) {
        io.sentry.util.a aVar = this.n;
        aVar.e();
        try {
            l(sVar, "response");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void v(y yVar) {
        l(yVar, "runtime");
    }

    public void w(g0 g0Var) {
        l(g0Var, "spring");
    }

    public void x(w7 w7Var) {
        io.sentry.util.b.v(w7Var, "traceContext is required");
        l(w7Var, "trace");
    }

    public final Object y(Class cls, String str) {
        Object objD = d(str);
        if (cls.isInstance(objD)) {
            return cls.cast(objD);
        }
        return null;
    }

    public e() {
    }
}
