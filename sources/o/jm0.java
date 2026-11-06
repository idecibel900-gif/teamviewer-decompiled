package o;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jm0 {
    public static final jm0 c = new jm0(lv0.T0(new ArrayList()), null);
    public final Set a;
    public final iq8 b;

    public jm0(Set set, iq8 iq8Var) {
        this.a = set;
        this.b = iq8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jm0)) {
            return false;
        }
        jm0 jm0Var = (jm0) obj;
        return jm0Var.a.equals(this.a) && im3.n(jm0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        iq8 iq8Var = this.b;
        return iHashCode + (iq8Var != null ? iq8Var.hashCode() : 0);
    }
}
