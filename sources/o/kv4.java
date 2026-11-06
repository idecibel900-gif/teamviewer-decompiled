package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class kv4 implements zb3 {
    public final Scroller m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1307o;
    public aj4 p;
    public c1 q;
    public boolean r;
    public iv4 s = iv4.m;
    public Timer t;
    public final GestureDetector u;
    public final ScaleGestureDetector v;

    public kv4(RemoteControlApplication remoteControlApplication) {
        this.m = new Scroller(remoteControlApplication, null);
        this.n = (int) (15.0f * remoteControlApplication.getResources().getDisplayMetrics().density);
        ko0 ko0Var = new ko0(this, (byte) 5);
        jv4 jv4Var = new jv4(this);
        this.u = new GestureDetector(remoteControlApplication, ko0Var);
        this.v = new ScaleGestureDetector(remoteControlApplication, jv4Var);
    }

    @Override // o.zb3
    public final void a(c1 c1Var) {
        this.q = c1Var;
    }

    @Override // o.zb3
    public final void b(na3 na3Var) {
        this.p = (aj4) na3Var;
    }

    @Override // o.zb3
    public final void c(j97 j97Var) {
        j97Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    public final void d(MotionEvent motionEvent) {
        c1 c1Var;
        int pointerCount = motionEvent.getPointerCount();
        int actionMasked = motionEvent.getActionMasked();
        for (int i = 0; i < pointerCount; i++) {
            int x = (int) motionEvent.getX(i);
            int y = (int) motionEvent.getY(i);
            int pointerId = motionEvent.getPointerId(i);
            int i2 = 2;
            if (actionMasked == 0) {
                if (((actionMasked == 5 && actionMasked != 6) || motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8) == pointerId) && (c1Var = this.q) != null) {
                    c1Var.j(pointerId + 1, x, y, i2, pointerCount);
                }
            } else if (actionMasked == 1) {
                i2 = 1;
                if (actionMasked == 5) {
                }
            } else {
                if (actionMasked == 2) {
                    i2 = 4;
                } else if (actionMasked == 3) {
                    i2 = 8;
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        i2 = 1;
                    }
                }
                if (actionMasked == 5) {
                }
            }
        }
    }

    @Override // o.zb3
    public final void destroy() {
        this.m.forceFinished(true);
        Timer timer = this.t;
        if (timer != null) {
            timer.cancel();
            timer.purge();
            this.t = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        if (this.p != null) {
            this.p = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.r) {
            d(motionEvent);
            return true;
        }
        iv4 iv4Var = this.s;
        iv4 iv4Var2 = iv4.n;
        iv4 iv4Var3 = iv4.m;
        ScaleGestureDetector scaleGestureDetector = this.v;
        if (iv4Var == iv4Var2) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            d(motionEvent);
            if (motionEvent.getAction() == 1) {
                this.s = iv4Var3;
            }
            return true;
        }
        if (iv4Var == iv4.p && motionEvent.getAction() == 1) {
            this.s = iv4Var3;
        }
        if (motionEvent.getAction() == 1) {
            this.f1307o = false;
        }
        return this.u.onTouchEvent(motionEvent) | scaleGestureDetector.onTouchEvent(motionEvent);
    }
}
