package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import o.bc4;
import o.cr;
import o.hq5;
import o.l47;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] e0;
    public final CharSequence[] f0;
    public String g0;
    public String h0;
    public boolean i0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.e0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            cr crVar = cr.n;
            if (crVar == null) {
                crVar = new cr((byte) 22);
                cr.n = crVar;
            }
            this.W = crVar;
            g();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wz5.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.h0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence e() {
        CharSequence[] charSequenceArr;
        hq5 hq5Var = this.W;
        if (hq5Var != null) {
            return hq5Var.i(this);
        }
        int iY = y(this.g0);
        CharSequence charSequence = (iY < 0 || (charSequenceArr = this.e0) == null) ? null : charSequenceArr[iY];
        CharSequence charSequenceE = super.e();
        String str = this.h0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceE)) {
                v0.j("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceE;
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(bc4.class)) {
            super.p(parcelable);
            return;
        }
        bc4 bc4Var = (bc4) parcelable;
        super.p(bc4Var.getSuperState());
        z(bc4Var.m);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        bc4 bc4Var = new bc4();
        bc4Var.m = this.g0;
        return bc4Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        z(d((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void v(CharSequence charSequence) {
        super.v(charSequence);
        if (charSequence == null) {
            this.h0 = null;
        } else {
            this.h0 = ((String) charSequence).toString();
        }
    }

    public final int y(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void z(String str) {
        boolean zEquals = TextUtils.equals(this.g0, str);
        if (zEquals && this.i0) {
            return;
        }
        this.g0 = str;
        this.i0 = true;
        t(str);
        if (zEquals) {
            return;
        }
        g();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l47.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
