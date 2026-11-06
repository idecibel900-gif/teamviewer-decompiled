package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class wc extends w45 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final byte[] e;

    public wc(int i, int i2, String str, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        gb8.a(i);
        if (i2 <= e() + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.e = Arrays.copyOf(bArr, bArr.length);
        this.d = str;
        this.a = i;
        this.b = i2;
        this.c = i2 - 16;
    }

    public static GCMParameterSpec i(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j || j >= 4294967296L) {
            hk0.u("Index out of range");
            return null;
        }
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // o.w45
    public final int c() {
        return e();
    }

    @Override // o.w45
    public final int d() {
        return this.b;
    }

    @Override // o.w45
    public final int e() {
        return this.a + 8;
    }

    @Override // o.w45
    public final int f() {
        return this.c;
    }

    @Override // o.w45
    public final ra7 g() {
        return new j93(this);
    }

    @Override // o.w45
    public final sa7 h(byte[] bArr) {
        return new vc(this, bArr);
    }
}
