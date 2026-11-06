package o;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: loaded from: classes.dex */
public final class if6 extends OrientationEventListener {
    public final /* synthetic */ gy8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if6(gy8 gy8Var, Context context) {
        super(context, 3);
        this.a = gy8Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int rotation;
        gy8 gy8Var = this.a;
        WindowManager windowManager = (WindowManager) gy8Var.c;
        xc0 xc0Var = (xc0) gy8Var.e;
        if (windowManager == null || xc0Var == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == gy8Var.b) {
            return;
        }
        gy8Var.b = rotation;
        ((BarcodeView) xc0Var.n).f2219o.postDelayed(new pc0((Object) xc0Var, (byte) 2), 250L);
    }
}
