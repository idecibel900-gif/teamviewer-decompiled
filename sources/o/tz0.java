package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class tz0 implements ScrollCaptureCallback {
    public final fp6 a;
    public final zk3 b;
    public final tj6 c;
    public final AndroidComposeView d;
    public final fc1 e;
    public final c63 f;

    public tz0(fp6 fp6Var, zk3 zk3Var, fc1 fc1Var, tj6 tj6Var, AndroidComposeView androidComposeView) {
        this.a = fp6Var;
        this.b = zk3Var;
        this.c = tj6Var;
        this.d = androidComposeView;
        this.e = new fc1(fc1Var.m.H0(s12.n));
        this.f = new c63(zk3Var.c(), new jv7(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, zk3 zk3Var, jc1 jc1Var) {
        sz0 sz0Var;
        int i;
        int i2;
        zk3 zk3Var2;
        int i3;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        int iV;
        int iV2;
        zk3 zk3VarA;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (jc1Var instanceof sz0) {
            sz0Var = (sz0) jc1Var;
            int i7 = sz0Var.s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                sz0Var.s = i7 - Integer.MIN_VALUE;
            } else {
                sz0Var = new sz0(this, jc1Var);
            }
        } else {
            sz0Var = new sz0(this, jc1Var);
        }
        Object obj = sz0Var.q;
        int i8 = sz0Var.s;
        c63 c63Var = this.f;
        ne1 ne1Var = ne1.m;
        if (i8 == 0) {
            ct1.a0(obj);
            i = zk3Var.b;
            i2 = zk3Var.d;
            sz0Var.m = scrollCaptureSession;
            sz0Var.n = zk3Var;
            sz0Var.f2067o = i;
            sz0Var.p = i2;
            sz0Var.s = 1;
            if (i > i2) {
                c63Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = c63Var.a;
            if (i9 > i10) {
                gk0.h(ua5.l("Expected range (", i9, i10, ") to be ≤ viewportSize="));
                return null;
            }
            Object objB = c63Var.b((((i9 / 2) + i) - (i10 / 2)) - c63Var.b, sz0Var);
            Object obj2 = f88.a;
            if (objB != ne1Var) {
                objB = obj2;
            }
            if (objB == ne1Var) {
                obj2 = objB;
            }
            if (obj2 != ne1Var) {
            }
            return ne1Var;
        }
        if (i8 == 1) {
            int i11 = sz0Var.p;
            int i12 = sz0Var.f2067o;
            zk3 zk3Var3 = sz0Var.n;
            ScrollCaptureSession scrollCaptureSessionH = gh.h(sz0Var.m);
            ct1.a0(obj);
            i = i12;
            zk3Var = zk3Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionH;
        } else {
            if (i8 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = sz0Var.p;
            i3 = sz0Var.f2067o;
            zk3 zk3Var4 = sz0Var.n;
            ScrollCaptureSession scrollCaptureSessionH2 = gh.h(sz0Var.m);
            ct1.a0(obj);
            scrollCaptureSession2 = scrollCaptureSessionH2;
            zk3Var2 = zk3Var4;
        }
        iV = ct1.v(i3 - vn4.s0(c63Var.b), 0, c63Var.a);
        iV2 = ct1.v(i4 - vn4.s0(c63Var.b), 0, c63Var.a);
        zk3VarA = zk3.a(zk3Var2, 0, iV, 0, iV2, 5);
        i5 = zk3VarA.b;
        i6 = zk3VarA.a;
        if (iV == iV2) {
            return zk3.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i6, -i5);
            zk3 zk3Var5 = this.b;
            canvasLockHardwareCanvas.translate(-zk3Var5.a, -zk3Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iS0 = vn4.s0(c63Var.b);
            return new zk3(i6, i5 + iS0, zk3VarA.c, zk3VarA.d + iS0);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        px pxVar = new px((byte) 26);
        sz0Var.m = scrollCaptureSession;
        sz0Var.n = zk3Var;
        sz0Var.f2067o = i;
        sz0Var.p = i2;
        sz0Var.s = 2;
        if (qs1.O(sz0Var.getContext()).a(pxVar, sz0Var) != ne1Var) {
            zk3Var2 = zk3Var;
            i3 = i;
            scrollCaptureSession2 = scrollCaptureSession;
            i4 = i2;
            iV = ct1.v(i3 - vn4.s0(c63Var.b), 0, c63Var.a);
            iV2 = ct1.v(i4 - vn4.s0(c63Var.b), 0, c63Var.a);
            zk3VarA = zk3.a(zk3Var2, 0, iV, 0, iV2, 5);
            i5 = zk3VarA.b;
            i6 = zk3VarA.a;
            if (iV == iV2) {
                return zk3.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i6, -i5);
            zk3 zk3Var6 = this.b;
            canvasLockHardwareCanvas.translate(-zk3Var6.a, -zk3Var6.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iS1 = vn4.s0(c63Var.b);
            return new zk3(i6, i5 + iS1, zk3VarA.c, zk3VarA.d + iS1);
        }
        return ne1Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        im3.R(this.e, q45.n, null, new h0((Object) this, (Object) runnable, (hc1) null, (byte) 21), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        n87 n87VarR = im3.R(this.e, null, null, new bj(this, scrollCaptureSession, rect, consumer, null, (byte) 3), 3);
        n87VarR.o0(new q0(cancellationSignal, (byte) 23));
        cancellationSignal.setOnCancelListener(new uz0(n87VarR, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ds1.j0(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
