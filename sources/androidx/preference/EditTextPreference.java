package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.teamviewer.teamviewer.market.mobile.R;
import o.f82;
import o.ju;
import o.l47;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String e0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iN = l47.n(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iN);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.d, iN, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            ju juVar = ju.n;
            if (juVar == null) {
                juVar = new ju((byte) 14);
                ju.n = juVar;
            }
            this.W = juVar;
            g();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(f82.class)) {
            super.p(parcelable);
            return;
        }
        f82 f82Var = (f82) parcelable;
        super.p(f82Var.getSuperState());
        y(f82Var.m);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        f82 f82Var = new f82();
        f82Var.m = this.e0;
        return f82Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        y(d((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return TextUtils.isEmpty(this.e0) || super.w();
    }

    public final void y(String str) {
        boolean zW = w();
        this.e0 = str;
        t(str);
        boolean zW2 = w();
        if (zW2 != zW) {
            h(zW2);
        }
        g();
    }
}
