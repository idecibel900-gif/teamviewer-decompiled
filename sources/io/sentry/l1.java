package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public interface l1 {
    List A();

    List B();

    void C(v5 v5Var);

    io.sentry.protocol.e D();

    h4 F(m4 m4Var);

    String G();

    void H(o4 o4Var);

    void I(io.sentry.protocol.w wVar);

    void J(x1 x1Var);

    List K();

    io.sentry.protocol.i0 L();

    List M();

    String N();

    void O(h4 h4Var);

    void clear();

    l1 clone();

    void e(Throwable th, v7 v7Var, String str);

    void f(h hVar, p0 p0Var);

    v1 g();

    Map getAttributes();

    Map getExtras();

    io.sentry.protocol.j h();

    io.sentry.protocol.w j();

    void k(io.sentry.protocol.w wVar);

    g7 l();

    x1 m();

    u7 n();

    io.sentry.internal.debugmeta.c o();

    io.sentry.protocol.r p();

    void q();

    io.sentry.featureflags.b r();

    u7 s();

    Queue t();

    f6 u();

    h4 v();

    u7 w(n4 n4Var);

    void x(String str);

    q1 y();

    Map z();
}
