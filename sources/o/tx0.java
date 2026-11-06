package o;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class tx0 extends CompletableFuture {
    public final a75 m;

    public tx0(a75 a75Var) {
        this.m = a75Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.m.cancel();
        }
        return super.cancel(z);
    }
}
