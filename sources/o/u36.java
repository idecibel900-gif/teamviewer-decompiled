package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class u36 implements nf0 {
    public final v07 m;
    public final bf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2164o;

    public u36(v07 v07Var) {
        v07Var.getClass();
        this.m = v07Var;
        this.n = new bf0();
    }

    @Override // o.nf0
    public final nf0 P(byte[] bArr, int i) {
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.S0(bArr, i);
        e();
        return this;
    }

    @Override // o.nf0
    public final nf0 V(String str) {
        str.getClass();
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.Z0(str);
        e();
        return this;
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) {
        bf0Var.getClass();
        if (this.f2164o) {
            hk0.l("closed");
        } else {
            this.n.W(bf0Var, j);
            e();
        }
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        v07 v07Var = this.m;
        if (this.f2164o) {
            return;
        }
        bf0 bf0Var = this.n;
        long j = bf0Var.n;
        if (j > 0) {
            v07Var.W(bf0Var, j);
        }
        th = null;
        try {
            v07Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f2164o = true;
        if (th != null) {
            throw th;
        }
    }

    public final nf0 e() {
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        bf0 bf0Var = this.n;
        long j = bf0Var.j();
        if (j > 0) {
            this.m.W(bf0Var, j);
        }
        return this;
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() {
        if (this.f2164o) {
            hk0.l("closed");
            return;
        }
        bf0 bf0Var = this.n;
        long j = bf0Var.n;
        v07 v07Var = this.m;
        if (j > 0) {
            v07Var.W(bf0Var, j);
        }
        v07Var.flush();
    }

    @Override // o.nf0
    public final bf0 h() {
        return this.n;
    }

    @Override // o.v07
    public final ov7 i() {
        return this.m.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2164o;
    }

    public final nf0 j(long j) {
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.V0(j);
        e();
        return this;
    }

    public final nf0 q(int i) {
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.X0(i);
        e();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.m + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.f2164o) {
            hk0.l("closed");
            return 0;
        }
        int iWrite = this.n.write(byteBuffer);
        e();
        return iWrite;
    }

    @Override // o.nf0
    public final nf0 writeByte(int i) {
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.U0(i);
        e();
        return this;
    }

    @Override // o.nf0
    public final nf0 z0(ai0 ai0Var) {
        ai0Var.getClass();
        if (this.f2164o) {
            hk0.l("closed");
            return null;
        }
        this.n.R0(ai0Var);
        e();
        return this;
    }

    @Override // o.nf0
    public final nf0 write(byte[] bArr) {
        bArr.getClass();
        if (!this.f2164o) {
            this.n.S0(bArr, bArr.length);
            e();
            return this;
        }
        hk0.l("closed");
        return null;
    }
}
