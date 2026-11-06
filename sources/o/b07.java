package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b07 extends FilterInputStream {
    public static final a65 s = new a65(new sn0((byte) 4));
    public int m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f380o;
    public int p;
    public int q;
    public boolean r;

    public b07(InputStream inputStream) {
        super(inputStream);
        this.m = Integer.MAX_VALUE;
        this.q = -1;
        this.r = false;
        if (inputStream == null) {
            this.r = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.n != null ? this.p - this.f380o : 0;
        if (i > 0) {
            return i;
        }
        if (this.r) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (((FilterInputStream) this).in != null) {
            super.close();
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            return;
        }
        s.R0(bArr);
        this.n = null;
    }

    public final void e() throws IOException {
        int iMin;
        int i;
        if (this.r) {
            return;
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            bArr = (byte[]) s.W();
            this.n = bArr;
        }
        if (bArr != null && (i = this.f380o) != 0) {
            int i2 = this.q;
            if (i2 >= 0) {
                i = i2;
            }
            if (i > 0) {
                int i3 = this.p - i;
                if (i3 > 0) {
                    System.arraycopy(bArr, i, bArr, 0, i3);
                }
                this.p = i3;
                this.f380o -= i;
                int i4 = this.q;
                if (i4 >= 0) {
                    this.q = i4 - i;
                }
            }
        }
        int i5 = this.f380o;
        this.p = i5;
        int iMin2 = Math.min(this.n.length - i5, this.m);
        if (iMin2 <= 0) {
            return;
        }
        int i6 = ((FilterInputStream) this).in.read(this.n, this.f380o, iMin2);
        if (i6 > 0) {
            this.p = this.f380o + i6;
            this.m -= i6;
            while (this.n.length - this.p > 0 && this.m > 0) {
                try {
                    if (((FilterInputStream) this).in.available() < 1 || (iMin = Math.min(this.n.length - this.p, this.m)) <= 0 || (i6 = ((FilterInputStream) this).in.read(this.n, this.p, iMin)) <= 0) {
                        break;
                    }
                    this.p += i6;
                    this.m -= i6;
                } catch (IOException unused) {
                }
            }
        }
        if (i6 == -1) {
            this.r = true;
        }
    }

    public final void j() {
        if (((FilterInputStream) this).in != null) {
            this.r = false;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        db8.o0(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.p - this.f380o;
        if (i3 <= 0) {
            e();
            i3 = this.p - this.f380o;
        }
        int iMin = Math.min(i3, i2);
        if (iMin <= 0) {
            return -1;
        }
        db8.o0(this.n);
        System.arraycopy(this.n, this.f380o, bArr, i, iMin);
        this.f380o += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f380o >= this.p) {
            e();
            if (this.f380o >= this.p) {
                return -1;
            }
        }
        db8.o0(this.n);
        byte[] bArr = this.n;
        int i = this.f380o;
        this.f380o = i + 1;
        return bArr[i] & 255;
    }
}
