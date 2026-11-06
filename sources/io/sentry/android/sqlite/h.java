package io.sentry.android.sqlite;

import io.sentry.android.replay.a0;
import io.sentry.o;
import java.io.IOException;
import o.jf7;

/* JADX INFO: loaded from: classes.dex */
public final class h implements jf7 {
    public final jf7 m;
    public final o n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f180o;

    public h(jf7 jf7Var, o oVar, String str) {
        jf7Var.getClass();
        oVar.getClass();
        str.getClass();
        this.m = jf7Var;
        this.n = oVar;
        this.f180o = str;
    }

    @Override // o.gf7
    public final void B(int i, double d) {
        this.m.B(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.jf7
    public final void f() throws Throwable {
        this.n.T(this.f180o, new a0(this, (byte) 5));
    }

    @Override // o.gf7
    public final void k(int i, long j) {
        this.m.k(i, j);
    }

    @Override // o.gf7
    public final void l(byte[] bArr, int i) {
        this.m.l(bArr, i);
    }

    @Override // o.gf7
    public final void m(int i) {
        this.m.m(i);
    }

    @Override // o.gf7
    public final void t(int i, String str) {
        str.getClass();
        this.m.t(i, str);
    }
}
