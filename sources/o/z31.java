package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z31 {
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final f95 i;
    public final b41 j;
    public final jz1 k;
    public final Integer l;
    public final hs1 m;

    public z31(String str, List list, List list2, String str2, String str3, Integer num, String str4, String str5, f95 f95Var, b41 b41Var, jz1 jz1Var, Integer num2, hs1 hs1Var, int i) {
        int i2 = i & 2;
        ea2 ea2Var = ea2.m;
        list = i2 != 0 ? ea2Var : list;
        list2 = (i & 4) != 0 ? ea2Var : list2;
        String str6 = (i & 16) != 0 ? null : str3;
        Integer num3 = (i & 32) != 0 ? null : num;
        String str7 = (i & 64) != 0 ? null : str4;
        String str8 = (i & 128) != 0 ? null : str5;
        f95 f95Var2 = (i & 256) != 0 ? f95.s : f95Var;
        b41 b41Var2 = (i & 512) != 0 ? b41.s : b41Var;
        jz1 jz1Var2 = (i & 1024) != 0 ? null : jz1Var;
        Integer num4 = (i & 2048) == 0 ? num2 : null;
        hs1 hs1Var2 = (i & 4096) != 0 ? hs1.f1004o : hs1Var;
        str.getClass();
        str2.getClass();
        f95Var2.getClass();
        hs1Var2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = str6;
        this.f = num3;
        this.g = str7;
        this.h = str8;
        this.i = f95Var2;
        this.j = b41Var2;
        this.k = jz1Var2;
        this.l = num4;
        this.m = hs1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z31)) {
            return false;
        }
        z31 z31Var = (z31) obj;
        return im3.n(this.a, z31Var.a) && this.b.equals(z31Var.b) && this.c.equals(z31Var.c) && im3.n(this.d, z31Var.d) && im3.n(this.e, z31Var.e) && im3.n(this.f, z31Var.f) && im3.n(this.g, z31Var.g) && im3.n(this.h, z31Var.h) && this.i == z31Var.i && this.j == z31Var.j && this.k == z31Var.k && im3.n(this.l, z31Var.l) && this.m == z31Var.m;
    }

    public final int hashCode() {
        int iE = to7.e(to7.g(this.c, to7.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        jz1 jz1Var = this.k;
        int iHashCode5 = (iHashCode4 + (jz1Var == null ? 0 : jz1Var.hashCode())) * 31;
        Integer num2 = this.l;
        return this.m.hashCode() + ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectableItem(resultName=");
        sb.append(this.a);
        sb.append(", groupNames=");
        sb.append(this.b);
        sb.append(", groupIds=");
        sb.append(this.c);
        sb.append(", connectId=");
        sb.append(this.d);
        sb.append(", managementId=");
        sb.append(this.e);
        sb.append(", accountId=");
        sb.append(this.f);
        sb.append(", email=");
        e41.t(sb, this.g, ", pictureUrl=", this.h, ", onlineStatus=");
        sb.append(this.i);
        sb.append(", itemType=");
        sb.append(this.j);
        sb.append(", deviceType=");
        sb.append(this.k);
        sb.append(", legacyDeviceId=");
        sb.append(this.l);
        sb.append(", deviceConnectionType=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
