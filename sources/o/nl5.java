package o;

/* JADX INFO: loaded from: classes.dex */
public final class nl5 extends hm2 {
    public final byte[] d;
    public final int e;
    public final int f;

    public nl5(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4, (byte) 1);
        if (i3 > i || i4 > i2) {
            hk0.g("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // o.hm2
    public final byte[] e() {
        byte[] bArr = this.d;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.e;
        if (i == i3 && i2 == this.f) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        if (i == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    @Override // o.hm2
    public final byte[] f(byte[] bArr, int i) {
        if (i < 0 || i >= this.c) {
            hk0.g(fx3.e(i, "Requested row is outside the image: "));
            return null;
        }
        int i2 = this.b;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.d, i * this.e, bArr, 0, i2);
        return bArr;
    }
}
