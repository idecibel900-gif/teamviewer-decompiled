package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.k0;
import io.sentry.y0;
import io.sentry.z0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ c n;

    public /* synthetic */ a(c cVar, byte b) {
        this.m = b;
        this.n = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        c cVar = this.n;
        switch (b) {
            case 0:
                cVar.q();
                return;
            case 1:
                cVar.Y(true);
                io.sentry.util.a aVar = c.z;
                aVar.e();
                try {
                    c.A.clear();
                    aVar.close();
                    io.sentry.util.a aVar2 = c.x;
                    aVar2.e();
                    try {
                        c.y = null;
                        aVar2.close();
                        k0.q.u(cVar);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 2:
                cVar.Y(false);
                return;
            default:
                cVar.b0(null);
                y0 y0VarU = cVar.u();
                if (y0VarU == y0.DISCONNECTED) {
                    cVar.w.set(false);
                    io.sentry.util.a aVar3 = c.z;
                    aVar3.e();
                    try {
                        Iterator it = c.A.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        aVar3.close();
                    } catch (Throwable th5) {
                        try {
                            aVar3.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                io.sentry.util.a aVar4 = cVar.r;
                aVar4.e();
                try {
                    Iterator it2 = cVar.q.iterator();
                    while (it2.hasNext()) {
                        ((z0) it2.next()).u(y0VarU);
                    }
                    aVar4.close();
                    cVar.q();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar4.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
        }
    }
}
