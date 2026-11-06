package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.teamviewer.teamviewer.market.mobile.R;
import o.aq0;
import o.dr5;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final aq0 d0;
    public final String e0;
    public final String f0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.d0 = new aq0(this, (byte) 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.m, R.attr.switchPreferenceCompatStyle, 0);
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
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.e0);
            switchCompat.setTextOff(this.f0);
            switchCompat.setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        A(dr5Var.r(R.id.switchWidget));
        z(dr5Var.r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.m.getSystemService("accessibility")).isEnabled()) {
            A(view.findViewById(R.id.switchWidget));
            z(view.findViewById(android.R.id.summary));
        }
    }
}
