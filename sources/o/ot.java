package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ot extends Spinner {
    public static final int[] u = {R.attr.spinnerMode};
    public final r8 m;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final et f1674o;
    public SpinnerAdapter p;
    public final boolean q;
    public final nt r;
    public int s;
    public final Rect t;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public ot(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
        this.t = new Rect();
        wt7.a(this, getContext());
        int[] iArr = zz5.v;
        ep3 ep3VarX = ep3.x(context, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        this.m = new r8(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.n = new gc1(context, resourceId);
        } else {
            this.n = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        gt gtVar = new gt(this);
                        this.r = gtVar;
                        gtVar.f919o = typedArray.getString(2);
                    } else if (i == 1) {
                        lt ltVar = new lt(this, this.n, attributeSet);
                        ep3 ep3VarX2 = ep3.x(this.n, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
                        this.s = ((TypedArray) ep3VarX2.f733o).getLayoutDimension(3, -2);
                        ltVar.j(ep3VarX2.l(1));
                        ltVar.N = typedArray.getString(2);
                        ep3VarX2.B();
                        this.r = ltVar;
                        this.f1674o = new et(this, this, ltVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.teamviewer.teamviewer.market.mobile.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    ep3VarX.B();
                    this.q = true;
                    spinnerAdapter = this.p;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.p = null;
                    }
                    this.m.x(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            gt gtVar2 = new gt(this);
            this.r = gtVar2;
            gtVar2.f919o = typedArray.getString(2);
        } else if (i == 1) {
            lt ltVar2 = new lt(this, this.n, attributeSet);
            ep3 ep3VarX3 = ep3.x(this.n, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
            this.s = ((TypedArray) ep3VarX3.f733o).getLayoutDimension(3, -2);
            ltVar2.j(ep3VarX3.l(1));
            ltVar2.N = typedArray.getString(2);
            ep3VarX3.B();
            this.r = ltVar2;
            this.f1674o = new et(this, this, ltVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.teamviewer.teamviewer.market.mobile.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        ep3VarX.B();
        this.q = true;
        spinnerAdapter = this.p;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.p = null;
        }
        this.m.x(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.t;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        nt ntVar = this.r;
        return ntVar != null ? ntVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        nt ntVar = this.r;
        return ntVar != null ? ntVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.r != null ? this.s : super.getDropDownWidth();
    }

    public final nt getInternalPopup() {
        return this.r;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        nt ntVar = this.r;
        return ntVar != null ? ntVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.n;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        nt ntVar = this.r;
        return ntVar != null ? ntVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.v();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nt ntVar = this.r;
        if (ntVar == null || !ntVar.a()) {
            return;
        }
        ntVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        mt mtVar = (mt) parcelable;
        super.onRestoreInstanceState(mtVar.getSuperState());
        if (!mtVar.m || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ft(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        mt mtVar = new mt(super.onSaveInstanceState());
        nt ntVar = this.r;
        mtVar.m = ntVar != null && ntVar.a();
        return mtVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        et etVar = this.f1674o;
        if (etVar == null || !etVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        nt ntVar = this.r;
        if (ntVar == null) {
            return super.performClick();
        }
        if (ntVar.a()) {
            return true;
        }
        ntVar.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.q) {
            this.p = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        nt ntVar = this.r;
        if (ntVar != null) {
            Context context = this.n;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ht htVar = new ht();
            htVar.m = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                htVar.n = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            ntVar.o(htVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.A(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        nt ntVar = this.r;
        if (ntVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            ntVar.l(i);
            ntVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        nt ntVar = this.r;
        if (ntVar != null) {
            ntVar.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.r != null) {
            this.s = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        nt ntVar = this.r;
        if (ntVar != null) {
            ntVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(uf0.p(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        nt ntVar = this.r;
        if (ntVar != null) {
            ntVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.K(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.L(mode);
        }
    }
}
