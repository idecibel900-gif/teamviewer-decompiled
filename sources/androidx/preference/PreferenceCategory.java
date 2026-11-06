package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;
import o.dr5;
import o.l47;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, l47.n(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean f() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        if (Build.VERSION.SDK_INT >= 28) {
            dr5Var.m.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return !super.f();
    }
}
