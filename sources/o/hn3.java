package o;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hn3 implements o66 {
    public final /* synthetic */ ln3 a;

    public hn3(ln3 ln3Var) {
        this.a = ln3Var;
    }

    @Override // o.o66
    public final void a(MotionEvent motionEvent) {
        ln3 ln3Var = this.a;
        mt8 mt8Var = ln3Var.s;
        ln3Var.x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = ln3Var.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (ln3Var.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(ln3Var.l);
        if (iFindPointerIndex >= 0) {
            ln3Var.i(actionMasked, iFindPointerIndex, motionEvent);
        }
        c76 c76Var = ln3Var.c;
        if (c76Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    ln3Var.q(ln3Var.f1385o, iFindPointerIndex, motionEvent);
                    ln3Var.o(c76Var);
                    ln3Var.r.removeCallbacks(mt8Var);
                    mt8Var.run();
                    ln3Var.r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == ln3Var.l) {
                    ln3Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    ln3Var.q(ln3Var.f1385o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = ln3Var.t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        ln3Var.p(null, 0);
        ln3Var.l = -1;
    }

    @Override // o.o66
    public final boolean b(MotionEvent motionEvent) {
        int iFindPointerIndex;
        ln3 ln3Var = this.a;
        ln3Var.x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        in3 in3Var = null;
        if (actionMasked == 0) {
            ln3Var.l = motionEvent.getPointerId(0);
            ln3Var.d = motionEvent.getX();
            ln3Var.e = motionEvent.getY();
            VelocityTracker velocityTracker = ln3Var.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            ln3Var.t = VelocityTracker.obtain();
            if (ln3Var.c == null) {
                ArrayList arrayList = ln3Var.p;
                if (!arrayList.isEmpty()) {
                    View viewL = ln3Var.l(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        in3 in3Var2 = (in3) arrayList.get(size);
                        if (in3Var2.e.m == viewL) {
                            in3Var = in3Var2;
                            break;
                        }
                    }
                }
                if (in3Var != null) {
                    c76 c76Var = in3Var.e;
                    ln3Var.d -= in3Var.i;
                    ln3Var.e -= in3Var.j;
                    ln3Var.k(c76Var, true);
                    if (ln3Var.a.remove(c76Var.m)) {
                        ln3Var.m.c(ln3Var.r, c76Var);
                    }
                    ln3Var.p(c76Var, in3Var.f);
                    ln3Var.q(ln3Var.f1385o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            ln3Var.l = -1;
            ln3Var.p(null, 0);
        } else {
            int i = ln3Var.l;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                ln3Var.i(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = ln3Var.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return ln3Var.c != null;
    }

    @Override // o.o66
    public final void c(boolean z) {
        if (z) {
            this.a.p(null, 0);
        }
    }
}
