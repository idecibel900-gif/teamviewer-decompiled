package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import o.c48;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean Y;
    public CharSequence Z;
    public CharSequence a0;
    public boolean b0;
    public boolean c0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // androidx.preference.Preference
    public final void l() {
        y(!this.Y);
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c48.class)) {
            super.p(parcelable);
            return;
        }
        c48 c48Var = (c48) parcelable;
        super.p(c48Var.getSuperState());
        y(c48Var.m);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        c48 c48Var = new c48();
        c48Var.m = this.Y;
        return c48Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (x()) {
            zBooleanValue = this.n.e().getBoolean(this.w, zBooleanValue);
        }
        y(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        boolean z = this.c0;
        boolean z2 = this.Y;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.w();
    }

    public final void y(boolean z) {
        boolean z2 = this.Y != z;
        if (z2 || !this.b0) {
            this.Y = z;
            this.b0 = true;
            if (x()) {
                boolean z3 = !z;
                boolean zX = x();
                String str = this.w;
                if (zX) {
                    z3 = this.n.e().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorD = this.n.d();
                    editorD.putBoolean(str, z);
                    if (!this.n.a) {
                        editorD.apply();
                    }
                }
            }
            if (z2) {
                h(w());
                g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void z(View view) {
        boolean z;
        int i;
        CharSequence charSequenceE;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.Y || TextUtils.isEmpty(this.Z)) {
                if (this.Y || TextUtils.isEmpty(this.a0)) {
                    z = true;
                } else {
                    textView.setText(this.a0);
                }
                if (z) {
                    charSequenceE = e();
                    if (!TextUtils.isEmpty(charSequenceE)) {
                        textView.setText(charSequenceE);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.Z);
            z = false;
            if (z) {
                charSequenceE = e();
                if (!TextUtils.isEmpty(charSequenceE)) {
                    textView.setText(charSequenceE);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }
}
