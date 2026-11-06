package o;

/* JADX INFO: loaded from: classes.dex */
public final class gu0 implements AutoCloseable, me1 {
    public final de1 m;

    public gu0(de1 de1Var) {
        de1Var.getClass();
        this.m = de1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ds1.A(this.m, null);
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.m;
    }
}
