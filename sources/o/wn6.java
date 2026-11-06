package o;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class wn6 extends ai0 {
    public final transient byte[][] q;
    public final transient int[] r;

    public wn6(byte[][] bArr, int[] iArr) {
        super(ai0.p.m);
        this.q = bArr;
        this.r = iArr;
    }

    @Override // o.ai0
    public final String a() {
        return u().a();
    }

    @Override // o.ai0
    public final ai0 c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.q;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.r;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ai0(bArrDigest);
    }

    @Override // o.ai0
    public final int d() {
        return this.r[this.q.length - 1];
    }

    @Override // o.ai0
    public final String e() {
        return u().e();
    }

    @Override // o.ai0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ai0) {
            ai0 ai0Var = (ai0) obj;
            if (ai0Var.d() == d() && m(0, ai0Var, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.ai0
    public final int f(byte[] bArr, int i) {
        bArr.getClass();
        return u().f(bArr, i);
    }

    @Override // o.ai0
    public final byte[] h() {
        return r();
    }

    @Override // o.ai0
    public final int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.q;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.r;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.n = i3;
        return i3;
    }

    @Override // o.ai0
    public final byte i(int i) {
        byte[][] bArr = this.q;
        int length = bArr.length - 1;
        int[] iArr = this.r;
        ck3.p(iArr[length], i, 1L);
        int iC = di1.C(this, i);
        return bArr[iC][(i - (iC == 0 ? 0 : iArr[iC - 1])) + iArr[bArr.length + iC]];
    }

    @Override // o.ai0
    public final int j(byte[] bArr, int i) {
        bArr.getClass();
        return u().j(bArr, i);
    }

    @Override // o.ai0
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iC = di1.C(this, i);
            while (i < i4) {
                int[] iArr = this.r;
                int i5 = iC == 0 ? 0 : iArr[iC - 1];
                int i6 = iArr[iC] - i5;
                byte[][] bArr2 = this.q;
                int i7 = iArr[bArr2.length + iC];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (ck3.n((i - i5) + i7, i2, iMin, bArr2[iC], bArr)) {
                    i2 += iMin;
                    i += iMin;
                    iC++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.ai0
    public final boolean m(int i, ai0 ai0Var, int i2) {
        ai0Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iC = di1.C(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.r;
                int i5 = iC == 0 ? 0 : iArr[iC - 1];
                int i6 = iArr[iC] - i5;
                byte[][] bArr = this.q;
                int i7 = iArr[bArr.length + iC];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (ai0Var.l(i4, (i - i5) + i7, iMin, bArr[iC])) {
                    i4 += iMin;
                    i += iMin;
                    iC++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.ai0
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // o.ai0
    public final ai0 o(int i, int i2) {
        if (i < 0) {
            gk0.h(fx3.f(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder sbK = fx3.k(i2, "endIndex=", " > length(");
            sbK.append(d());
            sbK.append(')');
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            gk0.h(ua5.l("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return ai0.p;
        }
        int iC = di1.C(this, i);
        int iC2 = di1.C(this, i2 - 1);
        byte[][] bArr = this.q;
        byte[][] bArr2 = (byte[][]) cx.L0(bArr, iC, iC2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.r;
        if (iC <= iC2) {
            int i4 = iC;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iC2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iC != 0 ? iArr2[iC - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new wn6(bArr2, iArr);
    }

    @Override // o.ai0
    public final ai0 q() {
        return u().q();
    }

    @Override // o.ai0
    public final byte[] r() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.q;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.r;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            cx.E0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o.ai0
    public final void t(bf0 bf0Var, int i) {
        int iC = di1.C(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.r;
            int i3 = iC == 0 ? 0 : iArr[iC - 1];
            int i4 = iArr[iC] - i3;
            byte[][] bArr = this.q;
            int i5 = iArr[bArr.length + iC];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            sn6 sn6Var = new sn6(bArr[iC], i6, i6 + iMin, true);
            sn6 sn6Var2 = bf0Var.m;
            if (sn6Var2 == null) {
                sn6Var.g = sn6Var;
                sn6Var.f = sn6Var;
                bf0Var.m = sn6Var;
            } else {
                sn6 sn6Var3 = sn6Var2.g;
                sn6Var3.getClass();
                sn6Var3.b(sn6Var);
            }
            i2 += iMin;
            iC++;
        }
        bf0Var.n += (long) i;
    }

    @Override // o.ai0
    public final String toString() {
        return u().toString();
    }

    public final ai0 u() {
        return new ai0(r());
    }
}
