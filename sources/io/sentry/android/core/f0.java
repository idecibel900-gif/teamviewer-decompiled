package io.sentry.android.core;

import android.content.res.Configuration;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.z2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.fw3;
import o.g76;
import o.im3;
import o.qf0;
import o.qv0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f104o;
    public final /* synthetic */ Object p;

    public /* synthetic */ f0(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f104o = appComponentsBreadcrumbsIntegration;
        this.n = j;
        this.p = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        byte b = this.m;
        io.sentry.protocol.g gVar = null;
        long j = this.n;
        Object obj = this.p;
        Object obj2 = this.f104o;
        switch (b) {
            case 0:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                io.sentry.p0 p0Var = AppComponentsBreadcrumbsIntegration.q;
                if (appComponentsBreadcrumbsIntegration.n != null) {
                    int i = appComponentsBreadcrumbsIntegration.m.getResources().getConfiguration().orientation;
                    if (i == 1) {
                        gVar = io.sentry.protocol.g.PORTRAIT;
                    } else if (i == 2) {
                        gVar = io.sentry.protocol.g.LANDSCAPE;
                    }
                    String lowerCase = gVar != null ? gVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    io.sentry.h hVar = new io.sentry.h(j);
                    hVar.q = "navigation";
                    hVar.s = "device.orientation";
                    hVar.d(lowerCase, "position");
                    hVar.u = f6.INFO;
                    io.sentry.p0 p0Var2 = new io.sentry.p0();
                    p0Var2.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.n.f(hVar, p0Var2);
                    return;
                }
                return;
            default:
                io.sentry.android.replay.capture.h hVar2 = (io.sentry.android.replay.capture.h) obj2;
                io.sentry.android.replay.u uVar = (io.sentry.android.replay.u) obj;
                io.sentry.android.replay.k kVar = hVar2.h;
                if (kVar != null) {
                    uVar.invoke(kVar, Long.valueOf(j));
                }
                long jC = hVar2.x.c() - ((long) hVar2.v.getSessionReplay().h);
                io.sentry.android.replay.k kVar2 = hVar2.h;
                String strZ = kVar2 != null ? kVar2.z(jC) : null;
                io.sentry.android.replay.capture.b bVar = hVar2.l;
                fw3 fw3Var = io.sentry.android.replay.capture.d.u[2];
                bVar.getClass();
                fw3Var.getClass();
                Object andSet = bVar.n.getAndSet(strZ);
                if (!im3.n(andSet, strZ)) {
                    io.sentry.android.replay.capture.c cVar = new io.sentry.android.replay.capture.c(andSet, strZ, bVar.p, (byte) 2);
                    io.sentry.android.replay.capture.d dVar = bVar.f142o;
                    g7 g7Var = dVar.a;
                    if (g7Var.getThreadChecker().c()) {
                        dVar.e.submit(new io.sentry.android.replay.util.g(new z2(cVar, (byte) 7), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            cVar.a();
                        } catch (Throwable th) {
                            g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = hVar2.y;
                g76 g76Var = new g76();
                qv0.d0(arrayList, new io.sentry.android.replay.j(jC, hVar2, g76Var, (byte) 1));
                if (g76Var.m) {
                    int i2 = 0;
                    for (Object obj3 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            qf0.U();
                            throw null;
                        }
                        io.sentry.android.replay.capture.k kVar3 = (io.sentry.android.replay.capture.k) obj3;
                        kVar3.a.F = i2;
                        List<io.sentry.rrweb.b> list = kVar3.b.n;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof io.sentry.rrweb.m) {
                                    ((io.sentry.rrweb.m) bVar2).p = i2;
                                }
                            }
                        }
                        i2 = i3;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f0(io.sentry.android.replay.capture.h hVar, io.sentry.android.replay.u uVar, long j) {
        this.f104o = hVar;
        this.p = uVar;
        this.n = j;
    }
}
