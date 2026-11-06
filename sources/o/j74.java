package o;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class j74 {
    public static final i74 Companion = new i74();
    public static final u14[] m;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final fb5 g;
    public final lj6 h;
    public final Set i;
    public final Set j;
    public final String k;
    public final Set l;

    static {
        tg3 tg3Var = new tg3((byte) 13);
        l54 l54Var = l54.m;
        m = new u14[]{null, null, null, null, null, ds1.X(l54Var, tg3Var), null, null, ds1.X(l54Var, new tg3((byte) 14)), ds1.X(l54Var, new tg3((byte) 15)), null, ds1.X(l54Var, new tg3((byte) 16))};
    }

    public /* synthetic */ j74(int i, String str, String str2, String str3, String str4, String str5, List list, fb5 fb5Var, lj6 lj6Var, Set set, Set set2, String str6, Set set3) {
        if (255 != (i & 255)) {
            lq1.H(i, 255, h74.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = fb5Var;
        this.h = lj6Var;
        int i2 = i & 256;
        la2 la2Var = la2.m;
        if (i2 == 0) {
            this.i = la2Var;
        } else {
            this.i = set;
        }
        if ((i & 512) == 0) {
            this.j = la2Var;
        } else {
            this.j = set2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = la2Var;
        } else {
            this.l = set3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j74)) {
            return false;
        }
        j74 j74Var = (j74) obj;
        return im3.n(this.a, j74Var.a) && im3.n(this.b, j74Var.b) && im3.n(this.c, j74Var.c) && im3.n(this.d, j74Var.d) && im3.n(this.e, j74Var.e) && im3.n(this.f, j74Var.f) && im3.n(this.g, j74Var.g) && im3.n(this.h, j74Var.h) && im3.n(this.i, j74Var.i) && im3.n(this.j, j74Var.j) && im3.n(this.k, j74Var.k) && im3.n(this.l, j74Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = to7.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iG = to7.g(this.f, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        fb5 fb5Var = this.g;
        int iHashCode3 = (iG + (fb5Var == null ? 0 : fb5Var.hashCode())) * 31;
        lj6 lj6Var = this.h;
        int iHashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((iHashCode3 + (lj6Var == null ? 0 : lj6Var.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.k;
        return this.l.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("Library(uniqueId=", this.a, ", artifactVersion=", this.b, ", name=");
        e41.t(sbO, this.c, ", description=", this.d, ", website=");
        sbO.append(this.e);
        sbO.append(", developers=");
        sbO.append(this.f);
        sbO.append(", organization=");
        sbO.append(this.g);
        sbO.append(", scm=");
        sbO.append(this.h);
        sbO.append(", licenses=");
        sbO.append(this.i);
        sbO.append(", funding=");
        sbO.append(this.j);
        sbO.append(", tag=");
        sbO.append(this.k);
        sbO.append(", targets=");
        sbO.append(this.l);
        sbO.append(")");
        return sbO.toString();
    }

    public j74(String str, String str2, String str3, String str4, String str5, List list, fb5 fb5Var, lj6 lj6Var, HashSet hashSet, Set set, String str6, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = fb5Var;
        this.h = lj6Var;
        this.i = hashSet;
        this.j = set;
        this.k = str6;
        this.l = set2;
    }
}
