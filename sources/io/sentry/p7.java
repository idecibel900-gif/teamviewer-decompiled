package io.sentry;

import android.app.Activity;
import com.teamviewer.apidefinitions.chat.infrastructure.ApiClient;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.replay.ReplayIntegration;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.a93;
import o.ep1;
import o.fw3;
import o.im3;
import o.lc6;
import o.ub7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p7 implements x7, r4, io.sentry.android.core.j2, io.sentry.util.g, io.sentry.util.network.e, m4, a93 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ p7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.a93
    public void a(String str) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((ApiClient) obj, str);
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                com.teamviewer.apidefinitions.legacydevices.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.legacydevices.infrastructure.ApiClient) obj, str);
                break;
            case 20:
                com.teamviewer.apidefinitions.account.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.account.infrastructure.ApiClient) obj, str);
                break;
            case 21:
                com.teamviewer.apidefinitions.manageddevices.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.manageddevices.infrastructure.ApiClient) obj, str);
                break;
            case 22:
                com.teamviewer.apidefinitions.mobilewake.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.mobilewake.infrastructure.ApiClient) obj, str);
                break;
            case 23:
                com.teamviewer.apidefinitions.policies.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.policies.infrastructure.ApiClient) obj, str);
                break;
            case 24:
                com.teamviewer.apidefinitions.rolloutconfigurations.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.rolloutconfigurations.infrastructure.ApiClient) obj, str);
                break;
            case 25:
                com.teamviewer.apidefinitions.supportsessions.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.supportsessions.infrastructure.ApiClient) obj, str);
                break;
            case 26:
                com.teamviewer.apidefinitions.wakeonlan.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.wakeonlan.infrastructure.ApiClient) obj, str);
                break;
            case 27:
                com.teamviewer.apidefinitions.contacts.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.contacts.infrastructure.ApiClient) obj, str);
                break;
            case 28:
                com.teamviewer.apidefinitions.custommodules.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.custommodules.infrastructure.ApiClient) obj, str);
                break;
            default:
                com.teamviewer.apidefinitions.recentconnections.infrastructure.ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((com.teamviewer.apidefinitions.recentconnections.infrastructure.ApiClient) obj, str);
                break;
        }
    }

    @Override // io.sentry.m4
    public void b(h4 h4Var) {
        ((l1) this.n).O(new h4());
    }

    @Override // io.sentry.android.core.j2
    public void c() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.n;
        WeakReference weakReference = feedbackShakeIntegration.q;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = io.sentry.android.core.k0.q.p;
        if (activity == null || feedbackShakeIntegration.f91o == null || !feedbackShakeIntegration.p || feedbackShakeIntegration.e(activity) || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity.runOnUiThread(new u4((Object) feedbackShakeIntegration, (Object) activity, (byte) 6));
    }

    @Override // io.sentry.x7
    public void d(v7 v7Var) {
        s7 s7Var = (s7) this.n;
        p pVar = s7Var.q;
        if (pVar != null) {
            pVar.b(v7Var);
        }
        r7 r7Var = s7Var.f;
        f8 f8Var = s7Var.r;
        if (f8Var.g == null) {
            if (r7Var.a) {
                s7Var.x(r7Var.b, null);
                return;
            }
            return;
        }
        if (f8Var.f) {
            ListIterator listIterator = s7Var.c.listIterator();
            while (listIterator.hasNext()) {
                v7 v7Var2 = (v7) listIterator.next();
                if (!v7Var2.g && v7Var2.b == null) {
                    return;
                }
            }
        }
        s7Var.t();
    }

    @Override // io.sentry.util.g
    public Object e() {
        io.sentry.cache.tape.j jVar;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 6:
                y5 y5Var = (y5) obj;
                int i = SentryPerformanceProvider.r;
                return y5Var;
            case ep1.d /* 12 */:
                return ((io.sentry.cache.c) obj).m.getSerializer();
            case 13:
                io.sentry.cache.g gVar = (io.sentry.cache.g) obj;
                SentryAndroidOptions sentryAndroidOptions = gVar.a;
                File fileB = io.sentry.cache.a.b(sentryAndroidOptions, ".scope-cache");
                if (fileB == null) {
                    sentryAndroidOptions.getLogger().g(f6.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = sentryAndroidOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileG = io.sentry.cache.tape.j.G(file, false);
                    try {
                        try {
                            jVar = new io.sentry.cache.tape.j(file, randomAccessFileG, maxBreadcrumbs, false);
                        } catch (Throwable th) {
                            randomAccessFileG.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to create breadcrumbs queue", e);
                        return new io.sentry.cache.tape.b();
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = sentryAndroidOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileG2 = io.sentry.cache.tape.j.G(file, false);
                    try {
                        jVar = new io.sentry.cache.tape.j(file, randomAccessFileG2, maxBreadcrumbs2, false);
                    } catch (Throwable th2) {
                        randomAccessFileG2.close();
                        throw th2;
                    }
                    break;
                }
                return new io.sentry.cache.tape.e(jVar, new m7((Object) gVar, (byte) 5));
            default:
                return Boolean.valueOf(io.sentry.util.i.a((g1) obj, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // io.sentry.util.network.e
    public io.sentry.util.network.b extract(Object obj) {
        return io.sentry.okhttp.g.b((io.sentry.okhttp.g) this.n, (lc6) obj);
    }

    @Override // io.sentry.r4
    public void i(l1 l1Var) {
        u7 u7VarS;
        byte b = this.m;
        byte b2 = 1;
        Object obj = this.n;
        switch (b) {
            case 2:
                l1Var.H(new q7((x1) obj, l1Var, b2));
                break;
            case 3:
            case 6:
            default:
                io.sentry.android.replay.capture.q qVar = (io.sentry.android.replay.capture.q) obj;
                l1Var.getClass();
                l1Var.k(qVar.d());
                String strG = l1Var.G();
                String strQ0 = strG != null ? ub7.q0('.', strG, strG) : null;
                io.sentry.android.replay.capture.b bVar = qVar.l;
                byte b3 = 2;
                fw3 fw3Var = io.sentry.android.replay.capture.d.u[2];
                bVar.getClass();
                fw3Var.getClass();
                Object andSet = bVar.n.getAndSet(strQ0);
                if (!im3.n(andSet, strQ0)) {
                    io.sentry.android.replay.capture.c cVar = new io.sentry.android.replay.capture.c(andSet, strQ0, bVar.p, b3);
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
                }
                break;
            case 4:
                AtomicLong atomicLong = ((io.sentry.android.core.i1) obj).m;
                if (atomicLong.get() == 0 && (u7VarS = l1Var.s()) != null) {
                    atomicLong.set(u7VarS.m.getTime());
                    break;
                }
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                if (l1Var.s() != null) {
                    atomicBoolean.set(true);
                }
                break;
            case 7:
                l1Var.H(new q7((io.sentry.android.core.internal.gestures.g) obj, l1Var, (byte) 6));
                break;
            case 8:
                ((x1[]) obj)[0] = l1Var.m();
                break;
            case ep1.b /* 9 */:
                int i = ReplayIntegration.B;
                l1Var.getClass();
                l1Var.k(((io.sentry.android.replay.n) obj).c);
                break;
            case ep1.c /* 10 */:
                int i2 = ReplayIntegration.B;
                l1Var.getClass();
                if (im3.n(l1Var.j(), (io.sentry.protocol.w) obj)) {
                    l1Var.k(io.sentry.protocol.w.n);
                }
                break;
        }
    }

    public /* synthetic */ p7(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj2;
    }
}
