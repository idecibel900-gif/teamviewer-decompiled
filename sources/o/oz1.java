package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class oz1 extends vs1 {
    public final tr e = new tr(R.string.device_tab_contact_details_title);
    public final boolean f;
    public final a9 g;
    public final boolean h;
    public final qv1 i;

    public oz1(boolean z, a9 a9Var, boolean z2, qv1 qv1Var) {
        this.f = z;
        this.g = a9Var;
        this.h = z2;
        this.i = qv1Var;
    }

    @Override // o.vs1
    public final ka0 A() {
        return this.e;
    }

    @Override // o.vs1
    public final boolean F() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oz1) {
            oz1 oz1Var = (oz1) obj;
            return this.e.equals(oz1Var.e) && this.f == oz1Var.f && this.g == oz1Var.g && this.h == oz1Var.h && this.i == oz1Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + to7.f((this.g.hashCode() + to7.f(Integer.hashCode(this.e.z) * 31, 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        return "ContactInfo(title=" + this.e + ", isNavigationIconVisible=" + this.f + ", onNavigationClick=" + this.g + ", isActionEnabled=" + this.h + ", onAction=" + this.i + ")";
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.g;
    }
}
