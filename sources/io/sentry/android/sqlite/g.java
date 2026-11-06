package io.sentry.android.sqlite;

import io.sentry.o;
import java.io.IOException;
import o.bf7;
import o.df7;
import o.kh7;

/* JADX INFO: loaded from: classes.dex */
public final class g implements df7 {
    public final df7 m;
    public final o n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kh7 f179o = new kh7(new f(this, 1));
    public final kh7 p = new kh7(new f(this, 0));

    public g(df7 df7Var) {
        this.m = df7Var;
        this.n = new o(df7Var.getDatabaseName());
    }

    public static final g e(df7 df7Var) {
        return df7Var instanceof g ? (g) df7Var : new g(df7Var);
    }

    @Override // o.df7
    public final bf7 R() {
        return (bf7) this.p.getValue();
    }

    @Override // o.df7
    public final bf7 X() {
        return (bf7) this.f179o.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.df7
    public final String getDatabaseName() {
        return this.m.getDatabaseName();
    }

    @Override // o.df7
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.m.setWriteAheadLoggingEnabled(z);
    }
}
