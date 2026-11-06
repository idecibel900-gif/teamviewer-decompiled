package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class fe7 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fe7);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_caret_right) + fx3.a(R.drawable.ic_pencil_circle, Integer.hashCode(R.string.in_app_purchase_your_plan_label) * 31, 31);
    }

    public final String toString() {
        return to7.l(fx3.j(R.string.in_app_purchase_your_plan_label, R.drawable.ic_pencil_circle, "OverviewAction(labelResource=", ", leftIconResource=", ", rightIconResource="), R.drawable.ic_caret_right, ")");
    }
}
