package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zi5 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public zi5(String str, Function0 function0, Function0 function1) {
        str.getClass();
        function0.getClass();
        function1.getClass();
        this.a = str;
        this.b = function0;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi5)) {
            return false;
        }
        zi5 zi5Var = (zi5) obj;
        return im3.n(this.a, zi5Var.a) && im3.n(this.b, zi5Var.b) && im3.n(this.c, zi5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + e41.f(fx3.a(R.string.tv_bluetooth_connect_permission_session_denied_once, this.a.hashCode() * 31, 31), 31, this.b);
    }

    public final String toString() {
        return "Permission(name=" + this.a + ", rationalMessage=" + R.string.tv_bluetooth_connect_permission_session_denied_once + ", onAccepted=" + this.b + ", onDeclinedPermanently=" + this.c + ")";
    }
}
