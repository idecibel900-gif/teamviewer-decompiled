package o;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class yu0 {
    public static final Logger e = Logger.getLogger(yu0.class.getName());
    public static final boolean f = d98.f;
    public df6 a;
    public final byte[] b;
    public final int c;
    public int d;

    public yu0(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, yh0 yh0Var) {
        return b(yh0Var) + h(i);
    }

    public static int b(yh0 yh0Var) {
        int size = yh0Var.size();
        return i(size) + size;
    }

    public static int c(int i) {
        return h(i) + 4;
    }

    public static int d(int i) {
        return h(i) + 8;
    }

    public static int e(int i, s1 s1Var, bj6 bj6Var) {
        int iH = h(i) * 2;
        s1Var.getClass();
        ny2 ny2Var = (ny2) s1Var;
        int iH2 = ny2Var.memoizedSerializedSize;
        if (iH2 == -1) {
            iH2 = bj6Var.h(s1Var);
            ny2Var.memoizedSerializedSize = iH2;
        }
        return iH2 + iH;
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(String str) {
        int length;
        try {
            length = ha8.a(str);
        } catch (fa8 unused) {
            length = str.getBytes(sl3.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void k(byte b) throws zu0 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void l(byte[] bArr, int i, int i2) throws zu0 {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void m(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void n(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(int i) {
        if (i >= 0) {
            q(i);
        } else {
            r(i);
        }
    }

    public final void p(int i, int i2) {
        q((i << 3) | i2);
    }

    public final void q(int i) {
        boolean z = f;
        int i2 = this.c;
        byte[] bArr = this.b;
        if (z && !tf.a()) {
            int i3 = this.d;
            if (i2 - i3 >= 5) {
                if ((i & (-128)) == 0) {
                    this.d = i3 + 1;
                    d98.k(i3, (byte) i, bArr);
                    return;
                }
                this.d = i3 + 1;
                d98.k(i3, (byte) (i | 128), bArr);
                int i4 = i >>> 7;
                int i5 = i4 & (-128);
                int i6 = this.d;
                if (i5 == 0) {
                    this.d = i6 + 1;
                    d98.k(i6, (byte) i4, bArr);
                    return;
                }
                this.d = i6 + 1;
                d98.k(i6, (byte) (i4 | 128), bArr);
                int i7 = i >>> 14;
                int i8 = i7 & (-128);
                int i9 = this.d;
                if (i8 == 0) {
                    this.d = i9 + 1;
                    d98.k(i9, (byte) i7, bArr);
                    return;
                }
                this.d = i9 + 1;
                d98.k(i9, (byte) (i7 | 128), bArr);
                int i10 = i >>> 21;
                int i11 = i10 & (-128);
                int i12 = this.d;
                if (i11 == 0) {
                    this.d = i12 + 1;
                    d98.k(i12, (byte) i10, bArr);
                    return;
                }
                this.d = i12 + 1;
                d98.k(i12, (byte) (i10 | 128), bArr);
                int i13 = this.d;
                this.d = i13 + 1;
                d98.k(i13, (byte) (i >>> 28), bArr);
                return;
            }
        }
        while (true) {
            int i14 = i & (-128);
            int i15 = this.d;
            if (i14 == 0) {
                this.d = i15 + 1;
                bArr[i15] = (byte) i;
                return;
            } else {
                try {
                    this.d = i15 + 1;
                    bArr[i15] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i2), 1), e2);
                }
            }
            throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i2), 1), e2);
        }
    }

    public final void r(long j) {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                    }
                }
                throw new zu0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                d98.k(i3, (byte) j, bArr);
                return;
            } else {
                this.d = i3 + 1;
                d98.k(i3, (byte) ((((int) j) & 127) | 128), bArr);
                j >>>= 7;
            }
        }
    }
}
