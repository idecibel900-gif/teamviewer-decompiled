package io.sentry;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import o.g68;
import o.xx;

/* JADX INFO: loaded from: classes2.dex */
public final class x5 extends Thread {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(String str) {
        super(str);
        this.m = (byte) 1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.m) {
            case 1:
                break;
            case 2:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = xx.j;
                reentrantLock.lock();
                try {
                    xx xxVarH = g68.h();
                    if (xxVarH == xx.i) {
                        xx.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (xxVarH != null) {
                            xxVarH.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(Runnable runnable, String str, byte b) {
        super(runnable, str);
        this.m = b;
    }
}
