package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements f1 {
    public final v4 a;

    public w0(v4 v4Var) {
        this.a = v4Var;
    }

    @Override // io.sentry.n1
    public final boolean A(n1 n1Var) {
        return this.a.A(n1Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w B(v5 v5Var, p0 p0Var) {
        return this.a.B(v5Var, p0Var);
    }

    @Override // io.sentry.n1
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // io.sentry.n1
    public final void b(long j) {
        this.a.b(j);
    }

    @Override // io.sentry.n1
    public final io.sentry.transport.p c() {
        return this.a.c();
    }

    @Override // io.sentry.n1
    /* JADX INFO: renamed from: clone */
    public final f1 m32clone() {
        return this.a.m32clone();
    }

    @Override // io.sentry.n1
    public final boolean d() {
        return this.a.d();
    }

    @Override // io.sentry.n1
    public final void e(Throwable th, v7 v7Var, String str) {
        this.a.e(th, v7Var, str);
    }

    @Override // io.sentry.n1
    public final void f(h hVar, p0 p0Var) {
        this.a.f(hVar, p0Var);
    }

    @Override // io.sentry.n1
    public final v1 g() {
        return this.a.g();
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        return this.a.h(cVar, p0Var);
    }

    @Override // io.sentry.n1
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // io.sentry.n1
    public final void j(h hVar) {
        this.a.j(hVar);
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w k(c4 c4Var) {
        return this.a.k(c4Var);
    }

    @Override // io.sentry.n1
    public final g7 l() {
        return this.a.l();
    }

    @Override // io.sentry.n1
    public final x1 m() {
        return this.a.m();
    }

    @Override // io.sentry.n1
    public final void n() {
        this.a.n();
    }

    @Override // io.sentry.n1
    public final void o() {
        this.a.o();
    }

    @Override // io.sentry.n1
    public final x1 p(e8 e8Var, f8 f8Var) {
        return this.a.p(e8Var, f8Var);
    }

    @Override // io.sentry.n1
    public final n1 q() {
        return this.a.d;
    }

    @Override // io.sentry.n1
    public final void r(r4 r4Var) {
        this.a.r(r4Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.logger.a s() {
        return this.a.g;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w t(i7 i7Var, p0 p0Var) {
        return this.a.t(i7Var, p0Var);
    }

    @Override // io.sentry.n1
    public final l1 u() {
        return d5.c;
    }

    @Override // io.sentry.n1
    public final l1 v() {
        return this.a.a;
    }

    @Override // io.sentry.n1
    public final e1 w() {
        return this.a.h;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w x(Exception exc, p0 p0Var) {
        return this.a.x(exc, p0Var);
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w y(io.sentry.protocol.f0 f0Var, c8 c8Var, p0 p0Var, f4 f4Var) {
        return this.a.y(f0Var, c8Var, p0Var, f4Var);
    }

    @Override // io.sentry.n1
    public final n1 z(String str) {
        return this.a.z("getCurrentScopes");
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m31clone() {
        return this.a.m32clone();
    }
}
