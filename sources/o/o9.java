package o;

/* JADX INFO: loaded from: classes.dex */
public final class o9 {
    public final ea0 a;
    public final String b;
    public final l33 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public o9(ea0 ea0Var, String str, l33 l33Var, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = ea0Var;
        this.b = str;
        this.c = l33Var;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public static o9 a(o9 o9Var, ea0 ea0Var, String str, l33 l33Var, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            ea0Var = o9Var.a;
        }
        ea0 ea0Var2 = ea0Var;
        if ((i & 2) != 0) {
            str = o9Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            l33Var = o9Var.c;
        }
        l33 l33Var2 = l33Var;
        if ((i & 8) != 0) {
            str2 = o9Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = o9Var.e;
        }
        boolean z5 = z;
        boolean z6 = (i & 32) != 0 ? o9Var.f : z2;
        boolean z7 = (i & 64) != 0 ? o9Var.g : z3;
        boolean z8 = (i & 128) != 0 ? o9Var.h : z4;
        boolean z9 = (i & 256) != 0 ? o9Var.i : true;
        o9Var.getClass();
        ea0Var2.getClass();
        str3.getClass();
        str4.getClass();
        return new o9(ea0Var2, str3, l33Var2, str4, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.a == o9Var.a && im3.n(this.b, o9Var.b) && im3.n(this.c, o9Var.c) && im3.n(this.d, o9Var.d) && this.e == o9Var.e && this.f == o9Var.f && this.g == o9Var.g && this.h == o9Var.h && this.i == o9Var.i;
    }

    public final int hashCode() {
        int iE = to7.e(this.a.hashCode() * 31, 31, this.b);
        l33 l33Var = this.c;
        return Boolean.hashCode(this.i) + to7.f(to7.f(to7.f(to7.f(to7.e((iE + (l33Var == null ? 0 : l33Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddContactUiState(bottomSheetView=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", group=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", isEmailError=");
        fx3.s(sb, this.e, ", isDescriptionError=", this.f, ", hasPermissionToAddContact=");
        fx3.s(sb, this.g, ", isLoading=", this.h, ", hasOpenWithSelectedGroup=");
        return ua5.n(")", sb, this.i);
    }

    public /* synthetic */ o9() {
        this(ea0.m, "", null, "", false, false, false, false, false);
    }
}
