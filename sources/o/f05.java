package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f05 extends ViewGroup implements jq4 {
    public static final int[] F = {R.attr.state_checked};
    public static final int[] G = {-16842910};
    public Drawable A;
    public int B;
    public SparseArray C;
    public h05 D;
    public jp4 E;
    public final c00 m;
    public final o6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wo5 f755o;
    public final SparseArray p;
    public int q;
    public d05[] r;
    public int s;
    public int t;
    public ColorStateList u;
    public int v;
    public ColorStateList w;
    public final ColorStateList x;
    public int y;
    public int z;

    public f05(Context context) {
        super(context);
        this.f755o = new wo5(5);
        this.p = new SparseArray(5);
        this.s = 0;
        this.t = 0;
        this.C = new SparseArray(5);
        this.x = c();
        c00 c00Var = new c00();
        this.m = c00Var;
        c00Var.K(0);
        c00Var.y(115L);
        c00Var.A(new rh2((byte) 1));
        c00Var.H(new it7());
        this.n = new o6((g90) this, (byte) 6);
        WeakHashMap weakHashMap = be8.a;
        setImportantForAccessibility(1);
    }

    private d05 getNewItem() {
        d05 d05Var = (d05) this.f755o.a();
        return d05Var == null ? new f90(getContext()) : d05Var;
    }

    private void setBadgeIfNeeded(d05 d05Var) {
        o20 o20Var;
        int id = d05Var.getId();
        if (id == -1 || (o20Var = (o20) this.C.get(id)) == null) {
            return;
        }
        d05Var.setBadge(o20Var);
    }

    public final void a() {
        removeAllViews();
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                if (d05Var != null) {
                    this.f755o.c(d05Var);
                    ImageView imageView = d05Var.s;
                    if (d05Var.B != null) {
                        if (imageView != null) {
                            d05Var.setClipChildren(true);
                            d05Var.setClipToPadding(true);
                            o20 o20Var = d05Var.B;
                            if (o20Var != null) {
                                WeakReference weakReference = o20Var.B;
                                if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                                    WeakReference weakReference2 = o20Var.B;
                                    (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(o20Var);
                                }
                            }
                        }
                        d05Var.B = null;
                    }
                }
            }
        }
        if (this.E.f.size() == 0) {
            this.s = 0;
            this.t = 0;
            this.r = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.E.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.E.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            int iKeyAt = this.C.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.C.delete(iKeyAt);
            }
        }
        this.r = new d05[this.E.f.size()];
        int i3 = this.q;
        boolean z = i3 != -1 ? i3 == 0 : this.E.n().size() > 3;
        for (int i4 = 0; i4 < this.E.f.size(); i4++) {
            this.D.n = true;
            this.E.getItem(i4).setCheckable(true);
            this.D.n = false;
            d05 newItem = getNewItem();
            this.r[i4] = newItem;
            newItem.setIconTintList(this.u);
            newItem.setIconSize(this.v);
            newItem.setTextColor(this.x);
            newItem.setTextAppearanceInactive(this.y);
            newItem.setTextAppearanceActive(this.z);
            newItem.setTextColor(this.w);
            Drawable drawable = this.A;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.B);
            }
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.q);
            pp4 pp4Var = (pp4) this.E.getItem(i4);
            newItem.a(pp4Var);
            newItem.setItemPosition(i4);
            int i5 = pp4Var.a;
            newItem.setOnTouchListener((View.OnTouchListener) this.p.get(i5));
            newItem.setOnClickListener(this.n);
            int i6 = this.s;
            if (i6 != 0 && i5 == i6) {
                this.t = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.E.f.size() - 1, this.t);
        this.t = iMin;
        this.E.getItem(iMin).setChecked(true);
    }

    @Override // o.jq4
    public final void b(jp4 jp4Var) {
        this.E = jp4Var;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM = hm3.m(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListM.getDefaultColor();
        int[] iArr = F;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = G;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public SparseArray<o20> getBadgeDrawables() {
        return this.C;
    }

    public ColorStateList getIconTintList() {
        return this.u;
    }

    public Drawable getItemBackground() {
        d05[] d05VarArr = this.r;
        return (d05VarArr == null || d05VarArr.length <= 0) ? this.A : d05VarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.B;
    }

    public int getItemIconSize() {
        return this.v;
    }

    public int getItemTextAppearanceActive() {
        return this.z;
    }

    public int getItemTextAppearanceInactive() {
        return this.y;
    }

    public ColorStateList getItemTextColor() {
        return this.w;
    }

    public int getLabelVisibilityMode() {
        return this.q;
    }

    public jp4 getMenu() {
        return this.E;
    }

    public int getSelectedItemId() {
        return this.s;
    }

    public int getSelectedItemPosition() {
        return this.t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(1, this.E.n().size(), 1).m);
    }

    public void setBadgeDrawables(SparseArray<o20> sparseArray) {
        this.C = sparseArray;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setBadge(sparseArray.get(d05Var.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.A = drawable;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.B = i;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.v = i;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.z = i;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.w;
                if (colorStateList != null) {
                    d05Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.y = i;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.w;
                if (colorStateList != null) {
                    d05Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.w = colorStateList;
        d05[] d05VarArr = this.r;
        if (d05VarArr != null) {
            for (d05 d05Var : d05VarArr) {
                d05Var.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.q = i;
    }

    public void setPresenter(h05 h05Var) {
        this.D = h05Var;
    }
}
