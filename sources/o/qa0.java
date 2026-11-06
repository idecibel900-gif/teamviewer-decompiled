package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class qa0 implements pa0, gl8 {
    public static final qa0 m = new qa0();
    public static final qa0 n = new qa0();

    @Override // o.gl8
    public cl8 c(Context context, jn1 jn1Var) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new cl8(bounds, f);
    }

    @Override // o.gl8
    public cl8 h(Activity activity, jn1 jn1Var) {
        pa0.a.getClass();
        return new cl8(new ma0(oa0.a().q(activity)), jn1Var.W(activity));
    }

    @Override // o.pa0
    public Rect q(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
