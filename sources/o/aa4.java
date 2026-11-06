package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class aa4 {
    public int a = -1;
    public RecyclerView b;
    public androidx.recyclerview.widget.a c;
    public boolean d;
    public boolean e;
    public View f;
    public final w66 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f311o;
    public int p;

    public aa4(Context context) {
        w66 w66Var = new w66();
        w66Var.d = -1;
        w66Var.f = false;
        w66Var.g = 0;
        w66Var.a = 0;
        w66Var.b = 0;
        w66Var.c = Integer.MIN_VALUE;
        w66Var.e = null;
        this.g = w66Var;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.f311o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            hk0.g("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public final int b(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = 25.0f / this.l.densityDpi;
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public final PointF c(int i) {
        Object obj = this.c;
        if (obj instanceof x66) {
            return ((x66) obj).a(i);
        }
        io.sentry.android.core.v0.j("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + x66.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    public final void d(int i, int i2) {
        int i3;
        int iA;
        int iA2;
        PointF pointFC;
        RecyclerView recyclerView = this.b;
        int i4 = -1;
        if (this.a == -1 || recyclerView == null) {
            e();
        }
        if (this.d && this.f == null && this.c != null && (pointFC = c(this.a)) != null) {
            float f = pointFC.x;
            if (f != 0.0f || pointFC.y != 0.0f) {
                recyclerView.h0((int) Math.signum(f), (int) Math.signum(pointFC.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        w66 w66Var = this.g;
        if (view != null) {
            this.b.getClass();
            c76 c76VarM = RecyclerView.M(view);
            if ((c76VarM != null ? c76VarM.c() : -1) == this.a) {
                View view2 = this.f;
                y66 y66Var = recyclerView.s0;
                PointF pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.x;
                    if (f2 == 0.0f) {
                        i3 = 0;
                    } else {
                        i3 = f2 > 0.0f ? 1 : -1;
                    }
                } else {
                    i3 = 0;
                }
                androidx.recyclerview.widget.a aVar = this.c;
                if (aVar == null || !aVar.o()) {
                    iA = 0;
                } else {
                    m66 m66Var = (m66) view2.getLayoutParams();
                    iA = a(androidx.recyclerview.widget.a.K(view2) - ((ViewGroup.MarginLayoutParams) m66Var).leftMargin, androidx.recyclerview.widget.a.L(view2) + ((ViewGroup.MarginLayoutParams) m66Var).rightMargin, aVar.getPaddingLeft(), aVar.z - aVar.getPaddingRight(), i3);
                }
                PointF pointF2 = this.k;
                if (pointF2 != null) {
                    float f3 = pointF2.y;
                    if (f3 == 0.0f) {
                        i4 = 0;
                    } else if (f3 > 0.0f) {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                androidx.recyclerview.widget.a aVar2 = this.c;
                if (aVar2 == null || !aVar2.p()) {
                    iA2 = 0;
                } else {
                    m66 m66Var2 = (m66) view2.getLayoutParams();
                    iA2 = a(androidx.recyclerview.widget.a.M(view2) - ((ViewGroup.MarginLayoutParams) m66Var2).topMargin, androidx.recyclerview.widget.a.J(view2) + ((ViewGroup.MarginLayoutParams) m66Var2).bottomMargin, aVar2.getPaddingTop(), aVar2.A - aVar2.getPaddingBottom(), i4);
                }
                int iCeil = (int) Math.ceil(((double) b((int) Math.sqrt((iA2 * iA2) + (iA * iA)))) / 0.3356d);
                if (iCeil > 0) {
                    w66Var.a = -iA;
                    w66Var.b = -iA2;
                    w66Var.c = iCeil;
                    w66Var.e = this.j;
                    w66Var.f = true;
                }
                w66Var.a(recyclerView);
                e();
            } else {
                io.sentry.android.core.v0.c("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            y66 y66Var2 = recyclerView.s0;
            if (this.b.z.G() == 0) {
                e();
            } else {
                int i5 = this.f311o;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f311o = i6;
                int i7 = this.p;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF pointFC2 = c(this.a);
                    if (pointFC2 != null) {
                        float f4 = pointFC2.x;
                        if (f4 == 0.0f && pointFC2.y == 0.0f) {
                            w66Var.d = this.a;
                            e();
                        } else {
                            float f5 = pointFC2.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFC2.x / fSqrt;
                            pointFC2.x = f6;
                            float f7 = pointFC2.y / fSqrt;
                            pointFC2.y = f7;
                            this.k = pointFC2;
                            this.f311o = (int) (f6 * 10000.0f);
                            this.p = (int) (f7 * 10000.0f);
                            int iB = b(10000);
                            int i9 = (int) (this.f311o * 1.2f);
                            int i10 = (int) (this.p * 1.2f);
                            w66Var.a = i9;
                            w66Var.b = i10;
                            w66Var.c = (int) (iB * 1.2f);
                            w66Var.e = this.i;
                            w66Var.f = true;
                        }
                    } else {
                        w66Var.d = this.a;
                        e();
                    }
                }
            }
            boolean z = w66Var.d >= 0;
            w66Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.p0.b();
            }
        }
    }

    public final void e() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.f311o = 0;
            this.k = null;
            this.b.s0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            androidx.recyclerview.widget.a aVar = this.c;
            if (aVar.q == this) {
                aVar.q = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
