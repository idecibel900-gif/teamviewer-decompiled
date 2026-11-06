package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 implements d72 {
    public final iy3 a;

    public jy3(iy3 iy3Var) {
        this.a = iy3Var;
    }

    @Override // o.rl2, o.jo
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jc8 a(yn1 yn1Var) {
        int[] iArr;
        Object[] objArr;
        iy3 iy3Var = this.a;
        kw4 kw4Var = iy3Var.b;
        jw4 jw4Var = new jw4(kw4Var.e + 2);
        kw4 kw4Var2 = new kw4(kw4Var.e);
        int[] iArr2 = kw4Var.b;
        Object[] objArr2 = kw4Var.c;
        long[] jArr = kw4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            hy3 hy3Var = (hy3) objArr2[i5];
                            jw4Var.a(i6);
                            kw4Var2.i(i6, new ic8((qo) yn1Var.b().invoke(hy3Var.a), hy3Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!kw4Var.a(0)) {
            int i7 = jw4Var.b;
            if (i7 < 0) {
                hk0.r("Index must be between 0 and size");
                return null;
            }
            jw4Var.b(i7 + 1);
            int[] iArr3 = jw4Var.a;
            int i8 = jw4Var.b;
            if (i8 != 0) {
                cx.F0(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            jw4Var.b++;
        }
        if (!kw4Var.a(iy3Var.a)) {
            jw4Var.a(iy3Var.a);
        }
        int i9 = jw4Var.b;
        if (i9 != 0) {
            int[] iArr4 = jw4Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new jc8(jw4Var, kw4Var2, iy3Var.a, q72.c);
    }
}
