package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ee7 extends ge7 {
    public final boolean l;

    public ee7(boolean z) {
        super(R.string.in_app_purchase_free_plan_title, R.string.in_app_purchase_free_plan_subtitle, R.string.in_app_purchase_free_plan_overview, R.string.in_app_purchase_free_plan_description, null, qf0.L(new rd7(R.string.in_app_purchase_free_plan_item1_label, R.string.in_app_purchase_free_plan_item1_title), new rd7(R.string.in_app_purchase_free_plan_item2_label, R.string.in_app_purchase_free_plan_item2_title), new rd7(R.string.in_app_purchase_free_plan_item3_label, R.string.in_app_purchase_free_plan_item3_title)), null, false, null, null, null);
        this.l = z;
    }

    @Override // o.ge7
    public final boolean c() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee7) && this.l == ((ee7) obj).l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l);
    }

    public final String toString() {
        return "FreePlan(isRecurringPaymentNotAvailable=" + this.l + ")";
    }
}
