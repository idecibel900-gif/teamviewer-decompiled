package o;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class cl1 implements v07 {
    public final OutputStream m;
    public final p57 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j93 f537o;

    public cl1(j93 j93Var) {
        this.f537o = j93Var;
        Socket socket = (Socket) j93Var.n;
        this.m = socket.getOutputStream();
        this.n = new p57(socket);
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) throws IOException {
        ck3.p(bf0Var.n, 0L, j);
        while (j > 0) {
            p57 p57Var = this.n;
            p57Var.f();
            sn6 sn6Var = bf0Var.m;
            sn6Var.getClass();
            int iMin = (int) Math.min(j, sn6Var.c - sn6Var.b);
            p57Var.h();
            try {
                try {
                    this.m.write(sn6Var.a, sn6Var.b, iMin);
                    if (p57Var.i()) {
                        throw p57Var.k(null);
                    }
                    int i = sn6Var.b + iMin;
                    sn6Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    bf0Var.n -= j2;
                    if (i == sn6Var.c) {
                        bf0Var.m = sn6Var.a();
                        vn6.a(sn6Var);
                    }
                } catch (IOException e) {
                    if (!p57Var.i()) {
                        throw e;
                    }
                    throw p57Var.k(e);
                }
            } catch (Throwable th) {
                p57Var.i();
                throw th;
            }
        }
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.m;
        j93 j93Var = this.f537o;
        p57 p57Var = this.n;
        p57Var.h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) j93Var.f1141o;
                Socket socket = (Socket) j93Var.n;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    p57Var.i();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    p57Var.i();
                    return;
                }
                socket.close();
                if (p57Var.i()) {
                    throw p57Var.k(null);
                }
            } catch (Throwable th) {
                p57Var.i();
                throw th;
            }
        } catch (IOException e) {
            if (!p57Var.i()) {
                throw e;
            }
            throw p57Var.k(e);
        }
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() throws IOException {
        p57 p57Var = this.n;
        p57Var.h();
        try {
            try {
                this.m.flush();
                if (p57Var.i()) {
                    throw p57Var.k(null);
                }
            } catch (IOException e) {
                if (!p57Var.i()) {
                    throw e;
                }
                throw p57Var.k(e);
            }
        } catch (Throwable th) {
            p57Var.i();
            throw th;
        }
    }

    @Override // o.v07
    public final ov7 i() {
        return this.n;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f537o.n) + ')';
    }
}
