package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum f6 implements t2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) {
        ((io.sentry.internal.debugmeta.c) x3Var).A(name().toLowerCase(Locale.ROOT));
    }
}
