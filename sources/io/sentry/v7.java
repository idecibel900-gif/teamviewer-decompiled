package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements v1 {
    public final l5 a;
    public l5 b;
    public final w7 c;
    public final s7 d;
    public Throwable e;
    public final n1 f;
    public final z7 i;
    public x7 j;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public v7(s7 s7Var, v4 v4Var, w7 w7Var, z7 z7Var, p7 p7Var) {
        new ConcurrentHashMap();
        this.c = w7Var;
        w7Var.u = (String) z7Var.d;
        this.d = s7Var;
        io.sentry.util.b.v(v4Var, "Scopes are required");
        this.f = v4Var;
        this.i = z7Var;
        this.j = p7Var;
        l5 l5Var = (l5) z7Var.b;
        if (l5Var != null) {
            this.a = l5Var;
        } else {
            this.a = v4Var.l().getDateProvider().a();
        }
    }

    @Override // io.sentry.v1
    public final void a(a8 a8Var) {
        this.c.s = a8Var;
    }

    @Override // io.sentry.v1
    public final n7 c() {
        w7 w7Var = this.c;
        io.sentry.protocol.w wVar = w7Var.m;
        y7 y7Var = w7Var.n;
        h4 h4Var = w7Var.p;
        return new n7(wVar, y7Var, h4Var == null ? null : (Boolean) h4Var.a);
    }

    @Override // io.sentry.v1
    public final boolean d() {
        return this.g;
    }

    @Override // io.sentry.v1
    public final void f(Number number, String str) {
        if (this.g) {
            this.f.l().getLogger().g(f6.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n(number, (String) null));
        s7 s7Var = this.d;
        v7 v7Var = s7Var.b;
        if (v7Var == this || v7Var.l.containsKey(str)) {
            return;
        }
        s7Var.f(number, str);
    }

    @Override // io.sentry.v1
    public final void g(Throwable th) {
        this.e = th;
    }

    @Override // io.sentry.v1
    public final String getDescription() {
        return this.c.r;
    }

    @Override // io.sentry.v1
    public final a8 getStatus() {
        return this.c.s;
    }

    @Override // io.sentry.v1
    public final void h(a8 a8Var) {
        x(a8Var, this.f.l().getDateProvider().a());
    }

    @Override // io.sentry.v1
    public final boolean i() {
        return false;
    }

    @Override // io.sentry.v1
    public final e j(List list) {
        return this.d.j(list);
    }

    @Override // io.sentry.v1
    public final v1 k(String str, String str2, l5 l5Var, c2 c2Var) {
        return p(str, str2, l5Var, c2Var, new z7((byte) 0));
    }

    @Override // io.sentry.v1
    public final void l() {
        h(this.c.s);
    }

    @Override // io.sentry.v1
    public final void m(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.v1
    public final v1 p(String str, String str2, l5 l5Var, c2 c2Var, z7 z7Var) {
        if (this.g) {
            return r3.a;
        }
        y7 y7Var = this.c.n;
        s7 s7Var = this.d;
        w7 w7Var = s7Var.b.c;
        w7 w7Var2 = new w7(w7Var.m, new y7(), y7Var, str, null, w7Var.p, null, "manual");
        w7Var2.r = str2;
        w7Var2.x = c2Var;
        z7Var.b = l5Var;
        return s7Var.C(w7Var2, z7Var);
    }

    @Override // io.sentry.v1
    public final void q(String str) {
        this.c.r = str;
    }

    @Override // io.sentry.v1
    public final v1 s(String str) {
        return y(str, null);
    }

    @Override // io.sentry.v1
    public final void u(String str, Long l, y2 y2Var) {
        if (this.g) {
            this.f.l().getLogger().g(f6.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n((Number) l, y2Var.apiName()));
        s7 s7Var = this.d;
        v7 v7Var = s7Var.b;
        if (v7Var == this || v7Var.l.containsKey(str)) {
            return;
        }
        s7Var.u(str, l, y2Var);
    }

    @Override // io.sentry.v1
    public final w7 v() {
        return this.c;
    }

    @Override // io.sentry.v1
    public final l5 w() {
        return this.b;
    }

    @Override // io.sentry.v1
    public final void x(a8 a8Var, l5 l5Var) {
        List<v7> list;
        l5 l5Var2;
        l5 l5Var3;
        w7 w7Var = this.c;
        y7 y7Var = w7Var.n;
        s7 s7Var = this.d;
        CopyOnWriteArrayList<v7> copyOnWriteArrayList = s7Var.c;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        w7Var.s = a8Var;
        n1 n1Var = this.f;
        if (l5Var == null) {
            l5Var = n1Var.l().getDateProvider().a();
        }
        this.b = l5Var;
        z7 z7Var = this.i;
        if (z7Var.a) {
            if (!s7Var.b.c.n.equals(y7Var)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (v7 v7Var : copyOnWriteArrayList) {
                    y7 y7Var2 = v7Var.c.f274o;
                    if (y7Var2 != null && y7Var2.equals(y7Var)) {
                        arrayList.add(v7Var);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            l5 l5Var4 = null;
            l5 l5Var5 = null;
            for (v7 v7Var2 : list) {
                if (l5Var4 == null || v7Var2.a.b(l5Var4) < 0) {
                    l5Var4 = v7Var2.a;
                }
                if (l5Var5 == null || ((l5Var3 = v7Var2.b) != null && l5Var3.b(l5Var5) > 0)) {
                    l5Var5 = v7Var2.b;
                }
            }
            if (z7Var.a && l5Var5 != null && (((l5Var2 = this.b) == null || l5Var2.b(l5Var5) > 0) && this.b != null)) {
                this.b = l5Var5;
            }
        }
        Throwable th = this.e;
        if (th != null) {
            n1Var.e(th, this, s7Var.e);
        }
        x7 x7Var = this.j;
        if (x7Var != null) {
            x7Var.d(this);
        }
        this.g = true;
    }

    @Override // io.sentry.v1
    public final v1 y(String str, String str2) {
        if (this.g) {
            return r3.a;
        }
        y7 y7Var = this.c.n;
        z7 z7Var = new z7((byte) 0);
        s7 s7Var = this.d;
        w7 w7Var = s7Var.b.c;
        w7 w7Var2 = new w7(w7Var.m, new y7(), y7Var, str, null, w7Var.p, null, "manual");
        w7Var2.r = str2;
        w7Var2.x = c2.SENTRY;
        return s7Var.C(w7Var2, z7Var);
    }

    @Override // io.sentry.v1
    public final l5 z() {
        return this.a;
    }

    public v7(e8 e8Var, s7 s7Var, v4 v4Var, f8 f8Var) {
        new ConcurrentHashMap();
        this.c = e8Var;
        e8Var.u = (String) f8Var.d;
        this.d = s7Var;
        this.f = v4Var;
        this.j = null;
        l5 l5Var = (l5) f8Var.b;
        if (l5Var != null) {
            this.a = l5Var;
        } else {
            this.a = v4Var.l().getDateProvider().a();
        }
        this.i = f8Var;
    }
}
