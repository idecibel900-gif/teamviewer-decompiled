package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class if7 extends kf7 {
    public final jf7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if7(bf7 bf7Var, String str) {
        super(bf7Var, str);
        bf7Var.getClass();
        str.getClass();
        this.p = bf7Var.x(str);
    }

    @Override // o.ug6
    public final boolean F0() {
        e();
        this.p.f();
        return false;
    }

    @Override // o.ug6
    public final void M(int i, String str) {
        str.getClass();
        e();
        this.p.t(i, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.p.close();
        this.f1261o = true;
    }

    @Override // o.ug6
    public final byte[] getBlob(int i) {
        e();
        us1.P(21, "no row");
        throw null;
    }

    @Override // o.ug6
    public final int getColumnCount() {
        e();
        return 0;
    }

    @Override // o.ug6
    public final String getColumnName(int i) {
        e();
        us1.P(21, "no row");
        throw null;
    }

    @Override // o.ug6
    public final long getLong(int i) {
        e();
        us1.P(21, "no row");
        throw null;
    }

    @Override // o.ug6
    public final String h0(int i) {
        e();
        us1.P(21, "no row");
        throw null;
    }

    @Override // o.ug6
    public final boolean isNull(int i) {
        e();
        us1.P(21, "no row");
        throw null;
    }

    @Override // o.ug6
    public final void k(int i, long j) {
        e();
        this.p.k(i, j);
    }

    @Override // o.ug6
    public final void l(byte[] bArr, int i) {
        e();
        this.p.l(bArr, i);
    }

    @Override // o.ug6
    public final void m(int i) {
        e();
        this.p.m(i);
    }

    @Override // o.ug6
    public final void reset() {
    }
}
