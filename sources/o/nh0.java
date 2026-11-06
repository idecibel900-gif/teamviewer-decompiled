package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class nh0 implements q67 {
    public final ByteBuffer m;
    public final int n;

    public nh0(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.m = byteBufferSlice;
        this.n = byteBufferSlice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return ov7.d;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) {
        ByteBuffer byteBuffer = this.m;
        int iPosition = byteBuffer.position();
        int i = this.n;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return bf0Var.write(byteBuffer);
    }
}
