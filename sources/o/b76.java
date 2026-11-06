package o;

import android.os.Build;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b76 implements Runnable {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OverScroller f405o;
    public Interpolator p;
    public boolean q;
    public boolean r;
    public final /* synthetic */ RecyclerView s;

    public b76(RecyclerView recyclerView) {
        this.s = recyclerView;
        jn3 jn3Var = RecyclerView.U0;
        this.p = jn3Var;
        this.q = false;
        this.r = false;
        this.f405o = new OverScroller(recyclerView.getContext(), jn3Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.s;
        recyclerView.setScrollState(2);
        this.n = 0;
        this.m = 0;
        Interpolator interpolator = this.p;
        jn3 jn3Var = RecyclerView.U0;
        if (interpolator != jn3Var) {
            this.p = jn3Var;
            this.f405o = new OverScroller(recyclerView.getContext(), jn3Var);
        }
        this.f405o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.q) {
            this.r = true;
            return;
        }
        RecyclerView recyclerView = this.s;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = be8.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.s;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.U0;
        }
        if (this.p != interpolator) {
            this.p = interpolator;
            this.f405o = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.n = 0;
        this.m = 0;
        recyclerView.setScrollState(2);
        this.f405o.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.s;
        int[] iArr = recyclerView.E0;
        if (recyclerView.z == null) {
            recyclerView.removeCallbacks(this);
            this.f405o.abortAnimation();
            return;
        }
        this.r = false;
        this.q = true;
        recyclerView.o();
        OverScroller overScroller = this.f405o;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.m;
            int i7 = currY - this.n;
            this.m = currX;
            this.n = currY;
            int iN = RecyclerView.n(i6, recyclerView.U, recyclerView.W, recyclerView.getWidth());
            int iN2 = RecyclerView.n(i7, recyclerView.V, recyclerView.a0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(iN, iN2, 1, iArr2, null)) {
                iN -= iArr[0];
                iN2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m(iN, iN2);
            }
            if (recyclerView.y != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.h0(iN, iN2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iN - i8;
                int i11 = iN2 - i9;
                aa4 aa4Var = recyclerView.z.q;
                if (aa4Var != null && !aa4Var.d && aa4Var.e) {
                    int iB = recyclerView.s0.b();
                    if (iB == 0) {
                        aa4Var.e();
                    } else if (aa4Var.a >= iB) {
                        aa4Var.a = iB - 1;
                        aa4Var.d(i8, i9);
                    } else {
                        aa4Var.d(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iN;
                i2 = iN2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.B.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.w(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            aa4 aa4Var2 = recyclerView.z.q;
            if ((aa4Var2 == null || !aa4Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.y();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.z();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.a0.isFinished()) {
                            recyclerView.a0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.S0) {
                    rr0 rr0Var = recyclerView.r0;
                    int[] iArr4 = (int[]) rr0Var.e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    rr0Var.d = 0;
                }
            } else {
                b();
                ay2 ay2Var = recyclerView.q0;
                if (ay2Var != null) {
                    ay2Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                f66.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        aa4 aa4Var3 = recyclerView.z.q;
        if (aa4Var3 != null && aa4Var3.d) {
            aa4Var3.d(0, 0);
        }
        this.q = false;
        if (!this.r) {
            recyclerView.setScrollState(0);
            recyclerView.p0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = be8.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
