package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.HashSet;
import java.util.Set;
import o.av4;
import o.l47;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] e0;
    public final CharSequence[] f0;
    public final HashSet g0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iN = l47.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iN);
        this.g0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.f, iN, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.e0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(av4.class)) {
            super.p(parcelable);
            return;
        }
        av4 av4Var = (av4) parcelable;
        super.p(av4Var.getSuperState());
        y(av4Var.m);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        av4 av4Var = new av4();
        av4Var.m = this.g0;
        return av4Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (x()) {
            stringSet = this.n.e().getStringSet(this.w, stringSet);
        }
        y(stringSet);
    }

    public final void y(Set set) {
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(set);
        if (x()) {
            boolean zX = x();
            String str = this.w;
            if (!set.equals(zX ? this.n.e().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editorD = this.n.d();
                editorD.putStringSet(str, set);
                if (!this.n.a) {
                    editorD.apply();
                }
            }
        }
        g();
    }
}
