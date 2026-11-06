package o;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class gs3 implements Closeable {
    public boolean m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReentrantLock f917o = new ReentrantLock();
    public final RandomAccessFile p;

    public gs3(RandomAccessFile randomAccessFile) {
        this.p = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f917o;
        reentrantLock.lock();
        try {
            if (this.m) {
                reentrantLock.unlock();
                return;
            }
            this.m = true;
            if (this.n != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.p.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ij2 e(long j) {
        ReentrantLock reentrantLock = this.f917o;
        reentrantLock.lock();
        try {
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            this.n++;
            reentrantLock.unlock();
            return new ij2(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f917o;
        reentrantLock.lock();
        try {
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.p.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
