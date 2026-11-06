package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;
import o.cc4;
import o.cv4;
import o.g82;
import o.l47;
import o.rq5;
import o.ut2;
import o.v02;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence Y;
    public final String Z;
    public final Drawable a0;
    public final String b0;
    public final String c0;
    public final int d0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.Y = string;
        if (string == null) {
            this.Y = this.s;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.Z = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.a0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.b0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.c0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.d0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void l() {
        v02 cv4Var;
        rq5 rq5Var = (rq5) this.n.i;
        if (rq5Var != null) {
            for (ut2 ut2Var = rq5Var; ut2Var != null; ut2Var = ut2Var.I) {
            }
            rq5Var.C();
            if (rq5Var.G().F("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            boolean z = this instanceof EditTextPreference;
            String str = this.w;
            if (z) {
                cv4Var = new g82();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                cv4Var.u0(bundle);
            } else if (this instanceof ListPreference) {
                cv4Var = new cc4();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str);
                cv4Var.u0(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                cv4Var = new cv4();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str);
                cv4Var.u0(bundle3);
            }
            cv4Var.x0(rq5Var);
            cv4Var.E0(rq5Var.G(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l47.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
