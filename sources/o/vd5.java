package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class vd5 implements Serializable {
    public final Object m;
    public final Object n;

    public vd5(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd5)) {
            return false;
        }
        vd5 vd5Var = (vd5) obj;
        return im3.n(this.m, vd5Var.m) && im3.n(this.n, vd5Var.n);
    }

    public final int hashCode() {
        Object obj = this.m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.n;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.m + ", " + this.n + ')';
    }
}
