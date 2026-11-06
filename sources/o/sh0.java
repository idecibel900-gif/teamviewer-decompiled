package o;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 extends wh0 {
    public final int q;
    public final int r;

    public sh0(byte[] bArr, int i, int i2) {
        super(bArr);
        wh0.b(i, i + i2, bArr.length);
        this.q = i;
        this.r = i2;
    }

    @Override // o.wh0
    public final byte a(int i) {
        int i2 = this.r;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.n[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(fx3.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ua5.l("Index > length: ", i, i2, ", "));
    }

    @Override // o.wh0
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.n, this.q, bArr, 0, i);
    }

    @Override // o.wh0
    public final int f() {
        return this.q;
    }

    @Override // o.wh0
    public final byte g(int i) {
        return this.n[this.q + i];
    }

    @Override // o.wh0
    public final int size() {
        return this.r;
    }
}
