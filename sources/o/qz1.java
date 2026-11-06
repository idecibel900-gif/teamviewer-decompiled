package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qz1 extends vs1 {
    public final tr e;
    public final Function0 f;
    public final boolean g;
    public final boolean h;
    public final Function0 i;

    public qz1(Function0 function0, boolean z, boolean z2, Function0 function1) {
        tr trVar = new tr(R.string.tv_device_edit_title);
        function0.getClass();
        function1.getClass();
        this.e = trVar;
        this.f = function0;
        this.g = z;
        this.h = z2;
        this.i = function1;
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
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return this.e.equals(qz1Var.e) && im3.n(this.f, qz1Var.f) && this.g == qz1Var.g && this.h == qz1Var.h && im3.n(this.i, qz1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + to7.f(to7.f(e41.f(to7.f(Integer.hashCode(this.e.z) * 31, 31, true), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceEdit(title=");
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
