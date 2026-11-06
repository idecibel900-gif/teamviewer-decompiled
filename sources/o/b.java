package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(vn0.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(bf0 bf0Var, ai0 ai0Var, long j, long j2, int i) {
        sn6 sn6Var;
        long j3 = j;
        long j4 = j2;
        ai0Var.getClass();
        long j5 = i;
        ck3.p(ai0Var.d(), 0L, j5);
        if (i <= 0) {
            hk0.g("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            gk0.h(e41.g("fromIndex < 0: ", j3));
            return 0L;
        }
        if (j3 > j4) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j3 + " > " + j4).toString());
        }
        long j6 = bf0Var.n;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (sn6Var = bf0Var.m) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                sn6Var = sn6Var.g;
                sn6Var.getClass();
                j6 -= (long) (sn6Var.c - sn6Var.b);
            }
            byte[] bArrH = ai0Var.h();
            byte b2 = bArrH[0];
            long jMin = Math.min(j4, (bf0Var.n - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = sn6Var.a;
                int iMin = (int) Math.min(sn6Var.c, (((long) sn6Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) sn6Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(sn6Var, i2 + 1, bArrH, 1, i)) {
                        return ((long) (i2 - sn6Var.b)) + j6;
                    }
                }
                j6 += (long) (sn6Var.c - sn6Var.b);
                sn6Var = sn6Var.f;
                sn6Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (sn6Var.c - sn6Var.b));
            if (j8 > j3) {
                break;
            }
            sn6Var = sn6Var.f;
            sn6Var.getClass();
            j7 = j8;
        }
        byte[] bArrH2 = ai0Var.h();
        byte b3 = bArrH2[0];
        long jMin2 = Math.min(j4, (bf0Var.n - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = sn6Var.a;
            int iMin2 = (int) Math.min(sn6Var.c, (((long) sn6Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) sn6Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(sn6Var, i3 + 1, bArrH2, 1, i)) {
                    return ((long) (i3 - sn6Var.b)) + j7;
                }
            }
            j7 += (long) (sn6Var.c - sn6Var.b);
            sn6Var = sn6Var.f;
            sn6Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(sn6 sn6Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = sn6Var.c;
        byte[] bArr2 = sn6Var.a;
        while (i2 < i3) {
            if (i == i4) {
                sn6Var = sn6Var.f;
                sn6Var.getClass();
                byte[] bArr3 = sn6Var.a;
                bArr2 = bArr3;
                i = sn6Var.b;
                i4 = sn6Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(bf0 bf0Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (bf0Var.F(j2) == 13) {
                String strM0 = bf0Var.M0(j2, vn0.a);
                bf0Var.skip(2L);
                return strM0;
            }
        }
        String strM1 = bf0Var.M0(j, vn0.a);
        bf0Var.skip(1L);
        return strM1;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(bf0 bf0Var, ya5 ya5Var, boolean z) {
        int i;
        int i2;
        int i3;
        sn6 sn6Var;
        int i4;
        ya5Var.getClass();
        sn6 sn6Var2 = bf0Var.m;
        if (sn6Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = sn6Var2.a;
        int i5 = sn6Var2.b;
        int i6 = sn6Var2.c;
        int[] iArr = ya5Var.n;
        sn6 sn6Var3 = sn6Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (sn6Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            sn6Var3 = sn6Var3.f;
                            sn6Var3.getClass();
                            int i16 = sn6Var3.b;
                            byte[] bArr2 = sn6Var3.a;
                            i2 = sn6Var3.c;
                            if (sn6Var3 == sn6Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                sn6Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        sn6Var3.getClass();
                        sn6 sn6Var4 = sn6Var3.f;
                        sn6Var4.getClass();
                        i3 = sn6Var4.b;
                        byte[] bArr3 = sn6Var4.a;
                        i4 = sn6Var4.c;
                        if (sn6Var4 != sn6Var2) {
                            sn6Var = sn6Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            sn6Var = null;
                        }
                    } else {
                        sn6Var = sn6Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        sn6Var3 = sn6Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    sn6Var3 = sn6Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
