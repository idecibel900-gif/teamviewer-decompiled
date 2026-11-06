package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.as;
import o.at;
import o.cs;
import o.eu;
import o.gn4;
import o.hz5;
import o.nn4;
import o.on4;
import o.xk0;
import o.xo1;
import o.yr;
import o.yt;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends eu {
    @Override // o.eu
    public final yr a(Context context, AttributeSet attributeSet) {
        return new gn4(context, attributeSet);
    }

    @Override // o.eu
    public final as b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // o.eu
    public final cs c(Context context, AttributeSet attributeSet) {
        nn4 nn4Var = new nn4(xk0.O(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        Context context2 = nn4Var.getContext();
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.s, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (typedArrayE.hasValue(0)) {
            nn4Var.setButtonTintList(xo1.O(context2, typedArrayE, 0));
        }
        nn4Var.r = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return nn4Var;
    }

    @Override // o.eu
    public final at d(Context context, AttributeSet attributeSet) {
        on4 on4Var = new on4(xk0.O(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = on4Var.getContext();
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.t, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayE.hasValue(0)) {
            on4Var.setButtonTintList(xo1.O(context2, typedArrayE, 0));
        }
        on4Var.r = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return on4Var;
    }

    @Override // o.eu
    public final yt e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
