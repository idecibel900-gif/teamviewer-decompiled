package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cm extends ViewGroup {
    public final HashMap m;
    public final HashMap n;

    public cm(Context context) {
        super(context);
        setClipChildren(false);
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<xl, LayoutNode> getHolderToLayoutNode() {
        return this.m;
    }

    public final HashMap<LayoutNode, xl> getLayoutNodeToHolder() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (xl xlVar : this.m.keySet()) {
            xlVar.layout(xlVar.getLeft(), xlVar.getTop(), xlVar.getRight(), xlVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            ki3.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            ki3.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (xl xlVar : this.m.keySet()) {
            int i4 = xlVar.H;
            if (i4 != Integer.MIN_VALUE && (i3 = xlVar.I) != Integer.MIN_VALUE) {
                xlVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = (LayoutNode) this.m.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.u0(layoutNode, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
