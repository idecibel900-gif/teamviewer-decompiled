package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sm7 extends LinearLayout {
    public ValueAnimator m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TabLayout f2033o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm7(TabLayout tabLayout, Context context) {
        super(context);
        this.f2033o = tabLayout;
        this.n = -1;
        setWillNotDraw(false);
    }

    public final void a() {
        View childAt = getChildAt(this.n);
        TabLayout tabLayout = this.f2033o;
        wj5 wj5Var = tabLayout.P;
        Drawable drawable = tabLayout.x;
        wj5Var.getClass();
        RectF rectFD = wj5.d(tabLayout, childAt);
        drawable.setBounds((int) rectFD.left, drawable.getBounds().top, (int) rectFD.right, drawable.getBounds().bottom);
    }

    public final void b(View view, View view2, float f) {
        TabLayout tabLayout = this.f2033o;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.x;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.x.getBounds().bottom);
        } else {
            tabLayout.P.k(tabLayout, view, view2, f, tabLayout.x);
        }
        WeakHashMap weakHashMap = be8.a;
        postInvalidateOnAnimation();
    }

    public final void c(int i, int i2, boolean z) {
        View childAt = getChildAt(this.n);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        qm7 qm7Var = new qm7(this, childAt, childAt2);
        if (!z) {
            this.m.removeAllUpdateListeners();
            this.m.addUpdateListener(qm7Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.m = valueAnimator;
        valueAnimator.setInterpolator(lo.b);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(qm7Var);
        valueAnimator.addListener(new rm7(this, i));
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f2033o;
        int iHeight = tabLayout.x.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.x.getIntrinsicHeight();
        }
        int i = tabLayout.J;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.x.getBounds().width() > 0) {
            Rect bounds = tabLayout.x.getBounds();
            tabLayout.x.setBounds(bounds.left, height, bounds.right, iHeight);
            Drawable drawable = tabLayout.x;
            int i2 = tabLayout.y;
            if (i2 != 0) {
                drawable.setTint(i2);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            c(this.n, -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f2033o;
        boolean z = true;
        if (tabLayout.H == 1 || tabLayout.K == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) x67.k(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.H = 0;
                tabLayout.k(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
