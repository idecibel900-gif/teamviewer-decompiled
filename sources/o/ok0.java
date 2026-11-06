package o;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 implements Camera.PreviewCallback {
    public xc0 a;
    public x07 b;
    public final /* synthetic */ pk0 c;

    public ok0(pk0 pk0Var) {
        this.c = pk0Var;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        x07 x07Var = this.b;
        xc0 xc0Var = this.a;
        if (x07Var == null || xc0Var == null) {
            Log.d("pk0", "Got preview callback, but no handler or resolution available");
            if (xc0Var != null) {
                new Exception("No resolution available");
                xc0Var.S();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            r67 r67Var = new r67(bArr, x07Var.m, x07Var.n, camera.getParameters().getPreviewFormat(), this.c.k);
            if (this.c.b.facing == 1) {
                r67Var.e = true;
            }
            synchronized (((o10) xc0Var.n).h) {
                try {
                    o10 o10Var = (o10) xc0Var.n;
                    if (o10Var.a) {
                        ((Handler) o10Var.d).obtainMessage(R.id.zxing_decode, r67Var).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            io.sentry.android.core.v0.d("pk0", "Camera preview failed", e);
            xc0Var.S();
        }
    }
}
