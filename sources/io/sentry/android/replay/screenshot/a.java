package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import io.sentry.android.replay.c0;
import io.sentry.f6;
import o.fx3;
import o.iq8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ c n;

    public /* synthetic */ a(c cVar, byte b) {
        this.m = b;
        this.n = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        final c cVar = this.n;
        switch (b) {
            case 0:
                if (cVar.k.get()) {
                    cVar.c.getLogger().g(f6.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture picture = (Picture) cVar.f.getAndSet(null);
                if (picture == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = cVar.m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        picture.draw(canvasLockHardwareCanvas);
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (cVar.e == null) {
                            io.sentry.util.a aVar = cVar.g;
                            aVar.e();
                            try {
                                if (cVar.e == null) {
                                    c0 c0Var = cVar.d;
                                    cVar.e = Bitmap.createBitmap(c0Var.a, c0Var.b, Bitmap.Config.RGB_565);
                                }
                                iq8.l(aVar, null);
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    iq8.l(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        if (cVar.k.get()) {
                            cVar.c.getLogger().g(f6.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = cVar.m;
                        Bitmap bitmap = cVar.e;
                        bitmap.getClass();
                        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i) {
                                c cVar2 = cVar;
                                if (cVar2.k.get()) {
                                    cVar2.c.getLogger().g(f6.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                                    return;
                                }
                                if (i != 0) {
                                    cVar2.c.getLogger().g(f6.ERROR, fx3.e(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                                    cVar2.i.set(false);
                                    return;
                                }
                                cVar2.i.set(true);
                                Bitmap bitmap2 = cVar2.e;
                                if (bitmap2 == null || bitmap2.isRecycled()) {
                                    return;
                                }
                                cVar2.b.x0(bitmap2);
                            }
                        }, cVar.a.q());
                        return;
                    } catch (Throwable th3) {
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    cVar.c.getLogger().d(f6.ERROR, "Canvas Strategy: picture render failed", th4);
                    cVar.i.set(false);
                    return;
                }
            default:
                Bitmap bitmap2 = cVar.e;
                if (bitmap2 != null) {
                    synchronized (bitmap2) {
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        break;
                    }
                }
                cVar.m.release();
                cVar.l.release();
                return;
        }
    }
}
