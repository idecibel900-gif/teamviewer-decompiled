package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.u;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.protocol.w;
import io.sentry.u4;
import io.sentry.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import o.fw3;
import o.gx4;
import o.im3;
import o.lv0;
import o.mv0;
import o.qf0;
import o.qv0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ fw3[] u = {new gx4(0, d.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;"), new gx4(0, d.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new gx4(0, d.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new gx4(0, d.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new gx4(0, d.class, "currentSegment", "getCurrentSegment()I"), new gx4(0, d.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"), new gx4(0, d.class, "isFlushed", "isFlushed()Z")};
    public final g7 a;
    public final n1 b;
    public final io.sentry.transport.f c;
    public final ScheduledExecutorService d;
    public final ScheduledExecutorService e;
    public final io.sentry.android.replay.gestures.c f;
    public final AtomicBoolean g;
    public io.sentry.android.replay.k h;
    public final b i;
    public final b j;
    public final AtomicLong k;
    public final b l;
    public final b m;
    public final b n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f144o;
    public final b p;
    public final ConcurrentLinkedDeque q;
    public final Object r;
    public final LinkedHashSet s;
    public final LinkedHashSet t;

    public d(g7 g7Var, n1 n1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        g7Var.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.a = g7Var;
        this.b = n1Var;
        this.c = fVar;
        this.d = scheduledExecutorService;
        this.e = scheduledExecutorService2;
        this.f = new io.sentry.android.replay.gestures.c(fVar);
        this.g = new AtomicBoolean(false);
        this.i = new b(this, this, (byte) 4);
        this.j = new b(this, this, (byte) 5);
        this.k = new AtomicLong();
        this.l = new b(this, this, (byte) 6);
        this.m = new b(w.n, this, this);
        this.n = new b(this, this, (byte) 1);
        this.f144o = new b(this, this, (byte) 2);
        this.p = new b(this, this, (byte) 3);
        this.q = new ConcurrentLinkedDeque();
        this.r = new Object();
        this.s = new LinkedHashSet();
        this.t = new LinkedHashSet();
    }

    public static m c(d dVar, long j, Date date, w wVar, int i, int i2, int i3, int i4, int i5) {
        List listP0;
        List listP1;
        b bVar = dVar.f144o;
        fw3[] fw3VarArr = u;
        h7 h7Var = (h7) bVar.a(dVar, fw3VarArr[5]);
        io.sentry.android.replay.k kVar = dVar.h;
        String str = (String) dVar.l.a(dVar, fw3VarArr[2]);
        ConcurrentLinkedDeque concurrentLinkedDeque = dVar.q;
        wVar.getClass();
        h7Var.getClass();
        concurrentLinkedDeque.getClass();
        synchronized (dVar.r) {
            listP0 = lv0.P0(dVar.s);
            listP1 = lv0.P0(dVar.t);
            dVar.s.clear();
            dVar.t.clear();
        }
        return j.a(dVar.b, dVar.a, j, date, wVar, i, i2, i3, h7Var, kVar, i4, i5, str, null, concurrentLinkedDeque, listP0, listP1);
    }

    public abstract void a(Function1 function1, boolean z);

    public d b() {
        return this;
    }

    public final w d() {
        return (w) this.m.a(this, u[3]);
    }

    public final int e() {
        return ((Number) this.n.a(this, u[4])).intValue();
    }

    public final c0 f() {
        return (c0) this.i.a(this, u[0]);
    }

    public abstract void g(c0 c0Var);

    public abstract void h(u uVar);

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    public void i(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listK;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        List listK2;
        long j;
        List listK3;
        c0 c0VarF = f();
        if (c0VarF != null) {
            io.sentry.android.replay.gestures.c cVar = this.f;
            io.sentry.transport.f fVar = (io.sentry.transport.f) cVar.p;
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.m;
            float f = c0VarF.d;
            float f2 = c0VarF.c;
            int actionMasked = motionEvent.getActionMasked();
            int i = 10;
            int i2 = -1;
            if (actionMasked == 0) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    list = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                    gVar.n = fVar.c();
                    gVar.r = motionEvent.getX(iFindPointerIndex) * f2;
                    gVar.s = motionEvent.getY(iFindPointerIndex) * f;
                    gVar.q = 0;
                    gVar.u = pointerId;
                    gVar.p = io.sentry.rrweb.f.TouchStart;
                    listK = qf0.K(gVar);
                }
            } else if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    list = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.g gVar2 = new io.sentry.rrweb.g();
                    gVar2.n = fVar.c();
                    gVar2.r = motionEvent.getX(iFindPointerIndex2) * f2;
                    gVar2.s = motionEvent.getY(iFindPointerIndex2) * f;
                    gVar2.q = 0;
                    gVar2.u = pointerId2;
                    gVar2.p = io.sentry.rrweb.f.TouchEnd;
                    listK2 = qf0.K(gVar2);
                }
            } else if (actionMasked == 2) {
                long jC = fVar.c();
                long j2 = cVar.f153o;
                long j3 = 0;
                if (j2 == 0 || j2 + 50 <= jC) {
                    cVar.f153o = jC;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (Integer num : setKeySet) {
                        num.getClass();
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 == i2) {
                            j = j3;
                        } else {
                            j = j3;
                            if (cVar.n == j) {
                                cVar.n = jC;
                            }
                            Object obj = linkedHashMap.get(num);
                            obj.getClass();
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            hVar.n = motionEvent.getX(iFindPointerIndex3) * f2;
                            hVar.f257o = motionEvent.getY(iFindPointerIndex3) * f;
                            hVar.m = 0;
                            hVar.p = jC - cVar.n;
                            ((Collection) obj).add(hVar);
                        }
                        j3 = j;
                        i2 = -1;
                    }
                    long j4 = j3;
                    long j5 = jC - cVar.n;
                    if (j5 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList<io.sentry.rrweb.h> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                                iVar.n = jC;
                                ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, i));
                                for (io.sentry.rrweb.h hVar2 : arrayList2) {
                                    hVar2.p -= j5;
                                    arrayList3.add(hVar2);
                                    iVar = iVar;
                                }
                                io.sentry.rrweb.i iVar2 = iVar;
                                iVar2.q = arrayList3;
                                iVar2.p = iIntValue;
                                arrayList.add(iVar2);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                obj2.getClass();
                                ((ArrayList) obj2).clear();
                                i = 10;
                            }
                        }
                        cVar.n = j4;
                        list = arrayList;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                        io.sentry.rrweb.g gVar3 = new io.sentry.rrweb.g();
                        gVar3.n = fVar.c();
                        gVar3.r = motionEvent.getX(iFindPointerIndex) * f2;
                        gVar3.s = motionEvent.getY(iFindPointerIndex) * f;
                        gVar3.q = 0;
                        gVar3.u = pointerId;
                        gVar3.p = io.sentry.rrweb.f.TouchStart;
                        listK = qf0.K(gVar3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.g gVar4 = new io.sentry.rrweb.g();
                        gVar4.n = fVar.c();
                        gVar4.r = motionEvent.getX(iFindPointerIndex2) * f2;
                        gVar4.s = motionEvent.getY(iFindPointerIndex2) * f;
                        gVar4.q = 0;
                        gVar4.u = pointerId2;
                        gVar4.p = io.sentry.rrweb.f.TouchEnd;
                        listK2 = qf0.K(gVar4);
                    }
                }
                list = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.g gVar5 = new io.sentry.rrweb.g();
                gVar5.n = fVar.c();
                gVar5.r = motionEvent.getX() * f2;
                gVar5.s = motionEvent.getY() * f;
                gVar5.q = 0;
                gVar5.u = 0;
                gVar5.p = io.sentry.rrweb.f.TouchCancel;
                listK3 = qf0.K(gVar5);
            }
            if (list == null) {
                list = listK;
                list = listK2;
                list = listK3;
                return;
            } else {
                list = listK;
                list = listK2;
                list = listK3;
                qv0.c0(this.q, list);
            }
        }
    }

    public abstract void j();

    public final void k(int i) {
        fw3 fw3Var = u[4];
        Integer numValueOf = Integer.valueOf(i);
        b bVar = this.n;
        bVar.getClass();
        fw3Var.getClass();
        Object andSet = bVar.n.getAndSet(numValueOf);
        if (im3.n(andSet, numValueOf)) {
            return;
        }
        a aVar = new a(andSet, numValueOf, bVar.p, (byte) 1);
        d dVar = bVar.f142o;
        g7 g7Var = dVar.a;
        if (g7Var.getThreadChecker().c()) {
            dVar.e.submit(new io.sentry.android.replay.util.g(new z2(aVar, (byte) 2), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.a();
        } catch (Throwable th) {
            g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void l(c0 c0Var) {
        fw3 fw3Var = u[0];
        b bVar = this.i;
        bVar.getClass();
        fw3Var.getClass();
        Object andSet = bVar.n.getAndSet(c0Var);
        if (im3.n(andSet, c0Var)) {
            return;
        }
        c cVar = new c(andSet, c0Var, bVar.p, (byte) 0);
        d dVar = bVar.f142o;
        g7 g7Var = dVar.a;
        if (g7Var.getThreadChecker().c()) {
            dVar.e.submit(new io.sentry.android.replay.util.g(new z2(cVar, (byte) 5), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            cVar.a();
        } catch (Throwable th) {
            g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void m(Date date) {
        fw3 fw3Var = u[1];
        b bVar = this.j;
        bVar.getClass();
        fw3Var.getClass();
        Object andSet = bVar.n.getAndSet(date);
        if (im3.n(andSet, date)) {
            return;
        }
        c cVar = new c(andSet, date, bVar.p, (byte) 1);
        d dVar = bVar.f142o;
        g7 g7Var = dVar.a;
        if (g7Var.getThreadChecker().c()) {
            dVar.e.submit(new io.sentry.android.replay.util.g(new z2(cVar, (byte) 6), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            cVar.a();
        } catch (Throwable th) {
            g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public void n(int i, w wVar, h7 h7Var) {
        wVar.getClass();
        this.h = new io.sentry.android.replay.k(this.a, wVar);
        fw3[] fw3VarArr = u;
        byte b = 3;
        fw3 fw3Var = fw3VarArr[3];
        b bVar = this.m;
        bVar.getClass();
        fw3Var.getClass();
        Object andSet = bVar.n.getAndSet(wVar);
        if (!im3.n(andSet, wVar)) {
            a aVar = new a(andSet, wVar, bVar.p, (byte) 0);
            d dVar = bVar.f142o;
            g7 g7Var = dVar.a;
            if (g7Var.getThreadChecker().c()) {
                dVar.e.submit(new io.sentry.android.replay.util.g(new z2(aVar, (byte) 1), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        k(i);
        if (h7Var == null) {
            h7Var = this instanceof q ? h7.SESSION : h7.BUFFER;
        }
        h7Var.getClass();
        fw3 fw3Var2 = fw3VarArr[5];
        b bVar2 = this.f144o;
        bVar2.getClass();
        fw3Var2.getClass();
        Object andSet2 = bVar2.n.getAndSet(h7Var);
        if (!im3.n(andSet2, h7Var)) {
            a aVar2 = new a(andSet2, h7Var, bVar2.p, (byte) 2);
            d dVar2 = bVar2.f142o;
            g7 g7Var2 = dVar2.a;
            if (g7Var2.getThreadChecker().c()) {
                dVar2.e.submit(new io.sentry.android.replay.util.g(new z2(aVar2, b), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar2.a();
                } catch (Throwable th2) {
                    g7Var2.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        m(new Date());
        this.k.set(this.c.c());
    }

    public void o() {
        io.sentry.android.replay.k kVar = this.h;
        io.sentry.android.replay.util.g gVar = new io.sentry.android.replay.util.g(new u4((Object) (kVar != null ? kVar.q() : null), (Object) this, (byte) 13), "BufferCaptureStrategy.stop");
        ScheduledExecutorService scheduledExecutorService = this.d;
        scheduledExecutorService.submit(gVar);
        scheduledExecutorService.submit(new io.sentry.android.replay.util.g(new b5((Object) this, (byte) 16), "CaptureStrategy.stop"));
    }
}
