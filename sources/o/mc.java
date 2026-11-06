package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mc extends w45 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final byte[] g;

    public mc(byte[] bArr, String str, int i, String str2, int i2, int i3) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length < 16 || length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        gb8.a(i);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException(fx3.e(i2, "tag size too small "));
        }
        if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if (((i3 - i2) - i) - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.g = Arrays.copyOf(bArr, bArr.length);
        this.f = str;
        this.a = i;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i3 - i2;
    }

    public static byte[] i(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j || j >= 4294967296L) {
            hk0.u("Index out of range");
            return null;
        }
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // o.w45
    public final int c() {
        return e();
    }

    @Override // o.w45
    public final int d() {
        return this.d;
    }

    @Override // o.w45
    public final int e() {
        return this.a + 8;
    }

    @Override // o.w45
    public final int f() {
        return this.e;
    }

    @Override // o.w45
    public final ra7 g() {
        d11 d11Var = new d11();
        d11Var.r = this;
        return d11Var;
    }

    @Override // o.w45
    public final sa7 h(byte[] bArr) {
        return new io.sentry.android.core.v1(this, bArr);
    }
}
