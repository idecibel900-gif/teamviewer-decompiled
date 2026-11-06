package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class wt1 {
    public final boolean a;
    public final ns1 b;
    public final Set c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f2442o;
    public final boolean p;
    public final Set q;
    public final boolean r;
    public final List s;
    public final UUID t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wt1(Set set, boolean z, boolean z2, List list, int i) {
        int i2 = i & 8;
        la2 la2Var = la2.m;
        this(false, null, i2 != 0 ? la2Var : set, false, false, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, false, false, false, false, "", null, "", la2Var, false, la2Var, false, (i & 524288) != 0 ? ea2.m : list, null, false, true, true);
    }

    public static wt1 a(wt1 wt1Var, boolean z, ns1 ns1Var, Set set, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, String str2, String str3, Set set2, boolean z10, Set set3, boolean z11, ArrayList arrayList, UUID uuid, boolean z12, boolean z13, boolean z14, int i) {
        wt1Var.getClass();
        boolean z15 = (i & 2) != 0 ? wt1Var.a : z;
        ns1 ns1Var2 = (i & 4) != 0 ? wt1Var.b : ns1Var;
        Set set4 = (i & 8) != 0 ? wt1Var.c : set;
        boolean z16 = (i & 16) != 0 ? wt1Var.d : z2;
        boolean z17 = (i & 32) != 0 ? wt1Var.e : z3;
        boolean z18 = (i & 64) != 0 ? wt1Var.f : z4;
        boolean z19 = (i & 128) != 0 ? wt1Var.g : z5;
        boolean z20 = (i & 256) != 0 ? wt1Var.h : z6;
        boolean z21 = (i & 512) != 0 ? wt1Var.i : z7;
        boolean z22 = (i & 1024) != 0 ? wt1Var.j : z8;
        boolean z23 = (i & 2048) != 0 ? wt1Var.k : z9;
        String str4 = (i & 4096) != 0 ? wt1Var.l : str;
        String str5 = (i & 8192) != 0 ? wt1Var.m : str2;
        String str6 = (i & 16384) != 0 ? wt1Var.n : str3;
        Set set5 = (i & 32768) != 0 ? wt1Var.f2442o : set2;
        boolean z24 = (i & 65536) != 0 ? wt1Var.p : z10;
        Set set6 = (i & 131072) != 0 ? wt1Var.q : set3;
        boolean z25 = (i & 262144) != 0 ? wt1Var.r : z11;
        List list = (i & 524288) != 0 ? wt1Var.s : arrayList;
        UUID uuid2 = (i & 1048576) != 0 ? wt1Var.t : uuid;
        boolean z26 = (i & 2097152) != 0 ? wt1Var.u : z12;
        boolean z27 = (i & 4194304) != 0 ? wt1Var.v : z13;
        boolean z28 = (i & 8388608) != 0 ? wt1Var.w : z14;
        wt1Var.getClass();
        set4.getClass();
        str4.getClass();
        str6.getClass();
        set5.getClass();
        set6.getClass();
        list.getClass();
        return new wt1(z15, ns1Var2, set4, z16, z17, z18, z19, z20, z21, z22, z23, str4, str5, str6, set5, z24, set6, z25, list, uuid2, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt1)) {
            return false;
        }
        wt1 wt1Var = (wt1) obj;
        return this.a == wt1Var.a && im3.n(this.b, wt1Var.b) && im3.n(this.c, wt1Var.c) && this.d == wt1Var.d && this.e == wt1Var.e && this.f == wt1Var.f && this.g == wt1Var.g && this.h == wt1Var.h && this.i == wt1Var.i && this.j == wt1Var.j && this.k == wt1Var.k && im3.n(this.l, wt1Var.l) && im3.n(this.m, wt1Var.m) && im3.n(this.n, wt1Var.n) && im3.n(this.f2442o, wt1Var.f2442o) && this.p == wt1Var.p && im3.n(this.q, wt1Var.q) && this.r == wt1Var.r && im3.n(this.s, wt1Var.s) && im3.n(this.t, wt1Var.t) && this.u == wt1Var.u && this.v == wt1Var.v && this.w == wt1Var.w;
    }

    public final int hashCode() {
        int iF = to7.f(Boolean.hashCode(false) * 31, 31, this.a);
        ns1 ns1Var = this.b;
        int iE = to7.e(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f((this.c.hashCode() + ((iF + (ns1Var == null ? 0 : ns1Var.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        String str = this.m;
        int iG = to7.g(this.s, to7.f((this.q.hashCode() + to7.f((this.f2442o.hashCode() + to7.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.n)) * 31, 31, this.p)) * 31, 31, this.r), 31);
        UUID uuid = this.t;
        return Boolean.hashCode(this.w) + to7.f(to7.f((iG + (uuid != null ? uuid.hashCode() : 0)) * 31, 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfoScreenUiState(isLoading=false, isSaving=");
        sb.append(this.a);
        sb.append(", device=");
        sb.append(this.b);
        sb.append(", supportedConnectionActions=");
        sb.append(this.c);
        sb.append(", isConnectionOptionsLoading=");
        sb.append(this.d);
        sb.append(", isManagedDeviceDetailsLoading=");
        fx3.s(sb, this.e, ", showDeviceShortcutActionButton=", this.f, ", showWakeActionButton=");
        fx3.s(sb, this.g, ", showMaximumShortcutsReachedDialog=", this.h, ", showDeleteDeviceDialog=");
        fx3.s(sb, this.i, ", showDeviceUnavailableDialog=", this.j, ", isDeviceWaking=");
        sb.append(this.k);
        sb.append(", editedName=");
        sb.append(this.l);
        sb.append(", editedPassword=");
        e41.t(sb, this.m, ", editedDescription=", this.n, ", editedGroupIds=");
        sb.append(this.f2442o);
        sb.append(", hasEditedGroup=");
        sb.append(this.p);
        sb.append(", groupIdsWithoutAddPermission=");
        sb.append(this.q);
        sb.append(", isCheckingGroupPermissions=");
        sb.append(this.r);
        sb.append(", availablePolicies=");
        sb.append(this.s);
        sb.append(", editedPolicyId=");
        sb.append(this.t);
        sb.append(", hasEditedPolicy=");
        fx3.s(sb, this.u, ", isDeviceNameValid=", this.v, ", isDeviceDescriptionValid=");
        return ua5.n(")", sb, this.w);
    }

    public wt1(boolean z, ns1 ns1Var, Set set, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, String str2, String str3, Set set2, boolean z10, Set set3, boolean z11, List list, UUID uuid, boolean z12, boolean z13, boolean z14) {
        set.getClass();
        list.getClass();
        this.a = z;
        this.b = ns1Var;
        this.c = set;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f2442o = set2;
        this.p = z10;
        this.q = set3;
        this.r = z11;
        this.s = list;
        this.t = uuid;
        this.u = z12;
        this.v = z13;
        this.w = z14;
    }
}
