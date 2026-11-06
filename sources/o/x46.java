package o;

/* JADX INFO: loaded from: classes2.dex */
public final class x46 {
    public final String a;
    public final String b;
    public final f95 c;
    public final jz1 d;
    public final hs1 e;

    public x46(String str, String str2, f95 f95Var, jz1 jz1Var, hs1 hs1Var) {
        str.getClass();
        str2.getClass();
        f95Var.getClass();
        hs1Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = f95Var;
        this.d = jz1Var;
        this.e = hs1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x46)) {
            return false;
        }
        x46 x46Var = (x46) obj;
        return im3.n(this.a, x46Var.a) && im3.n(this.b, x46Var.b) && this.c == x46Var.c && this.d == x46Var.d && this.e == x46Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + to7.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        jz1 jz1Var = this.d;
        return this.e.hashCode() + ((iHashCode + (jz1Var == null ? 0 : jz1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("RecentConnectionItemWrapper(connectId=", this.a, ", displayName=", this.b, ", onlineStatus=");
        sbO.append(this.c);
        sbO.append(", deviceType=");
        sbO.append(this.d);
        sbO.append(", deviceConnectionType=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
