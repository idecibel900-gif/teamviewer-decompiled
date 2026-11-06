package o;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xh0 extends OutputStream {
    public static final byte[] q = new byte[0];
    public int n;
    public int p;
    public final ArrayList m = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f2516o = new byte[128];

    public final void e(int i) {
        this.m.add(new pc4(this.f2516o));
        int length = this.n + this.f2516o.length;
        this.n = length;
        this.f2516o = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.p = 0;
    }

    public final void j() {
        int i = this.p;
        byte[] bArr = this.f2516o;
        int length = bArr.length;
        ArrayList arrayList = this.m;
        if (i >= length) {
            arrayList.add(new pc4(bArr));
            this.f2516o = q;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new pc4(bArr2));
        }
        this.n += this.p;
        this.p = 0;
    }

    public final synchronized zh0 q() {
        ArrayList arrayList;
        j();
        arrayList = this.m;
        return arrayList.isEmpty() ? zh0.m : zh0.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.n + this.p;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f2516o;
            int length = bArr2.length;
            int i3 = this.p;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.p += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                e(i4);
                System.arraycopy(bArr, i + length2, this.f2516o, 0, i4);
                this.p = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.p == this.f2516o.length) {
                e(1);
            }
            byte[] bArr = this.f2516o;
            int i2 = this.p;
            this.p = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
