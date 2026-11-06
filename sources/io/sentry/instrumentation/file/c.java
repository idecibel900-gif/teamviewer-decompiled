package io.sentry.instrumentation.file;

import io.sentry.g7;
import io.sentry.v1;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final File a;
    public final v1 b;
    public final g7 c;
    public final Closeable d;

    public /* synthetic */ c(File file, v1 v1Var, Closeable closeable, g7 g7Var) {
        this.a = file;
        this.b = v1Var;
        this.d = closeable;
        this.c = g7Var;
    }
}
