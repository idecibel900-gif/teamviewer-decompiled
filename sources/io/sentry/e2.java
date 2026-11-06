package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements j1 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.j1
    public final void a(z3 z3Var) {
        Runtime runtime = this.a;
        z3Var.c = runtime.totalMemory() - runtime.freeMemory();
        z3Var.d = true;
    }

    @Override // io.sentry.j1
    public final void c() {
    }
}
