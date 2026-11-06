package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.f6;
import io.sentry.y3;
import java.io.File;
import o.e41;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends FileObserver {
    public final String a;
    public final y3 b;
    public final io.sentry.g1 c;
    public final long d;

    public e1(String str, y3 y3Var, io.sentry.g1 g1Var, long j) {
        super(str);
        this.a = str;
        this.b = y3Var;
        io.sentry.util.b.v(g1Var, "Logger is required.");
        this.c = g1Var;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        f6 f6Var = f6.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        io.sentry.g1 g1Var = this.c;
        g1Var.g(f6Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        io.sentry.p0 p0VarG = io.sentry.util.b.g(new d1(this.d, g1Var));
        this.b.b(new File(e41.l(new StringBuilder(str2), File.separator, str)), p0VarG);
    }
}
