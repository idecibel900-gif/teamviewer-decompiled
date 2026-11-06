package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements l1 {
    public static final j3 b = new j3();
    public final io.sentry.util.h a = new io.sentry.util.h(new h2((byte) 2));

    @Override // io.sentry.l1
    public final List A() {
        return new ArrayList();
    }

    @Override // io.sentry.l1
    public final List B() {
        return new ArrayList();
    }

    @Override // io.sentry.l1
    public final void C(v5 v5Var) {
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.e D() {
        return new io.sentry.protocol.e();
    }

    @Override // io.sentry.l1
    public final h4 F(m4 m4Var) {
        return new h4();
    }

    @Override // io.sentry.l1
    public final String G() {
        return null;
    }

    @Override // io.sentry.l1
    public final void H(o4 o4Var) {
    }

    @Override // io.sentry.l1
    public final void I(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.l1
    public final void J(x1 x1Var) {
    }

    @Override // io.sentry.l1
    public final List K() {
        return new ArrayList();
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.i0 L() {
        return null;
    }

    @Override // io.sentry.l1
    public final List M() {
        return new ArrayList();
    }

    @Override // io.sentry.l1
    public final String N() {
        return null;
    }

    @Override // io.sentry.l1
    public final void O(h4 h4Var) {
    }

    @Override // io.sentry.l1
    public final void clear() {
    }

    @Override // io.sentry.l1
    public final l1 clone() {
        return b;
    }

    @Override // io.sentry.l1
    public final void e(Throwable th, v7 v7Var, String str) {
    }

    @Override // io.sentry.l1
    public final void f(h hVar, p0 p0Var) {
    }

    @Override // io.sentry.l1
    public final v1 g() {
        return null;
    }

    @Override // io.sentry.l1
    public final Map getAttributes() {
        return new HashMap();
    }

    @Override // io.sentry.l1
    public final Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.j h() {
        return null;
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.w j() {
        return io.sentry.protocol.w.n;
    }

    @Override // io.sentry.l1
    public final void k(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.l1
    public final g7 l() {
        return (g7) this.a.a();
    }

    @Override // io.sentry.l1
    public final x1 m() {
        return null;
    }

    @Override // io.sentry.l1
    public final u7 n() {
        return null;
    }

    @Override // io.sentry.l1
    public final io.sentry.internal.debugmeta.c o() {
        return null;
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.r p() {
        return null;
    }

    @Override // io.sentry.l1
    public final void q() {
    }

    @Override // io.sentry.l1
    public final io.sentry.featureflags.b r() {
        return io.sentry.featureflags.c.m;
    }

    @Override // io.sentry.l1
    public final u7 s() {
        return null;
    }

    @Override // io.sentry.l1
    public final Queue t() {
        return new ArrayDeque();
    }

    @Override // io.sentry.l1
    public final f6 u() {
        return null;
    }

    @Override // io.sentry.l1
    public final h4 v() {
        return new h4();
    }

    @Override // io.sentry.l1
    public final u7 w(n4 n4Var) {
        return null;
    }

    @Override // io.sentry.l1
    public final void x(String str) {
    }

    @Override // io.sentry.l1
    public final q1 y() {
        return n3.a;
    }

    @Override // io.sentry.l1
    public final Map z() {
        return new HashMap();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m25clone() {
        return b;
    }
}
