package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m extends io.sentry.protocol.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.protocol.e f212o;
    public final io.sentry.protocol.e p;
    public final io.sentry.protocol.e q;
    public final t4 r;

    public m(io.sentry.protocol.e eVar, io.sentry.protocol.e eVar2, io.sentry.protocol.e eVar3, t4 t4Var) {
        this.f212o = eVar;
        this.p = eVar2;
        this.q = eVar3;
        this.r = t4Var;
    }

    public final io.sentry.protocol.e A() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.m(this.f212o);
        eVar.m(this.p);
        eVar.m(this.q);
        return eVar;
    }

    @Override // io.sentry.protocol.e
    public final void a() {
        z().a();
    }

    @Override // io.sentry.protocol.e
    public final boolean b(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Set c() {
        return A().m.entrySet();
    }

    @Override // io.sentry.protocol.e
    public final Object d(Object obj) {
        Object objD = this.q.d(obj);
        if (objD != null) {
            return objD;
        }
        Object objD2 = this.p.d(obj);
        return objD2 != null ? objD2 : this.f212o.d(obj);
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.a e() {
        io.sentry.protocol.a aVarE = this.q.e();
        if (aVarE != null) {
            return aVarE;
        }
        io.sentry.protocol.a aVarE2 = this.p.e();
        return aVarE2 != null ? aVarE2 : this.f212o.e();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.h f() {
        io.sentry.protocol.h hVarF = this.q.f();
        if (hVarF != null) {
            return hVarF;
        }
        io.sentry.protocol.h hVarF2 = this.p.f();
        return hVarF2 != null ? hVarF2 : this.f212o.f();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.j g() {
        io.sentry.protocol.j jVarG = this.q.g();
        if (jVarG != null) {
            return jVarG;
        }
        io.sentry.protocol.j jVarG2 = this.p.g();
        return jVarG2 != null ? jVarG2 : this.f212o.g();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.q h() {
        io.sentry.protocol.q qVarH = this.q.h();
        if (qVarH != null) {
            return qVarH;
        }
        io.sentry.protocol.q qVarH2 = this.p.h();
        return qVarH2 != null ? qVarH2 : this.f212o.h();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.y i() {
        io.sentry.protocol.y yVarI = this.q.i();
        if (yVarI != null) {
            return yVarI;
        }
        io.sentry.protocol.y yVarI2 = this.p.i();
        return yVarI2 != null ? yVarI2 : this.f212o.i();
    }

    @Override // io.sentry.protocol.e
    public final w7 j() {
        w7 w7VarJ = this.q.j();
        if (w7VarJ != null) {
            return w7VarJ;
        }
        w7 w7VarJ2 = this.p.j();
        return w7VarJ2 != null ? w7VarJ2 : this.f212o.j();
    }

    @Override // io.sentry.protocol.e
    public final Enumeration k() {
        return A().m.keys();
    }

    @Override // io.sentry.protocol.e
    public final Object l(Object obj, String str) {
        return z().l(obj, str);
    }

    @Override // io.sentry.protocol.e
    public final void m(io.sentry.protocol.e eVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Object n(String str) {
        return z().n("profile");
    }

    @Override // io.sentry.protocol.e
    public final void o(io.sentry.protocol.a aVar) {
        z().o(aVar);
    }

    @Override // io.sentry.protocol.e
    public final void p(io.sentry.protocol.d dVar) {
        z().p(dVar);
    }

    @Override // io.sentry.protocol.e
    public final void q(io.sentry.protocol.h hVar) {
        z().q(hVar);
    }

    @Override // io.sentry.protocol.e
    public final void r(io.sentry.protocol.j jVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void s(io.sentry.protocol.m mVar) {
        z().s(mVar);
    }

    @Override // io.sentry.protocol.e, io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        A().serialize(x3Var, g1Var);
    }

    @Override // io.sentry.protocol.e
    public final void t(io.sentry.protocol.q qVar) {
        z().t(qVar);
    }

    @Override // io.sentry.protocol.e
    public final void u(io.sentry.protocol.s sVar) {
        z().u(sVar);
    }

    @Override // io.sentry.protocol.e
    public final void v(io.sentry.protocol.y yVar) {
        z().v(yVar);
    }

    @Override // io.sentry.protocol.e
    public final void w(io.sentry.protocol.g0 g0Var) {
        z().w(g0Var);
    }

    @Override // io.sentry.protocol.e
    public final void x(w7 w7Var) {
        z().x(w7Var);
    }

    public final io.sentry.protocol.e z() {
        int i = l.a[this.r.ordinal()];
        io.sentry.protocol.e eVar = this.q;
        if (i == 1) {
            return eVar;
        }
        if (i != 2) {
            return i != 3 ? eVar : this.f212o;
        }
        return this.p;
    }
}
