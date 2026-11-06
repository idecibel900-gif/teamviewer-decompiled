package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ft2 implements q67 {
    public final q67 m;

    public ft2(q67 q67Var) {
        q67Var.getClass();
        this.m = q67Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.m.close();
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.m.i();
    }

    @Override // o.q67
    public long i0(bf0 bf0Var, long j) {
        bf0Var.getClass();
        return this.m.i0(bf0Var, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.m + ')';
    }
}
