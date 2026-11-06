package o;

import android.graphics.Point;
import android.widget.Scroller;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class hv4 extends TimerTask {
    public final Scroller m;
    public final Point n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aj4 f1012o;

    public hv4(Scroller scroller, Point point, aj4 aj4Var) {
        scroller.getClass();
        aj4Var.getClass();
        this.m = scroller;
        this.n = point;
        this.f1012o = aj4Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Scroller scroller = this.m;
        if (!scroller.computeScrollOffset()) {
            cancel();
            return;
        }
        Point point = this.n;
        int currX = point.x - scroller.getCurrX();
        float currY = point.y - scroller.getCurrY();
        aj4 aj4Var = this.f1012o;
        aj4Var.c(currX, currY);
        l97 l97Var = aj4Var.e;
        float f = ((v97) l97Var.getValue()).d;
        if (f <= aj4Var.p || f >= aj4Var.q) {
            float f2 = ((v97) l97Var.getValue()).e;
            if (f2 <= aj4Var.r || f2 >= aj4Var.s) {
                ye4.a.b("MultiTouchListenerHybrid", "Finishing fling. Pan limits reached");
                scroller.forceFinished(true);
            }
        }
    }
}
