package o;

/* JADX INFO: loaded from: classes.dex */
public final class d46 implements AutoCloseable {
    public final w12 m;

    public d46(w12 w12Var) {
        this.m = w12Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }
}
