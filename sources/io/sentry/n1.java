package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public interface n1 {
    boolean A(n1 n1Var);

    io.sentry.protocol.w B(v5 v5Var, p0 p0Var);

    void a(boolean z);

    void b(long j);

    io.sentry.transport.p c();

    f1 clone();

    boolean d();

    void e(Throwable th, v7 v7Var, String str);

    void f(h hVar, p0 p0Var);

    v1 g();

    io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var);

    default boolean i() {
        return false;
    }

    boolean isEnabled();

    void j(h hVar);

    io.sentry.protocol.w k(c4 c4Var);

    g7 l();

    x1 m();

    void n();

    void o();

    x1 p(e8 e8Var, f8 f8Var);

    n1 q();

    void r(r4 r4Var);

    io.sentry.logger.a s();

    io.sentry.protocol.w t(i7 i7Var, p0 p0Var);

    l1 u();

    l1 v();

    e1 w();

    io.sentry.protocol.w x(Exception exc, p0 p0Var);

    io.sentry.protocol.w y(io.sentry.protocol.f0 f0Var, c8 c8Var, p0 p0Var, f4 f4Var);

    n1 z(String str);
}
