package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import o.aq0;
import o.dr5;
import o.l47;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final aq0 d0;
    public final String e0;
    public final String f0;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d0 = new aq0(this, (byte) 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.l, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.Z = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Y) {
            g();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.a0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Y) {
            g();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.e0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        g();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        g();
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.e0);
            r4.setTextOff(this.f0);
            r4.setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public void k(dr5 dr5Var) {
        super.k(dr5Var);
        A(dr5Var.r(R.id.switch_widget));
        z(dr5Var.r(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.m.getSystemService("accessibility")).isEnabled()) {
            A(view.findViewById(R.id.switch_widget));
            z(view.findViewById(R.id.summary));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l47.n(context, com.teamviewer.teamviewer.market.mobile.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle), 0);
    }
}
