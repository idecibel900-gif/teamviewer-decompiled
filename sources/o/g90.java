package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g90 extends f05 {
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public boolean M;
    public final int[] N;

    public g90(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.L = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.N = new int[5];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = be8.a;
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8 A[SYNTHETIC] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int i3;
        int i4;
        jp4 menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.n().size();
        int childCount = getChildCount();
        int i5 = this.L;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i6 = this.J;
        int[] iArr = this.N;
        if (labelVisibilityMode != -1 ? labelVisibilityMode != 0 : size2 <= 3) {
            iMin = Math.min(size / (size2 != 0 ? size2 : 1), i6);
            i3 = size - (size2 * iMin);
            for (i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    iArr[i4] = iMin;
                    if (i3 > 0) {
                        iArr[i4] = iMin + 1;
                        i3--;
                    }
                } else {
                    iArr[i4] = 0;
                }
            }
        } else if (this.M) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.K;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin2 = Math.min(size - (this.I * i7), Math.min(iMax, i6));
            int i8 = size - iMin2;
            int iMin3 = Math.min(i8 / (i7 != 0 ? i7 : 1), this.H);
            int i9 = i8 - (i7 * iMin3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int i11 = i10 == getSelectedItemPosition() ? iMin2 : iMin3;
                    iArr[i10] = i11;
                    if (i9 > 0) {
                        iArr[i10] = i11 + 1;
                        i9--;
                    }
                } else {
                    iArr[i10] = 0;
                }
                i10++;
            }
        } else {
            iMin = Math.min(size / (size2 != 0 ? size2 : 1), i6);
            i3 = size - (size2 * iMin);
            while (i4 < childCount) {
                if (getChildAt(i4).getVisibility() != 8) {
                    iArr[i4] = iMin;
                    if (i3 > 0) {
                        iArr[i4] = iMin + 1;
                        i3--;
                    }
                } else {
                    iArr[i4] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(iArr[i12], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(i5, iMakeMeasureSpec, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.M = z;
    }
}
