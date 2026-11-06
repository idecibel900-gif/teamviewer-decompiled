package o;

/* JADX INFO: loaded from: classes.dex */
public final class xv1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xv1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static xv1 a(xv1 xv1Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = xv1Var.a;
        }
        if ((i & 2) != 0) {
            z2 = xv1Var.b;
        }
        if ((i & 4) != 0) {
            z3 = xv1Var.c;
        }
        if ((i & 8) != 0) {
            z4 = xv1Var.d;
        }
        xv1Var.getClass();
        return new xv1(z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv1)) {
            return false;
        }
        xv1 xv1Var = (xv1) obj;
        return this.a == xv1Var.a && this.b == xv1Var.b && this.c == xv1Var.c && this.d == xv1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DeviceTabDetailPaneState(isSaveEnable=" + this.a + ", isSaving=" + this.b + ", isErrorStateActive=" + this.c + ", isEditEnable=" + this.d + ")";
    }
}
