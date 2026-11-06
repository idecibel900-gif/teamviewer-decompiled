package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.g;
import io.sentry.android.replay.j0;
import io.sentry.f6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.iq8;
import o.qv0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {
    public final SentryAndroidOptions m;
    public final ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f152o = new ArrayList();
    public final io.sentry.util.a p = new io.sentry.util.a();
    public final WeakHashMap q = new WeakHashMap();
    public final io.sentry.util.a r = new io.sentry.util.a();

    public b(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration) {
        this.m = sentryAndroidOptions;
        this.n = replayIntegration;
    }

    public final void a(View view) throws IllegalAccessException {
        WeakHashMap weakHashMap = this.q;
        Window windowT = io.sentry.config.a.t(view);
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (windowT == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowT);
            if ((weakReference != null ? (a) weakReference.get() : null) != null) {
                iq8.l(aVar, null);
                return;
            }
            iq8.l(aVar, null);
            a aVar2 = new a(sentryAndroidOptions, this.n, windowT.getCallback());
            windowT.setCallback(aVar2);
            aVar.e();
            try {
                weakHashMap.put(windowT, new WeakReference(aVar2));
                iq8.l(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(aVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                iq8.l(aVar, th3);
                throw th4;
            }
        }
    }

    public final void b(View view) throws IllegalAccessException {
        Window windowT = io.sentry.config.a.t(view);
        if (windowT == null) {
            this.m.getLogger().g(f6.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowT.getCallback();
        if (callback instanceof a) {
            windowT.setCallback(((a) callback).m);
            io.sentry.util.a aVar = this.r;
            aVar.e();
            try {
                iq8.l(aVar, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(aVar, th);
                    throw th2;
                }
            }
        }
        io.sentry.util.a aVar2 = this.r;
        aVar2.e();
        try {
            WeakReference weakReference = (WeakReference) this.q.get(windowT);
            a aVar3 = weakReference != null ? (a) weakReference.get() : null;
            iq8.l(aVar2, null);
            if (aVar3 != null) {
                aVar3.f151o = null;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                iq8.l(aVar2, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void e(View view, boolean z) {
        view.getClass();
        io.sentry.util.a aVar = this.p;
        aVar.e();
        ArrayList arrayList = this.f152o;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                a(view);
            } else {
                b(view);
                qv0.d0(arrayList, new j0(view, (byte) 1));
            }
            iq8.l(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }
}
