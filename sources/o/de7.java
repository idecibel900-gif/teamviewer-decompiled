package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class de7 extends ge7 {
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f615o;

    public de7(String str, String str2, String str3, boolean z) {
        super(R.string.in_app_purchase_business_plan_title, R.string.in_app_purchase_plan_subtitle, R.string.in_app_purchase_business_plan_overview, R.string.in_app_purchase_plan_description, Integer.valueOf(R.drawable.ic_business_subscription_plan), qf0.L(new rd7(R.string.in_app_purchase_plan_item1_label, R.string.in_app_purchase_plan_item1_title), new rd7(R.string.in_app_purchase_plan_item2_label, R.string.in_app_purchase_plan_item2_title), new rd7(R.string.in_app_purchase_plan_item3_label, R.string.in_app_purchase_plan_item3_title), new rd7(R.string.in_app_purchase_plan_item4_label, R.string.in_app_purchase_plan_item4_title), new rd7(R.string.in_app_purchase_plan_item5_label, R.string.in_app_purchase_plan_item5_title), new rd7(R.string.in_app_purchase_plan_item6_label, R.string.in_app_purchase_plan_item6_title)), Integer.valueOf(R.string.in_app_purchase_upgrade_button_label), true, str, str2, new fe7());
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f615o = z;
    }

    @Override // o.ge7
    public final String a() {
        return this.l;
    }

    @Override // o.ge7
    public final String b() {
        return this.m;
    }

    @Override // o.ge7
    public final boolean c() {
        return this.f615o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de7)) {
            return false;
        }
        de7 de7Var = (de7) obj;
        return im3.n(this.l, de7Var.l) && im3.n(this.m, de7Var.m) && im3.n(this.n, de7Var.n) && this.f615o == de7Var.f615o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f615o) + to7.e(to7.e(this.l.hashCode() * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("BusinessPlan(formatedPrice=", this.l, ", subscriptionPeriodLabel=", this.m, ", subscriptionId=");
        sbO.append(this.n);
        sbO.append(", isRecurringPaymentNotAvailable=");
        sbO.append(this.f615o);
        sbO.append(")");
        return sbO.toString();
    }
}
