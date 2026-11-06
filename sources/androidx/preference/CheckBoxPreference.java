package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.teamviewer.teamviewer.market.mobile.R;
import o.aq0;
import o.dr5;
import o.l47;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final aq0 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iN = l47.n(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iN, 0);
        this.d0 = new aq0(this, (byte) 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.b, iN, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.Z = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Y) {
            g();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.a0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Y) {
            g();
        }
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        A(dr5Var.r(android.R.id.checkbox));
        z(dr5Var.r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.m.getSystemService("accessibility")).isEnabled()) {
            A(view.findViewById(android.R.id.checkbox));
            z(view.findViewById(android.R.id.summary));
        }
    }
}
