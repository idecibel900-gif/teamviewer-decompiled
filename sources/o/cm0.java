package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class cm0 extends FrameLayout {
    public static final int[] r = {R.attr.colorBackground};
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f538o;
    public final Rect p;
    public final wk0 q;

    public cm0(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.f538o = rect;
        this.p = new Rect();
        wk0 wk0Var = new wk0(this);
        this.q = wk0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pz5.a, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(r);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.teamviewer.teamviewer.market.mobile.R.color.cardview_light_background) : getResources().getColor(com.teamviewer.teamviewer.market.mobile.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.n = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        mf6 mf6Var = new mf6(colorStateListValueOf, dimension);
        wk0Var.n = mf6Var;
        setBackgroundDrawable(mf6Var);
        setClipToOutline(true);
        setElevation(dimension2);
        mo8.t(wk0Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((mf6) this.q.n).h;
    }

    public float getCardElevation() {
        return ((cm0) this.q.f2420o).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f538o.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f538o.left;
    }

    public int getContentPaddingRight() {
        return this.f538o.right;
    }

    public int getContentPaddingTop() {
        return this.f538o.top;
    }

    public float getMaxCardElevation() {
        return ((mf6) this.q.n).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.n;
    }

    public float getRadius() {
        return ((mf6) this.q.n).a;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        mf6 mf6Var = (mf6) this.q.n;
        if (colorStateListValueOf == null) {
            mf6Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        mf6Var.h = colorStateListValueOf;
        mf6Var.b.setColor(colorStateListValueOf.getColorForState(mf6Var.getState(), mf6Var.h.getDefaultColor()));
        mf6Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((cm0) this.q.f2420o).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        mo8.t(this.q, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.n) {
            this.n = z;
            wk0 wk0Var = this.q;
            mo8.t(wk0Var, ((mf6) wk0Var.n).e);
        }
    }

    public void setRadius(float f) {
        mf6 mf6Var = (mf6) this.q.n;
        if (f == mf6Var.a) {
            return;
        }
        mf6Var.a = f;
        mf6Var.b(null);
        mf6Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            wk0 wk0Var = this.q;
            mo8.t(wk0Var, ((mf6) wk0Var.n).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        mf6 mf6Var = (mf6) this.q.n;
        if (colorStateList == null) {
            mf6Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        mf6Var.h = colorStateList;
        mf6Var.b.setColor(colorStateList.getColorForState(mf6Var.getState(), mf6Var.h.getDefaultColor()));
        mf6Var.invalidateSelf();
    }
}
