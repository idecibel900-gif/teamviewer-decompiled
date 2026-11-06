package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class w4 implements n1 {
    public static final w4 a = new w4();

    @Override // io.sentry.n1
    public final boolean A(n1 n1Var) {
        return d5.c().A(n1Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w B(v5 v5Var, p0 p0Var) {
        return d5.c().B(v5Var, p0Var);
    }

    @Override // io.sentry.n1
    public final void a(boolean z) {
        d5.b();
    }

    @Override // io.sentry.n1
    public final void b(long j) {
        d5.c().b(j);
    }

    @Override // io.sentry.n1
    public final io.sentry.transport.p c() {
        return d5.c().c();
    }

    @Override // io.sentry.n1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final f1 m32clone() {
        return d5.c().m30clone();
    }

    @Override // io.sentry.n1
    public final boolean d() {
        return d5.c().d();
    }

    @Override // io.sentry.n1
    public final void e(Throwable th, v7 v7Var, String str) {
        d5.c().e(th, v7Var, str);
    }

    @Override // io.sentry.n1
    public final void f(h hVar, p0 p0Var) {
        d5.c().f(hVar, p0Var);
    }

    @Override // io.sentry.n1
    public final v1 g() {
        return d5.c().g();
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        return d5.c().h(cVar, p0Var);
    }

    @Override // io.sentry.n1
    public final boolean isEnabled() {
        return d5.g();
    }

    @Override // io.sentry.n1
    public final void j(h hVar) {
        f(hVar, new p0());
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w k(c4 c4Var) {
        return d5.c().k(c4Var);
    }

    @Override // io.sentry.n1
    public final g7 l() {
        return d5.c().l();
    }

    @Override // io.sentry.n1
    public final x1 m() {
        return d5.c().m();
    }

    @Override // io.sentry.n1
    public final void n() {
        d5.c().n();
    }

    @Override // io.sentry.n1
    public final void o() {
        d5.c().o();
    }

    @Override // io.sentry.n1
    public final x1 p(e8 e8Var, f8 f8Var) {
        return d5.c().p(e8Var, f8Var);
    }

    @Override // io.sentry.n1
    public final n1 q() {
        return d5.c().q();
    }

    @Override // io.sentry.n1
    public final void r(r4 r4Var) {
        d5.c().r(r4Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.logger.a s() {
        return d5.c().s();
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w t(i7 i7Var, p0 p0Var) {
        return d5.c().t(i7Var, p0Var);
    }

    @Override // io.sentry.n1
    public final l1 u() {
        return d5.c;
    }

    @Override // io.sentry.n1
    public final l1 v() {
        return d5.c().v();
    }

    @Override // io.sentry.n1
    public final e1 w() {
        return d5.c().w();
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w x(Exception exc, p0 p0Var) {
        return d5.a(exc, p0Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w y(io.sentry.protocol.f0 f0Var, c8 c8Var, p0 p0Var, f4 f4Var) {
        return d5.c().y(f0Var, c8Var, p0Var, f4Var);
    }

    @Override // io.sentry.n1
    public final n1 z(String str) {
        return d5.c().z("getCurrentScopes");
    }
}
