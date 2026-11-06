package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import io.sentry.f6;
import io.sentry.y0;
import io.sentry.z0;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o.cm8;
import o.d35;
import o.e35;
import o.eh8;
import o.f35;
import o.o43;
import o.ve6;
import o.w61;
import o.we4;
import o.x61;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public b(o43 o43Var) {
        this.a = (byte) 1;
        this.b = o43Var;
    }

    public void a() {
        ((c) this.b).w.set(false);
        io.sentry.util.a aVar = ((c) this.b).r;
        aVar.e();
        try {
            ((c) this.b).t = null;
            ((c) this.b).u = null;
            c cVar = (c) this.b;
            cVar.v = io.sentry.time.a.a(cVar.p, 2L, TimeUnit.MINUTES);
            ((c) this.b).n.getLogger().g(f6.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((c) this.b).q.iterator();
            while (it.hasNext()) {
                ((z0) it.next()).u(y0.DISCONNECTED);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                ((c) this.b).u = network;
                if (((c) this.b).w.getAndSet(true)) {
                    return;
                }
                io.sentry.util.a aVar = c.z;
                aVar.e();
                try {
                    Iterator it = c.A.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                    }
                    aVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                network.getClass();
                ve6 ve6Var = (ve6) this.b;
                ((Handler) ve6Var.e).post(new eh8(ve6Var, network, (byte) 0));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 2:
                network.getClass();
                if (network.equals(((f35) this.b).f.getActiveNetwork())) {
                    we4.f().c(e35.a, "Network blocked status changed: " + z);
                    f35 f35Var = (f35) this.b;
                    Object objA = f35Var.e;
                    if (objA == null) {
                        objA = f35Var.a();
                    }
                    d35 d35Var = (d35) objA;
                    f35 f35Var2 = (f35) this.b;
                    synchronized (f35Var2.g) {
                        if (f35Var2.h == z) {
                            return;
                        }
                        f35Var2.h = z;
                        ((f35) this.b).b(new d35(d35Var.a, d35Var.b, d35Var.c, d35Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00df A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #3 {all -> 0x00e9, blocks: (B:38:0x00cf, B:39:0x00d9, B:41:0x00df), top: B:73:0x00cf }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        y0 y0VarU;
        io.sentry.util.a aVar;
        Iterator it;
        switch (this.a) {
            case 0:
                if (network.equals(((c) this.b).u)) {
                    NetworkCapabilities networkCapabilities2 = ((c) this.b).t;
                    int i = 0;
                    if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                        ((c) this.b).b0(networkCapabilities);
                        y0VarU = ((c) this.b).u();
                        aVar = ((c) this.b).r;
                        aVar.e();
                        it = ((c) this.b).q.iterator();
                        while (it.hasNext()) {
                            ((z0) it.next()).u(y0VarU);
                        }
                        aVar.close();
                    } else if (networkCapabilities2 != null || networkCapabilities != null) {
                        int[] iArr = c.C;
                        int length = iArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                int[] iArr2 = c.B;
                                int length2 = iArr2.length;
                                while (true) {
                                    if (i < length2) {
                                        int i3 = iArr2[i];
                                        if (networkCapabilities2.hasTransport(i3) == networkCapabilities.hasTransport(i3)) {
                                            i++;
                                        }
                                    }
                                }
                            } else {
                                int i4 = iArr[i2];
                                if (i4 == 0 || networkCapabilities2.hasCapability(i4) == networkCapabilities.hasCapability(i4)) {
                                    i2++;
                                }
                            }
                            ((c) this.b).b0(networkCapabilities);
                            y0VarU = ((c) this.b).u();
                            aVar = ((c) this.b).r;
                            aVar.e();
                            try {
                                it = ((c) this.b).q.iterator();
                                while (it.hasNext()) {
                                    ((z0) it.next()).u(y0VarU);
                                }
                                aVar.close();
                            } catch (Throwable th) {
                                try {
                                    aVar.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                    io.sentry.util.a aVar2 = c.z;
                    aVar2.e();
                    try {
                        Iterator it2 = c.A.iterator();
                        while (it2.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                        }
                        aVar2.close();
                        return;
                    } catch (Throwable th3) {
                        try {
                            aVar2.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                return;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                we4.f().c(cm8.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((o43) this.b).invoke(w61.a);
                return;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                we4.f().c(e35.a, "Network capabilities changed: " + networkCapabilities);
                f35 f35Var = (f35) this.b;
                f35Var.b(e35.a(f35Var.f, f35Var.h));
                return;
            default:
                network.getClass();
                networkCapabilities.getClass();
                ve6 ve6Var = (ve6) this.b;
                ((Handler) ve6Var.e).post(new j((Object) ve6Var, (Object) network, (Object) networkCapabilities, (byte) 16));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                if (network.equals(((c) this.b).u)) {
                    a();
                    io.sentry.util.a aVar = c.z;
                    aVar.e();
                    try {
                        Iterator it = c.A.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                        }
                        aVar.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return;
            case 1:
                network.getClass();
                we4.f().c(cm8.a, "NetworkRequestConstraintController onLost callback");
                ((o43) this.b).invoke(new x61(7));
                return;
            case 2:
                network.getClass();
                we4.f().c(e35.a, "Network connection lost");
                ((f35) this.b).b(new d35(false, false, false, false, false));
                return;
            default:
                network.getClass();
                ve6 ve6Var = (ve6) this.b;
                ((Handler) ve6Var.e).post(new eh8(ve6Var, network, (byte) 1));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 0:
                a();
                io.sentry.util.a aVar = c.z;
                aVar.e();
                try {
                    Iterator it = c.A.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                    }
                    aVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
