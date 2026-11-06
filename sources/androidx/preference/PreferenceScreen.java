package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;
import o.l47;
import o.rq5;
import o.ut2;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean e0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, l47.n(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.e0 = true;
    }

    @Override // androidx.preference.Preference
    public final void l() {
        rq5 rq5Var;
        if (this.x != null || this.y != null || this.Z.size() == 0 || (rq5Var = (rq5) this.n.j) == null) {
            return;
        }
        for (ut2 ut2Var = rq5Var; ut2Var != null; ut2Var = ut2Var.I) {
        }
        rq5Var.C();
    }
}
