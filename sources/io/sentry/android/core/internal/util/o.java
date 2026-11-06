package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.f6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ t n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Window f115o;

    public /* synthetic */ o(t tVar, Window window, byte b) {
        this.m = b;
        this.n = tVar;
        this.f115o = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                t tVar = this.n;
                Window window = this.f115o;
                if (tVar.n.add(window)) {
                    try {
                        d dVar = tVar.u;
                        p pVar = tVar.v;
                        Handler handler = tVar.p;
                        dVar.getClass();
                        if (pVar != null) {
                            window.addOnFrameMetricsAvailableListener(pVar, handler);
                        }
                    } catch (Throwable th) {
                        tVar.f116o.d(f6.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                break;
            default:
                t tVar2 = this.n;
                Window window2 = this.f115o;
                try {
                    if (tVar2.n.remove(window2)) {
                        d dVar2 = tVar2.u;
                        p pVar2 = tVar2.v;
                        dVar2.getClass();
                        if (pVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(pVar2);
                        }
                    }
                } catch (Throwable th2) {
                    tVar2.f116o.d(f6.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                }
                break;
        }
    }
}
