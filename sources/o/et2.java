package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class et2 implements v07 {
    public final v07 m;

    public et2(v07 v07Var) {
        v07Var.getClass();
        this.m = v07Var;
    }

    @Override // o.v07
    public void W(bf0 bf0Var, long j) {
        this.m.W(bf0Var, j);
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.m.close();
    }

    @Override // o.v07, java.io.Flushable
    public void flush() {
        this.m.flush();
    }

    @Override // o.v07
    public final ov7 i() {
        return this.m.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.m + ')';
    }
}
