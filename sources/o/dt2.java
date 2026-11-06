package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class dt2 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f652o;
    public final View p;
    public ct2 q;
    public ct2 r;
    public boolean s;
    public int t;
    public final int[] u = new int[2];

    public dt2(View view) {
        this.p = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.m = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.n = tapTimeout;
        this.f652o = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void d() {
        ct2 ct2Var = this.r;
        View view = this.p;
        if (ct2Var != null) {
            view.removeCallbacks(ct2Var);
        }
        ct2 ct2Var2 = this.q;
        if (ct2Var2 != null) {
            view.removeCallbacks(ct2Var2);
        }
    }

    public abstract kz6 e();

    public abstract boolean f();

    public boolean g() {
        kz6 kz6VarE = e();
        if (kz6VarE == null || !kz6VarE.a()) {
            return true;
        }
        kz6VarE.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        o62 o62VarI;
        boolean z2 = this.s;
        View view2 = this.p;
        if (z2) {
            kz6 kz6VarE = e();
            if (kz6VarE != null && kz6VarE.a() && (o62VarI = kz6VarE.i()) != null && o62VarI.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.u;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                o62VarI.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = o62VarI.b(motionEventObtainNoHistory, this.t);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (g()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (g()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.t = motionEvent.getPointerId(0);
                    ct2 ct2Var = this.q;
                    if (ct2Var == null) {
                        ct2Var = new ct2(this, (byte) 0);
                        this.q = ct2Var;
                    }
                    view2.postDelayed(ct2Var, this.n);
                    ct2 ct2Var2 = this.r;
                    if (ct2Var2 == null) {
                        ct2Var2 = new ct2(this, (byte) 1);
                        this.r = ct2Var2;
                    }
                    view2.postDelayed(ct2Var2, this.f652o);
                } else if (actionMasked2 == 1) {
                    d();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.t);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.m;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            d();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (f()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    d();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.s = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.s = false;
        this.t = -1;
        ct2 ct2Var = this.q;
        if (ct2Var != null) {
            this.p.removeCallbacks(ct2Var);
        }
    }
}
