package io.sentry.android.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.hc8;
import o.im3;
import o.l07;
import o.pn5;
import o.qo;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class v implements hc8 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f128o;

    public v(List list) {
        this.f128o = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.android.core.anr.f fVar = (io.sentry.android.core.anr.f) it.next();
            if (fVar != null) {
                ((ArrayList) this.f128o).add(fVar);
            }
        }
        Collections.sort((ArrayList) this.f128o);
        if (((ArrayList) this.f128o).isEmpty()) {
            this.m = 0L;
            this.n = 0L;
        } else {
            this.m = ((io.sentry.android.core.anr.f) ((ArrayList) this.f128o).get(0)).n;
            this.n = ((io.sentry.android.core.anr.f) ua5.j(1, (ArrayList) this.f128o)).n + 10000;
        }
    }

    @Override // o.ec8
    public long b(qo qoVar, qo qoVar2, qo qoVar3) {
        c(qoVar, qoVar2, qoVar3);
        return this.n + this.m;
    }

    public void c(qo qoVar, qo qoVar2, qo qoVar3) {
        if (im3.n(qoVar, null) && im3.n(qoVar2, null) && im3.n(qoVar3, null)) {
            return;
        }
        long jB = ((pn5) ((l07) this.f128o).n).b(qoVar, qoVar2, qoVar3);
        this.n = jB;
        this.m = (long) (jB * 0.1f);
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        c(qoVar, qoVar2, qoVar3);
        long j2 = this.m;
        if (j <= j2) {
            return qoVar3;
        }
        return ((pn5) ((l07) this.f128o).n).h(j - j2, qoVar, qoVar2, qoVar3);
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        c(qoVar, qoVar2, qoVar3);
        long j2 = this.m;
        if (j <= j2) {
            return qoVar;
        }
        return ((pn5) ((l07) this.f128o).n).u(j - j2, qoVar, qoVar2, qoVar3);
    }

    public v(long j, long j2, Date date) {
        this.m = j;
        this.n = j2;
        this.f128o = date;
    }

    public v(l07 l07Var) {
        this.f128o = l07Var;
    }
}
