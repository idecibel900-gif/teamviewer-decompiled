package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oz3 implements so, sz3 {
    public int m;

    public zo4 I() {
        return hd2.a(dd2.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz3)) {
            return false;
        }
        oz3 oz3Var = (oz3) obj;
        if (p0() == oz3Var.p0()) {
            return mo8.v(xz2.W, r0(), oz3Var.r0());
        }
        return false;
    }

    @Override // o.so
    public final up getAnnotations() {
        return yp.a(n0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.m;
        if (i != 0) {
            return i;
        }
        if (ct1.K(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (p0() ? 1 : 0) + ((m0().hashCode() + (o0().hashCode() * 31)) * 31);
        }
        this.m = iHashCode;
        return iHashCode;
    }

    public List m0() {
        return ea2.m;
    }

    public g48 n0() {
        g48.n.getClass();
        return g48.f858o;
    }

    public abstract k48 o0();

    public abstract boolean p0();

    public oz3 q0(uz3 uz3Var) {
        return this;
    }

    public abstract m98 r0();
}
