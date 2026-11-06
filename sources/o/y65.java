package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y65 extends nc6 {
    public final nc6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w36 f2582o;
    public IOException p;

    public y65(nc6 nc6Var) {
        this.n = nc6Var;
        this.f2582o = new w36(new m70(this, nc6Var.E0()));
    }

    @Override // o.nc6
    public final of0 E0() {
        return this.f2582o;
    }

    @Override // o.nc6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // o.nc6
    public final long j() {
        return this.n.j();
    }

    @Override // o.nc6
    public final jo4 q() {
        return this.n.q();
    }
}
