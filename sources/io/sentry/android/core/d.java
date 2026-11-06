package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.f6;
import io.sentry.g7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import o.bc7;
import o.d11;
import o.ea6;
import o.ep3;
import o.ex5;
import o.ez3;
import o.fp1;
import o.fx3;
import o.fz3;
import o.gu3;
import o.hk0;
import o.id2;
import o.ip;
import o.iu3;
import o.j93;
import o.js0;
import o.ns0;
import o.ns4;
import o.oc2;
import o.qs4;
import o.rk5;
import o.s67;
import o.sy4;
import o.tg6;
import o.to7;
import o.u51;
import o.ub7;
import o.wj5;
import o.xz6;
import o.yc4;
import o.z06;
import o.z77;
import o.zq4;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ez3, ex5 {
    public static d t;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f100o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    public d(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.m = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f100o = map;
        this.p = str;
        this.q = str2;
        this.r = xz6.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.n = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            io.sentry.h2.f();
            throw null;
        }
    }

    @Override // o.ez3
    public void a() {
        d11 d11Var = (d11) this.f100o;
        js0 js0Var = (js0) this.q;
        HashMap map = (HashMap) this.n;
        boolean zF = false;
        if (js0Var.equals(z77.b)) {
            Object obj = map.get(sy4.e("value"));
            iu3 iu3Var = obj instanceof iu3 ? (iu3) obj : null;
            if (iu3Var != null) {
                Object obj2 = iu3Var.a;
                gu3 gu3Var = obj2 instanceof gu3 ? (gu3) obj2 : null;
                if (gu3Var != null) {
                    zF = d11Var.F(gu3Var.a.a);
                }
            }
        }
        if (zF || d11Var.F(js0Var)) {
            return;
        }
        ((List) this.r).add(new ip(((ns4) this.p).W(), map, (s67) this.s));
    }

    public void b(Activity activity) {
        io.sentry.util.a aVar = (io.sentry.util.a) this.s;
        aVar.e();
        try {
            if (!j()) {
                aVar.close();
                return;
            }
            m(new b(this, activity, (byte) 0), "FrameMetricsAggregator.add");
            c cVarC = c();
            if (cVarC != null) {
                ((WeakHashMap) this.q).put(activity, cVarC);
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

    public c c() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!j() || !((Boolean) ((io.sentry.util.h) this.n).a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((io.sentry.util.h) this.m).a()).a.c;
        int i3 = 0;
        if (sparseIntArrayArr == null || sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new c(i3, i, i2);
    }

    public void d(boolean z) {
        ByteBuffer byteBuffer;
        io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) this.r;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.q;
        MediaCodec mediaCodec = (MediaCodec) this.f100o;
        g7 g7Var = (g7) this.m;
        if (g7Var.getSessionReplay().m) {
            g7Var.getLogger().g(f6.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        if (z) {
            if (g7Var.getSessionReplay().m) {
                g7Var.getLogger().g(f6.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        int i = 0;
        do {
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = mediaCodec.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    if (bVar.c) {
                        hk0.o("format changed twice");
                        return;
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    outputFormat.getClass();
                    if (g7Var.getSessionReplay().m) {
                        g7Var.getLogger().g(f6.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    }
                    MediaMuxer mediaMuxer = bVar.b;
                    bVar.d = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    bVar.c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    if (g7Var.getSessionReplay().m) {
                        g7Var.getLogger().g(f6.DEBUG, fx3.e(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                    }
                    i++;
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                        hk0.o(fx3.f(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                        return;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        if (g7Var.getSessionReplay().m) {
                            g7Var.getLogger().g(f6.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        }
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!bVar.c) {
                            hk0.o("muxer hasn't started");
                            return;
                        }
                        long j = bVar.a;
                        int i2 = bVar.e;
                        bVar.e = i2 + 1;
                        long j2 = j * ((long) i2);
                        bVar.f = j2;
                        bufferInfo.presentationTimeUs = j2;
                        bVar.b.writeSampleData(bVar.d, byteBuffer, bufferInfo);
                        if (g7Var.getSessionReplay().m) {
                            g7Var.getLogger().g(f6.DEBUG, to7.l(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (g7Var.getSessionReplay().m) {
                            if (z) {
                                g7Var.getLogger().g(f6.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                return;
                            } else {
                                g7Var.getLogger().g(f6.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                }
                i = 0;
            } else {
                if (!z) {
                    return;
                }
                i++;
                if (g7Var.getSessionReplay().m) {
                    g7Var.getLogger().g(f6.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            }
        } while (i < 10);
        g7Var.getLogger().g(f6.WARNING, fx3.f(i, "[Encoder]: encoder made no progress for ", " iterations, dropping the remaining frames"), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    public void e(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (ub7.Q(str, "xiaomi", true) || ub7.Q(str, "motorola", true)) {
            surface = (Surface) this.s;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            io.sentry.android.replay.util.h hVar = io.sentry.android.replay.util.h.SOC_MANUFACTURER;
            if (io.sentry.android.replay.util.j.a(hVar).equalsIgnoreCase("spreadtrum") || io.sentry.android.replay.util.j.a(hVar).equalsIgnoreCase("unisoc")) {
                surface = (Surface) this.s;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = (Surface) this.s;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = (Surface) this.s;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        d(false);
    }

    @Override // o.ez3
    public void f(sy4 sy4Var, ns0 ns0Var) {
        ((HashMap) this.n).put(sy4Var, new iu3(new gu3(ns0Var)));
    }

    @Override // o.ez3
    public void g(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
        ((HashMap) this.n).put(sy4Var, new oc2(js0Var, sy4Var2));
    }

    @Override // o.ex5
    public Object get() {
        return new fp1((Context) ((ex5) this.m).get(), (zq4) ((ex5) this.n).get(), (tg6) ((ex5) this.f100o).get(), (ep3) ((ep3) this.p).get(), (Executor) ((ex5) this.q).get(), (tg6) ((ex5) this.r).get(), new rk5((byte) 17), new wj5((byte) 16), (tg6) ((ex5) this.s).get());
    }

    @Override // o.ez3
    public void h(sy4 sy4Var, Object obj) {
        u51 u51VarP = z06.p(obj, (qs4) ((d11) this.m).f578o);
        if (u51VarP == null) {
            u51VarP = new id2("Unsupported annotation argument: " + sy4Var);
        }
        ((HashMap) this.n).put(sy4Var, u51VarP);
    }

    public void i(ea6 ea6Var) {
        if (ea6Var == ea6.m) {
            this.m = "\\";
            this.n = "\\\\";
            this.f100o = "\\:\\\\";
            this.p = ":\\";
            this.q = ":";
            this.r = "\\\\";
            return;
        }
        if (ea6Var == ea6.n) {
            this.m = "/";
            this.n = "/";
            this.f100o = "";
            this.p = "/";
            this.q = "";
        }
    }

    public boolean j() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f100o;
        return ((Boolean) ((io.sentry.util.h) this.n).a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public boolean k(String str) {
        str.getClass();
        return ((ea6) this.s) == ea6.m && bc7.N(false, str, (String) this.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public void l() {
        io.sentry.android.replay.video.b logger = (io.sentry.android.replay.video.b) this.r;
        String str = "Failed to release Surface";
        String str2 = "Failed to release MediaCodec";
        MediaCodec mediaCodec = (MediaCodec) this.f100o;
        g7 g7Var = (g7) this.m;
        try {
            d(true);
            mediaCodec.stop();
        } catch (RuntimeException e) {
            g7Var.getLogger().d(f6.DEBUG, "Failed to properly release video encoder", e);
        } finally {
            try {
                mediaCodec.release();
            } catch (RuntimeException e2) {
                g7Var.getLogger().d(f6.DEBUG, str2, e2);
            }
            try {
                Surface surface = (Surface) this.s;
                if (surface != null) {
                    surface.release();
                }
            } catch (RuntimeException e3) {
                g7Var.getLogger().d(f6.DEBUG, str, e3);
            }
            try {
                logger.a();
            } catch (RuntimeException e4) {
                g7Var.getLogger().d(f6.DEBUG, "Failed to release MediaMuxer", e4);
            }
        }
    }

    public void m(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.g.a.c()) {
                runnable.run();
                return;
            }
            w0 w0Var = (w0) this.r;
            ((Handler) w0Var.a).post(new d2(this, runnable, str, (byte) 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f100o).getLogger().g(f6.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    @Override // o.ez3
    public fz3 s(sy4 sy4Var) {
        return new j93((d11) this.m, sy4Var, this);
    }

    @Override // o.ez3
    public ez3 w(js0 js0Var, sy4 sy4Var) {
        ArrayList arrayList = new ArrayList();
        d dVarH = ((d11) this.m).H(js0Var, s67.h, arrayList);
        yc4 yc4Var = new yc4();
        yc4Var.n = dVarH;
        yc4Var.f2598o = this;
        yc4Var.q = sy4Var;
        yc4Var.p = arrayList;
        yc4Var.m = dVarH;
        return yc4Var;
    }
}
