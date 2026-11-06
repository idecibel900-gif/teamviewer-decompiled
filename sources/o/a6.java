package o;

/* JADX INFO: loaded from: classes.dex */
public final class a6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final b12 j;

    public a6(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, b12 b12Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = b12Var;
    }

    public static a6 a(a6 a6Var, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, b12 b12Var, int i) {
        if ((i & 1) != 0) {
            str = a6Var.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = a6Var.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = a6Var.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = a6Var.d;
        }
        String str8 = str4;
        boolean z6 = (i & 16) != 0 ? a6Var.e : z;
        boolean z7 = (i & 32) != 0 ? a6Var.f : z2;
        boolean z8 = (i & 64) != 0 ? a6Var.g : z3;
        boolean z9 = (i & 128) != 0 ? a6Var.h : z4;
        boolean z10 = (i & 256) != 0 ? a6Var.i : z5;
        b12 b12Var2 = (i & 512) != 0 ? a6Var.j : b12Var;
        a6Var.getClass();
        return new a6(str5, str6, str7, str8, z6, z7, z8, z9, z10, b12Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return im3.n(this.a, a6Var.a) && im3.n(this.b, a6Var.b) && im3.n(this.c, a6Var.c) && im3.n(this.d, a6Var.d) && this.e == a6Var.e && this.f == a6Var.f && this.g == a6Var.g && this.h == a6Var.h && this.i == a6Var.i && this.j == a6Var.j;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.j.hashCode() + to7.f(to7.f(to7.f(to7.f(to7.f((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("AccountState(name=", this.a, ", email=", this.b, ", license=");
        e41.t(sbO, this.c, ", avatarUrl=", this.d, ", shouldShowTrustedDeviceToggle=");
        fx3.s(sbO, this.e, ", isTrustedDeviceToggleChecked=", this.f, ", shouldShowAccountActions=");
        fx3.s(sbO, this.g, ", isSignOutEnabled=", this.h, ", isDeleteAccountEnabled=");
        sbO.append(this.i);
        sbO.append(", dialogType=");
        sbO.append(this.j);
        sbO.append(")");
        return sbO.toString();
    }
}
