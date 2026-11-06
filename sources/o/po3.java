package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class po3 {
    public final n58 a;
    public final so3 b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final g07 f;

    public /* synthetic */ po3(n58 n58Var, boolean z, boolean z2, Set set, int i) {
        this(n58Var, so3.m, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static po3 a(po3 po3Var, so3 so3Var, boolean z, Set set, g07 g07Var, int i) {
        n58 n58Var = po3Var.a;
        if ((i & 2) != 0) {
            so3Var = po3Var.b;
        }
        so3 so3Var2 = so3Var;
        if ((i & 4) != 0) {
            z = po3Var.c;
        }
        boolean z2 = z;
        boolean z3 = po3Var.d;
        if ((i & 16) != 0) {
            set = po3Var.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            g07Var = po3Var.f;
        }
        po3Var.getClass();
        n58Var.getClass();
        so3Var2.getClass();
        return new po3(n58Var, so3Var2, z2, z3, set2, g07Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po3)) {
            return false;
        }
        po3 po3Var = (po3) obj;
        return im3.n(po3Var.f, this.f) && po3Var.a == this.a && po3Var.b == this.b && po3Var.c == this.c && po3Var.d == this.d;
    }

    public final int hashCode() {
        g07 g07Var = this.f;
        int iHashCode = g07Var != null ? g07Var.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public po3(n58 n58Var, so3 so3Var, boolean z, boolean z2, Set set, g07 g07Var) {
        this.a = n58Var;
        this.b = so3Var;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = g07Var;
    }
}
