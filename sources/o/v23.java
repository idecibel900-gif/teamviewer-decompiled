package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v23 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final m13 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;

    public v23(List list, boolean z, boolean z2, boolean z3, String str, boolean z4, m13 m13Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = m13Var;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = i;
        this.n = i2;
    }

    public static v23 a(v23 v23Var, List list, boolean z, boolean z2, boolean z3, String str, boolean z4, m13 m13Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3) {
        List list2 = (i3 & 1) != 0 ? v23Var.a : list;
        boolean z10 = (i3 & 2) != 0 ? v23Var.b : z;
        boolean z11 = (i3 & 4) != 0 ? v23Var.c : z2;
        boolean z12 = (i3 & 8) != 0 ? v23Var.d : z3;
        String str2 = (i3 & 16) != 0 ? v23Var.e : str;
        boolean z13 = (i3 & 32) != 0 ? v23Var.f : z4;
        m13 m13Var2 = (i3 & 64) != 0 ? v23Var.g : m13Var;
        boolean z14 = (i3 & 128) != 0 ? v23Var.h : z5;
        boolean z15 = (i3 & 256) != 0 ? v23Var.i : z6;
        boolean z16 = (i3 & 512) != 0 ? v23Var.j : z7;
        boolean z17 = (i3 & 1024) != 0 ? v23Var.k : z8;
        boolean z18 = (i3 & 2048) != 0 ? v23Var.l : z9;
        int i4 = (i3 & 4096) != 0 ? v23Var.m : i;
        int i5 = (i3 & 8192) != 0 ? v23Var.n : i2;
        v23Var.getClass();
        list2.getClass();
        str2.getClass();
        m13Var2.getClass();
        return new v23(list2, z10, z11, z12, str2, z13, m13Var2, z14, z15, z16, z17, z18, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v23)) {
            return false;
        }
        v23 v23Var = (v23) obj;
        return im3.n(this.a, v23Var.a) && this.b == v23Var.b && this.c == v23Var.c && this.d == v23Var.d && im3.n(this.e, v23Var.e) && this.f == v23Var.f && this.g == v23Var.g && this.h == v23Var.h && this.i == v23Var.i && this.j == v23Var.j && this.k == v23Var.k && this.l == v23Var.l && this.m == v23Var.m && this.n == v23Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + fx3.a(this.m, to7.f(to7.f(to7.f(to7.f(to7.f((this.g.hashCode() + to7.f(to7.e(to7.f(to7.f(to7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupDevicesScreenUiState(devices=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isGroupEmpty=");
        fx3.s(sb, this.c, ", isSearchActive=", this.d, ", searchTerm=");
        sb.append(this.e);
        sb.append(", isSearching=");
        sb.append(this.f);
        sb.append(", sortOrder=");
        sb.append(this.g);
        sb.append(", isLegacySortApplied=");
        sb.append(this.h);
        sb.append(", hasLegacyLoadError=");
        fx3.s(sb, this.i, ", shouldShowSortBottomSheet=", this.j, ", isApplyingSort=");
        fx3.s(sb, this.k, ", showGroupUnavailableDialog=", this.l, ", scrollIndex=");
        sb.append(this.m);
        sb.append(", scrollOffset=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
