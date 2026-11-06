package io.sentry.instrumentation.file;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements a {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ g(int i, Object obj) {
        this.n = obj;
        this.m = i;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        h hVar = (h) this.n;
        hVar.m.write(this.m);
        return 1;
    }
}
