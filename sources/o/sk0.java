package o;

import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements SurfaceHolder.Callback {
    public final /* synthetic */ BarcodeView m;

    public sk0(BarcodeView barcodeView) {
        this.m = barcodeView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            int i4 = uk0.M;
            io.sentry.android.core.v0.c("uk0", "*** WARNING *** surfaceChanged() gave us a null surface!");
        } else {
            x07 x07Var = new x07(i2, i3);
            BarcodeView barcodeView = this.m;
            barcodeView.B = x07Var;
            barcodeView.g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.m.B = null;
    }
}
