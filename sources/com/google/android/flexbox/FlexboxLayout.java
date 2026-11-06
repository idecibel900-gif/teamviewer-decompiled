package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o.be8;
import o.fx3;
import o.gz5;
import o.hk0;
import o.lm2;
import o.mm2;
import o.nd;
import o.nm2;
import o.om2;
import o.pm2;
import o.yc4;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements lm2 {
    public final yc4 A;
    public List B;
    public final nd C;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32o;
    public int p;
    public int q;
    public int r;
    public Drawable s;
    public Drawable t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int[] y;
    public SparseIntArray z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.r = -1;
        this.A = new yc4(this);
        this.B = new ArrayList();
        this.C = new nd((byte) 5, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gz5.a, 0, 0);
        this.m = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.n = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f32o = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.p = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.q = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.r = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.v = i;
            this.u = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.v = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.u = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            nm2 nm2Var = (nm2) this.B.get(i);
            for (int i2 = 0; i2 < nm2Var.h; i2++) {
                int i3 = nm2Var.f1578o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    pm2 pm2Var = (pm2) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) pm2Var).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) pm2Var).leftMargin) - this.x, nm2Var.b, nm2Var.g);
                    }
                    if (i2 == nm2Var.h - 1 && (this.v & 4) > 0) {
                        n(canvas, z ? (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) pm2Var).leftMargin) - this.x : viewO.getRight() + ((ViewGroup.MarginLayoutParams) pm2Var).rightMargin, nm2Var.b, nm2Var.g);
                    }
                }
            }
            if (q(i)) {
                m(canvas, paddingLeft, z2 ? nm2Var.d : nm2Var.b - this.w, iMax);
            }
            if (r(i) && (this.u & 4) > 0) {
                m(canvas, paddingLeft, z2 ? nm2Var.b - this.w : nm2Var.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.z;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.z = sparseIntArray;
        }
        yc4 yc4Var = this.A;
        lm2 lm2Var = (lm2) yc4Var.m;
        int flexItemCount = lm2Var.getFlexItemCount();
        ArrayList arrayListV = yc4Var.v(flexItemCount);
        om2 om2Var = new om2();
        if (view == null || !(layoutParams instanceof mm2)) {
            om2Var.n = 1;
        } else {
            om2Var.n = ((mm2) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= lm2Var.getFlexItemCount()) {
            om2Var.m = flexItemCount;
        } else {
            om2Var.m = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((om2) arrayListV.get(i2)).m++;
            }
        }
        arrayListV.add(om2Var);
        this.y = yc4.W(flexItemCount + 1, arrayListV, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // o.lm2
    public final void b(nm2 nm2Var) {
        if (j()) {
            if ((this.v & 4) > 0) {
                int i = nm2Var.e;
                int i2 = this.x;
                nm2Var.e = i + i2;
                nm2Var.f += i2;
                return;
            }
            return;
        }
        if ((this.u & 4) > 0) {
            int i3 = nm2Var.e;
            int i4 = this.w;
            nm2Var.e = i3 + i4;
            nm2Var.f += i4;
        }
    }

    @Override // o.lm2
    public final View c(int i) {
        return o(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pm2;
    }

    @Override // o.lm2
    public final int d(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // o.lm2
    public final View e(int i) {
        return getChildAt(i);
    }

    @Override // o.lm2
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = p(i, i2) ? this.x : 0;
            if ((this.v & 4) <= 0) {
                return i3;
            }
            i4 = this.x;
        } else {
            i3 = p(i, i2) ? this.w : 0;
            if ((this.u & 4) <= 0) {
                return i3;
            }
            i4 = this.w;
        }
        return i3 + i4;
    }

    @Override // o.lm2
    public final int g(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof pm2) {
            pm2 pm2Var = (pm2) layoutParams;
            pm2 pm2Var2 = new pm2(pm2Var);
            pm2Var2.m = 1;
            pm2Var2.n = 0.0f;
            pm2Var2.f1747o = 1.0f;
            pm2Var2.p = -1;
            pm2Var2.q = -1.0f;
            pm2Var2.r = -1;
            pm2Var2.s = -1;
            pm2Var2.t = 16777215;
            pm2Var2.u = 16777215;
            pm2Var2.m = pm2Var.m;
            pm2Var2.n = pm2Var.n;
            pm2Var2.f1747o = pm2Var.f1747o;
            pm2Var2.p = pm2Var.p;
            pm2Var2.q = pm2Var.q;
            pm2Var2.r = pm2Var.r;
            pm2Var2.s = pm2Var.s;
            pm2Var2.t = pm2Var.t;
            pm2Var2.u = pm2Var.u;
            pm2Var2.v = pm2Var.v;
            return pm2Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            pm2 pm2Var3 = new pm2((ViewGroup.MarginLayoutParams) layoutParams);
            pm2Var3.m = 1;
            pm2Var3.n = 0.0f;
            pm2Var3.f1747o = 1.0f;
            pm2Var3.p = -1;
            pm2Var3.q = -1.0f;
            pm2Var3.r = -1;
            pm2Var3.s = -1;
            pm2Var3.t = 16777215;
            pm2Var3.u = 16777215;
            return pm2Var3;
        }
        pm2 pm2Var4 = new pm2(layoutParams);
        pm2Var4.m = 1;
        pm2Var4.n = 0.0f;
        pm2Var4.f1747o = 1.0f;
        pm2Var4.p = -1;
        pm2Var4.q = -1.0f;
        pm2Var4.r = -1;
        pm2Var4.s = -1;
        pm2Var4.t = 16777215;
        pm2Var4.u = 16777215;
        return pm2Var4;
    }

    @Override // o.lm2
    public int getAlignContent() {
        return this.q;
    }

    @Override // o.lm2
    public int getAlignItems() {
        return this.p;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.s;
    }

    public Drawable getDividerDrawableVertical() {
        return this.t;
    }

    @Override // o.lm2
    public int getFlexDirection() {
        return this.m;
    }

    @Override // o.lm2
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<nm2> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.B.size());
        for (nm2 nm2Var : this.B) {
            if (nm2Var.a() != 0) {
                arrayList.add(nm2Var);
            }
        }
        return arrayList;
    }

    @Override // o.lm2
    public List<nm2> getFlexLinesInternal() {
        return this.B;
    }

    @Override // o.lm2
    public int getFlexWrap() {
        return this.n;
    }

    public int getJustifyContent() {
        return this.f32o;
    }

    @Override // o.lm2
    public int getLargestMainSize() {
        Iterator it = this.B.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((nm2) it.next()).e);
        }
        return iMax;
    }

    @Override // o.lm2
    public int getMaxLine() {
        return this.r;
    }

    public int getShowDividerHorizontal() {
        return this.u;
    }

    public int getShowDividerVertical() {
        return this.v;
    }

    @Override // o.lm2
    public int getSumOfCrossSize() {
        int size = this.B.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            nm2 nm2Var = (nm2) this.B.get(i2);
            if (q(i2)) {
                i += j() ? this.w : this.x;
            }
            if (r(i2)) {
                i += j() ? this.w : this.x;
            }
            i += nm2Var.g;
        }
        return i;
    }

    @Override // o.lm2
    public final void h(View view, int i, int i2, nm2 nm2Var) {
        if (p(i, i2)) {
            boolean zJ = j();
            int i3 = nm2Var.e;
            if (zJ) {
                int i4 = this.x;
                nm2Var.e = i3 + i4;
                nm2Var.f += i4;
            } else {
                int i5 = this.w;
                nm2Var.e = i3 + i5;
                nm2Var.f += i5;
            }
        }
    }

    @Override // o.lm2
    public final void i(View view, int i) {
    }

    @Override // o.lm2
    public final boolean j() {
        int i = this.m;
        return i == 0 || i == 1;
    }

    @Override // o.lm2
    public final int k(View view) {
        return 0;
    }

    public final void l(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            nm2 nm2Var = (nm2) this.B.get(i);
            for (int i2 = 0; i2 < nm2Var.h; i2++) {
                int i3 = nm2Var.f1578o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    pm2 pm2Var = (pm2) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        m(canvas, nm2Var.a, z2 ? viewO.getBottom() + ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin : (viewO.getTop() - ((ViewGroup.MarginLayoutParams) pm2Var).topMargin) - this.w, nm2Var.g);
                    }
                    if (i2 == nm2Var.h - 1 && (this.u & 4) > 0) {
                        m(canvas, nm2Var.a, z2 ? (viewO.getTop() - ((ViewGroup.MarginLayoutParams) pm2Var).topMargin) - this.w : viewO.getBottom() + ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin, nm2Var.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? nm2Var.c : nm2Var.a - this.x, paddingTop, iMax);
            }
            if (r(i) && (this.v & 4) > 0) {
                n(canvas, z ? nm2Var.a - this.x : nm2Var.c, paddingTop, iMax);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.s;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.w + i2);
        this.s.draw(canvas);
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.t;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.x + i, i3 + i2);
        this.t.draw(canvas);
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.y;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.t == null && this.s == null) {
            return;
        }
        if (this.u == 0 && this.v == 0) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        int layoutDirection = getLayoutDirection();
        int i = this.m;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.n == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.n == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.n == 2) {
                z = !z;
            }
            l(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.n == 2) {
            z2 = !z2;
        }
        l(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = be8.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.m;
        if (i5 == 0) {
            s(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            s(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.n == 2) {
                z2 = !z2;
            }
            t(z2, false, i, i2, i3, i4);
            return;
        }
        if (i5 != 3) {
            yq4.h(this.m, "Invalid flex direction is set: ");
            return;
        }
        z2 = layoutDirection == 1;
        if (this.n == 2) {
            z2 = !z2;
        }
        t(z2, true, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.z;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.z = sparseIntArray;
        }
        yc4 yc4Var = this.A;
        lm2 lm2Var = (lm2) yc4Var.m;
        int flexItemCount = lm2Var.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.z;
            int flexItemCount2 = ((lm2) yc4Var.m).getFlexItemCount();
            this.y = yc4.W(flexItemCount2, yc4Var.v(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewE = lm2Var.e(i3);
            if (viewE != null && ((mm2) viewE.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.z;
                int flexItemCount3 = ((lm2) yc4Var.m).getFlexItemCount();
                this.y = yc4.W(flexItemCount3, yc4Var.v(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.m;
        nd ndVar = this.C;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                yq4.h(this.m, "Invalid value for the flex direction is set: ");
                return;
            }
            this.B.clear();
            ndVar.f1562o = null;
            ndVar.n = 0;
            this.A.p(this.C, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.B = (List) ndVar.f1562o;
            yc4Var.y(i, i2, 0);
            yc4Var.x(i, i2, getPaddingRight() + getPaddingLeft());
            yc4Var.a0(0);
            u(this.m, i, i2, ndVar.n);
            return;
        }
        this.B.clear();
        ndVar.f1562o = null;
        ndVar.n = 0;
        this.A.p(this.C, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.B = (List) ndVar.f1562o;
        yc4Var.y(i, i2, 0);
        if (this.p == 3) {
            for (nm2 nm2Var : this.B) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < nm2Var.h; i5++) {
                    View viewO = o(nm2Var.f1578o + i5);
                    if (viewO != null && viewO.getVisibility() != 8) {
                        pm2 pm2Var = (pm2) viewO.getLayoutParams();
                        int i6 = this.n;
                        int i7 = nm2Var.l;
                        iMax = i6 != 2 ? Math.max(iMax, viewO.getMeasuredHeight() + Math.max(i7 - viewO.getBaseline(), ((ViewGroup.MarginLayoutParams) pm2Var).topMargin) + ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin) : Math.max(iMax, viewO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pm2Var).topMargin + Math.max(viewO.getBaseline() + (i7 - viewO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin));
                    }
                }
                nm2Var.g = iMax;
            }
        }
        yc4Var.x(i, i2, getPaddingBottom() + getPaddingTop());
        yc4Var.a0(0);
        u(this.m, i, i2, ndVar.n);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewO = o(i - i3);
            if (viewO != null && viewO.getVisibility() != 8) {
                if (j()) {
                    return (this.v & 2) != 0;
                }
                return (this.u & 2) != 0;
            }
        }
        if (j()) {
            return (this.v & 1) != 0;
        }
        return (this.u & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.B.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((nm2) this.B.get(i2)).a() > 0) {
                    if (j()) {
                        return (this.u & 2) != 0;
                    }
                    return (this.v & 2) != 0;
                }
            }
            if (j()) {
                return (this.u & 1) != 0;
            }
            if ((this.v & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.B.size()) {
            for (int i2 = i + 1; i2 < this.B.size(); i2++) {
                if (((nm2) this.B.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (j()) {
                return (this.u & 4) != 0;
            }
            if ((this.v & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewO;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        yc4 yc4Var;
        nm2 nm2Var;
        yc4 yc4Var2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.B.size();
        for (int i12 = 0; i12 < size; i12++) {
            nm2 nm2Var2 = (nm2) this.B.get(i12);
            if (q(i12)) {
                int i13 = this.w;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.f32o;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = nm2Var2.e;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = nm2Var2.a();
                    f2 = (i11 - nm2Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iA2 = nm2Var2.a();
                    float f6 = iA2 != 0 ? (i11 - nm2Var2.e) / iA2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        yq4.h(this.f32o, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = nm2Var2.a();
                    f2 = iA3 != 0 ? (i11 - nm2Var2.e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < nm2Var2.h) {
                    i6 = nm2Var2.f1578o + i5;
                    viewO = o(i6);
                    char c2 = c;
                    if (viewO != null) {
                        z2 = z3;
                        if (viewO.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            pm2 pm2Var = (pm2) viewO.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) pm2Var).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) pm2Var).rightMargin;
                            if (p(i6, i5)) {
                                int i18 = this.x;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == nm2Var2.h - 1 || (this.v & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.x;
                            }
                            if (this.n == i16) {
                                i8 = i16;
                                yc4Var2 = this.A;
                                if (z) {
                                    view = viewO;
                                    yc4Var2.M(view, nm2Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewO;
                                    yc4Var2.M(view, nm2Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewO;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                yc4Var = this.A;
                                if (z) {
                                    yc4Var.M(view, nm2Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    yc4Var.M(view, nm2Var2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) pm2Var).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) pm2Var).leftMargin);
                            if (z) {
                                nm2Var = nm2Var2;
                                nm2Var.b(view, i10, 0, i9, 0);
                            } else {
                                nm2Var = nm2Var2;
                                nm2Var.b(view, i9, 0, i10, 0);
                            }
                            nm2Var2 = nm2Var;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = nm2Var2.g;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = nm2Var2.e;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < nm2Var2.h) {
                i6 = nm2Var2.f1578o + i5;
                viewO = o(i6);
                char c3 = c;
                if (viewO != null) {
                    z2 = z3;
                    if (viewO.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        pm2 pm2Var2 = (pm2) viewO.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) pm2Var2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) pm2Var2).rightMargin;
                        if (p(i6, i5)) {
                            int i110 = this.x;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == nm2Var2.h - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.n == i16) {
                            i8 = i16;
                            yc4Var2 = this.A;
                            if (z) {
                                view = viewO;
                                yc4Var2.M(view, nm2Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewO;
                                yc4Var2.M(view, nm2Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewO;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            yc4Var = this.A;
                            if (z) {
                                yc4Var.M(view, nm2Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                yc4Var.M(view, nm2Var2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) pm2Var2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) pm2Var2).leftMargin);
                        if (z) {
                            nm2Var = nm2Var2;
                            nm2Var.b(view, i10, 0, i9, 0);
                        } else {
                            nm2Var = nm2Var2;
                            nm2Var.b(view, i9, 0, i10, 0);
                        }
                        nm2Var2 = nm2Var;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = nm2Var2.g;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public void setAlignContent(int i) {
        if (this.q != i) {
            this.q = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.p != i) {
            this.p = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.s) {
            return;
        }
        this.s = drawable;
        if (drawable != null) {
            this.w = drawable.getIntrinsicHeight();
        } else {
            this.w = 0;
        }
        if (this.s == null && this.t == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.t) {
            return;
        }
        this.t = drawable;
        if (drawable != null) {
            this.x = drawable.getIntrinsicWidth();
        } else {
            this.x = 0;
        }
        if (this.s == null && this.t == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.m != i) {
            this.m = i;
            requestLayout();
        }
    }

    @Override // o.lm2
    public void setFlexLines(List<nm2> list) {
        this.B = list;
    }

    public void setFlexWrap(int i) {
        if (this.n != i) {
            this.n = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f32o != i) {
            this.f32o = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.r != i) {
            this.r = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.u) {
            this.u = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.v) {
            this.v = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void t(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewO;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        yc4 yc4Var;
        nm2 nm2Var;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.B.size();
        for (int i14 = 0; i14 < size; i14++) {
            nm2 nm2Var2 = (nm2) this.B.get(i14);
            if (q(i14)) {
                int i15 = this.x;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.f32o;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - nm2Var2.e) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iA = nm2Var2.a();
                    f2 = (i12 - nm2Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iA2 = nm2Var2.a();
                    f2 = iA2 != 0 ? (i12 - nm2Var2.e) / iA2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        yq4.h(this.f32o, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = nm2Var2.a();
                    f2 = iA3 != 0 ? (i12 - nm2Var2.e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < nm2Var2.h) {
                    i6 = nm2Var2.f1578o + i5;
                    i7 = i18;
                    viewO = o(i6);
                    if (viewO != null) {
                        c = c2;
                        if (viewO.getVisibility() == 8) {
                            pm2 pm2Var = (pm2) viewO.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) pm2Var).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin;
                            if (p(i6, i5)) {
                                i10 = this.w;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == nm2Var2.h - i7 || (this.u & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.w;
                            }
                            i9 = i5;
                            yc4Var = this.A;
                            if (z) {
                                if (z2) {
                                    yc4Var.N(viewO, nm2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    yc4Var.N(viewO, nm2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    yc4Var.N(viewO, nm2Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    yc4Var.N(viewO, nm2Var2, false, i19, Math.round(f3), viewO.getMeasuredWidth() + i19, viewO.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin;
                            float measuredHeight2 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) pm2Var).topMargin);
                            if (z2) {
                                nm2Var = nm2Var2;
                                nm2Var.b(viewO, 0, i11, 0, i10);
                            } else {
                                nm2Var = nm2Var2;
                                nm2Var.b(viewO, 0, i10, 0, i11);
                            }
                            nm2Var2 = nm2Var;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = nm2Var2.g;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = nm2Var2.e;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < nm2Var2.h) {
                i6 = nm2Var2.f1578o + i5;
                i7 = i18;
                viewO = o(i6);
                if (viewO != null) {
                    c = c2;
                    if (viewO.getVisibility() == 8) {
                        pm2 pm2Var2 = (pm2) viewO.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) pm2Var2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) pm2Var2).bottomMargin;
                        if (p(i6, i5)) {
                            i10 = this.w;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == nm2Var2.h - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        yc4Var = this.A;
                        if (z) {
                            if (z2) {
                                yc4Var.N(viewO, nm2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                yc4Var.N(viewO, nm2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                yc4Var.N(viewO, nm2Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                yc4Var.N(viewO, nm2Var2, false, i110, Math.round(f3), viewO.getMeasuredWidth() + i110, viewO.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) pm2Var2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) pm2Var2).topMargin);
                        if (z2) {
                            nm2Var = nm2Var2;
                            nm2Var.b(viewO, 0, i11, 0, i10);
                        } else {
                            nm2Var = nm2Var2;
                            nm2Var.b(viewO, 0, i10, 0, i11);
                        }
                        nm2Var2 = nm2Var;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = nm2Var2.g;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                hk0.g(fx3.e(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            hk0.l(fx3.e(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            hk0.l(fx3.e(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        pm2 pm2Var = new pm2(context, attributeSet);
        pm2Var.m = 1;
        pm2Var.n = 0.0f;
        pm2Var.f1747o = 1.0f;
        pm2Var.p = -1;
        pm2Var.q = -1.0f;
        pm2Var.r = -1;
        pm2Var.s = -1;
        pm2Var.t = 16777215;
        pm2Var.u = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gz5.b);
        pm2Var.m = typedArrayObtainStyledAttributes.getInt(8, 1);
        pm2Var.n = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        pm2Var.f1747o = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        pm2Var.p = typedArrayObtainStyledAttributes.getInt(0, -1);
        pm2Var.q = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        pm2Var.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        pm2Var.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        pm2Var.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        pm2Var.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        pm2Var.v = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return pm2Var;
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
