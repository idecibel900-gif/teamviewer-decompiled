package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v5 extends h5 implements t2 {
    public Date B;
    public io.sentry.protocol.p C;
    public String D;
    public p2 E;
    public p2 F;
    public f6 G;
    public String H;
    public List I;
    public ConcurrentHashMap J;
    public AbstractMap K;

    public v5() {
        io.sentry.protocol.w wVar = new io.sentry.protocol.w();
        Date date = new Date();
        super(wVar);
        this.B = date;
    }

    public final ArrayList d() {
        p2 p2Var = this.F;
        if (p2Var == null) {
            return null;
        }
        return p2Var.a;
    }

    public final ArrayList e() {
        p2 p2Var = this.E;
        if (p2Var != null) {
            return p2Var.a;
        }
        return null;
    }

    public final io.sentry.protocol.v f() {
        Boolean bool;
        p2 p2Var = this.F;
        if (p2Var == null) {
            return null;
        }
        for (io.sentry.protocol.v vVar : p2Var.a) {
            io.sentry.protocol.o oVar = vVar.r;
            if (oVar != null && (bool = oVar.p) != null && !bool.booleanValue()) {
                return vVar;
            }
        }
        return null;
    }

    public final boolean g() {
        p2 p2Var = this.F;
        return (p2Var == null || p2Var.a.isEmpty()) ? false : true;
    }

    public final void h(List list) {
        this.F = new p2(list);
    }

    public final void i(List list) {
        this.I = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        cVar.x(g1Var, this.B);
        if (this.C != null) {
            cVar.r("message");
            cVar.x(g1Var, this.C);
        }
        if (this.D != null) {
            cVar.r("logger");
            cVar.A(this.D);
        }
        p2 p2Var = this.E;
        if (p2Var != null && !p2Var.a.isEmpty()) {
            cVar.r("threads");
            cVar.k();
            cVar.r("values");
            cVar.x(g1Var, this.E.a);
            cVar.m();
        }
        p2 p2Var2 = this.F;
        if (p2Var2 != null && !p2Var2.a.isEmpty()) {
            cVar.r("exception");
            cVar.k();
            cVar.r("values");
            cVar.x(g1Var, this.F.a);
            cVar.m();
        }
        if (this.G != null) {
            cVar.r("level");
            cVar.x(g1Var, this.G);
        }
        if (this.H != null) {
            cVar.r("transaction");
            cVar.A(this.H);
        }
        if (this.I != null) {
            cVar.r("fingerprint");
            cVar.x(g1Var, this.I);
        }
        if (this.K != null) {
            cVar.r("modules");
            cVar.x(g1Var, this.K);
        }
        io.sentry.config.a.D(this, cVar, g1Var);
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.J, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }

    public v5(Exception exc) {
        this();
        this.v = exc;
    }
}
