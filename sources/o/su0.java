package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class su0 extends uu0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f2053o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public int t;
    public int u = Integer.MAX_VALUE;

    public su0(byte[] bArr, int i, int i2, boolean z) {
        this.f2053o = bArr;
        this.p = i2 + i;
        this.r = i;
        this.s = i;
    }

    @Override // o.uu0
    public final String A() throws pm3 {
        int I = I();
        if (I > 0) {
            int i = this.p;
            int i2 = this.r;
            if (I <= i - i2) {
                String strJ = ia8.a.j(this.f2053o, i2, I);
                this.r += I;
                return strJ;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I <= 0) {
            throw pm3.d();
        }
        throw pm3.e();
    }

    @Override // o.uu0
    public final int B() throws pm3 {
        if (e()) {
            this.t = 0;
            return 0;
        }
        int I = I();
        this.t = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new pm3("Protocol message contained an invalid tag (zero).");
    }

    @Override // o.uu0
    public final int C() {
        return I();
    }

    @Override // o.uu0
    public final long D() {
        return J();
    }

    @Override // o.uu0
    public final boolean E(int i) throws pm3 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                M(8);
                return true;
            }
            if (i2 == 2) {
                M(I());
                return true;
            }
            if (i2 == 3) {
                F();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw pm3.b();
            }
            M(4);
            return true;
        }
        int i4 = this.p - this.r;
        byte[] bArr = this.f2053o;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.r;
                this.r = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw pm3.c();
        }
        while (i3 < 10) {
            int i6 = this.r;
            if (i6 == this.p) {
                throw pm3.e();
            }
            this.r = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw pm3.c();
        return true;
    }

    public final int G() throws pm3 {
        int i = this.r;
        if (this.p - i < 4) {
            throw pm3.e();
        }
        this.r = i + 4;
        byte[] bArr = this.f2053o;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long H() throws pm3 {
        int i = this.r;
        if (this.p - i < 8) {
            throw pm3.e();
        }
        this.r = i + 8;
        byte[] bArr = this.f2053o;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int I() {
        int i;
        int i2 = this.r;
        int i3 = this.p;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f2053o;
            byte b = bArr[i2];
            if (b >= 0) {
                this.r = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.r = i5;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.r;
        int i2 = this.p;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f2053o;
            byte b = bArr[i];
            if (b >= 0) {
                this.r = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.r = i4;
                return j;
            }
        }
        return K();
    }

    public final long K() throws pm3 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.r;
            if (i2 == this.p) {
                throw pm3.e();
            }
            this.r = i2 + 1;
            byte b = this.f2053o[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw pm3.c();
    }

    public final void L() {
        int i = this.p + this.q;
        this.p = i;
        int i2 = i - this.s;
        int i3 = this.u;
        if (i2 <= i3) {
            this.q = 0;
            return;
        }
        int i4 = i2 - i3;
        this.q = i4;
        this.p = i - i4;
    }

    public final void M(int i) throws pm3 {
        if (i >= 0) {
            int i2 = this.p;
            int i3 = this.r;
            if (i <= i2 - i3) {
                this.r = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw pm3.e();
        }
        throw pm3.d();
    }

    @Override // o.uu0
    public final void a(int i) throws pm3 {
        if (this.t != i) {
            throw new pm3("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // o.uu0
    public final int d() {
        return this.r - this.s;
    }

    @Override // o.uu0
    public final boolean e() {
        return this.r == this.p;
    }

    @Override // o.uu0
    public final void j(int i) {
        this.u = i;
        L();
    }

    @Override // o.uu0
    public final int k(int i) {
        if (i < 0) {
            throw pm3.d();
        }
        int iD = d() + i;
        if (iD < 0) {
            throw new pm3("Failed to parse the message.");
        }
        int i2 = this.u;
        if (iD > i2) {
            throw pm3.e();
        }
        this.u = iD;
        L();
        return i2;
    }

    @Override // o.uu0
    public final boolean l() {
        return J() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // o.uu0
    public final wh0 m() throws pm3 {
        byte[] bArrCopyOfRange;
        int I = I();
        byte[] bArr = this.f2053o;
        if (I > 0) {
            int i = this.p;
            int i2 = this.r;
            if (I <= i - i2) {
                wh0 wh0VarC = wh0.c(bArr, i2, I);
                this.r += I;
                return wh0VarC;
            }
        }
        if (I == 0) {
            return wh0.f2412o;
        }
        if (I > 0) {
            int i3 = this.p;
            int i4 = this.r;
            if (I <= i3 - i4) {
                int i5 = I + i4;
                this.r = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (I <= 0) {
                    throw pm3.e();
                }
                if (I == 0) {
                    throw pm3.d();
                }
                bArrCopyOfRange = ul3.b;
            }
        } else {
            if (I <= 0) {
                throw pm3.e();
            }
            if (I == 0) {
                throw pm3.d();
            }
            bArrCopyOfRange = ul3.b;
        }
        wh0 wh0Var = wh0.f2412o;
        return new wh0(bArrCopyOfRange);
    }

    @Override // o.uu0
    public final double n() {
        return Double.longBitsToDouble(H());
    }

    @Override // o.uu0
    public final int o() {
        return I();
    }

    @Override // o.uu0
    public final int p() {
        return G();
    }

    @Override // o.uu0
    public final long q() {
        return H();
    }

    @Override // o.uu0
    public final float r() {
        return Float.intBitsToFloat(G());
    }

    @Override // o.uu0
    public final int s() {
        return I();
    }

    @Override // o.uu0
    public final long u() {
        return J();
    }

    @Override // o.uu0
    public final int v() {
        return G();
    }

    @Override // o.uu0
    public final long w() {
        return H();
    }

    @Override // o.uu0
    public final int x() {
        int I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // o.uu0
    public final long y() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // o.uu0
    public final String z() throws pm3 {
        int I = I();
        if (I > 0) {
            int i = this.p;
            int i2 = this.r;
            if (I <= i - i2) {
                String str = new String(this.f2053o, i2, I, ul3.a);
                this.r += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw pm3.d();
        }
        throw pm3.e();
    }
}
