package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceModuleType;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ns1 {
    public final long a;
    public final String b;
    public final ls1 c;
    public final Integer d;
    public final Integer e;
    public final ms1 f;
    public final boolean g;
    public final String h;
    public final Boolean i;
    public final DeviceModuleType j;
    public final String k;
    public final boolean l;
    public final String m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final UUID f1598o;
    public final String p;
    public final UUID q;
    public final UUID r;
    public final String s;
    public final ks1 t;
    public final js1 u;
    public final UUID v;

    public /* synthetic */ ns1(long j, String str, ls1 ls1Var, Integer num, Integer num2, ms1 ms1Var, String str2, Boolean bool, DeviceModuleType deviceModuleType, String str3, boolean z, List list, ks1 ks1Var, js1 js1Var, UUID uuid, int i) {
        this(j, str, ls1Var, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : ms1Var, false, str2, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? null : deviceModuleType, (i & 1024) != 0 ? null : str3, z, null, (i & 8192) != 0 ? null : list, null, null, null, null, null, (524288 & i) != 0 ? ks1.f1298o : ks1Var, js1Var, (i & 2097152) != 0 ? null : uuid);
    }

    public static ns1 a(ns1 ns1Var, long j, String str, ls1 ls1Var, Integer num, ms1 ms1Var, boolean z, String str2, Boolean bool, DeviceModuleType deviceModuleType, String str3, String str4, List list, UUID uuid, String str5, UUID uuid2, UUID uuid3, String str6, ks1 ks1Var, js1 js1Var, UUID uuid4, int i) {
        long j2 = (i & 1) != 0 ? ns1Var.a : j;
        String str7 = (i & 2) != 0 ? ns1Var.b : str;
        ls1 ls1Var2 = (i & 4) != 0 ? ns1Var.c : ls1Var;
        Integer num2 = ns1Var.d;
        Integer num3 = (i & 16) != 0 ? ns1Var.e : num;
        ms1 ms1Var2 = (i & 32) != 0 ? ns1Var.f : ms1Var;
        boolean z2 = (i & 64) != 0 ? ns1Var.g : z;
        String str8 = (i & 128) != 0 ? ns1Var.h : str2;
        Boolean bool2 = (i & 256) != 0 ? ns1Var.i : bool;
        DeviceModuleType deviceModuleType2 = (i & 512) != 0 ? ns1Var.j : deviceModuleType;
        String str9 = (i & 1024) != 0 ? ns1Var.k : str3;
        boolean z3 = (i & 2048) != 0 ? ns1Var.l : true;
        String str10 = (i & 4096) != 0 ? ns1Var.m : str4;
        List list2 = (i & 8192) != 0 ? ns1Var.n : list;
        UUID uuid5 = (i & 16384) != 0 ? ns1Var.f1598o : uuid;
        String str11 = (32768 & i) != 0 ? ns1Var.p : str5;
        UUID uuid6 = (65536 & i) != 0 ? ns1Var.q : uuid2;
        UUID uuid7 = (131072 & i) != 0 ? ns1Var.r : uuid3;
        String str12 = (262144 & i) != 0 ? ns1Var.s : str6;
        ks1 ks1Var2 = (524288 & i) != 0 ? ns1Var.t : ks1Var;
        js1 js1Var2 = (1048576 & i) != 0 ? ns1Var.u : js1Var;
        UUID uuid8 = (i & 2097152) != 0 ? ns1Var.v : uuid4;
        ns1Var.getClass();
        str7.getClass();
        ks1Var2.getClass();
        return new ns1(j2, str7, ls1Var2, num2, num3, ms1Var2, z2, str8, bool2, deviceModuleType2, str9, z3, str10, list2, uuid5, str11, uuid6, uuid7, str12, ks1Var2, js1Var2, uuid8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns1)) {
            return false;
        }
        ns1 ns1Var = (ns1) obj;
        return this.a == ns1Var.a && im3.n(this.b, ns1Var.b) && this.c == ns1Var.c && im3.n(this.d, ns1Var.d) && im3.n(this.e, ns1Var.e) && this.f == ns1Var.f && this.g == ns1Var.g && im3.n(this.h, ns1Var.h) && im3.n(this.i, ns1Var.i) && this.j == ns1Var.j && im3.n(this.k, ns1Var.k) && this.l == ns1Var.l && im3.n(this.m, ns1Var.m) && im3.n(this.n, ns1Var.n) && im3.n(this.f1598o, ns1Var.f1598o) && im3.n(this.p, ns1Var.p) && im3.n(this.q, ns1Var.q) && im3.n(this.r, ns1Var.r) && im3.n(this.s, ns1Var.s) && this.t == ns1Var.t && this.u == ns1Var.u && im3.n(this.v, ns1Var.v);
    }

    public final int hashCode() {
        int iE = to7.e(Long.hashCode(this.a) * 31, 31, this.b);
        ls1 ls1Var = this.c;
        int iHashCode = (iE + (ls1Var == null ? 0 : ls1Var.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ms1 ms1Var = this.f;
        int iF = to7.f((iHashCode3 + (ms1Var == null ? 0 : ms1Var.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode4 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeviceModuleType deviceModuleType = this.j;
        int iHashCode6 = (iHashCode5 + (deviceModuleType == null ? 0 : deviceModuleType.hashCode())) * 31;
        String str2 = this.k;
        int iF2 = to7.f((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l);
        String str3 = this.m;
        int iHashCode7 = (iF2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.n;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        UUID uuid = this.f1598o;
        int iHashCode9 = (iHashCode8 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UUID uuid2 = this.q;
        int iHashCode11 = (iHashCode10 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.r;
        int iHashCode12 = (iHashCode11 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        String str5 = this.s;
        int iHashCode13 = (this.t.hashCode() + ((iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        js1 js1Var = this.u;
        int iHashCode14 = (iHashCode13 + (js1Var == null ? 0 : js1Var.hashCode())) * 31;
        UUID uuid4 = this.v;
        return iHashCode14 + (uuid4 != null ? uuid4.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceInfo(id=" + this.a + ", name=" + this.b + ", status=" + this.c + ", legacyDeviceId=" + this.d + ", legacyGroupId=" + this.e + ", wakeType=" + this.f + ", isWaking=" + this.g + ", description=" + this.h + ", hasPassword=" + this.i + ", module=" + this.j + ", version=" + this.k + ", isMdv2=" + this.l + ", managerDisplayName=" + this.m + ", groupIds=" + this.n + ", teamViewerPolicyId=" + this.f1598o + ", teamViewerPolicyName=" + this.p + ", policyGroupId=" + this.q + ", inheritedPolicyId=" + this.r + ", inheritedPolicyGroupName=" + this.s + ", managementChipType=" + this.t + ", deviceType=" + this.u + ", managementId=" + this.v + ")";
    }

    public ns1(long j, String str, ls1 ls1Var, Integer num, Integer num2, ms1 ms1Var, boolean z, String str2, Boolean bool, DeviceModuleType deviceModuleType, String str3, boolean z2, String str4, List list, UUID uuid, String str5, UUID uuid2, UUID uuid3, String str6, ks1 ks1Var, js1 js1Var, UUID uuid4) {
        str.getClass();
        ks1Var.getClass();
        this.a = j;
        this.b = str;
        this.c = ls1Var;
        this.d = num;
        this.e = num2;
        this.f = ms1Var;
        this.g = z;
        this.h = str2;
        this.i = bool;
        this.j = deviceModuleType;
        this.k = str3;
        this.l = z2;
        this.m = str4;
        this.n = list;
        this.f1598o = uuid;
        this.p = str5;
        this.q = uuid2;
        this.r = uuid3;
        this.s = str6;
        this.t = ks1Var;
        this.u = js1Var;
        this.v = uuid4;
    }
}
