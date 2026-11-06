package o;

/* JADX INFO: loaded from: classes.dex */
public final class ym3 extends hm2 {
    public final hm2 d;

    public ym3(hm2 hm2Var) {
        super(hm2Var.b, hm2Var.c, (byte) 1);
        this.d = hm2Var;
    }

    @Override // o.hm2
    public final byte[] e() {
        byte[] bArrE = this.d.e();
        int i = this.b * this.c;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (bArrE[i2] & 255));
        }
        return bArr;
    }

    @Override // o.hm2
    public final byte[] f(byte[] bArr, int i) {
        byte[] bArrF = this.d.f(bArr, i);
        for (int i2 = 0; i2 < this.b; i2++) {
            bArrF[i2] = (byte) (255 - (bArrF[i2] & 255));
        }
        return bArrF;
    }

    @Override // o.hm2
    public final boolean g() {
        return this.d.g();
    }

    @Override // o.hm2
    public final hm2 h() {
        return new ym3(this.d.h());
    }
}
