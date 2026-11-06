package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class xa7 extends FilterOutputStream {
    public final sa7 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ByteBuffer f2500o;
    public final ByteBuffer p;
    public boolean q;

    public xa7(w45 w45Var, OutputStream outputStream, byte[] bArr) throws IOException {
        super(outputStream);
        sa7 sa7VarH = w45Var.h(bArr);
        this.m = sa7VarH;
        int iF = w45Var.f();
        this.n = iF;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iF);
        this.f2500o = byteBufferAllocate;
        this.p = ByteBuffer.allocate(w45Var.d());
        byteBufferAllocate.limit(iF - w45Var.c());
        ByteBuffer byteBufferI = sa7VarH.i();
        byte[] bArr2 = new byte[byteBufferI.remaining()];
        byteBufferI.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.q = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.q) {
            try {
                this.f2500o.flip();
                this.p.clear();
                this.m.j(this.f2500o, this.p);
                this.p.flip();
                ((FilterOutputStream) this).out.write(this.p.array(), this.p.position(), this.p.remaining());
                this.q = false;
                super.close();
            } catch (GeneralSecurityException e) {
                throw new IOException("ptBuffer.remaining():" + this.f2500o.remaining() + " ctBuffer.remaining():" + this.p.remaining(), e);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (!this.q) {
                throw new IOException("Trying to write to closed stream");
            }
            while (true) {
                int iRemaining = this.f2500o.remaining();
                ByteBuffer byteBuffer = this.f2500o;
                if (i2 > iRemaining) {
                    int iRemaining2 = byteBuffer.remaining();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, iRemaining2);
                    i += iRemaining2;
                    i2 -= iRemaining2;
                    try {
                        this.f2500o.flip();
                        this.p.clear();
                        this.m.f(this.f2500o, byteBufferWrap, this.p);
                        this.p.flip();
                        ((FilterOutputStream) this).out.write(this.p.array(), this.p.position(), this.p.remaining());
                        this.f2500o.clear();
                        this.f2500o.limit(this.n);
                    } catch (GeneralSecurityException e) {
                        throw new IOException(e);
                    }
                } else {
                    byteBuffer.put(bArr, i, i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
