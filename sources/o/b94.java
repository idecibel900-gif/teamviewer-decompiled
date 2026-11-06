package o;

/* JADX INFO: loaded from: classes.dex */
public final class b94 extends oe8 {
    public final kw4 n;

    public b94() {
        kw4 kw4Var = uk3.a;
        this.n = new kw4();
    }

    @Override // o.oe8
    public final void U0() {
        kw4 kw4Var = this.n;
        int[] iArr = kw4Var.b;
        Object[] objArr = kw4Var.c;
        long[] jArr = kw4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        zw4 zw4Var = (zw4) objArr[i4];
                        Object[] objArr2 = zw4Var.a;
                        int i6 = zw4Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            a94 a94Var = (a94) objArr2[i7];
                            hl0 hl0Var = a94Var.d;
                            if (hl0Var != null) {
                                hl0Var.cancel();
                            }
                            a94Var.d = null;
                            am4 am4Var = (am4) a94Var.a.n;
                            am4Var.n = true;
                            am4Var.m = false;
                            am4Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
