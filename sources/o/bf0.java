package o;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class bf0 implements of0, nf0, Cloneable, ByteChannel {
    public sn6 m;
    public long n;

    @Override // o.of0
    public final long C(ai0 ai0Var) {
        ai0Var.getClass();
        byte[] bArr = b.a;
        return b.a(this, ai0Var, 0L, Long.MAX_VALUE, ai0Var.d());
    }

    @Override // o.of0
    public final boolean C0(ai0 ai0Var) {
        ai0Var.getClass();
        return Y(0L, ai0Var, ai0Var.d());
    }

    public final byte F(long j) {
        ck3.p(this.n, j, 1L);
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        long j2 = this.n;
        if (j2 - j < j) {
            while (j2 > j) {
                sn6Var = sn6Var.g;
                sn6Var.getClass();
                j2 -= (long) (sn6Var.c - sn6Var.b);
            }
            return sn6Var.a[(int) ((((long) sn6Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = sn6Var.c;
            int i2 = sn6Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return sn6Var.a[(int) ((((long) i2) + j) - j3)];
            }
            sn6Var = sn6Var.f;
            sn6Var.getClass();
            j3 = j4;
        }
    }

    public final int H0() throws EOFException {
        if (this.n < 4) {
            throw new EOFException();
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        int i = sn6Var.b;
        int i2 = sn6Var.c;
        if (i2 - i < 4) {
            return (c0() & 255) | ((c0() & 255) << 24) | ((c0() & 255) << 16) | ((c0() & 255) << 8);
        }
        byte[] bArr = sn6Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.n -= 4;
        if (i5 != i2) {
            sn6Var.b = i5;
            return i6;
        }
        this.m = sn6Var.a();
        vn6.a(sn6Var);
        return i6;
    }

    @Override // o.of0
    public final int I0(ya5 ya5Var) throws EOFException {
        ya5Var.getClass();
        int iD = b.d(this, ya5Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(ya5Var.m[iD].d());
        return iD;
    }

    public final long J(ai0 ai0Var, long j) {
        ai0Var.getClass();
        long j2 = 0;
        if (j < 0) {
            gk0.h(e41.g("fromIndex < 0: ", j));
            return 0L;
        }
        sn6 sn6Var = this.m;
        if (sn6Var == null) {
            return -1L;
        }
        long j3 = this.n;
        if (j3 - j < j) {
            while (j3 > j) {
                sn6Var = sn6Var.g;
                sn6Var.getClass();
                j3 -= (long) (sn6Var.c - sn6Var.b);
            }
            if (ai0Var.d() == 2) {
                byte bI = ai0Var.i(0);
                byte bI2 = ai0Var.i(1);
                while (j3 < this.n) {
                    byte[] bArr = sn6Var.a;
                    int i = sn6Var.c;
                    for (int i2 = (int) ((((long) sn6Var.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bI || b == bI2) {
                            return ((long) (i2 - sn6Var.b)) + j3;
                        }
                    }
                    j3 += (long) (sn6Var.c - sn6Var.b);
                    sn6Var = sn6Var.f;
                    sn6Var.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrH = ai0Var.h();
                while (j3 < this.n) {
                    byte[] bArr2 = sn6Var.a;
                    int i3 = sn6Var.c;
                    for (int i4 = (int) ((((long) sn6Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrH) {
                            if (b2 == b3) {
                                return ((long) (i4 - sn6Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (sn6Var.c - sn6Var.b);
                    sn6Var = sn6Var.f;
                    sn6Var.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (sn6Var.c - sn6Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            sn6Var = sn6Var.f;
            sn6Var.getClass();
            j2 = j4;
        }
        if (ai0Var.d() == 2) {
            byte bI3 = ai0Var.i(0);
            byte bI4 = ai0Var.i(1);
            while (j2 < this.n) {
                byte[] bArr3 = sn6Var.a;
                int i5 = sn6Var.c;
                for (int i6 = (int) ((((long) sn6Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bI3 || b4 == bI4) {
                        return ((long) (i6 - sn6Var.b)) + j2;
                    }
                }
                j2 += (long) (sn6Var.c - sn6Var.b);
                sn6Var = sn6Var.f;
                sn6Var.getClass();
                j = j2;
            }
        } else {
            byte[] bArrH2 = ai0Var.h();
            while (j2 < this.n) {
                byte[] bArr4 = sn6Var.a;
                int i7 = sn6Var.c;
                for (int i8 = (int) ((((long) sn6Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrH2) {
                        if (b5 == b6) {
                            return ((long) (i8 - sn6Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (sn6Var.c - sn6Var.b);
                sn6Var = sn6Var.f;
                sn6Var.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    public final short K0() throws EOFException {
        if (this.n < 2) {
            throw new EOFException();
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        int i = sn6Var.b;
        int i2 = sn6Var.c;
        if (i2 - i < 2) {
            return (short) ((c0() & 255) | ((c0() & 255) << 8));
        }
        byte[] bArr = sn6Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.n -= 2;
        if (i5 == i2) {
            this.m = sn6Var.a();
            vn6.a(sn6Var);
        } else {
            sn6Var.b = i5;
        }
        return (short) i6;
    }

    public final short L0() throws EOFException {
        short sK0 = K0();
        return (short) (((sK0 & 255) << 8) | ((65280 & sK0) >>> 8));
    }

    public final String M0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            gk0.h(e41.g("byteCount: ", j));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        int i = sn6Var.b;
        if (((long) i) + j > sn6Var.c) {
            return new String(k0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(sn6Var.a, i, i2, charset);
        int i3 = sn6Var.b + i2;
        sn6Var.b = i3;
        this.n -= j;
        if (i3 == sn6Var.c) {
            this.m = sn6Var.a();
            vn6.a(sn6Var);
        }
        return str;
    }

    public final String N0() {
        return M0(this.n, vn0.a);
    }

    public final int O0() {
        int i;
        int i2;
        int i3;
        if (this.n == 0) {
            throw new EOFException();
        }
        byte bF = F(0L);
        if ((bF & 128) == 0) {
            i = bF & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bF & 224) == 192) {
            i = bF & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bF & 240) == 224) {
            i = bF & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bF & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bF & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.n < j) {
            StringBuilder sbK = fx3.k(i2, "size < ", ": ");
            sbK.append(this.n);
            sbK.append(" (to read code point prefixed 0x");
            char[] cArr = kh.a;
            sbK.append(new String(new char[]{cArr[(bF >> 4) & 15], cArr[bF & 15]}));
            sbK.append(')');
            throw new EOFException(sbK.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bF2 = F(j2);
            if ((bF2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bF2 & 63);
        }
        skip(j);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
            return i;
        }
        return 65533;
    }

    @Override // o.nf0
    public final /* bridge */ /* synthetic */ nf0 P(byte[] bArr, int i) {
        S0(bArr, i);
        return this;
    }

    public final ai0 P0(int i) {
        if (i == 0) {
            return ai0.p;
        }
        ck3.p(this.n, 0L, i);
        sn6 sn6Var = this.m;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            sn6Var.getClass();
            int i5 = sn6Var.c;
            int i6 = sn6Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            sn6Var = sn6Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        sn6 sn6Var2 = this.m;
        int i7 = 0;
        while (i2 < i) {
            sn6Var2.getClass();
            bArr[i7] = sn6Var2.a;
            i2 += sn6Var2.c - sn6Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = sn6Var2.b;
            sn6Var2.d = true;
            i7++;
            sn6Var2 = sn6Var2.f;
        }
        return new wn6(bArr, iArr);
    }

    public final sn6 Q0(int i) {
        if (i < 1 || i > 8192) {
            hk0.g("unexpected capacity");
            return null;
        }
        sn6 sn6Var = this.m;
        if (sn6Var == null) {
            sn6 sn6VarB = vn6.b();
            this.m = sn6VarB;
            sn6VarB.g = sn6VarB;
            sn6VarB.f = sn6VarB;
            return sn6VarB;
        }
        sn6 sn6Var2 = sn6Var.g;
        sn6Var2.getClass();
        if (sn6Var2.c + i <= 8192 && sn6Var2.e) {
            return sn6Var2;
        }
        sn6 sn6VarB2 = vn6.b();
        sn6Var2.b(sn6VarB2);
        return sn6VarB2;
    }

    public final void R0(ai0 ai0Var) {
        ai0Var.getClass();
        ai0Var.t(this, ai0Var.d());
    }

    public final void S0(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        ck3.p(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            sn6 sn6VarQ0 = Q0(1);
            int iMin = Math.min(i - i2, 8192 - sn6VarQ0.c);
            int i3 = i2 + iMin;
            cx.E0(sn6VarQ0.c, i2, i3, bArr, sn6VarQ0.a);
            sn6VarQ0.c += iMin;
            i2 = i3;
        }
        this.n += j;
    }

    @Override // o.of0
    public final long T(ai0 ai0Var) {
        ai0Var.getClass();
        return J(ai0Var, 0L);
    }

    public final void T0(q67 q67Var) {
        q67Var.getClass();
        while (q67Var.i0(this, 8192L) != -1) {
        }
    }

    public final void U0(int i) {
        sn6 sn6VarQ0 = Q0(1);
        byte[] bArr = sn6VarQ0.a;
        int i2 = sn6VarQ0.c;
        sn6VarQ0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.n++;
    }

    @Override // o.nf0
    public final /* bridge */ /* synthetic */ nf0 V(String str) {
        Z0(str);
        return this;
    }

    public final void V0(long j) {
        boolean z;
        if (j == 0) {
            U0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Z0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        sn6 sn6VarQ0 = Q0(i);
        byte[] bArr2 = sn6VarQ0.a;
        int i2 = sn6VarQ0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        sn6VarQ0.c += i;
        this.n += (long) i;
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) {
        sn6 sn6VarB;
        bf0Var.getClass();
        if (bf0Var == this) {
            hk0.g("source == this");
            return;
        }
        ck3.p(bf0Var.n, 0L, j);
        while (j > 0) {
            sn6 sn6Var = bf0Var.m;
            sn6Var.getClass();
            int i = sn6Var.c;
            sn6 sn6Var2 = bf0Var.m;
            sn6Var2.getClass();
            long j2 = i - sn6Var2.b;
            int i2 = 0;
            if (j < j2) {
                sn6 sn6Var3 = this.m;
                sn6 sn6Var4 = sn6Var3 != null ? sn6Var3.g : null;
                if (sn6Var4 != null && sn6Var4.e) {
                    if ((((long) sn6Var4.c) + j) - ((long) (sn6Var4.d ? 0 : sn6Var4.b)) <= 8192) {
                        sn6 sn6Var5 = bf0Var.m;
                        sn6Var5.getClass();
                        sn6Var5.d(sn6Var4, (int) j);
                        bf0Var.n -= j;
                        this.n += j;
                        return;
                    }
                }
                sn6 sn6Var6 = bf0Var.m;
                sn6Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > sn6Var6.c - sn6Var6.b) {
                    hk0.g("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    sn6VarB = sn6Var6.c();
                } else {
                    sn6VarB = vn6.b();
                    byte[] bArr = sn6Var6.a;
                    byte[] bArr2 = sn6VarB.a;
                    int i4 = sn6Var6.b;
                    cx.E0(0, i4, i4 + i3, bArr, bArr2);
                }
                sn6VarB.c = sn6VarB.b + i3;
                sn6Var6.b += i3;
                sn6 sn6Var7 = sn6Var6.g;
                sn6Var7.getClass();
                sn6Var7.b(sn6VarB);
                bf0Var.m = sn6VarB;
            }
            sn6 sn6Var8 = bf0Var.m;
            sn6Var8.getClass();
            long j3 = sn6Var8.c - sn6Var8.b;
            bf0Var.m = sn6Var8.a();
            sn6 sn6Var9 = this.m;
            if (sn6Var9 == null) {
                this.m = sn6Var8;
                sn6Var8.g = sn6Var8;
                sn6Var8.f = sn6Var8;
            } else {
                sn6 sn6Var10 = sn6Var9.g;
                sn6Var10.getClass();
                sn6Var10.b(sn6Var8);
                sn6 sn6Var11 = sn6Var8.g;
                if (sn6Var11 == sn6Var8) {
                    hk0.l("cannot compact");
                    return;
                }
                sn6Var11.getClass();
                if (sn6Var11.e) {
                    int i5 = sn6Var8.c - sn6Var8.b;
                    sn6 sn6Var12 = sn6Var8.g;
                    sn6Var12.getClass();
                    int i6 = 8192 - sn6Var12.c;
                    sn6 sn6Var13 = sn6Var8.g;
                    sn6Var13.getClass();
                    if (!sn6Var13.d) {
                        sn6 sn6Var14 = sn6Var8.g;
                        sn6Var14.getClass();
                        i2 = sn6Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        sn6 sn6Var15 = sn6Var8.g;
                        sn6Var15.getClass();
                        sn6Var8.d(sn6Var15, i5);
                        sn6Var8.a();
                        vn6.a(sn6Var8);
                    }
                }
            }
            bf0Var.n -= j3;
            this.n += j3;
            j -= j3;
        }
    }

    public final void W0(long j) {
        if (j == 0) {
            U0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        sn6 sn6VarQ0 = Q0(i);
        byte[] bArr = sn6VarQ0.a;
        int i2 = sn6VarQ0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        sn6VarQ0.c += i;
        this.n += (long) i;
    }

    public final void X0(int i) {
        sn6 sn6VarQ0 = Q0(4);
        byte[] bArr = sn6VarQ0.a;
        int i2 = sn6VarQ0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        sn6VarQ0.c = i2 + 4;
        this.n += 4;
    }

    public final boolean Y(long j, ai0 ai0Var, int i) {
        ai0Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.n && i <= ai0Var.d()) {
            return i == 0 || b.a(this, ai0Var, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void Y0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            gk0.h(fx3.e(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            gk0.h(ua5.l("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbK = fx3.k(i2, "endIndex > string.length: ", " > ");
            sbK.append(str.length());
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                sn6 sn6VarQ0 = Q0(1);
                byte[] bArr = sn6VarQ0.a;
                int i3 = sn6VarQ0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = sn6VarQ0.c;
                int i6 = (i3 + i) - i5;
                sn6VarQ0.c = i5 + i6;
                this.n += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    sn6 sn6VarQ1 = Q0(2);
                    byte[] bArr2 = sn6VarQ1.a;
                    int i7 = sn6VarQ1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    sn6VarQ1.c = i7 + 2;
                    this.n += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        U0(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        sn6 sn6VarQ2 = Q0(4);
                        byte[] bArr3 = sn6VarQ2.a;
                        int i10 = sn6VarQ2.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        sn6VarQ2.c = i10 + 4;
                        this.n += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    sn6 sn6VarQ3 = Q0(3);
                    byte[] bArr4 = sn6VarQ3.a;
                    int i11 = sn6VarQ3.c;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    sn6VarQ3.c = i11 + 3;
                    this.n += 3;
                } else {
                    U0(63);
                }
                i++;
            }
        }
    }

    public final void Z0(String str) {
        str.getClass();
        Y0(0, str.length(), str);
    }

    @Override // o.of0
    public final String a0(Charset charset) {
        charset.getClass();
        return M0(this.n, charset);
    }

    public final void a1(int i) {
        if (i < 128) {
            U0(i);
            return;
        }
        if (i < 2048) {
            sn6 sn6VarQ0 = Q0(2);
            byte[] bArr = sn6VarQ0.a;
            int i2 = sn6VarQ0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            sn6VarQ0.c = i2 + 2;
            this.n += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            U0(63);
            return;
        }
        if (i < 65536) {
            sn6 sn6VarQ1 = Q0(3);
            byte[] bArr2 = sn6VarQ1.a;
            int i3 = sn6VarQ1.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            sn6VarQ1.c = i3 + 3;
            this.n += 3;
            return;
        }
        if (i > 1114111) {
            hk0.g("Unexpected code point: 0x".concat(ck3.w0(i)));
            return;
        }
        sn6 sn6VarQ2 = Q0(4);
        byte[] bArr3 = sn6VarQ2.a;
        int i4 = sn6VarQ2.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        sn6VarQ2.c = i4 + 4;
        this.n += 4;
    }

    public final byte c0() {
        if (this.n == 0) {
            throw new EOFException();
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        int i = sn6Var.b;
        int i2 = sn6Var.c;
        int i3 = i + 1;
        byte b = sn6Var.a[i];
        this.n--;
        if (i3 != i2) {
            sn6Var.b = i3;
            return b;
        }
        this.m = sn6Var.a();
        vn6.a(sn6Var);
        return b;
    }

    public final Object clone() {
        return q();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.v07
    public final void close() {
    }

    public final void e() throws EOFException {
        skip(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf0)) {
            return false;
        }
        long j = this.n;
        bf0 bf0Var = (bf0) obj;
        if (j != bf0Var.n) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        sn6 sn6Var2 = bf0Var.m;
        sn6Var2.getClass();
        int i = sn6Var.b;
        int i2 = sn6Var2.b;
        long j2 = 0;
        while (j2 < this.n) {
            long jMin = Math.min(sn6Var.c - i, sn6Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (sn6Var.a[i] != sn6Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == sn6Var.c) {
                sn6Var = sn6Var.f;
                sn6Var.getClass();
                i = sn6Var.b;
            }
            if (i2 == sn6Var2.c) {
                sn6Var2 = sn6Var2.f;
                sn6Var2.getClass();
                i2 = sn6Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() {
    }

    @Override // o.of0, o.nf0
    public final bf0 h() {
        return this;
    }

    public final int hashCode() {
        sn6 sn6Var = this.m;
        if (sn6Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sn6Var.c;
            for (int i3 = sn6Var.b; i3 < i2; i3++) {
                i = (i * 31) + sn6Var.a[i3];
            }
            sn6Var = sn6Var.f;
            sn6Var.getClass();
        } while (sn6Var != this.m);
        return i;
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return ov7.d;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) {
        bf0Var.getClass();
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.n;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        bf0Var.W(this, j);
        return j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j = this.n;
        if (j == 0) {
            return 0L;
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        sn6 sn6Var2 = sn6Var.g;
        sn6Var2.getClass();
        int i = sn6Var2.c;
        return (i >= 8192 || !sn6Var2.e) ? j : j - ((long) (i - sn6Var2.b));
    }

    public final byte[] k0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            gk0.h(e41.g("byteCount: ", j));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // o.of0
    public final boolean m0(long j) {
        return this.n >= j;
    }

    public final ai0 o0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            gk0.h(e41.g("byteCount: ", j));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ai0(k0(j));
        }
        ai0 ai0VarP0 = P0((int) j);
        skip(j);
        return ai0VarP0;
    }

    @Override // o.of0
    public final w36 peek() {
        return new w36(new bi5(this));
    }

    public final bf0 q() {
        bf0 bf0Var = new bf0();
        if (this.n == 0) {
            return bf0Var;
        }
        sn6 sn6Var = this.m;
        sn6Var.getClass();
        sn6 sn6VarC = sn6Var.c();
        bf0Var.m = sn6VarC;
        sn6VarC.g = sn6VarC;
        sn6VarC.f = sn6VarC;
        for (sn6 sn6Var2 = sn6Var.f; sn6Var2 != sn6Var; sn6Var2 = sn6Var2.f) {
            sn6 sn6Var3 = sn6VarC.g;
            sn6Var3.getClass();
            sn6Var2.getClass();
            sn6Var3.b(sn6Var2.c());
        }
        bf0Var.n = this.n;
        return bf0Var;
    }

    @Override // o.of0
    public final long r0(nf0 nf0Var) {
        long j = this.n;
        if (j > 0) {
            nf0Var.W(this, j);
        }
        return j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ck3.p(bArr.length, i, i2);
        sn6 sn6Var = this.m;
        if (sn6Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, sn6Var.c - sn6Var.b);
        byte[] bArr2 = sn6Var.a;
        int i3 = sn6Var.b;
        cx.E0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = sn6Var.b + iMin;
        sn6Var.b = i4;
        this.n -= (long) iMin;
        if (i4 == sn6Var.c) {
            this.m = sn6Var.a();
            vn6.a(sn6Var);
        }
        return iMin;
    }

    @Override // o.of0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            sn6 sn6Var = this.m;
            if (sn6Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, sn6Var.c - sn6Var.b);
            long j2 = iMin;
            this.n -= j2;
            j -= j2;
            int i = sn6Var.b + iMin;
            sn6Var.b = i;
            if (i == sn6Var.c) {
                this.m = sn6Var.a();
                vn6.a(sn6Var);
            }
        }
    }

    public final String toString() {
        long j = this.n;
        if (j <= 2147483647L) {
            return P0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.n).toString());
    }

    public final void u(bf0 bf0Var, long j, long j2) {
        bf0Var.getClass();
        long j3 = j;
        ck3.p(this.n, j3, j2);
        if (j2 == 0) {
            return;
        }
        bf0Var.n += j2;
        sn6 sn6Var = this.m;
        while (true) {
            sn6Var.getClass();
            long j4 = sn6Var.c - sn6Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            sn6Var = sn6Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            sn6Var.getClass();
            sn6 sn6VarC = sn6Var.c();
            int i = sn6VarC.b + ((int) j3);
            sn6VarC.b = i;
            sn6VarC.c = Math.min(i + ((int) j5), sn6VarC.c);
            sn6 sn6Var2 = bf0Var.m;
            if (sn6Var2 == null) {
                sn6VarC.g = sn6VarC;
                sn6VarC.f = sn6VarC;
                bf0Var.m = sn6VarC;
            } else {
                sn6 sn6Var3 = sn6Var2.g;
                sn6Var3.getClass();
                sn6Var3.b(sn6VarC);
            }
            j5 -= (long) (sn6VarC.c - sn6VarC.b);
            sn6Var = sn6Var.f;
            j3 = 0;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            sn6 sn6VarQ0 = Q0(1);
            int iMin = Math.min(i, 8192 - sn6VarQ0.c);
            byteBuffer.get(sn6VarQ0.a, sn6VarQ0.c, iMin);
            i -= iMin;
            sn6VarQ0.c += iMin;
        }
        this.n += (long) iRemaining;
        return iRemaining;
    }

    @Override // o.nf0
    public final /* bridge */ /* synthetic */ nf0 writeByte(int i) {
        U0(i);
        return this;
    }

    public final long x0() throws EOFException {
        int i;
        if (this.n == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            sn6 sn6Var = this.m;
            sn6Var.getClass();
            byte[] bArr = sn6Var.a;
            int i3 = sn6Var.b;
            int i4 = sn6Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = kh.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    bf0 bf0Var = new bf0();
                    bf0Var.W0(j);
                    bf0Var.U0(b);
                    throw new NumberFormatException("Number too large: ".concat(bf0Var.N0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.m = sn6Var.a();
                vn6.a(sn6Var);
            } else {
                sn6Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.m != null);
        this.n -= (long) i2;
        return j;
    }

    public final boolean z() {
        return this.n == 0;
    }

    @Override // o.nf0
    public final /* bridge */ /* synthetic */ nf0 z0(ai0 ai0Var) {
        R0(ai0Var);
        return this;
    }

    @Override // o.nf0
    public final nf0 write(byte[] bArr) {
        bArr.getClass();
        S0(bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        sn6 sn6Var = this.m;
        if (sn6Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), sn6Var.c - sn6Var.b);
        byteBuffer.put(sn6Var.a, sn6Var.b, iMin);
        int i = sn6Var.b + iMin;
        sn6Var.b = i;
        this.n -= (long) iMin;
        if (i == sn6Var.c) {
            this.m = sn6Var.a();
            vn6.a(sn6Var);
        }
        return iMin;
    }
}
