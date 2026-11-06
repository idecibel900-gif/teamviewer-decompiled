package o;

/* JADX INFO: loaded from: classes.dex */
public final class j35 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public j35(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static j35 a(j35 j35Var, String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = j35Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = j35Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = j35Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = j35Var.d;
        }
        boolean z6 = z3;
        boolean z7 = (i & 16) != 0 ? j35Var.e : false;
        j35Var.getClass();
        str2.getClass();
        return new j35(str2, z4, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j35)) {
            return false;
        }
        j35 j35Var = (j35) obj;
        return im3.n(this.a, j35Var.a) && this.b == j35Var.b && this.c == j35Var.c && this.d == j35Var.d && this.e == j35Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + to7.f(to7.f(to7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewGroupState(groupName=");
        sb.append(this.a);
        sb.append(", isAddButtonEnabled=");
        sb.append(this.b);
        sb.append(", isGroupNameValid=");
        fx3.s(sb, this.c, ", isCreatingGroup=", this.d, ", isAddGroupDialogVisible=");
        return ua5.n(")", sb, this.e);
    }
}
