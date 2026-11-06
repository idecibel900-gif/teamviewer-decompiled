package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p31 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final zr7 m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1699o;
    public final SupportSession p;
    public final List q;
    public final List r;
    public final List s;
    public final boolean t;
    public final boolean u;

    public p31(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, zr7 zr7Var, List list, List list2, SupportSession supportSession, List list3, List list4, List list5, boolean z13, boolean z14) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = zr7Var;
        this.n = list;
        this.f1699o = list2;
        this.p = supportSession;
        this.q = list3;
        this.r = list4;
        this.s = list5;
        this.t = z13;
        this.u = z14;
    }

    public static p31 a(p31 p31Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, List list, List list2, SupportSession supportSession, boolean z13, boolean z14, int i) {
        boolean z15 = (i & 1) != 0 ? p31Var.a : z;
        boolean z16 = (i & 2) != 0 ? p31Var.b : z2;
        boolean z17 = (i & 4) != 0 ? p31Var.c : z3;
        boolean z18 = (i & 8) != 0 ? p31Var.d : z4;
        boolean z19 = (i & 16) != 0 ? p31Var.e : z5;
        boolean z20 = (i & 32) != 0 ? p31Var.f : z6;
        boolean z21 = (i & 64) != 0 ? p31Var.g : z7;
        boolean z22 = (i & 128) != 0 ? p31Var.h : z8;
        p31Var.getClass();
        boolean z23 = (i & 512) != 0 ? p31Var.i : z9;
        boolean z24 = (i & 1024) != 0 ? p31Var.j : z10;
        boolean z25 = (i & 2048) != 0 ? p31Var.k : z11;
        boolean z26 = (i & 4096) != 0 ? p31Var.l : z12;
        zr7 zr7Var = p31Var.m;
        List list3 = (i & 16384) != 0 ? p31Var.n : list;
        List list4 = (32768 & i) != 0 ? p31Var.f1699o : list2;
        SupportSession supportSession2 = (65536 & i) != 0 ? p31Var.p : supportSession;
        List list5 = p31Var.q;
        List list6 = p31Var.r;
        List list7 = p31Var.s;
        p31Var.getClass();
        boolean z27 = (i & 2097152) != 0 ? p31Var.t : z13;
        boolean z28 = (i & 4194304) != 0 ? p31Var.u : z14;
        p31Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        return new p31(z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, zr7Var, list3, list4, supportSession2, list5, list6, list7, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p31)) {
            return false;
        }
        p31 p31Var = (p31) obj;
        return this.a == p31Var.a && this.b == p31Var.b && this.c == p31Var.c && this.d == p31Var.d && this.e == p31Var.e && this.f == p31Var.f && this.g == p31Var.g && this.h == p31Var.h && this.i == p31Var.i && this.j == p31Var.j && this.k == p31Var.k && this.l == p31Var.l && this.m.equals(p31Var.m) && im3.n(this.n, p31Var.n) && im3.n(this.f1699o, p31Var.f1699o) && im3.n(this.p, p31Var.p) && im3.n(this.q, p31Var.q) && im3.n(this.r, p31Var.r) && im3.n(this.s, p31Var.s) && this.t == p31Var.t && this.u == p31Var.u;
    }

    public final int hashCode() {
        int iG = to7.g(this.f1699o, to7.g(this.n, (this.m.hashCode() + to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31), 31);
        SupportSession supportSession = this.p;
        return Boolean.hashCode(this.u) + to7.f(to7.g(this.s, to7.g(this.r, to7.g(this.q, (iG + (supportSession != null ? supportSession.hashCode() : 0)) * 31, 31), 31), 961), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectScreenUiState(shouldShowSearchView=");
        sb.append(this.a);
        sb.append(", shouldShowWaitingRoom=");
        sb.append(this.b);
        sb.append(", shouldShowBannerDialog=");
        fx3.s(sb, this.c, ", shouldShowPermanentBannerSnackbar=", this.d, ", shouldShowCrashDialog=");
        fx3.s(sb, this.e, ", shouldShowShortcutUnavailableDialog=", this.f, ", isRecentConnectionsLoading=");
        fx3.s(sb, this.g, ", isSessionsLoading=", this.h, ", isDeviceIdValid=false, isSessionsTileExpandedPreference=");
        fx3.s(sb, this.i, ", isRecentConnectionsTileExpandedPreference=", this.j, ", shouldShowQSCard=");
        fx3.s(sb, this.k, ", isQuickSupportInstalled=", this.l, ", searchValue=");
        sb.append(this.m);
        sb.append(", accountRecentConnectionsList=");
        sb.append(this.n);
        sb.append(", accountSessionsList=");
        sb.append(this.f1699o);
        sb.append(", currentSession=");
        sb.append(this.p);
        sb.append(", filteredRecentConnectionsList=");
        sb.append(this.q);
        sb.append(", filteredContactsList=");
        sb.append(this.r);
        sb.append(", filteredDevicesList=");
        sb.append(this.s);
        sb.append(", selectedConnection=null, shouldShowSessionDetailsBottomSheet=");
        sb.append(this.t);
        sb.append(", shouldShowSessionUnavailableDialog=");
        return ua5.n(")", sb, this.u);
    }
}
