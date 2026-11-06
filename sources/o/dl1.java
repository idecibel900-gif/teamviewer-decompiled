package o;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class dl1 implements q67 {
    public final InputStream m;
    public final p57 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j93 f633o;

    public dl1(j93 j93Var) {
        this.f633o = j93Var;
        Socket socket = (Socket) j93Var.n;
        this.m = socket.getInputStream();
        this.n = new p57(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        j93 j93Var = this.f633o;
        p57 p57Var = this.n;
        p57Var.h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) j93Var.f1141o;
                Socket socket = (Socket) j93Var.n;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    p57Var.i();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    p57Var.i();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.m.close();
                    }
                }
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

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.n;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        bf0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        p57 p57Var = this.n;
        p57Var.f();
        sn6 sn6VarQ0 = bf0Var.Q0(1);
        int iMin = (int) Math.min(j, 8192 - sn6VarQ0.c);
        try {
            p57Var.h();
            try {
                try {
                    int i = this.m.read(sn6VarQ0.a, sn6VarQ0.c, iMin);
                    if (p57Var.i()) {
                        throw p57Var.k(null);
                    }
                    if (i != -1) {
                        sn6VarQ0.c += i;
                        long j2 = i;
                        bf0Var.n += j2;
                        return j2;
                    }
                    if (sn6VarQ0.b != sn6VarQ0.c) {
                        return -1L;
                    }
                    bf0Var.m = sn6VarQ0.a();
                    vn6.a(sn6VarQ0);
                    return -1L;
                } catch (IOException e) {
                    if (p57Var.i()) {
                        throw p57Var.k(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                p57Var.i();
                throw th;
            }
        } catch (AssertionError e2) {
            if (oo8.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f633o.n) + ')';
    }
}
