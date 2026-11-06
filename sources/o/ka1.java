package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ka1 {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final a91 i;
    public final l71 j;
    public final int k;
    public final int l;
    public final boolean m;
    public final h71 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1244o;
    public final List p;
    public final boolean q;
    public final boolean r;

    public ka1(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, a91 a91Var, l71 l71Var, int i, int i2, boolean z7, h71 h71Var, boolean z8, List list3, boolean z9, boolean z10) {
        list.getClass();
        list2.getClass();
        a91Var.getClass();
        l71Var.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = a91Var;
        this.j = l71Var;
        this.k = i;
        this.l = i2;
        this.m = z7;
        this.n = h71Var;
        this.f1244o = z8;
        this.p = list3;
        this.q = z9;
        this.r = z10;
    }

    public static ka1 a(ka1 ka1Var, ArrayList arrayList, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, a91 a91Var, l71 l71Var, int i, int i2, boolean z7, h71 h71Var, boolean z8, List list2, boolean z9, boolean z10, int i3) {
        List list3 = (i3 & 1) != 0 ? ka1Var.a : arrayList;
        List list4 = (i3 & 2) != 0 ? ka1Var.b : list;
        boolean z11 = (i3 & 4) != 0 ? ka1Var.c : z;
        boolean z12 = (i3 & 8) != 0 ? ka1Var.d : z2;
        boolean z13 = (i3 & 16) != 0 ? ka1Var.e : z3;
        boolean z14 = (i3 & 32) != 0 ? ka1Var.f : z4;
        boolean z15 = (i3 & 64) != 0 ? ka1Var.g : z5;
        boolean z16 = (i3 & 128) != 0 ? ka1Var.h : z6;
        a91 a91Var2 = (i3 & 256) != 0 ? ka1Var.i : a91Var;
        l71 l71Var2 = (i3 & 512) != 0 ? ka1Var.j : l71Var;
        int i4 = (i3 & 1024) != 0 ? ka1Var.k : i;
        int i5 = (i3 & 2048) != 0 ? ka1Var.l : i2;
        boolean z17 = (i3 & 4096) != 0 ? ka1Var.m : z7;
        h71 h71Var2 = (i3 & 8192) != 0 ? ka1Var.n : h71Var;
        List list5 = list3;
        boolean z18 = (i3 & 16384) != 0 ? ka1Var.f1244o : z8;
        List list6 = (i3 & 32768) != 0 ? ka1Var.p : list2;
        boolean z19 = (i3 & 65536) != 0 ? ka1Var.q : z9;
        boolean z20 = (i3 & 131072) != 0 ? ka1Var.r : z10;
        ka1Var.getClass();
        list5.getClass();
        list4.getClass();
        a91Var2.getClass();
        l71Var2.getClass();
        list6.getClass();
        return new ka1(list5, list4, z11, z12, z13, z14, z15, z16, a91Var2, l71Var2, i4, i5, z17, h71Var2, z18, list6, z19, z20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        return im3.n(this.a, ka1Var.a) && im3.n(this.b, ka1Var.b) && this.c == ka1Var.c && this.d == ka1Var.d && this.e == ka1Var.e && this.f == ka1Var.f && this.g == ka1Var.g && this.h == ka1Var.h && this.i == ka1Var.i && this.j == ka1Var.j && this.k == ka1Var.k && this.l == ka1Var.l && this.m == ka1Var.m && im3.n(this.n, ka1Var.n) && this.f1244o == ka1Var.f1244o && im3.n(this.p, ka1Var.p) && this.q == ka1Var.q && this.r == ka1Var.r;
    }

    public final int hashCode() {
        int iF = to7.f(fx3.a(this.l, fx3.a(this.k, (this.j.hashCode() + ((this.i.hashCode() + to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.g(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31), 31), 31, this.m);
        h71 h71Var = this.n;
        return Boolean.hashCode(this.r) + to7.f(to7.g(this.p, to7.f((iF + (h71Var == null ? 0 : h71Var.hashCode())) * 31, 31, this.f1244o), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsScreenUiState(contacts=");
        sb.append(this.a);
        sb.append(", filteredContacts=");
        sb.append(this.b);
        sb.append(", isPersonalContactsLoading=");
        fx3.s(sb, this.c, ", isCompanyContactsLoading=", this.d, ", isInvitationContactsLoading=");
        fx3.s(sb, this.e, ", shouldShowContactsSortBottomSheet=", this.f, ", shouldShowContactsFiltersBottomSheet=");
        fx3.s(sb, this.g, ", shouldDisplayCompanyContacts=", this.h, ", sortOrder=");
        sb.append(this.i);
        sb.append(", selectedFilter=");
        sb.append(this.j);
        sb.append(", scrollIndex=");
        sb.append(this.k);
        sb.append(", scrollOffset=");
        sb.append(this.l);
        sb.append(", showRemoveContactDialog=");
        sb.append(this.m);
        sb.append(", contactToRemove=");
        sb.append(this.n);
        sb.append(", showChooseComputerOfContact=");
        sb.append(this.f1244o);
        sb.append(", contactDevicesForSelection=");
        sb.append(this.p);
        sb.append(", isFileTransferContact=");
        sb.append(this.q);
        sb.append(", showContactUnavailableDialog=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
