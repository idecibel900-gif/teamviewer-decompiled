package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public interface q1 {
    void a(boolean z);

    void b(long j);

    io.sentry.transport.p c();

    default boolean d() {
        return true;
    }

    void e(u7 u7Var, p0 p0Var);

    io.sentry.protocol.w f(io.sentry.protocol.k kVar, p0 p0Var, l1 l1Var);

    io.sentry.protocol.w g(i7 i7Var, l1 l1Var, p0 p0Var);

    io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var);

    void i(h6 h6Var, l1 l1Var);

    boolean isEnabled();

    io.sentry.protocol.w j(io.sentry.protocol.f0 f0Var, c8 c8Var, l1 l1Var, p0 p0Var, f4 f4Var);

    io.sentry.protocol.w k(c4 c4Var);

    io.sentry.protocol.w l(v5 v5Var, l1 l1Var, p0 p0Var);
}
