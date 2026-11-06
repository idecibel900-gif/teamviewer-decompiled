package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.a0;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.k0;
import io.sentry.f6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.ds1;
import o.l54;
import o.u14;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l {
    public final k0 a;
    public final ReplayIntegration b;
    public final SentryAndroidOptions c;
    public final c0 d;
    public volatile Bitmap e;
    public final AtomicReference f;
    public final io.sentry.util.a g;
    public final u14 h;
    public final AtomicBoolean i;
    public final m j;
    public final AtomicBoolean k;
    public final SurfaceTexture l;
    public final Surface m;
    public final a n;

    public c(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, c0 c0Var, k0 k0Var) {
        k0Var.getClass();
        this.a = k0Var;
        this.b = replayIntegration;
        this.c = sentryAndroidOptions;
        this.d = c0Var;
        this.f = new AtomicReference(null);
        this.g = new io.sentry.util.a();
        this.h = ds1.X(l54.n, new a0(this, (byte) 1));
        this.i = new AtomicBoolean(false);
        this.j = new m();
        this.k = new AtomicBoolean(false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(c0Var.a, c0Var.b);
        this.l = surfaceTexture;
        this.m = new Surface(surfaceTexture);
        io.sentry.util.b.a("ReplayCanvasStrategy");
        this.n = new a(this, (byte) 0);
    }

    @Override // io.sentry.android.replay.screenshot.l
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.l
    public final void b(View view) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        c0 c0Var = this.d;
        Canvas canvasBeginRecording = picture.beginRecording(c0Var.a, c0Var.b);
        canvasBeginRecording.getClass();
        m mVar = this.j;
        mVar.getClass();
        mVar.a = canvasBeginRecording;
        mVar.setMatrix((Matrix) this.h.getValue());
        view.draw(mVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f.set(picture);
        d(this.a.q(), new io.sentry.android.replay.util.g(this.n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.l
    public final void c() {
        Bitmap bitmap;
        if (!this.i.get() || (bitmap = this.e) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.x0(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.l
    public final void close() {
        this.k.set(true);
        d(this.a.q(), new io.sentry.android.replay.util.g(new a(this, (byte) 1), "CanvasStrategy.close"));
        this.f.getAndSet(null);
    }

    public final void d(Handler handler, io.sentry.android.replay.util.g gVar) {
        try {
            handler.post(gVar);
        } catch (Throwable th) {
            this.c.getLogger().d(f6.ERROR, "Canvas Strategy: failed to post runnable ".concat(gVar.m), th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public final void onContentChanged() {
    }
}
