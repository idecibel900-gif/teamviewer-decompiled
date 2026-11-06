package o;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class lk0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ mk0 n;

    public /* synthetic */ lk0(mk0 mk0Var, byte b) {
        this.m = b;
        this.n = mk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera cameraOpen = null;
        Object x07Var = null;
        switch (this.m) {
            case 0:
                mk0 mk0Var = this.n;
                try {
                    Log.d("mk0", "Opening camera");
                    pk0 pk0Var = mk0Var.c;
                    int iF = wo1.F(pk0Var.g.a);
                    if (iF != -1) {
                        cameraOpen = Camera.open(iF);
                    }
                    pk0Var.a = cameraOpen;
                    if (cameraOpen == null) {
                        hk0.o("Failed to open camera");
                        return;
                    }
                    int iF2 = wo1.F(pk0Var.g.a);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    pk0Var.b = cameraInfo;
                    Camera.getCameraInfo(iF2, cameraInfo);
                    return;
                } catch (Exception e) {
                    Handler handler = mk0Var.d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                    }
                    io.sentry.android.core.v0.d("mk0", "Failed to open camera", e);
                    return;
                }
            case 1:
                mk0 mk0Var2 = this.n;
                pk0 pk0Var2 = mk0Var2.c;
                try {
                    Log.d("mk0", "Configuring camera");
                    pk0Var2.b();
                    Handler handler2 = mk0Var2.d;
                    if (handler2 != null) {
                        x07 x07Var2 = pk0Var2.j;
                        if (x07Var2 != null) {
                            int i = pk0Var2.k;
                            if (i == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            x07Var = i % 180 != 0 ? new x07(x07Var2.n, x07Var2.m) : x07Var2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, x07Var).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    Handler handler3 = mk0Var2.d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                    }
                    io.sentry.android.core.v0.d("mk0", "Failed to configure camera", e2);
                    return;
                }
            case 2:
                mk0 mk0Var3 = this.n;
                pk0 pk0Var3 = mk0Var3.c;
                try {
                    Log.d("mk0", "Starting preview");
                    wk0 wk0Var = mk0Var3.b;
                    Camera camera = pk0Var3.a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) wk0Var.n;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) wk0Var.f2420o);
                    }
                    pk0Var3.e();
                    return;
                } catch (Exception e3) {
                    Handler handler4 = mk0Var3.d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e3).sendToTarget();
                    }
                    io.sentry.android.core.v0.d("mk0", "Failed to start preview", e3);
                    return;
                }
            default:
                try {
                    Log.d("mk0", "Closing camera");
                    pk0 pk0Var4 = this.n.c;
                    sz szVar = pk0Var4.c;
                    if (szVar != null) {
                        szVar.c();
                        pk0Var4.c = null;
                    }
                    if (pk0Var4.d != null) {
                        pk0Var4.d = null;
                    }
                    Camera camera2 = pk0Var4.a;
                    if (camera2 != null && pk0Var4.e) {
                        camera2.stopPreview();
                        pk0Var4.l.a = null;
                        pk0Var4.e = false;
                    }
                    pk0 pk0Var5 = this.n.c;
                    Camera camera3 = pk0Var5.a;
                    if (camera3 != null) {
                        camera3.release();
                        pk0Var5.a = null;
                    }
                    break;
                } catch (Exception e4) {
                    io.sentry.android.core.v0.d("mk0", "Failed to close camera", e4);
                }
                mk0 mk0Var4 = this.n;
                mk0Var4.g = true;
                mk0Var4.d.sendEmptyMessage(R.id.zxing_camera_closed);
                gy8 gy8Var = this.n.a;
                synchronized (gy8Var.e) {
                    int i2 = gy8Var.b - 1;
                    gy8Var.b = i2;
                    if (i2 == 0) {
                        synchronized (gy8Var.e) {
                            ((HandlerThread) gy8Var.d).quit();
                            gy8Var.d = null;
                            gy8Var.c = null;
                        }
                    }
                    break;
                }
                return;
        }
    }
}
