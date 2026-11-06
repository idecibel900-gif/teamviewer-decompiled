package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class z implements o1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.o1
    public final s1 a(n1 n1Var) {
        n1 n1Var2 = get();
        a.set(n1Var);
        return new y(n1Var2);
    }

    @Override // io.sentry.o1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.o1
    public final n1 get() {
        return (n1) a.get();
    }
}
