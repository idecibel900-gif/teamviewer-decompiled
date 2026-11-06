package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gn4 extends yr {
    public final ac4 q;
    public final AccessibilityManager r;
    public final Rect s;

    public gn4(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.s = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.p, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.r = (AccessibilityManager) context2.getSystemService("accessibility");
        ac4 ac4Var = new ac4(context2, null, R.attr.listPopupWindowStyle, 0);
        this.q = ac4Var;
        ac4Var.J = true;
        zs zsVar = ac4Var.K;
        zsVar.setFocusable(true);
        ac4Var.A = this;
        zsVar.setInputMethodMode(2);
        ac4Var.o(getAdapter());
        ac4Var.B = new jt(this, (byte) 1);
        typedArrayE.recycle();
    }

    public final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void b(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutA = a();
        return (textInputLayoutA == null || !textInputLayoutA.O) ? super.getHint() : textInputLayoutA.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutA = a();
        if (textInputLayoutA != null && textInputLayoutA.O && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutA = a();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutA != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ac4 ac4Var = this.q;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !ac4Var.K.isShowing() ? -1 : ac4Var.f313o.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutA);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = ac4Var.K.getBackground();
                if (background != null) {
                    Rect rect = this.s;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutA.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.q.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.q.g();
        }
    }
}
