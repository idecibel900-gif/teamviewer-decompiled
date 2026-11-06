package o;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class l70 {
    public final byte[] a;
    public int b;
    public int c;

    public l70(byte[] bArr, byte b) {
        switch (b) {
            case 2:
                int length = bArr.length;
                this.a = bArr;
                this.b = 0;
                this.c = length;
                break;
            default:
                this.a = bArr;
                break;
        }
    }

    public static void b(int i, int i2, int i3) {
        String str;
        if (i2 == i3) {
            return;
        }
        StringBuilder sbK = fx3.k(i, "Field ", ": expected ");
        String str2 = "varint";
        if (i2 == 0) {
            str = "varint";
        } else if (i2 == 1) {
            str = "fixed64";
        } else if (i2 != 2) {
            str = i2 != 5 ? "unknown" : "fixed32";
        } else {
            str = "length-delimited";
        }
        sbK.append(str);
        sbK.append(" (wire type ");
        sbK.append(i2);
        sbK.append(") but got ");
        if (i3 != 0) {
            if (i3 == 1) {
                str2 = "fixed64";
            } else if (i3 != 2) {
                str2 = i3 != 5 ? "unknown" : "fixed32";
            } else {
                str2 = "length-delimited";
            }
        }
        sbK.append(str2);
        sbK.append(" (wire type ");
        sbK.append(i3);
        sbK.append(")");
        throw new IOException(sbK.toString());
    }

    public int a() {
        return ((this.a.length - this.b) * 8) - this.c;
    }

    public int c(int i) {
        int i2 = 0;
        if (i < 1 || i > 32 || i > a()) {
            hk0.g(String.valueOf(i));
            return 0;
        }
        int i3 = this.c;
        byte[] bArr = this.a;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int iMin = Math.min(i, i4);
            int i5 = i4 - iMin;
            int i6 = this.b;
            int i7 = (((255 >> (8 - iMin)) << i5) & bArr[i6]) >> i5;
            i -= iMin;
            int i8 = this.c + iMin;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.b = i6 + 1;
            }
            i2 = i7;
        }
        if (i <= 0) {
            return i2;
        }
        while (i >= 8) {
            int i9 = this.b;
            i2 = (i2 << 8) | (bArr[i9] & 255);
            this.b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i2;
        }
        int i10 = 8 - i;
        int i11 = (i2 << i) | ((((255 >> i10) << i10) & bArr[this.b]) >> i10);
        this.c += i;
        return i11;
    }

    public boolean d() {
        return i() != 0;
    }

    public byte[] e() {
        int i = (int) i();
        if (i < 0) {
            gk0.l(fx3.e(i, "Negative length: "));
            return null;
        }
        int i2 = this.c;
        int i3 = this.b;
        if (i2 - i3 < i) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i3, bArr, 0, i);
        this.b += i;
        return bArr;
    }

    public l70 f() {
        return new l70(e(), (byte) 2);
    }

    public String g() {
        return new String(e(), StandardCharsets.UTF_8);
    }

    public int h() {
        if (this.b < this.c) {
            return (int) i();
        }
        return 0;
    }

    public long i() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.b;
            if (i2 >= this.c) {
                throw new EOFException("Truncated varint");
            }
            this.b = i2 + 1;
            byte b = this.a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        gk0.l("Malformed varint");
        return 0L;
    }

    public void j(int i) {
        int i2 = this.c;
        if (i == 0) {
            i();
            return;
        }
        if (i == 1) {
            int i3 = this.b;
            if (i2 - i3 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.b = i3 + 8;
            return;
        }
        if (i == 2) {
            int i4 = (int) i();
            int i5 = this.b;
            if (i2 - i5 < i4) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.b = i5 + i4;
            return;
        }
        if (i != 5) {
            gk0.l(fx3.e(i, "Unknown wire type: "));
            return;
        }
        int i6 = this.b;
        if (i2 - i6 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.b = i6 + 4;
    }

    public l70(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }
}
