package io.sentry.android.core.internal.profiling;

import io.sentry.l5;
import io.sentry.profiling.c;
import io.sentry.protocol.w;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final w a;
    public final l5 b;
    public volatile l5 c = null;
    public c d = c.UNKNOWN;

    public a(w wVar, l5 l5Var) {
        this.a = wVar;
        this.b = l5Var;
    }

    public final synchronized void a(c cVar) {
        if (this.d == c.NOT_RECORDED) {
            return;
        }
        this.d = cVar;
    }
}
