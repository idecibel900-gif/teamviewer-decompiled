package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public final n1 a;
    public final g1 b;
    public final long c;
    public final b8 d;

    public d0(n1 n1Var, g1 g1Var, long j, int i) {
        this.a = n1Var;
        this.b = g1Var;
        this.c = j;
        this.d = new b8(new k(i));
    }

    public boolean a(String str) {
        return str.endsWith(".envelope");
    }

    public abstract void b(File file, p0 p0Var);
}
