package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o.aj3;
import o.aq0;
import o.ar;
import o.be8;
import o.br0;
import o.cr0;
import o.dr0;
import o.f4;
import o.hz5;
import o.im3;
import o.kp2;
import o.pc3;
import o.qc3;
import o.sc3;
import o.xk0;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends kp2 {
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public cr0 u;
    public final aq0 v;
    public final dr0 w;
    public int x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextO = xk0.O(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextO, attributeSet, R.attr.chipGroupStyle);
        this.f1289o = false;
        TypedArray typedArrayObtainStyledAttributes = contextO.getTheme().obtainStyledAttributes(attributeSet, hz5.n, 0, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.v = new aq0(this, (byte) 1);
        dr0 dr0Var = new dr0(this);
        this.w = dr0Var;
        this.x = -1;
        this.y = false;
        TypedArray typedArrayE = xk0.E(getContext(), attributeSet, hz5.h, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayE.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayE.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayE.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayE.getBoolean(5, false));
        setSingleSelection(typedArrayE.getBoolean(6, false));
        setSelectionRequired(typedArrayE.getBoolean(4, false));
        int resourceId = typedArrayE.getResourceId(0, -1);
        if (resourceId != -1) {
            this.x = resourceId;
        }
        typedArrayE.recycle();
        super.setOnHierarchyChangeListener(dr0Var);
        WeakHashMap weakHashMap = be8.a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        c(i, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.x;
                if (i2 != -1 && this.s) {
                    d(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i) {
        int i2 = this.x;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.s) {
            d(i2, false);
        }
        if (i != -1) {
            d(i, true);
        }
        setCheckedId(i);
    }

    public final void c(int i, boolean z) {
        this.x = i;
        cr0 cr0Var = this.u;
        if (cr0Var != null && this.s && z) {
            sc3 sc3Var = ((aj3) ((ar) cr0Var).n).F0;
            if (sc3Var != null) {
                sc3Var.g0(i == R.id.mouse_chip ? pc3.a : qc3.a);
            } else {
                im3.e0("inputModeViewModel");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof br0);
    }

    public final void d(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.y = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.y = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new br0(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new br0(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.s) {
            return this.x;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.s) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.q;
    }

    public int getChipSpacingVertical() {
        return this.r;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.x;
        if (i != -1) {
            d(i, true);
            setCheckedId(this.x);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(getRowCount(), this.f1289o ? getChipCount() : -1, this.s ? 1 : 2).m);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.q != i) {
            this.q = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.r != i) {
            this.r = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(cr0 cr0Var) {
        this.u = cr0Var;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w.m = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.t = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.s != z) {
            this.s = z;
            this.y = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.y = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new br0(layoutParams);
    }

    @Override // o.kp2
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
