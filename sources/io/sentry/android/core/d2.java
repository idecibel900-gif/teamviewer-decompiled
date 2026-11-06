package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.b4;
import io.sentry.c4;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.y4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f102o;
    public final /* synthetic */ Object p;

    public /* synthetic */ d2(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.n1 n1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.m = (byte) 4;
        this.n = systemEventsBreadcrumbsIntegration;
        this.p = n1Var;
        this.f102o = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.n;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f102o;
                io.sentry.n1 n1Var = (io.sentry.n1) this.p;
                try {
                    if (sendCachedEnvelopeIntegration.u.get()) {
                        sentryAndroidOptions.getLogger().g(f6.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.t.getAndSet(true)) {
                        io.sentry.a1 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.p = connectionStatusProvider;
                        connectionStatusProvider.j0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.s = sendCachedEnvelopeIntegration.m.a(n1Var, sentryAndroidOptions);
                    }
                    io.sentry.a1 a1Var = sendCachedEnvelopeIntegration.p;
                    if (a1Var != null && a1Var.g0() == io.sentry.y0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().g(f6.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.p pVarC = n1Var.c();
                    if (pVarC != null && pVarC.j(io.sentry.q.All)) {
                        sentryAndroidOptions.getLogger().g(f6.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    y4 y4Var = sendCachedEnvelopeIntegration.s;
                    if (y4Var == null) {
                        sentryAndroidOptions.getLogger().g(f6.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        y4Var.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                d dVar = (d) this.n;
                Runnable runnable = (Runnable) this.f102o;
                String str = (String) this.p;
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) dVar.f100o).getLogger().g(f6.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                i iVar = (i) this.n;
                g7 g7Var = (g7) this.f102o;
                io.sentry.n1 n1Var2 = (io.sentry.n1) this.p;
                ArrayList<b4> arrayList = iVar.y;
                if (iVar.B.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                io.sentry.util.a aVar = iVar.I;
                aVar.e();
                try {
                    for (b4 b4Var : arrayList) {
                        c4 c4Var = new c4(b4Var.a, b4Var.b, b4Var.d, b4Var.c, Double.valueOf(b4Var.e), g7Var);
                        c4Var.w = b4Var.f;
                        arrayList2.add(c4Var);
                    }
                    arrayList.clear();
                    aVar.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        n1Var2.k((c4) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.n;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f102o;
                String str2 = (String) this.p;
                io.sentry.util.a aVar2 = envelopeFileObserverIntegration.p;
                aVar2.e();
                try {
                    if (!envelopeFileObserverIntegration.f90o) {
                        envelopeFileObserverIntegration.e(sentryAndroidOptions2, str2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        aVar2.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.n;
                io.sentry.n1 n1Var3 = (io.sentry.n1) this.p;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.f102o;
                io.sentry.util.a aVar3 = systemEventsBreadcrumbsIntegration.w;
                aVar3.e();
                try {
                    if (!systemEventsBreadcrumbsIntegration.r && !systemEventsBreadcrumbsIntegration.s && systemEventsBreadcrumbsIntegration.n == null) {
                        systemEventsBreadcrumbsIntegration.n = new w2(systemEventsBreadcrumbsIntegration, n1Var3, sentryAndroidOptions3);
                        if (systemEventsBreadcrumbsIntegration.t == null) {
                            systemEventsBreadcrumbsIntegration.t = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.q) {
                                systemEventsBreadcrumbsIntegration.t.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.u == null) {
                            systemEventsBreadcrumbsIntegration.u = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.u.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.u.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.m;
                            w2 w2Var = systemEventsBreadcrumbsIntegration.n;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.t;
                            io.sentry.util.b.v(sentryAndroidOptions3.getLogger(), "The ILogger object is required.");
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(w2Var, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(w2Var, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.v.getAndSet(true)) {
                                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                io.sentry.util.b.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th6) {
                            sentryAndroidOptions3.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions3.getLogger().d(f6.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th6);
                        }
                        break;
                    }
                    aVar3.close();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar3.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
        }
    }

    public /* synthetic */ d2(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f102o = obj2;
        this.p = obj3;
    }
}
