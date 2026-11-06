package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yl6 {
    public final String a;
    public final ll6 b;
    public final z31 c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final al6 k;
    public final boolean l;
    public final List m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2618o;
    public final boolean p;
    public final vh3 q;
    public final ca2 r;
    public final boolean s;

    public yl6(String str, ll6 ll6Var, z31 z31Var, boolean z, List list, List list2, List list3, List list4, List list5, List list6, al6 al6Var, boolean z2, List list7, boolean z3, boolean z4, boolean z5, vh3 vh3Var, ca2 ca2Var, boolean z6) {
        ll6Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        al6Var.getClass();
        list7.getClass();
        this.a = str;
        this.b = ll6Var;
        this.c = z31Var;
        this.d = z;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.i = list5;
        this.j = list6;
        this.k = al6Var;
        this.l = z2;
        this.m = list7;
        this.n = z3;
        this.f2618o = z4;
        this.p = z5;
        this.q = vh3Var;
        this.r = ca2Var;
        this.s = z6;
    }

    public static yl6 a(yl6 yl6Var, String str, ll6 ll6Var, z31 z31Var, boolean z, List list, List list2, List list3, List list4, List list5, List list6, al6 al6Var, boolean z2, List list7, boolean z3, boolean z4, boolean z5, vh3 vh3Var, ca2 ca2Var, boolean z6, int i) {
        String str2 = (i & 1) != 0 ? yl6Var.a : str;
        ll6 ll6Var2 = (i & 2) != 0 ? yl6Var.b : ll6Var;
        z31 z31Var2 = (i & 4) != 0 ? yl6Var.c : z31Var;
        boolean z7 = (i & 8) != 0 ? yl6Var.d : z;
        List list8 = (i & 16) != 0 ? yl6Var.e : list;
        List list9 = (i & 32) != 0 ? yl6Var.f : list2;
        List list10 = (i & 64) != 0 ? yl6Var.g : list3;
        List list11 = (i & 128) != 0 ? yl6Var.h : list4;
        List list12 = (i & 256) != 0 ? yl6Var.i : list5;
        List list13 = (i & 512) != 0 ? yl6Var.j : list6;
        al6 al6Var2 = (i & 1024) != 0 ? yl6Var.k : al6Var;
        boolean z8 = (i & 2048) != 0 ? yl6Var.l : z2;
        List list14 = (i & 4096) != 0 ? yl6Var.m : list7;
        boolean z9 = (i & 8192) != 0 ? yl6Var.n : z3;
        String str3 = str2;
        boolean z10 = (i & 16384) != 0 ? yl6Var.f2618o : z4;
        boolean z11 = (i & 32768) != 0 ? yl6Var.p : z5;
        vh3 vh3Var2 = (i & 65536) != 0 ? yl6Var.q : vh3Var;
        ca2 ca2Var2 = (i & 131072) != 0 ? yl6Var.r : ca2Var;
        yl6Var.getClass();
        yl6Var.getClass();
        ca2 ca2Var3 = ca2Var2;
        boolean z12 = (i & 1048576) != 0 ? yl6Var.s : z6;
        yl6Var.getClass();
        str3.getClass();
        ll6Var2.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        list11.getClass();
        list12.getClass();
        list13.getClass();
        al6Var2.getClass();
        list14.getClass();
        return new yl6(str3, ll6Var2, z31Var2, z7, list8, list9, list10, list11, list12, list13, al6Var2, z8, list14, z9, z10, z11, vh3Var2, ca2Var3, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl6)) {
            return false;
        }
        yl6 yl6Var = (yl6) obj;
        return this.a.equals(yl6Var.a) && this.b == yl6Var.b && im3.n(this.c, yl6Var.c) && this.d == yl6Var.d && im3.n(this.e, yl6Var.e) && im3.n(this.f, yl6Var.f) && im3.n(this.g, yl6Var.g) && im3.n(this.h, yl6Var.h) && im3.n(this.i, yl6Var.i) && im3.n(this.j, yl6Var.j) && this.k == yl6Var.k && this.l == yl6Var.l && im3.n(this.m, yl6Var.m) && this.n == yl6Var.n && this.f2618o == yl6Var.f2618o && this.p == yl6Var.p && im3.n(this.q, yl6Var.q) && this.r == yl6Var.r && this.s == yl6Var.s;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        z31 z31Var = this.c;
        int iF = to7.f(to7.f(to7.f(to7.g(this.m, to7.f((this.k.hashCode() + to7.g(this.j, to7.g(this.i, to7.g(this.h, to7.g(this.g, to7.g(this.f, to7.g(this.e, to7.f((iHashCode + (z31Var == null ? 0 : z31Var.hashCode())) * 31, 31, this.d), 31), 31), 31), 31), 31), 31)) * 31, 31, this.l), 31), 31, this.n), 31, this.f2618o), 31, this.p);
        vh3 vh3Var = this.q;
        int iHashCode2 = (iF + (vh3Var == null ? 0 : vh3Var.hashCode())) * 31;
        ca2 ca2Var = this.r;
        return Boolean.hashCode(this.s) + to7.f(to7.f((iHashCode2 + (ca2Var == null ? 0 : ca2Var.hashCode())) * 31, 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchScreenUiState(searchValue=");
        sb.append(this.a);
        sb.append(", selectedSearchTab=");
        sb.append(this.b);
        sb.append(", highlightedResult=");
        sb.append(this.c);
        sb.append(", isHighlightedResultValid=");
        sb.append(this.d);
        sb.append(", accountRecentConnectionsList=");
        sb.append(this.e);
        sb.append(", accountGroupsList=");
        sb.append(this.f);
        sb.append(", filteredRecentConnectionsList=");
        sb.append(this.g);
        sb.append(", filteredContactsList=");
        sb.append(this.h);
        sb.append(", filteredDevicesList=");
        sb.append(this.i);
        sb.append(", filteredGroupsList=");
        sb.append(this.j);
        sb.append(", searchContentState=");
        sb.append(this.k);
        sb.append(", showChooseComputerOfContact=");
        sb.append(this.l);
        sb.append(", availableDevicesForSelection=");
        sb.append(this.m);
        sb.append(", isFileTransferAction=");
        sb.append(this.n);
        sb.append(", isGroupDeviceSelection=");
        fx3.s(sb, this.f2618o, ", shouldShowAccountRequiredBottomSheet=", this.p, ", dialogData=");
        sb.append(this.q);
        sb.append(", emptyGroupDialogType=");
        sb.append(this.r);
        sb.append(", shouldShowNoBrowserDialog=false, shouldShowInstallLimitDialog=false, isLoading=");
        return ua5.n(")", sb, this.s);
    }
}
