package o;

/* JADX INFO: loaded from: classes.dex */
public final class rh0 extends vh0 {
    public final int q;
    public final int r;

    public rh0(byte[] bArr, int i, int i2) {
        super(bArr);
        yh0.b(i, i + i2, bArr.length);
        this.q = i;
        this.r = i2;
    }

    @Override // o.vh0, o.yh0
    public final byte a(int i) {
        int i2 = this.r;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.p[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(fx3.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ua5.l("Index > length: ", i, i2, ", "));
    }

    @Override // o.vh0, o.yh0
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.p, this.q, bArr, 0, i);
    }

    @Override // o.vh0, o.yh0
    public final byte f(int i) {
        return this.p[this.q + i];
    }

    @Override // o.vh0
    public final int g() {
        return this.q;
    }

    @Override // o.vh0, o.yh0
    public final int size() {
        return this.r;
    }
}
