package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements x0, c1, e1, j4, y1, z1, z5, g1 {
    public static final a3 m = new a3();
    public static final a3 n = new a3();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a3 f84o = new a3();
    public static final a3 p = new a3();
    public static final a3 q = new a3();

    @Override // io.sentry.j4
    public void F() {
    }

    @Override // io.sentry.j4
    public void G(io.sentry.android.replay.d dVar) {
    }

    @Override // io.sentry.y1
    public void a(x1 x1Var) {
    }

    @Override // io.sentry.g1
    public void b(f6 f6Var, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(f6Var + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.j4
    public void b0() {
    }

    @Override // io.sentry.y1
    public f4 c(s7 s7Var, List list, g7 g7Var) {
        return null;
    }

    @Override // io.sentry.j4
    public void c0(String str) {
    }

    @Override // io.sentry.y1
    public void close() {
    }

    @Override // io.sentry.g1
    public void d(f6 f6Var, String str, Throwable th) {
        if (th == null) {
            g(f6Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(f6Var + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.j4
    public io.sentry.protocol.w e(Boolean bool) {
        return io.sentry.protocol.w.n;
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.w f(io.sentry.protocol.k kVar, p0 p0Var) {
        return io.sentry.protocol.w.n;
    }

    @Override // io.sentry.g1
    public void g(f6 f6Var, String str, Object... objArr) {
        System.out.println(f6Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.z1
    public io.sentry.transport.g h(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(sentryAndroidOptions, new io.sentry.transport.p(sentryAndroidOptions.getMonotonicTicker(), sentryAndroidOptions), sentryAndroidOptions.getTransportGate(), cVar);
    }

    @Override // io.sentry.g1
    public boolean i(f6 f6Var) {
        return true;
    }

    @Override // io.sentry.y1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.j4
    public io.sentry.protocol.w j() {
        return io.sentry.protocol.w.n;
    }

    @Override // io.sentry.j4
    /* JADX INFO: renamed from: k0 */
    public i4 getY() {
        return i3.a;
    }

    @Override // io.sentry.j4
    public void q(boolean z) {
    }

    @Override // io.sentry.y1
    public void start() {
    }

    @Override // io.sentry.j4
    public void stop() {
    }

    @Override // io.sentry.z5
    public boolean u() {
        return false;
    }

    @Override // io.sentry.j4
    public void z(io.sentry.protocol.w wVar) {
    }
}
