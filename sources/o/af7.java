package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class af7 implements s41 {
    public final l07 m;

    public af7(l07 l07Var) {
        this.m = l07Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((df7) this.m.n).close();
    }

    @Override // o.s41
    public final Object p(boolean z, hw2 hw2Var, jc1 jc1Var) {
        df7 df7Var = (df7) this.m.n;
        df7Var.getDatabaseName();
        return hw2Var.invoke(new ff7(new ze7(df7Var.X())), jc1Var);
    }
}
