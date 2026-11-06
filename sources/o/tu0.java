package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends uu0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InputStream f2143o;
    public final byte[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v = Integer.MAX_VALUE;

    public tu0(InputStream inputStream) {
        Charset charset = ul3.a;
        this.f2143o = inputStream;
        this.p = new byte[4096];
        this.q = 0;
        this.s = 0;
        this.u = 0;
    }

    @Override // o.uu0
    public final String A() throws IOException {
        int iL = L();
        int i = this.s;
        int i2 = this.q;
        int i3 = i2 - i;
        byte[] bArrG = this.p;
        if (iL <= i3 && iL > 0) {
            this.s = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw pm3.d();
            }
            i = 0;
            if (iL <= i2) {
                P(iL);
                this.s = iL;
            } else {
                bArrG = G(iL);
            }
        }
        return ia8.a.j(bArrG, i, iL);
    }

    @Override // o.uu0
    public final int B() throws pm3 {
        if (e()) {
            this.t = 0;
            return 0;
        }
        int iL = L();
        this.t = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw new pm3("Protocol message contained an invalid tag (zero).");
    }

    @Override // o.uu0
    public final int C() {
        return L();
    }

    @Override // o.uu0
    public final long D() {
        return M();
    }

    @Override // o.uu0
    public final boolean E(int i) throws pm3 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                Q(8);
                return true;
            }
            if (i2 == 2) {
                Q(L());
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
            Q(4);
            return true;
        }
        int i4 = this.q - this.s;
        byte[] bArr = this.p;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.s;
                this.s = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw pm3.c();
        }
        while (i3 < 10) {
            if (this.s == this.q) {
                P(1);
            }
            int i6 = this.s;
            this.s = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw pm3.c();
        return true;
    }

    public final byte[] G(int i) throws IOException {
        byte[] bArrH = H(i);
        if (bArrH != null) {
            return bArrH;
        }
        int i2 = this.s;
        int i3 = this.q;
        int length = i3 - i2;
        this.u += i3;
        this.s = 0;
        this.q = 0;
        ArrayList<byte[]> arrayListI = I(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.p, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListI) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] H(int i) throws IOException {
        if (i == 0) {
            return ul3.b;
        }
        if (i < 0) {
            throw pm3.d();
        }
        int i2 = this.u;
        int i3 = this.s;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new pm3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.v;
        if (i4 > i5) {
            Q((i5 - i2) - i3);
            throw pm3.e();
        }
        int i6 = this.q - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f2143o;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (pm3 e) {
                e.m = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.p, this.s, bArr, 0, i6);
        this.u += this.q;
        this.s = 0;
        this.q = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw pm3.e();
                }
                this.u += i8;
                i6 += i8;
            } catch (pm3 e2) {
                e2.m = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList I(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f2143o.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw pm3.e();
                }
                this.u += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int J() throws pm3 {
        int i = this.s;
        if (this.q - i < 4) {
            P(4);
            i = this.s;
        }
        this.s = i + 4;
        byte[] bArr = this.p;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long K() throws pm3 {
        int i = this.s;
        if (this.q - i < 8) {
            P(8);
            i = this.s;
        }
        this.s = i + 8;
        byte[] bArr = this.p;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int L() {
        int i;
        int i2 = this.s;
        int i3 = this.q;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.p;
            byte b = bArr[i2];
            if (b >= 0) {
                this.s = i4;
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
                this.s = i5;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.s;
        int i2 = this.q;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.p;
            byte b = bArr[i];
            if (b >= 0) {
                this.s = i3;
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
                this.s = i4;
                return j;
            }
        }
        return N();
    }

    public final long N() throws pm3 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.s == this.q) {
                P(1);
            }
            int i2 = this.s;
            this.s = i2 + 1;
            byte b = this.p[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw pm3.c();
    }

    public final void O() {
        int i = this.q + this.r;
        this.q = i;
        int i2 = this.u + i;
        int i3 = this.v;
        if (i2 <= i3) {
            this.r = 0;
            return;
        }
        int i4 = i2 - i3;
        this.r = i4;
        this.q = i - i4;
    }

    public final void P(int i) throws pm3 {
        if (R(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.u) - this.s) {
            throw pm3.e();
        }
        throw new pm3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void Q(int i) throws pm3 {
        int i2 = this.q;
        int i3 = this.s;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.s = i3 + i;
            return;
        }
        InputStream inputStream = this.f2143o;
        if (i < 0) {
            throw pm3.d();
        }
        int i5 = this.u;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.v;
        if (i7 > i8) {
            Q((i8 - i5) - i3);
            throw pm3.e();
        }
        this.u = i6;
        this.q = 0;
        this.s = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (pm3 e) {
                    e.m = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.u += i4;
                O();
                throw th;
            }
        }
        this.u += i4;
        O();
        if (i4 >= i) {
            return;
        }
        int i9 = this.q;
        int i10 = i9 - this.s;
        this.s = i9;
        P(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.q;
            if (i11 <= i12) {
                this.s = i11;
                return;
            } else {
                i10 += i12;
                this.s = i12;
                P(1);
            }
        }
    }

    public final boolean R(int i) throws IOException {
        InputStream inputStream = this.f2143o;
        int i2 = this.s;
        int i3 = i2 + i;
        int i4 = this.q;
        if (i3 <= i4) {
            hk0.l(fx3.f(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.u;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.v) {
            byte[] bArr = this.p;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.u + i2;
                this.u = i5;
                i4 = this.q - i2;
                this.q = i4;
                this.s = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.q += i6;
                    O();
                    if (this.q >= i) {
                        return true;
                    }
                    return R(i);
                }
            } catch (pm3 e) {
                e.m = true;
                throw e;
            }
        }
        return false;
    }

    @Override // o.uu0
    public final void a(int i) throws pm3 {
        if (this.t != i) {
            throw new pm3("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // o.uu0
    public final int d() {
        return this.u + this.s;
    }

    @Override // o.uu0
    public final boolean e() {
        return this.s == this.q && !R(1);
    }

    @Override // o.uu0
    public final void j(int i) {
        this.v = i;
        O();
    }

    @Override // o.uu0
    public final int k(int i) throws pm3 {
        if (i < 0) {
            throw pm3.d();
        }
        int i2 = this.u + this.s + i;
        if (i2 < 0) {
            throw new pm3("Failed to parse the message.");
        }
        int i3 = this.v;
        if (i2 > i3) {
            throw pm3.e();
        }
        this.v = i2;
        O();
        return i3;
    }

    @Override // o.uu0
    public final boolean l() {
        return M() != 0;
    }

    @Override // o.uu0
    public final wh0 m() throws IOException {
        int iL = L();
        int i = this.q;
        int i2 = this.s;
        int i3 = i - i2;
        byte[] bArr = this.p;
        if (iL <= i3 && iL > 0) {
            wh0 wh0VarC = wh0.c(bArr, i2, iL);
            this.s += iL;
            return wh0VarC;
        }
        if (iL == 0) {
            return wh0.f2412o;
        }
        if (iL < 0) {
            throw pm3.d();
        }
        byte[] bArrH = H(iL);
        if (bArrH != null) {
            return wh0.c(bArrH, 0, bArrH.length);
        }
        int i4 = this.s;
        int i5 = this.q;
        int length = i5 - i4;
        this.u += i5;
        this.s = 0;
        this.q = 0;
        ArrayList<byte[]> arrayListI = I(iL - length);
        byte[] bArr2 = new byte[iL];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListI) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        wh0 wh0Var = wh0.f2412o;
        return new wh0(bArr2);
    }

    @Override // o.uu0
    public final double n() {
        return Double.longBitsToDouble(K());
    }

    @Override // o.uu0
    public final int o() {
        return L();
    }

    @Override // o.uu0
    public final int p() {
        return J();
    }

    @Override // o.uu0
    public final long q() {
        return K();
    }

    @Override // o.uu0
    public final float r() {
        return Float.intBitsToFloat(J());
    }

    @Override // o.uu0
    public final int s() {
        return L();
    }

    @Override // o.uu0
    public final long u() {
        return M();
    }

    @Override // o.uu0
    public final int v() {
        return J();
    }

    @Override // o.uu0
    public final long w() {
        return K();
    }

    @Override // o.uu0
    public final int x() {
        int iL = L();
        return (-(iL & 1)) ^ (iL >>> 1);
    }

    @Override // o.uu0
    public final long y() {
        long jM = M();
        return (-(jM & 1)) ^ (jM >>> 1);
    }

    @Override // o.uu0
    public final String z() throws pm3 {
        int iL = L();
        byte[] bArr = this.p;
        if (iL > 0) {
            int i = this.q;
            int i2 = this.s;
            if (iL <= i - i2) {
                String str = new String(bArr, i2, iL, ul3.a);
                this.s += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw pm3.d();
        }
        if (iL > this.q) {
            return new String(G(iL), ul3.a);
        }
        P(iL);
        String str2 = new String(bArr, this.s, iL, ul3.a);
        this.s += iL;
        return str2;
    }
}
