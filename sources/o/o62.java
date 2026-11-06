package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class o62 extends ListView {
    public final Rect m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1634o;
    public int p;
    public int q;
    public int r;
    public m62 s;
    public boolean t;
    public final boolean u;
    public boolean v;
    public hc4 w;
    public mt8 x;

    public o62(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.m = new Rect();
        this.n = 0;
        this.f1634o = 0;
        this.p = 0;
        this.q = 0;
        this.u = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zI;
        View childAt;
        View childAt2;
        hc4 hc4Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.v = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.r - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            hc4Var = this.w;
            if (z) {
                if (hc4Var == null) {
                    hc4Var = new hc4(this);
                    this.w = hc4Var;
                }
                hc4Var.A = true;
                hc4Var.onTouch(this, motionEvent);
            } else if (hc4Var != null) {
                if (hc4Var.A) {
                    hc4Var.g();
                }
                hc4Var.A = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.v = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.r;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.r = iPointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.m;
                rect.set(left, top, right, bottom);
                rect.left -= this.n;
                rect.top -= this.f1634o;
                rect.right += this.p;
                rect.bottom += this.q;
                if (Build.VERSION.SDK_INT >= 33) {
                    zI = c4.i(this);
                } else {
                    Field field = n62.a;
                    if (field != null) {
                        try {
                            zI = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zI = false;
                        }
                    } else {
                        zI = false;
                    }
                }
                if (childAt3.isEnabled() != zI) {
                    boolean z4 = !zI;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c4.s(this, z4);
                    } else {
                        Field field2 = n62.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z4));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                m62 m62Var = this.s;
                if (m62Var != null) {
                    m62Var.n = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.v = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.r - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.v = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.r - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        hc4Var = this.w;
        if (z) {
            if (hc4Var == null) {
                hc4Var = new hc4(this);
                this.w = hc4Var;
            }
            hc4Var.A = true;
            hc4Var.onTouch(this, motionEvent);
        } else if (hc4Var != null) {
            if (hc4Var.A) {
                hc4Var.g();
            }
            hc4Var.A = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.m;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.x != null) {
            return;
        }
        super.drawableStateChanged();
        m62 m62Var = this.s;
        if (m62Var != null) {
            m62Var.n = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.v && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.u || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.u || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.u && this.t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        byte b = 7;
        if (actionMasked == 10 && this.x == null) {
            mt8 mt8Var = new mt8(this, b);
            this.x = mt8Var;
            post(mt8Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !l62.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        l62.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        l62.b.invoke(this, Integer.valueOf(iPointToPosition));
                        l62.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.v && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        mt8 mt8Var = this.x;
        if (mt8Var != null) {
            o62 o62Var = (o62) mt8Var.n;
            o62Var.x = null;
            o62Var.removeCallbacks(mt8Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.t = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        m62 m62Var = null;
        if (drawable != null) {
            m62 m62Var2 = new m62();
            Drawable drawable2 = m62Var2.m;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            m62Var2.m = drawable;
            drawable.setCallback(m62Var2);
            m62Var2.n = true;
            m62Var = m62Var2;
        }
        this.s = m62Var;
        super.setSelector(m62Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.n = rect.left;
        this.f1634o = rect.top;
        this.p = rect.right;
        this.q = rect.bottom;
    }
}
