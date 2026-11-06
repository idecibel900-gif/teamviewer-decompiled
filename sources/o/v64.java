package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v64 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public v64(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }

    public static v64 a(v64 v64Var, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
        if ((i & 1) != 0) {
            z = v64Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = v64Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = v64Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = v64Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            list = v64Var.e;
        }
        List list2 = list;
        v64Var.getClass();
        list2.getClass();
        return new v64(z5, z6, z7, z8, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v64)) {
            return false;
        }
        v64 v64Var = (v64) obj;
        return this.a == v64Var.a && this.b == v64Var.b && this.c == v64Var.c && this.d == v64Var.d && im3.n(this.e, v64Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalAgreementState(isAcceptSwitchChecked=");
        sb.append(this.a);
        sb.append(", isCollectionSwitchChecked=");
        sb.append(this.b);
        sb.append(", isTransferSwitchChecked=");
        fx3.s(sb, this.c, ", isMarketingSwitchChecked=", this.d, ", contentItems=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
