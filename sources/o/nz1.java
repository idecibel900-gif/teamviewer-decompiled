package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends vs1 {
    public final tr e = new tr(R.string.tv_contact_edit_title);
    public final qv1 f;
    public final boolean g;
    public final boolean h;
    public final rv1 i;

    public nz1(qv1 qv1Var, boolean z, boolean z2, rv1 rv1Var) {
        this.f = qv1Var;
        this.g = z;
        this.h = z2;
        this.i = rv1Var;
    }

    @Override // o.vs1
    public final ka0 A() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nz1) {
            nz1 nz1Var = (nz1) obj;
            return this.e.equals(nz1Var.e) && this.f == nz1Var.f && this.g == nz1Var.g && this.h == nz1Var.h && this.i == nz1Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + to7.f(to7.f((this.f.hashCode() + to7.f(Integer.hashCode(this.e.z) * 31, 31, true)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactEdit(title=");
        sb.append(this.e);
        sb.append(", isNavigationIconVisible=true, onAction=");
        sb.append(this.f);
        sb.append(", isActionEnabled=");
        fx3.s(sb, this.g, ", isSaving=", this.h, ", onNavigationClick=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.i;
    }
}
