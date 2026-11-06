package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class kn1 implements jn1, gl8 {
    public static final kn1 m = new kn1();
    public static final kn1 n = new kn1();

    @Override // o.jn1
    public float W(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // o.gl8
    public cl8 c(Context context, jn1 jn1Var) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new cl8(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // o.gl8
    public cl8 h(Activity activity, jn1 jn1Var) {
        pa0.a.getClass();
        return new cl8(new ma0(oa0.a().q(activity)), jn1Var.W(activity));
    }
}
