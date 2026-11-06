package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.n;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.a0;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.k0;
import io.sentry.f6;
import io.sentry.m7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.ad2;
import o.ap;
import o.cc;
import o.cj3;
import o.dd5;
import o.dg2;
import o.ds1;
import o.es0;
import o.j93;
import o.jk0;
import o.kc1;
import o.l54;
import o.o35;
import o.p35;
import o.ps4;
import o.qf0;
import o.rk5;
import o.rl5;
import o.u14;
import o.vm2;
import o.wl1;
import o.xd4;
import o.xk1;
import o.xz2;
import o.yr0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f168o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;

    public k(k0 k0Var, ReplayIntegration replayIntegration, SentryAndroidOptions sentryAndroidOptions, c0 c0Var, io.sentry.android.replay.util.b bVar, a0 a0Var) {
        k0Var.getClass();
        this.a = replayIntegration;
        this.b = sentryAndroidOptions;
        this.c = c0Var;
        this.d = a0Var;
        this.e = k0Var.q;
        this.f = k0Var.p;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0Var.a, c0Var.b, sentryAndroidOptions.getSessionReplay().f208o ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        this.g = bitmapCreateBitmap;
        j jVar = new j(this, (byte) 0);
        l54 l54Var = l54.n;
        this.h = ds1.X(l54Var, jVar);
        this.k = new AtomicBoolean(false);
        this.f168o = new io.sentry.android.replay.util.e();
        this.l = new AtomicBoolean(false);
        this.p = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.i = ds1.X(l54Var, i.n);
        this.j = ds1.X(l54Var, new j(this, (byte) 1));
        this.q = new Rect();
        this.r = new RectF();
        this.s = new int[2];
        this.t = new int[2];
    }

    public static final void f(AtomicInteger atomicInteger, final k kVar, final View view, final h[] hVarArr, final io.sentry.android.replay.viewhierarchy.g gVar, final int i, final int i2, final boolean z) {
        if (atomicInteger.decrementAndGet() == 0 && ((ScheduledExecutorService) kVar.e).submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.screenshot.g
            /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int i4;
                k kVar2 = this.m;
                int i5 = i;
                int i6 = i2;
                View view2 = view;
                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                boolean z2 = z;
                try {
                    boolean z3 = ((AtomicBoolean) kVar2.m).get();
                    h[] hVarArr2 = hVarArr;
                    if (!z3 && !((Bitmap) kVar2.g).isRecycled()) {
                        int i7 = 0;
                        for (int length = hVarArr2.length; i7 < length; length = length) {
                            h hVar = hVarArr2[i7];
                            if (hVar != null) {
                                Bitmap bitmap = (Bitmap) hVar.f166o;
                                if (bitmap.isRecycled()) {
                                    i3 = i5;
                                    i4 = i6;
                                } else {
                                    Canvas canvas = (Canvas) ((u14) kVar2.j).getValue();
                                    Paint paint = (Paint) ((u14) kVar2.i).getValue();
                                    Rect rect = (Rect) kVar2.q;
                                    RectF rectF = (RectF) kVar2.r;
                                    int i8 = hVar.m;
                                    int i9 = hVar.n;
                                    i3 = i5;
                                    c0 c0Var = (c0) kVar2.c;
                                    i4 = i6;
                                    float f = c0Var.c;
                                    float f2 = c0Var.d;
                                    canvas.getClass();
                                    paint.getClass();
                                    rect.getClass();
                                    rectF.getClass();
                                    float f3 = (i8 - i3) * f;
                                    float f4 = (i9 - i4) * f2;
                                    rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    rectF.set(f3, f4, (bitmap.getWidth() * f) + f3, (bitmap.getHeight() * f2) + f4);
                                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                                    bitmap.recycle();
                                }
                            } else {
                                i3 = i5;
                                i4 = i6;
                            }
                            i7++;
                            i5 = i3;
                            i6 = i4;
                        }
                        kVar2.d(view2, gVar2, z2);
                        kVar2.h();
                        return;
                    }
                    ((SentryAndroidOptions) kVar2.b).getLogger().g(f6.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
                    for (h hVar2 : hVarArr2) {
                        if (hVar2 != null) {
                            Bitmap bitmap2 = (Bitmap) hVar2.f166o;
                            if (!bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                        }
                    }
                    kVar2.h();
                } catch (Throwable th) {
                    kVar2.h();
                    throw th;
                }
            }
        }, "screenshot_recorder.composite")) == null) {
            for (h hVar : hVarArr) {
                if (hVar != null) {
                    Bitmap bitmap = (Bitmap) hVar.f166o;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
            kVar.h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public boolean a() {
        return ((AtomicBoolean) this.k).get();
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void b(View view) throws IllegalAccessException {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        Window windowT = io.sentry.config.a.t(view);
        if (windowT == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        byte b = 1;
        if (!((AtomicBoolean) this.n).compareAndSet(false, true)) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "PixelCopyStrategy capture is already in flight, skipping", new Object[0]);
            ((a0) this.d).a();
            return;
        }
        if (((AtomicBoolean) this.m).get()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            h();
            return;
        }
        try {
            ((AtomicBoolean) this.l).set(false);
            PixelCopy.request(windowT, (Bitmap) this.g, new n(this, view, b), (Handler) ((m7) this.f).n);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to capture replay recording", th);
            ((AtomicInteger) this.p).set(0);
            ((AtomicBoolean) this.k).set(false);
            h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void c() {
        byte b = 1;
        if (((AtomicBoolean) this.n).compareAndSet(false, true)) {
            if (!((AtomicBoolean) this.k).get() || ((Bitmap) this.g).isRecycled()) {
                h();
            } else if (((ScheduledExecutorService) this.e).submit(new io.sentry.android.replay.util.g(new d(this, b), "PixelCopyStrategy.emit")) == null) {
                h();
            }
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void close() {
        ((AtomicBoolean) this.m).set(true);
        ((AtomicInteger) this.p).set(0);
        g();
    }

    public void d(View view, io.sentry.android.replay.viewhierarchy.g gVar, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        Bitmap bitmap = (Bitmap) this.g;
        if (((AtomicBoolean) this.m).get() || bitmap.isRecycled()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        ((io.sentry.android.replay.util.e) this.f168o).e(bitmap, gVar, (Matrix) ((u14) this.h).getValue());
        sentryAndroidOptions.getReplayController().getClass();
        ((ReplayIntegration) this.a).x0(bitmap);
        ((AtomicBoolean) this.k).set(true);
        ((AtomicBoolean) this.l).set(false);
        if (z) {
            ((AtomicInteger) this.p).set(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    public void e(final View view, ArrayList arrayList, final io.sentry.android.replay.viewhierarchy.g gVar, final boolean z) {
        h[] hVarArr;
        final k kVar;
        SurfaceHolder holder;
        k kVar2 = this;
        int[] iArr = (int[]) kVar2.t;
        int[] iArr2 = (int[]) kVar2.s;
        view.getLocationOnScreen(iArr2);
        char c = 0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        h[] hVarArr2 = new h[arrayList.size()];
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        final h[] hVarArr3 = hVarArr2;
        final int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            SurfaceView surfaceView = (SurfaceView) ((io.sentry.android.replay.viewhierarchy.e) it.next()).h.get();
            final Bitmap bitmapCreateBitmap = null;
            Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
            if (surfaceView == null || surface == null) {
                kVar2 = this;
            } else {
                if (surface.isValid()) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                        try {
                            surfaceView.getLocationOnScreen(iArr);
                            try {
                                final int i5 = iArr[c];
                                final int i6 = i;
                                try {
                                    final int i7 = iArr[1];
                                    final int i8 = i2;
                                    final AtomicInteger atomicInteger2 = atomicInteger;
                                    kVar = this;
                                    try {
                                        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.f
                                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                            public final void onPixelCopyFinished(int i9) {
                                                k kVar3 = this.a;
                                                boolean z2 = ((AtomicBoolean) kVar3.m).get();
                                                Bitmap bitmap = bitmapCreateBitmap;
                                                h[] hVarArr4 = hVarArr3;
                                                AtomicInteger atomicInteger3 = atomicInteger2;
                                                View view2 = view;
                                                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                                                int i10 = i6;
                                                int i11 = i8;
                                                boolean z3 = z;
                                                if (z2) {
                                                    bitmap.recycle();
                                                    k.f(atomicInteger3, kVar3, view2, hVarArr4, gVar2, i10, i11, z3);
                                                    return;
                                                }
                                                if (i9 == 0) {
                                                    bitmap.getClass();
                                                    h hVar = new h();
                                                    hVar.f166o = bitmap;
                                                    hVar.m = i5;
                                                    hVar.n = i7;
                                                    hVarArr4[i3] = hVar;
                                                } else {
                                                    bitmap.recycle();
                                                    ((SentryAndroidOptions) kVar3.b).getLogger().g(f6.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i9));
                                                }
                                                k.f(atomicInteger3, kVar3, view2, hVarArr4, gVar2, i10, i11, z3);
                                            }
                                        };
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                        try {
                                            PixelCopy.request(surfaceView, bitmapCreateBitmap, onPixelCopyFinishedListener, (Handler) ((m7) kVar.f).n);
                                            atomicInteger = atomicInteger;
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmapCreateBitmap = bitmapCreateBitmap;
                                            ((SentryAndroidOptions) kVar.b).getLogger().d(f6.WARNING, "Failed to capture SurfaceView", th);
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            k kVar3 = kVar;
                                            atomicInteger = atomicInteger;
                                            hVarArr = hVarArr3;
                                            f(atomicInteger, kVar3, view, hVarArr, gVar, i, i2, z);
                                            hVarArr3 = hVarArr;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i6;
                                    kVar = this;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    ((SentryAndroidOptions) kVar.b).getLogger().d(f6.WARNING, "Failed to capture SurfaceView", th);
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    k kVar4 = kVar;
                                    atomicInteger = atomicInteger;
                                    hVarArr = hVarArr3;
                                    f(atomicInteger, kVar4, view, hVarArr, gVar, i, i2, z);
                                    hVarArr3 = hVarArr;
                                    c = 0;
                                    kVar2 = this;
                                    i3 = i4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            atomicInteger = atomicInteger;
                            kVar = kVar2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        atomicInteger = atomicInteger;
                        kVar = kVar2;
                    }
                    c = 0;
                    kVar2 = this;
                    i3 = i4;
                }
                hVarArr3 = hVarArr;
                c = 0;
                kVar2 = this;
                i3 = i4;
            }
            hVarArr = hVarArr3;
            f(atomicInteger, kVar2, view, hVarArr, gVar, i, i2, z);
            hVarArr3 = hVarArr;
            c = 0;
            kVar2 = this;
            i3 = i4;
        }
    }

    public void g() {
        byte b = 0;
        if (((AtomicBoolean) this.n).compareAndSet(false, true)) {
            io.sentry.android.replay.util.g gVar = new io.sentry.android.replay.util.g(new d(this, b), "PixelCopyStrategy.close");
            if (((ScheduledExecutorService) this.e).submit(gVar) == null) {
                gVar.run();
            }
        }
    }

    public void h() {
        ((AtomicBoolean) this.n).set(false);
        if (((AtomicBoolean) this.m).get()) {
            g();
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void onContentChanged() {
        ((AtomicBoolean) this.l).set(true);
    }

    public k(xd4 xd4Var, ps4 ps4Var, yr0 yr0Var, ap apVar, dd5 dd5Var, ad2 ad2Var, vm2 vm2Var, Iterable iterable, j93 j93Var, cc ccVar, rl5 rl5Var, dg2 dg2Var, p35 p35Var, rk5 rk5Var, List list, xz2 xz2Var) {
        jk0 jk0Var = jk0.v;
        jk0 jk0Var2 = jk0.C;
        xz2 xz2Var2 = xz2.O;
        ps4Var.getClass();
        dg2Var.getClass();
        p35Var.getClass();
        xz2Var.getClass();
        this.a = xd4Var;
        this.b = ps4Var;
        this.c = jk0Var;
        this.d = yr0Var;
        this.e = apVar;
        this.f = dd5Var;
        this.g = jk0Var2;
        this.h = ad2Var;
        this.i = xz2Var2;
        this.j = vm2Var;
        this.k = iterable;
        this.l = j93Var;
        this.m = kc1.a;
        this.n = ccVar;
        this.f168o = rl5Var;
        this.p = dg2Var;
        this.q = p35Var;
        this.r = list;
        this.s = xz2Var;
        this.t = new es0(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(xd4 xd4Var, ps4 ps4Var, xk1 xk1Var, cj3 cj3Var, dd5 dd5Var, Iterable iterable, j93 j93Var, cc ccVar, rl5 rl5Var, dg2 dg2Var, p35 p35Var, rk5 rk5Var, int i) {
        p35 p35Var2;
        jk0 jk0Var = jk0.x;
        xz2 xz2Var = xz2.N;
        if ((i & 65536) != 0) {
            p35.b.getClass();
            p35Var2 = o35.b;
        } else {
            p35Var2 = p35Var;
        }
        this(xd4Var, ps4Var, xk1Var, cj3Var, dd5Var, ad2.e, jk0Var, iterable, j93Var, ccVar, rl5Var, dg2Var, p35Var2, rk5Var, qf0.K(wl1.a), (i & 524288) != 0 ? xz2.K : xz2Var);
    }
}
