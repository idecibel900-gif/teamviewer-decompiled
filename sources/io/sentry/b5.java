package io.sentry;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.multimedialegacylib.audio.NativeAudioInterface;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.BCommandHandler;
import com.teamviewer.teamviewerlib.statistics.AndroidStartStatistics;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.ndk.NativeScope;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import o.ae;
import o.bc7;
import o.bh;
import o.ea2;
import o.el;
import o.ep1;
import o.f88;
import o.fi7;
import o.fw3;
import o.fx;
import o.gy8;
import o.h10;
import o.hv2;
import o.im3;
import o.iq8;
import o.it8;
import o.kh;
import o.kw4;
import o.lv0;
import o.ph;
import o.pv0;
import o.py;
import o.qy;
import o.ry;
import o.rz;
import o.sz;
import o.ta1;
import o.ty;
import o.ua1;
import o.ub7;
import o.v51;
import o.vn0;
import o.wy;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b5(io.sentry.android.core.a aVar, h2 h2Var) {
        this.m = (byte) 1;
        this.n = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:273:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:419:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0162 A[Catch: all -> 0x0191, LOOP:0: B:40:0x0107->B:53:0x0162, LOOP_END, TryCatch #13 {all -> 0x0191, blocks: (B:37:0x00f9, B:40:0x0107, B:42:0x0117, B:44:0x0123, B:46:0x012c, B:48:0x013b, B:50:0x0158, B:53:0x0162, B:54:0x0166, B:56:0x0178, B:60:0x018d, B:61:0x0190, B:55:0x016b), top: B:408:0x00f9, inners: #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r27v0, types: [io.sentry.h7] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v42, types: [io.sentry.android.replay.f] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        io.sentry.android.core.internal.profiling.a aVar;
        File file;
        Integer numO;
        Throwable th;
        Object objP;
        Object objValueOf;
        String str;
        ?? r4;
        Object obj;
        LinkedList linkedList;
        List list;
        Field field;
        Object obj2;
        ?? r5;
        ?? r3;
        byte b = 3;
        Application application = 2;
        char c = 2;
        char c2 = 2;
        ?? fVar = 0;
        o.x7 x7Var = 1;
        x7Var = 1;
        int i = 0;
        switch (this.m) {
            case 0:
                File[] fileArrListFiles = ((File) this.n).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.lastModified() < d5.f - 300000) {
                        io.sentry.util.b.h(file2);
                    }
                }
                return;
            case 1:
                io.sentry.android.core.a aVar2 = (io.sentry.android.core.a) this.n;
                aVar2.t = SystemClock.uptimeMillis();
                aVar2.u.set(false);
                return;
            case 2:
                gy8 gy8Var = ((FrameMetricsAggregator) ((io.sentry.util.h) ((io.sentry.android.core.d) this.n).m).a()).a;
                ArrayList arrayList = (ArrayList) gy8Var.d;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList.get(size);
                    Activity activity = (Activity) weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener((hv2) gy8Var.e);
                        arrayList.remove(size);
                    }
                }
                return;
            case 3:
                ((io.sentry.android.core.i) this.n).i(true);
                return;
            case 4:
                ((io.sentry.android.core.w) this.n).a(null, true);
                return;
            case 5:
                io.sentry.android.core.j0 j0Var = (io.sentry.android.core.j0) this.n;
                if (j0Var != null) {
                    ProcessLifecycleOwner.u.r.f(j0Var);
                    return;
                }
                return;
            case 6:
                if (((io.sentry.android.core.i1) this.n).q) {
                    d5.c().n();
                }
                d5.c().l().getReplayController().b0();
                d5.c().l().getContinuousProfiler().a(false);
                return;
            case 7:
                io.sentry.android.core.w1 w1Var = (io.sentry.android.core.w1) this.n;
                io.sentry.util.a aVar3 = w1Var.D;
                aVar3.e();
                try {
                    w1Var.j(true);
                    aVar3.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        aVar3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 8:
                io.sentry.android.core.a2 a2Var = (io.sentry.android.core.a2) this.n;
                synchronized (a2Var.e) {
                    try {
                        if (a2Var.g != null) {
                            a2Var.a.g(f6.WARNING, "Timed out waiting for Perfetto profiling result.", new Object[0]);
                            a2Var.g.accept(null);
                            a2Var.g = new io.sentry.android.core.z1(a2Var, (byte) 0);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                if (!z || (aVar = a2Var.i) == null) {
                    return;
                }
                aVar.a(io.sentry.profiling.c.NOT_RECORDED);
                return;
            case ep1.b /* 9 */:
                io.sentry.android.core.l2 l2Var = ((io.sentry.android.core.m2) this.n).h;
                while (true) {
                    io.sentry.android.core.k2 k2Var = (io.sentry.android.core.k2) l2Var.d;
                    if (k2Var == null) {
                        l2Var.e = null;
                        l2Var.a = 0;
                        l2Var.b = 0;
                        return;
                    } else {
                        l2Var.d = k2Var.c;
                        io.sentry.android.core.w0 w0Var = (io.sentry.android.core.w0) l2Var.c;
                        k2Var.c = (io.sentry.android.core.k2) w0Var.a;
                        w0Var.a = k2Var;
                    }
                }
                break;
            case ep1.c /* 10 */:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.n;
                systemEventsBreadcrumbsIntegration.u(systemEventsBreadcrumbsIntegration.f95o);
                return;
            case 11:
                ((AnrProfilingIntegration) this.n).q = SystemClock.uptimeMillis();
                return;
            case ep1.d /* 12 */:
                ((io.sentry.internal.modules.f) this.n).a();
                return;
            case 13:
                w7 w7Var = (w7) this.n;
                NativeScope.nativeSetTrace(w7Var.m.a(), w7Var.n.a());
                return;
            case 14:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.n;
                ea2 ea2Var = ea2.m;
                SentryAndroidOptions sentryAndroidOptions = replayIntegration.p;
                if (sentryAndroidOptions == null) {
                    im3.e0("options");
                    throw null;
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.p;
                    if (sentryAndroidOptions2 == null) {
                        im3.e0("options");
                        throw null;
                    }
                    String str2 = (String) gVarFindPersistingScopeObserver.c(sentryAndroidOptions2, "replay.json", String.class);
                    if (str2 != null) {
                        io.sentry.protocol.w wVar = new io.sentry.protocol.w(str2);
                        if (wVar.equals(io.sentry.protocol.w.n)) {
                            replayIntegration.l0("");
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions3 = replayIntegration.p;
                        if (sentryAndroidOptions3 == null) {
                            im3.e0("options");
                            throw null;
                        }
                        String cacheDirPath = sentryAndroidOptions3.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            sentryAndroidOptions3.getLogger().g(f6.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = sentryAndroidOptions3.getCacheDirPath();
                            cacheDirPath2.getClass();
                            file = new File(cacheDirPath2, "replay_" + wVar);
                            file.mkdirs();
                        }
                        File file3 = new File(file, ".ongoing_segment");
                        if (file3.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), vn0.a), 8192);
                            try {
                                Iterator it = new v51(new fx(bufferedReader, c)).iterator();
                                while (it.hasNext()) {
                                    List listN0 = ub7.n0((String) it.next(), new String[]{"="}, 2);
                                    linkedHashMap.put((String) listN0.get(0), (String) listN0.get(1));
                                }
                                bufferedReader.close();
                                String str3 = (String) linkedHashMap.get("config.height");
                                Integer numO2 = str3 != null ? bc7.O(str3) : null;
                                String str4 = (String) linkedHashMap.get("config.width");
                                Integer numO3 = str4 != null ? bc7.O(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.frame-rate");
                                Integer numO4 = str5 != null ? bc7.O(str5) : null;
                                String str6 = (String) linkedHashMap.get("config.bit-rate");
                                Integer numO5 = str6 != null ? bc7.O(str6) : null;
                                String str7 = (String) linkedHashMap.get("segment.id");
                                if (str7 != null) {
                                    numO = bc7.O(str7);
                                    th = null;
                                } else {
                                    numO = null;
                                    th = null;
                                }
                                try {
                                    String str8 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    objP = io.sentry.config.a.p(str8);
                                } catch (Throwable unused) {
                                    objP = th;
                                }
                                try {
                                    String str9 = (String) linkedHashMap.get("replay.type");
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    objValueOf = h7.valueOf(str9);
                                } catch (Throwable unused2) {
                                    objValueOf = th;
                                }
                                if (numO2 == null || numO3 == null || numO4 == null || numO5 == null || numO == null) {
                                    str = "options";
                                } else {
                                    str = "options";
                                    Integer num = numO2;
                                    if (numO.intValue() != -1 && objP != null && objValueOf != null) {
                                        io.sentry.android.replay.c0 c0Var = new io.sentry.android.replay.c0(numO3.intValue(), num.intValue(), 1.0f, 1.0f, numO4.intValue(), numO5.intValue());
                                        io.sentry.android.replay.k kVar = new io.sentry.android.replay.k(sentryAndroidOptions3, wVar);
                                        ArrayList arrayList2 = kVar.t;
                                        File fileQ = kVar.q();
                                        if (fileQ != null) {
                                            fileQ.listFiles(new b0(kVar, (byte) 1));
                                        }
                                        if (arrayList2.isEmpty()) {
                                            sentryAndroidOptions3.getLogger().g(f6.DEBUG, "No frames found for replay: %s, deleting the replay", wVar);
                                            io.sentry.util.b.h(file);
                                        } else {
                                            if (arrayList2.size() > 1) {
                                                pv0.b0(arrayList2, new io.sentry.android.replay.h((byte) 0));
                                            }
                                            String str10 = (String) linkedHashMap.get("replay.flushed");
                                            boolean zN = str10 != null ? im3.n(ub7.w0(str10), Boolean.TRUE) : false;
                                            h7 h7Var = h7.SESSION;
                                            int iIntValue = (objValueOf == h7Var || zN) ? numO.intValue() : 0;
                                            ?? date = objValueOf == h7Var ? objP : new Date(((io.sentry.android.replay.l) lv0.m0(arrayList2)).b);
                                            long time = (((io.sentry.android.replay.l) lv0.v0(arrayList2)).b - date.getTime()) + ((long) (1000 / numO4.intValue()));
                                            String str11 = (String) linkedHashMap.get("replay.recording");
                                            if (str11 != null) {
                                                l4 l4Var = (l4) sentryAndroidOptions3.getSerializer().b(new StringReader(str11), l4.class);
                                                if (l4Var != null) {
                                                    list = l4Var.n;
                                                } else {
                                                    obj = th;
                                                }
                                                if (obj != null) {
                                                    List list2 = l4Var.n;
                                                    list2.getClass();
                                                    linkedList = new LinkedList(list2);
                                                } else {
                                                    r4 = th;
                                                }
                                                if (r4 == 0) {
                                                    obj = list;
                                                    obj = list;
                                                    r4 = linkedList;
                                                    r4 = ea2Var;
                                                }
                                            } else {
                                                obj = list;
                                                obj = list;
                                                r4 = linkedList;
                                                r4 = ea2Var;
                                            }
                                            obj = list;
                                            obj = list;
                                            r4 = linkedList;
                                            fVar = new io.sentry.android.replay.f(c0Var, kVar, date, iIntValue, time, objValueOf, (String) linkedHashMap.get("replay.screen-at-start"), lv0.J0(r4, new io.sentry.android.replay.h((byte) 1)));
                                        }
                                    }
                                    fVar = th;
                                }
                                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", wVar);
                                io.sentry.util.b.h(file);
                                fVar = th;
                                break;
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    kh.n(bufferedReader, th5);
                                    throw th6;
                                }
                            }
                        } else {
                            sentryAndroidOptions3.getLogger().g(f6.DEBUG, "No ongoing segment found for replay: %s", wVar);
                            io.sentry.util.b.h(file);
                            str = "options";
                            th = null;
                        }
                        if (fVar == 0) {
                            replayIntegration.l0("");
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.p;
                        if (sentryAndroidOptions4 == null) {
                            im3.e0(str);
                            throw th;
                        }
                        Object objC = gVarFindPersistingScopeObserver.c(sentryAndroidOptions4, "breadcrumbs.json", List.class);
                        ?? r34 = objC instanceof List ? (List) objC : th;
                        n1 n1Var = replayIntegration.q;
                        SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.p;
                        if (sentryAndroidOptions5 == null) {
                            im3.e0(str);
                            throw th;
                        }
                        long j = fVar.e;
                        Date date2 = fVar.c;
                        int i2 = fVar.d;
                        io.sentry.android.replay.c0 c0Var2 = fVar.a;
                        io.sentry.android.replay.capture.m mVarA = io.sentry.android.replay.capture.j.a(n1Var, sentryAndroidOptions5, j, date2, wVar, i2, c0Var2.b, c0Var2.a, fVar.f, fVar.b, c0Var2.e, c0Var2.f, fVar.g, r34, new LinkedList(fVar.h), ea2Var, ea2Var);
                        if (mVarA instanceof io.sentry.android.replay.capture.k) {
                            p0 p0VarG = io.sentry.util.b.g(new io.sentry.android.replay.m());
                            io.sentry.android.replay.capture.k kVar2 = (io.sentry.android.replay.capture.k) mVarA;
                            n1 n1Var2 = replayIntegration.q;
                            if (n1Var2 != null) {
                                i7 i7Var = kVar2.a;
                                p0VarG.h = kVar2.b;
                                n1Var2.t(i7Var, p0VarG);
                            }
                        }
                        replayIntegration.l0(str2);
                        return;
                    }
                }
                replayIntegration.l0("");
                return;
            case 15:
                io.sentry.android.replay.y yVar = (io.sentry.android.replay.y) this.n;
                if (yVar.m.get()) {
                    return;
                }
                try {
                    Object value = io.sentry.android.replay.f0.b.getValue();
                    if (value == null || (field = (Field) io.sentry.android.replay.f0.c.getValue()) == null) {
                        return;
                    }
                    Object obj3 = field.get(value);
                    obj3.getClass();
                    ArrayList arrayList3 = (ArrayList) obj3;
                    io.sentry.util.a aVar4 = yVar.n;
                    aVar4.e();
                    try {
                        io.sentry.android.replay.x xVar = yVar.p;
                        xVar.addAll(arrayList3);
                        iq8.l(aVar4, null);
                        field.set(value, xVar);
                        return;
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            iq8.l(aVar4, th7);
                            throw th8;
                        }
                    }
                } catch (Throwable th9) {
                    Log.w("WindowManagerSpy", th9);
                    return;
                }
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                io.sentry.android.replay.capture.d dVar = (io.sentry.android.replay.capture.d) this.n;
                io.sentry.android.replay.k kVar3 = dVar.h;
                if (kVar3 != null) {
                    kVar3.close();
                }
                dVar.k.set(0L);
                dVar.m(null);
                io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
                wVar2.getClass();
                io.sentry.android.replay.capture.b bVar = dVar.m;
                fw3 fw3Var = io.sentry.android.replay.capture.d.u[3];
                bVar.getClass();
                fw3Var.getClass();
                Object andSet = bVar.n.getAndSet(wVar2);
                if (im3.n(andSet, wVar2)) {
                    return;
                }
                io.sentry.android.replay.capture.a aVar5 = new io.sentry.android.replay.capture.a(andSet, wVar2, bVar.p, (byte) 0);
                io.sentry.android.replay.capture.d dVar2 = bVar.f142o;
                g7 g7Var = dVar2.a;
                if (g7Var.getThreadChecker().c()) {
                    dVar2.e.submit(new io.sentry.android.replay.util.g(new z2(aVar5, 1 == true ? (byte) 1 : (byte) 0), "CaptureStrategy.runInBackground"));
                    return;
                }
                try {
                    aVar5.a();
                    return;
                } catch (Throwable th10) {
                    g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th10);
                    return;
                }
            case 17:
                io.sentry.logger.d dVar3 = (io.sentry.logger.d) this.n;
                dVar3.p.a(dVar3.m.getShutdownTimeoutMillis());
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                io.sentry.metrics.c cVar = (io.sentry.metrics.c) this.n;
                cVar.p.a(cVar.m.getShutdownTimeoutMillis());
                return;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                io.sentry.transport.p pVar = (io.sentry.transport.p) this.n;
                Iterator it2 = pVar.p.iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.o) it2.next()).J(pVar);
                }
                return;
            case 20:
                ((o.u0) this.n).b();
                return;
            case 21:
                Activity activity2 = (Activity) this.n;
                if (activity2.isFinishing()) {
                    return;
                }
                Handler handler = o.y7.g;
                Method method = o.y7.f;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    activity2.recreate();
                    return;
                }
                if (((i3 != 26 && i3 != 27) || method != null) && (o.y7.e != null || o.y7.d != null)) {
                    try {
                        Object obj4 = o.y7.c.get(activity2);
                        if (obj4 != null && (obj2 = o.y7.b.get(activity2)) != null) {
                            application = activity2.getApplication();
                            x7Var = new o.x7(activity2);
                            application.registerActivityLifecycleCallbacks(x7Var);
                            handler.post(new it8((Object) x7Var, obj4, (byte) c2));
                            if (i3 != 26 && i3 != 27) {
                                x7Var = 0;
                            }
                            try {
                                if (x7Var != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj2, obj4, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th11) {
                                        th = th11;
                                        r3 = application;
                                        r5 = x7Var;
                                        handler.post(new it8((Object) r3, (Object) r5, b));
                                        throw th;
                                    }
                                } else {
                                    activity2.recreate();
                                }
                                handler.post(new it8(application, x7Var, b));
                                return;
                            } catch (Throwable th12) {
                                th = th12;
                                r3 = application;
                                r5 = x7Var;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
                activity2.recreate();
                return;
            case 22:
                ((View) ((ae) this.n).c).setVisibility(4);
                return;
            case 23:
                bh bhVar = (bh) this.n;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    bhVar.p.r(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        bhVar.n();
                        Trace.endSection();
                        bhVar.U = false;
                        return;
                    } catch (Throwable th13) {
                        Trace.endSection();
                        throw th13;
                    }
                } catch (Throwable th14) {
                    Trace.endSection();
                    throw th14;
                }
            case 24:
                ph phVar = (ph) this.n;
                boolean zD = phVar.d();
                AndroidComposeView androidComposeView = phVar.m;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.r(true);
                        kw4 kw4Var = phVar.v;
                        int[] iArr = kw4Var.b;
                        long[] jArr = kw4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr[i4];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = i; i6 < i5; i6++) {
                                        if ((255 & j2) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!phVar.c().a(i7)) {
                                                phVar.p.add(new ta1(i7, phVar.u, ua1.n, null));
                                                phVar.s.b(f88.a);
                                            }
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 != length) {
                                            i4++;
                                            i = 0;
                                        }
                                    }
                                } else if (i4 != length) {
                                    i4++;
                                    i = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            phVar.g(androidComposeView.getSemanticsOwner().a(), phVar.w);
                            Trace.endSection();
                            phVar.b(phVar.c());
                            phVar.k();
                            phVar.x = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th15) {
                        Trace.endSection();
                        throw th15;
                    }
                }
                return;
            case 25:
                AndroidStartStatistics.a((fi7) this.n);
                return;
            case 26:
                ActionMode actionMode = ((el) this.n).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 27:
                wy wyVar = (wy) this.n;
                EventHub eventHub = wyVar.x;
                ye4.a("AudioManager", "shutdown");
                NativeAudioInterface nativeAudioInterface = wyVar.b;
                if (nativeAudioInterface != null) {
                    boolean zShutdownAudio = nativeAudioInterface.shutdownAudio();
                    if (wyVar.r) {
                        wyVar.g(2L);
                    }
                    if (zShutdownAudio) {
                        wyVar.i(py.f1786o);
                    } else {
                        ye4.c("AudioManager", "shutdown audio failed");
                        wyVar.i(py.p);
                    }
                    ry ryVar = ry.m;
                    if (ryVar != wyVar.e) {
                        ye4.a("AudioManager", "new extrenal record state: " + ryVar);
                        wyVar.e = ryVar;
                    }
                    wyVar.j(ty.m);
                    wyVar.l(qy.m);
                } else {
                    ye4.c("AudioManager", "shutDownAudio: interface is null");
                }
                wyVar.y.getContentResolver().unregisterContentObserver(wyVar.i);
                eventHub.f(wyVar.z);
                eventHub.f(wyVar.A);
                eventHub.f(wyVar.B);
                eventHub.f(wyVar.C);
                eventHub.f(wyVar.D);
                eventHub.f(wyVar.E);
                eventHub.f(wyVar.F);
                eventHub.f(wyVar.G);
                wyVar.j.clear();
                wyVar.k.clear();
                wyVar.b = null;
                return;
            case 28:
                sz szVar = ((rz) this.n).a;
                szVar.b = false;
                szVar.a();
                return;
            default:
                BCommandHandler bCommandHandler = (BCommandHandler) this.n;
                h10 h10Var = bCommandHandler.a;
                h10Var.getClass();
                h10Var.n = false;
                try {
                    h10 h10Var2 = bCommandHandler.a;
                    h10Var2.getClass();
                    h10Var2.join();
                    break;
                } catch (InterruptedException unused4) {
                    ye4.c("BCommandHandler", "Interrupted while waiting for handler to finish");
                }
                ye4.a("BCommandHandler", "Closed command handler");
                return;
        }
    }

    public /* synthetic */ b5(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ b5(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj2;
    }
}
