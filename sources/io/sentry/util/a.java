package io.sentry.util;

import io.sentry.s1;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s1 {
    public static final /* synthetic */ long n = defpackage.a.a.objectFieldOffset(a.class.getDeclaredField("m"));
    public volatile ReentrantLock m;

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.m;
        b.v(reentrantLock, "close() called before acquire()");
        reentrantLock.unlock();
    }

    public final void e() {
        ReentrantLock reentrantLock = this.m;
        if (reentrantLock == null) {
            ReentrantLock reentrantLock2 = new ReentrantLock();
            while (true) {
                Unsafe unsafe = defpackage.a.a;
                long j = n;
                a aVar = this;
                if (unsafe.compareAndSwapObject(aVar, j, (Object) null, reentrantLock2)) {
                    reentrantLock = reentrantLock2;
                    break;
                } else {
                    if (unsafe.getObjectVolatile(aVar, j) != null) {
                        reentrantLock = aVar.m;
                        b.v(reentrantLock, "lock must have been set by the winning thread");
                        break;
                    }
                    this = aVar;
                }
            }
        }
        reentrantLock.lock();
    }
}
