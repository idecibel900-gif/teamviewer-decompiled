package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class ct2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ dt2 n;

    public /* synthetic */ ct2(dt2 dt2Var, byte b) {
        this.m = b;
        this.n = dt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        dt2 dt2Var = this.n;
        switch (b) {
            case 0:
                ViewParent parent = dt2Var.p.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                dt2Var.d();
                View view = dt2Var.p;
                if (view.isEnabled() && !view.isLongClickable() && dt2Var.f()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    dt2Var.s = true;
                    break;
                }
                break;
        }
    }
}
