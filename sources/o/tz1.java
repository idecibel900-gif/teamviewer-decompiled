package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends vs1 {
    public final tr e = new tr(R.string.session_info_title);
    public final boolean f;
    public final a9 g;
    public final a9 h;

    public tz1(boolean z, a9 a9Var, a9 a9Var2) {
        this.f = z;
        this.g = a9Var;
        this.h = a9Var2;
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
        if (obj instanceof tz1) {
            tz1 tz1Var = (tz1) obj;
            return this.e.equals(tz1Var.e) && this.f == tz1Var.f && this.g == tz1Var.g && this.h == tz1Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + to7.f((this.g.hashCode() + to7.f(Integer.hashCode(this.e.z) * 31, 31, this.f)) * 31, 31, true);
    }

    public final String toString() {
        return "SessionInfo(title=" + this.e + ", isNavigationIconVisible=" + this.f + ", onNavigationClick=" + this.g + ", isActionEnabled=true, onAction=" + this.h + ")";
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.g;
    }
}
