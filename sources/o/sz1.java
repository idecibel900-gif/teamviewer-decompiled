package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends vs1 {
    public final tr e = new tr(R.string.service_queue_more_actions_edit_session);
    public final n5 f;
    public final boolean g;
    public final boolean h;
    public final qv1 i;

    public sz1(n5 n5Var, boolean z, boolean z2, qv1 qv1Var) {
        this.f = n5Var;
        this.g = z;
        this.h = z2;
        this.i = qv1Var;
    }

    @Override // o.vs1
    public final ka0 A() {
        return this.e;
    }

    @Override // o.vs1
    public final boolean F() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sz1) {
            sz1 sz1Var = (sz1) obj;
            return this.e.equals(sz1Var.e) && this.f == sz1Var.f && this.g == sz1Var.g && this.h == sz1Var.h && this.i == sz1Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + to7.f(to7.f((this.f.hashCode() + to7.f(Integer.hashCode(this.e.z) * 31, 31, true)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionEdit(title=");
        sb.append(this.e);
        sb.append(", isNavigationIconVisible=true, onNavigationClick=");
        sb.append(this.f);
        sb.append(", isActionEnabled=");
        fx3.s(sb, this.g, ", isSaving=", this.h, ", onAction=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.f;
    }
}
