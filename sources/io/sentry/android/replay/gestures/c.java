package io.sentry.android.replay.gestures;

import io.sentry.transport.f;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import o.cp4;
import o.ec8;
import o.gc8;
import o.hk0;
import o.lv0;
import o.nd;
import o.q46;
import o.qo;
import o.ra6;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ec8 {
    public final Serializable m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f153o;
    public final Object p;

    public c(io.sentry.util.network.b bVar, long j) {
        this.p = bVar;
        this.m = new LinkedHashMap(0, 0.75f, true);
        this.n = j;
        if (j > 0) {
            return;
        }
        hk0.g("maxSize <= 0");
        throw null;
    }

    @Override // o.ec8
    public boolean a() {
        return true;
    }

    @Override // o.ec8
    public long b(qo qoVar, qo qoVar2, qo qoVar3) {
        return Long.MAX_VALUE;
    }

    public void c(Object obj, Object obj2, q46 q46Var) {
        q46 q46Var2 = (q46) obj2;
        ((nd) ((io.sentry.util.network.b) this.p).c).s((cp4) obj, q46Var2.a, q46Var2.b, q46Var2.c);
    }

    public long d() {
        long j = this.f153o;
        if (j != -1) {
            return j;
        }
        long jG = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.m).entrySet()) {
            jG += g(entry.getKey(), entry.getValue());
        }
        this.f153o = jG;
        return jG;
    }

    public long e(long j) {
        long j2 = this.f153o;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.n;
        long j5 = j3 / j4;
        return (((ra6) this.m) == ra6.m || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public qo f(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        long j2 = this.f153o;
        long j3 = j + j2;
        long j4 = this.n;
        return j3 > j4 ? ((gc8) this.p).h(j4 - j2, qoVar, qoVar3, qoVar2) : qoVar2;
    }

    public long g(Object obj, Object obj2) throws Exception {
        try {
            long j = ((q46) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.f153o = -1L;
            throw e;
        }
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((gc8) this.p).h(e(j), qoVar, qoVar2, f(j, qoVar, qoVar3, qoVar2));
    }

    public void i(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.m;
        while (d() > j) {
            if (linkedHashMap.isEmpty()) {
                if (d() == 0) {
                    return;
                }
                hk0.l("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) lv0.l0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.f153o = d() - g(key, value);
                c(key, value, null);
            }
        }
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((gc8) this.p).u(e(j), qoVar, qoVar2, f(j, qoVar, qoVar3, qoVar2));
    }

    public c(f fVar) {
        this.p = fVar;
        this.m = new LinkedHashMap(10);
    }

    public c(gc8 gc8Var, ra6 ra6Var) {
        this.p = gc8Var;
        this.m = ra6Var;
        this.n = ((long) (gc8Var.v() + gc8Var.n())) * 1000000;
        this.f153o = 0L;
    }
}
