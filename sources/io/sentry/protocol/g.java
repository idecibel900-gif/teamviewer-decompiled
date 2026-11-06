package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum g implements t2 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) {
        ((io.sentry.internal.debugmeta.c) x3Var).A(toString().toLowerCase(Locale.ROOT));
    }
}
