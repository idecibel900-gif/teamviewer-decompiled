package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g38 implements Serializable {
    public final Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f855o;

    public g38(Object obj, Object obj2, Object obj3) {
        this.m = obj;
        this.n = obj2;
        this.f855o = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g38)) {
            return false;
        }
        g38 g38Var = (g38) obj;
        return im3.n(this.m, g38Var.m) && im3.n(this.n, g38Var.n) && im3.n(this.f855o, g38Var.f855o);
    }

    public final int hashCode() {
        Object obj = this.m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.n;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f855o;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.m + ", " + this.n + ", " + this.f855o + ')';
    }
}
